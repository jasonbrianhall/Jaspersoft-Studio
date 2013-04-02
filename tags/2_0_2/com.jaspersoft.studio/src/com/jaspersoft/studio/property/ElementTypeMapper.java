/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, 
 * the following license terms apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.property;

import org.eclipse.gef.EditPart;

import com.jaspersoft.studio.properties.view.ITypeMapper;
/*
 * Type mapper for the logic example. We want to get the GEF model object from the selected element in the outline view
 * and the diagram. We can then filter on the model object type.
 * 
 */
public class ElementTypeMapper implements ITypeMapper {

	/**
	 * @inheritDoc
	 */
	public Class<?> mapType(Object object) {
		Class<?> type = object.getClass();
		if (object instanceof EditPart) {
			type = ((EditPart) object).getModel().getClass();
		}
		return type;
	}
}
