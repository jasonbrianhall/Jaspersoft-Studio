/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.nebula.widgets.gallery.Gallery;
import org.eclipse.nebula.widgets.gallery.GalleryItem;
import org.eclipse.nebula.widgets.gallery.NoGroupRenderer;
import org.eclipse.nebula.widgets.gallery.RoundedGalleryItemRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.swt.widgets.table.ListContentProvider;
import com.jaspersoft.studio.templates.JrxmlTemplateBundle;
import com.jaspersoft.studio.templates.StudioTemplateManager;
import com.jaspersoft.studio.utils.SWTImageEffects;
import com.jaspersoft.studio.utils.SWTImageEffects.Glow;
import com.jaspersoft.templates.TemplateBundle;

/**
 * This page is used to allow the user to select a template bundle. The selected template bundle (TemplateBundle) is
 * stored in the JSSWizard.getSettings() map with the key "template". Any following page can use this information to
 * propose specific defaults (i.e. the new file name...)
 * 
 * @author gtoffoli
 * 
 */
public class ReportTemplatesWizardPage extends JSSWizardPage {

	private static final int GALLERY_HEIGHT = 100;

	private static final int GALLERY_WIDTH = 100;

	private Scale scale;

	private List<Image> templateImages;

	/**
	 * Hashmap to cache the created gallery for a category
	 */
	private HashMap<String, Gallery> cachedGalleries = new HashMap<String, Gallery>();

	/**
	 * Hashmap to cache for every template bundle a list of the category it belong
	 */
	private HashMap<TemplateBundle, HashSet<String>> categoryCache = new HashMap<TemplateBundle, HashSet<String>>();

	/**
	 * List of all the categories key shown, in the order they was loaded
	 */
	private List<String> categoryList;

	/**
	 * Stack layout used to stack the gallery and show only the one connected to the selected Category
	 */
	private StackLayout layout;

	/**
	 * List of all the template bundle available
	 */
	private List<TemplateBundle> bundles;

	/**
	 * Composite where every new gallery is placed
	 */
	private Composite galleryComposite;

	/**
	 * The template bundle actually selected
	 */
	private TemplateBundle selectedTemplate = null;

	public TemplateBundle getTemplateBundle() {
		return selectedTemplate;
	}

	/**
	 * Create the wizard.
	 */
	public ReportTemplatesWizardPage() {
		super("templatenewreportwizardPage"); //$NON-NLS-1$
		setTitle(Messages.ReportTemplatesWizardPage_title);
		setDescription(Messages.ReportTemplatesWizardPage_description);
		templateImages = new ArrayList<Image>();
	}

	/**
	 * Return the context name for the help of this page
	 */
	@Override
	protected String getContextName() {
		return ContextHelpIDs.WIZARD_TEMPLATE_PAGE;
	}

	/**
	 * 
	 * Selection listener for the list of category
	 * 
	 * @author Orlandin Marco
	 * 
	 */
	private class CategoryChooser extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			String selectedCategory = categoryList.get(((Table) e.widget).getSelectionIndex());
			showGallery(selectedCategory);
		}

		public void widgetDefaultSelected(SelectionEvent event) {
			String selectedCategory = categoryList.get(0);
			showGallery(selectedCategory);
		}
	}

	/**
	 * Show the gallery associated to a precise category key. If the gallery for that key is cached then it is show
	 * directly, otherwise it is created, populated and then cached and shown.
	 * 
	 * @param galleryCategory
	 *          the key of the gallery.
	 */
	private void showGallery(String galleryCategory) {
		Gallery toShow = cachedGalleries.get(galleryCategory);
		if (toShow == null)
			toShow = createGalleryForCategory(galleryCategory);
		layout.topControl = toShow;
		galleryComposite.layout();
		GalleryItem rootItem = toShow.getItem(0);
		if (toShow.getSelectionCount() <= 0 && rootItem.getItemCount() > 0) {
			toShow.setSelection(new GalleryItem[] { rootItem.getItem(0) });
			setPageComplete(validatePage());
		}
		storeSettings();
		zoomModified();
	}

	/**
	 * Create a new gallery and return it as parameter. The new gallery already had the listener added
	 * 
	 * @return a new gallery component
	 */
	private Gallery createGalleryComponent() {
		Gallery gal = new Gallery(galleryComposite, SWT.VIRTUAL | SWT.V_SCROLL | SWT.BORDER);
		NoGroupRenderer gr = new NoGroupRenderer();
		gr.setMinMargin(2);
		gr.setItemSize(GALLERY_WIDTH, GALLERY_HEIGHT);
		gr.setAutoMargin(true);
		gal.setGroupRenderer(gr);
		RoundedGalleryItemRenderer ir = new RoundedGalleryItemRenderer();
		ir.setShowLabels(true);
		gal.setItemRenderer(ir);

		gal.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				storeSettings();
				setPageComplete(validatePage());
			}
		});

		gal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				getContainer().showPage(getNextPage());
			}
		});
		return gal;
	}

	/**
	 * For a gallery create all the preview of a precise category
	 * 
	 * @param gal
	 *          the gallery
	 * @param categoryName
	 *          key of the category
	 */
	private void craeteItems(final Gallery gal, final String categoryName) {
		final GalleryItem itemGroup = new GalleryItem(gal, SWT.NONE);
		final String universalCategory = categoryList.get(0);
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					getContainer().run(true, true, new IRunnableWithProgress() {

						@Override
						public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
							monitor.beginTask("Loading templates", IProgressMonitor.UNKNOWN);
							Display.getDefault().syncExec(new Runnable() {

								@Override
								public void run() {
									for (TemplateBundle b : bundles) {
										HashSet<String> bundleCategories = categoryCache.get(b);
										if (categoryName.equals(universalCategory) || bundleCategories.contains(categoryName)) {
											GalleryItem item = new GalleryItem(itemGroup, SWT.NONE);
											item.setData("template", b);

											if (b instanceof JrxmlTemplateBundle) {
												Image itemImage = ((JrxmlTemplateBundle) b).getIcon();

												if (itemImage != null) {
													// Add viewer required effects to the images shown...
													Image selectedImg = new Image(itemImage.getDevice(), SWTImageEffects.extendArea(
															itemImage.getImageData(), 40, null));
													Image standardShadowedImg = new Image(itemImage.getDevice(), Glow.glow(
															itemImage.getImageData(), ResourceManager.getColor(SWT.COLOR_GRAY), 40, 0, 255));
													item.setSelectedImage(selectedImg);
													item.setStandardImage(standardShadowedImg);
													item.setImage(standardShadowedImg);

													// Save image references, so they can later be disposed
													templateImages.add(selectedImg);
													templateImages.add(standardShadowedImg);
												}
												item.setText(b.getLabel());
											}
										}
										if (monitor.isCanceled())
											break;
									}
									if (!bundles.isEmpty())
										selectedTemplate = bundles.get(0);
									GalleryItem rootItem = gal.getItem(0);
									if (gal.getSelectionCount() <= 0 && rootItem.getItemCount() > 0) {
										gal.setSelection(new GalleryItem[] { rootItem.getItem(0) });
										storeSettings();
										setPageComplete(validatePage());
									}
								}
							});
						}
					});
				} catch (InvocationTargetException e) {
					UIUtils.showError(e);
				} catch (InterruptedException e) {
					UIUtils.showError(e);
				}
			}
		});
	}

	private Gallery createGalleryForCategory(String categoryName) {
		Gallery gal = createGalleryComponent();
		craeteItems(gal, categoryName);
		cachedGalleries.put(categoryName, gal);
		return gal;
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(2, false));

		Label lbl = new Label(container, SWT.NONE);
		lbl.setText("Zoom:");
		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_END | GridData.FILL_HORIZONTAL);
		lbl.setLayoutData(gd);

		scale = new Scale(container, SWT.NONE);
		scale.setMinimum(1);
		scale.setMaximum(50);
		scale.setIncrement(1);
		scale.setPageIncrement(5);

		SashForm sashForm = new SashForm(container, SWT.NONE);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

		// list = new org.eclipse.swt.widgets.List(sashForm, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		Table table = new Table(sashForm, SWT.V_SCROLL | SWT.SINGLE | SWT.BORDER);

		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true));

		gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
		gd.widthHint = 150;
		scale.setLayoutData(gd);

		galleryComposite = new Composite(sashForm, SWT.NONE);
		layout = new StackLayout();
		galleryComposite.setLayout(layout);

		categoryList = BuiltInCategories.getCategoriesList();
		for (String cat : categoryList) {
			cachedGalleries.put(cat, null);
		}
		bundles = StudioTemplateManager.getInstance().getTemplateBundles();
		findTemplates();
		// initializeBackgroundData();

		sashForm.setWeights(new int[] { 20, 80 });

		scale.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				zoomModified();
			}
		});

		scale.setSelection(6);
		// Manually fire the event because the invocation
		// of #Scale.selection() does not fire it.
		zoomModified();

		createTableColumn(table);
		showGallery(categoryList.get(0));
	}

	private void createTableColumn(Table table) {
		table.setHeaderVisible(true);
		TableColumn[] col = new TableColumn[1];
		col[0] = new TableColumn(table, SWT.NONE);
		col[0].setText("Categories");

		TableLayout tlayout = new TableLayout();
		tlayout.addColumnData(new ColumnWeightData(100, false));
		table.setLayout(tlayout);

		for (TableColumn c : col)
			c.pack();

		TableViewer tableViewer = new TableViewer(table);
		tableViewer.setContentProvider(new ListContentProvider());
		tableViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return Messages.getString(element.toString());
			}
		});
		tableViewer.setInput(categoryList);
		table.addSelectionListener(new CategoryChooser());
		table.setSelection(0);
	}

	private void initializeBackgroundData() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				for (int i = 1; i < categoryList.size(); i++) {
					String category = categoryList.get(i);
					if (cachedGalleries.get(category) == null)
						createGalleryForCategory(category);
				}
			}
		});
	}

	/**
	 * Method that handles the zoom modification (scale widget).
	 */
	private void zoomModified() {
		double c = 1 + 0.1 * scale.getSelection();
		if (layout.topControl != null) {
			NoGroupRenderer gr = (NoGroupRenderer) ((Gallery) layout.topControl).getGroupRenderer();
			gr.setItemSize((int) (GALLERY_WIDTH * c), (int) (GALLERY_HEIGHT * c));
		}
	}

	/**
	 * For every available template it build a list of all the categories and for every template the map of his categories
	 * is build
	 */
	private void findTemplates() {
		// Load all the available templates by invoking the template manager
		for (TemplateBundle b : bundles) {
			Object templateCategory = b.getProperty(BuiltInCategories.CATEGORY_KEY);
			if (templateCategory != null) {
				String[] strCategoryList = templateCategory.toString().split(";");
				HashSet<String> categorySet = new HashSet<String>();

				for (String cat : strCategoryList) {
					if (!cat.trim().isEmpty()) {
						if (!cachedGalleries.containsKey(cat.toLowerCase())) {
							categoryList.add(cat);
							cachedGalleries.put(cat.toLowerCase(), null);
						}
						categorySet.add(cat);
					}
				}
				categoryCache.put(b, categorySet);
			} else {
				categoryCache.put(b, new HashSet<String>());
			}
		}
	}

	public static String capitalizeFirstLetters(String s) {

		for (int i = 0; i < s.length(); i++) {

			if (i == 0) {
				// Capitalize the first letter of the string.
				s = String.format("%s%s", Character.toUpperCase(s.charAt(0)), s.substring(1));
			}

			// Is this character a non-letter or non-digit? If so
			// then this is probably a word boundary so let's capitalize
			// the next character in the sequence.
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				if (i + 1 < s.length()) {
					s = String.format("%s%s%s", s.subSequence(0, i + 1), Character.toUpperCase(s.charAt(i + 1)),
							s.substring(i + 2));
				}
			}

		}

		return s;

	}

	@Override
	public void dispose() {
		super.dispose();
		// Dispose all images used for template thumbnails
		for (Image img : templateImages) {
			img.dispose();
		}
		templateImages.clear();
		templateImages = null;
	}

	/**
	 * We don't want to proceed until a template has been selected... In this method we check if the user has made her
	 * selection
	 */
	public boolean validatePage() {
		Gallery gal = (Gallery) layout.topControl;
		if (gal.getSelectionCount() == 0)
			return false;
		return true;
	}

	/**
	 * Store inside the wizard settings the user selection.
	 */
	public void storeSettings() {
		Gallery gal = (Gallery) layout.topControl;
		if (getSettings() == null)
			return;
		if (gal == null)
			return;

		GalleryItem[] selection = gal.getSelection();

		if (selection != null && selection.length > 0) {

			selectedTemplate = (TemplateBundle) selection[0].getData("template");
			getSettings().put("template", selectedTemplate);
		} else {
			getSettings().remove("template");
			selectedTemplate = null;
		}
	}

}
