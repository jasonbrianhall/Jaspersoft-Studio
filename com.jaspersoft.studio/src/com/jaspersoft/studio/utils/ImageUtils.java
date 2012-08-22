/*******************************************************************************
 * Copyright (C) 2005 - 2012 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com.
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
package com.jaspersoft.studio.utils;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * Utility class for managing image related stuff.
 * <p>
 * Methods in this class could manage OS resources like fonts, colors besides images.
 * When adding new methods, please add any useful notes regarding the disposal of these resources. 
 *  
 * @author mrabbi
 *
 */
public class ImageUtils {
	private ImageUtils(){
	}
	
	/**
	 * Gets a new resized image from the specified original one.
	 * <p>
	 * Please note that the source image is not disposed or directly modified.
	 * The rescaled image returned is not cached and it is up to the caller to dispose it
	 * when no longer needed in its code.
	 * 
	 * @param originalImage the original image
	 * @param width the new width of the image
	 * @param height the new height of the image
	 * @return the resized image
	 */
	public static Image resize(Image originalImage, int width, int height) {
		// Sanity checks
		Assert.isNotNull(originalImage,"The image to resize can not be null.");
		Assert.isTrue(width > 1, "Please specify a valid width value for the new image.");
		Assert.isTrue(height > 1,"Please specify a valid height value for the new image.");
		// Perform resize operation using anti-alias and interpolation settings
		Image scaled = new Image(Display.getDefault(), width, height);
		GC gc = new GC(scaled);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(originalImage, 0, 0, originalImage.getBounds().width, originalImage.getBounds().height,0, 0, width, height);
		gc.dispose();
		return scaled;
	}
}
