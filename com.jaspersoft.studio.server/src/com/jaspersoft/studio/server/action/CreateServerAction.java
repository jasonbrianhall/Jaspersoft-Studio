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
package com.jaspersoft.studio.server.action;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MRoot;
import com.jaspersoft.studio.server.Activator;
import com.jaspersoft.studio.server.ServerManager;
import com.jaspersoft.studio.server.model.server.MServerProfile;
import com.jaspersoft.studio.server.model.server.MServers;
import com.jaspersoft.studio.server.model.server.ServerProfile;
import com.jaspersoft.studio.server.wizard.ServerProfileWizard;
import com.jaspersoft.studio.server.wizard.ServerProfileWizardDialog;

public class CreateServerAction extends Action implements ICheatSheetAction {
	public static final String ID = "createServerAction"; //$NON-NLS-1$
	private TreeViewer treeViewer;

	public CreateServerAction() {
		this(null);
	}

	public CreateServerAction(TreeViewer treeViewer) {
		super();
		setId(ID);
		setText("Create JasperServer Connection");
		setDescription("Create JasperServer connection");
		setToolTipText("Create JasperServer connection");
		setImageDescriptor(Activator
				.getImageDescriptor("icons/server--plus.png")); //$NON-NLS-1$
		this.treeViewer = treeViewer;
	}

	@Override
	public boolean isEnabled() {
		return super.isEnabled();
	}

	@Override
	public void run() {
		MRoot root = (MRoot) treeViewer.getInput();
		List<INode> lst = root.getChildren();
		for (INode n : lst) {
			if (n instanceof MServers) {
				ServerProfileWizard wizard = new ServerProfileWizard(
						new MServerProfile(null, new ServerProfile()));
				ServerProfileWizardDialog dialog = new ServerProfileWizardDialog(
						Display.getDefault().getActiveShell(), wizard);
				wizard.bindTestButton(dialog);
				dialog.create();
				if (dialog.open() == Dialog.OK) {
					newDataAdapter = wizard.getServerProfile();
					MServerProfile newprofile = new MServerProfile(
							(MServers) n, newDataAdapter.getValue());
					for (INode cn : newDataAdapter.getChildren())
						newprofile.addChild((ANode) cn);
					newprofile.setWsClient(newDataAdapter.getWsClient());
					ServerManager.addServerProfile(newprofile);

					treeViewer.refresh(true);
					TreeSelection s = (TreeSelection) treeViewer.getSelection();
					TreePath[] p = s.getPaths();
					treeViewer.expandToLevel(p[0], 1);
				}
				break;
			}
		}

	}

	private MServerProfile newDataAdapter;

	public MServerProfile getNewServer() {
		return newDataAdapter;
	}

	public void run(String[] params, ICheatSheetManager manager) {
		run();
		notifyResult(true);
	}

}
