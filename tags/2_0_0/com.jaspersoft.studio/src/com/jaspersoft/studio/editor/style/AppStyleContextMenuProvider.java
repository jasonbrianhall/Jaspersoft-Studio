/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, 
 * the following license terms apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.editor.style;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;

import com.jaspersoft.studio.editor.action.ShowPropertyViewAction;
import com.jaspersoft.studio.editor.outline.actions.CreateStyleAction;
import com.jaspersoft.studio.editor.outline.actions.CreateStyleTemplateReferenceAction;
/*
 * The Class AppContextMenuProvider.
 */
public class AppStyleContextMenuProvider extends ContextMenuProvider {

	public String getID() {
		return "com.jaspersoft.studio.editor.style.contextmenu";
	}

	/** The action registry. */
	private ActionRegistry actionRegistry;

	/**
	 * Instantiates a new app context menu provider.
	 * 
	 * @param viewer
	 *          the viewer
	 * @param registry
	 *          the registry
	 */
	public AppStyleContextMenuProvider(EditPartViewer viewer, ActionRegistry registry) {
		super(viewer);
		setActionRegistry(registry);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ContextMenuProvider#buildContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);

		IAction action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);

		action = getActionRegistry().getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);

		// ----------------------------------------

		action = getActionRegistry().getAction(ActionFactory.CUT.getId());
		if (action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_COPY, action);

		action = getActionRegistry().getAction(ActionFactory.COPY.getId());
		if (action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_COPY, action);

		action = getActionRegistry().getAction(ActionFactory.PASTE.getId());
		if (action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_COPY, action);

		// -----------------------------------------------------------

		action = getActionRegistry().getAction(CreateStyleAction.ID);
		if (action != null && action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_ADD, action);

		action = getActionRegistry().getAction(CreateStyleTemplateReferenceAction.ID);
		if (action != null && action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_ADD, action);

		action = getActionRegistry().getAction(ActionFactory.DELETE.getId());
		if (action != null && action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(GEFActionConstants.DIRECT_EDIT);
		if (action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		// ------------------------------

		action = getActionRegistry().getAction(ShowPropertyViewAction.ID);
		if (action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_VIEW, action);
	}

	/**
	 * Gets the action registry.
	 * 
	 * @return the action registry
	 */
	public ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	/**
	 * Sets the action registry.
	 * 
	 * @param actionRegistry
	 *          the new action registry
	 */
	public void setActionRegistry(ActionRegistry actionRegistry) {
		this.actionRegistry = actionRegistry;
	}

}
