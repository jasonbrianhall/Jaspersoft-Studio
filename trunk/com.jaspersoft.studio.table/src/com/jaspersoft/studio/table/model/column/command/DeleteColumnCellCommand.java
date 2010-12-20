/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of iReport.
 * 
 * iReport is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * iReport is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with iReport. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.table.model.column.command;

import net.sf.jasperreports.components.table.Cell;
import net.sf.jasperreports.components.table.DesignCell;
import net.sf.jasperreports.components.table.StandardBaseColumn;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.table.model.MTableColumnFooter;
import com.jaspersoft.studio.table.model.MTableColumnHeader;
import com.jaspersoft.studio.table.model.MTableFooter;
import com.jaspersoft.studio.table.model.MTableGroupFooter;
import com.jaspersoft.studio.table.model.MTableGroupHeader;
import com.jaspersoft.studio.table.model.MTableHeader;
import com.jaspersoft.studio.table.model.column.MColumn;
import com.jaspersoft.studio.table.model.columngroup.MColumnGroup;
import com.jaspersoft.studio.table.model.columngroup.MColumnGroupCell;

/**
 * link nodes & together.
 * 
 * @author Chicu Veaceslav
 */
public class DeleteColumnCellCommand extends Command {

	private StandardBaseColumn jrColumn;
	private Class<?> type;
	private String groupName;
	private Cell jrCell;

	public DeleteColumnCellCommand(ANode parent, MColumn srcNode) {
		super();
		if (parent instanceof MColumnGroup)
			type = ((MColumnGroup) parent).getSection().getClass();
		else if (parent instanceof MColumnGroupCell)
			type = ((MColumnGroupCell) parent).getSection().getClass();
		else
			type = (Class<ANode>) parent.getClass();

		if (parent instanceof MTableGroupHeader)
			groupName = ((MTableGroupHeader) parent).getJrDesignGroup().getName();
		if (parent instanceof MTableGroupFooter)
			groupName = ((MTableGroupFooter) parent).getJrDesignGroup().getName();
		this.jrColumn = (StandardBaseColumn) srcNode.getValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		if (type.isAssignableFrom(MTableHeader.class)) {
			jrCell = jrColumn.getTableHeader();
			jrColumn.setTableHeader(null);
		} else if (type.isAssignableFrom(MTableFooter.class)) {
			jrCell = jrColumn.getTableFooter();
			jrColumn.setTableFooter(null);
		} else if (type.isAssignableFrom(MTableColumnHeader.class)) {
			jrCell = jrColumn.getColumnHeader();
			jrColumn.setColumnHeader(null);
		} else if (type.isAssignableFrom(MTableColumnFooter.class)) {
			jrCell = jrColumn.getColumnFooter();
			jrColumn.setColumnFooter(null);

		} else if (type.isAssignableFrom(MTableGroupHeader.class)) {
			jrCell = jrColumn.getGroupHeader(groupName);
			jrColumn.setGroupHeader(groupName, null);
		} else if (type.isAssignableFrom(MTableGroupFooter.class)) {
			jrCell = jrColumn.getGroupFooter(groupName);
			jrColumn.setGroupFooter(groupName, null);
		}
	}

	protected Cell createCell() {
		DesignCell cell = new DesignCell();
		cell.setHeight(10);
		return cell;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		if (type.isAssignableFrom(MTableHeader.class))
			jrColumn.setTableHeader(jrCell);
		else if (type.isAssignableFrom(MTableFooter.class))
			jrColumn.setTableFooter(jrCell);
		else if (type.isAssignableFrom(MTableColumnHeader.class))
			jrColumn.setColumnHeader(jrCell);
		else if (type.isAssignableFrom(MTableColumnFooter.class))
			jrColumn.setColumnFooter(jrCell);

		else if (type.isAssignableFrom(MTableGroupHeader.class))
			jrColumn.setGroupHeader(groupName, jrCell);
		else if (type.isAssignableFrom(MTableGroupFooter.class))
			jrColumn.setGroupFooter(groupName, jrCell);
	}
}
