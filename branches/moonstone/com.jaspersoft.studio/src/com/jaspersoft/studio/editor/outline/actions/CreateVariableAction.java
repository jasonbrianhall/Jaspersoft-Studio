/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.editor.outline.actions;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.jaspersoft.studio.editor.palette.JDPaletteCreationFactory;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.variable.MVariable;
import com.jaspersoft.studio.model.variable.MVariables;

/*
 * /* The Class CreateVariableAction.
 */
public class CreateVariableAction extends ACreateAndSelectAction {

	/** The Constant ID. */
	public static final String ID = "create_variable"; //$NON-NLS-1$

	/**
	 * Constructs a <code>CreateAction</code> using the specified part.
	 * 
	 * @param part
	 *          The part for this action
	 */
	public CreateVariableAction(IWorkbenchPart part) {
		super(part);
		setCreationFactory(new JDPaletteCreationFactory(MVariable.class));
	}
	
	public void forceSelection(ISelection selection) {
		setSelection(selection);
	}

	@Override
	protected boolean calculateEnabled() {
		if(!checkSingleSelectedObject(MVariables.class)){
			return false;
		}
		return super.calculateEnabled();
	}
	
	/**
	 * Initializes this action's text and images.
	 */
	@Override
	protected void init() {
		super.init();
		setText(Messages.CreateVariableAction_create_variable);
		setToolTipText(Messages.CreateVariableAction_create_variable_tool_tip);
		setId(CreateVariableAction.ID);
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
		setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD_DISABLED));
		setEnabled(false);
	}

}
