/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of JasperReports.
 * 
 * JasperReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * JasperReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with JasperReports. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.model.sortfield.command;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignField;
import net.sf.jasperreports.engine.design.JRDesignSortField;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.model.sortfield.MSortField;
import com.jaspersoft.studio.model.sortfield.MSortFields;

/*
 * link nodes & together.
 * 
 * @author Chicu Veaceslav
 */
public class DeleteSortFieldCommand extends Command {

	/** The jr dataset. */
	private JRDesignDataset jrDataset;

	/** The jr field. */
	private JRDesignSortField jrField;

	/** The element position. */
	private int elementPosition = 0;

	/**
	 * Instantiates a new delete field command.
	 * 
	 * @param destNode
	 *          the dest node
	 * @param srcNode
	 *          the src node
	 */
	public DeleteSortFieldCommand(MSortFields destNode, MSortField srcNode) {
		super();
		this.jrDataset = (JRDesignDataset) destNode.getValue();
		this.jrField = (JRDesignSortField) srcNode.getValue();
	}

	public DeleteSortFieldCommand(JRDesignDataset destNode, JRDesignSortField srcNode) {
		super();
		this.jrDataset = destNode;
		this.jrField = srcNode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		elementPosition = jrDataset.getSortFieldsList().indexOf(jrField);
		jrDataset.removeSortField(jrField);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		if (jrDataset == null || jrField == null)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		try {
			if (elementPosition < 0 || elementPosition > jrDataset.getSortFieldsList().size())
				jrDataset.addSortField(jrField);
			else
				jrDataset.addSortField(elementPosition, jrField);
		} catch (JRException e) {
			e.printStackTrace();
		}

	}
}
