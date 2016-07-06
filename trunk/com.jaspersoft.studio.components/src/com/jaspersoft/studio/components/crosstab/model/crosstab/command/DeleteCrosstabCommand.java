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
package com.jaspersoft.studio.components.crosstab.model.crosstab.command;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.components.crosstab.model.MCrosstab;
import com.jaspersoft.studio.components.crosstab.model.dialog.ApplyCrosstabStyleAction;
import com.jaspersoft.studio.components.table.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.model.command.DeleteElementCommand;
import com.jaspersoft.studio.model.style.command.DeleteStyleCommand;
import com.jaspersoft.studio.utils.ModelUtils;

import net.sf.jasperreports.eclipse.ui.util.RunnableCancelQuestion.RESPONSE_TYPE;
import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignStyle;
import net.sf.jasperreports.engine.design.JasperDesign;

/**
 * Delete the element and also the styles that where used inside and 
 * that will be not used anymore once it is deleted
 * 
 * @author Orlandin Marco 
 */
public class DeleteCrosstabCommand extends DeleteElementCommand {

	/**
	 * The list of command executed to delete the styles associated to the element
	 */
	private List<Command> delteStylesCommand = new ArrayList<Command>();
	
	/**
	 * The element to delete
	 */
	private MCrosstab crosstab;
	
	/**
	 * Flag to remeber if the operation was cancelled or not
	 */
	private boolean cancelled = false;
	
	/**
	 *Create the command
	 *
	 *@param srcNode the table to delete, must be not null
	 *
	 */
	public DeleteCrosstabCommand(MCrosstab srcNode) {
		super(srcNode);
		crosstab = srcNode;
	}

	/**
	 * Check if a style is used only by the crosstab or also by someone else
	 * 
	 * @param nodesUsingInsideCrosstab nodes using the style that are inside the ccrosstab
	 * @param nodesUsingOutsideCrosstab nodes using the style in the whole report
	 * 
	 *  @return true if the styles is used only by the nodes inside the crosstab, false otherwise
	 */
	private boolean isUsedOnlyByCrosstab(List<ANode> nodesUsingInsideCrosstab, List<ANode> nodesUsingOutsideCrosstab){
		if (nodesUsingInsideCrosstab == null || nodesUsingOutsideCrosstab == null) return false;
		if (nodesUsingInsideCrosstab.size() != nodesUsingOutsideCrosstab.size()) return false;
		
		for(ANode nodeUsingInsideTable : nodesUsingInsideCrosstab){
			if (!nodesUsingOutsideCrosstab.contains(nodeUsingInsideTable)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Check if a style name exist and it is internal
	 * 
	 * @param styleName the name of the style
	 * @param jd the jasperdesign, must be not null
	 * @return true if the style name is not null and referencing an internal style, false otherwise
	 */
	protected boolean isExistingInternalStyle(String styleName, JasperDesign jd){
		if (styleName != null){
			return jd.getStylesMap().containsKey(styleName);
		}
		return false;
	}
	
	/**
	 * Check if the passed map has one of the properties that bind the crosstab to
	 * its default styles
	 * 
	 * @param crosstabMap
	 *            the properties map of the crosstab
	 * @return true if the crosstab map has one of the properties that reference
	 *         the default style, false otherwise
	 */
	protected boolean hasStyleProperties(JRPropertiesMap crosstabMap) {
		return (crosstabMap.containsProperty(ApplyCrosstabStyleAction.CROSSTAB_GROUP_PROPERTY)
				|| crosstabMap.containsProperty(ApplyCrosstabStyleAction.CROSSTAB_DETAIL_PROPERTY)
				|| crosstabMap.containsProperty(ApplyCrosstabStyleAction.CROSSTAB_HEADER_PROPERTY)
				|| crosstabMap.containsProperty(ApplyCrosstabStyleAction.CROSSTAB_TOTAL_PROPERTY));
	}
	
	@Override
	public void execute() {
		delteStylesCommand.clear();
		MReport report = ModelUtils.getReport(crosstab);
		//get the list of styles used in the element
		HashMap<String, List<ANode>> reportStyles = report.getUsedStyles();
		HashMap<String, List<ANode>> crosstabStyles = crosstab.getUsedStyles();
		
		//check which styles were used in the element but not in the rest of the report
		HashSet<String> unusedStyles = new HashSet<String>();
		
		for(Entry<String, List<ANode>> entry : crosstabStyles.entrySet()){
			List<ANode> nodesUsingOutsideTable = reportStyles.get(entry.getKey());
			if (jDesign.getStylesMap().containsKey(entry.getKey()) &&  isUsedOnlyByCrosstab(entry.getValue(), nodesUsingOutsideTable)){
				unusedStyles.add(entry.getKey());
			}
		}
		
		//Add the style of the crosstab
		JRPropertiesMap tableMap = crosstab.getPropertiesMap();
		if (hasStyleProperties(tableMap)){
			String styleName = tableMap.getProperty(ApplyCrosstabStyleAction.CROSSTAB_DETAIL_PROPERTY);
			if (isExistingInternalStyle(styleName, jDesign)) unusedStyles.add(styleName);
			
			styleName = tableMap.getProperty(ApplyCrosstabStyleAction.CROSSTAB_GROUP_PROPERTY);
			if (isExistingInternalStyle(styleName, jDesign)) unusedStyles.add(styleName);
			
			styleName = tableMap.getProperty(ApplyCrosstabStyleAction.CROSSTAB_HEADER_PROPERTY);
			if (isExistingInternalStyle(styleName, jDesign)) unusedStyles.add(styleName);
			
			styleName = tableMap.getProperty(ApplyCrosstabStyleAction.CROSSTAB_TOTAL_PROPERTY);
			if (isExistingInternalStyle(styleName, jDesign)) unusedStyles.add(styleName);
		}
		
		
		if (!unusedStyles.isEmpty()){
			//If there are style that can be removed ask the user what to do and in case
			//generate the commands to remove them
			String unusedStylesName = ""; //$NON-NLS-1$
			int count = 0;
			for(String styleName : unusedStyles){
				unusedStylesName += styleName;
				if (count != unusedStyles.size()-1 ){
					unusedStylesName += ", "; //$NON-NLS-1$
				}
				count++;
			}
			
			RESPONSE_TYPE response = UIUtils.showCancellableConfirmation(Messages.DeleteTableCommand_unusedTitle, MessageFormat.format(Messages.DeleteTableCommand_unusedMessage, new Object[]{unusedStylesName}));
			if (response == RESPONSE_TYPE.YES){
				for(String style : unusedStyles){
					JRStyle styleObject = jDesign.getStylesMap().get(style);
					DeleteStyleCommand command = new DeleteStyleCommand(report, (JRDesignStyle)styleObject);
					delteStylesCommand.add(command);
				}
			} else if (response == RESPONSE_TYPE.CANCEL) {
				cancelled = true;
			}
		}
		if (!cancelled){
			for(Command cmd : delteStylesCommand){
				cmd.execute();
			}
			super.execute();
		}
	}
	
	@Override
	public void undo() {
		if (!cancelled){
			for(Command cmd : delteStylesCommand){
				cmd.undo();
			}
			super.undo();
		}
	}
	
}
