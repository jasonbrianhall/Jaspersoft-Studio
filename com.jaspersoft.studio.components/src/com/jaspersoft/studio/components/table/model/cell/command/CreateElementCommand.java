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
package com.jaspersoft.studio.components.table.model.cell.command;

import java.util.Map;

import net.sf.jasperreports.components.table.DesignCell;
import net.sf.jasperreports.components.table.StandardBaseColumn;
import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRPropertiesHolder;
import net.sf.jasperreports.engine.design.JRDesignComponentElement;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.components.table.model.MTable;
import com.jaspersoft.studio.components.table.model.column.MCell;
import com.jaspersoft.studio.model.MGraphicElement;
import com.jaspersoft.studio.utils.SelectionHelper;

public class CreateElementCommand extends Command {
	protected MGraphicElement srcNode;
	protected JRDesignElement jrElement;
	private StandardBaseColumn jrColumn;
	private JRDesignComponentElement jTable;
	private JasperDesign jDesign;
	private DesignCell jrCell;

	private Rectangle location;

	protected int index = -1;

	/**
	 * Instantiates a new creates the element command.
	 * 
	 * @param destNode
	 *            the dest node
	 * @param srcNode
	 *            the src node
	 * @param index
	 *            the index
	 */
	public CreateElementCommand(MCell destNode, MGraphicElement srcNode,
			Rectangle position, int index) {
		super();
		if (srcNode != null)
			this.jrElement = (JRDesignElement) srcNode.getValue();
		this.jrCell = destNode.getCell();
		this.index = index;
		this.location = position;
		this.srcNode = srcNode;
		this.jrColumn = (StandardBaseColumn) destNode.getValue();
		MTable mTable = destNode.getMTable();
		jTable = (JRDesignComponentElement) mTable.getValue();
		jDesign = destNode.getJasperDesign();
	}

	/**
	 * Creates the object.
	 */
	protected void createObject() {
		if (jrElement == null) {
			jrElement = srcNode.createJRElement(srcNode.getJasperDesign());
		}
		if (jrElement != null) {
			if (location == null)
				location = new Rectangle(0, 0, Math.min(
						srcNode.getDefaultWidth(), jrColumn.getWidth()
								- location.x), Math.min(
						srcNode.getDefaultHeight(), jrCell.getHeight()
								- location.y));
			if (location.width < 0)
				location.width = srcNode.getDefaultWidth();
			if (location.height < 0)
				location.height = srcNode.getDefaultHeight();

		}

		jrElement.setX(location.x);
		jrElement.setY(location.y);
		jrElement.setWidth(location.width);
		jrElement.setHeight(location.height);
	}

	private Map<JRElement, Rectangle> map;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		createObject();
		if (jrElement != null) {
			if (index >= 0 && index <= jrCell.getChildren().size())
				jrCell.addElement(index, jrElement);
			else
				jrCell.addElement(jrElement);
		}
		if (firstTime) {
			SelectionHelper.setSelection(jrElement, false);
			firstTime = false;
		}

		map = com.jaspersoft.studio.model.command.CreateElementCommand
				.layoutContainer(new JRPropertiesHolder[] { jrCell, jrColumn,
						jTable }, jrCell.getElements(),
						new Dimension(jrColumn.getWidth(), jrCell.getHeight()),
						jDesign, null);
	}

	private boolean firstTime = true;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		if (jrCell == null || jrElement == null)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		com.jaspersoft.studio.model.command.CreateElementCommand
				.undoElementsSize(map);
		jrCell.removeElement(jrElement);
	}

}
