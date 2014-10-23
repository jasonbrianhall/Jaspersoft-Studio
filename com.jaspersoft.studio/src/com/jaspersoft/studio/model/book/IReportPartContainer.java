package com.jaspersoft.studio.model.book;

import java.util.List;

import net.sf.jasperreports.engine.design.JRDesignSection;

public interface IReportPartContainer {

	List<MReportPart> getReportParts();
	
	JRDesignSection getSection();
	
}
