package com.jaspersoft.studio.book.editparts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.OrderedLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.GroupRequest;

import com.jaspersoft.studio.book.commands.CreatePartAfterCommand;
import com.jaspersoft.studio.book.commands.RemoveChildrenCommand;
import com.jaspersoft.studio.book.dnd.PageEditPartTracker;
import com.jaspersoft.studio.book.editors.figures.BookPagesFigure;
import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;

public class BookPagesEditPart extends AbstractGraphicalEditPart {
	
	private BookPagesFigure figure = null;
	
	private PageEditPartTracker dragTracker;
	
	private PropertyChangeListener updatePart = new PropertyChangeListener() {
		
		@Override
		public void propertyChange(PropertyChangeEvent arg0) {
			refresh();
		}
	};
	
	
	public BookPagesEditPart(){
		dragTracker = new PageEditPartTracker(this);
	}
	
	@Override
	public void setModel(Object model) {
		if (getModel() != null){
			MReportPart bookModel = (MReportPart)getModel();
			bookModel.getPropertyChangeSupport().removePropertyChangeListener(updatePart);
		}
		super.setModel(model);
		if (getModel() != null){
			MReportPart bookModel = (MReportPart)getModel();
			bookModel.getPropertyChangeSupport().addPropertyChangeListener(updatePart);
		}
	}
	
	
	@Override
	protected IFigure createFigure() {
		if (figure == null){
			figure = new BookPagesFigure((MReportPart)getModel());
		}
		return figure;
	}

	@Override
	protected void createEditPolicies() {
	
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new OrderedLayoutEditPolicy() {
			
			@Override
			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
			
			@Override
			protected EditPart getInsertionReference(Request request) {
				return null;
			}
			
			@Override
			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				if (dragTracker.getContainer() != null){
					CompoundCommand cc = new CompoundCommand();
					MReportPartContainer sourceContainer = (MReportPartContainer)child.getParent().getModel();
					MReportPartContainer targetContainer = dragTracker.getContainer().getBookModel();
					MReportPart movedElement = (MReportPart)child.getModel();
					MReportPart afterElement = dragTracker.getAfterPart() != null ? (MReportPart)dragTracker.getAfterPart().getModel() : null;
					RemoveChildrenCommand removeCommand = new RemoveChildrenCommand(sourceContainer, movedElement);
					cc.add(removeCommand);
					CreatePartAfterCommand createCommmand = new CreatePartAfterCommand(targetContainer, movedElement.getValue(), afterElement);
					cc.add(createCommmand);
					return cc;
				}
				return null;
				
			}
			
			@Override
			protected Command createAddCommand(EditPart child, EditPart after) {
				return createMoveChildCommand(child, after);
			}
			
		});
		NonResizableEditPolicy selectionPolicy = new NonResizableEditPolicy();
		selectionPolicy.setDragAllowed(true);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy);
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy() {
			@Override
			protected Command createDeleteCommand(GroupRequest deleteRequest) {
				return new RemoveChildrenCommand((MReportPartContainer) ((MReportPart) getHost().getModel()).getParent(), (MReportPart) getHost().getModel());
			}
		});
	}
	
	@Override
	public Command getCommand(Request request) {
		if (getParent() == null) return null;
		else return super.getCommand(request);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return dragTracker;
	}
	
	@Override
	public void showTargetFeedback(Request request) {
		//If the edit part was removed during the drag it's parent will be null
		if (getParent() != null) getParent().showTargetFeedback(request);
	}
	
	@Override
	public void eraseTargetFeedback(Request request) {
		//it the part was removed during the drag it's parent will be null
		if (getParent() != null) getParent().eraseTargetFeedback(request);
	}
}
