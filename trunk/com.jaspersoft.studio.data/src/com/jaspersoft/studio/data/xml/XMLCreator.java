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
package com.jaspersoft.studio.data.xml;

import java.util.Locale;
import java.util.TimeZone;

import net.sf.jasperreports.data.xml.XmlDataAdapterImpl;
import net.sf.jasperreports.eclipse.util.DataFileUtils;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.adapter.IDataAdapterCreator;

/**
 * Creator to build a JSS XML data adapter from the xml definition of an iReport XML 
 * data adapter
 * 
 * @author Orlandin Marco
 */
public class XMLCreator implements IDataAdapterCreator {

	@Override
	public DataAdapterDescriptor buildFromXML(Document docXML) {
		XmlDataAdapterImpl result = new XmlDataAdapterImpl();
		
		NamedNodeMap rootAttributes = docXML.getChildNodes().item(0).getAttributes();
		String connectionName = rootAttributes.getNamedItem("name").getTextContent();
		result.setName(connectionName);
		
		NodeList children = docXML.getChildNodes().item(0).getChildNodes();
		String localeVariant = null;
		String localeLanguage = null;
		String localeCountry = null;
		for(int i=0; i<children.getLength(); i++){
			Node node = children.item(i);
			if (node.getNodeName().equals("connectionParameter")){
				String paramName = node.getAttributes().getNamedItem("name").getTextContent();
				String textContent = node.getTextContent();
				if (paramName.equals("NumberPattern")) {
					result.setNumberPattern(textContent);
				}
				if (paramName.equals("DatePattern")) {
					result.setDatePattern(textContent);					
				}
				if (paramName.equals("UseConnection")) {
					result.setUseConnection(textContent.equals("true"));
				}
				if (paramName.equals("SelectExpression")) {
					result.setSelectExpression(textContent);
				}
				if (paramName.equals("Filename")) {
					result.setDataFile(DataFileUtils.getDataFile(textContent));
				}
				if (paramName.equals("Locale_variant")) {
					localeVariant = textContent;
				}
				if (paramName.equals("Locale_country")) {
					localeCountry = textContent;
				}
				if (paramName.equals("Locale_language")) {
					localeLanguage = textContent;
				}
				if (paramName.equals("timeZone")) {
					result.setTimeZone(TimeZone.getTimeZone(textContent)) ;
				}
			}
		}
		
		if (localeCountry != null && localeLanguage != null){
			Locale locale = new Locale(localeLanguage, localeCountry, localeVariant);
			result.setLocale(locale);
		}
		XMLDataAdapterDescriptor desc = new XMLDataAdapterDescriptor();
		desc.setDataAdapter(result);
		return desc;
	}

	@Override
	public String getID() {
		return "com.jaspersoft.ireport.designer.connection.JRXMLDataSourceConnection";
	}


}
