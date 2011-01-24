/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of iReport.
 * 
 * iReport is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * iReport is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with iReport. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.chart.model.plot;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.charts.JRBarPlot;
import net.sf.jasperreports.charts.design.JRDesignBarPlot;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.chart.messages.Messages;
import com.jaspersoft.studio.chart.model.MChartItemLabel;
import com.jaspersoft.studio.chart.property.descriptor.PlotPropertyDescriptor;
import com.jaspersoft.studio.model.MExpression;
import com.jaspersoft.studio.model.text.MFont;
import com.jaspersoft.studio.property.descriptor.DoublePropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.checkbox.CheckBoxPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.color.ColorPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.expression.ExprUtil;
import com.jaspersoft.studio.property.descriptor.expression.JRExpressionPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.text.FontPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.text.NTextPropertyDescriptor;
import com.jaspersoft.studio.utils.Colors;

public class MBarPlot extends MChartPlot {
	public MBarPlot(JRBarPlot value) {
		super(value);
	}

	private static IPropertyDescriptor[] descriptors;
	private static Map<String, Object> defaultsMap;

	@Override
	public Map<String, Object> getDefaultsMap() {
		return defaultsMap;
	}

	public String getDisplayText() {
		return Messages.MBarPlot_bar_plot;
	}

	@Override
	public IPropertyDescriptor[] getDescriptors() {
		return descriptors;
	}

	@Override
	public void setDescriptors(IPropertyDescriptor[] descriptors1, Map<String, Object> defaultsMap1) {
		descriptors = descriptors1;
		defaultsMap = defaultsMap1;
	}

	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc, Map<String, Object> defaultsMap) {
		super.createPropertyDescriptors(desc, defaultsMap);

		ColorPropertyDescriptor catAxisLabelColorD = new ColorPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LABEL_COLOR, Messages.common_category_axis_label_color, NullEnum.NULL);
		catAxisLabelColorD.setDescription(Messages.MBarPlot_category_axis_label_color_description);
		desc.add(catAxisLabelColorD);

		JRExpressionPropertyDescriptor catAxisLabelExprD = new JRExpressionPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LABEL_EXPRESSION, Messages.common_category_axis_label_expression);
		catAxisLabelExprD.setDescription(Messages.MBarPlot_category_axis_label_expression_description);
		desc.add(catAxisLabelExprD);

		FontPropertyDescriptor catAxisLabelFontD = new FontPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LABEL_FONT, Messages.common_category_axis_label_font);
		catAxisLabelFontD.setDescription(Messages.MBarPlot_category_axis_label_font_description);
		desc.add(catAxisLabelFontD);

		ColorPropertyDescriptor catAxisTickLabelColorD = new ColorPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_COLOR, Messages.common_category_axis_tick_label_color,
				NullEnum.NULL);
		catAxisTickLabelColorD.setDescription(Messages.MBarPlot_category_axis_tick_label_color_description);
		desc.add(catAxisTickLabelColorD);

		FontPropertyDescriptor catAxisTickLabelFontD = new FontPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_FONT, Messages.common_category_axis_tick_label_font);
		catAxisTickLabelFontD.setDescription(Messages.MBarPlot_category_axis_tick_label_font_description);
		desc.add(catAxisTickLabelFontD);

		ColorPropertyDescriptor catAxisLineColorD = new ColorPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LINE_COLOR, Messages.common_category_axis_line_color, NullEnum.NULL);
		catAxisLineColorD.setDescription(Messages.MBarPlot_category_axis_line_color_description);
		desc.add(catAxisLineColorD);

		ColorPropertyDescriptor valAxisLabelColorD = new ColorPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_VALUE_AXIS_LABEL_COLOR, Messages.common_value_axis_label_color, NullEnum.NULL);
		valAxisLabelColorD.setDescription(Messages.MBarPlot_value_axis_label_color_description);
		desc.add(valAxisLabelColorD);

		JRExpressionPropertyDescriptor valAxisLabelExprD = new JRExpressionPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_VALUE_AXIS_LABEL_EXPRESSION, Messages.common_category_value_axis_label_expression);
		valAxisLabelExprD.setDescription(Messages.MBarPlot_category_value_axis_label_expression_description);
		desc.add(valAxisLabelExprD);

		FontPropertyDescriptor valAxisLabelFontD = new FontPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_VALUE_AXIS_LABEL_FONT, Messages.common_value_axis_label_font);
		valAxisLabelFontD.setDescription(Messages.MBarPlot_value_axis_label_font_description);
		desc.add(valAxisLabelFontD);

		ColorPropertyDescriptor valAxisTickLabelColorD = new ColorPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_COLOR, Messages.common_value_axis_tick_label_color,
				NullEnum.NULL);
		valAxisTickLabelColorD.setDescription(Messages.MBarPlot_value_axis_tick_label_color_description);
		desc.add(valAxisTickLabelColorD);

		FontPropertyDescriptor valAxisTickLabelFontD = new FontPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_FONT, Messages.common_value_axis_tick_label_font);
		valAxisTickLabelFontD.setDescription(Messages.MBarPlot_value_axis_tick_label_font_description);
		desc.add(valAxisTickLabelFontD);

		PlotPropertyDescriptor itemLabelD = new PlotPropertyDescriptor(JRDesignBarPlot.PROPERTY_ITEM_LABEL,
				Messages.common_item_label);
		itemLabelD.setDescription(Messages.MBarPlot_item_label_description);
		desc.add(itemLabelD);

		ColorPropertyDescriptor valAxisLineColorD = new ColorPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_VALUE_AXIS_LINE_COLOR, Messages.common_value_axis_line_color, NullEnum.NULL);
		valAxisLineColorD.setDescription(Messages.MBarPlot_value_axis_line_color_description);
		desc.add(valAxisLineColorD);

		JRExpressionPropertyDescriptor rangeAxisMinExprD = new JRExpressionPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_RANGE_AXIS_MINVALUE_EXPRESSION, Messages.common_range_axis_minvalue_expression);
		rangeAxisMinExprD.setDescription(Messages.MBarPlot_range_axis_minvalue_expression_description);
		desc.add(rangeAxisMinExprD);

		JRExpressionPropertyDescriptor rangeAxisMaxExprD = new JRExpressionPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_RANGE_AXIS_MAXVALUE_EXPRESSION, Messages.common_range_axis_maxvalue_expression);
		rangeAxisMaxExprD.setDescription(Messages.MBarPlot_range_axis_maxvalue_expression_description);
		desc.add(rangeAxisMaxExprD);

		JRExpressionPropertyDescriptor domainAxisMinExprD = new JRExpressionPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_DOMAIN_AXIS_MAXVALUE_EXPRESSION, Messages.common_domain_axis_minvalue_expression);
		domainAxisMinExprD.setDescription(Messages.MBarPlot_domain_axis_minvalue_expression_description);
		desc.add(domainAxisMinExprD);

		JRExpressionPropertyDescriptor domainAxisMaxExprD = new JRExpressionPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_DOMAIN_AXIS_MINVALUE_EXPRESSION, Messages.common_domain_axis_maxvalue_expression);
		domainAxisMaxExprD.setDescription(Messages.MBarPlot_domain_axis_maxvalue_expression_description);
		desc.add(domainAxisMaxExprD);

		CheckBoxPropertyDescriptor catAxisVertTickLabelD = new CheckBoxPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_VERTICAL_TICK_LABELS,
				Messages.common_category_axis_vertical_tick_labels, NullEnum.NOTNULL);
		catAxisVertTickLabelD.setDescription(Messages.MBarPlot_category_axis_vertical_tick_labels_description);
		desc.add(catAxisVertTickLabelD);

		CheckBoxPropertyDescriptor valAxisVertTickLabelD = new CheckBoxPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_VALUE_AXIS_VERTICAL_TICK_LABELS, Messages.common_value_axis_vertical_tick_labels,
				NullEnum.NOTNULL);
		valAxisVertTickLabelD.setDescription(Messages.MBarPlot_value_axis_vertical_tick_labels_description);
		desc.add(valAxisVertTickLabelD);

		CheckBoxPropertyDescriptor showLabelsD = new CheckBoxPropertyDescriptor(JRDesignBarPlot.PROPERTY_SHOW_LABELS,
				Messages.common_show_labels, NullEnum.NULL);
		showLabelsD.setDescription(Messages.MBarPlot_show_labels_description);
		desc.add(showLabelsD);

		CheckBoxPropertyDescriptor showTickLabelsD = new CheckBoxPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_SHOW_TICK_LABELS, Messages.MBarPlot_show_tick_labels, NullEnum.NOTNULL);
		showTickLabelsD.setDescription(Messages.MBarPlot_show_tick_labels_description);
		desc.add(showTickLabelsD);

		CheckBoxPropertyDescriptor showTickMarksD = new CheckBoxPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_SHOW_TICK_MARKS, Messages.MBarPlot_show_tick_marks, NullEnum.NOTNULL);
		showTickMarksD.setDescription(Messages.MBarPlot_show_tick_marks_description);
		desc.add(showTickMarksD);

		NTextPropertyDescriptor catAxisTickLabelMaskD = new NTextPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_MASK, Messages.common_category_axis_tick_label_mask);
		catAxisTickLabelMaskD.setDescription(Messages.MBarPlot_category_axis_tick_label_mask_description);
		desc.add(catAxisTickLabelMaskD);

		NTextPropertyDescriptor valAxisTickLabelMaskD = new NTextPropertyDescriptor(
				JRDesignBarPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_MASK, Messages.common_value_axis_tick_label_mask);
		valAxisTickLabelMaskD.setDescription(Messages.MBarPlot_value_axis_tick_label_mask_description);
		desc.add(valAxisTickLabelMaskD);

		DoublePropertyDescriptor catAxisTickLabelRotation = new DoublePropertyDescriptor(
				JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_ROTATION, Messages.common_category_axis_tick_label_rotation);
		catAxisTickLabelRotation.setDescription(Messages.MBarPlot_category_axis_tick_label_rotation_description);
		desc.add(catAxisTickLabelRotation);

	}

	private MExpression ceAnchorExpression;
	private MExpression veAnchorExpression;
	private MExpression rmaxAnchorExpression;
	private MExpression rminAnchorExpression;
	private MExpression dmaxAnchorExpression;
	private MExpression dminAnchorExpression;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		JRDesignBarPlot jrElement = (JRDesignBarPlot) getValue();
		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LABEL_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement.getOwnCategoryAxisLabelColor());
		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement.getOwnCategoryAxisTickLabelColor());
		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LINE_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement.getOwnCategoryAxisLineColor());
		if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_LABEL_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement.getOwnValueAxisLabelColor());
		if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement.getOwnValueAxisTickLabelColor());
		if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_LINE_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement.getOwnValueAxisLineColor());

		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_VERTICAL_TICK_LABELS))
			return jrElement.getCategoryAxisVerticalTickLabels();
		if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_VERTICAL_TICK_LABELS))
			return jrElement.getValueAxisVerticalTickLabels();
		if (id.equals(JRDesignBarPlot.PROPERTY_SHOW_LABELS))
			return jrElement.getShowLabels();

		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_MASK))
			return jrElement.getCategoryAxisTickLabelMask();
		if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_MASK))
			return jrElement.getValueAxisTickLabelMask();
		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_ROTATION))
			return jrElement.getCategoryAxisTickLabelRotation();

		if (id.equals(JRDesignBarPlot.PROPERTY_SHOW_TICK_LABELS))
			return jrElement.getShowTickLabels();
		if (id.equals(JRDesignBarPlot.PROPERTY_SHOW_TICK_MARKS))
			return jrElement.getShowTickMarks();

		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LABEL_EXPRESSION)) {
			ceAnchorExpression = ExprUtil.getExpression(this, ceAnchorExpression, jrElement.getCategoryAxisLabelExpression());
			return ceAnchorExpression;
		}
		if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_LABEL_EXPRESSION)) {
			veAnchorExpression = ExprUtil.getExpression(this, veAnchorExpression, jrElement.getValueAxisLabelExpression());
			return veAnchorExpression;
		}
		if (id.equals(JRDesignBarPlot.PROPERTY_RANGE_AXIS_MAXVALUE_EXPRESSION)) {
			rmaxAnchorExpression = ExprUtil.getExpression(this, rmaxAnchorExpression,
					jrElement.getRangeAxisMaxValueExpression());
			return rmaxAnchorExpression;
		}
		if (id.equals(JRDesignBarPlot.PROPERTY_RANGE_AXIS_MINVALUE_EXPRESSION)) {
			rminAnchorExpression = ExprUtil.getExpression(this, rminAnchorExpression,
					jrElement.getRangeAxisMinValueExpression());
			return rminAnchorExpression;
		}
		if (id.equals(JRDesignBarPlot.PROPERTY_DOMAIN_AXIS_MAXVALUE_EXPRESSION)) {
			dmaxAnchorExpression = ExprUtil.getExpression(this, dmaxAnchorExpression,
					jrElement.getDomainAxisMaxValueExpression());
			return dmaxAnchorExpression;
		}
		if (id.equals(JRDesignBarPlot.PROPERTY_DOMAIN_AXIS_MINVALUE_EXPRESSION)) {
			dminAnchorExpression = ExprUtil.getExpression(this, dminAnchorExpression,
					jrElement.getDomainAxisMinValueExpression());
			return dminAnchorExpression;
		}

		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LABEL_FONT)) {
			if (clFont == null) {
				clFont = new MFont(jrElement.getCategoryAxisLabelFont());
				setChildListener(clFont);
			}
			return clFont;
		}
		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_FONT)) {
			if (ctFont == null) {
				ctFont = new MFont(jrElement.getCategoryAxisTickLabelFont());
				setChildListener(ctFont);
			}
			return ctFont;
		}
		if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_LABEL_FONT)) {
			if (vlFont == null) {
				vlFont = new MFont(jrElement.getValueAxisLabelFont());
				setChildListener(vlFont);
			}
			return vlFont;
		}
		if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_FONT)) {
			if (vtFont == null) {
				vtFont = new MFont(jrElement.getValueAxisTickLabelFont());
				setChildListener(vtFont);
			}
			return vtFont;
		}
		if (id.equals(JRDesignBarPlot.PROPERTY_ITEM_LABEL)) {
			if (ilFont == null) {
				ilFont = new MChartItemLabel(jrElement.getItemLabel());
				setChildListener(ilFont);
			}
			return ilFont;
		}

		return super.getPropertyValue(id);
	}

	private MFont clFont;
	private MFont ctFont;
	private MFont vlFont;
	private MFont vtFont;
	private MChartItemLabel ilFont;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		JRDesignBarPlot jrElement = (JRDesignBarPlot) getValue();
		if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LABEL_COLOR) && value instanceof RGB)
			jrElement.setCategoryAxisLabelColor(Colors.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_COLOR) && value instanceof RGB)
			jrElement.setCategoryAxisTickLabelColor(Colors.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LINE_COLOR) && value instanceof RGB)
			jrElement.setCategoryAxisLineColor(Colors.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_LABEL_COLOR) && value instanceof RGB)
			jrElement.setValueAxisLabelColor(Colors.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_COLOR) && value instanceof RGB)
			jrElement.setValueAxisTickLabelColor(Colors.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_LINE_COLOR) && value instanceof RGB)
			jrElement.setValueAxisLineColor(Colors.getAWT4SWTRGBColor((RGB) value));

		else if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_VERTICAL_TICK_LABELS))
			jrElement.setCategoryAxisVerticalTickLabels((Boolean) value);
		else if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_VERTICAL_TICK_LABELS))
			jrElement.setValueAxisVerticalTickLabels((Boolean) value);
		else if (id.equals(JRDesignBarPlot.PROPERTY_SHOW_LABELS))
			jrElement.setShowLabels((Boolean) value);

		else if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_MASK))
			jrElement.setCategoryAxisTickLabelMask((String) value);
		else if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_MASK))
			jrElement.setValueAxisTickLabelMask((String) value);
		else if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_ROTATION))
			jrElement.setCategoryAxisTickLabelRotation((Double) value);

		else if (id.equals(JRDesignBarPlot.PROPERTY_SHOW_TICK_LABELS))
			jrElement.setShowTickLabels((Boolean) value);
		else if (id.equals(JRDesignBarPlot.PROPERTY_SHOW_TICK_MARKS))
			jrElement.setShowTickMarks((Boolean) value);

		else if (id.equals(JRDesignBarPlot.PROPERTY_CATEGORY_AXIS_LABEL_EXPRESSION))
			jrElement.setCategoryAxisLabelExpression(ExprUtil.setValues(jrElement.getCategoryAxisLabelExpression(), value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_VALUE_AXIS_LABEL_EXPRESSION))
			jrElement.setValueAxisLabelExpression(ExprUtil.setValues(jrElement.getValueAxisLabelExpression(), value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_RANGE_AXIS_MAXVALUE_EXPRESSION))
			jrElement.setRangeAxisMaxValueExpression(ExprUtil.setValues(jrElement.getRangeAxisMaxValueExpression(), value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_RANGE_AXIS_MINVALUE_EXPRESSION))
			jrElement.setRangeAxisMinValueExpression(ExprUtil.setValues(jrElement.getRangeAxisMinValueExpression(), value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_DOMAIN_AXIS_MAXVALUE_EXPRESSION))
			jrElement.setDomainAxisMaxValueExpression(ExprUtil.setValues(jrElement.getDomainAxisMaxValueExpression(), value));
		else if (id.equals(JRDesignBarPlot.PROPERTY_DOMAIN_AXIS_MINVALUE_EXPRESSION))
			jrElement.setDomainAxisMinValueExpression(ExprUtil.setValues(jrElement.getDomainAxisMinValueExpression(), value));
		else
			super.setPropertyValue(id, value);

	}
}
