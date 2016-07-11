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
package com.jaspersoft.studio.components.preferences;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.jaspersoft.studio.components.commonstyles.messages.Messages;
import com.jaspersoft.studio.preferences.util.FieldEditorOverlayPage;
import com.jaspersoft.studio.preferences.util.IPreferencePageExtension;

/**
 * Preference extension page to add to the designer preference page the controls to 
 * configure some crosstab/table behavior
 * 
 * @author Orlandin Marco
 *
 */
public class ComponentsPreferencePageExtension implements IPreferencePageExtension {

	/**
	 * Key of the behavior used when a table or a crosstab is deleted
	 */
	public static final String BEHAVIOR_ON_ELEMENT_DELETE = "tableCrosstabDelete"; //$NON-NLS-1$
	
	/**
	 * Key of the behavior used when a table or a crosstab style is changed
	 */
	public static final String BEHAVIOR_ON_STYLE_CHANGE = "tableCrosstabChangeStyle"; //$NON-NLS-1$

	/**
	 * This behavior specify to ask to the user what to do when a table/crosstab is deleted or the style is changed
	 */
	public static final String BEHAVIOR_ASK_EVERYTIME = "ask_everytime"; //$NON-NLS-1$
	
	/**
	 * This behavior specify to not delete the table/crosstab styles when the element is deleted
	 */
	public static final String BEHAVIOR_DO_NOT_DELETE = "doNotDelete"; //$NON-NLS-1$
	
	/**
	 * This behavior specify to delete the table/crosstab styles when the element is deleted
	 */
	public static final String BEHAVIOR_DELETE_STYLES = "deleteStyles"; //$NON-NLS-1$
	
	/**
	 * This behavior specify to update the old table/crosstab styles when the edit styles action is used
	 */
	public static final String BEHAVIOR_UPDATE_STYLES = "updateStyles"; //$NON-NLS-1$
	
	/**
	 * This behavior specify to create new styles when the old table/crosstab styles are edited with the edit action
	 */
	public static final String BEHAVIOR_CREATE_STYLES = "createStyles"; //$NON-NLS-1$
	
	/**
	 * This constants specify the default behavior when a table/crosstab is deleted
	 */
	public static final String DEFAULT_BEHAVIOR_DELETE = BEHAVIOR_ASK_EVERYTIME; // $NON-NLS-1$

	/**
	 * This constants specify the default behavior when a table/crosstab styles is updated
	 */
	public static final String DEFAULT_BEHAVIOR_CHANGE_STYLE = BEHAVIOR_ASK_EVERYTIME; // $NON-NLS-1$
	
	/**
	 * Create the two combo for the style preferences
	 */
	@Override
	public void createContributedFields(Composite parent, FieldEditorOverlayPage page) {
		
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		separator.setLayoutData(gd);
		
		
		page.addField(new ComboFieldEditor(BEHAVIOR_ON_ELEMENT_DELETE, Messages.ComponentsPreferencePageExtension_preferenceDelete,
				new String[][] { 
						{ Messages.ComponentsPreferencePageExtension_optionAsk, BEHAVIOR_ASK_EVERYTIME }, 
						{ Messages.ComponentsPreferencePageExtension_optionDelete, BEHAVIOR_DELETE_STYLES },
						{ Messages.ComponentsPreferencePageExtension_optionKeep, BEHAVIOR_DO_NOT_DELETE}},
				parent));
		
		page.addField(new ComboFieldEditor(BEHAVIOR_ON_STYLE_CHANGE, Messages.ComponentsPreferencePageExtension_preferenceEditStyle,
				new String[][] { 
						{ Messages.ComponentsPreferencePageExtension_optionAsk, BEHAVIOR_ASK_EVERYTIME }, 
						{ Messages.ComponentsPreferencePageExtension_optionUpdate, BEHAVIOR_UPDATE_STYLES },
						{ Messages.ComponentsPreferencePageExtension_optionCreate, BEHAVIOR_CREATE_STYLES}},
				parent));
	}
	
	public static void getDefaults(IPreferenceStore store) {
		store.setDefault(BEHAVIOR_ON_ELEMENT_DELETE, DEFAULT_BEHAVIOR_DELETE);
		store.setDefault(BEHAVIOR_ON_STYLE_CHANGE, DEFAULT_BEHAVIOR_CHANGE_STYLE);
	}

	@Override
	public void performApply() {
	}

	@Override
	public void performCancel() {
	}

	@Override
	public void performDefaults() {
	}

}
