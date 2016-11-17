/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.components.crosstab.model;

import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.components.crosstab.messages.Messages;
import com.jaspersoft.studio.model.dataset.MElementDataset;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.checkbox.CheckBoxPropertyDescriptor;

import net.sf.jasperreports.crosstabs.JRCrosstabDataset;
import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabDataset;
import net.sf.jasperreports.engine.JRConstants;
import net.sf.jasperreports.engine.design.JasperDesign;

public class MCrosstabDataset extends MElementDataset {
	
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	private static IPropertyDescriptor[] descriptors;
	
	public MCrosstabDataset(JRCrosstabDataset value, JasperDesign jasperDesign) {
		super(value, jasperDesign);
	}
	
	@Override
	public IPropertyDescriptor[] getDescriptors() {
		return descriptors;
	}

	@Override
	public void setDescriptors(IPropertyDescriptor[] descriptors1) {
		descriptors = descriptors1;
	}

	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc) {
		super.createPropertyDescriptors(desc);

		CheckBoxPropertyDescriptor repeatColumnHeadersD = new CheckBoxPropertyDescriptor(
				JRDesignCrosstabDataset.PROPERTY_DATA_PRE_SORTED,
				Messages.MCrosstabDataset_data_presorted, NullEnum.NOTNULL);
		repeatColumnHeadersD
				.setDescription(Messages.MCrosstabDataset_data_presorted_description);
		desc.add(repeatColumnHeadersD);

		setHelpPrefix(desc,
				"net.sf.jasperreports.doc/docs/schema.reference.html?cp=0_1#crosstabDataset");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java
	 * .lang.Object)
	 */
	@Override
	public Object getPropertyValue(Object id) {
		JRDesignCrosstabDataset jrElement = (JRDesignCrosstabDataset) getValue();
		if (id.equals(JRDesignCrosstabDataset.PROPERTY_DATA_PRE_SORTED))
			return jrElement.isDataPreSorted();

		return super.getPropertyValue(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java
	 * .lang.Object, java.lang.Object)
	 */
	@Override
	public void setPropertyValue(Object id, Object value) {
		JRDesignCrosstabDataset jrElement = (JRDesignCrosstabDataset) getValue();
		if (id.equals(JRDesignCrosstabDataset.PROPERTY_DATA_PRE_SORTED))
			jrElement.setDataPreSorted((Boolean) value);
		else
			super.setPropertyValue(id, value);
	}

	@Override
	public ImageDescriptor getImagePath() {
		return null;
	}

	@Override
	public String getDisplayText() {
		return null;
	}

}
