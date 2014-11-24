/*
 * Copyright (C) 2003, 2004  Pascal Essiembre, Essiembre Consultant Inc.
 * 
 * This file is part of Essiembre ResourceBundle Editor.
 * 
 * Essiembre ResourceBundle Editor is free software; you can redistribute it 
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * Essiembre ResourceBundle Editor is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Essiembre ResourceBundle Editor; if not, write to the 
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330, 
 * Boston, MA  02111-1307  USA
 */
package com.essiembre.eclipse.rbe.ui.wizards;

import java.util.Locale;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

import com.essiembre.eclipse.rbe.RBEPlugin;
import com.essiembre.eclipse.rbe.ui.widgets.LocaleSelector;
import com.jaspersoft.translation.wizard.HelpWizardPage;

/**
 * The "New" wizard page allows setting the container for the new bundle group
 * as well as the bundle group common base name. The page will only accept file
 * name without the extension.
 * 
 * @author Pascal Essiembre (essiembre@users.sourceforge.net)
 * @version $Author: essiembre $ $Revision: 1.4 $ $Date: 2005/12/07 03:35:54 $
 */
public class ResourceBundleNewWizardPage extends HelpWizardPage {

	public static final String DEFAULT_LOCALE = "[" //$NON-NLS-1$
			+ RBEPlugin.getString("editor.default") //$NON-NLS-1$
			+ "]"; //$NON-NLS-1$

	private Text containerText;

	private Text fileText;

	private ISelection selection;

	private Button addButton;

	private Button removeButton;

	private List bundleLocalesList;

	private LocaleSelector localeSelector;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param selection
	 *            workbench selection
	 */
	public ResourceBundleNewWizardPage(ISelection selection) {
		super("wizardPage"); //$NON-NLS-1$
		setTitle(RBEPlugin.getString("editor.wiz.title")); //$NON-NLS-1$
		setDescription(RBEPlugin.getString("editor.wiz.desc")); //$NON-NLS-1$
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 20;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		container.setLayoutData(gd);

		// Bundle name + location
		createTopComposite(container);

		// Locales
		createBottomComposite(container);

		initialize();
		dialogChanged();
		addDefaultLocale(new String[]{"en"});
		setControl(container);
	}

	/**
	 * Creates the bottom part of this wizard, which is the locales to add.
	 * 
	 * @param parent
	 *            parent container
	 */
	private void createBottomComposite(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		container.setLayoutData(gd);

		// Available locales
		createBottomAvailableLocalesComposite(container);

		// Buttons
		createBottomButtonsComposite(container);

		// Selected locales
		createBottomSelectedLocalesComposite(container);
	}

	/**
	 * Creates the bottom part of this wizard where selected locales are stored.
	 * 
	 * @param parent
	 *            parent container
	 */
	private void createBottomSelectedLocalesComposite(Composite parent) {

		// Selected locales Group
		Group selectedGroup = new Group(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout = new GridLayout();
		layout.numColumns = 1;
		selectedGroup.setLayout(layout);
		GridData gd = new GridData(GridData.FILL_BOTH);
		selectedGroup.setLayoutData(gd);
		selectedGroup.setText(RBEPlugin.getString("editor.wiz.selected")); //$NON-NLS-1$
		bundleLocalesList = new List(selectedGroup, SWT.READ_ONLY | SWT.MULTI
				| SWT.BORDER);
		gd = new GridData(GridData.FILL_BOTH);
		bundleLocalesList.setLayoutData(gd);
		bundleLocalesList.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				removeButton.setEnabled(bundleLocalesList.getSelectionIndices().length != 0);
				setAddButtonState();
			}
		});
	}

	/**
	 * Add the default locale to the selection list if it has a language different
	 * from every entry of an exclusion set
	 * 
	 * @param exclusionLanguages language code exclude by the locale
	 */
	public void addDefaultLocale(String[] exclusionLanguages){
		Locale defaultLocale = Locale.getDefault();
		boolean found = false;
		for(String language : exclusionLanguages){
			if (defaultLocale.getLanguage().contains(language)){
				found = true;
				break;
			}
		}
		if (!found){
			bundleLocalesList.add(getLocaleAsString(defaultLocale));
			setAddButtonState();
			dialogChanged();
		}
	}
	
	/**
	 * Creates the bottom part of this wizard where buttons to add/remove
	 * locales are located.
	 * 
	 * @param parent
	 *            parent container
	 */
	private void createBottomButtonsComposite(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		container.setLayoutData(gd);

		addButton = new Button(container, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		addButton.setLayoutData(gd);
		addButton.setText(RBEPlugin.getString("editor.wiz.add")); //$NON-NLS-1$
		addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				bundleLocalesList.add(getSelectedLocaleAsString());
				setAddButtonState();
				dialogChanged();
			}
		});

		removeButton = new Button(container, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		removeButton.setLayoutData(gd);
		removeButton.setText(RBEPlugin.getString("editor.wiz.remove")); //$NON-NLS-1$
		removeButton.setEnabled(false);
		removeButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				bundleLocalesList.remove(bundleLocalesList
						.getSelectionIndices());
				removeButton.setEnabled(false);
				setAddButtonState();
				dialogChanged();
			}
		});
	}

	/**
	 * Creates the bottom part of this wizard where locales can be chosen or
	 * created
	 * 
	 * @param parent
	 *            parent container
	 */
	private void createBottomAvailableLocalesComposite(Composite parent) {

		localeSelector = new LocaleSelector(parent);
		localeSelector.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setAddButtonState();
			}
		});
	}
	
	protected void createBundleNameArea(Composite container){
		Label label = new Label(container, SWT.NULL);
		label.setText(RBEPlugin.getString("editor.wiz.bundleName")); //$NON-NLS-1$

		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		label = new Label(container, SWT.NULL);
		label.setText("[locale].properties"); //$NON-NLS-1$
	}

	/**
	 * Creates the top part of this wizard, which is the bundle name and
	 * location.
	 * 
	 * @param parent
	 *            parent container
	 */
	protected void createTopComposite(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		container.setLayoutData(gd);

		// Folder
		Label label = new Label(container, SWT.NULL);
		label.setText(RBEPlugin.getString("editor.wiz.folder")); //$NON-NLS-1$

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		Button button = new Button(container, SWT.PUSH);
		button.setText(RBEPlugin.getString("editor.wiz.browse")); //$NON-NLS-1$
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});

		// Bundle name
		createBundleNameArea(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */
	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				containerText.setText(container.getFullPath().toString());
			}
		}
		if (fileText != null) fileText.setText("ApplicationResources"); //$NON-NLS-1$
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	protected void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				RBEPlugin.getString("editor.wiz.selectFolder")); //$NON-NLS-1$
		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toOSString());
			}
		}
	}

	/**
	 * Ensures that both text fields are set.
	 */
	protected void dialogChanged() {
		String container = getContainerName();
		String fileName = getFileName();
		if (container.length() == 0) {
			updateStatus(RBEPlugin.getString("editor.wiz.error.container"), IMessageProvider.ERROR); //$NON-NLS-1$
			return;
		}
		if (fileName.length() == 0) {
			updateStatus(RBEPlugin.getString("editor.wiz.error.bundleName"), IMessageProvider.ERROR); //$NON-NLS-1$
			return;
		}
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			updateStatus(RBEPlugin.getString("editor.wiz.error.extension"), IMessageProvider.ERROR); //$NON-NLS-1$
			return;
		}
		if (bundleLocalesList.getItems().length==0) {
			updateStatus(RBEPlugin.getString("editor.wiz.error.noLocale"), IMessageProvider.ERROR);  //$NON-NLS-1$
			return;
		}
		updateStatus(null, IMessageProvider.NONE);
	}

	protected void updateStatus(String message, int messageType) {
		setMessage(message, messageType);
		setPageComplete(messageType != IMessageProvider.ERROR);
	}
	

	/**
	 * Gets the container name.
	 * 
	 * @return container name
	 */
	public String getContainerName() {
		return containerText.getText();
	}

	/**
	 * Gets the file name.
	 * 
	 * @return file name
	 */
	public String getFileName() {
		return fileText.getText();
	}

	/**
	 * Sets the "add" button state.
	 */
	protected void setAddButtonState() {
		addButton.setEnabled(bundleLocalesList
				.indexOf(getSelectedLocaleAsString()) == -1);
	}

	/**
	 * Gets the user selected locales.
	 * 
	 * @return locales
	 */
	protected String[] getLocaleStrings() {
		return bundleLocalesList.getItems();
	}

	/**
	 * Gets a string representation of selected locale.
	 * 
	 * @return string representation of selected locale
	 */
	public String getSelectedLocaleAsString() {
		Locale selectedLocale = localeSelector.getSelectedLocale();
		String stringLocale = getLocaleAsString(selectedLocale);
		if (stringLocale != null) {
			return stringLocale;
		}
		return DEFAULT_LOCALE;
	}
	
	/**
	 * Gets a string representation of a locale.
	 * 
	 * @return string representation of a locale
	 */
	public String getLocaleAsString(Locale selectedLocale) {
		if (selectedLocale != null) {
			return selectedLocale.toString();
		}
		return null;
	}

	@Override
	protected String getContextName() {
		return null;
	}
}