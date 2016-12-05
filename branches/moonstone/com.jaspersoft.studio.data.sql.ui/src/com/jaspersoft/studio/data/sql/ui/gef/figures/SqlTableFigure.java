/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.data.sql.ui.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.SWTResourceManager;

public class SqlTableFigure extends Figure {
	public static final Insets INSETS = new Insets(3, 3, 3, 3);

	private class NameLabel extends Label {

		private NameLabel(String s) {
			super(s);
			setIconAlignment(PositionConstants.RIGHT);
		}

		@Override
		public Insets getInsets() {
			return INSETS;
		}
	}

	public static Color classColor = SWTResourceManager.getColor(255, 255, 206);
	private Label lblName;
	private ColumnsFigure attributeFigure = new ColumnsFigure();
	private LineBorder border = new LineBorder(ColorConstants.black, 1);

	public SqlTableFigure(String name) {
		ToolbarLayout layout = new ToolbarLayout();
		layout.setSpacing(5);
		setLayoutManager(layout);
		setBorder(border);
		setBackgroundColor(classColor);
		setOpaque(true);

		lblName = new NameLabel(name);
		add(lblName);
		add(attributeFigure);
	}

	public void add(IFigure figure, Object constraint, int index) {
		if (figure instanceof ColumnFigure)
			attributeFigure.add(figure);
		else
			super.add(figure, constraint, index);
	}

	public void setName(String name) {
		lblName.setText(name);
	}

	public void setLabelIcon(Image ico) {
		lblName.setIcon(ico);
	}

	public void showSelectedBorder() {
		border.setWidth(2);
		invalidate();
		repaint();
	}

	public void hideSelectedBorder() {
		border.setWidth(1);
		invalidate();
		repaint();
	}
}
