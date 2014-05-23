package com.jaspersoft.studio.model.command;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JasperDesign;

public interface IQueryLanguageChanged {
	public void syncDataset(JasperDesign jd, JRDesignDataset ds, String oldLang, String newLang) throws JRException;
}
