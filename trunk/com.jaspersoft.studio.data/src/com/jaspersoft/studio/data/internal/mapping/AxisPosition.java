/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2013 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.data.internal.mapping;

/**
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 * @version $Id: AxisPosition.java 5879 2013-01-07 20:35:36Z teodord $
 */
public class AxisPosition
{
	public static final int POSITION_UNSPECIFIED = -1;
	
	private final int idx;
	
	public AxisPosition (int idx)
	{
		this.idx = idx;
	}
	
	public int getPosition ()
	{
		return idx;
	}
	
	public boolean isSpecified ()
	{
		return idx != POSITION_UNSPECIFIED;
	}
}
