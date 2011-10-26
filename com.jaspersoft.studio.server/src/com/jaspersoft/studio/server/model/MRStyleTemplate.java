package com.jaspersoft.studio.server.model;

import org.eclipse.jface.resource.ImageDescriptor;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.style.MStyleTemplate;
import com.jaspersoft.studio.model.util.IIconDescriptor;

public class MRStyleTemplate extends MResource {

	public MRStyleTemplate(ANode parent, ResourceDescriptor rd) {
		super(parent, rd);
	}

	public static IIconDescriptor getIconDescriptor() {
		return MStyleTemplate.getIconDescriptor();
	}

	@Override
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}
}
