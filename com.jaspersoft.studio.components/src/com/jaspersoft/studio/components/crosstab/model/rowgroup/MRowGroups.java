/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.components.crosstab.model.rowgroup;

import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.components.crosstab.CrosstabNodeIconDescriptor;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MCollection;
import com.jaspersoft.studio.model.util.IIconDescriptor;

import net.sf.jasperreports.crosstabs.JRCrosstab;
import net.sf.jasperreports.engine.JRConstants;

public class MRowGroups extends MCollection {
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;
	/** The icon descriptor. */
	private static IIconDescriptor iconDescriptor;

	/**
	 * Gets the icon descriptor.
	 * 
	 * @return the icon descriptor
	 */
	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new CrosstabNodeIconDescriptor("rowgroups"); //$NON-NLS-1$
		return iconDescriptor;
	}

	/** The descriptors. */
	protected static IPropertyDescriptor[] descriptors;

	public MRowGroups(ANode parent, JRCrosstab jrDataset, String property) {
		super(parent, jrDataset, property);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getDisplayText()
	 */
	public String getDisplayText() {
		return getIconDescriptor().getTitle();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getImagePath()
	 */
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}
	
	@Override
	public HashMap<String, List<ANode>> getUsedStyles() {
		HashMap<String, List<ANode>> result = super.getUsedStyles();
		for (INode node : getChildren()) {
			if (node instanceof ANode) {
				mergeElementStyle(result, ((ANode) node).getUsedStyles());
			}
		}
		return result;
	}
}
