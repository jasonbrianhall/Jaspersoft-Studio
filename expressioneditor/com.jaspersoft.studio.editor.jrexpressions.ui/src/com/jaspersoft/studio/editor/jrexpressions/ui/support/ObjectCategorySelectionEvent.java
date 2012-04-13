package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.widgets.Widget;

import com.jaspersoft.studio.editor.jrexpressions.ui.support.ObjectCategoryItem.Category;

/**
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class ObjectCategorySelectionEvent extends TypedEvent {

	private static final long serialVersionUID = -4147730325947077155L;
	public Category selectedCategory;

	public ObjectCategorySelectionEvent(Widget widget){
		super(widget);
	}

}
