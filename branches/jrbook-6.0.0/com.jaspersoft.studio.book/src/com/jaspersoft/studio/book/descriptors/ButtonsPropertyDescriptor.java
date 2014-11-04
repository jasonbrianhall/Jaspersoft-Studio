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
package com.jaspersoft.studio.book.descriptors;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.PropertyDescriptor;

import com.jaspersoft.studio.book.widgets.SPPartReturnValuesButton;
import com.jaspersoft.studio.help.IHelp;
import com.jaspersoft.studio.help.IHelpRefBuilder;
import com.jaspersoft.studio.property.section.AbstractSection;
import com.jaspersoft.studio.property.section.widgets.ASPropertyWidget;
import com.jaspersoft.studio.property.section.widgets.IPropertyDescriptorWidget;

/**
 * This class describe a generic button
 * 
 * @author Orlandin Marco
 * 
 */
public class ButtonsPropertyDescriptor extends PropertyDescriptor implements IPropertyDescriptorWidget, IHelp {


	/**
	 * Crate a new descriptor for increment or decrement of the font size
	 * 
	 * @param id
	 *          id of this attribute
	 */
	public ButtonsPropertyDescriptor(Object id) {
		super(id, "");
	}

	/**
	 * Create the widget and return it
	 */
	@Override
	public ASPropertyWidget createWidget(Composite parent, AbstractSection section) {
		return new SPPartReturnValuesButton(parent, section, this);
	}

	private IHelpRefBuilder refBuilder;

	@Override
	public void setHelpRefBuilder(IHelpRefBuilder refBuilder) {
		this.refBuilder = refBuilder;
	}

	@Override
	public String getHelpReference() {
		if (refBuilder != null)
			return refBuilder.getHelpReference();
		return null;
	}
}
