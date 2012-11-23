/*******************************************************************************
 * Copyright (C) 2010 - 2012 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.property.descriptor.genericElement;

import org.eclipse.jface.viewers.LabelProvider;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.property.descriptor.genericElement.dialog.ParameterDTO;
/*
 * @author Chicu Veaceslav
 * 
 */
public class ParameterLabelProvider extends LabelProvider {

	public ParameterLabelProvider() {
		super();
	}

	@Override
	public String getText(Object element) {
		if (element == null)
			return ""; //$NON-NLS-1$
		if (element.getClass().isArray())
			return "[" + Messages.common_parameters + ": " + ((Object[]) element).length + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		if (element instanceof ParameterDTO)
			return "[" + Messages.common_parameters + ": " + ((ParameterDTO) element).getValue().length + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return element.toString();
	}

}
