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
package com.jaspersoft.studio.model.util;

import org.eclipse.jface.resource.ImageDescriptor;
/*
 * The Interface IIconDescriptor.
 * 
 * @author Chicu Veaceslav
 */
public interface IIconDescriptor {

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle();

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
	public String getDescription();

	/**
	 * Gets the tool tip.
	 * 
	 * @return the tool tip
	 */
	public String getToolTip();

	/**
	 * Gets the icon16.
	 * 
	 * @return the icon16
	 */
	public ImageDescriptor getIcon16();

	/**
	 * Gets the icon32.
	 * 
	 * @return the icon32
	 */
	public ImageDescriptor getIcon32();

}
