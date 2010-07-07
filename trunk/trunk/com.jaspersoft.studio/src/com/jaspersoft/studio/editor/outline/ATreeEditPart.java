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
package com.jaspersoft.studio.editor.outline;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.outline.editpolicy.ElementEditPolicy;
import com.jaspersoft.studio.editor.outline.editpolicy.ElementTreeEditPolicy;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;

// TODO: Auto-generated Javadoc
/**
 * The Class ATreeEditPart.
 */
public class ATreeEditPart extends AbstractTreeEditPart implements PropertyChangeListener {

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#activate()
	 */
	@Override
	public void activate() {
		super.activate();
		((ANode) getModel()).getPropertyChangeSupport().addPropertyChangeListener(this);

	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#deactivate()
	 */
	@Override
	public void deactivate() {
		((ANode) getModel()).getPropertyChangeSupport().removePropertyChangeListener(this);
		super.deactivate();

	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ElementEditPolicy());
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ElementTreeEditPolicy());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractTreeEditPart#refreshVisuals()
	 */
	@Override
	protected void refreshVisuals() {
		if (getWidget() instanceof Tree)
			return;
		TreeItem item = (TreeItem) getWidget();
		ANode node = (ANode) getModel();
		Image image = JaspersoftStudioPlugin.getImage(node.getImagePath());
		if (image != null) {
			if (node.getBackground() != null)
				image.setBackground(node.getBackground());
			else {
				if (item.getParent() != null && item.getParent().getBackground() != null)
					image.setBackground(item.getParent().getBackground());
			}
			setWidgetImage(image);
		}
		if (node.getBackground() != null)
			item.setBackground(node.getBackground());
		if (node.getForeground() != null)
			item.setForeground(node.getForeground());
		String displayText = node.getDisplayText();
		if (displayText.length() > 30)
			displayText = displayText.substring(0, 30) + " ...";
		setWidgetText(displayText);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	@Override
	protected List getModelChildren() {
		List<Object> list = new ArrayList<Object>();
		for (INode node : ((ANode) getModel()).getChildren()) {
			list.add(node);
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		refresh();

	}
}
