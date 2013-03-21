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
package com.jaspersoft.studio.server.utils;

import java.util.ArrayList;
import java.util.List;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceProperty;

public class ResourceDescriptorUtil {
	public static ResourceProperty getProperty(String name,
			List<ResourceProperty> props) {
		for (ResourceProperty rp : props) {
			if (rp.getName().equals(name)) //$NON-NLS-1$
				return rp;
		}
		return null;
	}
	
	/**
	 * Sets the ID and the Name for the specified {@link ResourceDescriptor} target.
	 * <p>
	 * 
	 * If similar information already exists for the sibling descriptors, it create a new one. 
	 * 
	 * @param siblingDescriptors the list of sibling descriptor of the specified target one
	 * @param target the target descriptor to be modified
	 * @param suggestedID the suggested ID for the target descriptor
	 * @param suggestedName the suggested Name for the target descriptor
	 */
	public static void setProposedResourceDescriptorIDAndName(
			List<ResourceDescriptor> siblingDescriptors,
			ResourceDescriptor target, String suggestedID, String suggestedName) {
		List<String> ids = new ArrayList<String>(siblingDescriptors.size());
		List<String> names = new ArrayList<String>(siblingDescriptors.size());
		for(ResourceDescriptor rd : siblingDescriptors){
			ids.add(rd.getName());
			names.add(rd.getLabel());
		}

		// Look for a valid ID
		if(!ids.contains(suggestedID)){
			target.setName(suggestedID);
		}
		else{
			int i=1;
			while(i < 1000) {
				String newID = suggestedID + "_" + i;
				if(!ids.contains(newID)){
					target.setName(newID);
					break;
				}
				i++;
			}
		}

		// Look for a valid name		
		if(!names.contains(suggestedName)){
			target.setLabel(suggestedName);
		}
		else{
			int i=1;
			while(i < 1000) {
				String newName = suggestedName + "_" + i;
				if(!names.contains(newName)){
					target.setLabel(newName);
					break;
				}
				i++;
			}
		}
	}
	
}
