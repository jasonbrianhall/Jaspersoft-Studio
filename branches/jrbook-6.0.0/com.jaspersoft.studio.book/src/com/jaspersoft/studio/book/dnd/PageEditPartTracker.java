package com.jaspersoft.studio.book.dnd;

import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transposer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.SharedCursors;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.gef.tools.DragEditPartsTracker;
import org.eclipse.swt.graphics.Cursor;

import com.jaspersoft.studio.book.editparts.BookPagesEditPart;
import com.jaspersoft.studio.book.editparts.BookSectionEditPart;

public class PageEditPartTracker extends DragEditPartsTracker {

	private static EditPart afterPart;
	
	private static BookSectionEditPart container;
	
	public PageEditPartTracker(EditPart sourceEditPart) {
		super(sourceEditPart);
	}
	
	private Point getLocationFromRequest(Request request) {
		return ((DropRequest)request).getLocation();
	}

	@Override
	protected void setTargetEditPart(EditPart editpart) {
		if (container != null) container.eraseTargetFeedback();
		afterPart = null;
		container = null;
		if (editpart instanceof BookSectionEditPart){
			container = (BookSectionEditPart)editpart;
			List<?> children = container.getChildren();
			if (container.getChildren().size() == 0) afterPart = null;
			else  {
				Transposer transposer = new Transposer();
				Point pt = transposer.t(getLocationFromRequest(getTargetRequest()));
				int multiplier = 1;
				while (multiplier < 10) {
					Point ptLeft = new PrecisionPoint(pt.x - (5 * multiplier), pt.y);
					Point ptRight = new PrecisionPoint(pt.x + (5 * multiplier), pt.y);

					EditPart itemLeft = container.getViewer().findObjectAt(ptLeft);

					if (itemLeft != null && itemLeft instanceof BookPagesEditPart) {
						afterPart = itemLeft;
						break;
					}

					EditPart itemRight = container.getViewer().findObjectAt(ptRight);
					
					if (itemRight != null && itemRight instanceof BookPagesEditPart) {
						int rightItemIndex = children.indexOf(itemRight);
						if (rightItemIndex == 0) afterPart = null;
						else afterPart = (EditPart)children.get(rightItemIndex-1);
						break;
					}
					multiplier++;
				}
				if (afterPart == null) afterPart = (EditPart)container.getChildren().get(container.getChildren().size()-1);
			}
		} else if (editpart instanceof BookPagesEditPart){
			container = (BookSectionEditPart)editpart.getParent();
			Rectangle elementBounds = ((BookPagesEditPart) editpart).getFigure().getBounds();
			int halfWidth = elementBounds.width / 2;
			Rectangle splitLeft = new Rectangle(elementBounds.x, elementBounds.y, halfWidth, elementBounds.height);
			Point pt = getLocationFromRequest(getTargetRequest());
			List<?> children = container.getChildren();
			if (children.isEmpty()) afterPart = null;
			if (splitLeft.contains(pt)) {
				int currentIndex = children.indexOf(editpart);
				if (currentIndex == 0) afterPart = null;
				else afterPart = (EditPart)children.get(currentIndex-1);
			} else {
				afterPart = editpart;
			}
		}
		//DO THE VALIDATION
		if (container != null && getOperationSet().contains(afterPart)){
			afterPart = null;
			container = null;
		}
		if (container != null && afterPart != null){
			EditPart nextPart = container.getFollowingPart(afterPart);
			if (nextPart != null && getOperationSet().contains(nextPart)){
				afterPart = null;
				container = null;
			}
		}
		System.out.println(container);
		super.setTargetEditPart(container);
	}
	
	public EditPart getAfterPart() {
		return afterPart;
	}

	public BookSectionEditPart getContainer() {
		return container;
	}
	
	@Override
	protected void showTargetFeedback() {
		if (container != null) {
			container.showTargetFeedback(afterPart);
		}
	}
	
	@Override
	protected Cursor calculateCursor() {
		if (container == null) return SharedCursors.NO;
		else return SharedCursors.CURSOR_TREE_ADD;
	}
	
	@Override
	protected void eraseTargetFeedback() {
		if (container != null) {
			container.eraseTargetFeedback();
		}
	}
}
