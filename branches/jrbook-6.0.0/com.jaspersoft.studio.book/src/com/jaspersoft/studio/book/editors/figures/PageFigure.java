package com.jaspersoft.studio.book.editors.figures;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.book.models.MReportPart;



public class PageFigure extends RectangleFigure {

	private MReportPart model;
	
	private Image scaledImage = null;
	
	public PageFigure(MReportPart model){
		super();
		this.model = model;
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		Rectangle figureBounds = getBounds();
		Rectangle imagebounds = new Rectangle(figureBounds);
		imagebounds.setHeight(figureBounds.height - 11);
		if (scaledImage == null){
			scaleImage(ResourceManager.getImage(model.getImageDescriptor()), imagebounds);
		}
		int imageWidth = scaledImage.getImageData().width;
		int leftMargin = Math.abs(figureBounds.width-imageWidth)/2;
		graphics.drawImage(scaledImage, leftMargin, 0);
		
		//Draw the text
		
		graphics.getFont().getFontData()[0].setHeight(10);
		int charWidth = graphics.getFontMetrics().getAverageCharWidth();
		String text = model.getDisplayText();
		
		int textWidth = text.length()*charWidth;
		if (textWidth>figureBounds.width){
			int maxCahrs = (figureBounds.width/charWidth)-1;
			text = text.substring(text.length()-maxCahrs+3);//the plus 3 is to add the three dots
			text = "..." + text;
			textWidth = text.length()*charWidth;
		}
		int textLeftMargin = Math.abs(figureBounds.width-textWidth)/2;
		graphics.drawText(text, textLeftMargin, figureBounds.height - 10);
	}
	
	private void scaleImage(Image sourceImage, Rectangle size) {
		int newWidth = 0;
		int newHeight = 0;
		int srcWidth = sourceImage.getImageData().width;
		int srcHeight = sourceImage.getImageData().height;
		//Keep proportion basing them on the longest edge
		if (srcWidth > srcHeight) {
			newWidth = size.width;
			newHeight = (newWidth * srcHeight) / srcWidth;
		} else {
			newHeight = size.height;
			newWidth = (newHeight * srcWidth) / srcHeight;
		}
		scaledImage = new Image(UIUtils.getDisplay(), sourceImage.getImageData().scaledTo(newWidth, newHeight));
	}
}
