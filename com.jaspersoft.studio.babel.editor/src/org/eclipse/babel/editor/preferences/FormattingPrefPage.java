/*******************************************************************************
 * Copyright (c) 2007 Pascal Essiembre.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Pascal Essiembre - initial API and implementation
 ******************************************************************************/
package org.eclipse.babel.editor.preferences;

import org.eclipse.babel.core.message.resource.ser.IPropertiesSerializerConfig;
import org.eclipse.babel.messages.Messages;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.prefs.BackingStoreException;

/**
 * Plugin formatting preference page.
 * 
 * @author Pascal Essiembre (pascal@essiembre.com)
 */
public class FormattingPrefPage extends AbstractPrefPage {

    /* Preference fields. */
    private Button showGeneratedBy;

    private Button convertUnicodeToEncoded;
    private Button convertUnicodeUpperCase;

    private Button alignEqualSigns;
    private Button ensureSpacesAroundEquals;

    private Button groupKeys;
    private Text groupLevelDeep;
    private Text groupLineBreaks;
    private Button groupAlignEqualSigns;

    private Button wrapLines;
    private Text wrapCharLimit;
    private Button wrapAlignEqualSigns;
    private Text wrapIndentSpaces;
    private Button wrapNewLine;

    private Button newLineTypeForce;
    private Button[] newLineTypes = new Button[3];

    private Button keepEmptyFields;
    private Button sortKeys;

    /**
     * Constructor.
     */
    public FormattingPrefPage() {
        super();
    }

    /**
     * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
     */
    protected Control createContents(Composite parent) {
        Composite field = null;
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));

        // Show generated by comment?
        field = createFieldComposite(composite);
        showGeneratedBy = new Button(field, SWT.CHECK);
        showGeneratedBy.setSelection(MsgEditorPreferences.getShowSupportEnabled());
        new Label(field, SWT.NONE).setText(Messages.prefs_showGeneratedBy);

        // Convert unicode to encoded?
        field = createFieldComposite(composite);
        convertUnicodeToEncoded = new Button(field, SWT.CHECK);
        convertUnicodeToEncoded.setSelection(MsgEditorPreferences.getUnicodeEscapeEnabled());
        convertUnicodeToEncoded.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                refreshEnabledStatuses();
            }
        });
        new Label(field, SWT.NONE).setText(Messages.prefs_convertUnicode); 

        // Use upper case for encoded hexadecimal values?
        field = createFieldComposite(composite, indentPixels);
        convertUnicodeUpperCase = new Button(field, SWT.CHECK);
        convertUnicodeUpperCase.setSelection(MsgEditorPreferences.getUnicodeEscapeUppercase());
        new Label(field, SWT.NONE).setText(Messages.prefs_convertUnicode_upper);

        // Align equal signs?
        field = createFieldComposite(composite);
        alignEqualSigns = new Button(field, SWT.CHECK);
        alignEqualSigns.setSelection(MsgEditorPreferences.getAlignEqualsEnabled());
        alignEqualSigns.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                refreshEnabledStatuses();
            }
        });
        new Label(field, SWT.NONE).setText(Messages.prefs_alignEquals);

        field = createFieldComposite(composite);
        ensureSpacesAroundEquals = new Button(field, SWT.CHECK);
        ensureSpacesAroundEquals.setSelection(MsgEditorPreferences.getSpacesAroundEqualsEnabled());
        new Label(field, SWT.NONE).setText(Messages.prefs_spacesAroundEquals);

        // Group keys?
        field = createFieldComposite(composite);
        groupKeys = new Button(field, SWT.CHECK);
        groupKeys.setSelection(MsgEditorPreferences.getGroupKeysEnabled());
        groupKeys.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                refreshEnabledStatuses();
            }
        });
        new Label(field, SWT.NONE).setText(Messages.prefs_groupKeys);

        // Group keys by how many level deep?
        field = createFieldComposite(composite, indentPixels);
        new Label(field, SWT.NONE).setText(Messages.prefs_levelDeep);
        groupLevelDeep = new Text(field, SWT.BORDER);
        groupLevelDeep.setText(Integer.toString(MsgEditorPreferences.getGroupLevelDeepness()));
        groupLevelDeep.setTextLimit(2);
        setWidthInChars(groupLevelDeep, 2);
        groupLevelDeep.addKeyListener(new IntTextValidatorKeyListener(Messages.prefs_levelDeep_error));
        
        // How many lines between groups?
        field = createFieldComposite(composite, indentPixels);
        new Label(field, SWT.NONE).setText(Messages.prefs_linesBetween);
        groupLineBreaks = new Text(field, SWT.BORDER);
        groupLineBreaks.setText(Integer.toString(MsgEditorPreferences.getGroupSeparatorBlankLineCount()));
        groupLineBreaks.setTextLimit(2);
        setWidthInChars(groupLineBreaks, 2);
        groupLineBreaks.addKeyListener(new IntTextValidatorKeyListener(Messages.prefs_linesBetween_error));

        // Align equal signs within groups?
        field = createFieldComposite(composite, indentPixels);
        groupAlignEqualSigns = new Button(field, SWT.CHECK);
        groupAlignEqualSigns.setSelection(MsgEditorPreferences.getGroupAlignEqualsEnabled());
        new Label(field, SWT.NONE).setText(Messages.prefs_groupAlignEquals);

        // Wrap lines?
        field = createFieldComposite(composite);
        wrapLines = new Button(field, SWT.CHECK);
        wrapLines.setSelection(MsgEditorPreferences.isWrapLinesEnabled());
        wrapLines.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                refreshEnabledStatuses();
            }
        });
        new Label(field, SWT.NONE).setText(Messages.prefs_wrapLines);

        // After how many characters should we wrap?
        field = createFieldComposite(composite, indentPixels);
        new Label(field, SWT.NONE).setText(Messages.prefs_wrapLinesChar);
        wrapCharLimit = new Text(field, SWT.BORDER);
        wrapCharLimit.setText(Integer.toString(MsgEditorPreferences.getWrapLineLength()));
        wrapCharLimit.setTextLimit(4);
        setWidthInChars(wrapCharLimit, 4);
        wrapCharLimit.addKeyListener(new IntTextValidatorKeyListener(Messages.prefs_wrapLinesChar_error));

        // Align wrapped lines with equal signs?
        field = createFieldComposite(composite, indentPixels);
        wrapAlignEqualSigns = new Button(field, SWT.CHECK);
        wrapAlignEqualSigns.setSelection(MsgEditorPreferences.isWrapAlignEqualsEnabled());
        wrapAlignEqualSigns.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                refreshEnabledStatuses();
            }
        });
        new Label(field, SWT.NONE).setText(Messages.prefs_wrapAlignEquals);
        // How many spaces/tabs to use for indenting?
        field = createFieldComposite(composite, indentPixels);
        new Label(field, SWT.NONE).setText(Messages.prefs_wrapIndent); //$NON-NLS-1$
        wrapIndentSpaces = new Text(field, SWT.BORDER);
        wrapIndentSpaces.setText(Integer.toString(MsgEditorPreferences.getWrapIndentLength()));
        wrapIndentSpaces.setTextLimit(2);
        setWidthInChars(wrapIndentSpaces, 2);
        wrapIndentSpaces.addKeyListener(new IntTextValidatorKeyListener(Messages.prefs_wrapIndent_error));

        // Should we wrap after new line characters
        field = createFieldComposite(composite);
        wrapNewLine = new Button(field, SWT.CHECK);
        wrapNewLine.setSelection(MsgEditorPreferences.getNewLineNice());
        new Label(field, SWT.NONE).setText(Messages.prefs_newline_nice); 

        // How should new lines appear in properties file
        field = createFieldComposite(composite);
        newLineTypeForce = new Button(field, SWT.CHECK);
        newLineTypeForce.setSelection(MsgEditorPreferences.getForceNewLineType());
        newLineTypeForce.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                refreshEnabledStatuses();
            }
        });
        Composite newLineRadioGroup = new Composite(field, SWT.NONE);
        new Label(newLineRadioGroup, SWT.NONE).setText(Messages.prefs_newline_force);
        newLineRadioGroup.setLayout(new RowLayout());
        newLineTypes[0] = new Button(newLineRadioGroup, SWT.RADIO);
        newLineTypes[0].setText("UNIX (\\n)"); //$NON-NLS-1$
        newLineTypes[1] = new Button(newLineRadioGroup, SWT.RADIO);
        newLineTypes[1].setText("Windows (\\r\\n)"); //$NON-NLS-1$
        newLineTypes[2] = new Button(newLineRadioGroup, SWT.RADIO);
        newLineTypes[2].setText("Mac (\\r)"); //$NON-NLS-1$
        newLineTypes[MsgEditorPreferences.getNewLineStyle() - 1].setSelection(true);

        // Keep empty fields?
        field = createFieldComposite(composite);
        keepEmptyFields = new Button(field, SWT.CHECK);
        keepEmptyFields.setSelection(MsgEditorPreferences.getKeepEmptyFields()); 
        new Label(field, SWT.NONE).setText(Messages.prefs_keepEmptyFields);

        // Sort keys?
        field = createFieldComposite(composite);
        sortKeys = new Button(field, SWT.CHECK);
        sortKeys.setSelection(MsgEditorPreferences.getSortkeys());
        new Label(field, SWT.NONE).setText(Messages.prefs_keysSorted);

        refreshEnabledStatuses();

        return composite;
    }

    /**
     * @see org.eclipse.jface.preference.IPreferencePage#performOk()
     */
    public boolean performOk() {
        IEclipsePreferences prefs = MsgEditorPreferences.getEclipsePreferenceStore();
        prefs.putBoolean(MsgEditorPreferences.SHOW_SUPPORT_ENABLED, showGeneratedBy.getSelection());
        prefs.putBoolean(MsgEditorPreferences.UNICODE_ESCAPE_ENABLED, convertUnicodeToEncoded.getSelection());
        prefs.putBoolean(MsgEditorPreferences.UNICODE_ESCAPE_UPPERCASE,convertUnicodeUpperCase.getSelection());
        prefs.putBoolean(MsgEditorPreferences.ALIGN_EQUALS_ENABLED, alignEqualSigns.getSelection());
        prefs.putBoolean(MsgEditorPreferences.SPACES_AROUND_EQUALS_ENABLED,ensureSpacesAroundEquals.getSelection());
        prefs.putBoolean(MsgEditorPreferences.GROUP_KEYS_ENABLED,groupKeys.getSelection());
        prefs.put(MsgEditorPreferences.GROUP_LEVEL_DEEP, groupLevelDeep.getText());
        prefs.put(MsgEditorPreferences.GROUP_SEP_BLANK_LINE_COUNT,groupLineBreaks.getText());
        prefs.putBoolean(MsgEditorPreferences.GROUP_ALIGN_EQUALS_ENABLED, groupAlignEqualSigns.getSelection());
        prefs.putBoolean(MsgEditorPreferences.WRAP_LINES_ENABLED,  wrapLines.getSelection());
        prefs.put(MsgEditorPreferences.WRAP_LINE_LENGTH,wrapCharLimit.getText());
        prefs.putBoolean(MsgEditorPreferences.WRAP_ALIGN_EQUALS_ENABLED,wrapAlignEqualSigns.getSelection());
        prefs.put(MsgEditorPreferences.WRAP_INDENT_LENGTH, wrapIndentSpaces.getText());
        prefs.putBoolean(MsgEditorPreferences.NEW_LINE_NICE, wrapNewLine.getSelection());
        prefs.putBoolean(MsgEditorPreferences.FORCE_NEW_LINE_TYPE, newLineTypeForce.getSelection());
        for (int i = 0; i < newLineTypes.length; i++) {
            if (newLineTypes[i].getSelection()) {
                prefs.putInt(MsgEditorPreferences.NEW_LINE_STYLE, i + 1);
            }
        }
        prefs.putBoolean(MsgEditorPreferences.KEEP_EMPTY_FIELDS,keepEmptyFields.getSelection());
        prefs.putBoolean(MsgEditorPreferences.SORT_KEYS, sortKeys.getSelection());
        try {
			prefs.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
        refreshEnabledStatuses();
        return super.performOk();
    }

    /**
     * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
     */
    protected void performDefaults() {
        showGeneratedBy.setSelection(true);
        convertUnicodeToEncoded.setSelection(true);
        convertUnicodeToEncoded.setSelection(true);
        alignEqualSigns.setSelection(true);
        alignEqualSigns.setSelection(true);
        groupKeys.setSelection(true);
        groupLevelDeep.setText(Integer.toString(1));
        groupLineBreaks.setText(Integer.toString(1));
        groupAlignEqualSigns.setSelection(true);
        wrapLines.setSelection(true);
        wrapCharLimit.setText(Integer.toString(80));
        wrapAlignEqualSigns.setSelection(true);
        wrapIndentSpaces.setText(Integer.toString(8));
        wrapNewLine.setSelection(IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT);
        newLineTypeForce.setSelection(IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT);
        newLineTypes[Math.min(IPropertiesSerializerConfig.NEW_LINE_UNIX - 1, 0)].setSelection(true);
        keepEmptyFields.setSelection(false);
        sortKeys.setSelection(true);
        refreshEnabledStatuses();
        super.performDefaults();
    }

    protected void refreshEnabledStatuses() {
        boolean isEncodingUnicode = convertUnicodeToEncoded.getSelection();
        boolean isGroupKeyEnabled = groupKeys.getSelection();
        boolean isAlignEqualsEnabled = alignEqualSigns.getSelection();
        boolean isWrapEnabled = wrapLines.getSelection();
        boolean isWrapAlignEqualsEnabled = wrapAlignEqualSigns.getSelection();
        boolean isNewLineStyleForced = newLineTypeForce.getSelection();

        convertUnicodeUpperCase.setEnabled(isEncodingUnicode);
        groupLevelDeep.setEnabled(isGroupKeyEnabled);
        groupLineBreaks.setEnabled(isGroupKeyEnabled);
        groupAlignEqualSigns.setEnabled(isGroupKeyEnabled
                && isAlignEqualsEnabled);
        wrapCharLimit.setEnabled(isWrapEnabled);
        wrapAlignEqualSigns.setEnabled(isWrapEnabled);
        wrapIndentSpaces.setEnabled(isWrapEnabled && !isWrapAlignEqualsEnabled);
        for (int i = 0; i < newLineTypes.length; i++) {
            newLineTypes[i].setEnabled(isNewLineStyleForced);
        }
    }

}
