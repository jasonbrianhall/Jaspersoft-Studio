/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * Licensed under commercial Jaspersoft Subscription License Agreement
 ******************************************************************************/
package com.jaspersoft.studio.components.customvisualization.properties;

import java.util.List;

import net.sf.jasperreports.components.items.Item;
import net.sf.jasperreports.components.items.ItemData;
import net.sf.jasperreports.components.items.ItemProperty;
import net.sf.jasperreports.components.items.StandardItem;
import net.sf.jasperreports.components.items.StandardItemData;
import net.sf.jasperreports.components.items.StandardItemProperty;
import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.jasperreports.customvisualization.design.CVDesignComponent;
import com.jaspersoft.studio.components.customvisualization.ui.ComponentDatasetDescriptor;
import com.jaspersoft.studio.components.customvisualization.ui.ComponentDescriptor;
import com.jaspersoft.studio.components.customvisualization.ui.ComponentPropertyDescriptor;
import com.jaspersoft.studio.components.customvisualization.ui.ComponentSectionDescriptor;
import com.jaspersoft.studio.components.customvisualization.ui.UIManager;
import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.util.ItemPropertyUtil;
import com.jaspersoft.studio.property.itemproperty.desc.ADescriptor;
import com.jaspersoft.studio.property.itemproperty.desc.AItemDataListPropertyDescriptor;
import com.jaspersoft.studio.property.itemproperty.dialog.AItemDialog;
import com.jaspersoft.studio.property.itemproperty.dialog.AItemPropertiesUtil;
import com.jaspersoft.studio.property.itemproperty.dialog.FormItemDialog;
import com.jaspersoft.studio.property.itemproperty.dialog.TableItemDialog;
import com.jaspersoft.studio.property.section.AbstractSection;
import com.jaspersoft.studio.utils.ExpressionInterpreter;
import com.jaspersoft.studio.utils.ExpressionUtil;
import com.jaspersoft.studio.utils.Misc;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public abstract class ItemPropertiesUtil extends AItemPropertiesUtil {

	public ItemPropertiesUtil(AItemDataListPropertyDescriptor pDescriptor,
			AbstractSection section) {
		super(pDescriptor, section);
	}

	protected List<ItemData> itemDatas;
	private ComponentDescriptor cd;

	public void setItemDatas(List<ItemData> itemDatas) {
		this.itemDatas = itemDatas;
	}

	@Override
	public void setPnode(APropertyNode pnode) {
		super.setPnode(pnode);
		cd = null;
	}

	public ComponentDescriptor getComponentDescriptor() {
		if (pnode == null)
			return null;
		// let's look if we have some files with our properties
		@SuppressWarnings("unchecked")
		List<ItemProperty> p = (List<ItemProperty>) pnode
				.getPropertyValue(CVDesignComponent.PROPERTY_ITEM_PROPERTIES);
		if (Misc.isNullOrEmpty(p)) {
			cd = null;
			return null;
		}
		// let's get our description
		JasperDesign jd = pnode.getJasperDesign();
		JasperReportsConfiguration jConf = pnode.getJasperConfiguration();
		JRDesignDataset dataset = null;
		if (dataset == null)
			dataset = ModelUtils.getDataset(pnode);
		if (dataset == null)
			dataset = (JRDesignDataset) jd.getMainDataset();

		ExpressionInterpreter expIntr = ExpressionUtil.getCachedInterpreter(
				dataset, jd, jConf);
		for (ItemProperty ip : p)
			if (ip.getName().equals("module")) {
				String module = ItemPropertyUtil.getItemPropertyString(
						(StandardItemProperty) ip, expIntr);
				if (Misc.isNullOrEmpty(module))
					break;
				cd = UIManager.getDescriptor(jConf, module);
				return cd;
			}
		return null;
	}

	public void showItemDialog(List<ItemData> citemsData,
			StandardItemData itemData, StandardItem item,
			ExpressionContext expContext) {
		getDescriptor().setItemDatas(citemsData, pnode);
		getDescriptor().setItemData(itemData);
		AItemDialog dialog = createItemDialog();
		dialog.setValues(citemsData, itemData, item);
		dialog.setExpressionContext(expContext);
		if (dialog.open() == Dialog.OK) {
			section.changeProperty(pDescriptor.getId(), citemsData);
			setElementSelection(dialog.getItemData(), item);
			getDescriptor().setItem(null);
		}
	}

	protected abstract void setElementSelection(final ItemData itemData,
			final Item item);

	@Override
	protected AItemDialog createItemDialog() {
		if (cd != null && !Misc.isNullOrEmpty(cd.getDatasets())) {
			JasperReportsConfiguration jConf = pnode.getJasperConfiguration();
			int indx = getSelectedItemDataIndex();
			int c = 0;
			for (ComponentDatasetDescriptor cdd : cd.getDatasets()) {
				int card = cdd.getCardinality();
				if (card > 0)
					c += card;
				else if (card <= 0)
					return createForm(jConf, cdd);
				if (c >= indx)
					return createForm(jConf, cdd);
			}
		}
		return new TableItemDialog(UIUtils.getShell(), getDescriptor(),
				(JasperReportsConfiguration) section.getJasperReportsContext(),
				false) {
			@Override
			protected void createDataItemSelector(Composite cmp) {

			}
		};
	}

	private AItemDialog createForm(JasperReportsConfiguration jConf,
			final ComponentDatasetDescriptor cdd) {
		return new FormItemDialog(UIUtils.getShell(), getDescriptor(), jConf,
				false) {
			@Override
			protected void createDataItemSelector(Composite cmp) {

			}

			@Override
			protected void createValue(Composite parent) {
				Composite cmp = createScrolledComposite(parent);
				GridData gd = new GridData(GridData.FILL_BOTH);
				gd.widthHint = 400;
				sc.setLayoutData(gd);

				createProperties(cdd, cmp);
			}

			protected void createProperties(
					final ComponentDatasetDescriptor cdd, Composite cmp) {
				boolean first = true;
				for (ComponentSectionDescriptor s : cdd.getSections()) {
					Composite c = null;
					if (s.isExpandable())
						c = createSection(cmp, s.getName());
					else if (!Misc.isNullOrEmpty(s.getName()))
						c = createGroup(cmp, s.getName());
					else {
						c = cmp;
						if (!first)
							createSeparator(cmp);
					}
					for (ComponentPropertyDescriptor pd : s.getProperties())
						createItemProperty(c, pd.getName());
					first = false;
				}
				configScrolledComposite(cmp);
			}

			@Override
			protected void createValue(CTabFolder tabFolder) {
				CTabItem bptab = new CTabItem(tabFolder, SWT.NONE);
				bptab.setText(com.jaspersoft.studio.messages.Messages.ItemDialog_0);

				Composite cmp = createScrolledComposite(tabFolder, bptab);

				createProperties(cdd, cmp);
			}

			@Override
			protected void setupItemDataCombo() {
				String[] items = new String[itemDatas.size()];
				for (int i = 0; i < items.length; i++) {
					String f = "";
					int indx = itemDatas.indexOf(itemDatas.get(i));
					int c = 0;
					for (ComponentDatasetDescriptor cdd : cd.getDatasets()) {
						int card = cdd.getCardinality();
						if (card > 0)
							c += card;
						else if (card <= 0) {
							f = cdd.getLabel();
							break;
						}
						if (c > indx) {
							f = cdd.getLabel();
							break;
						}
					}
					items[i] = f;
				}
				if (dsviewer != null) {
					dsviewer.setItems(items);
					dsviewer.select(itemDatas.indexOf(itemData));
				}
			}

		};
	}

	private ADescriptor getDescriptor() {
		return pDescriptor.getDescriptor();
	}

	public int getSelectedItemDataIndex() {
		return -1;
	}

}
