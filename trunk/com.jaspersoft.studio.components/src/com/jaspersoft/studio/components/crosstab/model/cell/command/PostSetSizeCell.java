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
package com.jaspersoft.studio.components.crosstab.model.cell.command;

import org.eclipse.gef.commands.Command;
import org.eclipse.ui.views.properties.IPropertySource;

import com.jaspersoft.studio.JSSCompoundCommand;
import com.jaspersoft.studio.components.crosstab.model.MCrosstab;
import com.jaspersoft.studio.components.crosstab.model.cell.MCell;
import com.jaspersoft.studio.editor.layout.LayoutManager;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.property.IPostSetValue;

import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabCell;

public class PostSetSizeCell implements IPostSetValue {

	@Override
	public Command postSetValue(IPropertySource target, Object prop,
			Object newValue, Object oldValue) {
		if (target instanceof MCell
				&& (prop.equals(JRDesignCrosstabCell.PROPERTY_WIDTH) || 
						prop.equals(JRDesignCrosstabCell.PROPERTY_HEIGHT))) {
			MCell mband = (MCell) target;
			MCrosstab crosstab = mband.getCrosstab();
			//need to relayout the entire table because also other cells could be influenced
			JSSCompoundCommand c = new JSSCompoundCommand("Resize Crosstab Cell", crosstab);
			createLayoutCommand(crosstab, c);
			return c;
		}
		return null;
	}
	
	/**
	 * Create a command to layout the current node if it is a cell, otherwise it 
	 * will search recursively a cell in every child of the node
	 */
	public void createLayoutCommand(INode node, JSSCompoundCommand c){
		if (node == null) return;
		if (node instanceof MCell && node.getValue() != null){
			Command cmd = LayoutManager.createRelayoutCommand((ANode)node);
			if (cmd != null) c.add(cmd);
		} else {
			for(INode child : node.getChildren()){
				createLayoutCommand(child, c);
			}
		}
	}
}
