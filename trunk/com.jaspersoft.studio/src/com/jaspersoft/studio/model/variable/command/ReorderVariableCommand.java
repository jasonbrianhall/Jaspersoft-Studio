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
package com.jaspersoft.studio.model.variable.command;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRVariable;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignVariable;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.variable.MVariable;
import com.jaspersoft.studio.model.variable.MVariables;
import com.jaspersoft.studio.preferences.DesignerPreferencePage;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

/*
 * /* The Class ReorderVariableCommand.
 */
public class ReorderVariableCommand extends Command {

	/** The new index. */
	private int oldIndex, newIndex;

	/** The jr variable. */
	private JRDesignVariable jrVariable;

	/** The jr dataset. */
	private MVariables parent;

	/**
	 * Instantiates a new reorder variable command.
	 * 
	 * @param child
	 *          the child
	 * @param parent
	 *          the parent
	 * @param newIndex
	 *          the new index
	 */
	public ReorderVariableCommand(MVariable child, MVariables parent, int newIndex) {
		super(Messages.common_reorder_elements);

		this.newIndex = Math.max(0, newIndex);
		this.parent = parent;
		this.jrVariable = (JRDesignVariable) child.getValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		JRDesignDataset jrDataset = parent.getValue();
		oldIndex = jrDataset.getVariablesList().indexOf(jrVariable);
		JasperReportsConfiguration jConfig = parent.getJasperConfiguration();
		boolean showDefaults = jConfig != null? jConfig.getPropertyBoolean(DesignerPreferencePage.P_SHOW_VARIABLES_DEFAULTS, Boolean.TRUE) : true;
		try {
			int i = 0;
			for (JRVariable v : jrDataset.getVariablesList()) {
				if (v.isSystemDefined())
					i++;
				else
					break;
			}
			if (!showDefaults) newIndex+=i;
			else newIndex = Math.max(newIndex, i);
			jrDataset.removeVariable(jrVariable);
			if (newIndex < 0 || newIndex > jrDataset.getVariablesList().size())
				jrDataset.addVariable(jrVariable);
			else
				jrDataset.addVariable(newIndex, jrVariable);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		try {
			JRDesignDataset jrDataset = parent.getValue();
			jrDataset.removeVariable(jrVariable);
			if (oldIndex < 0 || oldIndex > jrDataset.getVariablesList().size())
				jrDataset.addVariable(jrVariable);
			else
				jrDataset.addVariable(oldIndex, jrVariable);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
}
