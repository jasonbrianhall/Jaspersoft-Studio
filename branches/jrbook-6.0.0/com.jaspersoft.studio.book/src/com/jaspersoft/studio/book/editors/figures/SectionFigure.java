package com.jaspersoft.studio.book.editors.figures;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.book.models.MReportPartContainer;

public class SectionFigure extends RectangleFigure {

	private MReportPartContainer model;
	
	public SectionFigure(MReportPartContainer model){
		this.model = model;
		setLayoutManager(new FlowLayout(true));
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.setLineWidth(5);
		graphics.setForegroundColor(ResourceManager.getColor(0, 100, 255));
		Rectangle figureBounds = getBounds();
		graphics.drawLine(figureBounds.x, figureBounds.y, figureBounds.x, figureBounds.y + figureBounds.height);
		graphics.setLineWidth(1);
		graphics.drawLine(figureBounds.x+5, figureBounds.y+15, figureBounds.x+figureBounds.width, figureBounds.y+15);
		graphics.getFont().getFontData()[0].setHeight(12);
		graphics.drawText(model.getDisplayText(), figureBounds.x+5, figureBounds.y+1);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
	}
	
	@Override
	protected void paintChildren(Graphics graphics) {
		Rectangle figureBounds = getBounds();
		for (int i = 0; i < getChildren().size(); i++) {
			IFigure child = (IFigure) getChildren().get(i);
			child.getBounds().setX(figureBounds.x+20);
		}
		super.paintChildren(graphics);
	}
}
