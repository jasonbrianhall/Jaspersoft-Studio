package com.jaspersoft.studio.book.editors.figures;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.graphics.Color;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.book.editparts.BookPagesEditPart;
import com.jaspersoft.studio.book.editparts.BookSectionEditPart;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.APropertyNode;

public class BookSectionFigure extends RectangleFigure {

	private BookSectionEditPart parentPart;
	
	private boolean drawFeedback = false;
	
	private EditPart afterPart = null;
	
	public BookSectionFigure(BookSectionEditPart parentPart){
		this.parentPart = parentPart;
		setLayoutManager(new FlowLayout());

	}
	
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		Rectangle currentBounds = getBounds();
		int preferredHeight = BookPagesFigure.PREFERRED_HEIGHT;
		if (currentBounds.width > 0){
			int numberForLine = currentBounds.width / (BookPagesFigure.PREFERRED_WIDTH + 5);
			int numberOfLines = (parentPart.getChildren().size() / numberForLine);
			if (parentPart.getChildren().size() % numberForLine >0) numberOfLines++;
			if (numberOfLines == 0 ) numberOfLines++;
			preferredHeight = preferredHeight * numberOfLines;
		}
		return new Dimension(-1, preferredHeight+50);
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);

	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		int oldLineWidth = graphics.getLineWidth();
		Color oldForeColor = graphics.getForegroundColor();
		Color oldBackColor = graphics.getBackgroundColor();
		
		graphics.setBackgroundColor(ResourceManager.getColor(255, 255, 255));
		graphics.fillRectangle(getBounds());
		
		graphics.setLineWidth(5);
		graphics.setForegroundColor(ResourceManager.getColor(0, 100, 255));
		Rectangle figureBounds = getBounds();
		graphics.drawLine(figureBounds.x, figureBounds.y, figureBounds.x, figureBounds.y + figureBounds.height);
		graphics.setLineWidth(1);
		graphics.drawLine(figureBounds.x+5, figureBounds.y+15, figureBounds.x+figureBounds.width, figureBounds.y+15);
		graphics.getFont().getFontData()[0].setHeight(12);
		ANode model = (APropertyNode)parentPart.getModel();
		graphics.drawText(model.getDisplayText(), figureBounds.x+5, figureBounds.y+1);

		graphics.setLineWidth(oldLineWidth);
		graphics.setForegroundColor(oldForeColor);
		graphics.setBackgroundColor(oldBackColor);
	}
	
	@Override
	protected void paintClientArea(Graphics graphics) {
		if (getChildren().isEmpty())
			return;
		paintChildren(graphics);
		paintDropFeedBack(graphics);
	}

	protected void paintDropFeedBack(Graphics graphics){
		if (drawFeedback){
			graphics.setLineWidth(2);
			graphics.setForegroundColor(ResourceManager.getColor(0,0,0));
			if (afterPart == null){
				if (getChildren().size()>0){
					IFigure childFigure = (IFigure)getChildren().get(0);
					Rectangle figureBound = childFigure.getBounds();
					graphics.drawLine(figureBound.x, figureBound.y, figureBound.x, figureBound.y+figureBound.height);
				} 
			} else {
				Rectangle figureBound = ((BookPagesEditPart)afterPart).getFigure().getBounds();
				int x = figureBound.x + figureBound.width-10;
				graphics.drawLine(x, figureBound.y, x, figureBound.y+figureBound.height);
			}
		}
	}
	
	@Override
	protected void outlineShape(Graphics graphics) {
	}
	
	public void clearFeedback(){
		drawFeedback = false;
	}
	
	public void drawFeedback(EditPart afterPart){
		this.afterPart = afterPart;
		drawFeedback = true;
	}
	
	public boolean hasFeedback(){
		return drawFeedback;
	}
	
	public EditPart afterPart(){
		return afterPart;
	}
}
