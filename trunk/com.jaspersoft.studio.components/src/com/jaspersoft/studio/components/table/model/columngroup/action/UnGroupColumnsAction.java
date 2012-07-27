/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2012 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.components.table.model.columngroup.action;

import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.components.Activator;
import com.jaspersoft.studio.components.table.model.AMCollection;
import com.jaspersoft.studio.components.table.model.column.MColumn;
import com.jaspersoft.studio.components.table.model.column.command.DeleteColumnCommand;
import com.jaspersoft.studio.components.table.model.column.command.DeleteColumnFromGroupCommand;
import com.jaspersoft.studio.components.table.model.column.command.FixCellHeightsCommand;
import com.jaspersoft.studio.components.table.model.column.command.MoveColumnCommand;
import com.jaspersoft.studio.components.table.model.columngroup.MColumnGroup;
import com.jaspersoft.studio.components.table.model.columngroup.MColumnGroupCell;
import com.jaspersoft.studio.components.table.part.TableCellEditPart;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;

public class UnGroupColumnsAction extends SelectionAction {

	/** The Constant ID. */
	public static final String ID = "ungroup_table_columns"; //$NON-NLS-1$

	/**
	 * Constructs a <code>CreateAction</code> using the specified part.
	 * 
	 * @param part
	 *            The part for this action
	 */
	public UnGroupColumnsAction(IWorkbenchPart part) {
		super(part);
	}

	/**
	 * Initializes this action's text and images.
	 */
	@Override
	protected void init() {
		super.init();
		setText("Ungroup Columns");
		setToolTipText("Ungroup columns");
		setId(UnGroupColumnsAction.ID);
		setImageDescriptor(Activator
				.getImageDescriptor("icons/table-split-row.png"));
		setDisabledImageDescriptor(Activator
				.getImageDescriptor("icons/table-split-row.png"));
		setEnabled(false);
	}

	public Command createCommand(List<?> objects) {
		if (objects.isEmpty())
			return null;
		if (objects.size() == 1) {
			Object sel = objects.get(0);
			if (sel instanceof TableCellEditPart)
				sel = ((TableCellEditPart) sel).getModel();
			if (sel instanceof MColumn) {
				CompoundCommand c = new CompoundCommand("Ungroup Columns");

				MColumn fmc = (MColumn) sel;
				ANode mparent = fmc.getParent();

				for (INode src : fmc.getChildren()) {
					if (mparent instanceof MColumnGroup
							|| mparent instanceof MColumnGroupCell)
						c.add(new MoveColumnCommand((MColumn) src,
								(MColumn) mparent, false));
					else
						c.add(new MoveColumnCommand((MColumn) src, null, false));
				}

				if (mparent instanceof MColumnGroup)
					c.add(new DeleteColumnFromGroupCommand(
							(MColumnGroup) mparent, fmc));
				else if (mparent instanceof MColumnGroupCell)
					c.add(new DeleteColumnFromGroupCommand(
							(MColumnGroupCell) mparent, fmc));
				else if (mparent instanceof AMCollection)
					c.add(new DeleteColumnCommand((AMCollection) mparent, fmc));

				c.add(new FixCellHeightsCommand(fmc));
				return c;
			}
		}
		return null;
	}

	@Override
	public void run() {
		execute(createCommand(getSelectedObjects()));
	}

	@Override
	protected boolean calculateEnabled() {
		List<?> objects = getSelectedObjects();
		if (objects != null && objects.size() == 1) {
			Object sel = objects.get(0);
			if (sel instanceof TableCellEditPart)
				sel = ((TableCellEditPart) sel).getModel();
			return objects.get(0) instanceof MColumnGroup
					|| sel instanceof MColumnGroupCell;
		}
		return false;
	}
}
