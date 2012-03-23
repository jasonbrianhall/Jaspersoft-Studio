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

package com.jaspersoft.studio.preferences.editor.table;

import org.eclipse.jface.viewers.ArrayContentProvider;

import com.jaspersoft.studio.preferences.editor.sorttable.model.ITableContentProvider;

public class TableContentProvider extends ArrayContentProvider implements ITableContentProvider {

	public Object getColumnValue(Object element, int columnIndex) {

		switch (columnIndex) {
		case 0: {
			return "BCDa";
		}
		case 1: {
			return "ABCD";
		}

		default: {
			return (element != null ? element.toString() : "");
		}
		}
	}
}
