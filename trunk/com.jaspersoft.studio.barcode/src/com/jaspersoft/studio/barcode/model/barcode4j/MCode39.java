/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer.
 * Copyright (C) 2005 - 2010 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of iReport.
 *
 * iReport is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * iReport is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with iReport. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.barcode.model.barcode4j;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.components.barcode4j.Code39Component;
import net.sf.jasperreports.engine.component.ComponentKey;
import net.sf.jasperreports.engine.design.JRDesignComponentElement;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.barcode.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.property.descriptor.DoublePropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.checkbox.CheckBoxPropertyDescriptor;

public class MCode39 extends MBarcode4j {
	public MCode39() {
		super();
	}

	public MCode39(ANode parent, JRDesignComponentElement jrBarcode, int newIndex) {
		super(parent, jrBarcode, newIndex);
	}

	@Override
	public JRDesignComponentElement createJRElement(JasperDesign jasperDesign) {
		JRDesignComponentElement el = new JRDesignComponentElement();
		el.setComponent(new Code39Component());
		el.setComponentKey(new ComponentKey("http://jasperreports.sourceforge.net/jasperreports/components", "jr", "Code39")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return el;
	}

	private static IPropertyDescriptor[] descriptors;
	private static Map<String, Object> defaultsMap;

	@Override
	public Map<String, Object> getDefaultsMap() {
		return defaultsMap;
	}

	@Override
	public IPropertyDescriptor[] getDescriptors() {
		return descriptors;
	}

	@Override
	public void setDescriptors(IPropertyDescriptor[] descriptors1, Map<String, Object> defaultsMap1) {
		descriptors = descriptors1;
		defaultsMap = defaultsMap1;
	}

	/**
	 * Creates the property descriptors.
	 * 
	 * @param desc
	 *          the desc
	 */
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc, Map<String, Object> defaultsMap) {
		super.createPropertyDescriptors(desc, defaultsMap);
		DoublePropertyDescriptor wideFactorD = new DoublePropertyDescriptor(Code39Component.PROPERTY_WIDE_FACTOR,
				Messages.common_wide_factor);
		wideFactorD.setDescription(Messages.MCode39_wide_factor_description);
		desc.add(wideFactorD);

		DoublePropertyDescriptor intercharD = new DoublePropertyDescriptor(Code39Component.PROPERTY_INTERCHAR_GAP_WIDTH,
				Messages.common_interchar_gap_width);
		intercharD.setDescription(Messages.MCode39_interchar_gap_width_description);
		desc.add(intercharD);

		CheckBoxPropertyDescriptor displayChecksumD = new CheckBoxPropertyDescriptor(
				Code39Component.PROPERTY_DISPLAY_CHECKSUM, Messages.common_display_checksum, NullEnum.NULL);
		displayChecksumD.setDescription(Messages.MCode39_display_checksum_description);
		desc.add(displayChecksumD);

		CheckBoxPropertyDescriptor displayStartStopD = new CheckBoxPropertyDescriptor(
				Code39Component.PROPERTY_DISPLAY_START_STOP, Messages.MCode39_display_start_stop, NullEnum.NULL);
		displayStartStopD.setDescription(Messages.MCode39_display_start_stop_description);
		desc.add(displayStartStopD);

		CheckBoxPropertyDescriptor extendedCharsetD = new CheckBoxPropertyDescriptor(
				Code39Component.PROPERTY_EXTENDED_CHARSET_ENABLED, Messages.MCode39_extended_charset_enabled, NullEnum.NULL);
		extendedCharsetD.setDescription(Messages.MCode39_extended_charset_enabled_description);
		desc.add(extendedCharsetD);

		ComboBoxPropertyDescriptor checksumModeD = new ComboBoxPropertyDescriptor(Code39Component.PROPERTY_CHECKSUM_MODE,
				Messages.common_checksum_mode, ChecksumMode.getItems());
		checksumModeD.setDescription(Messages.MCode39_checksum_mode_description);
		desc.add(checksumModeD);

		checksumModeD.setCategory(Messages.MCode39_properties_category);
		extendedCharsetD.setCategory(Messages.MCode39_properties_category);
		displayChecksumD.setCategory(Messages.MCode39_properties_category);
		displayStartStopD.setCategory(Messages.MCode39_properties_category);
		wideFactorD.setCategory(Messages.MCode39_properties_category);
		intercharD.setCategory(Messages.MCode39_properties_category);
	}

	@Override
	public Object getPropertyValue(Object id) {
		JRDesignComponentElement jrElement = (JRDesignComponentElement) getValue();
		Code39Component jrList = (Code39Component) jrElement.getComponent();

		if (id.equals(Code39Component.PROPERTY_WIDE_FACTOR))
			return jrList.getWideFactor();
		if (id.equals(Code39Component.PROPERTY_INTERCHAR_GAP_WIDTH))
			return jrList.getIntercharGapWidth();

		if (id.equals(Code39Component.PROPERTY_DISPLAY_CHECKSUM))
			return jrList.isDisplayChecksum();
		if (id.equals(Code39Component.PROPERTY_DISPLAY_START_STOP))
			return jrList.isDisplayStartStop();
		if (id.equals(Code39Component.PROPERTY_EXTENDED_CHARSET_ENABLED))
			return jrList.isExtendedCharSetEnabled();

		if (id.equals(Code39Component.PROPERTY_CHECKSUM_MODE))
			return ChecksumMode.getPos4ChecksumMode(jrList.getChecksumMode());

		return super.getPropertyValue(id);
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		JRDesignComponentElement jrElement = (JRDesignComponentElement) getValue();
		Code39Component jrList = (Code39Component) jrElement.getComponent();

		if (id.equals(Code39Component.PROPERTY_WIDE_FACTOR))
			jrList.setWideFactor((Double) value);
		else if (id.equals(Code39Component.PROPERTY_INTERCHAR_GAP_WIDTH))
			jrList.setIntercharGapWidth((Double) value);

		else if (id.equals(Code39Component.PROPERTY_CHECKSUM_MODE))
			jrList.setChecksumMode(ChecksumMode.getChecksumMode4Pos((Integer) value));

		else if (id.equals(Code39Component.PROPERTY_DISPLAY_CHECKSUM))
			jrList.setDisplayChecksum((Boolean) value);
		else if (id.equals(Code39Component.PROPERTY_DISPLAY_START_STOP))
			jrList.setDisplayStartStop((Boolean) value);
		else if (id.equals(Code39Component.PROPERTY_EXTENDED_CHARSET_ENABLED))
			jrList.setExtendedCharSetEnabled((Boolean) value);
		else
			super.setPropertyValue(id, value);
	}
}
