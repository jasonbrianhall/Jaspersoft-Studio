/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.components.customvisualization.model;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.components.items.Item;
import net.sf.jasperreports.components.items.ItemData;
import net.sf.jasperreports.components.items.ItemProperty;
import net.sf.jasperreports.components.items.StandardItemProperty;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.swt.graphics.Image;

import com.jaspersoft.jasperreports.customvisualization.design.CVDesignComponent;
import com.jaspersoft.studio.components.customvisualization.CustomVisualizationActivator;
import com.jaspersoft.studio.components.customvisualization.ui.ComponentDatasetDescriptor;
import com.jaspersoft.studio.components.customvisualization.ui.ComponentDescriptor;
import com.jaspersoft.studio.components.customvisualization.ui.ComponentPropertyDescriptor;
import com.jaspersoft.studio.components.customvisualization.ui.ComponentSectionDescriptor;
import com.jaspersoft.studio.components.customvisualization.ui.UIManager;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.util.ItemPropertyUtil;
import com.jaspersoft.studio.property.itemproperty.desc.ADescriptor;
import com.jaspersoft.studio.property.itemproperty.desc.ItemPropertyDescription;
import com.jaspersoft.studio.utils.ExpressionInterpreter;
import com.jaspersoft.studio.utils.ExpressionUtil;
import com.jaspersoft.studio.utils.Misc;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

/**
 * @author Veaceslav Chicu (schicu@users.sourceforge.net)
 * 
 */
public class CVCItemDescriptor extends ADescriptor {

	public CVCItemDescriptor() {
		super();
		showAllProperties = true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.property.itemproperty.desc.ADescriptor#
	 * getDisplayName ()
	 */
	@Override
	public String getDisplayName() {
		return "Properties";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.jaspersoft.studio.property.itemproperty.desc.ADescriptor#getIcon(
	 * java.lang.Object)
	 */
	@Override
	public Image getIcon(Object element) {
		if (element instanceof Item)
			return CustomVisualizationActivator.getDefault().getImage("icons/path-icon-16.png"); //$NON-NLS-1$
		return super.getIcon(element);
	}

	@Override
	public void setItemDatas(List<ItemData> itemDatas, APropertyNode pnode) {
		this.itemDatas = itemDatas;
		if (this.pnode != pnode) {
			this.pnode = pnode;
			initItemPropertyDescriptors();
		} else
			this.pnode = pnode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.tibcomaps.property.desc.AItemDescriptor#
	 * initItemPropertyDescriptors()
	 */
	@Override
	protected void initItemPropertyDescriptors() {
		if (pnode != null) {
			// let's look if we have some files with our properties
			List<ItemProperty> p = (List<ItemProperty>) pnode
					.getPropertyValue(CVDesignComponent.PROPERTY_ITEM_PROPERTIES);
			if (!Misc.isNullOrEmpty(p)) {
				// let's get our description
				// let's get our description
				JasperDesign jd = pnode.getJasperDesign();
				JasperReportsConfiguration jConf = pnode.getJasperConfiguration();
				JRDesignDataset dataset = null;
				if (dataset == null)
					dataset = ModelUtils.getDataset(pnode);
				if (dataset == null)
					dataset = (JRDesignDataset) jd.getMainDataset();

				ExpressionInterpreter expIntr = ExpressionUtil.getCachedInterpreter(dataset, jd, jConf);
				List<ItemPropertyDescription<?>> props = new ArrayList<ItemPropertyDescription<?>>();
				for (ItemProperty ip : p)
					if (ip.getName().equals("module")) {
						String module = ItemPropertyUtil.getItemPropertyString((StandardItemProperty) ip, expIntr);
						if (!Misc.isNullOrEmpty(module)) {
							ComponentDescriptor cd = UIManager.getDescriptor(jConf, module);
							if (cd != null && !Misc.isNullOrEmpty(cd.getDatasets())) {
								for (ComponentDatasetDescriptor cdd : cd.getDatasets()) {
									if (cdd.getSections() != null)
										for (ComponentSectionDescriptor csd : cdd.getSections())
											if (csd.getProperties() != null)
												for (ComponentPropertyDescriptor cpd : csd.getProperties())
													props.add(UIManager.createItemPropertyDescriptor(cd, cpd, jConf));

								}
								itemProperties = props.toArray(new ItemPropertyDescription[props.size()]);
								return;
							}
						}
					}
			}

		}
		itemProperties = new ItemPropertyDescription[] {};
	}
}
