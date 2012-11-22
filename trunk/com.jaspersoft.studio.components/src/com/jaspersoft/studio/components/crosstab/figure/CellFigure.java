/*******************************************************************************
 * Copyright (C) 2010 - 2012 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.components.crosstab.figure;

import net.sf.jasperreports.crosstabs.design.JRDesignCellContents;
import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRLineBox;
import net.sf.jasperreports.engine.export.draw.DrawVisitor;

import com.jaspersoft.studio.editor.gef.figures.FrameFigure;

public class CellFigure extends FrameFigure {
	private JRDesignCellContents cell;

	public CellFigure() {
		super();
	}

	public void setJRElement(JRDesignCellContents jrElement,
			DrawVisitor drawVisitor) {
		this.cell = jrElement;
		super.setJRElement(null, drawVisitor);
		setSize(getElementWidth(), getElementHeight());
	}

	@Override
	protected JRLineBox getLineBox() {
		JRLineBox box = null;
		box = cell.getLineBox();
		if (box == null && cell.getStyle() != null)
			box = cell.getStyle().getLineBox();

		return box;
	}

	@Override
	protected int getElementHeight() {
		return cell.getHeight();
	}

	@Override
	protected int getElementWidth() {
		return cell.getWidth();
	}

	@Override
	protected void draw(DrawVisitor drawVisitor, JRElement jrElement) {
	}
}
