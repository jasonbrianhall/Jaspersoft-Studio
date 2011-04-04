/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.preferences.exporter;

import net.sf.jasperreports.engine.util.JRProperties;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.preferences.editor.NStringFieldEditor;

/**
 * 
 */
public class CSVExporterPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String NSF_EXPORT_CSV_RECORD_DELIMITER = "net.sf.jasperreports.export.csv.record.delimiter";
	public static final String NSF_EXPORT_CSV_FIELD_DELIMITER = "net.sf.jasperreports.export.csv.field.delimiter";

	public CSVExporterPreferencePage() {
		super(GRID);
		setPreferenceStore(JaspersoftStudioPlugin.getInstance().getPreferenceStore());
		setDescription("CSV Exporter Parameters");
	}

	/**
	 *
	 */
	public void createFieldEditors() {
		NStringFieldEditor tf = new NStringFieldEditor(NSF_EXPORT_CSV_RECORD_DELIMITER, "Record Delimiter", 4,
				getFieldEditorParent());
		tf.setEmptyStringAllowed(false);
		tf.setTextLimit(10);
		addField(tf);

		NStringFieldEditor fd = new NStringFieldEditor(NSF_EXPORT_CSV_FIELD_DELIMITER, "Field Delimiter", 4,
				getFieldEditorParent());
		fd.setEmptyStringAllowed(false);
		fd.setTextLimit(10);
		addField(fd);

		Browser lbl = new Browser(getFieldEditorParent(), SWT.MULTI);
		lbl.setText("<html><body style='font-size: 11px;'> <div style='font-size: 14px;'>Special characters:</div>  <b>\\n</b> for new line (Unix/MacOS)<br>  <b>\\n\\r</b> for newline (Windows)<br>  <b>\\r</b> for carriage return<br>  <b>\\t</b> for tab<br>  <b>\\\\</b> for backslash</body></html>");

		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 2;
		lbl.setLayoutData(gd);

	}

	public static void getDefaults(IPreferenceStore store) {
		store.setDefault(NSF_EXPORT_CSV_RECORD_DELIMITER, JRProperties.getProperty(NSF_EXPORT_CSV_RECORD_DELIMITER));
		store.setDefault(NSF_EXPORT_CSV_FIELD_DELIMITER, JRProperties.getProperty(NSF_EXPORT_CSV_FIELD_DELIMITER));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}