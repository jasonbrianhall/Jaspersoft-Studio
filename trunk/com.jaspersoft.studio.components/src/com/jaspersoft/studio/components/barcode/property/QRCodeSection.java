/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.components.barcode.property;

import net.sf.jasperreports.components.barcode4j.Barcode4jComponent;
import net.sf.jasperreports.components.barcode4j.QRCodeComponent;

import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.components.barcode.messages.Messages;
import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;

public class QRCodeSection extends AbstractSection {

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		Composite group = getWidgetFactory().createSection(parent, "QRCode", false, 2);

		createWidget4Property(group, Barcode4jComponent.PROPERTY_VERTICAL_QUIET_ZONE);

		createWidget4Property(group, QRCodeComponent.PROPERTY_ERROR_CORRECTION_LEVEL);
		createWidget4Property(group, QRCodeComponent.PROPERTY_MARGIN);
		createWidget4Property(group, Barcode4jComponent.PROPERTY_TEXT_POSITION);
	}

	@Override
	protected void initializeProvidedProperties() {
		super.initializeProvidedProperties();
		addProvidedProperties(QRCodeComponent.PROPERTY_ERROR_CORRECTION_LEVEL, "Error correction level");
		addProvidedProperties(QRCodeComponent.PROPERTY_MARGIN, "Margin");
		addProvidedProperties(Barcode4jComponent.PROPERTY_TEXT_POSITION, Messages.MBarcode4j_text_position);
		addProvidedProperties(Barcode4jComponent.PROPERTY_VERTICAL_QUIET_ZONE, Messages.MBarcode4j_vertical_quiet_zone);
	}
}
