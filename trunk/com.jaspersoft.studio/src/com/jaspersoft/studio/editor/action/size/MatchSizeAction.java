/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer.
 * Copyright (C) 2005 - 2010 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of Jaspersoft Open Studio.
 *
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Jaspersoft Open Studio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Jaspersoft Open Studio. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.editor.action.size;

import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.MatchHeightAction;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.JaspersoftStudioPlugin;

public class MatchSizeAction extends MatchHeightAction {
	public static final String ID = GEFActionConstants.MATCH_HEIGHT + GEFActionConstants.MATCH_WIDTH;
	public MatchSizeAction(IWorkbenchPart part) {
		super(part);
		setText("Match Size");
		setImageDescriptor(JaspersoftStudioPlugin.getImageDescriptor("icons/resources/eclipse/match-size.gif"));
		setDisabledImageDescriptor(JaspersoftStudioPlugin.getImageDescriptor("icons/resources/eclipse/disabled/match-size.gif"));
		setToolTipText("Match Size");
		setId(ID);
	}

	@Override
	protected double getPreciseWidthDelta(PrecisionRectangle precisePartBounds, PrecisionRectangle precisePrimaryBounds) {
		return precisePrimaryBounds.preciseWidth - precisePartBounds.preciseWidth;
	}
}
