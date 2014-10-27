package com.jaspersoft.studio.book.editors.figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.book.models.MReportPart;

public class BookPagesFigure extends RectangleFigure {

	private MReportPart model;
	
	private Image scaledImage = null;
	
	public static final int PREFERRED_HEIGHT = 150;
	
	public static final int PREFERRED_WIDTH = 150;
	
	public BookPagesFigure(MReportPart model){
		super();
		this.model = model;
		setPreferredSize(PREFERRED_WIDTH, PREFERRED_HEIGHT);
		setOutline(false);
		ToolbarLayout layout = new ToolbarLayout(false);
		layout.setMinorAlignment(OrderedLayout.ALIGN_CENTER);
		layout.setSpacing(5);
		setLayoutManager(layout);
		setBackgroundColor(ResourceManager.getColor(255, 255, 255));
		if (scaledImage == null){
			Image sourceImage = ResourceManager.getImage(model.getImageDescriptor());
			scaleImage(sourceImage, getPreferredSize().width, getPreferredSize().height-20);
		}
		
		ImageFigure imageFigure = new ImageFigure(scaledImage);
		imageFigure.setAlignment(PositionConstants.CENTER);
		add(imageFigure);
		
		String text = this.model.getDisplayText();
		if(text.length()>20){
			text = "..."+text.substring(text.length()-17);
		}
		Label textFigure = new Label(text);
		textFigure.setTextAlignment(PositionConstants.CENTER);
		add(textFigure);
		TooltipFigure toolTipFigure = new TooltipFigure();
		toolTipFigure.setMessage(model.getDisplayText());
		setToolTip(toolTipFigure);
	}
	
	@Override
	public void setBounds(Rectangle rect) {
		super.setBounds(new Rectangle(rect.x+15, rect.y+25, rect.width, rect.height));
	}
	
	// FIXME ADD Scaling method to ResourceManager so handle correctly image disposal!
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
