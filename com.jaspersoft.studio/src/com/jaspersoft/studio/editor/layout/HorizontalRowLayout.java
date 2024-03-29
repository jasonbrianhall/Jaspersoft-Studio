/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.editor.layout;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.design.JRDesignElement;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.utils.ModelUtils;

public class HorizontalRowLayout extends AbstractLayout {
	
	public Map<JRElement, Rectangle> layout(JRElement[] elements, Dimension c) {
		Map<JRElement, Rectangle> map = new HashMap<JRElement, Rectangle>();
		int x = 0;
		int y = 0;
		int w = (int) Math.floor((float) c.width / elements.length);
		int rest = c.width - w * elements.length;
		int h = c.height;
		for (JRElement el : elements) {
			JRDesignElement del = (JRDesignElement) el;
			map.put(el, new Rectangle(el.getX(), el.getY(), el.getWidth(), el.getHeight()));
			del.setX(x);
			del.setY(y);
			del.setWidth(w + rest);
			del.setHeight(h);
			// if last grab free pixels
			x += w + rest;
			if (rest > 0)
				rest = 0;
			LayoutManager.layout(map, el);
		}
		return map;
	}

	@Override
	public String getName() {
		return Messages.HorizontalRowLayout_name;
	}

	@Override
	public String getToolTip() {
		return Messages.HorizontalRowLayout_toolTip;
	}

	@Override
	public String getIcon() {
		return "icons/layout-3.png"; //$NON-NLS-1$
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
		int w = (int) Math.floor((float) parentSize.width / elements.length);
		int rest = parentSize.width - w * elements.length;
		int h = parentSize.height;
		for (JRElement el : elements) {
			map.put(el, new Rectangle(x, y, w+rest, h));
			// if last grab free pixels
			x += w + rest;
			if (rest > 0)
				rest = 0;
		}
		return map;
	}
}
