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
package com.jaspersoft.studio.editor.gef.figures;

import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRRectangle;

import com.jaspersoft.studio.jasper.JSSDrawVisitor;
/*
 * The Class RectangleFigure.
 */
public class RectangleFigure extends LineFigure {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.editor.gef.figures.LineFigure#draw(net.sf.jasperreports.engine.export.draw.DrawVisitor,
	 * net.sf.jasperreports.engine.JRElement)
	 */
	@Override
	protected void draw(JSSDrawVisitor drawVisitor, JRElement jrElement) {
		drawVisitor.visitRectangle((JRRectangle) jrElement);
	}

}
