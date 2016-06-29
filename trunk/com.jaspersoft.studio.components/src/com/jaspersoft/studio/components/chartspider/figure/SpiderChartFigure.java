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
package com.jaspersoft.studio.components.chartspider.figure;

import java.awt.Graphics2D;

import com.jaspersoft.studio.editor.gef.figures.ACachedGraphics;
import com.jaspersoft.studio.editor.gef.figures.JRComponentFigure;
import com.jaspersoft.studio.editor.java2d.ImageGraphics2D;
import com.jaspersoft.studio.model.MGraphicElement;

/**
 * 
 * @author veaceslav chicu
 * 
 */
public class SpiderChartFigure extends JRComponentFigure {

	/**
	 * Instantiates a new map figure.
	 */
	public SpiderChartFigure(MGraphicElement node) {
		super(node);
	}

	@Override
	protected ACachedGraphics getCachedGraphics(Graphics2D originalGraphics) {
		return new ImageGraphics2D(originalGraphics);
	}
}
