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
package com.jaspersoft.studio.components.table.model;

import java.beans.PropertyChangeEvent;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.components.table.DesignCell;
import net.sf.jasperreports.components.table.StandardTable;
import net.sf.jasperreports.components.table.WhenNoDataTypeTableEnum;
import net.sf.jasperreports.engine.JRConstants;
import net.sf.jasperreports.engine.JRDatasetRun;
import net.sf.jasperreports.engine.JRElementGroup;
import net.sf.jasperreports.engine.JRPropertiesHolder;
import net.sf.jasperreports.engine.component.ComponentKey;
import net.sf.jasperreports.engine.design.JRDesignComponentElement;
import net.sf.jasperreports.engine.design.JRDesignDatasetRun;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.design.events.CollectionElementAddedEvent;
import net.sf.jasperreports.engine.design.events.CollectionElementRemovedEvent;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.components.table.TableManager;
import com.jaspersoft.studio.components.table.TableNodeIconDescriptor;
import com.jaspersoft.studio.components.table.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.IContainer;
import com.jaspersoft.studio.model.IContainerEditPart;
import com.jaspersoft.studio.model.IContainerLayout;
import com.jaspersoft.studio.model.IDatasetContainer;
import com.jaspersoft.studio.model.IGroupElement;
import com.jaspersoft.studio.model.MGraphicElement;
import com.jaspersoft.studio.model.MPage;
import com.jaspersoft.studio.model.dataset.MDatasetRun;
import com.jaspersoft.studio.model.dataset.descriptor.DatasetRunPropertyDescriptor;
import com.jaspersoft.studio.model.util.IIconDescriptor;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptors.JSSEnumPropertyDescriptor;

public class MTable extends MGraphicElement implements IContainer,
		IContainerEditPart, IGroupElement, IContainerLayout, IDatasetContainer {
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;
	/** The icon descriptor. */
	private static IIconDescriptor iconDescriptor;

	/**
	 * Gets the icon descriptor.
	 * 
	 * @return the icon descriptor
	 */
	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new TableNodeIconDescriptor("table"); //$NON-NLS-1$
		return iconDescriptor;
	}

	/**
	 * Instantiates a new m chart.
	 */
	public MTable() {
		super();
	}

	public MTable(ANode parent, int newIndex, TableManager ctManager) {
		super(parent, newIndex);
		this.ctManager = ctManager;
	}

	private TableManager ctManager;

	public TableManager getTableManager() {
		return ctManager;
	}

	/**
	 * 
	 * @param parent
	 *            the parent
	 * @param jrTable
	 *            the jr chart
	 * @param newIndex
	 *            the new index
	 */
	public MTable(ANode parent, JRDesignComponentElement jrTable, int newIndex,
			TableManager ctManager) {
		super(parent, newIndex);
		setValue(jrTable);
		this.ctManager = ctManager;
	}

	private static IPropertyDescriptor[] descriptors;
	private static Map<String, Object> defaultsMap;

	@Override
	public Map<String, Object> getDefaultsMap() {
		return defaultsMap;
	}

	@Override
	public IPropertyDescriptor[] getDescriptors() {
		return descriptors;
	}

	@Override
	public void setDescriptors(IPropertyDescriptor[] descriptors1,
			Map<String, Object> defaultsMap1) {
		descriptors = descriptors1;
		defaultsMap = defaultsMap1;
	}

	/**
	 * Creates the property descriptors.
	 * 
	 * @param desc
	 *            the desc
	 */
	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc,
			Map<String, Object> defaultsMap) {
		super.createPropertyDescriptors(desc, defaultsMap);

		DatasetRunPropertyDescriptor datasetRunD = new DatasetRunPropertyDescriptor(
				StandardTable.PROPERTY_DATASET_RUN,
				Messages.MTable_dataset_run, false);
		datasetRunD.setDescription(Messages.MTable_dataset_run_description);
		datasetRunD.setCategory(Messages.MTable_table_properties_category);
		desc.add(datasetRunD);

		whennodataD = new JSSEnumPropertyDescriptor(
				StandardTable.PROPERTY_WHEN_NO_DATA_TYPE,
				Messages.MTable_whennodatalabel, WhenNoDataTypeTableEnum.class,
				NullEnum.NULL);
		whennodataD.setDescription(Messages.MTable_whennodatadescription);
		desc.add(whennodataD);
		whennodataD.setCategory(Messages.MTable_table_properties_category);

		defaultsMap.put(StandardTable.PROPERTY_WHEN_NO_DATA_TYPE,
				whennodataD.getEnumValue(WhenNoDataTypeTableEnum.BLANK));

		setHelpPrefix(desc,
				"net.sf.jasperreports.doc/docs/components.schema.reference.html#table");
	}

	private MDatasetRun mDatasetRun;
	private static JSSEnumPropertyDescriptor whennodataD;

	@Override
	public void setGroupItems(String[] items) {
		super.setGroupItems(items);
		// if (mCrosstabDataset != null)
		// mCrosstabDataset.setGroupItems(items);
	}

	@Override
	public Object getPropertyValue(Object id) {
		StandardTable jrTable = getStandardTable();

		if (id.equals(StandardTable.PROPERTY_DATASET_RUN)) {
			JRDatasetRun j = jrTable.getDatasetRun();
			if (j == null)
				j = new JRDesignDatasetRun();
			if (mDatasetRun != null)
				mDatasetRun.setValue(j);
			else {
				mDatasetRun = new MDatasetRun(j, getJasperDesign());
				setChildListener(mDatasetRun);
			}
			return mDatasetRun;
		}
		if (id.equals(StandardTable.PROPERTY_WHEN_NO_DATA_TYPE))
			return whennodataD.getEnumValue(jrTable.getWhenNoDataType());

		return super.getPropertyValue(id);
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		StandardTable jrTable = getStandardTable();

		if (id.equals(StandardTable.PROPERTY_WHEN_NO_DATA_TYPE))
			jrTable.setWhenNoDataType((WhenNoDataTypeTableEnum) whennodataD
					.getEnumValue(value));
		else if (id.equals(StandardTable.PROPERTY_DATASET_RUN)) {
			MDatasetRun mdr = (MDatasetRun) value;
			JRDesignDatasetRun dr = (JRDesignDatasetRun) mdr.getValue();
			if (dr.getDatasetName() != null)
				jrTable.setDatasetRun(dr);
			else
				jrTable.setDatasetRun(null);
		}
		super.setPropertyValue(id, value);
	}

	public StandardTable getStandardTable() {
		JRDesignComponentElement jrElement = (JRDesignComponentElement) getValue();
		StandardTable jrTable = (StandardTable) jrElement.getComponent();
		return jrTable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getDefaultHeight()
	 */
	@Override
	public int getDefaultHeight() {
		return 200;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getDefaultWidth()
	 */
	@Override
	public int getDefaultWidth() {
		return 200;
	}

	@Override
	public JRDesignElement createJRElement(JasperDesign jasperDesign) {
		JRDesignComponentElement jrElement = new JRDesignComponentElement();
		StandardTable component = new StandardTable();

		// jrElement.setKey((String) wizardDescriptor.getProperty("basename"));
		((JRDesignComponentElement) jrElement).setComponent(component);
		((JRDesignComponentElement) jrElement)
				.setComponentKey(new ComponentKey(
						"http://jasperreports.sourceforge.net/jasperreports/components", "jr", "table")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		// JRDesignDataset newDataset = new JRDesignDataset(false);
		//		String name = "Table Dataset "; //$NON-NLS-1$
		// for (int i = 1;; i++) {
		// if (!jasperDesign.getDatasetMap().containsKey(name + i)) {
		// newDataset.setName(name + i);
		// break;
		// }
		// }
		//
		JRDesignDatasetRun datasetRun = new JRDesignDatasetRun();
		//
		// datasetRun.setDatasetName(newDataset.getName());
		// JRDesignExpression exp = new JRDesignExpression();
		//		exp.setValueClassName("net.sf.jasperreports.engine.JRDataSource");// NOI18N //$NON-NLS-1$
		//		exp.setText("new net.sf.jasperreports.engine.JREmptyDataSource(1)");// NOI18N //$NON-NLS-1$
		//
		// datasetRun.setDataSourceExpression(exp);
		component.setDatasetRun(datasetRun);
		return jrElement;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getDisplayText()
	 */
	@Override
	public String getDisplayText() {
		return getIconDescriptor().getTitle();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getImagePath()
	 */
	@Override
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getToolTip()
	 */
	@Override
	public String getToolTip() {
		return getIconDescriptor().getToolTip();
	}

	public JRElementGroup getJRElementGroup() {
		return null;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (getParent() instanceof MPage
				&& evt instanceof CollectionElementAddedEvent
				|| evt instanceof CollectionElementRemovedEvent
				|| evt.getOldValue() instanceof DesignCell
				|| evt.getNewValue() instanceof DesignCell)
			getTableManager().update();
		else if (getTableManager() != null)
			getTableManager().update();
		super.propertyChange(evt);
	}

	@Override
	public JRPropertiesHolder[] getPropertyHolder() {
		return new JRPropertiesHolder[] { getValue() };
	}

	@Override
	public MDatasetRun getDatasetRun() {
		return (MDatasetRun)getPropertyValue(StandardTable.PROPERTY_DATASET_RUN);
	}
	
}
