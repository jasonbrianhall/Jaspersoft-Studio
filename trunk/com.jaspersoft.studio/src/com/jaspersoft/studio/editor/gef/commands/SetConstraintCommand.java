/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.editor.gef.commands;

import java.util.List;

import net.sf.jasperreports.engine.JRBand;
import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.design.JRDesignBand;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.editor.gef.rulers.ReportRulerGuide;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.IGraphicElement;
import com.jaspersoft.studio.model.MGraphicElement;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.SelectionHelper;

/**
 * The Class SetConstraintCommand.
 */
public class SetConstraintCommand extends Command {

	/** The new bounds. */
	private Rectangle newBounds;

	/** The old bounds. */
	private Rectangle oldBounds;

	/** The old index. */
	private int oldIndex;

	/** The jr element. */
	private JRDesignElement jrElement;

	/** The jr design. */
	private JasperDesign jrDesign;

	/** The parent bounds. */
	private Rectangle parentBounds;

	/** The p band. */
	private JRDesignBand pBand;

	/** The c band. */
	private JRDesignBand cBand;

	/**
	 * Sets the context.
	 * 
	 * @param parent
	 *          the parent
	 * @param child
	 *          the child
	 * @param constraint
	 *          the constraint
	 */
	public void setContext(ANode parent, ANode child, Rectangle constraint) {
		jrDesign = child.getJasperDesign();
		if (child.getValue() instanceof JRDesignElement) {
			jrElement = (JRDesignElement) child.getValue();
			newBounds = constraint;
			parentBounds = ((IGraphicElement) child).getBounds();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		
		if (jrElement != null) {
			oldBounds = new Rectangle(jrElement.getX(), jrElement.getY(), jrElement.getWidth(), jrElement.getHeight());
			// check position,
			// if top-left corner outside the bottom bar bands, move to bottom band
			// if bottom-left corner outside the top bar, move to top band
			int y = jrElement.getY() + newBounds.y - parentBounds.y;
			if (cBand == null && pBand == null)
				y = setBand(y);
			jrElement.setX(jrElement.getX() + newBounds.x - parentBounds.x);
			jrElement.setY(y);
			jrElement.setWidth(newBounds.width);
			jrElement.setHeight(newBounds.height);
		}
	}

	/**
	 * Sets the band.
	 * 
	 * @param y
	 *          the y
	 * @return the int
	 */
	private int setBand(int y) {
		List<JRBand> bands = ModelUtils.getAllBands(jrDesign);
		int pos = ModelUtils.getBand4Element(bands, jrElement);
		if (pos >= 0 && pos < bands.size()) {
			if (y < 0 - newBounds.height) {
				// coordinates relative to the top-left corner of the page
				int aC = parentBounds.y - jrElement.getY() + y;
				int tm = jrDesign.getTopMargin();
				for (int i = 0; i < pos; i++) {
					tm += bands.get(i).getHeight();
					if (aC + jrElement.getHeight() < tm) {
						// this is the right band
						switchBands(bands, pos, i);

						y = aC - (tm - bands.get(i).getHeight());
						break;
					}
				}
			} else if (y > bands.get(pos).getHeight()) {
				// coordinates relative to the top-left corner of the page
				int aC = parentBounds.y - jrElement.getY() + y;
				int tm = jrDesign.getTopMargin();
				for (int i = 0; i < bands.size(); i++) {
					tm += bands.get(i).getHeight();
					if (i > pos && aC < tm) {
						switchBands(bands, pos, i);

						y = aC - (tm - bands.get(i).getHeight());
						break;
					}
				}
			}
		}
		return y;
	}

	/**
	 * Switch bands.
	 * 
	 * @param bands
	 *          the bands
	 * @param pos
	 *          the pos
	 * @param i
	 *          the i
	 */
	private void switchBands(List<JRBand> bands, int pos, int i) {
		cBand = (JRDesignBand) bands.get(pos);
		pBand = (JRDesignBand) bands.get(i);

		switchBands(cBand, pBand);
	}

	/**
	 * Switch bands.
	 * 
	 * @param cBand
	 *          the c band
	 * @param pBand
	 *          the band
	 */
	private void switchBands(JRDesignBand cBand, JRDesignBand pBand) {
		// get guides
		MGraphicElement n = (MGraphicElement) SelectionHelper.getNode(jrElement);
		ReportRulerGuide vg = n.getVerticalGuide();
		ReportRulerGuide hg = n.getHorizontalGuide();
		int valign = 0;
		int halign = 0;
		if (hg != null) {
			halign = hg.getAlignment(n);
			hg.detachPart(n);
		}
		if (vg != null) {
			valign = vg.getAlignment(n);
			vg.detachPart(n);
		}
		boolean isSelected = false;
		if (firstTime)
			isSelected = SelectionHelper.isSelected(jrElement);
		JRElement[] elements = cBand.getElements();
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == jrElement) {
				oldIndex = i;
				break;
			}
		}
		cBand.removeElement(jrElement);
		pBand.addElement(jrElement);

		if (vg != null || hg != null) {
			n = (MGraphicElement) SelectionHelper.getNode(jrElement);
			if (hg != null) {
				hg.attachPart(n, halign);
			}
			if (vg != null) {
				vg.attachPart(n, valign);
			}
		}
		// set guides
		if (firstTime && isSelected) {
			SelectionHelper.setSelection(jrElement, true);
			firstTime = false;
		}
	}

	private boolean firstTime = true;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		if (jrElement != null) {
			if (pBand != null && cBand != null)
				pBand.removeElement(jrElement);
			if (cBand != null)
				if (oldIndex < 0 || oldIndex > cBand.getElements().length)
					cBand.addElement(jrElement);
				else
					cBand.addElement(oldIndex, jrElement);

			jrElement.setWidth(oldBounds.width);
			jrElement.setHeight(oldBounds.height);
			jrElement.setX(oldBounds.x);
			jrElement.setY(oldBounds.y);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#getLabel()
	 */
	public String getLabel() {
		if (oldBounds != null && (oldBounds.x != newBounds.x || oldBounds.y != newBounds.y))
			return "set location"; //$NON-NLS-1$
		return "resize"; //$NON-NLS-1$
	}
}
