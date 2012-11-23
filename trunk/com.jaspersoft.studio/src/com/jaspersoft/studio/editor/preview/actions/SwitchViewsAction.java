/*******************************************************************************
 * Copyright (C) 2010 - 2012 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.editor.preview.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import com.jaspersoft.studio.editor.preview.MultiPageContainer;

public class SwitchViewsAction extends Action implements IMenuCreator {
	public static final String SEPARATOR = "SEPARATOR";
	private MultiPageContainer container;
	protected String view;
	private boolean changeName = true;

	public SwitchViewsAction(MultiPageContainer container, String view, boolean changeName) {
		super(view, AS_DROP_DOWN_MENU);
		setToolTipText("View the report in different format");
		setMenuCreator(this);
		this.container = container;
		this.view = view;
		this.changeName = changeName;
	}

	private Menu listMenu;

	public void dispose() {
		if (listMenu != null)
			listMenu.dispose();
	}

	public Menu getMenu(Control parent) {
		if (listMenu != null)
			listMenu.dispose();
		listMenu = new Menu(parent);

		SelectionAdapter listener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MenuItem menuItem = (MenuItem) e.getSource();
				menuItem.setSelection(true);
				view = (String) menuItem.getData("view.key");
				run();
			}
		};

		for (String key : container.getKeys()) {
			if (key.startsWith(SEPARATOR)) {
				new MenuItem(listMenu, SWT.SEPARATOR);
			} else {
				MenuItem m1 = new MenuItem(listMenu, SWT.RADIO);
				m1.setText(key);
				m1.addSelectionListener(listener);
				m1.setData("view.key", key);
			}
		}
		return listMenu;
	}

	public Menu getMenu(Menu parent) {
		return null;
	}

	@Override
	public void run() {
		if (view != null) {
			if (changeName)
				setText(view);
			container.switchView(view);
		}
	}
}
