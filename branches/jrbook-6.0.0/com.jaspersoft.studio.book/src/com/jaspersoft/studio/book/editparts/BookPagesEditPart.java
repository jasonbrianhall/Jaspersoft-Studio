package com.jaspersoft.studio.book.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import com.jaspersoft.studio.book.editors.figures.PageFigure;
import com.jaspersoft.studio.book.models.MReportPart;

public class BookPagesEditPart extends AbstractGraphicalEditPart {

	private MReportPart model;
	
	public BookPagesEditPart(MReportPart model){
		this.model = model;
	}
	
	@Override
	protected IFigure createFigure() {
		return new PageFigure(model);
	}

	@Override
	protected void createEditPolicies() {
		NonResizableEditPolicy selectionPolicy = new NonResizableEditPolicy();
		selectionPolicy.setDragAllowed(true);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy);
	}
}
