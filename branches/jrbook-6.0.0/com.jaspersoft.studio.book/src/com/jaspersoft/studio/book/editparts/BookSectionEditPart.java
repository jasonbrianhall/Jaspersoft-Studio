package com.jaspersoft.studio.book.editparts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

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

import com.jaspersoft.studio.book.editors.figures.SectionFigure;
import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;
import com.jaspersoft.studio.model.INode;

public class BookSectionEditPart extends AbstractGraphicalEditPart {

	private MReportPartContainer model;
	
	public BookSectionEditPart(MReportPartContainer model){
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
				System.out.println("child2 " + child);
				System.out.println("after2 " + after);
				return null;
			}
			
			@Override
			protected Command createAddCommand(EditPart child, EditPart after) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
		NonResizableEditPolicy selectionPolicy = new NonResizableEditPolicy(){
			protected void showSelection() {};
		};
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
	
	@Override
	public DragTracker getDragTracker(Request request) {
		// TODO Auto-generated method stub
		return new DragEditPartsTracker(this){
		
			@Override
			protected EditPart getTargetEditPart() {
				// TODO Auto-generated method stub
				//System.out.println(super.getTargetEditPart());
				return super.getTargetEditPart();
			}
		};
			
	}
	
	/**
	 * Calculate the current drop location on the gallery basing on the mouse pointer
	 * position. all the informations are saved inside the currentLocation parameter.
	 * Use the isValid on the modified currentLocation to know if the drop position is valid
	 * An invalid position it is because it is outside the gallery or consecutive to the current
	 * position of the dragged element. This is use to calculate the drop position when the moved
	 * element is dragged from a gallery to another
	 * 
	 * @param currentX current x position of the mouse
	 * @param currentY current y position of the mouse
	 * @param currentLocation container where the target location will be saved
	 */
	/*private void getDropLocation(int currentX, int currentY, DropLocation currentLocation) {
		currentLocation.setItem(null);
		for (EditPart part : getChildren()){
		}
			currentLocation.setTargetGallery(lastTargetGallery);
			Display currentDisplay = UIUtils.getDisplay();
			Point pt = currentDisplay.map(null, currentLocation.getTargetGallery(), currentX, currentY);
			GalleryItem currentItem = currentLocation.getTargetGallery().getGallery().getItem(pt);
			GalleryItem movedItem = currentLocation.getSourceGallery().getGallery().getSelection()[0];
			if (currentItem == null) {
				int multiplier = 1;
				Gallery targetGallery = currentLocation.getTargetGallery().getGallery();
				while (multiplier < 10) {
					Point ptLeft = new Point(pt.x - (5 * multiplier), pt.y);
					Point ptRight = new Point(pt.x + (5 * multiplier), pt.y);

					GalleryItem itemLeft = targetGallery.getItem(ptLeft);

					if (itemLeft != null) {
						currentLocation.setItem(itemLeft);
						currentLocation.setPlaceAfer(true);
						break;
					}

					GalleryItem itemRight = targetGallery.getItem(ptRight);
					
					if (itemRight != null) {
						currentLocation.setItem(itemRight);
						currentLocation.setPlaceAfer(false);
						break;
					}
					multiplier++;
				}
			} else if (currentItem != movedItem) {
				Rectangle elementBounds = currentItem.getBounds();
				int halfWidth = elementBounds.width / 2;
				Rectangle splitLeft = new Rectangle(elementBounds.x, elementBounds.y, halfWidth, elementBounds.height);
				if (splitLeft.contains(pt)) {
					currentLocation.setItem(currentItem);
					currentLocation.setPlaceAfer(false);
				} else {
					currentLocation.setItem(currentItem);
					currentLocation.setPlaceAfer(true);
				}
			}
			
			
			if (currentLocation.isValid()){
				GalleryItem galleryRoot = currentLocation.getTargetGallery().getGallery().getItem(0);
				if (currentLocation.getItem() == movedItem){
					currentLocation.setItem(null);
				} else if (currentLocation.isPlacedAfter()){
					int index = galleryRoot.indexOf(currentLocation.getItem());
					if (index != galleryRoot.getItemCount()-1){
						GalleryItem nextItem = galleryRoot.getItem(index+1);
						if (nextItem == movedItem) currentLocation.setItem(null);
					}
				} else {
					int index = galleryRoot.indexOf(currentLocation.getItem());
					if (index != 0){
						GalleryItem previousItem = galleryRoot.getItem(index-1);
						if (previousItem == movedItem) currentLocation.setItem(null);
					}
				}
			}
		}
	}*/
}
