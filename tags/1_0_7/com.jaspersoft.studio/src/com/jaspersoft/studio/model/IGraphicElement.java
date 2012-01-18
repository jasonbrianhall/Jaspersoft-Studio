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
package com.jaspersoft.studio.model;

import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.draw2d.geometry.Rectangle;
/*
 * The Interface IGraphicElement.
 * 
 * @author Chicu Veaceslav
 */
public interface IGraphicElement {

	/**
	 * Gets the bounds.
	 * 
	 * @return the bounds
	 */
	public Rectangle getBounds();

	/**
	 * Gets the default width.
	 * 
	 * @return the default width
	 */
	public int getDefaultWidth();

	/**
	 * Gets the default height.
	 * 
	 * @return the default height
	 */
	public int getDefaultHeight();

	/**
	 * Creates the jr element.
	 * 
	 * @param jasperDesign
	 *          the jasper design
	 * @return the jR design element
	 */
	public abstract JRDesignElement createJRElement(JasperDesign jasperDesign);
}
