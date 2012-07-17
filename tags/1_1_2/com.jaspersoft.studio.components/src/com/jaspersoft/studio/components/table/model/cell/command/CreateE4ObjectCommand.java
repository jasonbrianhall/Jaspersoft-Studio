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

package com.jaspersoft.studio.components.table.model.cell.command;

import net.sf.jasperreports.components.table.util.TableUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JRDesignVariable;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.type.ResetTypeEnum;

import org.eclipse.draw2d.geometry.Rectangle;

import com.jaspersoft.studio.components.table.model.column.MCell;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.command.Tag;

public class CreateE4ObjectCommand extends CreateElementCommand {
	protected ANode child;
	protected ANode parent;
	protected JasperDesign jDesign;

	public CreateE4ObjectCommand(ANode child, MCell parent, Rectangle location,
			int index) {
		super(parent, null, location, index);
		jDesign = parent.getJasperDesign();
		this.child = child;
		this.parent = parent;
	}

	@Override
	protected void createObject() {
		try {
			MCell mparent = (MCell) parent;
			Tag tag = Tag.getExpression(child);
			switch (mparent.getType()) {
			case TableUtil.COLUMN_HEADER:
			case TableUtil.COLUMN_FOOTER:
				var = Tag.createVariable(tag, ResetTypeEnum.COLUMN, null,
						jDesign);
				srcNode = Tag.createTextField(
						tag.txt.replaceAll("%", tag.name), tag.classname);
				break;
			case TableUtil.COLUMN_GROUP_HEADER:
				var = Tag.createVariable(tag, ResetTypeEnum.GROUP,
						mparent.getJrGroup(), jDesign);
				srcNode = Tag.createTextField(
						tag.txt.replaceAll("%", tag.name), tag.classname);
				break;
			case TableUtil.COLUMN_GROUP_FOOTER:
				var = Tag.createVariable(tag, ResetTypeEnum.GROUP,
						mparent.getJrGroup(), jDesign);
				srcNode = Tag.createTextField(
						tag.txt.replaceAll("%", tag.name), tag.classname);
				break;
			case TableUtil.COLUMN_DETAIL:
				srcNode = Tag.createTextField(
						tag.txt.replaceAll("%", tag.name), tag.classname);
				break;
			case TableUtil.TABLE_FOOTER:
			case TableUtil.TABLE_HEADER:
				var = Tag.createVariable(tag, ResetTypeEnum.REPORT, null,
						jDesign);
				srcNode = Tag.createTextField(
						tag.txt.replaceAll("%", tag.name), tag.classname);
				break;
			default:
				srcNode = Tag.createStaticText(tag.name);
			}
			jrElement = srcNode.getValue();
			super.createObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JRDesignVariable var;

	@Override
	public void execute() {
		super.execute();
		try {
			if (var != null)
				jDesign.addVariable((JRDesignVariable) var);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void undo() {
		super.undo();
		if (var != null)
			jDesign.removeVariable(var);
	}
}
