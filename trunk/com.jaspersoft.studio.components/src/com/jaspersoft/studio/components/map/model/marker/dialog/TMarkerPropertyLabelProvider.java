/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.components.map.model.marker.dialog;
 

import net.sf.jasperreports.components.items.ItemProperty;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.jaspersoft.studio.utils.Misc;

public class TMarkerPropertyLabelProvider extends LabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		ItemProperty mp = (ItemProperty) element;
		switch (columnIndex) {
		case 0:
			return Misc.nvl(mp.getName());
		case 1:
			return TMarkerLabelProvider.getValue(mp);
		}
		return ""; //$NON-NLS-1$
	}
}
