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
package com.jaspersoft.studio.book.editors.figures;

import org.eclipse.gef.EditPart;

/**
 * 
 * Define the location of a drop operation feedback inside a gallery component
 * 
 * @author Orlandin Marco
 *
 */
public class DropEffectLocation {
	
	/**
	 * Element after or before which the feedback must be placed
	 */
	private EditPart dropAfterElement = null;
	
	private EditPart elementContainer = null;
	

	/**
	 * Return the item where the feedback must be painted
	 * 
	 * @return a GalleryItem could be null
	 */
	public EditPart getItem() {
		return dropAfterElement;
	}
	
	public EditPart getElementContainer(){
		return elementContainer;
	}

	/**
	 * Set the item where the feedback must be painted
	 * 
	 * @param item a GalleryItem can be null if no feedback
	 * must be painted
	 */
	public void setItem(EditPart elementContainer, EditPart item) {
		this.dropAfterElement = item;
		this.elementContainer = elementContainer;
	}


	/**
	 * Check if there is a valid element where the feedback must be painted
	 * 
	 * @return true if the item is not equals to null, false otherwise
	 */
	public boolean isPainted(){
		return elementContainer != null;
	}
}
