/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package com.jaspersoft.studio.model.util;

import java.util.List;

import net.sf.jasperreports.components.map.ItemProperty;
import net.sf.jasperreports.components.map.StandardItem;
import net.sf.jasperreports.components.map.StandardItemProperty;

import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.property.infoList.ElementDescription;
import com.jaspersoft.studio.property.itemproperty.desc.ItemPropertyDescriptor;
import com.jaspersoft.studio.utils.ExpressionInterpreter;
import com.jaspersoft.studio.utils.Misc;

public class ItemPropertyUtil {
	public static ItemProperty getProperty(List<ItemProperty> items, String name) {
		if (items != null)
			for (ItemProperty it : items)
				if (it.getName().equals(name))
					return it;
		return null;
	}

	public static void setProperty(StandardItem item, String key, ItemProperty ip) {
		List<ItemProperty> props = item.getProperties();
		if (props != null) {
			StandardItemProperty sp = (StandardItemProperty) getProperty(props, key);
			if (sp != null) {
				if (ip == null)
					item.removeItemProperty(sp);
				else {
					sp.setValue(ip.getValue());
					sp.setValueExpression(ip.getValueExpression());
				}
				return;
			}
		}
		item.addItemProperty(ip);
	}

	public static void setupElementDescriptors(List<ElementDescription> elementDescriptions,
			List<IPropertyDescriptor> descriptors) {
		for (IPropertyDescriptor pd : descriptors)
			if (pd instanceof ItemPropertyDescriptor)
				((ItemPropertyDescriptor) pd).setElementDescriptions(elementDescriptions);
	}

	public static Object getItemPropertyValue(StandardItemProperty ip, ExpressionInterpreter expIntr) {
		if (ip == null)
			return null;
		if (ip.getValueExpression() != null && expIntr != null)
			return expIntr.interpretExpression(Misc.nvl(ip.getValueExpression().getText()));
		if (ip.getValue() != null)
			return ip.getValue();
		return null;
	}

	public static Boolean getItemPropertyBoolean(StandardItemProperty ip, ExpressionInterpreter expIntr) {
		Object obj = getItemPropertyValue(ip, expIntr);
		if (obj == null)
			return null;
		if (obj instanceof String && !Misc.isNullOrEmpty((String) obj))
			try {
				obj = Boolean.parseBoolean((String) obj);
			} catch (NumberFormatException e) {
			}
		else if (obj instanceof Boolean)
			return (Boolean) obj;
		return null;
	}

	public static String getItemPropertyString(StandardItemProperty ip, ExpressionInterpreter expIntr) {
		Object obj = getItemPropertyValue(ip, expIntr);
		if (obj == null)
			return null;
		if (obj instanceof String)
			return (String) obj;
		return null;
	}

	public static Double getItemPropertyDouble(StandardItemProperty ip, ExpressionInterpreter expIntr) {
		Object obj = getItemPropertyValue(ip, expIntr);
		if (obj == null)
			return null;
		if (obj instanceof String && !Misc.isNullOrEmpty((String) obj))
			try {
				obj = Double.parseDouble((String) obj);
			} catch (NumberFormatException e) {
			}
		if (obj instanceof Number)
			return Double.valueOf(((Number) obj).doubleValue());
		return null;
	}

	public static Integer getItemPropertyInteger(StandardItemProperty ip, ExpressionInterpreter expIntr) {
		Object obj = getItemPropertyValue(ip, expIntr);
		if (obj == null)
			return null;
		if (obj instanceof String && !Misc.isNullOrEmpty((String) obj))
			try {
				obj = Integer.parseInt((String) obj);
			} catch (NumberFormatException e) {
			}
		if (obj instanceof Number)
			return Integer.valueOf(((Number) obj).intValue());
		return null;
	}
}
