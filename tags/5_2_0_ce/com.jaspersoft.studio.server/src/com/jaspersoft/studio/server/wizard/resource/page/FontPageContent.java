/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, 
 * the following license terms apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.server.wizard.resource.page;

import org.eclipse.core.databinding.DataBindingContext;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.server.messages.Messages;
import com.jaspersoft.studio.server.model.MResource;

public class FontPageContent extends AFileResourcePageContent {

	public FontPageContent(ANode parent, MResource resource, DataBindingContext bindingContext) {
		super(parent, resource, bindingContext);
	}

	public FontPageContent(ANode parent, MResource resource) {
		super(parent, resource);
	}

	@Override
	public String getPageName() {
		return "com.jaspersoft.studio.server.page.font";
	}

	@Override
	public String getName() {
		return Messages.RDFontPage_title;
	}

	@Override
	protected String[] getFilter() {
		return new String[] { "*.*", "*.ttf", "*.TTF" }; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
