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
package com.jaspersoft.studio.data.sql.model.query;

import net.sf.jasperreports.engine.JRConstants;

import org.eclipse.jface.viewers.StyledString;

import com.jaspersoft.studio.data.sql.model.MDBObjects;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.preferences.fonts.utils.FontUtils;

public class AMKeyword extends MDBObjects implements IQueryString {

	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public static final String SELECT_KEYWORD = "SELECT";
	public static final String SELECT_DISTINCT_KEYWORD = "SELECT DISTINCT";

	public static final String AND_OPERATOR = "AND";
	public static final String OR_OPERATOR = "OR";
	public static final String[] CONDITIONS = new String[] { AND_OPERATOR, OR_OPERATOR };

	public static final String ALIAS_KEYWORD = "AS";
	public static final String ASCENDING_KEYWORD = " ASC";
	public static final String DESCENDING_KEYWORD = " DESC";
	public static final String[] ALIAS_KEYWORDS = new String[] { ALIAS_KEYWORD, " " };

	public static final String INNER_JOIN = "INNER JOIN";
	public static final String LEFT_OUTER_JOIN = "LEFT OUTER JOIN";
	public static final String CROSS_JOIN = "CROSS JOIN";
	public static final String FULL_OUTER_JOIN = "FULL OUTER JOIN";
	public static final String RIGHT_OUTER_JOIN = "RIGHT OUTER JOIN";
	public static final String[] JOIN_KEYWORDS = new String[] { INNER_JOIN, LEFT_OUTER_JOIN, RIGHT_OUTER_JOIN, FULL_OUTER_JOIN, CROSS_JOIN };

	public AMKeyword(ANode parent, String value, String image) {
		super(parent, value, image);
	}

	@Override
	public StyledString getStyledDisplayText() {
		return new StyledString(getDisplayText(), FontUtils.KEYWORDS_STYLER);
	}

	protected boolean noSqlIfEmpty = false;

	@Override
	public String toSQLString() {
		if (noSqlIfEmpty && getChildren().isEmpty())
			return "";
		return "\n" + getValue() + " ";
	}

}
