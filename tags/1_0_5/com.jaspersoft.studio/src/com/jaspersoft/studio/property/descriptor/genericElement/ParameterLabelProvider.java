/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
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
