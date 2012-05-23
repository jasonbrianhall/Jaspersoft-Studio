/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2011 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of JasperReports.
 * 
 * JasperReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * JasperReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with JasperReports. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.components.table.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.jaspersoft.studio.components.table.messages.messages"; //$NON-NLS-1$
	public static String common_column;
	public static String common_columns;
	public static String common_orphan_child;
	public static String common_orphan_element;
	public static String common_reorder_elements;
	public static String common_table_wizard;
	public static String CreateColumnAction_create_column;
	public static String CreateColumnAction_create_column_group;
	public static String CreateColumnAction_create_column_group_tool_tip;
	public static String CreateColumnAction_create_column_tool_tip;
	public static String CreateColumnCellAction_create_column;
	public static String CreateColumnCellAction_create_column_tool_tip;
	public static String MCell_cell_properties_category;
	public static String MCell_height;
	public static String MCell_line_box;
	public static String MCell_line_box_description;
	public static String MCell_parent_style;
	public static String MCell_parent_style_description;
	public static String MCell_rowspan;
	public static String MColumn_column_properties_category;
	public static String MColumn_column_width;
	public static String MColumn_print_when_expression;
	public static String MColumn_print_when_expression_description;
	public static String MTable_dataset_run;
	public static String MTable_dataset_run_description;
	public static String MTable_table_properties_category;
	public static String MTable_whennodatadescription;
	public static String MTable_whennodatalabel;
	public static String MTableGroupFooter_group_footer;
	public static String MTableGroupHeader_group_header;
	public static String ReorderColumnCommand_reorder_columns;
	public static String ReorderColumnGroupCommand_reorder_column_group;
	public static String TableEditor_table;
	public static String TableWizardLayoutPage_add_column_footer;
	public static String TableWizardLayoutPage_add_column_header;
	public static String TableWizardLayoutPage_add_group_footer;
	public static String TableWizardLayoutPage_add_group_header;
	public static String TableWizardLayoutPage_add_table_footer;
	public static String TableWizardLayoutPage_add_table_header;
	public static String TableWizardLayoutPage_description;
	public static String TableWizardLayoutPage_layout;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
