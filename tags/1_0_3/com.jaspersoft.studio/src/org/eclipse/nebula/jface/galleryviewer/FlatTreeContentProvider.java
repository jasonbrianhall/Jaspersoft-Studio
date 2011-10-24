/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) 2007-2008 Peter Centgraf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors :
 *    Peter Centgraf - initial implementation
 *******************************************************************************/
package org.eclipse.nebula.jface.galleryviewer;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
/*
 * Adaptor that converts an {@link IStructuredContentProvider} into an
 * {@link ITreeContentProvider} that places the nested contents inside a single
 * root node.
 * 
 * @author Peter Centgraf
 * @since Dec 6, 2007
 */
public class FlatTreeContentProvider implements ITreeContentProvider {

	protected final Object rootNode;
	protected final IStructuredContentProvider provider;
	protected final Object[] roots;

	/**
	 * Adapts an {@link IStructuredContentProvider} into an
	 * {@link ITreeContentProvider} that places the nested contents inside a
	 * single root node.
	 * 
	 * @param provider
	 *            the {@link IStructuredContentProvider} to adapt
	 */
	public FlatTreeContentProvider(IStructuredContentProvider provider) {
		this(provider, "");
	}

	/**
	 * Adapts an {@link IStructuredContentProvider} into an
	 * {@link ITreeContentProvider} that places the nested contents inside the
	 * given root node.
	 * 
	 * @param provider
	 *            the {@link IStructuredContentProvider} to adapt
	 * @param the
	 *            single root node for the tree
	 */
	public FlatTreeContentProvider(IStructuredContentProvider provider, Object rootNode) {
		this.provider = provider;
		this.rootNode = rootNode;

		roots = new Object[] { rootNode };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		if (element == rootNode) {
			return null;
		} else {
			return rootNode;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
		return element == rootNode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		return roots;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object parentElement) {
		return provider.getElements(parentElement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		provider.dispose();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		provider.inputChanged(viewer, oldInput, newInput);
	}

}
