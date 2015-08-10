/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.data.sql.action;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;

import org.eclipse.jface.viewers.TreeViewer;

import com.jaspersoft.studio.data.sql.SQLQueryDesigner;
import com.jaspersoft.studio.data.sql.messages.Messages;
import com.jaspersoft.studio.data.sql.prefs.SQLEditorPreferencesPage;
import com.jaspersoft.studio.data.sql.ui.gef.command.DeleteObjectCommand;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.utils.Misc;

public class DeleteAction<T extends ANode> extends AMultiSelectionAction {
	protected String name;
	protected Class<T> type;
	protected SQLQueryDesigner designer;

	public DeleteAction(SQLQueryDesigner designer, TreeViewer treeViewer,
			String name, Class<T> type) {
		super(Messages.DeleteAction_0 + name, treeViewer);
		this.name = name;
		this.type = type;
		this.designer = designer;
	}

	protected boolean isGoodNode(ANode element) {
		return type.isAssignableFrom(element.getClass());
	}

	@Override
	public void run() {
		List<T> lst = new ArrayList<T>();
		for (Object obj : selection)
			if (isObjectToDelete(obj))
				lst.add((T) obj);
		if (showConfirmation(designer, name, lst))
			doDelete(lst);
	}

	public static boolean showConfirmation(SQLQueryDesigner designer,
			String name, List<?> lst) {
		boolean showConf = designer.getjConfig().getPropertyBoolean(
				SQLEditorPreferencesPage.P_DEL_SHOWCONFIRMATION, false);
		return !showConf
				|| UIUtils.showConfirmation(
						Messages.DeleteAction_1 + name,
						Messages.DeleteAction_2
								+ name.toLowerCase()
								+ (lst.size() == 1 ? "?"
										: Messages.DeleteAction_3));
	}

	protected boolean isObjectToDelete(Object obj) {
		return type.isAssignableFrom(obj.getClass());
	}

	protected void doDelete(final List<T> lst) {
		ANode mfrom = null;
		int indx = 0;
		List<ANode> toRemove = new ArrayList<ANode>();
		for (T ftbl : lst) {
			if (mfrom == null)
				mfrom = (ANode) ftbl.getParent();
			indx = mfrom.getChildren().indexOf(ftbl);
			toRemove.add(ftbl);

			List<ANode> delMore = doDeleteMore(mfrom,
					type.isAssignableFrom(ftbl.getClass()) ? ftbl : null);
			if (!Misc.isNullOrEmpty(delMore))
				toRemove.addAll(delMore);
		}
		DeleteObjectCommand c = new DeleteObjectCommand(toRemove);
		designer.getDiagram().getViewer().getEditDomain().getCommandStack()
				.execute(c);

		ANode toSelect = mfrom;
		if (indx - 1 > 0 && !mfrom.getChildren().isEmpty())
			toSelect = (ANode) mfrom.getChildren().get(
					Math.min(mfrom.getChildren().size() - 1, indx));
		if (toSelect != null)
			selectInTree(toSelect);
		designer.refreshQueryText();
	}

	protected List<ANode> doDeleteMore(ANode parent, T todel) {
		return null;
	}
}
