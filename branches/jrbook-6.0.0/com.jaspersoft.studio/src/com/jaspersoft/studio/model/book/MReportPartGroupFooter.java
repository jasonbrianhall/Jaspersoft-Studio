package com.jaspersoft.studio.model.book;

import net.sf.jasperreports.engine.JRConstants;
import net.sf.jasperreports.engine.design.JRDesignGroup;

import com.jaspersoft.studio.model.ANode;

@Deprecated
public class MReportPartGroupFooter extends MReportPartGroup {
	
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public MReportPartGroupFooter(ANode parent, JRDesignGroup jrgroup, int index) {
		super(parent, jrgroup, index, PartSectionTypeEnum.GROUP_FOOTER);
	}

}
