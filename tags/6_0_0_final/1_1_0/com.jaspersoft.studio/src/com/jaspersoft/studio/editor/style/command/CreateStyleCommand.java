/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.editor.style.command;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRSimpleTemplate;
import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignStyle;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Display;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.style.MStyle;
import com.jaspersoft.studio.model.style.MStylesTemplate;
/*
 * link nodes & together.
 * 
 * @author Chicu Veaceslav
 */
public class CreateStyleCommand extends Command {

	private JRDesignStyle jrStyle;

	private JRSimpleTemplate jrDesign;

	/** The index. */
	private int index;

	/**
	 * Instantiates a new creates the style command.
	 * 
	 * @param destNode
	 *          the dest node
	 * @param srcNode
	 *          the src node
	 * @param index
	 *          the index
	 */
	public CreateStyleCommand(MStylesTemplate destNode, MStyle srcNode, int index) {
		super();
		this.jrDesign = (JRSimpleTemplate) destNode.getValue();
		this.index = index;
		if (srcNode != null && srcNode.getValue() != null)
			this.jrStyle = (JRDesignStyle) srcNode.getValue();
	}

	private final static String DEFAULTNAME = "Style";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		if (jrStyle == null) {
			this.jrStyle = new JRDesignStyle();
			jrStyle.setName(DEFAULTNAME);
		}
		if (jrStyle != null) {
			try {
				if (index < 0 || index > jrDesign.getStylesList().size())
					jrDesign.addStyle(jrStyle);
				else
					jrDesign.addStyle(index, jrStyle);
			} catch (JRException e) {
				e.printStackTrace();
				if (e.getMessage().startsWith("Duplicate declaration")) { //$NON-NLS-1$
					String name = null;
					for (int i = 1; i < 1000; i++) {
						JRStyle style = jrDesign.getStyle(DEFAULTNAME + i);
						if (style == null) {
							name = DEFAULTNAME + i;
							break;
						}
					}
					InputDialog dlg = new InputDialog(Display.getCurrent().getActiveShell(),
							Messages.CreateStyleCommand_style_name, Messages.CreateStyleCommand_style_name_dialog_text, name, null);
					if (dlg.open() == InputDialog.OK) {
						jrStyle.setName(dlg.getValue());
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
		jrDesign.removeStyle(jrStyle);
	}
}
