package com.jaspersoft.studio.editor.jrexpressions.ui.support;

/**
 * Classes which implement this interface provide a method
 * that deals with the events that are generated when an
 * {@link ObjectCategoryItem} is selected.
 * 
 * <p>
 * Example: classic scenario is the selection of an object
 * category item inside a tree. 
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 * @see DefaultExpressionEditorComposite Listener usage example
 *
 */
public interface ObjectCategorySelectionListener {
	
	/**
	 * Sent when a category item is selected.
	 * 
	 * @param event the event containing the information about the category selection
	 */
	void select(ObjectCategorySelectionEvent event);
}
