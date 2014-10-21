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
 * Move an element of the gallery after another element
 * 
 * @author Orlandin Marco
 *
 */
public class MoveElementAfter extends Command{

	/**
	 * Element that will be to the left of the moved element when the command will be executed
	 */
	private IGalleryElement previousItem;
	
	/**
	 * Element to move
	 */
	private IGalleryElement elementMoved;
	
	/**
	 * Gallery
	 */
	private GalleryComposite container;
	
	/**
	 * Element that was to the left of the moved element before the command was be executed
	 */
	private IGalleryElement oldPreviousItem = null;
	
	/**
	 * Create the command 
	 * 
	 * @param previousItem Element that will be to the left of the moved element when the command will be executed or null if
	 * the moved element should be moved on the first position
	 * @param elementMoved Element to move
	 * @param container the gallery that contains the elements
	 */
	public MoveElementAfter(IGalleryElement previousItem, IGalleryElement elementMoved, GalleryComposite container){
		this.container = container;
		this.elementMoved = elementMoved;
		this.previousItem = previousItem;
	}
	
	@Override
	public void execute() {
		int oldIndex = container.getIndexOf(elementMoved);
		//Store the old item
		if (oldIndex == 0) {
			oldPreviousItem = null;
		} else {
			oldPreviousItem = container.getElementAt(oldIndex-1);
		}
		
		//Delete from the old position
		container.removeItem(oldIndex);
		
		//create on the new position
		int newIndex = 0;
		if (previousItem != null){
			newIndex = container.getIndexOf(previousItem)+1;
		}
		container.createItem(elementMoved, newIndex);
	}
	
	@Override
	public void undo() {
		int oldIndex = container.getIndexOf(elementMoved);
		
		//Delete from the new position
		container.removeItem(oldIndex);
		
		//create on the old position
		int newIndex = 0;
		if (oldPreviousItem != null){
			newIndex = container.getIndexOf(oldPreviousItem)+1;
		}
		container.createItem(elementMoved, newIndex);
	}
}
