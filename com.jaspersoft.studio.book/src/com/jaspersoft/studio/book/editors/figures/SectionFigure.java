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

import com.jaspersoft.studio.book.editparts.BookSectionEditPart;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.APropertyNode;

public class SectionFigure extends RectangleFigure {

	private BookSectionEditPart parentPart;
	
	public SectionFigure(BookSectionEditPart parentPart){
		this.parentPart = parentPart;
		setLayoutManager(new FlowLayout());

	}
	
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		Rectangle currentBounds = getBounds();
		int preferredHeight = PageFigure.PREFERRED_HEIGHT;
		if (currentBounds.width > 0){
			int numberForLine = currentBounds.width / (PageFigure.PREFERRED_WIDTH + 5);
			int numberOfLines = (parentPart.getChildren().size() / numberForLine);
			if (parentPart.getChildren().size() % numberForLine >0) numberOfLines++;
			if (numberOfLines == 0 ) numberOfLines++;
			preferredHeight = preferredHeight * numberOfLines;
		}
		return new Dimension(-1, preferredHeight+50);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		int oldLineWidth = graphics.getLineWidth();
		Color oldForeColor = graphics.getForegroundColor();
		Color oldBackColor = graphics.getBackgroundColor();
		
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
	protected void outlineShape(Graphics graphics) {
	}
	
	@Override
	protected void paintChildren(Graphics graphics) {
		super.paintChildren(graphics);
		if (DropEffectManager.INSTANCE.getContainer() == parentPart){
			EditPart afterPart = DropEffectManager.INSTANCE.afterPart();
			int oldLineWidth = graphics.getLineWidth();
			Color oldLineColor = graphics.getForegroundColor();
			graphics.setLineWidth(2);
			graphics.setForegroundColor(ResourceManager.getColor(0,0,0));
			if (afterPart == null){
				if (getChildren().size()>0){
					IFigure childFigure = (IFigure)getChildren().get(0);
					Rectangle figureBound = childFigure.getBounds();
					graphics.drawLine(figureBound.x, figureBound.y, figureBound.x, figureBound.y+figureBound.height);
				} 
			} else {
				int index = parentPart.getChildren().indexOf(afterPart);
				if (index != -1){
					IFigure childFigure = (IFigure)getChildren().get(0);
					if (index == (getChildren().size()-1)){
						Rectangle figureBound = childFigure.getBounds();
						graphics.drawLine(figureBound.x+figureBound.width, figureBound.y, figureBound.x+figureBound.width, figureBound.y+figureBound.height);
					} else {
						IFigure nextFigure = (IFigure)getChildren().get(index+1);
						Rectangle figureBound = childFigure.getBounds();
						Rectangle nextFigureBound = nextFigure.getBounds();
						int x = ((nextFigureBound.x-figureBound.x+figureBound.width)/2)+(figureBound.x+figureBound.width);
						graphics.drawLine(x, figureBound.y, x, figureBound.y+figureBound.height);
					}
				}
			}
			graphics.setLineWidth(oldLineWidth);
			graphics.setForegroundColor(oldLineColor);
		}
	}
}
