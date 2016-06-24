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
package com.jaspersoft.studio.editor.xml.outline;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.jaspersoft.studio.editor.xml.xml.XMLElement;

public class OutlineContentProvider implements ITreeContentProvider {

	private XMLElement root = null;

	public Object[] getChildren(Object parentElement) {
		if (root == null)
			return new Object[0];
		XMLElement parent = (XMLElement) parentElement;
		List<XMLElement> childrenDTDElements = parent.getChildrenDTDElements();
		if (childrenDTDElements != null){
			return childrenDTDElements.toArray();
		}
		return new Object[0];
	}

	public Object getParent(Object element) {
		if (element instanceof XMLElement)
			return ((XMLElement) element).getParent();
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return ((XMLElement) element).getChildrenDTDElements().size() > 0;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (root == null)
			return new Object[0];
		List<XMLElement> childrenDTDElements = root.getChildrenDTDElements();
		if (childrenDTDElements != null)
			return childrenDTDElements.toArray();
		return new Object[0];
	}

	public void dispose() {
	}
	
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		root = (XMLElement)newInput;
	}
}
