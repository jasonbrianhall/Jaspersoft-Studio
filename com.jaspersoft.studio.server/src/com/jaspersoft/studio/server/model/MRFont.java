package com.jaspersoft.studio.server.model;

import org.eclipse.jface.resource.ImageDescriptor;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.util.IIconDescriptor;
import com.jaspersoft.studio.server.ServerIconDescriptor;

public class MRFont extends MResource {

	public MRFont(ANode parent, ResourceDescriptor rd) {
		super(parent, rd);
	}

	private static IIconDescriptor iconDescriptor;

	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new ServerIconDescriptor("rfont"); //$NON-NLS-1$
		return iconDescriptor;
	}

	@Override
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}
}
