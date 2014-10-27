package com.jaspersoft.studio.book.editors;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.actions.ActionFactory;

import com.jaspersoft.studio.book.editors.actions.CreateNewGroupAction;
import com.jaspersoft.studio.book.editors.actions.DeleteBookPartAction;
import com.jaspersoft.studio.editor.AContextMenuProvider;
import com.jaspersoft.studio.editor.action.ShowPropertyViewAction;
import com.jaspersoft.studio.editor.outline.actions.CreateGroupAction;

public class BookEditorContextMenuProvider extends AContextMenuProvider {

	public BookEditorContextMenuProvider(EditPartViewer viewer,
			ActionRegistry registry) {
		super(viewer, registry);
	}
	
	@Override
	public void buildContextMenu(IMenuManager menu) {
		IAction action = null;
		
		menu.add(new Separator(GEFActionConstants.GROUP_UNDO));
		action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		action = getActionRegistry().getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		
		menu.add(new Separator(GEFActionConstants.GROUP_ADD));
		action = getActionRegistry().getAction(CreateGroupAction.ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_ADD, action);
		}
		action = getActionRegistry().getAction(CreateNewGroupAction.ID);
		if(action!=null && action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_ADD, action);
		}
		
		action = getActionRegistry().getAction(DeleteBookPartAction.ID);
		if(action!=null && action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_ADD, action);
		}
		
		menu.add(new Separator(GEFActionConstants.GROUP_COPY));
		action = getActionRegistry().getAction(ActionFactory.CUT.getId());
		if (action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_COPY, action);
		}
		action = getActionRegistry().getAction(ActionFactory.COPY.getId());
		if (action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_COPY, action);
		}
		action = getActionRegistry().getAction(ActionFactory.PASTE.getId());
		if (action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_COPY, action);
		}
		
		menu.add(new Separator(GEFActionConstants.GROUP_EDIT));

		menu.add(new Separator(GEFActionConstants.GROUP_VIEW));
		action = getActionRegistry().getAction(ShowPropertyViewAction.ID);
		if (action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_VIEW, action);
		}
	}

}
