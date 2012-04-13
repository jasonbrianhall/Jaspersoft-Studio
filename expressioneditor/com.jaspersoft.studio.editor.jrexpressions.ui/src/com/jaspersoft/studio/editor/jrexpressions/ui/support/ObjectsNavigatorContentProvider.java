package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class ObjectsNavigatorContentProvider implements ITreeContentProvider {

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	}
	
	@Override
	public void dispose() {
		
	}
	
	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length>0;
	}
	
	@Override
	public Object getParent(Object element) {
		return null;
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		// The passed element will be NameIconItem representing the objects root categories
		// Usually these are the root categories (most of the times a subset of them)
		// 	- Parameters
		//	- Field
		//	- Variables
		//  - CrossTabs
		// 	- Built-in functions
		// 	- User Defined Expressions
		// 	- Recent Expressions
		if(inputElement !=null && 
				inputElement instanceof ObjectCategoryItem[]){
			return (Object[]) inputElement;
		}
		return new Object[0];			
	}
	
	@Override
	public Object[] getChildren(Object parentElement) {
		
		if(parentElement instanceof ObjectCategoryItem){
			Object data= ((ObjectCategoryItem) parentElement).getData();
			if(data != null && data instanceof ObjectCategoryItem[]){
					return (ObjectCategoryItem[]) data;
			}
		}
		
		return new Object[0];
	}

}
