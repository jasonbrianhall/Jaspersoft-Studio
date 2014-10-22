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
package com.jaspersoft.studio.book.gallery.commands;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.book.gallery.controls.GalleryComposite;
import com.jaspersoft.studio.book.gallery.interfaces.IGalleryElement;

/**
 * Command to create an element inside the gallery, can be undone
 * 
 * @author Orlandin Marco
 *
 */
public class CreateElementCommand extends Command {

	/**
	 * The element to create
	 */
	private IGalleryElement elementToCreate;
	
	/**
	 * The gallery where the element will be created
	 */
	private GalleryComposite container;
	
	/**
	 * The index of the creation, if it's -1 then it is placed in the last position
	 */
	private int index = -1;
	
	/**
	 * Build the command to create the element to a specific index
	 * 
	 * @param container The gallery where the element will be created
	 * @param elementToCreate The element to create
	 * @param index The index of the creation, if it's -1 then it is placed in the last position
	 */
	public CreateElementCommand(GalleryComposite container, IGalleryElement elementToCreate, int index){
		this.elementToCreate = elementToCreate;
		this.index = index;
		this.container = container;
	}
	
	/**
	 * Build the command to create the element at the end of the gallery
	 * 
	 * @param container The gallery where the element will be created
	 * @param elementToCreate The element to create
	 */
	public CreateElementCommand(GalleryComposite container, IGalleryElement elementToCreate){
		this(container, elementToCreate, -1);
	}
	
	/**
	 * Create the element inside the gallery
	 */
	@Override
	public void execute() {
		if(index < 0 || index >= container.getContentSize()){
			index = -1;
		}
		container.createItem(elementToCreate, index);
	}
	
	/**
	 * Remove the created element from it's position
	 */
	@Override
	public void undo() {
		if(index < 0 || index > container.getContentSize()){
			index = container.getContentSize()-1;
		}
		container.removeItem(index);
	}
	
}
