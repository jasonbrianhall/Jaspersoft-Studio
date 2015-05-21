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
package com.jaspersoft.studio.editor.preview.view.report.system;

/**
 * This class must be implemented to create an Exporter Factory. An exporter 
 * factory provide a custom exporter and it is accessible from the preview on
 * the output format menu.
 * 
 * @author Orlandin Marco
 *
 */
public abstract class AExporterFactory {

	/**
	 * Define if this exporter has a separator before it on the menu
	 */
	protected boolean placeSeparator = false;
	
	/**
	 * Return the type of an ACustomViewer class. This class will act as wrapper of the JRExporter element
	 * 
	 * @return a not null ACustomViewer class type
	 */
	public abstract Class<? extends ACustomViewer> getViewerClass();
	
	/**
	 * Return the name of the exporter 
	 * 
	 * @return a not null and unique name of the exporter, it will be a selectable item on the preview output format.
	 * If the name is null or not unique it will be not inserted among the exporters and a warning will be logged
	 */
	public abstract String getExporterName();
	
	/**
	 * Return if in the output format list this element has a separator placed before
	 * 
	 * @return true if the element has a separator placed before, false otherwise
	 */
	public boolean isSeparatorPlacedBefore(){
		return placeSeparator;
	}
	
	/**
	 * Set if in the output format list this element has a separator placed before
	 * 
	 * @param value true if the element has a separator placed before, false otherwise
	 */
	public void setSeparatorPlacedBefore(boolean value){
		placeSeparator = value;
	}
}
