package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class TreeArrayContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return (Object[]) inputElement;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return false;
	}
	
}
