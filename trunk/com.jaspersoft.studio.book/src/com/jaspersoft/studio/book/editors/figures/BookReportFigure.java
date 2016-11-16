/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.book.editors.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.wb.swt.ResourceManager;

/**
 * Figure of the page where all the section are placed
 * 
 * @author Orlandin Marco
 *
 */
public class BookReportFigure extends RectangleFigure {
	
	/**
	 * Default width of the page
	 */
	public static final int FIGURE_WIDTH = 600;
	
	public BookReportFigure(){
		GridLayout layout = new GridLayout(1, false);
		setLayoutManager(layout);
		
		// The calculation of the size of the book figure should be 
		// updated by the containing figures (or model changes).
		// by default let's use a 3 sections x 2 documents each to start...
		setBounds(new Rectangle(5, 5, FIGURE_WIDTH, 700));
	}
	
	/**
	 * Recalculate the height of the figure depending to 
	 * its content
	 */
	public void updateBounds(){
		Rectangle bounds = new Rectangle(super.getBounds());
		int preferredHeight = 0;
		for(Object child : getChildren()){
			IFigure figure = (IFigure)child;
			preferredHeight += figure.getPreferredSize().height;
		}
		if (preferredHeight == 0) preferredHeight = 200;
		bounds.setHeight(preferredHeight+20);
		setBounds(bounds);
	}
	
	@Override
	public void add(IFigure figure, Object constraint, int index) {
		GridData dataConstraint = new GridData(GridData.FILL_HORIZONTAL);
		super.add(figure, dataConstraint, index);
		updateBounds();
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		Color oldBackColor = graphics.getBackgroundColor();
		
		graphics.setBackgroundColor(ResourceManager.getColor(255, 255, 255));
		graphics.fillRectangle(getBounds());
		
		graphics.setBackgroundColor(oldBackColor);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
	}
	
}
