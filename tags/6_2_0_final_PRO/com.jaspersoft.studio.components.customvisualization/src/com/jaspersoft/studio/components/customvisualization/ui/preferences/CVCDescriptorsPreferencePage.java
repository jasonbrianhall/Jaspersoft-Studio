/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * Licensed under commercial Jaspersoft Subscription License Agreement
 ******************************************************************************/
package com.jaspersoft.studio.components.customvisualization.ui.preferences;

import org.eclipse.jface.preference.PathEditor;
import org.eclipse.ui.IWorkbench;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.components.customvisualization.messages.Messages;
import com.jaspersoft.studio.preferences.util.FieldEditorOverlayPage;

/**
 * Preference page for the locations of the JRXML templates.
 * 
 * @author Veaceslav Chicu (schicu@users.sourceforge.net)
 * 
 */
public class CVCDescriptorsPreferencePage extends FieldEditorOverlayPage {
	public static final String RESOURCE_PATHS = "com.jaspersoft.studio.cvc.resource.paths"; //$NON-NLS-1$
	public static final String PAGE_ID = "com.jaspersoft.studio.preferences.templates.TemplateLocationsPreferencePage.property"; //$NON-NLS-1$

	public CVCDescriptorsPreferencePage() {
		super(GRID);
		setPreferenceStore(JaspersoftStudioPlugin.getInstance()
				.getPreferenceStore());
		setDescription(Messages.CVCDescriptorsPreferencePage_0);
	}

	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected String getPageId() {
		return PAGE_ID;
	}

	@Override
	protected void createFieldEditors() {
		addField(new PathEditor(RESOURCE_PATHS,
				Messages.CVCDescriptorsPreferencePage_1,
				Messages.CVCDescriptorsPreferencePage_2, getFieldEditorParent()));
	}

}
