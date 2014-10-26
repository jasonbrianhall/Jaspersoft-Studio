package com.jaspersoft.studio.book.editors.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.model.MReport;

public class BookReportFigure extends RectangleFigure {

	private MReport model;
	
	public BookReportFigure(MReport model){
		this.model = model;
		GridLayout layout = new GridLayout(1, false);
		setLayoutManager(layout);
		setBounds(new Rectangle(5, 5, 1000, 1000));
	}
	
	@Override
	public void add(IFigure figure, Object constraint, int index) {
		GridData dataConstraint = new GridData(GridData.FILL_HORIZONTAL);
		super.add(figure, dataConstraint, index);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		Color oldBackColor = graphics.getBackgroundColor();
		
		graphics.setBackgroundColor(ResourceManager.getColor(255, 255, 255));
		graphics.fillRectangle(getBounds());
		
		graphics.setBackgroundColor(oldBackColor);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
	}
	
}
