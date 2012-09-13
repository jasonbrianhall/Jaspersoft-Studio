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
package com.jaspersoft.studio.plugin;

import java.util.List;

import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignElement;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.part.WorkbenchPart;

import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.editor.report.AbstractVisualEditor;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public interface IComponentFactory {
	public ANode createNode(ANode parent, Object jrObject, int newIndex);

	public List<?> getChildren4Element(Object jrObject);

	public IPaletteContributor getPaletteEntries();

	public IFigure createFigure(final ANode node);

	public EditPart createEditPart(EditPart context, Object model);

	public Command getStretch2Content(ANode node);
	
	public Command getCreateCommand(ANode parent, ANode child, Rectangle location, int newIndex);

	public Command getReorderCommand(ANode parent, ANode child, int newIndex);

	public Command getDeleteCommand(ANode parent, ANode child);

	public Command getOrphanCommand(ANode parent, ANode child);

	public List<Action> getActions(WorkbenchPart part);

	public List<String> getActionsID();

	public AbstractVisualEditor getEditor(Object node, JasperReportsConfiguration jrContext);
	
	/**
	 * Returns a valid {@link ExpressionContext} that can be used inside an expression editor.
	 * 
	 * <p>
	 * The generic <code>jrObject</code> parameter will usually be an {@link ANode} instance,
	 * indicating what is the current report element node being edited.
	 * It's up to the implementors to know how to build a valid expression context from this 
	 * information. Most of the times the custom component will have a dataset/datasetrun 
	 * reference so it will be possible to build a new expression context directly from a
	 * valid {@link JRDesignDataset}.<br>
	 * <b>NOTE:</b> when an expression context can not be created using the node information
	 * (for example no dataset reference), <code>null</code> value is returned. 
	 * In this situation it is up to the implementors try to find a solution (i.e: inspect the
	 * parent node or return a default expression context).
	 * 
	 * @param jrObject the object to be inspected, in order to build the expression context
	 * @return a valid expression context if possible, <code>null</code> otherwise
	 * 
	 * @see ExpressionContext#ExpressionContext(JRDesignDataset, JasperReportsConfiguration)
	 * @see ModelUtils#getElementExpressionContext(JRDesignElement, ANode)
	 */
	public ExpressionContext getElementExpressionContext(Object jrObject);
	
}
