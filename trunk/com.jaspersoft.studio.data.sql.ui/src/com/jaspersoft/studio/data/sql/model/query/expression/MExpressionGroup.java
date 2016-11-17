/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.data.sql.model.query.expression;

import net.sf.jasperreports.engine.JRConstants;

import org.eclipse.jface.viewers.StyledString;

import com.jaspersoft.studio.data.sql.model.query.AMKeyword;
import com.jaspersoft.studio.data.sql.model.query.from.MFromTableJoin;
import com.jaspersoft.studio.data.sql.model.query.subquery.MQueryTable;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.preferences.fonts.utils.FontUtils;

public class MExpressionGroup extends AMKeyword {
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public MExpressionGroup(ANode parent) {
		super(parent, AMKeyword.AND_OPERATOR, null);
	}

	private boolean isNot = false;

	public boolean isNot() {
		return isNot;
	}

	public void setNot(boolean isNot) {
		this.isNot = isNot;
	}

	@Override
	public String getDisplayText() {
		String str = "";
		if (!isFirst()) {
			if (getParent() instanceof MFromTableJoin
					&& getParent().getValue() instanceof MQueryTable) {
				MFromTableJoin mftj = (MFromTableJoin) getParent();
				str += ") " + mftj.addAlias() + " ON ";
			} else
				str += super.getDisplayText();
		}
		if (isNot)
			str += " NOT ";
		str += " (";
		if (getChildren().isEmpty())
			str += ")";
		return str;
	}

	@Override
	public StyledString getStyledDisplayText() {
		StyledString ss = new StyledString();

		if (!isFirst())
			ss.append(super.getDisplayText() + " ", FontUtils.KEYWORDS_STYLER);

		if (isNot)
			ss.append("NOT ", FontUtils.KEYWORDS_STYLER);
		ss.append("(");
		if (getChildren().isEmpty())
			ss.append(")");
		return ss;
	}

	@Override
	public String toSQLString() {
		return "\n\t " + getDisplayText() + " ";
	}
}
