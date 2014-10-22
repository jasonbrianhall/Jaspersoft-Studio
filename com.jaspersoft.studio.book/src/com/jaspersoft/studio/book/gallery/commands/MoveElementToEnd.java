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
 * Move an element of the gallery to the end of another gallery
 * 
 * @author Orlandin Marco
 *
 */
public class MoveElementToEnd extends Command{
	
	/**
	 * Element to move
	 */
	private IGalleryElement elementMoved;
	
	/**
	 * Gallery source
	 */
	private GalleryComposite source;
	
	/**
	 * Gallery target
	 */
	private GalleryComposite target;
	
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
	public MoveElementToEnd(IGalleryElement elementMoved, GalleryComposite source, GalleryComposite target){
		this.source = source;
		this.target = target;
		this.elementMoved = elementMoved;
	}
	
	@Override
	public void execute() {
		int oldIndex = source.getIndexOf(elementMoved);
		//Store the old item
		if (oldIndex == 0) {
			oldPreviousItem = null;
		} else {
			oldPreviousItem = source.getElementAt(oldIndex-1);
		}
		
		//Delete from the old position
		source.removeItem(oldIndex);
		
		//create on the new position
		target.createItem(elementMoved, -1);
	}
	
	@Override
	public void undo() {
		//Delete from the new position
		target.removeItem(target.getContentSize()-1);
		
		//create on the old position
		int newIndex = 0;
		if (oldPreviousItem != null){
			newIndex = source.getIndexOf(oldPreviousItem)+1;
		}
		source.createItem(elementMoved, newIndex);
	}
}
