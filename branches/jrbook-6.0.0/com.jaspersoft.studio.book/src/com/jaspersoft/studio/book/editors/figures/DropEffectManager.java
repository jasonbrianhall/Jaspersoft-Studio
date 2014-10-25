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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;

import com.jaspersoft.studio.book.editparts.BookSectionEditPart;

/**
 * 
 * Define the location of a drop operation feedback inside a gallery component
 * 
 * @author Orlandin Marco
 *
 */
public class DropEffectManager {

	public static final DropEffectManager INSTANCE = new DropEffectManager();
	
	private DropEffectLocation currentLocation = new DropEffectLocation();
	
	private DropEffectManager(){
		
	}
	
	private List<BookSectionEditPart> listeners = new ArrayList<BookSectionEditPart>();
	
	
	public void addListeningPart(BookSectionEditPart part){
		listeners.add(part);
	}
	
	private void requestRepaint(){
		for(BookSectionEditPart part : listeners){
			part.refresh();
		}
	}
	
	public void setDropLocation(EditPart elementContainer, EditPart afterPart){
		if (currentLocation.getElementContainer() != elementContainer || currentLocation.getItem() != afterPart){
			currentLocation.setItem(elementContainer, afterPart);
			requestRepaint();
		}
	}
	
	public EditPart getContainer(){
		return currentLocation.getElementContainer();
	}
	
	public EditPart afterPart(){
		return currentLocation.getItem();
	}
}
