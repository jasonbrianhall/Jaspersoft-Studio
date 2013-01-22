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
package com.jaspersoft.studio.community.issues;
import java.util.Arrays;
import java.util.List;

import com.jaspersoft.studio.community.requests.IssueRequest;

/**
 * Representation for a generic bug field belonging to a new tracker issue
 * request.
 * <p>
 * 
 * The field can be specified as an array type ({@link #setIsArray(boolean)}).
 * Moreover sub-classes could override the {@link #getValueAttributeName()}
 * method in order to produce a different value attribute name from the standard
 * one <code>value</code>.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 * @see IssueRequest
 * 
 */
public class IssueField {

	private String name;
	private List<String> values;
	private boolean isArray;

	public IssueField(){
	}
	
	public IssueField(String name, String value){
		setName(name);
		setValue(value);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getValues() {
		return values;
	}
	
	public void setValues(List<String> values) {
		this.values = values;
	}
	
	public void setValue(String value){
		this.values=Arrays.asList(value);
	}
	
	public String asJsonString(){
		StringBuffer sb = new StringBuffer();
		sb.append("\"").append(name).append("\":{");
		sb.append("\"und\":");
		if(isArray()){
			sb.append("[");
		}
		appendAllValues(sb);
		if(isArray()){
			sb.append("]");
		}
		sb.append("}");
		return sb.toString();
	}
	
	public boolean isArray(){
		return isArray;
	}
	
	public void setIsArray(boolean isArray){
		this.isArray = isArray;
	}
	
	private void appendAllValues(StringBuffer sb){
		int valuesNum = values.size();
		int i = 0;
		while(i < valuesNum){
			sb.append("{\"").append(getValueAttributeName()).append("\": \"").append(values.get(i)).append("\"}");			
			if(i!=valuesNum-1){
				sb.append(",");
			}
			i++;
		}
	}
	
	protected String getValueAttributeName(){
		return "value";
	}
}
