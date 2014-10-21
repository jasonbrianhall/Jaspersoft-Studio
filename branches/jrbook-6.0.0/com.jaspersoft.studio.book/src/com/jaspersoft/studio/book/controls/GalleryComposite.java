/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.book.controls;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.dnd.TemplateTransfer;
import org.eclipse.nebula.widgets.gallery.Gallery;
import org.eclipse.nebula.widgets.gallery.GalleryItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import com.jaspersoft.studio.book.commands.CreateElementCommand;
import com.jaspersoft.studio.book.commands.DeleteItemCommand;
import com.jaspersoft.studio.book.commands.MoveElementAfter;
import com.jaspersoft.studio.book.controls.render.DraggableGalleryItemRenderer;
import com.jaspersoft.studio.book.controls.render.DraggableGroupRenderer;
import com.jaspersoft.studio.book.controls.render.PageDragSourceEffect;

/**
 * Control to show a gallery where it is possible to add\remove elements and order them by 
 * drag and drop. Support the commands to allow and easy undo\redo of the operations. Allow to
 * add a listener that is called each time in the gallery something changes
 * 
 * @author Orlandin Marco
 *
 */
public class GalleryComposite extends Composite {
	
	/**
	 * Default height for the images in the gallery
	 */
	private static final int GALLERY_HEIGHT = 100;

	/**
	 * Default width for the images in the gallery
	 */
	private static final int GALLERY_WIDTH = 100;
	
	/**
	 * List of listeners to call when something in the gallery changes
	 */
	private List<ModifyListener> modifyListeners = new ArrayList<ModifyListener>();
	
	/**
	 * List of the gallery content
	 */
	private List<IGalleryElement> elements = new ArrayList<IGalleryElement>();
	
	/**
	 * The gallery control
	 */
	private Gallery pageGallery;
	
	/**
	 * The root element of the gallery
	 */
	private GalleryItem elementGroups;
	
	/**
	 * The effect to show during the drag and drop to show a miniature of 
	 * the moved element under the mouse pointer 
	 */
	private PageDragSourceEffect dragSourceEffect;
	
	/**
	 * container where the informations about the drop target effect are placed
	 */
	private DropLocation dropTargetEffect = new DropLocation();
	
	/**
	 * Stack to execute the command on the gallery
	 */
	private CommandStack stack = new CommandStack();
	
	/**
	 * The delete action to delete an entry on the gallery
	 */
	protected MenuItem deleteAction = null;
	
	/**
	 * Handler for the right click of the gallery, if the right click is outside an element then
	 * the selected element will be deselected and the delete and update actions (if present) will 
	 * be disabled
	 */
	protected class GalleryRightClick implements MouseListener {

		public GalleryRightClick(){}
		
		@Override
		public void mouseUp(MouseEvent e) {	
		}
		
		@Override
		public void mouseDown(MouseEvent e) {
			boolean allDeselected = (e.button == 3 && pageGallery.getItem(new Point(e.x,e.y))==null);
			if (allDeselected) pageGallery.deselectAll();
			if (deleteAction != null) deleteAction.setEnabled(!allDeselected);
		}
		
		@Override
		public void mouseDoubleClick(MouseEvent e) {
		}
	}
	
	/**
	 * Create the control
	 * 
	 * @param parent the parent container
	 * @param style the style of the main composite
	 */
	public GalleryComposite(Composite parent, int style) {
		super(parent, style);
		createControl();
	}
	
	/**
	 * Create the gallery and attach to it the various render and drag and drop support
	 */
	private void createControl() {
		setLayout(new GridLayout(1,false));
		pageGallery = new Gallery(this, SWT.VIRTUAL | SWT.V_SCROLL | SWT.BORDER);
		pageGallery.setLayoutData(new GridData(GridData.FILL_BOTH));
		elementGroups = new GalleryItem(pageGallery, SWT.NONE);
		
		//Set the drag feedback render
		DraggableGroupRenderer gr = new DraggableGroupRenderer();
		gr.setMinMargin(2);
		gr.setItemSize(GALLERY_WIDTH, GALLERY_HEIGHT);
		gr.setAutoMargin(true);
		gr.setDropTargetLocation(dropTargetEffect);
		pageGallery.setGroupRenderer(gr);
		DraggableGalleryItemRenderer ir = new DraggableGalleryItemRenderer();
		ir.setShowLabels(true);
		pageGallery.setItemRenderer(ir);
		
		//create the effect on the mouse pointer during the drag and drop
		dragSourceEffect = new PageDragSourceEffect(pageGallery, GALLERY_WIDTH, GALLERY_HEIGHT);	
		
		//Add the drag 
		Transfer[] types = new Transfer[] { TemplateTransfer.getInstance() };
		DragSource galleryDragSource = new DragSource(pageGallery, DND.DROP_MOVE);
		galleryDragSource.setTransfer(types);
		galleryDragSource.setDragSourceEffect(dragSourceEffect);
		galleryDragSource.addDragListener(new DragSourceListener() {
			
			@Override
			public void dragStart(DragSourceEvent event) {
			}
			
			@Override
			public void dragSetData(DragSourceEvent event) {
			}
			
			@Override
			public void dragFinished(DragSourceEvent event) {
			}
		});
		
		//add the drop support
		DropTarget gallryDropTarget = new DropTarget(pageGallery, DND.DROP_MOVE);
		gallryDropTarget.setTransfer(types);
		gallryDropTarget.addDropListener(new DropTargetListener() {
			
			@Override
			public void dropAccept(DropTargetEvent event) {
			}
			
			/**
			 * Execute the drop operation 
			 */
			@Override
			public void drop(DropTargetEvent event) {
				DropLocation location = new DropLocation();
				getDropLocation(event.x, event.y, location);
				if (location.isValid()){
					GalleryItem movedItem = pageGallery.getSelection()[0];
					if (location.isPlacedAfter()){
						 placeAfter(location.getItem(), movedItem);
					} else {
						placeBefore(location.getItem(), movedItem);
					}
					callModifyLiteners();
				}
				dragSourceEffect.disposeImage();
				dropTargetEffect.setItem(null);
				pageGallery.redraw();
			}
			
			/**
			 * Update the drag feedback and request the repaint if it is 
			 * different from the last one
			 */
			@Override
			public void dragOver(DropTargetEvent event) {
				DropLocation currentDrop = new DropLocation();
				getDropLocation(event.x, event.y, currentDrop);
				if (!currentDrop.equals(dropTargetEffect)){
					dropTargetEffect.setItem(currentDrop.getItem());
					dropTargetEffect.setPlaceAfer(currentDrop.isPlacedAfter());
					pageGallery.redraw();
				}
			}
			
			@Override
			public void dragOperationChanged(DropTargetEvent event) {
			}
			
			@Override
			public void dragLeave(DropTargetEvent event) {
			}
			
			@Override
			public void dragEnter(DropTargetEvent event) {
			}
		});

		//Create the popoup menu for the gallery
	  Menu popupMenu = new Menu(pageGallery);
	  pageGallery.setMenu(popupMenu);
	  pageGallery.addMouseListener(new GalleryRightClick());
	  initializeDeleteAction();
	}
	
	/**
	 * Calculate the current drop location on the gallery basing on the mouse pointer
	 * position. all the informations are saved inside the currentLocation parameter.
	 * Use the isValid on the modified currentLocation to know if the drop position is valid
	 * An invalid position it is because it is outside the gallery or consecutive to the current
	 * position of the dragged element
	 * 
	 * @param currentX current x position of the mouse
	 * @param currentY current y position of the mouse
	 * @param currentLocation container where the target location will be saved
	 */
	private void getDropLocation(int currentX, int currentY, DropLocation currentLocation) {
		Point pt = getShell().getDisplay().map(null, pageGallery, currentX, currentY);
		currentLocation.setItem(null);
		
		if (pageGallery.getBounds().contains(pt) && pageGallery.getSelection().length>0) {

			GalleryItem currentItem = pageGallery.getItem(pt);
			GalleryItem movedItem = pageGallery.getSelection()[0];
			if (currentItem == null) {
				int multiplier = 1;
				while (multiplier < 10) {
					Point ptLeft = new Point(pt.x - (5 * multiplier), pt.y);
					Point ptRight = new Point(pt.x + (5 * multiplier), pt.y);

					GalleryItem itemLeft = pageGallery.getItem(ptLeft);

					if (itemLeft != null) {
						currentLocation.setItem(itemLeft);
						currentLocation.setPlaceAfer(true);
						break;
					}

					GalleryItem itemRight = pageGallery.getItem(ptRight);
					if (itemRight == movedItem) return;
					
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
				if (currentLocation.getItem() == movedItem){
					currentLocation.setItem(null);
				} else if (currentLocation.isPlacedAfter()){
					int index = elementGroups.indexOf(currentLocation.getItem());
					if (index != elementGroups.getItemCount()-1){
						GalleryItem nextItem = elementGroups.getItem(index+1);
						if (nextItem == movedItem) currentLocation.setItem(null);
					}
				} else {
					int index = elementGroups.indexOf(currentLocation.getItem());
					if (index != 0){
						GalleryItem previousItem = elementGroups.getItem(index-1);
						if (previousItem == movedItem) currentLocation.setItem(null);
					}
				}
			}
		}
	}
	
	/**
	 * Call all the defined modify listeners
	 */
	private void callModifyLiteners(){
		Event e = new Event();
		e.widget = pageGallery;
		e.data = elements;
		ModifyEvent event = new ModifyEvent(e);
		for(ModifyListener listener : modifyListeners){
			listener.modifyText(event);
		}
	}
	
	/**
	 * Move an element after another one and return the result of the operation.
	 * The movement is done with commands, so it can be undone
	 * 
	 * @param afterItem element after the one the moved item should be placed
	 * @param movedItem the moved element
	 * @return true if the move operation can be done, false otherwise
	 */
	private boolean placeAfter(GalleryItem afterItem, GalleryItem movedItem){
			if (afterItem == movedItem) return false;
			MoveElementAfter moveAfterCommand = new MoveElementAfter((IGalleryElement)afterItem.getData(), (IGalleryElement)movedItem.getData(), this);
			stack.execute(moveAfterCommand);
			return true;
	}
	
	/**
	 * Move an element before another one and return the result of the operation.
	 * The movement is done with commands, so it can be undone
	 * 
	 * @param beforeItem element before the one the moved item should be placed
	 * @param movedItem the moved element
	 * @return true if the move operation can be done, false otherwise
	 */
	private boolean placeBefore(GalleryItem beforeItem, GalleryItem movedItem){
		if (beforeItem == movedItem) return false;
		IGalleryElement beforeItemContainer = (IGalleryElement)beforeItem.getData();
		int beforeItemIndex = elements.indexOf(beforeItemContainer);
		if (beforeItemIndex == 0){
			MoveElementAfter moveAfterCommand = new MoveElementAfter(null, (IGalleryElement)movedItem.getData(), this);
			stack.execute(moveAfterCommand);
		} else {
			beforeItemContainer = elements.get(beforeItemIndex-1);
			MoveElementAfter moveAfterCommand = new MoveElementAfter(beforeItemContainer, (IGalleryElement)movedItem.getData(), this);
			stack.execute(moveAfterCommand);
		}
		return true;
	}

	/**
	 * Create an item inside the gallery. The item is not created with a command
	 * so it can't be undone
	 * 
	 * @param element the element to create
	 * @param index index of the element or -1 if it must placed in the last position
	 */
	public void createItem(IGalleryElement element, int index){
		GalleryItem item = null;
		if (index != -1){
			item = new GalleryItem(elementGroups, SWT.NONE, index);
			elements.add(index, element);
		} else {
			item = new GalleryItem(elementGroups, SWT.NONE);
			elements.add(element);
		}
		item.setText(element.getTitle());
		item.setData(element);
		Image elementImage = element.getImage();
		item.setImage(elementImage);
		item.setSelectedImage(elementImage);
	}
	
	/**
	 * Remove an item from the gallery. The item is not created with a command
	 * so it can't be undone
	 * 
	 * @param index index of the element or -1 if it must placed in the last position
	 * @return the removed element 
	 */
	public IGalleryElement removeItem(int index){
		IGalleryElement removedElement = elements.remove(index);
		elementGroups.remove(index);
		return removedElement;
	}
	
	/**
	 * Add a listener to the gallery that is called when something inside
	 * changes
	 * 
	 * @param listener a not null listener
	 */
	public void addModifyListener(ModifyListener listener){
		modifyListeners.add(listener);
	}
	
	/**
	 * Remove a modify listener from the list 
	 * 
	 * @param listener a reference to the listener to remove
	 * @return true if the listener was removed, false otherwise
	 */
	public boolean removeModifyListener(ModifyListener listener){
		if (modifyListeners.contains(listener)){
			modifyListeners.remove(listener);
			return true;
		}
		return false;
	}
	
	/**
	 * Return the number of elements inside the gallery
	 * 
	 * @return a not negative number
	 */
	public int getContentSize(){
		return elementGroups.getItemCount();
	}
	
	/**
	 * Return the index of a specific element in the gallery
	 * 
	 * @param container the element
	 * @return the index in the gallery or -1 if it can't be found
	 */
	public int getIndexOf(IGalleryElement container){
		return elements.indexOf(container);
	}
	
	/**
	 * Return an item inside a specific position in the gallery
	 * 
	 * @param index the position of the item
	 * @return a not null item
	 */
	public IGalleryElement getElementAt(int index){
		return elements.get(index);
	}
	
	/**
	 * Add a list of elements to the gallery. The elements are added with a command, so this
	 * can be undone
	 * 
	 * @param elements a not null list of elements.
	 */
	public void addElements(List<IGalleryElement> elements){
		int oldElementsSize = elements.size();
		CompoundCommand cCommand = new CompoundCommand();
		for(IGalleryElement selectedContainer : elements){
			CreateElementCommand createCommand = new CreateElementCommand(GalleryComposite.this, selectedContainer, -1);
			cCommand.add(createCommand);
		}
		stack.execute(cCommand);
		pageGallery.redraw();
		if (oldElementsSize != elements.size()) callModifyLiteners();
	}
	
	/**
	 * Create a contextual delete action for an item in the gallery. The item
	 * is removed with a command so this can be undone
	 */
	protected void initializeDeleteAction(){
	    deleteAction = new MenuItem(pageGallery.getMenu(), SWT.NONE);
	    deleteAction.setText("Delete");
	    deleteAction.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    		CompoundCommand cc = new CompoundCommand();
	    		for(GalleryItem item : pageGallery.getSelection()){
	    			DeleteItemCommand deleteCommand = new DeleteItemCommand(GalleryComposite.this, (IGalleryElement)item.getData());
	    			cc.add(deleteCommand);
	    		}
	    		stack.execute(cc);
	    	}
		});   
	}
	
	/**
	 * Undo the last command
	 */
	public void undo(){
		if (stack.canUndo()) {
			stack.undo();
			callModifyLiteners();
		}
	}
	
	/**
	 * Redo the last undone command
	 */
	public void redo(){
		if (stack.canRedo()) {
			stack.redo();
			callModifyLiteners();
		}
	}
}
