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
package com.jaspersoft.studio.data.storage;

import java.io.File;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.jaspersoft.studio.ConfigurationManager;
import com.jaspersoft.studio.IConversionFilenameProvider;

/**
 * Name provider for the data adapters configuration files inside a storage
 * 
 * @author Orlandin Marco
 *
 */
public class DataAdapterNameConverter implements IConversionFilenameProvider {

	/**
	 * Search a valid file name for a file to place in the data adapter storage.
	 * It starts from a base name and then iterate by appending to it a counter until
	 * a valid name is found. Also all the spaces are substituted with _
	 * 
	 * @param baseName the base name to calculate the file name
	 * @return an unique and valid filename
	 */
	public String iterateForUniqueName(String baseName){
		String fileName = baseName.replaceAll(" ", "_") + ".xml";
		File storage = ConfigurationManager.getStorage(PreferencesDataAdapterStorage.PREF_KEYS_DATA_ADAPTERS);
		File testName = new File(storage, fileName);
		int counter = 0;
		while(testName.exists()){
			fileName = baseName + "_" + String.valueOf(counter) + ".xml";
			counter++;
			testName = new File(storage, fileName);
		}
		return fileName;
	}
	
	/**
	 * Get the name for a data adapter configuration element. It uses
	 * the content of the tag name as base name for the data adapter.
	 * If the tag name can't be found it fallback and uses the data 
	 * adapter type
	 */
	@Override
	public String getFileName(Node configurationElementNode) {
		NodeList adapterNode = configurationElementNode.getChildNodes();
		for (int i = 0; i < adapterNode.getLength(); i++){
			Node adapterChild = adapterNode.item(i);
			if (adapterChild.getNodeName().equals("name") && !adapterChild.getTextContent().isEmpty()){
				return iterateForUniqueName(adapterChild.getTextContent());
			}
		}
		//The data adapter has not a name tag (use the type as base name)
		return null;//iterateForUniqueName(configurationElementNode.getNodeName());
	}
}
