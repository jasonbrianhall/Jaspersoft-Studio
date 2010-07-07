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
package com.jaspersoft.studio.model;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.base.JRBaseStyle;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignEllipse;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.type.FillEnum;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.utils.EnumHelper;

/**
 * The Class MEllipse.
 */
public class MEllipse extends MGraphicElementLinePen {

	/** The icon descriptor. */
	private static IIconDescriptor iconDescriptor;

	/**
	 * Gets the icon descriptor.
	 * 
	 * @return the icon descriptor
	 */
	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new NodeIconDescriptor("ellipse");
		return iconDescriptor;
	}

	/**
	 * Instantiates a new m ellipse.
	 */
	public MEllipse() {
		super();
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
	protected void createPropertyDescriptors(List<IPropertyDescriptor> desc, Map<String, Object> defaultsMap) {
		super.createPropertyDescriptors(desc, defaultsMap);

		ComboBoxPropertyDescriptor fillD = new ComboBoxPropertyDescriptor(JRBaseStyle.PROPERTY_FILL, "Fill", EnumHelper
				.getEnumNames(FillEnum.values(), NullEnum.INHERITED));
		fillD.setDescription("Type of the fill pattern used to fill objects.");
		desc.add(fillD);
	}

	@Override
	public Object getPropertyValue(Object id) {
		JRDesignEllipse jrElement = (JRDesignEllipse) getValue();
		if (id.equals(JRBaseStyle.PROPERTY_FILL))
			return EnumHelper.getValue(jrElement.getOwnFillValue(), 1, true);
		return super.getPropertyValue(id);
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		JRDesignEllipse jrElement = (JRDesignEllipse) getValue();
		if (id.equals(JRBaseStyle.PROPERTY_FILL))
			jrElement.setFill((FillEnum) EnumHelper.getSetValue(FillEnum.values(), value, 1, true));
		else
			super.setPropertyValue(id, value);
	}

	/**
	 * Instantiates a new m ellipse.
	 * 
	 * @param parent
	 *          the parent
	 * @param jrEllipse
	 *          the jr ellipse
	 * @param newIndex
	 *          the new index
	 */
	public MEllipse(ANode parent, JRDesignEllipse jrEllipse, int newIndex) {
		super(parent, newIndex);
		setValue(jrEllipse);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getDefaultHeight()
	 */
	@Override
	public int getDefaultHeight() {
		return 50;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getDefaultWidth()
	 */
	@Override
	public int getDefaultWidth() {
		return 100;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#createJRElement(net.sf.jasperreports.engine.design.JasperDesign)
	 */
	@Override
	public JRDesignElement createJRElement(JasperDesign jasperDesign) {
		JRDesignEllipse jrDesignEllipse = new JRDesignEllipse(jasperDesign);
		jrDesignEllipse.setWidth(getDefaultWidth());
		jrDesignEllipse.setWidth(getDefaultHeight());
		return jrDesignEllipse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getDisplayText()
	 */
	@Override
	public String getDisplayText() {
		return getIconDescriptor().getTitle();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getImagePath()
	 */
	@Override
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getToolTip()
	 */
	@Override
	public String getToolTip() {
		return getIconDescriptor().getToolTip();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getEditableValue()
	 */
	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
