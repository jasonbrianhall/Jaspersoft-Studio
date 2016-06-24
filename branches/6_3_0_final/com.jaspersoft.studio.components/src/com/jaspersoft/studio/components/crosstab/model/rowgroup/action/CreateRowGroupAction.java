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
package com.jaspersoft.studio.components.crosstab.model.rowgroup.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.JSSCompoundCommand;
import com.jaspersoft.studio.components.Activator;
import com.jaspersoft.studio.components.crosstab.messages.Messages;
import com.jaspersoft.studio.components.crosstab.model.CrosstabUtil;
import com.jaspersoft.studio.components.crosstab.model.MCrosstab;
import com.jaspersoft.studio.components.crosstab.model.cell.wizard.CrosstabGroupWizard;
import com.jaspersoft.studio.components.crosstab.model.crosstab.command.LazyCrosstabLayoutCommand;
import com.jaspersoft.studio.components.crosstab.model.dialog.ApplyCrosstabStyleAction;
import com.jaspersoft.studio.components.crosstab.model.rowgroup.MRowGroups;
import com.jaspersoft.studio.components.crosstab.model.rowgroup.command.CreateRowCommand;
import com.jaspersoft.studio.editor.action.ACachedSelectionAction;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MRoot;

import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabBucket;
import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabRowGroup;
import net.sf.jasperreports.crosstabs.type.CrosstabTotalPositionEnum;
import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStyle;

/**
 * Class to create a new row group. It open a wizard to define the group name and
 * expression and if it is closed with Finish the group is created and the crosstab
 * re-layout.
 * 
 * @author Orlandin Marco
 */
public class CreateRowGroupAction extends ACachedSelectionAction {

	/** The Constant ID. */
	public static final String ID = "create_rowgroup"; //$NON-NLS-1$

	/**
	 * Constructs a <code>CreateAction</code> using the specified part.
	 * 
	 * @param part
	 *          The part for this action
	 */
	public CreateRowGroupAction(IWorkbenchPart part) {
		super(part);
		setText(Messages.CreateRowGroupAction_create_row_group);
		setToolTipText(Messages.CreateRowGroupAction_create_row_group_tool_tip);
		setId(CreateRowGroupAction.ID);
		setImageDescriptor(Activator.getDefault().getImageDescriptor("icons/add-crosstabrows-16.png"));
		setDisabledImageDescriptor(Activator.getDefault().getImageDescriptor("icons/add-crosstabrows-16.png"));
	}
	
	@Override
	public void run() {
		MCrosstab crosstab = null;
		Object selected = getSelectedObjects().get(0);
		if (selected instanceof EditPart) {
			EditPart part = (EditPart) selected;
			if (part.getModel() instanceof INode) crosstab = getCrosstab((INode)part.getModel());
		} 
		if (crosstab != null){
			CrosstabGroupWizard crosstabGroupWizard = new CrosstabGroupWizard(crosstab);
			WizardDialog dialog = new WizardDialog(UIUtils.getShell(), crosstabGroupWizard);
			if (dialog.open() == IDialogConstants.OK_ID){
				JSSCompoundCommand cmd = new JSSCompoundCommand("Create Row Group", null);
				JRDesignCrosstabRowGroup jrGroup = CrosstabUtil.createRowGroup(crosstab.getJasperDesign(), crosstab.getValue(),
																				crosstabGroupWizard.getGroupName(),
																				CrosstabTotalPositionEnum.END);
				JRDesignCrosstabBucket bucket = (JRDesignCrosstabBucket)jrGroup.getBucket();
				bucket.setExpression(new JRDesignExpression(crosstabGroupWizard.getGroupExpression()));
				bucket.setValueClassName(crosstabGroupWizard.getGroupValueClass());
				cmd.add(new CreateRowCommand(crosstab, jrGroup, -1));
				cmd.setReferenceNodeIfNull(crosstab);
				cmd.add(new LazyCrosstabLayoutCommand(crosstab));
				execute(cmd);
				
				ApplyCrosstabStyleAction applyStyle = new ApplyCrosstabStyleAction(new ArrayList<JRDesignStyle>(), crosstab.getValue());
				applyStyle.rebuildStylesFromCrosstab();
				applyStyle.applayStyle(crosstab.getJasperDesign());
			}
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
	
	@Override
	public boolean isEnabled() {
		List<Object> elements = editor.getSelectionCache().getSelectionModelForType(MCrosstab.class);
		if (elements.size() == 1) return true;
		elements = editor.getSelectionCache().getSelectionModelForType(MRowGroups.class);
		if (elements.size() == 1) return true;
		return false;
	}

}
