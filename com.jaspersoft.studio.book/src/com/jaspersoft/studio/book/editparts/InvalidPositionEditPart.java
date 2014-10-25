package com.jaspersoft.studio.book.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class InvalidPositionEditPart extends AbstractGraphicalEditPart{

	@Override
	protected IFigure createFigure() {
		return null;
	}

	@Override
	protected void createEditPolicies() {	
	}
	
	private static InvalidPositionEditPart instance = new InvalidPositionEditPart();
	
	public static InvalidPositionEditPart getInstance(){
		return instance;
	}
}