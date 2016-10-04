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
package com.jaspersoft.studio.properties.internal;

/**
 * Define an input type for a specific section
 * 
 * @author Orlandin Marco
 */
public class InputType {

	/**
	 * A full class name, that it is the type handled by the section
	 */
	private String type;
	
	/**
	 * Flag used to know if the section can handle also subtypes of the specified type
	 */
	private boolean excludeSubtypes;
	
	/**
	 * Create an instance of the class
	 * 
	 * @param type A full class name, that it is the type handled by the section
	 * @param excludeSubtypes Flag used to know if the section can handle also subtypes of the specified type
	 */
	public InputType(String type, boolean excludeSubtypes){
		this.type = type;
		this.excludeSubtypes = excludeSubtypes;
	}

	/**
	 * Return the type handled by the section
	 * 
	 * @return a not null string, that should be a fully class name
	 */
	public String getType() {
		return type;
	}

	/**
	 * Return if the subtype of the type are handled or not by the section
	 * 
	 * @return true if the subtypes are not allowed, false otherwise
	 */
	public boolean isExcludeSubtype() {
		return excludeSubtypes;
	}
}
