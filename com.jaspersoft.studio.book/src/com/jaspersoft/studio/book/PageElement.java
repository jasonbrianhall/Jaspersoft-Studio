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
package com.jaspersoft.studio.book;

import java.io.File;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.book.controls.IGalleryElement;

/**
 * Implementations of a gallery element to represent
 * a page of a pagebook
 * 
 * @author Orlandin Marco
 *
 */
public class PageElement implements IGalleryElement {
	
	/**
	 * Descriptor of the page image
	 */
	private ImageDescriptor imageDescriptor;
	
	/**
	 * Path of the report that generate the page
	 */
	private String reportPath;
	
	/**
	 * Create the container
	 * 
	 * @param image Descriptor of the page image
	 * @param reportPath Path of the report that generate the page
	 */
	public PageElement(ImageDescriptor image, String reportPath){
		this.imageDescriptor = image;
		this.reportPath = reportPath;
	}

	/**
	 * Return the image from the imageDescriptor. The image 
	 * is cached inside the resource image
	 * 
	 * @return a cached a not null swt image
	 */
	public Image getImage(){
		return ResourceManager.getImage(imageDescriptor);
	}

	/**
	 * Return the title of the element as the filename
	 * of the report
	 * 
	 * @return a not null filename without the path
	 */
	@Override
	public String getTitle() {
		 File selectedResource = new File(reportPath);
		 return selectedResource.getName();
	}

	/**
	 * Return the path of the report
	 */
	@Override
	public Object getData() {
		return reportPath;
	}
}
