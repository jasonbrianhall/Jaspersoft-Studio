/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.components.table.decorator;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import net.sf.jasperreports.engine.JRPropertiesMap;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.gef.decorator.text.TextDecoratorInterface;
import com.jaspersoft.studio.editor.gef.decorator.text.TextLocation;
import com.jaspersoft.studio.editor.gef.decorator.text.TextLocation.Location;

/**
 * Decorator for the PDF table action, it also provide an interface to became a text 
 * contributor
 * 
 * @author Orlandin Marco
 *
 */
public class PDFTableDecorator implements TextDecoratorInterface {

	/**
	 * Left upper corner image
	 */
	private static ImageIcon startImageAwt = null;

	/**
	 * right lower corner image
	 */
	private static ImageIcon endImageAwt = null;

	/**
	 * Font of the text
	 */
	private static Font JSS_TEXT_FONT = new Font("SansSerif", 0, 10); //$NON-NLS-1$

	/**
	 * Color of the text
	 */
	private static Color JSS_TEXT_COLOR = new Color(195, 47, 193);
	

	/**
	 * Constructor, load the images if the weren't loaded before
	 */
	public PDFTableDecorator() {
		if (startImageAwt == null || endImageAwt == null) {
			startImageAwt = new javax.swing.ImageIcon(JaspersoftStudioPlugin.class.getResource("/icons/resources/corner1.png")); //$NON-NLS-1$
			endImageAwt = new javax.swing.ImageIcon(JaspersoftStudioPlugin.class.getResource("/icons/resources/corner2.png")); //$NON-NLS-1$
		}
	}


	/**
	 * Set the font of the displayed text
	 * 
	 * @param newFont
	 *          the new font
	 */
	public void setTextFont(Font newFont) {
		JSS_TEXT_FONT = newFont;
	}

	/**
	 * Set the color of the displayed text
	 * 
	 * @param newColor
	 *          the new color
	 */
	public void setTextColor(Color newColor) {
		JSS_TEXT_COLOR = newColor;
	}

	/**
	 * Return an array of text element that will be printed on the element
	 */
	@Override
	public ArrayList<TextLocation> getText(JRPropertiesMap mapProperties) {
		ArrayList<TextLocation> result = new ArrayList<TextLocation>();
		String endString = ""; //$NON-NLS-1$
		Object value = mapProperties.getProperty(PdfActionTable.JR_PROPERTY);
		if (value != null) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(value.toString())){
				endString += "PDF ON";
			} else{
				endString += "PDF OFF";
			}
		}
		result.add(new TextLocation(Location.TopLeft, endString));
		return result;
	}

	@Override
	public Color getColor() {
		return JSS_TEXT_COLOR;
	}

	@Override
	public Font getFont() {
		return JSS_TEXT_FONT;
	}

}
