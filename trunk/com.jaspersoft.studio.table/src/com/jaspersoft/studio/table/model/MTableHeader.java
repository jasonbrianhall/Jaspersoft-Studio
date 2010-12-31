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
package com.jaspersoft.studio.table.model;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.components.table.BaseColumn;
import net.sf.jasperreports.components.table.StandardBaseColumn;
import net.sf.jasperreports.components.table.StandardColumnGroup;
import net.sf.jasperreports.components.table.StandardTable;
import net.sf.jasperreports.engine.design.JRDesignComponentElement;
import net.sf.jasperreports.engine.design.JRDesignElementGroup;
import net.sf.jasperreports.engine.design.events.CollectionElementAddedEvent;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.util.IIconDescriptor;
import com.jaspersoft.studio.table.TableComponentFactory;
import com.jaspersoft.studio.table.TableManager;
import com.jaspersoft.studio.table.TableNodeIconDescriptor;
import com.jaspersoft.studio.table.util.TableColumnNumerator;

public class MTableHeader extends AMCollection {

	/** The icon descriptor. */
	private static IIconDescriptor iconDescriptor;

	/**
	 * Gets the icon descriptor.
	 * 
	 * @return the icon descriptor
	 */
	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new TableNodeIconDescriptor("tableheader"); //$NON-NLS-1$
		return iconDescriptor;
	}

	/** The descriptors. */
	protected static IPropertyDescriptor[] descriptors;

	public MTableHeader(ANode parent, JRDesignComponentElement jrDataset, String property) {
		super(parent, jrDataset, property);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getDisplayText()
	 */
	public String getDisplayText() {
		return getIconDescriptor().getTitle();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getImagePath()
	 */
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}

	@Override
	public String getCellEvent() {
		return StandardBaseColumn.PROPERTY_TABLE_HEADER;
	}

	@Override
	public void propertyChange(final PropertyChangeEvent evt) {
		// because MTableDetail do not contains ColumnGroups, TableHeader will listen for events and manage nodes
		if (evt.getPropertyName().equals(StandardTable.PROPERTY_COLUMNS)) {
			if (evt.getSource() instanceof StandardColumnGroup) {
				MTable mTable = (MTable) getParent();
				if (evt.getOldValue() == null && evt.getNewValue() != null) {
					int newIndex = -1;
					if (evt instanceof CollectionElementAddedEvent) {
						newIndex = ((CollectionElementAddedEvent) evt).getAddedIndex();
					}
					StandardBaseColumn bc = (StandardBaseColumn) evt.getNewValue();
					for (INode n : getParent().getChildren()) {
						if (n instanceof MTableDetail) {
							boolean columnexists = false;
							for (INode cn : n.getChildren()) {
								if (cn.getValue() == bc) {
									columnexists = true;
									break;
								}
							}
							if (!columnexists) {
								newIndex = TableManager.getAllColumns(mTable).indexOf(bc);
								newIndex = TableComponentFactory.createCellDetail((ANode) n, bc, 11, newIndex);
							}
							break;
						}
					}
				} else if (evt.getOldValue() != null && evt.getNewValue() == null) {
					for (INode n : getParent().getChildren()) {
						if (n instanceof MTableDetail) {
							List<INode> delnodes = new ArrayList<INode>();
							List<BaseColumn> columns = TableManager.getAllColumns(mTable);
							for (INode node : n.getChildren())
								if (!columns.contains((node.getValue())))
									delnodes.add(node);
							// ((MTableDetail) n).removeChildren(delnodes);
							for (INode node : delnodes) {
								int index = ((ANode) n).getChildren().indexOf(node);
								((ANode) n).removeChild((ANode) node);
								n.getPropertyChangeSupport().fireIndexedPropertyChange(JRDesignElementGroup.PROPERTY_CHILDREN, index,
										node, null);
							}
							break;
						}
					}
				} else {
					for (INode n : getParent().getChildren()) {
						if (n instanceof MTableDetail) {
							for (INode node : n.getChildren())
								if (node.getValue() == evt.getOldValue()) {
									((ANode) n).setValue(evt.getNewValue());
									break;
								}
							break;
						}
					}
				}

				mTable.getTableManager().refresh();
				TableColumnNumerator.renumerateColumnNames(mTable);
			}
		}
		super.propertyChange(evt);
	}

	@Override
	public void createColumn(ANode mth, BaseColumn bc, int i, int index) {
		TableComponentFactory.createCellTableHeader(mth, bc, i, index);
	}

}