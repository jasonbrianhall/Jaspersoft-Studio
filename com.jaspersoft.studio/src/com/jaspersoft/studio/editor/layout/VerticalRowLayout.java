/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.editor.layout;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.design.JRDesignBreak;
import net.sf.jasperreports.engine.design.JRDesignElement;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.utils.ModelUtils;

public class VerticalRowLayout extends AbstractLayout {
	
	public Map<JRElement, Rectangle> layout(JRElement[] elements, Dimension c) {
		Map<JRElement, Rectangle> map = new HashMap<JRElement, Rectangle>();
		int x = 0;
		int y = 0;
		int w = c.width;
		
		//The breaks can't grow in height so cosider this when layouting
		int breakNumbers = 0;
		for (JRElement el : elements) {
			if (el instanceof JRDesignBreak){
				breakNumbers++;
			}
		}
		int h = ((int) Math.floor((float) c.height / (elements.length - breakNumbers))) - breakNumbers;
		int rest = c.height - h * (elements.length - breakNumbers) - breakNumbers;
		
		for (JRElement el : elements) {
			JRDesignElement del = (JRDesignElement) el;
			map.put(el, new Rectangle(el.getX(), el.getY(), el.getWidth(), el.getHeight()));
			if (del instanceof JRDesignBreak){
				del.setX(x);
				del.setY(y);
				del.setWidth(w);
				y++;
			} else {
				del.setX(x);
				del.setY(y);
				del.setWidth(w);
				del.setHeight(h + rest);
				// if last grab free pixels
				y += h + rest;
				if (rest > 0)
					rest = 0;
				LayoutManager.layout(map, el);
			}
		}
		return map;
	}

	@Override
	public String getName() {
		return Messages.VerticalRowLayout_name;
	}

	@Override
	public String getToolTip() {
		return Messages.VerticalRowLayout_tooltip;
	}

	@Override
	public String getIcon() {
		return "icons/layout-h.png"; //$NON-NLS-1$
	}
	
	@Override
	public boolean allowChildBoundChange(ANode resizedNode, Rectangle oldBounds, Rectangle newBounds) {
		return ModelUtils.safeEquals(oldBounds, newBounds);
	}

	@Override
	public Map<JRElement, Rectangle> getLayoutPosition(JRElement[] elements, Dimension parentSize) {
		Map<JRElement, Rectangle> map = new HashMap<JRElement, Rectangle>();
		int x = 0;
		int y = 0;
		int w = parentSize.width;
		int h = (int) Math.floor((float) parentSize.height / elements.length);
		int rest = parentSize.height - h * elements.length;
		for (JRElement el : elements) {
			map.put(el, new Rectangle(x, y, w, h + rest));
			// if last grab free pixels
			y += h + rest;
			if (rest > 0)
				rest = 0;
		}
		return map;
	}
}
