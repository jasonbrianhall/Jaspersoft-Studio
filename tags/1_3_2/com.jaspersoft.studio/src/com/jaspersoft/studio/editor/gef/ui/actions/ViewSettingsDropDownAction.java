package com.jaspersoft.studio.editor.gef.ui.actions;

import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.action.snap.SizeGridAction;
import com.jaspersoft.studio.editor.action.snap.SnapToGridAction;
import com.jaspersoft.studio.editor.action.snap.SnapToGuidesAction;

/**
 * Dropdown action to contribute a settings menu with the menu items
 * taken from the global View menu.
 * <p>
 * 
 * The following items currently compose the menu:
 * <ul>
 * 	<li>Rulers</li>
 * 	<li>Snap To Guides</li>
 * 	<li>Show Grid</li>
 * 	<li>Snap To Grid</li>
 *  <li>Snap To Geometry</li>
 *  <li>Grid Size...</li>
 *  <li>Decorating contributions</li>
 * </ul>
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 */
public class ViewSettingsDropDownAction extends Action implements IMenuCreator {
	private Menu menu;
	private ActionRegistry actionRegistry;

	public ViewSettingsDropDownAction(ActionRegistry actionRegistry) {
		setText("Settings");
		setMenuCreator(this);
		this.actionRegistry=actionRegistry;
	}

	@Override
	public void dispose() {
		if (menu != null) {
			menu.dispose();
			menu = null;
		}
	}

	@Override
	public Menu getMenu(Menu parent) {
		return null;
	}

	@Override
	public Menu getMenu(Control parent) {
		if (menu != null){
			menu.dispose();
		}
		menu = new Menu(parent);
		addActionToMenu(menu, actionRegistry.getAction(GEFActionConstants.TOGGLE_RULER_VISIBILITY));
		addActionToMenu(menu, actionRegistry.getAction(SnapToGuidesAction.ID));
		new MenuItem(menu, SWT.SEPARATOR);
		addActionToMenu(menu, actionRegistry.getAction(GEFActionConstants.TOGGLE_GRID_VISIBILITY));
		addActionToMenu(menu, actionRegistry.getAction(SnapToGridAction.ID));
		addActionToMenu(menu, actionRegistry.getAction(GEFActionConstants.TOGGLE_SNAP_TO_GEOMETRY));
		addActionToMenu(menu, actionRegistry.getAction(SizeGridAction.ID));
		new MenuItem(menu, SWT.SEPARATOR);
		for(String id : JaspersoftStudioPlugin.getDecoratorManager().getActionIDs()){
			addActionToMenu(menu, actionRegistry.getAction(id));
		}
		return menu;
	}
	
	/*
	 * Adds an item to the existing menu using, using the contributed action.
	 */
	private void addActionToMenu(Menu parent, IAction action) {
		ActionContributionItem item = new ActionContributionItem(action);
		item.fill(parent, -1);
	}

	@Override
	public void run() {
		// Do Nothing
	}
}