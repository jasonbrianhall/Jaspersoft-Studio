/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, 
 * the following license terms apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.editor.dnd;

import java.util.ArrayList;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.design.JRDesignImage;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.type.BandTypeEnum;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.gef.parts.band.BandEditPart;
import com.jaspersoft.studio.editor.palette.JDCreationTool;
import com.jaspersoft.studio.editor.palette.JDPaletteCreationFactory;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.DialogEnabledCommand;
import com.jaspersoft.studio.model.IContainer;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.model.band.MBand;
import com.jaspersoft.studio.model.command.CreateElementCommand;
import com.jaspersoft.studio.model.field.MField;
import com.jaspersoft.studio.model.image.command.dialog.ImageCreationDialog;
import com.jaspersoft.studio.model.text.MStaticText;
import com.jaspersoft.studio.preferences.DesignerPreferencePage;

/**
 * Custom transfer drop listener for DND operations that supports 
 * the {@link DialogEnabledCommand} commands.
 * <p>
 * 
 * The code in the {@link #handleDrop()} method is similar to the one used in 
 * {@link JDCreationTool#performCreation(int)}. We want to emulate the same behavior.<br/>
 * A working example for this situation is the {@link ImageCreationDialog} that is
 * popup when creating an {@link JRDesignImage} element. 
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 * @see DialogEnabledCommand
 *
 */
public class JSSTemplateTransferDropTargetListener extends TemplateTransferDropTargetListener {

	public JSSTemplateTransferDropTargetListener(EditPartViewer viewer) {
		super(viewer);
	}
	
	@Override
	protected CreationFactory getFactory(Object template) {
		return new JDPaletteCreationFactory(template);
	}

	/**
	 * Check if at the report was added a Field and if it it was added into the detail band.
	 * In this case it can create a static text as title for the field, and pace it into the 
	 * column header or in the detail (if in the column header there isn't enough space). The Static 
	 * Text creation behavior is specified by a properties read from the preference store
	 * 
	 * @param previusCommand the command that create the filed, must be a CompundCommand that contains
	 * the create element command
	 */
	private void createLabelForField(Command previusCommand){
		Request target = getTargetRequest();
		if (target instanceof CreateRequest && ((CreateRequest)target).getNewObject() instanceof ArrayList<?>){
			//Its a creation request, check what it create
			CreateRequest creationReq = (CreateRequest)target;
			ArrayList<?> cretedObjects = ((ArrayList<?>)creationReq.getNewObject());
			if (cretedObjects.size()>0 && cretedObjects.get(0) instanceof MField){
				//I'm creating an MField, check where
				EditPart container = getContainer();
				if (container instanceof BandEditPart &&
														((MBand)container.getModel()).getBandType() == BandTypeEnum.DETAIL){
					
					//I'm creating a field inside the detail band
					MBand band = (MBand) container.getModel();
					//get the column header
					MBand dest = ((MReport)band.getParent()).getBand(BandTypeEnum.COLUMN_HEADER);
					//Create the new element
					MStaticText newText = new MStaticText();
					MField field = (MField)cretedObjects.get(0);
					JRDesignStaticText newTextElement = (JRDesignStaticText)newText.createJRElement(band.getJasperDesign());
					newTextElement.setText(field.getDisplayText());
					newText.setValue(newTextElement);
					//Take the command of the text field to calculate the positions
					CreateElementCommand creatElementC = (CreateElementCommand)((CompoundCommand)previusCommand).getCommands().get(0);
					String dragMessage;
					Rectangle location;
					if (dest == null || dest.getValue() == null || dest.getValue().getHeight() <newText.getDefaultHeight()+2){
						//There isn't enough space in the Column header, the static text will be placed into the detail
						dest = band;
						int x = creatElementC.getLocation().x - band.getBounds().x;
						int y = creatElementC.getLocation().y - band.getBounds().y;
						location = new Rectangle(x,y,newText.getDefaultWidth(),newText.getDefaultHeight());
						location.setX(location.getLocation().x-newText.getDefaultWidth());
						dragMessage = Messages.JSSTemplateTransferDropTargetListener_createLabelMessage1;
					} else {
						//There is enough space in the Column header, the static text will be placed into it
						int x = creatElementC.getLocation().x- band.getBounds().x;
						int y = creatElementC.getLocation().y - band.getBounds().y;
						location = new Rectangle(x,y,newText.getDefaultWidth(),newText.getDefaultHeight());
						location.setY(2);
						dragMessage = Messages.JSSTemplateTransferDropTargetListener_createLabelMessage2;
					}
					
					//Get the behavior for the creation of the static text
					String dragBehavior = JaspersoftStudioPlugin.getInstance().getPreferenceStore().getString(DesignerPreferencePage.BEHAVIOR_ON_FIELD_DROP);
					
					if (dragBehavior.equals(DesignerPreferencePage.BEHAVIOR_ASK_EVERYTIME)){
						//The behavior say to ask to the user
						MessageDialogWithToggle question = MessageDialogWithToggle.open(MessageDialogWithToggle.QUESTION, UIUtils.getShell(), 
																																								Messages.JSSTemplateTransferDropTargetListener_createLabelTitle, 
																																									dragMessage, null, false, null, null, SWT.NONE);
						//Update the behavior with the choice of the user
						if (question.getReturnCode() == IDialogConstants.YES_ID) dragBehavior = DesignerPreferencePage.BEHAVIOR_CREATE_LABEL;
						else dragBehavior = DesignerPreferencePage.BEHAVIOR_DO_NOTHING;
						
						//Check if the choice must be saved
						if (question.getToggleState()) {
							JaspersoftStudioPlugin.getInstance().getPreferenceStore().setValue(DesignerPreferencePage.BEHAVIOR_ON_FIELD_DROP, dragBehavior);
						}
					}
					if (dragBehavior.equals(DesignerPreferencePage.BEHAVIOR_CREATE_LABEL))
							((CompoundCommand)previusCommand).add(new CreateElementCommand(dest, newText, location, -1));
				}
			}
		}
	}
	
	/**
	 * Take an edit part and search it's container if it is not a container. 
	 * 
	 * @return the container of the actual target edit part, if the target edit part is not a container, or 
	 * the target edit part itself otherwise
	 */
	private EditPart getContainer() {
		EditPart target = getTargetEditPart();
		if (!(target instanceof IContainer)){
			ANode parentModel = ((ANode) target.getModel()).getParent();
			// This use the model for the search because every EditPart in the report has the same father.
			for (Object actualChild : target.getParent().getChildren()) {
				EditPart actualChildPart = (EditPart) actualChild;
				if (parentModel == actualChildPart.getModel()) return actualChildPart;
			}
		}
		return target;
	}
	
	@Override
	protected void handleDrop() {
		updateTargetRequest();
		updateTargetEditPart();
		if (getTargetEditPart() != null) {
			Command command = getCommand();
			
			createLabelForField(command);
			
			if(command instanceof DialogEnabledCommand){
				// If we have a special command that supports dialog (i.e: image creation)
				// we'll show the popup dialog and continue with creation only if
				// the user has confirmed.
				if(((DialogEnabledCommand)command).openDialog()==Dialog.CANCEL){
					getCurrentEvent().detail = DND.DROP_NONE;
					return;
				}
			}
			if (command != null && command.canExecute())
				getViewer().getEditDomain().getCommandStack().execute(command);
			else
				getCurrentEvent().detail = DND.DROP_NONE;
		} else
			getCurrentEvent().detail = DND.DROP_NONE;
		selectAddedObject();
	}

	private void selectAddedObject() {
		Object model = getCreateRequest().getNewObject();
		if (model == null)
			return;
		EditPartViewer viewer = getViewer();
		viewer.getControl().forceFocus();
		Object editpart = viewer.getEditPartRegistry().get(model);
		if (editpart instanceof EditPart) {
			// Force a layout first.
			getViewer().flush();
			viewer.select((EditPart) editpart);
		}
	}
	
}
