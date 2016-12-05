/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.editor.gef.figures;

import java.awt.Graphics2D;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;

import com.jaspersoft.studio.model.MGraphicElement;

/**
 * A generic JR figure, it provide also the method to provide the paint caching of 
 * the figure
 */
public abstract class AHandleBoundsFigure extends ComponentFigure implements HandleBounds {

	/**
	 * The model associated with the figure
	 */
	protected MGraphicElement model = null;
	
	protected ACachedGraphics cachedGraphics = null;
	
	/**
	 * Instantiates a new generic figure.
	 */
	public AHandleBoundsFigure(MGraphicElement model) {
		super();
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.handles.HandleBounds#getHandleBounds()
	 */
	public Rectangle getHandleBounds() {
		Rectangle handleBounds = getBounds();
		return handleBounds;

	}
	
	/**
	 * Return the model associated to this figure, can be null
	 */
	public MGraphicElement getModel(){
		return model;
	}
	
	/**
	 * Used to make explicit if the figure allow the caching of the drawing
	 * 
	 * @return true if the figure allow the caching, false otherwise
	 */
	protected boolean allowsFigureDrawCache(){
		return true;
	}
	
	/**
	 * return the implementation of the class that do the caching operation and draw
	 * a cached figure on the part. 
	 */
	protected abstract ACachedGraphics getCachedGraphics(Graphics2D originalGraphics);
}
