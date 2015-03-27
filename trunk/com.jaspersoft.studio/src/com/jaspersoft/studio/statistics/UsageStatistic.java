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
package com.jaspersoft.studio.statistics;

import org.eclipse.core.runtime.Assert;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container for a single statistic, can be converted into a JSON string
 * 
 * @author Orlandin Marco
 *
 */
public class UsageStatistic {
	
	/**
	 * The identifier of the action
	 */
	private String id;
	
	/**
	 * The category of the action
	 */
	private String category;
	
	/**
	 * How many times the action was used
	 */
	private int usagesNumber;
	
	/**
	 * Build the container of the statistic
	 * 
	 * @param id A not null identifier of the action
	 * @param category A not null category of the action
	 * @param usagesNumber a positive number of usages for the action
	 */
	@JsonCreator
	public UsageStatistic(@JsonProperty("id") String id, @JsonProperty("category") String category, @JsonProperty("usagesNumber") int usagesNumber){
		Assert.isNotNull(id);
		Assert.isNotNull(category);
		Assert.isTrue(usagesNumber>=0);
		this.id = id;
		this.category = category;
		this.usagesNumber = usagesNumber;
	}
	
	/**
	 * Return the action id
	 * 
	 * @return A not null identifier of the action
	 */
	public String getId(){
		return id;
	}
	
	/**
	 * Return the action category
	 * 
	 * @return A not null category of the action
	 */
	public String getCategory(){
		return category;
	}
	
	/**
	 * Return the number of usages of the action
	 * 
	 * @return  a positive number of usages for the action
	 */
	public int getUsagesNumber(){
		return usagesNumber;
	}
}
