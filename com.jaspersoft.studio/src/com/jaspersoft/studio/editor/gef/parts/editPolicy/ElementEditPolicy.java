/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.editor.gef.parts.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.jaspersoft.studio.editor.outline.OutlineTreeEditPartFactory;
import com.jaspersoft.studio.model.ANode;

/*
 * The Class ElementEditPolicy.
 */
public class ElementEditPolicy extends ComponentEditPolicy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editpolicies.ComponentEditPolicy#createDeleteCommand(org.eclipse.gef.requests.GroupRequest)
	 */
	protected Command createDeleteCommand(GroupRequest request) {
		if (getHost() != null && getHost().getParent() != null) {
			Object parent = getHost().getParent().getModel();
			if (parent != null && parent instanceof ANode)
				return OutlineTreeEditPartFactory.getDeleteCommand((ANode) parent, (ANode) getHost().getModel());
		}
		return null;
	}

}
