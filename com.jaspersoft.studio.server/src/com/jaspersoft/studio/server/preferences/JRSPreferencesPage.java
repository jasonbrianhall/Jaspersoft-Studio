/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.server.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.preferences.util.FieldEditorOverlayPage;

/**
 * @author Veaceslav Chicu (schicu@users.sourceforge.net)
 * 
 */
public class JRSPreferencesPage extends FieldEditorOverlayPage {

	public static final String PUBLISH_REPORT_TOJRSONSAVE = "PUBLISH_REPORT_TOJRSONSAVE"; //$NON-NLS-1$
	public static final String PUBLISH_REPORT_OVERRIDEBYDEFAULT = "com.jaspersoft.studio.server.PUBLISH_REPORT_OVERRIDEBYDEFAULT"; //$NON-NLS-1$

	public JRSPreferencesPage() {
		super(GRID);
		setPreferenceStore(JaspersoftStudioPlugin.getInstance().getPreferenceStore());
		getDefaults(getPreferenceStore());
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(PUBLISH_REPORT_TOJRSONSAVE,
				com.jaspersoft.studio.server.messages.Messages.JRSPreferencesPage_1, getFieldEditorParent()));
		addField(new ComboFieldEditor(PUBLISH_REPORT_OVERRIDEBYDEFAULT, "Set Published Resources To",
				new String[][] { { "Always Overwrite", "overwrite" },
						{ "Overwrite for the first time, then ignore", "true" }, { "Always Ignore", "ignore" } },
				getFieldEditorParent()));
		
		//Eventually create the extensions for the page
		super.createFieldEditors();
	}

	public static void getDefaults(IPreferenceStore store) {
		store.setDefault(PUBLISH_REPORT_TOJRSONSAVE, true); // $NON-NLS-1$
		store.setDefault(PUBLISH_REPORT_OVERRIDEBYDEFAULT, "true"); // $NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	@Override
	public String getPageId() {
		return "com.jaspersoft.studio.server.preferences.JRSPreferencesPage.property"; //$NON-NLS-1$
	}

}
