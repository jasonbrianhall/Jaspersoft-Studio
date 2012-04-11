/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2011 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.components.chart.model;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.charts.JRItemLabel;
import net.sf.jasperreports.charts.design.JRDesignItemLabel;
import net.sf.jasperreports.engine.JRConstants;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.components.chart.messages.Messages;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.text.MFont;
import com.jaspersoft.studio.model.text.MFontUtil;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.color.ColorPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.text.FontPropertyDescriptor;
import com.jaspersoft.studio.utils.Colors;

public class MChartItemLabel extends APropertyNode {
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public MChartItemLabel(JRItemLabel value) {
		super();
		setValue(value);
	}

	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc,
			Map<String, Object> defaultsMap) {
		ColorPropertyDescriptor backcolorD = new ColorPropertyDescriptor(
				JRDesignItemLabel.PROPERTY_BACKGROUND_COLOR,
				Messages.MChartItemLabel_background_color, NullEnum.NULL);
		backcolorD
				.setDescription(Messages.MChartItemLabel_background_color_description);
		desc.add(backcolorD);

		ColorPropertyDescriptor colorD = new ColorPropertyDescriptor(
				JRDesignItemLabel.PROPERTY_COLOR,
				Messages.MChartItemLabel_color, NullEnum.NULL);
		colorD.setDescription(Messages.MChartItemLabel_color_description);
		desc.add(colorD);

		FontPropertyDescriptor fontD = new FontPropertyDescriptor(
				JRDesignItemLabel.PROPERTY_FONT, Messages.MChartItemLabel_font);
		fontD.setDescription(Messages.MChartItemLabel_font_description);
		desc.add(fontD);

		defaultsMap.put(JRDesignItemLabel.PROPERTY_FONT, null);
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
	public void setDescriptors(IPropertyDescriptor[] descriptors1,
			Map<String, Object> defaultsMap1) {
		descriptors = descriptors1;
		defaultsMap = defaultsMap1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java
	 * .lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		JRItemLabel jrElement = (JRItemLabel) getValue();
		if (id.equals(JRDesignItemLabel.PROPERTY_BACKGROUND_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement.getBackgroundColor());
		if (id.equals(JRDesignItemLabel.PROPERTY_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement.getColor());
		if (id.equals(JRDesignItemLabel.PROPERTY_FONT)) {
			vtFont = MFontUtil
					.getMFont(vtFont, jrElement.getFont(), null, this);
			return vtFont;
		}
		return null;
	}

	private MFont vtFont;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java
	 * .lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		JRDesignItemLabel jrElement = (JRDesignItemLabel) getValue();
		if (id.equals(JRDesignItemLabel.PROPERTY_BACKGROUND_COLOR)
				&& value instanceof RGB)
			jrElement
					.setBackgroundColor(Colors.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignItemLabel.PROPERTY_COLOR)
				&& value instanceof RGB)
			jrElement.setColor(Colors.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignItemLabel.PROPERTY_FONT)) {
			jrElement.setFont(MFontUtil.setMFont(value));
		}
	}

	public ImageDescriptor getImagePath() {
		return null;
	}

	public String getDisplayText() {
		return null;
	}
}
