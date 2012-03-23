/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2011 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.components.crosstab.model;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.crosstabs.JRCrosstabBucket;
import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabBucket;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.type.SortOrderEnum;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.components.crosstab.messages.Messages;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.classname.ClassTypePropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.expression.ExprUtil;
import com.jaspersoft.studio.property.descriptor.expression.JRExpressionPropertyDescriptor;
import com.jaspersoft.studio.utils.EnumHelper;

public class MBucket extends APropertyNode {

	/**
	 * Instantiates a new m field.
	 * 
	 * @param parent
	 *            the parent
	 * @param jfRield
	 *            the jf rield
	 * @param newIndex
	 *            the new index
	 */
	public MBucket(JRCrosstabBucket jfRield) {
		super();
		setValue(jfRield);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getDisplayText()
	 */
	public String getDisplayText() {
		return Messages.common_bucket;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getImagePath()
	 */
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getToolTip()
	 */
	@Override
	public String getToolTip() {
		return getIconDescriptor().getToolTip();
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
		ComboBoxPropertyDescriptor orderD = new ComboBoxPropertyDescriptor(
				JRDesignCrosstabBucket.PROPERTY_ORDER, Messages.common_order,
				EnumHelper.getEnumNames(SortOrderEnum.values(),
						NullEnum.NOTNULL));
		orderD.setDescription(Messages.MBucket_order_description);
		desc.add(orderD);

		JRExpressionPropertyDescriptor orderByExprD = new JRExpressionPropertyDescriptor(
				JRDesignCrosstabBucket.PROPERTY_ORDER_BY_EXPRESSION,
				Messages.MBucket_order_by_expression);
		orderByExprD
				.setDescription(Messages.MBucket_order_by_expression_description);
		desc.add(orderByExprD);

		JRExpressionPropertyDescriptor compExprD = new JRExpressionPropertyDescriptor(
				JRDesignCrosstabBucket.PROPERTY_COMPARATOR_EXPRESSION,
				Messages.MBucket_comparator_expression);
		compExprD
				.setDescription(Messages.MBucket_comparator_expression_description);
		desc.add(compExprD);

		JRExpressionPropertyDescriptor exprD = new JRExpressionPropertyDescriptor(
				JRDesignCrosstabBucket.PROPERTY_EXPRESSION,
				Messages.MBucket_expression);
		exprD.setDescription(Messages.MBucket_expression_description);
		desc.add(exprD);

		ClassTypePropertyDescriptor classD = new ClassTypePropertyDescriptor(
				JRDesignCrosstabBucket.PROPERTY_VALUE_CLASS, "Value Class Name");
		classD.setDescription("Bucket value class name");
		desc.add(classD);

		defaultsMap.put(JRDesignCrosstabBucket.PROPERTY_VALUE_CLASS, null);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java
	 * .lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		JRDesignCrosstabBucket jrField = (JRDesignCrosstabBucket) getValue();
		if (id.equals(JRDesignCrosstabBucket.PROPERTY_ORDER))
			return EnumHelper.getValue(jrField.getOrderValue(), 1, false);
		if (id.equals(JRDesignCrosstabBucket.PROPERTY_COMPARATOR_EXPRESSION))
			return ExprUtil.getExpression(jrField.getComparatorExpression());
		if (id.equals(JRDesignCrosstabBucket.PROPERTY_ORDER_BY_EXPRESSION))
			return ExprUtil.getExpression(jrField.getOrderByExpression());
		if (id.equals(JRDesignCrosstabBucket.PROPERTY_EXPRESSION))
			return ExprUtil.getExpression(jrField.getExpression());
		if (id.equals(JRDesignCrosstabBucket.PROPERTY_VALUE_CLASS))
			return jrField.getValueClassName();
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java
	 * .lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		JRDesignCrosstabBucket jrField = (JRDesignCrosstabBucket) getValue();

		if (id.equals(JRDesignCrosstabBucket.PROPERTY_ORDER))
			jrField.setOrder((SortOrderEnum) EnumHelper.getSetValue(
					SortOrderEnum.values(), value, 1, false));
		else if (id
				.equals(JRDesignCrosstabBucket.PROPERTY_COMPARATOR_EXPRESSION))
			jrField.setComparatorExpression(ExprUtil.setValues(
					jrField.getComparatorExpression(), value));
		else if (id.equals(JRDesignCrosstabBucket.PROPERTY_ORDER_BY_EXPRESSION))
			jrField.setOrderByExpression(ExprUtil.setValues(
					jrField.getOrderByExpression(), value));
		else if (id.equals(JRDesignCrosstabBucket.PROPERTY_EXPRESSION))
			jrField.setExpression((JRDesignExpression) ExprUtil.setValues(
					jrField.getExpression(), value));
		else if (id.equals(JRDesignCrosstabBucket.PROPERTY_VALUE_CLASS))
			jrField.setValueClassName((String) value);
	}
}
