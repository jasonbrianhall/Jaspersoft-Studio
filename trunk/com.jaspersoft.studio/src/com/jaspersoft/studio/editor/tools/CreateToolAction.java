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
package com.jaspersoft.studio.editor.tools;

import java.util.List;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.action.ACachedSelectionAction;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.IDatasetContainer;
import com.jaspersoft.studio.model.MGraphicElement;

/**
 * Action to create a new custom tool starting from the selected elements
 * 
 * @author Orlandin Marco
 * 
 */
public class CreateToolAction extends ACachedSelectionAction {
  
  public static final String ID = "CreateToolAction"; //$NON-NLS-1$
	
	public CreateToolAction(IWorkbenchPart part) {
		super(part);
		setLazyEnablementCalculation(true);
	}
	
	@Override
	protected void init() {
		super.init();
		setText(Messages.CreateToolAction_actionName);
		setId(ID);
		setImageDescriptor(JaspersoftStudioPlugin.getInstance().getImageDescriptor("icons/resources/custom-tool.png")); //$NON-NLS-1$
		setEnabled(false);
	}

	/**
	 * The action is available if there are at least one graphical element selected but no
	 * elements that uses datasets, since the custom tools support only base elements
	 */
	@Override
	protected boolean calculateEnabled() {
		List<Object> mGraphElements = editor.getSelectionCache().getSelectionModelForType(MGraphicElement.class);
		if (mGraphElements.isEmpty()) return false;
		for(Object obj : mGraphElements){
			if (obj instanceof IDatasetContainer) return false;
		}
		return true;
	}
	
	@Override
	public void run() {
		List<Object> mGraphElements = editor.getSelectionCache().getSelectionModelForType(MGraphicElement.class);
		WizardDialog dialog = new WizardDialog(UIUtils.getShell(), new ToolDefinitionWizard(mGraphElements));
		if (dialog.open() == Dialog.OK){
			UIUtils.showInformation(Messages.CreateToolAction_successMessage);
		}
	}

}
