package com.jaspersoft.studio.preferences.editor.properties;

import java.util.Comparator;

import net.sf.jasperreports.engine.util.JRProperties.PropertySuffix;

public class PropertyComparator implements Comparator<PropertySuffix> {

	public int compare(PropertySuffix o1, PropertySuffix o2) {
		String k1 = o1.getKey();
		String k2 = o2.getKey();
		return k1.compareTo(k2);
	}

}
