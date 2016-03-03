/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.components.table.model.column.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.components.table.model.column.MColumn;

import net.sf.jasperreports.components.table.BaseColumn;
import net.sf.jasperreports.components.table.StandardBaseColumn;
import net.sf.jasperreports.components.table.StandardColumnGroup;
import net.sf.jasperreports.components.table.StandardTable;

/**
 * Set the width of a table column, it will adjust parent and children of the columns
 * to fit the enw column width
 * 
 * @author Orlandin Marco
 *
 */
public class SetColumnWidthCommand extends Command {
	
	/**
	 * Static empty array used in some cases instead to istantiate an empty one
	 */
	private final static ArrayList<BaseColumn> EMPTY_ARRAY = new ArrayList<BaseColumn>();
	
	/**
	 * The table in which the column is placed
	 */
	private StandardTable table;
	
	/**
	 * The column to resize
	 */
	private BaseColumn column;
	
	/**
	 * The new width of the column
	 */
	private int newWidth;
	
	/**
	 * Map of every column resized in the execute of the command, with their original widths,
	 * used on the undo
	 */
	private HashMap<StandardBaseColumn, Integer> undoWidths = new HashMap<StandardBaseColumn, Integer>();
	
	/**
	 * Create the command
	 * 
	 * @param column the model of the column to resize
	 * @param newWidth the new width of the column
	 */
	public SetColumnWidthCommand(MColumn column, int newWidth){
		this.newWidth = newWidth;
		this.column = column.getValue();
		this.table = column.getTable().getStandardTable();
	}
	
	/**
	 * Set the width of the cloumn
	 */
	protected void setWidth() {
		int delta = newWidth - column.getWidth();
		
		//Set the width of the resize column
		setColumnWidth((StandardBaseColumn)column, newWidth);
		
		//if the column is a group adjsut the size of every child column
		if (column instanceof StandardColumnGroup){
			setWidthOnChildren((StandardColumnGroup) column,  newWidth, EMPTY_ARRAY);		
		}

		//Search every ancestor of the column and adjust also their width
		BaseColumn currentCol = column;
		StandardColumnGroup currentParent = getParent(currentCol);
		while(currentParent != null){
			setColumnWidth(currentParent, currentParent.getWidth() + delta);
			currentCol = currentParent;
			currentParent = getParent(currentCol);
		}
	}
	
	/**
	 * Set the width of the passed column, but before store its original
	 * width in the undo map
	 * 
	 * @param col the column to resize
	 * @param width the new width of the column
	 */
	protected void setColumnWidth(StandardBaseColumn col, int width){
		undoWidths.put(col, col.getWidth());
		col.setWidth(width);
	}
	
	/**
	 * Set recursively the width of every children column of a specific group 
	 * 
	 * @param group the group containing the columns to resize
	 * @param newSize the new size of the columns 
	 * @param excludedChildren the children exluded from the resize operations
	 */
	protected void setWidthOnChildren(StandardColumnGroup group, int newSize, List<BaseColumn> excludedChildren){
		//calculate the new sizes
		int[] childrenNewWidths = getColumnsProportionalWidth(group.getColumns(), newSize, excludedChildren);
		int index = 0;
		for(BaseColumn child : group.getColumns()){
			int newChildWidth = childrenNewWidths[index];
			if (child instanceof StandardColumnGroup){
				setWidthOnChildren((StandardColumnGroup)child, newChildWidth, excludedChildren);
			}
			setColumnWidth((StandardBaseColumn)child, newChildWidth);
			index++;
		}
	}
	
	/**
	 * Search in all the table the parent of a specific colum
	 * 
	 * @param child the searched column
	 * @return the group containing the searched column or null if no group
	 * is containing it (for example beause the column if child of the table)
	 */
	private StandardColumnGroup getParent(BaseColumn child){
		for(BaseColumn tableChild : table.getColumns()){
			if (tableChild == child) return null;
		}
		for(BaseColumn tableChild : table.getColumns()){
			if (tableChild instanceof StandardColumnGroup){
				StandardColumnGroup searchInGroup = getParent(child, (StandardColumnGroup)tableChild);
				if (searchInGroup != null) return searchInGroup;
			}
		}
		return null;
	}

	/**
	 * Iterate recursivley the table groups to find the parent of a specified child 
	 * 
	 * @param child the searched column
	 * @param currentGroup the group (and its descendant) where the column is searched
	 * @return the group containing the searched column or null if the passed group or its descendent doesn't 
	 * contain the searched column
	 */
	private StandardColumnGroup getParent(BaseColumn child, StandardColumnGroup currentGroup){
		for(BaseColumn groupChild : currentGroup.getColumns()){
			if (groupChild == child) return currentGroup;
		}
		for(BaseColumn groupChild : currentGroup.getColumns()){
			if (groupChild instanceof StandardColumnGroup){
				StandardColumnGroup searchInGroup = getParent(child, (StandardColumnGroup)groupChild);
				if (searchInGroup != null) return searchInGroup;
			}
		}
		return null;
	}
	
	/**
	 * Calculate the new width of a set of column to fit a new width of their parent. The width of the column
	 * resized is calculated propertionally to their original width
	 * 
	 * @param columns the columns to resize
	 * @param newWidth the new width the columns should occupy
	 * @param fixedColumns the list of columns that should not be resized in the process. However if the resize operation
	 * because every column is marked as fixed then the last one will be resized anyway
	 * @return and array with the same number of entry of the passed columns. Each value of the array is the size the 
	 * corrispective column should have to fit the available space
	 */
	private int[] getColumnsProportionalWidth(List<BaseColumn> columns, int newWidth, List<BaseColumn> fixedColumns){
		int[] proportionalWidths = new int[columns.size()];
		int index = 0;
		int currentColumnsWidth = 0;
		for(BaseColumn col : columns){
			currentColumnsWidth += col.getWidth();
		}
		//Phase 0: check that at least one columns is not excluded, otherwise make the last column not excluded
		boolean allExcluded = true;
		for(BaseColumn col : columns){
			if (!fixedColumns.contains(col)){
				allExcluded = false;
				break;
			}
		}
		if (allExcluded){
			fixedColumns.remove(columns.get(columns.size()-1));
		}
		
		//Phase 1: change proportionally the width of each column
		int columnsTotalWidth = 0;			
		for(BaseColumn col : columns){
			if(fixedColumns.contains(col)){
				proportionalWidths[index] = col.getWidth();
				columnsTotalWidth += col.getWidth();		
			} else {
				float proportionalFactor = (float)col.getWidth() / (float)currentColumnsWidth;
				//casting to int is the same to do the floor operation, since it drop the decimal
				int proportionalWidth = (int)(proportionalFactor * newWidth);
				proportionalWidths[index] = proportionalWidth;
				columnsTotalWidth += proportionalWidth;				
			}
			index ++;
		}
		
		//Phase 2: reassign what remains
		int remains = newWidth - columnsTotalWidth;
		index = 0;
		while (remains > 0 && proportionalWidths.length > 0){
			BaseColumn currentColumn = columns.get(index);
			if (!fixedColumns.contains(currentColumn)){
				proportionalWidths[index]++;
				remains--;	
			}
			index++;
			if (index == proportionalWidths.length){
				index = 0;
			}
		}
		return proportionalWidths;
	}
	
	@Override
	public void undo() {
		for(Entry<StandardBaseColumn, Integer> undoEntry : undoWidths.entrySet()){
			undoEntry.getKey().setWidth(undoEntry.getValue());
		}
	}

	@Override
	public void execute() {
		undoWidths.clear();
		setWidth();
	}
	
	@Override
	public boolean canExecute() {
		return newWidth >= 0 && column != null && table != null;
	}
}
