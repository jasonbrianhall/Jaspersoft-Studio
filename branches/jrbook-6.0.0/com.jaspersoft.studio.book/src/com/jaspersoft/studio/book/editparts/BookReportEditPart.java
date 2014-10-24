package com.jaspersoft.studio.book.editparts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import com.jaspersoft.studio.book.editors.figures.BookFigure;
import com.jaspersoft.studio.book.models.MReportPartContainer;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MReport;

public class BookReportEditPart extends AbstractGraphicalEditPart {

	private MReport root;
	
	public BookReportEditPart(MReport root){
		this.root = root;
	}
	
	@Override
	protected IFigure createFigure() {
		return new BookFigure(root);
	}

	@Override
	protected void createEditPolicies() {
		NonResizableEditPolicy selectionPolicy = new NonResizableEditPolicy();
		selectionPolicy.setDragAllowed(true);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy);
	}

	@Override
	protected void refreshVisuals() {
		// TODO Auto-generated method stub
		super.refreshVisuals();
	}
	
	@Override
	protected List<Object> getModelChildren() {
		List<Object> list = new ArrayList<Object>();
		for (INode node : root.getChildren()) {
			if (node instanceof MReportPartContainer) {
				list.add(node);
			}
		}
		return list;
	}
}
