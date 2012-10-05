/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of JasperReports.
 * 
 * JasperReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * JasperReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with JasperReports. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.server.wizard.resource;

import org.eclipse.jface.wizard.Wizard;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.server.ResourceFactory;
import com.jaspersoft.studio.server.messages.Messages;
import com.jaspersoft.studio.server.model.MResource;

public class ResourceWizard extends Wizard {

	public ResourceWizard(ANode parent, MResource resource) {
		super();
		setWindowTitle(Messages.ResourceWizard_windowtitle);
		this.resource = resource;
		this.parent = parent;
	}

	private ResourceFactory rfactory = new ResourceFactory();

	@Override
	public void addPages() {
		addPage(rfactory.getResourcePage(parent, resource));
	}

	private ANode parent;

	private MResource resource;

	@Override
	public boolean performFinish() {
		return true;
	}

}