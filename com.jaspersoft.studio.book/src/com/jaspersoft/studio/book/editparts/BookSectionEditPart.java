package com.jaspersoft.studio.book.editparts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.OrderedLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.jaspersoft.studio.book.editors.figures.SectionFigure;
import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;
import com.jaspersoft.studio.model.INode;

public class BookSectionEditPart extends AbstractGraphicalEditPart {

	private MReportPartContainer model;
	
	public BookSectionEditPart(MReportPartContainer model){
		this.model = model;
	}
	
	@Override
	protected IFigure createFigure() {
		return new SectionFigure(model);
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new OrderedLayoutEditPolicy() {
			
			@Override
			protected Command getCreateCommand(CreateRequest request) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected EditPart getInsertionReference(Request request) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected Command createAddCommand(EditPart child, EditPart after) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		NonResizableEditPolicy selectionPolicy = new NonResizableEditPolicy();
		selectionPolicy.setDragAllowed(false);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy);
	}

	@Override
	protected List<Object> getModelChildren() {
		List<Object> list = new ArrayList<Object>();
		for (INode node : model.getChildren()) {
			if (node instanceof MReportPart) {
				list.add(node);
			}
		}
		return list;
	}
}
