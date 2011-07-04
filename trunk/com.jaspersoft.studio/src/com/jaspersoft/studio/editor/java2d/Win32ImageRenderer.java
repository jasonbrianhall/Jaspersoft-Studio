/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer.
 * Copyright (C) 2005 - 2010 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of Jaspersoft Open Studio.
 *
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Jaspersoft Open Studio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Jaspersoft Open Studio. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.editor.java2d;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.widgets.Display;
/*
 * The Class Win32ImageRenderer.
 */
public class Win32ImageRenderer implements ImageRenderer {

	private static final PaletteData PALETTE_DATA = new PaletteData(16711680, 65280, 255);
	  /* (non-Javadoc)
  	 * @see com.jaspersoft.studio.editor.java2d.ImageRenderer#render(org.eclipse.swt.widgets.Display, org.eclipse.swt.graphics.GC, int[], int, int, int, int, int, int, int, int)
  	 */
  	public final void render(Display paramDisplay, GC paramGC, int[] data, int xSrc, int ySrc, int width, int height, int xDest, int yDest, int imgWidth, int imgHeight)
	  {
  		
  		try {
  			Integer intParamGC = Integer.class.cast(paramGC.handle);
  		
		  	renderImage(intParamGC.intValue(), xDest, yDest, width, height, 0, 0, data, imgWidth, imgHeight);
	  	} catch (Throwable t)
	  	{
	  		
	  		System.out.println("Error: " + t.getMessage());
	  		System.out.flush();

	  		ImageData imageData = new ImageData(width, height, 32, PALETTE_DATA);
	    	imageData.setPixels(0, 0, data.length, data, 0);
	    	Image image = new Image(paramDisplay, imageData);
		    try {
		      paramGC.drawImage(image, 0, 0, width, height, xDest, yDest, imgWidth, imgHeight);
		      return;
		    }
		    finally
		    {
		    	image.dispose();
		    }
  		}
	    
	  }

	  static {
			System.loadLibrary("J2DWin32ImageRenderer"); //$NON-NLS-1$
		}
	  
		/**
		 * Do a bulk bitblt between a byte array and the SWT drawing surface
		 * 
		 * Coordinates are all expressed in the SWT widget coordinates, as the information usually comes from a paint event
		 * on such a surface. It is up to the native code to understand this coordinate system. <B>The byte array must have
		 * a known pixel layout, fixed for all the images: this is the main weakness of the current code! </B>
		 * 
		 * @param hdcDest
		 *          A native handle to the target widget, usually the gc.handle attribute
		 * @param xDest
		 *          The x coordinate of the upper-left destination area, in widget coordinates
		 * @param yDest
		 *          The y coordinate of the upper-left destination area, in widget coordinates
		 * @param width
		 *          The width of the destination area
		 * @param height
		 *          The height of the destination area
		 * @param xSrc
		 *          The x coordinate of the upper-left source area, also in widget coordinates
		 * @param ySrc
		 *          The y coordinate of the upper-left source area, also in widget coordinates
		 * @param data
		 *          The int array that holds the pixel data
		 * @param imgWidth
		 *          The width of the image portion in the byte array
		 * @param imgHeight
		 *          The height of the image portion in the byte array
		 */
		static public native void renderImage(int hdcDest, int xDest, int yDest,
			int width, int height, int xSrc, int ySrc, int[] data, int imgWidth, int imgHeight);
	  
}
