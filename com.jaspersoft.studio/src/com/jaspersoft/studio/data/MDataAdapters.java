/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of JasperReports.
 * 
 * JasperReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * JasperReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with JasperReports. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.data;

import java.beans.PropertyChangeEvent;
import java.util.Collection;

import net.sf.jasperreports.engine.JRConstants;

import org.eclipse.jface.resource.ImageDescriptor;

import com.jaspersoft.studio.data.storage.ADataAdapterStorage;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.util.IIconDescriptor;
import com.jaspersoft.studio.model.util.NodeIconDescriptor;

public class MDataAdapters extends ANode {
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if ("DATAADAPTERS".equals(evt.getPropertyName())) //$NON-NLS-1$
		{
			updateChildren();
		}

		super.propertyChange(evt);
	}

	private synchronized void updateChildren() {
		this.removeChildren();
		Collection<DataAdapterDescriptor> dataAdapters = getValue().getDataAdapterDescriptors();
		for (DataAdapterDescriptor dataAdapter : dataAdapters) {
			MDataAdapter mDataAdapter = new MDataAdapter(dataAdapter);
			this.addChild(mDataAdapter);
		}
	}

	/** The icon descriptor. */
	private static IIconDescriptor iconDescriptor;

	/**
	 * Gets the icon descriptor.
	 * 
	 * @return the icon descriptor
	 */
	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new NodeIconDescriptor("dataAdapters"); //$NON-NLS-1$
		return iconDescriptor;
	}

	public MDataAdapters(ANode parent, ADataAdapterStorage storage) {
		super(parent, -1);
		setValue(storage);
		storage.addPropertyChangeListener(this);
		updateChildren();
	}

	@Override
	public ADataAdapterStorage getValue() {
		return (ADataAdapterStorage) super.getValue();
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getToolTip()
	 */
	@Override
	public String getToolTip() {
		return getIconDescriptor().getToolTip();
	}

}
