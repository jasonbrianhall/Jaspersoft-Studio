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
package com.jaspersoft.studio.editor.action.csv;

import java.util.List;

import net.sf.jasperreports.engine.JRPropertiesMap;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.editor.gef.decorator.csv.NameChooserDialog;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.MGraphicElement;
import com.jaspersoft.studio.model.text.MTextElement;
import com.jaspersoft.studio.property.SetValueCommand;

/**
 * This class implement a CSV action that create a new column in the CSV. This action can be performed 
 * only on textual elements (Textfield and static text). When a column is created it is asked using a dialog 
 * the column name. The order of the column in the CSV will be the same order of creation, anyway this can be changed
 * using an appropriate action
 * 
 * @author Orlandin Marco
 *
 */
public class CSVColDataAction extends CSVAction {
	
		/**
		 * Create the action with id @CSVAction.COL_DATA
		 * @param part
		 * @param actionName the textual description of the action
		 */
		public CSVColDataAction(IWorkbenchPart part, String actionName){
			super(part, CSVAction.COL_DATA, actionName);
		}
	
			
	/**
	 * Create the commands to transform a textual element into a csv column of value
	 * @param columnName Name of the column where this element will be placed
	 * @param columnValue the element that will became a column in the csv
	 * @param commandStack the stack of commands where the command to add the required attributes are added
	 * @return the commands to execute
	 */
	public void createCommand(String columnName, APropertyNode columnValue, CompoundCommand commandStack){
		SetValueCommand setColDataCommand = new SetValueCommand();
		setColDataCommand.setTarget(columnValue);
		setColDataCommand.setPropertyId(MGraphicElement.PROPERTY_MAP);
		JRPropertiesMap colDataMap = (JRPropertiesMap)columnValue.getPropertyValue(MGraphicElement.PROPERTY_MAP);
		if (colDataMap == null)	colDataMap = new JRPropertiesMap();
		//Set the column name and the data attribute for this element
		colDataMap.setProperty(CSVAction.COL_DATA, null);
		colDataMap.setProperty(CSVAction.COL_NAME, columnName);
		setColDataCommand.setPropertyValue(colDataMap);
		if (setColDataCommand.canExecute()){
			//If the set of the element attributes can be executed than the name of the columns is added on the report root
			commandStack.add(setColDataCommand);
			JRPropertiesMap rootMap = (JRPropertiesMap)getRoot().getPropertyValue(MGraphicElement.PROPERTY_MAP);
			if (rootMap == null)
				rootMap = new JRPropertiesMap();
			String colNames = rootMap.getProperty(CSVAction.COL_NAMES);
			if (colNames == null) colNames = columnName;
			else if (!colNameAlreadyPresent(columnName, colNames)) colNames = colNames.concat(","+columnName); //$NON-NLS-1$
			SetValueCommand setRootNames = new SetValueCommand();
			//the property is set on the root
			setRootNames.setTarget(getRoot());
			rootMap.setProperty(CSVAction.COL_NAMES, colNames);
			setRootNames.setPropertyId(MGraphicElement.PROPERTY_MAP);
			setRootNames.setPropertyValue(rootMap);
			commandStack.add(setRootNames);
		}
	}
	
	/**
	 * Remove the attributes that made a textual element a column in the csv. The column name is also removed from the list of 
	 * column in the root of the document
	 * @param selectedElement the element from where the csv column attributes are removed
	 * @param commandStack the stack of commands where the command to remove the attributes are added
	 */
	private void removeProperty(APropertyNode selectedElement, CompoundCommand commandStack){
		JRPropertiesMap colDataMap = (JRPropertiesMap)selectedElement.getPropertyValue(MGraphicElement.PROPERTY_MAP);
		if (colDataMap == null)
			colDataMap = new JRPropertiesMap();
		String colName = colDataMap.getProperty(CSVAction.COL_NAME);
		colDataMap.removeProperty(CSVAction.COL_DATA);
		colDataMap.removeProperty(CSVAction.COL_NAME);
		SetValueCommand setColDataCommand = new SetValueCommand();
		setColDataCommand.setTarget(selectedElement);
		setColDataCommand.setPropertyId(MGraphicElement.PROPERTY_MAP);
		setColDataCommand.setPropertyValue(colDataMap);
		commandStack.add(setColDataCommand);
		if (colName != null){
			JRPropertiesMap rootMap = (JRPropertiesMap)getRoot().getPropertyValue(MGraphicElement.PROPERTY_MAP);
			if (rootMap == null) rootMap = new JRPropertiesMap();
			
			String colNames = rootMap.getProperty(CSVAction.COL_NAMES);
      if (colNames != null){
				SetValueCommand setRootNames = new SetValueCommand();
				setRootNames.setTarget(getRoot());
				String newColNames = removeColName(colName, colNames);
				//If there arent columns the property is removed
				if (newColNames == null) rootMap.removeProperty(CSVAction.COL_NAMES);
				else rootMap.setProperty(CSVAction.COL_NAMES, newColNames);
				setRootNames.setPropertyId(MGraphicElement.PROPERTY_MAP);
				setRootNames.setPropertyValue(rootMap);
				commandStack.add(setRootNames);
			}
		}
	}
	
	/**
	 * Check if the name for a column was already present in the list of the column names
	 * @param name value that is searched in the list
	 * @param colNames list of column names, comma separated
	 * @return true if name is present in colNames, otherwise false
	 */
	private boolean colNameAlreadyPresent(String name, String colNames){
		if ((name.equals(colNames))
				|| (colNames.contains(","+name+",")) //$NON-NLS-1$ //$NON-NLS-2$
					|| (colNames.startsWith(name+",")) //$NON-NLS-1$
						|| (colNames.endsWith(","+name))) //$NON-NLS-1$
								return true;
		return false;
	}
	
	/**
	 * Remove a name from the list of all the column names
	 * @param name value to remove
	 * @param colNames list of column names, comma separated
	 * @return columnNames without the element removed, or null if the element removed was the only 
	 * one column
	 */
	private String removeColName(String name, String colNames){
		if (colNames.equals(name)) return null;
		if (colNames.startsWith(name+",")) return colNames.substring(name.length()+1); //$NON-NLS-1$
		if (colNames.endsWith(","+name)) return colNames.substring(0,colNames.length()-name.length()-1); //$NON-NLS-1$
		int colIndex = colNames.indexOf(","+name+","); //$NON-NLS-1$ //$NON-NLS-2$
		return colNames.substring(0, colIndex+1) + colNames.substring(colIndex+name.length()+2);
	}
	
	/**
	 * If an element is already a column than the property is removed from it, otherwise it will became a csw column with a column name
	 * defined by the user
	 */
	@Override
	public void run() {
		if (isChecked()) execute(createAlignmentCommand("")); //$NON-NLS-1$
		else {
			NameChooserDialog dialog = new NameChooserDialog(Display.getCurrent().getActiveShell(),Messages.CSVColDataAction_InsertColNameDialog);
			int dialogResult = dialog.open();
			if (dialogResult == NameChooserDialog.OK)
				execute(createAlignmentCommand(dialog.getName()));
		}
	}
	
	@Override
	public boolean isChecked() {
		List<?> editparts = getSelectedObjects();
		if (editparts.isEmpty() || !(editparts.get(0) instanceof EditPart)){
			return false;
		}
		for (int i = 0; i < editparts.size(); i++) {
			EditPart editpart = (EditPart) editparts.get(i);
			if (editpart.getModel() instanceof MTextElement){
				MTextElement model = (MTextElement)editpart.getModel();
				JRPropertiesMap colDataMap = (JRPropertiesMap)model.getPropertyValue(MGraphicElement.PROPERTY_MAP);
				boolean hasColData = colDataMap.containsProperty(CSVAction.COL_DATA);
				if (!hasColData) return false;
			} else return false;
		}
		return true;
	}
	
	@Override
	protected Command createAlignmentCommand() {
		return createAlignmentCommand(""); //$NON-NLS-1$
	}

	
	/**
	 * Create the commands necessary to transform a textual element into a csv column or to remove it 
	 * is it is already a csv column
	 * 
	 */
	protected Command createAlignmentCommand(String columnName) {
		List<?> editparts = getSelectedObjects();
		if (editparts.isEmpty() || !(editparts.get(0) instanceof EditPart) || editparts.size()>1){
			return null;
		} 
		CompoundCommand command = new CompoundCommand();
		command.setDebugLabel(getText());
		EditPart editpart = (EditPart) editparts.get(0);
		if (editpart.getModel() instanceof MTextElement){
			APropertyNode columnValue = (APropertyNode)editpart.getModel();
			if (isChecked()) removeProperty(columnValue, command);
			else createCommand(columnName, columnValue, command);
		}
		return command;
	}
}
