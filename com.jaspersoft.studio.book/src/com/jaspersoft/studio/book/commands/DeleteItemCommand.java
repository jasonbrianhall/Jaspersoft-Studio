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
package com.jaspersoft.studio.book.commands;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.book.controls.GalleryComposite;
import com.jaspersoft.studio.book.controls.IGalleryElement;

/**
 * Delete an element from the gallery
 * 
 * @author Orlandin Marco
 *
 */
public class DeleteItemCommand extends Command {
	
	/**
	 * The gallery
	 */
	private GalleryComposite container;
	
	/**
	 * The index of the element to remove
	 */
	private int index;
	
	/**
	 * The delete element
	 */
	private IGalleryElement deletedElement = null;
	
	/**
	 * Create the command 
	 * 
	 * @param container The gallery
	 * @param index The index of the element to remove
	 */
	public DeleteItemCommand(GalleryComposite container, int index){
		this.index = index;
		this.container = container;
	}
	
	/**
	 * Create the command 
	 * 
	 * @param container The gallery
	 * @param elementToDelete The element to remove
	 */
	public DeleteItemCommand(GalleryComposite container, IGalleryElement elementToDelete){
		this.container = container;
		this.index = container.getIndexOf(elementToDelete);
	}
	
	@Override
	public void execute() {
		deletedElement = container.removeItem(index);
	}
	
	@Override
	public void undo() {
		container.createItem(deletedElement, index);
		deletedElement = null;
	}
}
