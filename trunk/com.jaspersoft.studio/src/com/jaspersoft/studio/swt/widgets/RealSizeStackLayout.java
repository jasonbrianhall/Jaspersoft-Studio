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
package com.jaspersoft.studio.swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

/**
 * The Original stack layout when the computeSize method is called return always
 * the size of the bigger control among the children of the parent using the layout.
 * This implementation instead return the real size of the currently showed element if
 * available
 * 
 * @author Orlandin Marco
 *
 */
public class RealSizeStackLayout extends StackLayout {

	/**
	 * If there is a top control return the size of that control, otherwise return the size
	 * of the bigger one
	 */
	@Override
	protected Point computeSize(Composite composite, int wHint, int hHint, boolean flushCache) {
		if (topControl != null) {
			Point size = topControl.computeSize(wHint, hHint, flushCache);
			int width = size.x + 2 * marginWidth;
			int height = size.y + 2 * marginHeight;
			if (wHint != SWT.DEFAULT) width = wHint;
			if (hHint != SWT.DEFAULT) height = hHint;
			return new Point(width, height);
		} else {
			return super.computeSize(composite, wHint, hHint, flushCache);
		}
		
	}
	
}
