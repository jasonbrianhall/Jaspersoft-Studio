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
package com.jaspersoft.studio.editor.outline.actions;

import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.action.ACachedSelectionAction;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.dataset.MDataset;
import com.jaspersoft.studio.property.dataset.wizard.ConnectToDatasetWizard;
import com.jaspersoft.studio.property.dataset.wizard.ConnectToDatasetWizardPage;

/**
 * Action to open the wizard to create the dataset parameters for 
 * a dataset and its dataset runs
 * 
 * @author Orlandin Marco
 *
 */
public class ConnectToDatasetAction extends ACachedSelectionAction {

	/** The Constant ID. */
	public static final String ID = "connect_to_dataset"; //$NON-NLS-1$

	/**
	 * Constructs a <code>CreateAction</code> using the specified part.
	 * 
	 * @param part
	 *          The part for this action
	 */
	public ConnectToDatasetAction(IWorkbenchPart part) {
		super(part);
	}

	/**
	 * Initializes this action's text and images.
	 */
	@Override
	protected void init() {
		super.init();
		setText(Messages.ConnectToDatasetAction_actionName);
		setToolTipText(Messages.ConnectToDatasetAction_actionTooltip);
		setId(ConnectToDatasetAction.ID);
		setImageDescriptor(JaspersoftStudioPlugin.getInstance().getImageDescriptor("icons/resources/connectdomain.png")); //$NON-NLS-1$
		setEnabled(false);
	}


	/**
	 * Enable only if there is exactly one dataset selected
	 */
	@Override
	protected boolean calculateEnabled() {
		List<?> selectedDatasets = editor.getSelectionCache().getSelectionModelForType(MDataset.class);
		return (selectedDatasets.size() == 1);
	}
	
	@Override
	public void run() {
		List<?> selectedDatasets = editor.getSelectionCache().getSelectionModelForType(MDataset.class);
		MDataset dataset = (MDataset)selectedDatasets.get(0);
		
		ConnectToDatasetWizardPage page = new ConnectToDatasetWizardPage(dataset);
		ConnectToDatasetWizard importWizard = new ConnectToDatasetWizard(page);
		WizardDialog dialog = new WizardDialog(Display.getDefault().getActiveShell(), importWizard);
		if (dialog.open() == Dialog.OK){
			command = page.getCommand();
			execute(command);
		}
	}
	
}
