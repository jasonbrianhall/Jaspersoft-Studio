package com.jaspersoft.studio.book.editors.figures;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.model.MReport;

public class BookFigure extends RectangleFigure {

	private MReport model;
	
	public BookFigure(MReport model){
		this.model = model;
		setLayoutManager(new FlowLayout(false));
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.setBackgroundColor(ResourceManager.getColor(255, 255, 255));
		graphics.fillRectangle(getBounds());
	}

	@Override
	protected void outlineShape(Graphics graphics) {
	}
	
}
