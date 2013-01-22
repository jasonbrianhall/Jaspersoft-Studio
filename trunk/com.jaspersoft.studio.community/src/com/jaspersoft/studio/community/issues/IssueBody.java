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

import com.jaspersoft.studio.community.requests.IssueRequest;

/**
 * Body content for an new tracker issue request.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 * @see IssueRequest
 *
 */
public class IssueBody {
	
	private String bodyContent;
	
	public IssueBody(String bodyContent){
		this.bodyContent = bodyContent;
	}
	
	public String asJsonString(){
		StringBuffer sb = new StringBuffer();
		sb.append("\"body\":{");
		sb.append("\"und\":[");
		sb.append("{");
		sb.append("\"value\": \"").append(bodyContent).append("\",");
		sb.append("\"format\": \"plain_text_html\"");
		sb.append("}");
		sb.append("]");
		sb.append("}");
		return sb.toString();
	}
}
