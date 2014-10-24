package com.jaspersoft.studio.book.editparts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.OrderedLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.tools.DragEditPartsTracker;

import com.jaspersoft.studio.book.editors.figures.PageFigure;
import com.jaspersoft.studio.book.models.MReportPart;

public class BookPagesEditPart extends AbstractGraphicalEditPart {

	private MReportPart model;
	
	public BookPagesEditPart(MReportPart model){
		this.model = model;
		model.getPropertyChangeSupport().addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				refresh();
			}
		});
	}
	
	@Override
	protected IFigure createFigure() {
		return new PageFigure(model);
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
				System.out.println("child1 " + child);
				System.out.println("after1 " + after);
				return null;
			}
			
			@Override
			protected Command createAddCommand(EditPart child, EditPart after) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
		NonResizableEditPolicy selectionPolicy = new NonResizableEditPolicy();
		selectionPolicy.setDragAllowed(true);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		// TODO Auto-generated method stub
		return new DragEditPartsTracker(this){
			@Override
			protected EditPart getTargetEditPart() {
				//System.out.println(super.getTargetEditPart());
				return super.getTargetEditPart();
			}
		};
	}
}
