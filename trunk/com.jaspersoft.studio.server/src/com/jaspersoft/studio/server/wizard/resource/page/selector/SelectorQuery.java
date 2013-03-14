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
package com.jaspersoft.studio.server.wizard.resource.page.selector;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.server.model.MRQuery;
import com.jaspersoft.studio.server.model.MResource;

public class SelectorQuery extends ASelector {

	@Override
	protected ResourceDescriptor createLocal(MResource res) {
		return MRQuery.createDescriptor(res);
	}

	@Override
	protected boolean isResCompatible(MResource r) {
		return r instanceof MRQuery;
	}

	private static ResourceDescriptor getQuery(ResourceDescriptor ru) {
		for (Object obj : ru.getChildren()) {
			ResourceDescriptor r = (ResourceDescriptor) obj;
			String t = r.getWsType();
			if (t.equals(ResourceDescriptor.TYPE_QUERY)
					|| t.equals(ResourceDescriptor.TYPE_REFERENCE))
				return r;
		}
		return null;
	}

	@Override
	protected ResourceDescriptor getResourceDescriptor(ResourceDescriptor ru) {
		return getQuery(ru);
	}

}
