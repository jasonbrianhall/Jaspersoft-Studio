/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.widgets.framework.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Definition a series of dynamic widgets. A set of wdigets is composed of 
 * a label, a description and a set of sections (each section will contains 
 * the single widgets)
 * 
 * @author Orlandin Marco
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class WidgetsDescriptor {
	
	private String label;
	
	private String description;
	
	private List<SectionPropertyDescriptor> sections;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<SectionPropertyDescriptor> getSections() {
		if (sections == null){
			sections = new ArrayList<SectionPropertyDescriptor>();
		}
		return sections;
	}

	public void setSections(List<SectionPropertyDescriptor> sections) {
		this.sections = sections;
	}

	/**
	 * By default there is not localization support, the implementation can override
	 * to provide localization
	 * 
	 * @param key the key of the string to translate
	 * @return the string to use
	 */
	public String getLocalizedString(String key) {
		return key;
	}
	
	/**
	 * Return all the widgets in every section in a plain view. Essentially 
	 * all the widgets are aggregated and displayed at one
	 * 
	 * @return a not null list of widgets
	 */
	public List<WidgetPropertyDescriptor> getPlainWidgets(){
		List<WidgetPropertyDescriptor> result = new ArrayList<WidgetPropertyDescriptor>();
		for(SectionPropertyDescriptor section : getSections()){
			for(WidgetPropertyDescriptor widget : section.getProperties()){
				result.add(widget);
			}
		}
		return result;
	}
	
	/**
	 * Check if the descriptor has widgets to shown
	 * 
	 * @return true if it has at least on widget, false otherwise
	 */
	public boolean hasWidgets(){
		for(SectionPropertyDescriptor section : getSections()){
			if(!section.getProperties().isEmpty()){
				return true;
			}
		}
		return false;
	}

}
