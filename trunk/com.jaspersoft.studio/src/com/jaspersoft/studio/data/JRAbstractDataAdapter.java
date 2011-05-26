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
package com.jaspersoft.studio.data;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;

/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: JRBaseBand.java 4319 2011-05-17 09:22:14Z teodord $
 */
public abstract class JRAbstractDataAdapter implements JRDataAdapter
{
	/**
	 *
	 */
	private String name;
	private Map<String, Object> parameters;
    
	/**
	 *
	 */
	public String getName()
	{
		return name;
	}
	  
	/**
	 *
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	  
  /**
   *
   */
  public Map<String, Object> getParameters() throws JRException
  {
  	if (parameters == null)
  	{
  		parameters = new HashMap<String, Object>();
  		
  		contributeParameters(parameters);
  	}
  	return parameters;
  }
  
  /**
   *
   */
  public abstract void contributeParameters(Map<String, Object> parameters) throws JRException;
  
}
