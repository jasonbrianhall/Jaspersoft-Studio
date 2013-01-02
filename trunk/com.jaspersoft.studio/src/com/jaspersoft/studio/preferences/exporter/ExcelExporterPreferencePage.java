/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, 
 * the following license terms apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.preferences.exporter;

import net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter;
import net.sf.jasperreports.engine.type.RunDirectionEnum;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.preferences.editor.number.FloatFieldEditor;
import com.jaspersoft.studio.preferences.editor.text.NStringFieldEditor;
import com.jaspersoft.studio.preferences.editor.text.TextFieldEditor;
import com.jaspersoft.studio.preferences.util.FieldEditorOverlayPage;
import com.jaspersoft.studio.preferences.util.PropertiesHelper;
import com.jaspersoft.studio.utils.Misc;

/*
 * 
 */
public class ExcelExporterPreferencePage extends FieldEditorOverlayPage {
	// jexcelapi
	public static final String NSF_EXPORT_XLS_USE_TMP_FILE = "net.sf.jasperreports.export.xls.use.temp.file"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_USE_TIMEZONE = "net.sf.jasperreports.export.xls.use.timezone"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_CELL_COMPLEX_FORMAT = "net.sf.jasperreports.export.xls.cell.complex.format"; //$NON-NLS-1$

	// sheet
	public static final String NSF_EXPORT_XLS_SHEET_DIRECTION = "net.sf.jasperreports.export.xls.sheet.direction"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_SHEET_FOOTER_CENTER = "net.sf.jasperreports.export.xls.sheet.footer.center"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_SHEET_FOOTER_LEFT = "net.sf.jasperreports.export.xls.sheet.footer.left"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_SHEET_FOOTER_RIGHT = "net.sf.jasperreports.export.xls.sheet.footer.right"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_SHEET_HEADER_CENTER = "net.sf.jasperreports.export.xls.sheet.header.center"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_SHEET_HEADER_LEFT = "net.sf.jasperreports.export.xls.sheet.header.left"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_SHEET_HEADER_RIGHT = "net.sf.jasperreports.export.xls.sheet.header.right"; //$NON-NLS-1$

	public static final String NSF_EXPORT_XLS_FIT_HEIGHT = "net.sf.jasperreports.export.xls.fit.height"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_FIT_WIDTH = "net.sf.jasperreports.export.xls.fit.width"; //$NON-NLS-1$

	// cell
	public static final String NSF_EXPORT_XLS_CELL_HIDDEN = "net.sf.jasperreports.export.xls.cell.hidden"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_CELL_LOCKED = "net.sf.jasperreports.export.xls.cell.locked"; //$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_CELL_WRAP_TEXT = "net.sf.jasperreports.export.xls.wrap.text"; //$NON-NLS-1$

	public static final String NSF_EXPORT_XLS_AUTO_FILTER = "net.sf.jasperreports.export.xls.auto.filter";//$NON-NLS-1$

	public static final String NSF_EXPORT_XLS_FREEZ_ROW = "net.sf.jasperreports.export.xls.freeze.row";//$NON-NLS-1$
	public static final String NSF_EXPORT_XLS_FREEZ_COLUMN = "net.sf.jasperreports.export.xls.freeze.column";//$NON-NLS-1$

	public static final String NSF_EXPORT_XLS_COLUMN_WIDTH_RATIO = "net.sf.jasperreports.export.xls.column.width.ratio";//$NON-NLS-1$

	public ExcelExporterPreferencePage() {
		super(GRID);
		setPreferenceStore(JaspersoftStudioPlugin.getInstance().getPreferenceStore());
		setDescription(Messages.ExcelExporterPreferencePage_title);
	}

	/**
	 *
	 */
	public void createFieldEditors() {
		CTabFolder tabFolder = new CTabFolder(getFieldEditorParent(), SWT.TOP);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));

		createTabCommons(tabFolder);
		createSheet(tabFolder);
		createTabCells(tabFolder);
		createJExcelAPI(tabFolder);

		tabFolder.setSelection(0);
	}

	private void createTabCommons(CTabFolder tabFolder) {
		CTabItem ptab = new CTabItem(tabFolder, SWT.NONE);
		ptab.setText(Messages.ExcelExporterPreferencePage_29);

		Composite sc = new Composite(tabFolder, SWT.NONE);

		addField(new BooleanFieldEditor(NSF_EXPORT_XLS_USE_TIMEZONE, "Use Report Time Zone", sc));

		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_WHITE_PAGE_BACKGROUND,
				Messages.ExcelExporterPreferencePage_30, sc));

		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_COLLAPSE_ROW_SPAN,
				Messages.ExcelExporterPreferencePage_31, sc));
		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,
				Messages.ExcelExporterPreferencePage_32, sc));
		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS,
				Messages.ExcelExporterPreferencePage_33, sc));

		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_GRAPHICS,
				Messages.ExcelExporterPreferencePage_34, sc));
		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_IMAGE_BORDER_FIX_ENABLED,
				Messages.ExcelExporterPreferencePage_35, sc));

		StringFieldEditor se = new StringFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_PASSWORD,
				Messages.ExcelExporterPreferencePage_36, sc);
		((Text) se.getTextControl(sc)).setEchoChar('*');
		addField(se);

		addField(new ComboFieldEditor(NSF_EXPORT_XLS_AUTO_FILTER, "Auto Filter", new String[][] { { "", "" },
				{ "Start", "Start" }, { "Stop", "Stop" } }, sc));

		IntegerFieldEditor iedit = new IntegerFieldEditor(NSF_EXPORT_XLS_FREEZ_ROW, "Freez On Row", sc);
		iedit.setValidRange(0, 65536);
		addField(iedit);

		addField(new NStringFieldEditor(NSF_EXPORT_XLS_FREEZ_COLUMN, "Freez On Column (A, AB, etc.)", sc));

		FloatFieldEditor fedit = new FloatFieldEditor(NSF_EXPORT_XLS_COLUMN_WIDTH_RATIO, "Column Freez Ratio", sc);
		fedit.setValidRange(0f, Float.MAX_VALUE);
		addField(fedit);

		ptab.setControl(sc);
	}

	private void createSheet(CTabFolder tabFolder) {
		CTabItem ptab = new CTabItem(tabFolder, SWT.NONE);
		ptab.setText(Messages.ExcelExporterPreferencePage_37);

		Composite sc = new Composite(tabFolder, SWT.NONE);
		sc.setLayout(new GridLayout());

		CTabFolder tFolder = new CTabFolder(sc, SWT.TOP);
		tFolder.setLayoutData(new GridData(GridData.FILL_BOTH));

		CTabItem cTab = new CTabItem(tFolder, SWT.NONE);
		cTab.setText(Messages.ExcelExporterPreferencePage_38);

		Composite parent = new Composite(tFolder, SWT.NONE);
		sc.setLayout(new GridLayout(2, false));

		addField(new ComboFieldEditor(NSF_EXPORT_XLS_SHEET_DIRECTION, Messages.ExcelExporterPreferencePage_39,
				new String[][] { { RunDirectionEnum.LTR.getName(), RunDirectionEnum.LTR.getName() },
						{ RunDirectionEnum.RTL.getName(), RunDirectionEnum.RTL.getName() } }, parent));
		IntegerFieldEditor iedit = new IntegerFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_MAXIMUM_ROWS_PER_SHEET,
				Messages.ExcelExporterPreferencePage_40, parent);
		iedit.setValidRange(0, Integer.MAX_VALUE);
		addField(iedit);
		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_ONE_PAGE_PER_SHEET,
				Messages.ExcelExporterPreferencePage_41, parent));

		iedit = new IntegerFieldEditor(NSF_EXPORT_XLS_FIT_HEIGHT, Messages.ExcelExporterPreferencePage_42, parent);
		iedit.setValidRange(0, Integer.MAX_VALUE);
		addField(iedit);

		iedit = new IntegerFieldEditor(NSF_EXPORT_XLS_FIT_WIDTH, Messages.ExcelExporterPreferencePage_43, parent);
		iedit.setValidRange(0, Integer.MAX_VALUE);
		addField(iedit);

		cTab.setControl(parent);

		cTab = new CTabItem(tFolder, SWT.NONE);
		cTab.setText(Messages.ExcelExporterPreferencePage_44);

		parent = new Composite(tFolder, SWT.NONE);
		sc.setLayout(new GridLayout(2, false));

		addField(new TextFieldEditor(NSF_EXPORT_XLS_SHEET_HEADER_LEFT, Messages.ExcelExporterPreferencePage_45, parent));
		addField(new TextFieldEditor(NSF_EXPORT_XLS_SHEET_HEADER_CENTER, Messages.ExcelExporterPreferencePage_46, parent));
		addField(new TextFieldEditor(NSF_EXPORT_XLS_SHEET_HEADER_RIGHT, Messages.ExcelExporterPreferencePage_47, parent));

		cTab.setControl(parent);

		cTab = new CTabItem(tFolder, SWT.NONE);
		cTab.setText(Messages.ExcelExporterPreferencePage_48);

		parent = new Composite(tFolder, SWT.NONE);
		sc.setLayout(new GridLayout(2, false));

		addField(new TextFieldEditor(NSF_EXPORT_XLS_SHEET_FOOTER_LEFT, Messages.ExcelExporterPreferencePage_49, parent));
		addField(new TextFieldEditor(NSF_EXPORT_XLS_SHEET_FOOTER_CENTER, Messages.ExcelExporterPreferencePage_50, parent));
		addField(new TextFieldEditor(NSF_EXPORT_XLS_SHEET_FOOTER_RIGHT, Messages.ExcelExporterPreferencePage_51, parent));

		cTab.setControl(parent);
		tFolder.setSelection(0);

		ptab.setControl(sc);
	}

	private void createTabCells(CTabFolder tabFolder) {
		CTabItem ptab = new CTabItem(tabFolder, SWT.NONE);
		ptab.setText(Messages.ExcelExporterPreferencePage_52);

		Composite sc = new Composite(tabFolder, SWT.NONE);

		addField(new BooleanFieldEditor(NSF_EXPORT_XLS_CELL_HIDDEN, Messages.ExcelExporterPreferencePage_53, sc));
		addField(new BooleanFieldEditor(NSF_EXPORT_XLS_CELL_LOCKED, Messages.ExcelExporterPreferencePage_54, sc));
		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_DETECT_CELL_TYPE,
				Messages.ExcelExporterPreferencePage_55, sc));
		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_CELL_BACKGROUND,
				Messages.ExcelExporterPreferencePage_56, sc));
		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_CELL_BORDER,
				Messages.ExcelExporterPreferencePage_57, sc));
		addField(new BooleanFieldEditor(NSF_EXPORT_XLS_CELL_WRAP_TEXT, Messages.ExcelExporterPreferencePage_58, sc));
		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_FONT_SIZE_FIX_ENABLED,
				Messages.ExcelExporterPreferencePage_59, sc));

		ptab.setControl(sc);
	}

	private void createJExcelAPI(CTabFolder tabFolder) {
		CTabItem ptab = new CTabItem(tabFolder, SWT.NONE);
		ptab.setText(Messages.ExcelExporterPreferencePage_60);

		ScrolledComposite scompo = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scompo.setExpandHorizontal(true);
		scompo.setExpandVertical(true);

		Composite sc = new Composite(scompo, SWT.NONE);
		sc.setLayout(new GridLayout(3, false));

		addField(new BooleanFieldEditor(JRXlsAbstractExporterParameter.PROPERTY_CREATE_CUSTOM_PALETTE,
				Messages.ExcelExporterPreferencePage_61, sc));
		addField(new BooleanFieldEditor(NSF_EXPORT_XLS_USE_TMP_FILE, Messages.ExcelExporterPreferencePage_62, sc));
		addField(new BooleanFieldEditor(NSF_EXPORT_XLS_CELL_COMPLEX_FORMAT, Messages.ExcelExporterPreferencePage_63, sc));

		scompo.setMinSize(sc.getSize());
		scompo.setContent(sc);
		ptab.setControl(scompo);
	}

	public static void getDefaults(IPreferenceStore store) {
		// JEXCELAPI
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_CREATE_CUSTOM_PALETTE,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_CREATE_CUSTOM_PALETTE));
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_PASSWORD,
				Misc.nvl(PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_PASSWORD))); //$NON-NLS-1$
		store.setDefault(NSF_EXPORT_XLS_USE_TMP_FILE, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_USE_TMP_FILE), "")); //$NON-NLS-1$
		store.setDefault(NSF_EXPORT_XLS_USE_TIMEZONE, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_USE_TIMEZONE), "")); //$NON-NLS-1$

		store.setDefault(NSF_EXPORT_XLS_CELL_COMPLEX_FORMAT,
				Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_CELL_COMPLEX_FORMAT))); //$NON-NLS-1$
		// COMMON
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_COLLAPSE_ROW_SPAN,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_COLLAPSE_ROW_SPAN));
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_GRAPHICS,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_GRAPHICS));
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_IMAGE_BORDER_FIX_ENABLED,
				Misc.nvl(PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_IMAGE_BORDER_FIX_ENABLED), "false")); //$NON-NLS-1$
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_ROWS));
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS));
		// page
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_WHITE_PAGE_BACKGROUND,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_WHITE_PAGE_BACKGROUND));
		// sheet
		store.setDefault(NSF_EXPORT_XLS_SHEET_DIRECTION,
				Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_SHEET_DIRECTION), RunDirectionEnum.LTR.getName()));
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_MAXIMUM_ROWS_PER_SHEET,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_MAXIMUM_ROWS_PER_SHEET));
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_ONE_PAGE_PER_SHEET,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_ONE_PAGE_PER_SHEET));

		store.setDefault(NSF_EXPORT_XLS_SHEET_FOOTER_CENTER,
				Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_SHEET_FOOTER_CENTER))); //$NON-NLS-1$
		store.setDefault(NSF_EXPORT_XLS_SHEET_FOOTER_LEFT, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_SHEET_FOOTER_LEFT))); //$NON-NLS-1$
		store.setDefault(NSF_EXPORT_XLS_SHEET_FOOTER_RIGHT, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_SHEET_FOOTER_RIGHT))); //$NON-NLS-1$
		store.setDefault(NSF_EXPORT_XLS_SHEET_HEADER_CENTER,
				Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_SHEET_HEADER_CENTER))); //$NON-NLS-1$
		store.setDefault(NSF_EXPORT_XLS_SHEET_HEADER_LEFT, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_SHEET_HEADER_LEFT))); //$NON-NLS-1$
		store.setDefault(NSF_EXPORT_XLS_SHEET_HEADER_RIGHT, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_SHEET_HEADER_RIGHT))); //$NON-NLS-1$

		store.setDefault(NSF_EXPORT_XLS_FIT_HEIGHT, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_FIT_HEIGHT))); //$NON-NLS-1$
		store.setDefault(NSF_EXPORT_XLS_FIT_WIDTH, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_FIT_WIDTH))); //$NON-NLS-1$
		// CELL
		store.setDefault(NSF_EXPORT_XLS_CELL_HIDDEN, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_CELL_HIDDEN), "false")); //$NON-NLS-1$
		store.setDefault(NSF_EXPORT_XLS_CELL_LOCKED, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_CELL_LOCKED), "false")); //$NON-NLS-1$
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_DETECT_CELL_TYPE,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_DETECT_CELL_TYPE));
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_CELL_BACKGROUND,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_CELL_BACKGROUND));
		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_CELL_BORDER,
				PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_CELL_BORDER));
		store.setDefault(NSF_EXPORT_XLS_CELL_WRAP_TEXT, PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_CELL_WRAP_TEXT));

		store.setDefault(NSF_EXPORT_XLS_AUTO_FILTER, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_AUTO_FILTER)));
		store.setDefault(NSF_EXPORT_XLS_FREEZ_ROW, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_FREEZ_ROW)));
		store.setDefault(NSF_EXPORT_XLS_FREEZ_COLUMN, Misc.nvl(PropertiesHelper.DPROP.getProperty(NSF_EXPORT_XLS_FREEZ_COLUMN)));

		store.setDefault(JRXlsAbstractExporterParameter.PROPERTY_FONT_SIZE_FIX_ENABLED,
				Misc.nvl(PropertiesHelper.DPROP.getProperty(JRXlsAbstractExporterParameter.PROPERTY_FONT_SIZE_FIX_ENABLED), "false")); //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	@Override
	protected String getPageId() {
		return "com.jaspersoft.studio.preferences.exporter.ExcelExporterPreferencePage.property"; //$NON-NLS-1$
	}

}
