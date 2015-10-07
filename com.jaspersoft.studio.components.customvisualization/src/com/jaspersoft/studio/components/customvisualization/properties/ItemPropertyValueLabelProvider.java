/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * Licensed under commercial Jaspersoft Subscription License Agreement
 ******************************************************************************/
package com.jaspersoft.studio.components.customvisualization.properties;

import net.sf.jasperreports.components.map.ItemProperty;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import com.jaspersoft.studio.components.customvisualization.CVComponentUtil;
import com.jaspersoft.studio.utils.Misc;

/**
 * Label provider for the column value of a table containing a list of
 * {@link CVItemProperty}.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 * 
 */
public class ItemPropertyValueLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof ItemProperty) {
			String value = CVComponentUtil
					.getCVItemPropertyValueAsString((ItemProperty) element);
			return Misc.nvl(value);
		}
		return super.getText(element);
	}

}
