/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.server.publish.wizard.page;

import java.util.List;

import net.sf.jasperreports.engine.design.JRDesignExpression;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.checkbox.CheckBoxLabelProvider;
import com.jaspersoft.studio.property.descriptor.expression.JRExpressionCellEditor;
import com.jaspersoft.studio.server.Activator;
import com.jaspersoft.studio.server.messages.Messages;
import com.jaspersoft.studio.server.model.AFileResource;
import com.jaspersoft.studio.server.model.AMJrxmlContainer;
import com.jaspersoft.studio.server.model.MResource;
import com.jaspersoft.studio.server.publish.PublishOptions;
import com.jaspersoft.studio.server.publish.PublishUtil;
import com.jaspersoft.studio.server.publish.ResourcePublishMethod;
import com.jaspersoft.studio.server.publish.action.ReferenceResourceAction;
import com.jaspersoft.studio.server.publish.action.ResourceExpressionAction;
import com.jaspersoft.studio.server.publish.action.ResourceToFolderAction;
import com.jaspersoft.studio.server.publish.action.SelectLocalAction;
import com.jaspersoft.studio.swt.widgets.table.ListContentProvider;
import com.jaspersoft.studio.utils.Misc;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;
import com.jaspersoft.studio.wizards.ContextHelpIDs;
import com.jaspersoft.studio.wizards.JSSHelpWizardPage;

public class ResourcesPage extends JSSHelpWizardPage {
	private JasperReportsConfiguration jConfig;
	private TableViewer tableViewer;

	public ResourcesPage(JasperReportsConfiguration jConfig) {
		super("serverrespublish"); //$NON-NLS-1$
		setTitle(Messages.ResourcesPage_title);
		setDescription(Messages.ResourcesPage_description);
		this.jConfig = jConfig;
	}

	private AMJrxmlContainer pres;

	public void setParentResource(AMJrxmlContainer pres) {
		this.pres = pres;
	}

	/**
	 * Return the context name for the help of this page
	 */
	@Override
	protected String getContextName() {
		return ContextHelpIDs.WIZARD_SELECT_RESOURCES;
	}

	public boolean isEmpty() {
		return tableViewer.getTable().getItemCount() > 0;
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		setControl(composite);
		composite.setLayout(new GridLayout());

		tableViewer = new TableViewer(composite, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		tableViewer.setContentProvider(new ListContentProvider());
		ColumnViewerToolTipSupport.enableFor(tableViewer);
		Table table = (Table) tableViewer.getControl();
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));

		TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		TableColumn column = viewerColumn.getColumn();
		column.setText(Messages.ResourcesPage_table_resource);
		column.setWidth(300);
		viewerColumn.setLabelProvider(new TLabelProvider() {
			@Override
			public String getText(Object element) {
				MResource fr = (MResource) element;
				return fr.getDisplayText();
			}

			@Override
			public Image getImage(Object element) {
				setErrorMessage(null);
				ResourcesPage.this.setPageComplete(true);
				MResource fr = (MResource) element;
				ImageDescriptor id = fr.getThisIconDescriptor().getIcon16();
				PublishOptions popt = fr.getPublishOptions();
				if (popt.getPublishMethod() != ResourcePublishMethod.LOCAL
						&& popt.getReferencedResource() == null) {
					FieldDecoration fd = FieldDecorationRegistry.getDefault()
							.getFieldDecoration(
									FieldDecorationRegistry.DEC_ERROR);
					setErrorMessage(Messages.ResourcesPage_0);
					ResourcesPage.this.setPageComplete(false);
					return ResourceManager.decorateImage(id.createImage(),
							fd.getImage(), ResourceManager.BOTTOM_LEFT);
				}
				if (popt.getPublishMethod() == ResourcePublishMethod.REFERENCE)
					return Activator.getDefault().getImage(
							ResourceManager.decorateImage(id,
									MResource.LINK_DECORATOR,
									ResourceManager.BOTTOM_LEFT));
				return Activator.getDefault().getImage(id);
			}
		});

		viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText(Messages.ResourcesPage_table_overwrite);
		column.setWidth(80);
		viewerColumn.setLabelProvider(new TLabelProvider() {
			private CheckBoxLabelProvider chLabelProvider = new CheckBoxLabelProvider(
					NullEnum.NOTNULL);

			@Override
			public String getText(Object element) {
				MResource fr = (MResource) element;
				return chLabelProvider.getText(fr.getPublishOptions()
						.isOverwrite());
			}

			@Override
			public Image getImage(Object element) {
				MResource fr = (MResource) element;
				return chLabelProvider.getCellEditorImage(fr
						.getPublishOptions().isOverwrite());
			}
		});

		viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText(Messages.ResourcesPage_1);
		column.setWidth(100);
		viewerColumn.setLabelProvider(new TLabelProvider() {
			@Override
			public String getText(Object element) {
				MResource fr = (MResource) element;
				if (fr.getPublishOptions().getPublishMethod() == ResourcePublishMethod.REWRITEEXPRESSION)
					return fr.getPublishOptions().getRepoExpression();
				return Misc.nvl(fr.getPublishOptions().getExpression());
			}

			@Override
			public String getToolTipText(Object element) {
				String txt = getText(element);
				if (Misc.isNullOrEmpty(txt))
					txt = super.getToolTipText(element);
				return txt;
			}
		});

		viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText(Messages.ResourcesPage_2);
		column.setWidth(100);
		viewerColumn.setLabelProvider(new TLabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof AFileResource)
					return ((AFileResource) element).getHFFileSize();
				return ""; //$NON-NLS-1$
			}

		});

		viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText(Messages.ResourcesPage_4);
		column.setWidth(100);
		viewerColumn.setLabelProvider(new TLabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof MResource) {
					MResource mres = (MResource) element;
					if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.RESOURCE)
						return sres.getText();
					if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.REFERENCE)
						return sresource.getText();
					if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.LOCAL)
						return slocal.getText();
				}
				return ""; //$NON-NLS-1$
			}

		});

		sresource = new ReferenceResourceAction(tableViewer);
		sres = new ResourceToFolderAction(tableViewer);
		slocal = new SelectLocalAction(tableViewer);

		attachCellEditors(tableViewer, table);

		MenuManager menuMgr = new MenuManager();
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			private ResourceExpressionAction rexp = new ResourceExpressionAction(
					tableViewer);

			public void menuAboutToShow(IMenuManager menu) {
				StructuredSelection s = (StructuredSelection) tableViewer
						.getSelection();
				if (s != null) {
					MResource mres = (MResource) s.getFirstElement();
					if (mres != null && mres.getPublishOptions().isOverwrite()) {
						if (sresource.calculateEnabled(mres))
							menu.add(sresource);
						if (sres.calculateEnabled(mres))
							menu.add(sres);
						if (slocal.calculateEnabled(mres))
							menu.add(slocal);
						if (rexp.calculateEnabled(mres))
							menu.add(rexp);
					}
				}
			}

		});
		Menu menu = menuMgr.createContextMenu(tableViewer.getControl());
		tableViewer.getControl().setMenu(menu);

		// fillData(false);
	}

	private ReferenceResourceAction sresource;
	private ResourceToFolderAction sres;
	private SelectLocalAction slocal;

	private void attachCellEditors(final TableViewer viewer, Composite parent) {
		viewer.setCellModifier(new ICellModifier() {
			public boolean canModify(Object element, String property) {
				if (property.equals("VALUE")) //$NON-NLS-1$
					return true;
				if (property.equals("EXPRESSION") //$NON-NLS-1$
						&& ((MResource) element).getPublishOptions()
								.getjExpression() != null)
					return true;
				if (property.equals("TYPE")) //$NON-NLS-1$
					if (element instanceof AFileResource)
						return true;
				return false;
			}

			public Object getValue(Object element, String property) {
				MResource prop = (MResource) element;
				if ("VALUE".equals(property)) //$NON-NLS-1$
					return prop.getPublishOptions().isOverwrite();
				if ("NAME".equals(property)) //$NON-NLS-1$
					return prop.getDisplayText();
				if ("FILESIZE".equals(property)) { //$NON-NLS-1$
					if (prop instanceof AFileResource)
						return ((AFileResource) element).getHFFileSize();
				}
				if ("EXPRESSION".equals(property)) { //$NON-NLS-1$
					JRDesignExpression jd = new JRDesignExpression();
					jd.setText(prop.getPublishOptions().getExpression());
					return jd;
				}
				if ("TYPE".equals(property)) { //$NON-NLS-1$
					if (prop instanceof AFileResource) {
						AFileResource mres = (AFileResource) element;
						if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.RESOURCE)
							return 0;
						if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.REFERENCE)
							return 1;
						if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.LOCAL)
							return 2;
					}
					return 2;
				}
				return ""; //$NON-NLS-1$
			}

			public void modify(Object element, String property, Object value) {
				TableItem tableItem = (TableItem) element;
				MResource data = (MResource) tableItem.getData();
				if ("VALUE".equals(property)) //$NON-NLS-1$
					data.getPublishOptions().setOverwrite((Boolean) value);
				if ("EXPRESSION".equals(property)) //$NON-NLS-1$
					data.getPublishOptions().setExpression(
							value == null ? null : ((JRDesignExpression) value)
									.getText());
				if ("TYPE".equals(property)) { //$NON-NLS-1$
					if (value instanceof Integer) {
						int intValue = ((Integer) value).intValue();
						switch (intValue) {
						case 0:
							sres.calculateEnabled(data);
							sres.run();
							break;
						case 1:
							sresource.calculateEnabled(data);
							sresource.run();
							break;
						case 2:
							slocal.calculateEnabled(data);
							slocal.run();
							break;
						}
					}
				}
				tableViewer.update(element, new String[] { property });
				tableViewer.refresh();
			}
		});

		JRExpressionCellEditor expEditor = new JRExpressionCellEditor(parent,
				new ExpressionContext(jConfig));
		viewer.setCellEditors(new CellEditor[] {
				new TextCellEditor(parent),
				new CheckboxCellEditor(parent),
				expEditor,
				new TextCellEditor(parent, SWT.RIGHT),
				new ComboBoxCellEditor(parent, new String[] { sres.getText(),
						sresource.getText(), slocal.getText() }) });
		viewer.setColumnProperties(new String[] {
				"NAME", "VALUE", "EXPRESSION", "FILESIZE", "TYPE" }); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
	}

	public void fillData(boolean isNew) {
		List<MResource> res = PublishUtil.getResources(pres,
				new NullProgressMonitor(), jConfig);
		if (isNew)
			for (MResource r : res) {
				if (r instanceof AFileResource)
					continue;
				r.getPublishOptions().setOverwrite(true);
			}
		tableViewer.setInput(res);
		tableViewer.refresh();
	}

	abstract class TLabelProvider extends ColumnLabelProvider {

		@Override
		public String getToolTipText(Object element) {
			String tt = ""; //$NON-NLS-1$
			MResource mres = (MResource) element;
			tt += "ID: " + mres.getValue().getName(); //$NON-NLS-1$
			tt += "\nLabel: " + mres.getValue().getLabel(); //$NON-NLS-1$

			if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.LOCAL)
				tt += "\nURI: " + mres.getValue().getUriString(); //$NON-NLS-1$
			else if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.REFERENCE) {
				tt += "\nURI: " + mres.getValue().getUriString(); //$NON-NLS-1$
				if (mres.getPublishOptions().getReferencedResource() != null)
					tt += "\nReference To: " //$NON-NLS-1$
							+ mres.getPublishOptions().getReferencedResource()
									.getUriString();
			} else if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.RESOURCE) {
				if (mres.getPublishOptions().getReferencedResource() != null)
					tt += "\nURI: " //$NON-NLS-1$
							+ mres.getPublishOptions().getReferencedResource()
									.getUriString();
			} else if (mres.getPublishOptions().getPublishMethod() == ResourcePublishMethod.REWRITEEXPRESSION)
				if (mres.getPublishOptions().getReferencedResource() != null)
					tt += "\nURI: " //$NON-NLS-1$
							+ mres.getPublishOptions().getReferencedResource()
									.getUriString();

			if (element instanceof AFileResource
					&& ((AFileResource) element).getFile() != null)
				tt += "\nFile: " //$NON-NLS-1$
						+ ((AFileResource) element).getFile().getAbsolutePath();
			return tt;
		}

		@Override
		public int getToolTipDisplayDelayTime(Object object) {
			return 100; // msec
		}

		@Override
		public int getToolTipTimeDisplayed(Object object) {
			return 5000; // msec
		}
	}

}
