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
package com.jaspersoft.studio.components.crosstab.model.columngroup.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.JSSCompoundCommand;
import com.jaspersoft.studio.components.Activator;
import com.jaspersoft.studio.components.crosstab.messages.Messages;
import com.jaspersoft.studio.components.crosstab.model.MCrosstab;
import com.jaspersoft.studio.components.crosstab.model.columngroup.MColumnGroup;
import com.jaspersoft.studio.components.crosstab.model.columngroup.MColumnGroups;
import com.jaspersoft.studio.components.crosstab.model.crosstab.command.LazyCrosstabLayoutCommand;
import com.jaspersoft.studio.components.crosstab.model.dialog.ApplyCrosstabStyleAction;
import com.jaspersoft.studio.editor.outline.actions.ACreateAction;
import com.jaspersoft.studio.editor.palette.JDPaletteCreationFactory;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MRoot;

import net.sf.jasperreports.engine.design.JRDesignStyle;
/*
 * The Class CreateGroupAction.
 */
public class CreateColumnGroupAction extends ACreateAction {

	/** The Constant ID. */
	public static final String ID = "create_crosstab_columngroup"; //$NON-NLS-1$

	/**
	 * Constructs a <code>CreateAction</code> using the specified part.
	 * 
	 * @param part
	 *          The part for this action
	 */
	public CreateColumnGroupAction(IWorkbenchPart part) {
		super(part);
		setCreationFactory(new JDPaletteCreationFactory(MColumnGroup.class));
	}
	
	@Override
	public void run() {
		JSSCompoundCommand cmd = new JSSCompoundCommand("Create Column Group", null);
		cmd.add(createCommand());
		MCrosstab crosstab = null;
		Object selected = getSelectedObjects().get(0);
		if (selected instanceof EditPart) {
			EditPart part = (EditPart) selected;
			if (part.getModel() instanceof INode) crosstab = getCrosstab((INode)part.getModel());
		} 
		cmd.setReferenceNodeIfNull(crosstab);
		cmd.add(new LazyCrosstabLayoutCommand(crosstab));
		execute(cmd);
		
		if (crosstab != null){
			ApplyCrosstabStyleAction applyStyle = new ApplyCrosstabStyleAction(new ArrayList<JRDesignStyle>(), crosstab.getValue());
			applyStyle.rebuildStylesFromCrosstab();
			applyStyle.applayStyle(crosstab.getJasperDesign());
		}
	}
	
	public MCrosstab getCrosstab(INode startNode) {
		INode node = startNode;
		while (node != null && node.getParent() != null
				&& !(node instanceof MCrosstab) && !(node instanceof MRoot)) {
			node = node.getParent();
		}
		if (node instanceof MCrosstab)
			return (MCrosstab) node;
		return null;
	}

	/**
	 * Initializes this action's text and images.
	 */
	@Override
	protected void init() {
		super.init();
		setText(Messages.CreateColumnGroupAction_create_column_group);
		setToolTipText(Messages.CreateColumnGroupAction_create_column_group_tool_tip);
		setId(CreateColumnGroupAction.ID);
		setImageDescriptor(Activator.getDefault().getImageDescriptor("icons/add-crosstabcolumns-16.png"));
		setDisabledImageDescriptor(Activator.getDefault().getImageDescriptor("icons/add-crosstabcolumns-16.png"));
		setEnabled(false);
	}
	
	@Override
	public boolean isEnabled() {
		List<Object> elements = editor.getSelectionCache().getSelectionModelForType(MCrosstab.class);
		if (elements.size() == 1) return true;
		elements = editor.getSelectionCache().getSelectionModelForType(MColumnGroups.class);
		if (elements.size() == 1) return true;
		return false;
	}
}
