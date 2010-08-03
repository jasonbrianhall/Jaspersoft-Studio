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
package com.jaspersoft.studio.editor.action.copy;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.ui.actions.Clipboard;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.ICopyable;

public class CopyCommand extends Command {
	private ArrayList<ANode> list = new ArrayList<ANode>();

	public boolean addElement(ANode node) {
		if (!list.contains(node)) {
			return list.add(node);
		}
		return false;
	}

	public boolean isCopyableNode(ANode node) {
		if (node instanceof ICopyable)
			return true;
		return false;
	}

	@Override
	public boolean canUndo() {
		return false;
	}

	@Override
	public void execute() {
		if (canExecute())
			Clipboard.getDefault().setContents(list);
	}

	@Override
	public boolean canExecute() {
		if (list == null || list.isEmpty())
			return false;
		Iterator<ANode> it = list.iterator();
		while (it.hasNext()) {
			if (!isCopyableNode(it.next()))
				return false;
		}
		return true;

	}

}
