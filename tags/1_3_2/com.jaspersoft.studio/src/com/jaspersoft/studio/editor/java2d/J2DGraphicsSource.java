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

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GraphicsSource;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
/*
 * The Class J2DGraphicsSource.
 */
public final class J2DGraphicsSource implements GraphicsSource
{
	  
  	/** The offsceeen buffered image. */
  	private BufferedImage offsceeenBufferedImage;
	  
  	/** The graphics2d. */
  	private Graphics2D graphics2d;
	  
  	public Graphics2D getGraphics2d() {
			return graphics2d;
		}

		/** The c. */
  	private Control c;
	  
  	/** The graphics context. */
  	private GC graphicsContext;
	  
  	/** The e. */
  	private org.eclipse.draw2d.geometry.Rectangle e;
	  
  	/** The renderer. */
  	private ImageRenderer renderer = RendererFactory.a();

	  /**
		 * Instantiates a new j2 d graphics source.
		 * 
		 * @param paramControl
		 *          the param control
		 */
  	public J2DGraphicsSource(Control paramControl) {
	    this.c = paramControl;
//	    System.out.println("Control: " + paramControl); //$NON-NLS-1$
//	    System.out.flush();
	  }
	  
	  /**
		 * Instantiates a new j2 d graphics source.
		 * 
		 * @param gc
		 *          the gc
		 */
  	public J2DGraphicsSource(GC gc) {
		    this.graphicsContext = gc;
	  }

	  /* (non-Javadoc)
  	 * @see org.eclipse.draw2d.GraphicsSource#getGraphics(org.eclipse.draw2d.geometry.Rectangle)
  	 */
  	public final Graphics getGraphics(org.eclipse.draw2d.geometry.Rectangle paramRectangle) {
		if ((((this.c == null) || (this.c.isDisposed()))) && (this.graphicsContext == null)) {
	      return null;
	    }
		
	    if (this.c != null) {
	      Point localObject = this.c.getSize();
	      this.e = new org.eclipse.draw2d.geometry.Rectangle(0, 0, (localObject).x, (localObject).y);
	    } else {
	      Rectangle localObject = this.graphicsContext.getClipping();
	      this.e = new org.eclipse.draw2d.geometry.Rectangle((localObject).x, (localObject).y, (localObject).width, (localObject).height);
	    }

	    this.e.intersect(paramRectangle);
	    if (this.e.isEmpty()) {
	      return null;
	    }
	    this.offsceeenBufferedImage = new BufferedImage(this.e.width, this.e.height, 2);
	    this.graphics2d = this.offsceeenBufferedImage.createGraphics();
	    
	    if (this.c != null) {
	      this.graphicsContext = new GC(this.c);
	    }
	    
	    Graphics localObject =  new J2DGraphics( this.graphicsContext, this.graphics2d);
	    
	    
	    (localObject).translate(this.e.getLocation().negate());
	    (localObject).setClip(paramRectangle);

	    (localObject).clipRect(this.e.getCopy());
	    return (localObject);
	  }

	  /* (non-Javadoc)
  	 * @see org.eclipse.draw2d.GraphicsSource#flushGraphics(org.eclipse.draw2d.geometry.Rectangle)
  	 */
  	public final void flushGraphics(org.eclipse.draw2d.geometry.Rectangle paramRectangle) {
	    if (this.e.isEmpty()) {
	      return;
	    }
	    int[] imagePixels = ((DataBufferInt)this.offsceeenBufferedImage.getData().getDataBuffer()).getData();
	    
	    this.renderer.render(getDisplay(), this.graphicsContext, imagePixels, 0, 0, this.e.width, this.e.height, this.e.x, this.e.y, this.e.width, this.e.height);
	    
	    J2DGraphics.flushImageCache();
	    
	    if (this.c != null)
	      this.graphicsContext.dispose();
	    this.graphics2d.dispose();
	  }

	  /**
		 * Gets the display.
		 * 
		 * @return the display
		 */
  	private Display getDisplay() {
	    if (this.c != null) {
	      return this.c.getDisplay();
	    }

	    Display display = Display.getCurrent();
	    if (display == null) display = Display.getDefault(); 
	    
	    return display;
	  }
	}
