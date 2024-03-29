/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.model.field.command;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignField;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Display;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.field.MField;
import com.jaspersoft.studio.model.field.MFields;
import com.jaspersoft.studio.utils.ModelUtils;

/*
 * link nodes & together.
 * 
 * @author Chicu Veaceslav
 */
public class CreateFieldCommand extends Command {

	/** The jr field. */
	private JRDesignField jrField;

	/** The jr data set. */
	private JRDesignDataset jrDataSet;

	/** The index. */
	private int index;

	/**
	 * Instantiates a new creates the field command.
	 * 
	 * @param destNode
	 *          the dest node
	 * @param srcNode
	 *          the src node
	 * @param index
	 *          the index
	 */
	public CreateFieldCommand(MFields destNode, MField srcNode, int index) {
		super();
		this.jrDataSet = (JRDesignDataset) destNode.getValue();
		this.index = index;
		if (srcNode != null && srcNode.getValue() != null)
			this.jrField = (JRDesignField) srcNode.getValue().clone();
	}

	public CreateFieldCommand(JRDesignDataset destNode, JRDesignField srcNode, int index) {
		super();
		this.jrDataSet = destNode;
		this.index = index;
		if (srcNode != null){
			this.jrField = (JRDesignField)srcNode.clone();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		if (jrField == null) {
			this.jrField = MField.createJRField(jrDataSet);
		} 
		if (jrField != null) {
			if (index < 0)
				index = jrDataSet.getFieldsList().size();
			try {
				if (index < 0 || index > jrDataSet.getFieldsList().size())
					jrDataSet.addField(jrField);
				else
					jrDataSet.addField(index, jrField);
			} catch (JRException e) {
				e.printStackTrace();
				if (e.getMessage().startsWith("Duplicate declaration")) { //$NON-NLS-1$
					String defaultName = "CopyOf_" + jrField.getName();
					if (jrDataSet.getFieldsMap().containsKey(defaultName)){
						defaultName = ModelUtils.getDefaultName(jrDataSet.getFieldsMap(), defaultName + "_"); //$NON-NLS-1$
					}
					
					InputDialog dlg = new InputDialog(Display.getCurrent().getActiveShell(),Messages.CreateFieldCommand_field_name, Messages.CreateFieldCommand_field_name_text_dialog, defaultName,
							null);
					if (dlg.open() == InputDialog.OK) {
						jrField.setName(dlg.getValue());
						execute();
					}
				}
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
		jrDataSet.removeField(jrField);
	}
}
