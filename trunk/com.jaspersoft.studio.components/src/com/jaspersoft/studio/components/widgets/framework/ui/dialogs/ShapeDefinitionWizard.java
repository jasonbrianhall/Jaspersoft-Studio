/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.components.widgets.framework.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.Wizard;

import net.sf.jasperreports.customizers.shape.Point;
import net.sf.jasperreports.customizers.shape.ShapePoints;
import net.sf.jasperreports.customizers.shape.ShapeTypeEnum;

/**
 * Wizard to define the shape of an element
 * 
 * @author Orlandin Marco
 *
 */
public class ShapeDefinitionWizard extends Wizard {

	/**
	 * Page for the shape points, if the selected shape is a polygon or a polyline
	 */
	private PointsWizardPage page1;

	/**
	 * The edited shape
	 */
	private ShapeTypeEnum editedShape;
	
	/**
	 * The list of points that compose the shape
	 */
	private List<Point> points;
	
	/**
	 * Create the wizard
	 * 
	 * @param editedShape shape used to pre-initialize the controls, it can be null
	 */
	public ShapeDefinitionWizard(ShapeTypeEnum editedShape, ShapePoints shapePoints) {
		this.editedShape = editedShape;
		if (shapePoints == null || shapePoints.getPoints() == null){
			points = new ArrayList<Point>();
		} else {
			points = shapePoints.getPoints();
		}
	}
	
	@Override
	public void addPages() {
		page1 = new PointsWizardPage(editedShape, points);
		addPage(page1);
	}
	
	@Override
	public boolean performFinish() {
		return true;
	}
	
	/**
	 * Return the shape encoded into a string 
	 * 
	 * @return the shape definition string
	 */
	public String getEncodedPoints(){
		ShapePoints shapePoints = new ShapePoints();
		shapePoints.setPoints(page1.getPoints());
		return shapePoints.encode();
	}
}
