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
package com.jaspersoft.studio.components.crosstab.model.header;

import net.sf.jasperreports.crosstabs.JRCellContents;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;

import com.jaspersoft.studio.components.crosstab.messages.Messages;
import com.jaspersoft.studio.components.crosstab.model.cell.MCell;
import com.jaspersoft.studio.model.ANode;

public class MCrosstabHeaderCell extends MCell {
	public MCrosstabHeaderCell() {
		super();
	}

	public MCrosstabHeaderCell(ANode parent, JRCellContents jfRield, int index) {
		super(parent, jfRield, Messages.MCrosstabHeaderCell_crosstab_header, index);
	}

	@Override
	public Color getForeground() {
		if (getValue() == null)
			return ColorConstants.lightGray;
		return ColorConstants.black;
	}

}
