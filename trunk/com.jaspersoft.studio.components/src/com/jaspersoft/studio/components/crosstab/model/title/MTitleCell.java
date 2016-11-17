/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.components.crosstab.model.title;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.components.crosstab.messages.Messages;
import com.jaspersoft.studio.components.crosstab.model.cell.MCell;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptors.NamedEnumPropertyDescriptor;
import com.jaspersoft.studio.property.descriptors.PixelPropertyDescriptor;

import net.sf.jasperreports.crosstabs.CrosstabColumnCell;
import net.sf.jasperreports.crosstabs.design.DesignCrosstabColumnCell;
import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabCell;
import net.sf.jasperreports.crosstabs.type.CrosstabColumnPositionEnum;
import net.sf.jasperreports.engine.JRConstants;

public class MTitleCell extends MCell {
	
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	private static IPropertyDescriptor[] descriptors;

	private static NamedEnumPropertyDescriptor<CrosstabColumnPositionEnum> positionD;
	
	public MTitleCell() {
		super();
	}

	private DesignCrosstabColumnCell colCell;

	public MTitleCell(ANode parent, CrosstabColumnCell jfRield, int index) {
		super(parent, jfRield.getCellContents(), Messages.MTitleCell_titlecell,
				index);
		this.colCell = (DesignCrosstabColumnCell) jfRield;
	}

	public DesignCrosstabColumnCell getCrosstabColumnCell() {
		return colCell;
	}

	@Override
	public Color getForeground() {
		if (getValue() == null)
			return ColorConstants.lightGray;
		return ColorConstants.black;
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals(DesignCrosstabColumnCell.PROPERTY_CONTENTS_POSITION))
			return positionD.getIntValue(colCell.getContentsPosition());
		if (id.equals(DesignCrosstabColumnCell.PROPERTY_HEIGHT))
			return colCell.getHeight();
		return super.getPropertyValue(id);
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		if (id.equals(DesignCrosstabColumnCell.PROPERTY_CONTENTS_POSITION))
			colCell.setContentsPosition(positionD.getEnumValue(value));
		if (id.equals(DesignCrosstabColumnCell.PROPERTY_HEIGHT)) {
			colCell.setHeight((Integer) value);

			getCrosstab().getCrosstabManager().refresh();
			getPropertyChangeSupport().firePropertyChange(
					new PropertyChangeEvent(this,
							JRDesignCrosstabCell.PROPERTY_HEIGHT, null, value));
		}
		super.setPropertyValue(id, value);
	}

	@Override
	public int getDefaultHeight() {
		return 30;
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
		positionD = new NamedEnumPropertyDescriptor<CrosstabColumnPositionEnum>(
				DesignCrosstabColumnCell.PROPERTY_CONTENTS_POSITION,
				Messages.MTitleCell_contentPosition,
				CrosstabColumnPositionEnum.CENTER, NullEnum.NOTNULL);
		positionD.setDescription(Messages.MTitleCell_contentPosition);
		desc.add(positionD);

		super.createPropertyDescriptors(desc);

		for (IPropertyDescriptor pd : desc) {
			if (pd.getId().equals(JRDesignCrosstabCell.PROPERTY_WIDTH))
				((PixelPropertyDescriptor) pd).setReadOnly(true);
		}
	}

}
