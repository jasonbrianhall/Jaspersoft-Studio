/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.components.barcode.model.barcode4j;

import net.sf.jasperreports.components.barcode4j.Barcode4jComponent;
import net.sf.jasperreports.components.barcode4j.USPSIntelligentMailComponent;
import net.sf.jasperreports.engine.JRConstants;
import net.sf.jasperreports.engine.component.ComponentKey;
import net.sf.jasperreports.engine.design.JRDesignComponentElement;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JasperDesign;

import java.util.List;

import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.components.barcode.messages.Messages;
import com.jaspersoft.studio.editor.defaults.DefaultManager;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.property.descriptors.DoublePropertyDescriptor;

public class MUSPSIntelligent extends MFourStateBarcode {
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public MUSPSIntelligent() {
		super();
	}

	public MUSPSIntelligent(ANode parent, JRDesignComponentElement jrBarcode, int newIndex) {
		super(parent, jrBarcode, newIndex);
	}

	@Override
	public JRDesignComponentElement createJRElement(JasperDesign jasperDesign) {
		JRDesignComponentElement el = new JRDesignComponentElement();
		USPSIntelligentMailComponent component = new USPSIntelligentMailComponent();
		JRDesignExpression exp = new JRDesignExpression();
		exp.setText("\"12345678901234567890\""); //$NON-NLS-1$
		component.setCodeExpression(exp);
		el.setComponent(component);
		el.setComponentKey(new ComponentKey("http://jasperreports.sourceforge.net/jasperreports/components", "jr", //$NON-NLS-1$
				"USPSIntelligentMail"));

		DefaultManager.INSTANCE.applyDefault(this.getClass(), el);

		return el;
	}

	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc) {
		super.createPropertyDescriptors(desc);

		DoublePropertyDescriptor vertQuietZoneD = new DoublePropertyDescriptor(
				Barcode4jComponent.PROPERTY_VERTICAL_QUIET_ZONE, Messages.MBarcode4j_vertical_quiet_zone);
		vertQuietZoneD.setDescription(Messages.MBarcode4j_vertical_quiet_zone_description);
		desc.add(vertQuietZoneD);
		vertQuietZoneD.setCategory(Messages.common_properties_category);
	}
}
