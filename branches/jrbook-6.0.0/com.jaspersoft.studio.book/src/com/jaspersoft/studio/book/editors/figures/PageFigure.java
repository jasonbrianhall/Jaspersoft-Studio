package com.jaspersoft.studio.book.editors.figures;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.book.models.MReportPart;



public class PageFigure extends RectangleFigure {

	private MReportPart model;
	
	private Image scaledImage = null;
	
	public PageFigure(MReportPart model){
		super();
		this.model = model;
		setPreferredSize(150, 150);
		setLayoutManager(new GridLayout(1, false));
		if (scaledImage == null){
			Image sourceImage = ResourceManager.getImage(model.getImageDescriptor());
			scaleImage(sourceImage, getPreferredSize().width, getPreferredSize().height-20);
		}
		
		ImageFigure imageFigure = new ImageFigure(ResourceManager.getImage(model.getImageDescriptor()));
		imageFigure.setBackgroundColor(getBackgroundColor());
		imageFigure.setAlignment(PositionConstants.CENTER);
		GridData imageData = new GridData();
		imageData.horizontalAlignment = SWT.CENTER;
		imageData.verticalAlignment = SWT.FILL;
		add(imageFigure, imageData);
		setBackgroundColor(ResourceManager.getColor(255, 0, 0));
		
		String text = model.getDisplayText();
		GridData textData = new GridData();
		textData.horizontalAlignment = SWT.CENTER;
		textData.verticalAlignment = SWT.TOP;
		add(new Label(text), textData);
	
	}
	
	@Override
	public void setBounds(Rectangle rect) {
		super.setBounds(new Rectangle(rect.x+15, rect.y+25, rect.width, rect.height));
	}
	

	@Override
	protected void fillShape(Graphics graphics) {
		/*Rectangle figureBounds = getBounds();
		Rectangle imagebounds = new Rectangle(figureBounds);
		imagebounds.setHeight(figureBounds.height - 11);
		if (scaledImage == null){
			scaleImage(ResourceManager.getImage(model.getImageDescriptor()), imagebounds);
		}
		int imageWidth = scaledImage.getImageData().width;
		int leftMargin = Math.abs(figureBounds.width-imageWidth)/2;
		graphics.drawImage(scaledImage, figureBounds.x+leftMargin, figureBounds.y);
		
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
		graphics.drawText(text, figureBounds.x+textLeftMargin, figureBounds.y + figureBounds.height - 10);*/
	}
	
	@Override
	protected void outlineShape(Graphics graphics) {
	}
	
	private void scaleImage(Image sourceImage, int width, int height) {
		int newWidth = 0;
		int newHeight = 0;
		int srcWidth = sourceImage.getImageData().width;
		int srcHeight = sourceImage.getImageData().height;
		//Keep proportion basing them on the longest edge
		if (srcWidth > srcHeight) {
			newWidth = width;
			newHeight = (newWidth * srcHeight) / srcWidth;
		} else {
			newHeight = height;
			newWidth = (newHeight * srcWidth) / srcHeight;
		}
		scaledImage = new Image(null, sourceImage.getImageData().scaledTo(newWidth, newHeight));
	}
}
