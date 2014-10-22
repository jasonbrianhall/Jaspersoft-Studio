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
 * Command to create an element inside the gallery after another element, can be undone
 * 
 * @author Orlandin Marco
 *
 */
public class CreateElementAfterCommand extends Command {

	/**
	 * The element to create
	 */
	private IGalleryElement elementToCreate;
	
	/**
	 * The gallery where the element will be created
	 */
	private GalleryComposite container;
	
	/**
	 * The element after witch the new element will be created
	 */
	private IGalleryElement afterElement;
	
	/**
	 * Build the command 
	 * 
	 * @param container The gallery where the element will be created
	 * @param elementToCreate The element to create
	 * @param afterElement The element after witch the new element will be created. If it is null the new element
	 * will be created at the start of the gallery
	 */
	public CreateElementAfterCommand(GalleryComposite container, IGalleryElement elementToCreate, IGalleryElement afterElement){
		this.elementToCreate = elementToCreate;
		this.afterElement = afterElement;
		this.container = container;
	}
	
	/**
	 * Create the element inside the gallery
	 */
	@Override
	public void execute() {
		if (afterElement == null){
			container.createItem(elementToCreate, 0);
		} else {
			int afterIndex = container.getIndexOf(afterElement);
			if (afterIndex == container.getContentSize()-1){
				container.createItem(elementToCreate, -1);
			} else {
				container.createItem(elementToCreate, afterIndex+1);
			}
		}
	}
	
	/**
	 * Remove the created element from it's position
	 */
	@Override
	public void undo() {
		int createdIndex = container.getIndexOf(elementToCreate);
		container.removeItem(createdIndex);
	}
	
}
