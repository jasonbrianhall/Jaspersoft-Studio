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
package com.essiembre.eclipse.rbe.ui.preferences;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.essiembre.eclipse.rbe.messages.Messages;
import com.essiembre.eclipse.rbe.model.workbench.RBEPreferences;

/**
 * Plugin preference page for reporting/performance options.
 * @author Pascal Essiembre (essiembre@users.sourceforge.net)
 * @version $Author: essiembre $ $Revision: 1.4 $ $Date: 2005/07/31 05:29:46 $
 */
public class RBEReportingPrefPage extends AbstractRBEPrefPage {
    
    /* Preference fields. */
    private Button reportMissingVals;
    private Button reportDuplVals;
    private Button reportSimVals;
    private Text reportSimPrecision;
    private Button[] reportSimValsMode = new Button[2];

    /**
     * Constructor.
     */
    public RBEReportingPrefPage() {
        super();
    }

    /**
     * @see org.eclipse.jface.preference.PreferencePage#createContents(
     *         org.eclipse.swt.widgets.Composite)
     */
    protected Control createContents(Composite parent) {
  	  	IEclipsePreferences prefs = RBEPreferences.getEclipsePreferenceStore();
        Composite field = null;
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));
        
        new Label(composite, SWT.NONE).setText(Messages.prefs_perform_intro1);
        new Label(composite, SWT.NONE).setText(Messages.prefs_perform_intro2);
        new Label(composite, SWT.NONE).setText(" "); //$NON-NLS-1$
        
        // Report missing values?
        field = createFieldComposite(composite);
        reportMissingVals = new Button(field, SWT.CHECK);
        reportMissingVals.setSelection(prefs.getBoolean(RBEPreferences.REPORT_MISSING_VALUES, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        new Label(field, SWT.NONE).setText(Messages.prefs_perform_missingVals);

        // Report duplicate values?
        field = createFieldComposite(composite);
        reportDuplVals = new Button(field, SWT.CHECK);
        reportDuplVals.setSelection( prefs.getBoolean(RBEPreferences.REPORT_DUPL_VALUES, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        new Label(field, SWT.NONE).setText(Messages.prefs_perform_duplVals);
        
        // Report similar values?
        field = createFieldComposite(composite);
        reportSimVals = new Button(field, SWT.CHECK);
        reportSimVals.setSelection(prefs.getBoolean(RBEPreferences.REPORT_SIM_VALUES, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        new Label(field, SWT.NONE).setText(Messages.prefs_perform_simVals);
        reportSimVals.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                refreshEnabledStatuses();
            }
        });
        
        Composite simValModeGroup = new Composite(composite, SWT.NONE);
        GridLayout gridLayout = new GridLayout(2, false);
        gridLayout.marginWidth = indentPixels;
        gridLayout.marginHeight = 0;
        gridLayout.verticalSpacing = 0;
        simValModeGroup.setLayout(gridLayout);
        
        // Report similar values: word count
        reportSimValsMode[0] = new Button(simValModeGroup, SWT.RADIO);
        reportSimValsMode[0].setSelection(prefs.getBoolean(RBEPreferences.REPORT_SIM_VALUES_WORD_COMPARE, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        new Label(simValModeGroup, SWT.NONE).setText(Messages.prefs_perform_simVals_wordCount);
        
        // Report similar values: Levensthein
        reportSimValsMode[1] = new Button(simValModeGroup, SWT.RADIO);
        reportSimValsMode[1].setSelection(prefs.getBoolean(RBEPreferences.REPORT_SIM_VALUES_LEVENSTHEIN, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        new Label(simValModeGroup, SWT.NONE).setText(Messages.prefs_perform_simVals_levensthein);
        
        // Report similar values: precision level
        field = createFieldComposite(composite, indentPixels);
        new Label(field, SWT.NONE).setText(Messages.prefs_perform_simVals_precision);
        reportSimPrecision = new Text(field, SWT.BORDER);
        reportSimPrecision.setText(Double.toString(prefs.getDouble(RBEPreferences.REPORT_SIM_VALUES_PRECISION, IPreferenceStore.DOUBLE_DEFAULT_DEFAULT)));
        reportSimPrecision.setTextLimit(6);
        setWidthInChars(reportSimPrecision, 6);
        reportSimPrecision.addKeyListener(new DoubleTextValidatorKeyListener(
                Messages.prefs_perform_simVals_precision_error,0, 1));
        
        refreshEnabledStatuses();
        
        return composite;
    }


    /**
     * @see org.eclipse.jface.preference.IPreferencePage#performOk()
     */
    public boolean performOk() {
  	  	IEclipsePreferences prefs = RBEPreferences.getEclipsePreferenceStore();
        prefs.putBoolean(RBEPreferences.REPORT_MISSING_VALUES,
                reportMissingVals.getSelection());
        prefs.putBoolean(RBEPreferences.REPORT_DUPL_VALUES,
                reportDuplVals.getSelection());
        prefs.putBoolean(RBEPreferences.REPORT_SIM_VALUES,
                reportSimVals.getSelection());
        prefs.putBoolean(RBEPreferences.REPORT_SIM_VALUES_WORD_COMPARE,
                reportSimValsMode[0].getSelection());
        prefs.putBoolean(RBEPreferences.REPORT_SIM_VALUES_LEVENSTHEIN,
                reportSimValsMode[1].getSelection());
        prefs.putDouble(RBEPreferences.REPORT_SIM_VALUES_PRECISION,
                Double.parseDouble(reportSimPrecision.getText()));
        refreshEnabledStatuses();
        return super.performOk();
    }
    
    
    /**
     * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
     */
    protected void performDefaults() {
  	  	IEclipsePreferences prefs = RBEPreferences.getEclipsePreferenceStore();
        reportMissingVals.setSelection(prefs.getBoolean(RBEPreferences.REPORT_MISSING_VALUES, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        reportDuplVals.setSelection(prefs.getBoolean(RBEPreferences.REPORT_DUPL_VALUES, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        reportSimVals.setSelection(prefs.getBoolean(RBEPreferences.REPORT_SIM_VALUES, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        reportSimValsMode[0].setSelection(prefs.getBoolean(RBEPreferences.REPORT_SIM_VALUES_WORD_COMPARE, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        reportSimValsMode[1].setSelection(prefs.getBoolean(RBEPreferences.REPORT_SIM_VALUES_LEVENSTHEIN, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
        reportSimPrecision.setText(Double.toString(prefs.getDouble(RBEPreferences.REPORT_SIM_VALUES_PRECISION, IPreferenceStore.DOUBLE_DEFAULT_DEFAULT)));
        refreshEnabledStatuses();
        super.performDefaults();
    }

    /*default*/ void refreshEnabledStatuses() {
        boolean isReportingSimilar = reportSimVals.getSelection();

        for (int i = 0; i < reportSimValsMode.length; i++) {
            reportSimValsMode[i].setEnabled(isReportingSimilar);
        }
        reportSimPrecision.setEnabled(isReportingSimilar);
    }
    
}
