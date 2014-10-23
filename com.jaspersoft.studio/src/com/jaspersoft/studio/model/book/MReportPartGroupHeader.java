package com.jaspersoft.studio.model.book;

import com.jaspersoft.studio.model.ANode;

import net.sf.jasperreports.engine.JRConstants;
import net.sf.jasperreports.engine.design.JRDesignGroup;

public class MReportPartGroupHeader extends MReportPartGroup {
	
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public MReportPartGroupHeader(ANode parent, JRDesignGroup group, int index) {
		super(parent, group, index, PartSectionTypeEnum.GROUP_HEADER);
	}

}
