package com.jaspersoft.studio.book.editparts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.OrderedLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.gef.tools.DragEditPartsTracker;

import com.jaspersoft.studio.book.editors.figures.PageFigure;
import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;

public class BookPagesEditPart extends AbstractGraphicalEditPart {

	private MReportPart model;
	
	private PageFigure figure = null;
	
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
		if (figure == null){
			figure = new PageFigure(model);
		}
		return figure;
	}

	@Override
	protected void createEditPolicies() {
	
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new OrderedLayoutEditPolicy() {
			
			@Override
			protected Command getCreateCommand(CreateRequest request) {
				// TODO Auto-generated method stub
				return null;
			}
			
			private Point getLocationFromRequest(Request request) {
				return ((DropRequest)request).getLocation();
			}
			
			@Override
			protected EditPart getInsertionReference(Request request) {
				Rectangle elementBounds = figure.getBounds();
				int halfWidth = elementBounds.width / 2;
				Rectangle splitLeft = new Rectangle(elementBounds.x, elementBounds.y, halfWidth, elementBounds.height);
				Point pt = getLocationFromRequest(request);
				//System.out.println("bounds "+elementBounds + " pt "+pt);
				List<?> children = getParent().getChildren();
				if (children.isEmpty()) return null;
				if (splitLeft.contains(pt)) {
					int currentIndex = children.indexOf(BookPagesEditPart.this);
					//System.out.println("left");
					if (currentIndex == 0) return null;
					else return (EditPart)children.get(currentIndex-1);
				} else {
					//System.out.println("right");
					return BookPagesEditPart.this;	
				}
			}
			
			@Override
			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				if (after == child) return null;
				List<?> brothers = getParent().getChildren();
				int afterIndex = brothers.indexOf(after);
				if (afterIndex < (brothers.size()-1) && brothers.get(afterIndex+1) == child) return null;
				CompoundCommand cc = new CompoundCommand();
				MReportPartContainer sourceContainer = (MReportPartContainer)child.getParent().getModel();
				MReportPartContainer targetContainer = (MReportPartContainer)getParent().getModel();
				MReportPart movedElement = (MReportPart)child.getModel();
				MReportPart afterElement = after != null ? (MReportPart)after.getModel() : null;
				RemoveChildrenCommand removeCommand = new RemoveChildrenCommand(sourceContainer, movedElement);
				cc.add(removeCommand);
				CreatePartAfterCommand createCommmand = new CreatePartAfterCommand(targetContainer, movedElement.getValue(), afterElement);
				//System.out.println("create after2 "+afterElement);
				cc.add(createCommmand);
				return cc;
			}
			
			@Override
			protected Command createAddCommand(EditPart child, EditPart after) {
				// TODO Auto-generated method stub
				return createMoveChildCommand(child, after);
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
