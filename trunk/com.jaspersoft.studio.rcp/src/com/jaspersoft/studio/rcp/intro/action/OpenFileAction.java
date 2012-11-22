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
package com.jaspersoft.studio.rcp.intro.action;

import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;

import com.jaspersoft.studio.utils.UIUtils;

public class OpenFileAction implements IIntroAction {

	public void run(final IIntroSite site, Properties params) {
		String prj = (String) params.get("prj");
		String file = (String) params.get("file");

		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IProject project = ws.getRoot().getProject(prj);

		final IFile f = project.getFile(file);
		Display.getDefault().asyncExec(new Runnable() {

			public void run() {
				try {
					IEditorPart ep = IDE.openEditor(site.getPage(), f, true);
					ep.setFocus();

				} catch (PartInitException e) {
					UIUtils.showError(e);
				}
			}
		});

	}

}
