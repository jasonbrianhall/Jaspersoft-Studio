package com.jaspersoft.studio.book.editors;

import java.util.Arrays;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.actions.ActionFactory;

import com.jaspersoft.studio.book.editors.actions.CreateNewBookPartAction;
import com.jaspersoft.studio.book.editors.actions.CreateNewGroupAction;
import com.jaspersoft.studio.book.editors.actions.DeleteBookPartAction;
import com.jaspersoft.studio.book.editors.actions.DeleteBookSectionAction;
import com.jaspersoft.studio.editor.AContextMenuProvider;
import com.jaspersoft.studio.editor.action.ActionUtils;
import com.jaspersoft.studio.editor.action.ShowPropertyViewAction;
import com.jaspersoft.studio.editor.outline.actions.CreateFieldAction;
import com.jaspersoft.studio.editor.outline.actions.CreateParameterAction;
import com.jaspersoft.studio.editor.outline.actions.CreateParameterSetAction;
import com.jaspersoft.studio.editor.outline.actions.CreateScriptletAction;
import com.jaspersoft.studio.editor.outline.actions.CreateSortFieldAction;
import com.jaspersoft.studio.editor.outline.actions.CreateVariableAction;

public class BookEditorContextMenuProvider extends AContextMenuProvider {

	public BookEditorContextMenuProvider(EditPartViewer viewer,
			ActionRegistry registry) {
		super(viewer, registry);
	}
	
	@Override
	public void buildContextMenu(IMenuManager menu) {
		ActionRegistry actionRegistry = getActionRegistry();
		menu.add(new Separator(GEFActionConstants.GROUP_UNDO));
		ActionUtils.appendActionToGroup(
				menu, Arrays.asList(new String[]{ActionFactory.UNDO.getId(),ActionFactory.REDO.getId()}), 
				actionRegistry, GEFActionConstants.GROUP_UNDO);
		
		menu.add(new Separator(GEFActionConstants.GROUP_ADD));
		ActionUtils.appendActionToGroup(
				menu, Arrays.asList(new String[]{
						CreateNewGroupAction.ID,CreateNewBookPartAction.ID,
						CreateParameterAction.ID,CreateParameterSetAction.ID,
						CreateFieldAction.ID,CreateSortFieldAction.ID,
						CreateVariableAction.ID,CreateScriptletAction.ID,}), 
				actionRegistry, GEFActionConstants.GROUP_ADD);
		
		menu.add(new Separator(GEFActionConstants.GROUP_COPY));
		ActionUtils.appendActionToGroup(
				menu, Arrays.asList(new String[]{
						ActionFactory.CUT.getId(),ActionFactory.COPY.getId(),
						ActionFactory.PASTE.getId()}), 
				actionRegistry, GEFActionConstants.GROUP_COPY);
		
		menu.add(new Separator(GEFActionConstants.GROUP_EDIT));
		ActionUtils.appendActionToGroup(
				menu, Arrays.asList(new String[]{
						DeleteBookPartAction.ID,DeleteBookSectionAction.ID}), 
				actionRegistry, GEFActionConstants.GROUP_EDIT);

		menu.add(new Separator(GEFActionConstants.GROUP_VIEW));
		ActionUtils.appendActionToGroup(
				menu, Arrays.asList(new String[]{ShowPropertyViewAction.ID}), 
				actionRegistry, GEFActionConstants.GROUP_VIEW);
	}

}
