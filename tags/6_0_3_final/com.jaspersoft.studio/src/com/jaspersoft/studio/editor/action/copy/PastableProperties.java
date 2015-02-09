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
package com.jaspersoft.studio.editor.action.copy;

import java.util.Collection;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;

import com.jaspersoft.studio.model.CopyElementExpressionProperty;
import com.jaspersoft.studio.model.ICopyable;

/**
 * Implementation of the paste definition for the editor graphical
 * objects. This can be used to copy\paste properties of an element
 * 
 * @author Orlandin Marco
 *
 */
public class PastableProperties extends AbstractPastableObject{

	/**
	 * Create an instance of the class
	 * 
	 * @param list not null list of the properties that are object of the copy. The content 
	 * must be of type CopyElementExpressionProperty
	 */
	public PastableProperties(List<ICopyable> list) {
		super(list);
	}

	@Override
	public Command getPasteCommand(Collection<?> targets) {
		CompoundCommand cc = new CompoundCommand();
		for(Object obj : list){
			CopyElementExpressionProperty property = (CopyElementExpressionProperty)obj;
			cc.add(property.getPasteCommand(targets));
		}
		return cc;
	}

}
