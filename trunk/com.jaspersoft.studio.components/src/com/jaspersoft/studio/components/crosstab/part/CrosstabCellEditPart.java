/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2011 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.components.crosstab.part;

import net.sf.jasperreports.crosstabs.design.JRDesignCellContents;
import net.sf.jasperreports.engine.design.JRDesignElement;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;

import com.jaspersoft.studio.components.crosstab.figure.CellFigure;
import com.jaspersoft.studio.components.crosstab.model.cell.MCell;
import com.jaspersoft.studio.components.crosstab.part.editpolicy.CrosstabCellMoveEditPolicy;
import com.jaspersoft.studio.components.crosstab.part.editpolicy.CrosstabCellResizableEditPolicy;
import com.jaspersoft.studio.editor.gef.commands.SetPageConstraintCommand;
import com.jaspersoft.studio.editor.gef.figures.ReportPageFigure;
import com.jaspersoft.studio.editor.gef.parts.FigureEditPart;
import com.jaspersoft.studio.editor.gef.parts.IContainerPart;
import com.jaspersoft.studio.editor.gef.parts.editPolicy.ElementEditPolicy;
import com.jaspersoft.studio.editor.gef.parts.editPolicy.PageLayoutEditPolicy;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.IGraphicElement;
import com.jaspersoft.studio.model.MGraphicElement;

/*
 * BandEditPart creates the figure for the band. The figure is actually just the bottom border of the band. This allows
 * to drag this border to resize the band. The PageEditPart sets a specific contraint for the BandEditPart elements in
 * order to make them move only vertically. The BandMoveEditPolicy is responsable for the feedback when the band is
 * dragged.
 * 
 * @author Chicu Veaceslav, Giulio Toffoli
 * 
 */
public class CrosstabCellEditPart extends FigureEditPart implements
		IContainerPart {
	@Override
	public Object getAdapter(Class key) {
		return getParent().getAdapter(key);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ElementEditPolicy());

		installEditPolicy(EditPolicy.LAYOUT_ROLE, new PageLayoutEditPolicy() {

			@Override
			protected Command createAddCommand(EditPart child, Object constraint) {
				SetPageConstraintCommand cmd = new SetPageConstraintCommand();
				MGraphicElement model = (MGraphicElement) child.getModel();
				Rectangle r = model.getBounds();
				Rectangle rect = (Rectangle) constraint;

				JRDesignElement jde = (JRDesignElement) model.getValue();
				rect.setLocation(r.x + rect.x - jde.getX() + 1, r.y + rect.y
						- jde.getY() + 1);
				cmd.setContext((ANode) getHost().getModel(),
						(ANode) child.getModel(), rect);

				return cmd;
			}

		});
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE,
				new CrosstabCellMoveEditPolicy());
	}

	@Override
	protected void setupFigure(IFigure rect) {
		MCell model = (MCell) getModel();
		if (model instanceof IGraphicElement && model.getValue() != null) {
			Rectangle bounds = ((IGraphicElement) model).getBounds();
			int x = bounds.x + ReportPageFigure.PAGE_BORDER.left;
			int y = bounds.y + ReportPageFigure.PAGE_BORDER.top;

			CellFigure f = (CellFigure) rect;
			f.setLocation(new Point(x, y));
			f.setJRElement((JRDesignCellContents) model.getValue(),
					getDrawVisitor(), fileResolver);
		}
	}

	@Override
	public boolean isSelectable() {
		return true;
	}

	public EditPolicy getEditPolicy() {
		return new CrosstabCellResizableEditPolicy();
	}

	public Object getConstraintFor(ChangeBoundsRequest request,
			GraphicalEditPart child) {
		if (request.getResizeDirection() == PositionConstants.SOUTH
				|| request.getResizeDirection() == PositionConstants.NORTH
				|| request.getResizeDirection() == PositionConstants.EAST
				|| request.getResizeDirection() == PositionConstants.WEST)
			System.out
					.println(" Constraint request:  " + request.getSizeDelta() + "  " + request.getResizeDirection()); //$NON-NLS-1$ //$NON-NLS-2$
		return new Rectangle(0, 0, request.getSizeDelta().width,
				request.getSizeDelta().height);
	}

}
