/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.server.action.resource;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.ui.actions.Clipboard;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.server.model.AMResource;
import com.jaspersoft.studio.server.model.MAdHocDataView;

public class CopyResourceAction extends Action {
	private TreeViewer treeViewer;

	public CopyResourceAction(TreeViewer treeViewer) {
		super();
		setId(ActionFactory.COPY.getId());
		setText(Messages.common_copy);
		setToolTipText(Messages.common_copy);
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
		setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY_DISABLED));
		this.treeViewer = treeViewer;
	}

	@Override
	public boolean isEnabled() {
		Object firstElement = ((TreeSelection) treeViewer.getSelection()).getFirstElement();
		boolean b = firstElement != null && (firstElement instanceof AMResource);
		if (firstElement instanceof MAdHocDataView)
			return false;
		if (b) {
			AMResource mres = (AMResource) firstElement;
			int pmask = mres.getValue().getPermissionMask(mres.getWsClient());
			b = b && (pmask == 1 || (pmask & 2) == 2);
			if (AddResourceAction.isSpecialFolder(mres))
				return false;
		}
		return b;
	}

	@Override
	public void run() {
		TreeSelection s = (TreeSelection) treeViewer.getSelection();
		TreePath[] p = s.getPaths();
		List<AMResource> rlist = new ArrayList<AMResource>();
		for (int i = 0; i < p.length; i++) {
			final Object obj = p[i].getLastSegment();
			if (obj instanceof AMResource) {
				rlist.add((AMResource) obj);
			}
		}
		if (!rlist.isEmpty())
			Clipboard.getDefault().setContents(rlist);
	}
}
