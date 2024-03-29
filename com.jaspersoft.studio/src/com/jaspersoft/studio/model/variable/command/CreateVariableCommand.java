/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.model.variable.command;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignVariable;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.model.variable.MVariable;
import com.jaspersoft.studio.model.variable.MVariables;
import com.jaspersoft.studio.utils.ModelUtils;
/*
 * link nodes & together.
 * 
 * @author Chicu Veaceslav
 */
public class CreateVariableCommand extends Command {

	/** The jr variable. */
	private JRDesignVariable jrVariable;

	/** The jr dataset. */
	private JRDesignDataset jrDataset;

	/** The index. */
	private int index;

	/**
	 * Instantiates a new creates the variable command.
	 * 
	 * @param destNode
	 *          the dest node
	 * @param srcNode
	 *          the src node
	 * @param index
	 *          the index
	 */
	public CreateVariableCommand(MVariables destNode, MVariable srcNode, int index) {
		super();
		this.jrDataset = (JRDesignDataset) destNode.getValue();
		this.index = index;
		if (srcNode != null && srcNode.getValue() != null)
			this.jrVariable = (JRDesignVariable) srcNode.getValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		if (jrVariable == null) {
			this.jrVariable = MVariable.createJRVariable(jrDataset);
		}
		if (jrVariable != null) {
			try {
				if (jrDataset.getVariablesMap().get(jrVariable.getName()) != null) {
					jrVariable.setName(ModelUtils.getDefaultName(jrDataset.getVariablesMap(), jrVariable.getName() + "_"));
				}

				if (index < 0 || index > jrDataset.getVariablesList().size())
					jrDataset.addVariable(jrVariable);
				else
					jrDataset.addVariable(index, jrVariable);
			} catch (JRException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		jrDataset.removeVariable(jrVariable);
	}
}
