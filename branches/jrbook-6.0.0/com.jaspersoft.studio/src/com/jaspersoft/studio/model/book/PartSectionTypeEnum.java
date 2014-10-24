package com.jaspersoft.studio.model.book;

import net.sf.jasperreports.engine.type.NamedEnum;

@Deprecated
public enum PartSectionTypeEnum implements NamedEnum{
	
	UNKNOWN("unknown"),
	GROUP_HEADER("groupHeader"),
	GROUP_FOOTER("groupFooter"),
	DETAIL("detail");

	private String name;

	private PartSectionTypeEnum(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
