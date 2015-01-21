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

import com.jaspersoft.studio.model.ICopyable;

/**
 * In jaspersoft studio there are different type of element that are copyable. Someone
 * maybe can be design element, but also the properties of an element can be copied.
 * This class is the one that it is implemented for each one of this types. Since the 
 * copy of a property is different from the copy of a graphic element, so it will need
 * a specific command to execute the operation. Because of this the implementation must
 * define the method that provide the command to paste the copied elements on the specific
 * targets
 * 
 * @author Orlandin Marco
 *
 */
public abstract class AbstractPastableObject {

	/**
	 * List of copied elements
	 */
	protected List<ICopyable> list;
	
	/**
	 * Create an instance of the class
	 * 
	 * @param list not null list of the elements that are object of the copy
	 */
	public AbstractPastableObject(List<ICopyable> list){
		this.list = list;
	}
	
	/**
	 * Return the list of the elements that were copied
	 * 
	 * @return the copied elements
	 */
	public Collection<ICopyable> getCopyedElements(){
		return list;
	}
	
	/**
	 * Return the command that will be executed to have the copied elements
	 * pasted on the targets
	 * 
	 * @param targets the target for the paste operation
	 * @return a command, can be null if the paste operation can't be executed
	 */
	public abstract Command getPasteCommand(Collection<?> targets);
}
