/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.toolbars;

import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import com.jaspersoft.studio.JSSCompoundCommand;
import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.outline.OutlineTreeEditPartFactory;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.MGraphicElement;

/**
 * Create the toolbar buttons to change the order of the elements
 * 
 * @author Orlandin Marco
 *
 */
public class OrderContributionItem extends CommonToolbarHandler{
	
	/**
	 * Enumeration used internally to associate to a every button a 
	 * specific movement
	 *
	 */
	private enum ORDER_TYPE{FORWARD, BACKWARD, TOP, BOTTOM};
	
	/**
	 * Selection listener that create the right command when a button is pushed
	 */
	private SelectionAdapter pushButtonPressed = new SelectionAdapter() {
		
	
		public void widgetSelected(SelectionEvent e) {
			List<Object> selection = getSelectionForType(MGraphicElement.class);
			if (selection.isEmpty())
				return;
			
			JSSCompoundCommand compoundCmd = null;
			if (ORDER_TYPE.FORWARD.equals(e.widget.getData(WIDGET_DATA_KEY))){
				compoundCmd = generateBringForwardCommand(selection);
			} else if (ORDER_TYPE.BACKWARD.equals(e.widget.getData(WIDGET_DATA_KEY))){
				compoundCmd = generateBringBackwardCommand(selection);
			} else if (ORDER_TYPE.TOP.equals(e.widget.getData(WIDGET_DATA_KEY))){
				compoundCmd = generateBringTopCommand(selection);
			} else if (ORDER_TYPE.BOTTOM.equals(e.widget.getData(WIDGET_DATA_KEY))){
				compoundCmd = generateBringBottomCommand(selection);
			}
			
			if (compoundCmd != null){
				CommandStack cs = getCommandStack();
				cs.execute(compoundCmd);
			}
		}
	};
	
	@Override
	protected Control createControl(Composite parent) {
		ToolBar buttons = new ToolBar(parent, SWT.FLAT | SWT.WRAP);
		
		ToolItem moveButton = new ToolItem(buttons, SWT.PUSH);
		moveButton.setImage(JaspersoftStudioPlugin.getInstance().getImage("icons/eclipseapps/elcl16/bring_forward.gif"));
		moveButton.setData(WIDGET_DATA_KEY, ORDER_TYPE.FORWARD);
		moveButton.setToolTipText(Messages.BringForwardAction_bring_forward_tool_tip);
		moveButton.addSelectionListener(pushButtonPressed);
		
		moveButton = new ToolItem(buttons, SWT.PUSH);
		moveButton.setImage(JaspersoftStudioPlugin.getInstance().getImage("icons/eclipseapps/elcl16/send_to_back.gif"));
		moveButton.setData(WIDGET_DATA_KEY, ORDER_TYPE.BACKWARD);
		moveButton.setToolTipText(Messages.BringBackwardAction_send_backward_tool_tip);
		moveButton.addSelectionListener(pushButtonPressed);
		
		moveButton = new ToolItem(buttons, SWT.PUSH);
		moveButton.setImage(JaspersoftStudioPlugin.getInstance().getImage("icons/eclipseapps/elcl16/bring_to_front.gif"));
		moveButton.setData(WIDGET_DATA_KEY, ORDER_TYPE.TOP);
		moveButton.setToolTipText(Messages.BringToFrontAction_bring_to_front_tool_tip);
		moveButton.addSelectionListener(pushButtonPressed);
		
		moveButton = new ToolItem(buttons, SWT.PUSH);
		moveButton.setImage(JaspersoftStudioPlugin.getInstance().getImage("icons/eclipseapps/elcl16/send_backward.gif"));
		moveButton.setData(WIDGET_DATA_KEY, ORDER_TYPE.BOTTOM);
		moveButton.setToolTipText(Messages.BringToBackAction_send_to_back_tool_tip);
		moveButton.addSelectionListener(pushButtonPressed);
		
		return buttons;
	}
	
	@Override
	protected boolean fillWithToolItems(ToolBar parent) {
		ToolItem moveForward = new ToolItem(parent, SWT.PUSH);
		moveForward.setImage(JaspersoftStudioPlugin.getInstance().getImage("icons/eclipseapps/elcl16/bring_forward.gif"));
		moveForward.setData(WIDGET_DATA_KEY, ORDER_TYPE.FORWARD);
		moveForward.setToolTipText(Messages.BringForwardAction_bring_forward_tool_tip);
		moveForward.addSelectionListener(pushButtonPressed);
		getToolItems().add(moveForward);
		
		ToolItem moveBackward = new ToolItem(parent, SWT.PUSH);
		moveBackward.setImage(JaspersoftStudioPlugin.getInstance().getImage("icons/eclipseapps/elcl16/send_to_back.gif"));
		moveBackward.setData(WIDGET_DATA_KEY, ORDER_TYPE.BACKWARD);
		moveBackward.setToolTipText(Messages.BringBackwardAction_send_backward_tool_tip);
		moveBackward.addSelectionListener(pushButtonPressed);
		getToolItems().add(moveBackward);
		
		ToolItem moveTop = new ToolItem(parent, SWT.PUSH);
		moveTop.setImage(JaspersoftStudioPlugin.getInstance().getImage("icons/eclipseapps/elcl16/bring_to_front.gif"));
		moveTop.setData(WIDGET_DATA_KEY, ORDER_TYPE.TOP);
		moveTop.setToolTipText(Messages.BringToFrontAction_bring_to_front_tool_tip);
		moveTop.addSelectionListener(pushButtonPressed);
		getToolItems().add(moveTop);
		
		ToolItem moveBottom = new ToolItem(parent, SWT.PUSH);
		moveBottom.setImage(JaspersoftStudioPlugin.getInstance().getImage("icons/eclipseapps/elcl16/send_backward.gif"));
		moveBottom.setData(WIDGET_DATA_KEY, ORDER_TYPE.BOTTOM);
		moveBottom.setToolTipText(Messages.BringToBackAction_send_to_back_tool_tip);
		moveBottom.addSelectionListener(pushButtonPressed);
		getToolItems().add(moveBottom);
		
		return true;
	}
	
	@Override
	public boolean isVisible() {
		if (!super.isVisible()) return false;
		List<Object> selection = getSelectionForType(MGraphicElement.class);
		return selection.size() > 0;
	}
	
	private JSSCompoundCommand generateBringForwardCommand(List<Object> selection){
		JSSCompoundCommand compoundCmd = new JSSCompoundCommand("Move Elements", null);
		Command cmd = null;
		for(Object model : selection){
			ANode parent = (ANode) ((MGraphicElement) model).getParent();
			compoundCmd.setReferenceNodeIfNull(parent);
			if (parent != null && parent.getChildren() != null) {
				int newIndex = parent.getChildren().indexOf(model) + 1;
				if (newIndex < parent.getChildren().size()) {
					cmd = OutlineTreeEditPartFactory.getReorderCommand((ANode) model, parent, newIndex);
				} else
					return null;
				if (cmd != null)
					compoundCmd.add(cmd);
			}
		}
		return compoundCmd;
	}
	
	private JSSCompoundCommand generateBringBackwardCommand(List<Object> selection){
		JSSCompoundCommand compoundCmd = new JSSCompoundCommand("Move Elements", null);
		Command cmd = null;
		for(Object model : selection){
				ANode parent = (ANode) ((MGraphicElement) model).getParent();
				compoundCmd.setReferenceNodeIfNull(parent);
				if (parent == null) return null;
				int newIndex = parent.getChildren().indexOf(model) - 1;
				if (newIndex >= 0) {
					cmd = OutlineTreeEditPartFactory.getReorderCommand((ANode) model, parent, newIndex);
				} else
					return null;
				if (cmd != null)
					compoundCmd.add(cmd);
		}
		return compoundCmd;
	}
	
	private JSSCompoundCommand generateBringTopCommand(List<Object> selection){
		JSSCompoundCommand compoundCmd = new JSSCompoundCommand("Move Elements", null);
		Command cmd = null;
		int j = 0;
		for (Object model : selection) {
			ANode parent = (ANode) ((MGraphicElement) model).getParent();
			compoundCmd.setReferenceNodeIfNull(parent);
			if (parent != null) {
				int newIndex = parent.getChildren().size() - 1;
				if (parent.getChildren().indexOf(model) < parent.getChildren().size() - 1) {
					cmd = OutlineTreeEditPartFactory.getReorderCommand((ANode) model, parent, newIndex - j);
					j++;
				} else return null;
				if (cmd != null)
					compoundCmd.add(cmd);
			}
		}
		return compoundCmd;
	}
	
	private JSSCompoundCommand generateBringBottomCommand(List<Object> selection){
		JSSCompoundCommand compoundCmd = new JSSCompoundCommand("Move Elements", null);
		Command cmd = null;
		int j = 0;
		for (Object model : selection) {
			ANode parent = (ANode) ((MGraphicElement) model).getParent();
			compoundCmd.setReferenceNodeIfNull(parent);
			if (parent != null && parent.getChildren().indexOf(model) > 0) {
				cmd = OutlineTreeEditPartFactory.getReorderCommand((ANode) model, parent, j);
				j++;
			} else return null;
			
			if (cmd != null)
					compoundCmd.add(cmd);
		}
		return compoundCmd;
	}
}
