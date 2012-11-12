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
package com.jaspersoft.studio.components.chart.model.plot;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.charts.JRLinePlot;
import net.sf.jasperreports.charts.design.JRDesignLinePlot;
import net.sf.jasperreports.engine.JRConstants;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.components.chart.messages.Messages;
import com.jaspersoft.studio.model.text.MFont;
import com.jaspersoft.studio.model.text.MFontUtil;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.checkbox.CheckBoxPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.color.ColorPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.expression.ExprUtil;
import com.jaspersoft.studio.property.descriptor.expression.JRExpressionPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.text.FontPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.text.NTextPropertyDescriptor;
import com.jaspersoft.studio.property.descriptors.DegreePropertyDescriptor;
import com.jaspersoft.studio.property.descriptors.DoublePropertyDescriptor;
import com.jaspersoft.studio.utils.Colors;

public class MLinePlot extends MChartPlot {
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public MLinePlot(JRLinePlot value) {
		super(value);
	}

	private static IPropertyDescriptor[] descriptors;
	private static Map<String, Object> defaultsMap;

	@Override
	public Map<String, Object> getDefaultsMap() {
		return defaultsMap;
	}

	@Override
	public String getDisplayText() {
		return Messages.MLinePlot_line_plot;
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

	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc,
			Map<String, Object> defaultsMap) {
		super.createPropertyDescriptors(desc, defaultsMap);

		ColorPropertyDescriptor catAxisLabelColorD = new ColorPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LABEL_COLOR,
				Messages.common_category_axis_label_color, NullEnum.NULL);
		catAxisLabelColorD
				.setDescription(Messages.MLinePlot_category_axis_label_color_description);
		desc.add(catAxisLabelColorD);

		JRExpressionPropertyDescriptor catAxisLabelExprD = new JRExpressionPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LABEL_EXPRESSION,
				Messages.common_category_axis_label_expression);
		catAxisLabelExprD
				.setDescription(Messages.MLinePlot_category_axis_label_expression_description);
		desc.add(catAxisLabelExprD);

		FontPropertyDescriptor catAxisLabelFontD = new FontPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LABEL_FONT,
				Messages.common_category_axis_label_font);
		catAxisLabelFontD
				.setDescription(Messages.MLinePlot_category_axis_label_font_description);
		desc.add(catAxisLabelFontD);

		ColorPropertyDescriptor catAxisTickLabelColorD = new ColorPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_COLOR,
				Messages.common_category_axis_tick_label_color, NullEnum.NULL);
		catAxisTickLabelColorD
				.setDescription(Messages.MLinePlot_category_axis_tick_label_color_description);
		desc.add(catAxisTickLabelColorD);

		FontPropertyDescriptor catAxisTickLabelFontD = new FontPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_FONT,
				Messages.common_category_axis_tick_label_font);
		catAxisTickLabelFontD
				.setDescription(Messages.MLinePlot_category_axis_tick_label_font_description);
		desc.add(catAxisTickLabelFontD);

		ColorPropertyDescriptor catAxisLineColorD = new ColorPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LINE_COLOR,
				Messages.common_category_axis_line_color, NullEnum.NULL);
		catAxisLineColorD
				.setDescription(Messages.MLinePlot_category_axis_line_color_description);
		desc.add(catAxisLineColorD);

		ColorPropertyDescriptor valAxisLabelColorD = new ColorPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_VALUE_AXIS_LABEL_COLOR,
				Messages.common_value_axis_label_color, NullEnum.NULL);
		valAxisLabelColorD
				.setDescription(Messages.MLinePlot_value_axis_label_color_description);
		desc.add(valAxisLabelColorD);

		JRExpressionPropertyDescriptor valAxisLabelExprD = new JRExpressionPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_VALUE_AXIS_LABEL_EXPRESSION,
				Messages.common_category_value_axis_label_expression);
		valAxisLabelExprD
				.setDescription(Messages.MLinePlot_category_value_axis_label_expression_description);
		desc.add(valAxisLabelExprD);

		FontPropertyDescriptor valAxisLabelFontD = new FontPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_VALUE_AXIS_LABEL_FONT,
				Messages.common_value_axis_label_font);
		valAxisLabelFontD
				.setDescription(Messages.MLinePlot_value_axis_label_font_description);
		desc.add(valAxisLabelFontD);

		ColorPropertyDescriptor valAxisTickLabelColorD = new ColorPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_VALUE_AXIS_TICK_LABEL_COLOR,
				Messages.common_value_axis_tick_label_color, NullEnum.INHERITED);
		valAxisTickLabelColorD
				.setDescription(Messages.MLinePlot_value_axis_tick_label_color_description);
		desc.add(valAxisTickLabelColorD);

		FontPropertyDescriptor valAxisTickLabelFontD = new FontPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_VALUE_AXIS_TICK_LABEL_FONT,
				Messages.common_value_axis_tick_label_font);
		valAxisTickLabelFontD
				.setDescription(Messages.MLinePlot_value_axis_tick_label_font_description);
		desc.add(valAxisTickLabelFontD);

		ColorPropertyDescriptor valAxisLineColorD = new ColorPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_VALUE_AXIS_LINE_COLOR,
				Messages.common_value_axis_line_color, NullEnum.INHERITED);
		valAxisLineColorD
				.setDescription(Messages.MLinePlot_value_axis_line_color_description);
		desc.add(valAxisLineColorD);

		JRExpressionPropertyDescriptor rangeAxisMinExprD = new JRExpressionPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_RANGE_AXIS_MINVALUE_EXPRESSION,
				Messages.common_range_axis_minvalue_expression);
		rangeAxisMinExprD
				.setDescription(Messages.MLinePlot_range_axis_minvalue_expression_description);
		desc.add(rangeAxisMinExprD);

		JRExpressionPropertyDescriptor rangeAxisMaxExprD = new JRExpressionPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_RANGE_AXIS_MAXVALUE_EXPRESSION,
				Messages.common_range_axis_maxvalue_expression);
		rangeAxisMaxExprD
				.setDescription(Messages.MLinePlot_range_axis_maxvalue_expression_description);
		desc.add(rangeAxisMaxExprD);

		JRExpressionPropertyDescriptor domainAxisMinExprD = new JRExpressionPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_DOMAIN_AXIS_MAXVALUE_EXPRESSION,
				Messages.common_domain_axis_minvalue_expression);
		domainAxisMinExprD
				.setDescription(Messages.MLinePlot_domain_axis_minvalue_expression_description);
		desc.add(domainAxisMinExprD);

		JRExpressionPropertyDescriptor domainAxisMaxExprD = new JRExpressionPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_DOMAIN_AXIS_MINVALUE_EXPRESSION,
				Messages.common_domain_axis_maxvalue_expression);
		domainAxisMaxExprD
				.setDescription(Messages.MLinePlot_domain_axis_maxvalue_expression_description);
		desc.add(domainAxisMaxExprD);

		CheckBoxPropertyDescriptor catAxisVertTickLabelD = new CheckBoxPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_VERTICAL_TICK_LABELS,
				Messages.common_category_axis_vertical_tick_labels,
				NullEnum.NULL);
		catAxisVertTickLabelD
				.setDescription(Messages.MLinePlot_category_axis_vertical_tick_labels_description);
		desc.add(catAxisVertTickLabelD);

		CheckBoxPropertyDescriptor valAxisVertTickLabelD = new CheckBoxPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_VALUE_AXIS_VERTICAL_TICK_LABELS,
				Messages.common_value_axis_vertical_tick_labels, NullEnum.NULL);
		valAxisVertTickLabelD
				.setDescription(Messages.MLinePlot_value_axis_vertical_tick_labels_description);
		desc.add(valAxisVertTickLabelD);

		CheckBoxPropertyDescriptor showLinesD = new CheckBoxPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_SHOW_LINES,
				Messages.common_show_lines, NullEnum.NULL);
		showLinesD.setDescription(Messages.MLinePlot_show_lines_description);
		desc.add(showLinesD);

		CheckBoxPropertyDescriptor showShapesD = new CheckBoxPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_SHOW_SHAPES,
				Messages.common_show_shapes, NullEnum.NULL);
		showShapesD.setDescription(Messages.MLinePlot_show_shapes_description);
		desc.add(showShapesD);

		NTextPropertyDescriptor catAxisTickLabelMaskD = new NTextPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_MASK,
				Messages.common_category_axis_tick_label_mask);
		catAxisTickLabelMaskD
				.setDescription(Messages.MLinePlot_category_axis_tick_label_mask_description);
		desc.add(catAxisTickLabelMaskD);

		NTextPropertyDescriptor valAxisTickLabelMaskD = new NTextPropertyDescriptor(
				JRDesignLinePlot.PROPERTY_VALUE_AXIS_TICK_LABEL_MASK,
				Messages.common_value_axis_tick_label_mask);
		valAxisTickLabelMaskD
				.setDescription(Messages.MLinePlot_value_axis_tick_label_mask_description);
		desc.add(valAxisTickLabelMaskD);

		DoublePropertyDescriptor catAxisTickLabelRotation = new DegreePropertyDescriptor(
				JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_ROTATION,
				Messages.common_category_axis_tick_label_rotation);
		catAxisTickLabelRotation
				.setDescription(Messages.MLinePlot_category_axis_tick_label_rotation_description);
		desc.add(catAxisTickLabelRotation);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java
	 * .lang.Object)
	 */
	@Override
	public Object getPropertyValue(Object id) {
		JRDesignLinePlot jrElement = (JRDesignLinePlot) getValue();
		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LABEL_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement
					.getOwnCategoryAxisLabelColor());
		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement
					.getOwnCategoryAxisTickLabelColor());
		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LINE_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement
					.getOwnCategoryAxisLineColor());
		if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_LABEL_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement
					.getOwnValueAxisLabelColor());
		if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_TICK_LABEL_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement
					.getOwnValueAxisTickLabelColor());
		if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_LINE_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement
					.getOwnValueAxisLineColor());

		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_VERTICAL_TICK_LABELS))
			return jrElement.getCategoryAxisVerticalTickLabels();
		if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_VERTICAL_TICK_LABELS))
			return jrElement.getValueAxisVerticalTickLabels();
		if (id.equals(JRDesignLinePlot.PROPERTY_SHOW_LINES))
			return jrElement.getShowLines();
		if (id.equals(JRDesignLinePlot.PROPERTY_SHOW_SHAPES))
			return jrElement.getShowShapes();

		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_MASK))
			return jrElement.getCategoryAxisTickLabelMask();
		if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_TICK_LABEL_MASK))
			return jrElement.getValueAxisTickLabelMask();
		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_ROTATION))
			return jrElement.getCategoryAxisTickLabelRotation();

		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LABEL_EXPRESSION))
			return ExprUtil.getExpression(jrElement
					.getCategoryAxisLabelExpression());
		if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_LABEL_EXPRESSION))
			return ExprUtil.getExpression(jrElement
					.getValueAxisLabelExpression());
		if (id.equals(JRDesignLinePlot.PROPERTY_RANGE_AXIS_MAXVALUE_EXPRESSION))
			return ExprUtil.getExpression(jrElement
					.getRangeAxisMaxValueExpression());
		if (id.equals(JRDesignLinePlot.PROPERTY_RANGE_AXIS_MINVALUE_EXPRESSION))
			return ExprUtil.getExpression(jrElement
					.getRangeAxisMinValueExpression());
		if (id.equals(JRDesignLinePlot.PROPERTY_DOMAIN_AXIS_MAXVALUE_EXPRESSION))
			return ExprUtil.getExpression(jrElement
					.getDomainAxisMaxValueExpression());
		if (id.equals(JRDesignLinePlot.PROPERTY_DOMAIN_AXIS_MINVALUE_EXPRESSION))
			return ExprUtil.getExpression(jrElement
					.getDomainAxisMinValueExpression());

		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LABEL_FONT)) {
			clFont = MFontUtil.getMFont(clFont,
					jrElement.getCategoryAxisLabelFont(), null, this);
			return clFont;
		}
		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_FONT)) {
			ctFont = MFontUtil.getMFont(ctFont,
					jrElement.getCategoryAxisTickLabelFont(), null, this);
			return ctFont;
		}
		if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_LABEL_FONT)) {
			vlFont = MFontUtil.getMFont(vlFont,
					jrElement.getValueAxisLabelFont(), null, this);
			return vlFont;
		}
		if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_TICK_LABEL_FONT)) {
			vtFont = MFontUtil.getMFont(vtFont,
					jrElement.getValueAxisTickLabelFont(), null, this);
			return vtFont;
		}

		return super.getPropertyValue(id);
	}

	private MFont clFont;
	private MFont ctFont;
	private MFont vlFont;
	private MFont vtFont;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java
	 * .lang.Object, java.lang.Object)
	 */
	@Override
	public void setPropertyValue(Object id, Object value) {
		JRDesignLinePlot jrElement = (JRDesignLinePlot) getValue();

		if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LABEL_FONT)) {
			jrElement.setCategoryAxisLabelFont(MFontUtil.setMFont(value));
		} else if (id
				.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_FONT)) {
			jrElement.setCategoryAxisTickLabelFont(MFontUtil.setMFont(value));
		} else if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_LABEL_FONT)) {
			jrElement.setValueAxisLabelFont(MFontUtil.setMFont(value));
		} else if (id
				.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_TICK_LABEL_FONT)) {
			jrElement.setValueAxisTickLabelFont(MFontUtil.setMFont(value));
		} else if (id
				.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LABEL_COLOR)
				&& value instanceof RGB)
			jrElement.setCategoryAxisLabelColor(Colors
					.getAWT4SWTRGBColor((RGB) value));
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_COLOR)
				&& value instanceof RGB)
			jrElement.setCategoryAxisTickLabelColor(Colors
					.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LINE_COLOR)
				&& value instanceof RGB)
			jrElement.setCategoryAxisLineColor(Colors
					.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_LABEL_COLOR)
				&& value instanceof RGB)
			jrElement.setValueAxisLabelColor(Colors
					.getAWT4SWTRGBColor((RGB) value));
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_TICK_LABEL_COLOR)
				&& value instanceof RGB)
			jrElement.setValueAxisTickLabelColor(Colors
					.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_LINE_COLOR)
				&& value instanceof RGB)
			jrElement.setValueAxisLineColor(Colors
					.getAWT4SWTRGBColor((RGB) value));

		else if (id
				.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_VERTICAL_TICK_LABELS))
			jrElement.setCategoryAxisVerticalTickLabels((Boolean) value);
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_VERTICAL_TICK_LABELS))
			jrElement.setValueAxisVerticalTickLabels((Boolean) value);
		else if (id.equals(JRDesignLinePlot.PROPERTY_SHOW_LINES))
			jrElement.setShowLines((Boolean) value);
		else if (id.equals(JRDesignLinePlot.PROPERTY_SHOW_SHAPES))
			jrElement.setShowShapes((Boolean) value);

		else if (id
				.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_MASK))
			jrElement.setCategoryAxisTickLabelMask((String) value);
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_TICK_LABEL_MASK))
			jrElement.setValueAxisTickLabelMask((String) value);
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_TICK_LABEL_ROTATION))
			jrElement.setCategoryAxisTickLabelRotation((Double) value);

		else if (id
				.equals(JRDesignLinePlot.PROPERTY_CATEGORY_AXIS_LABEL_EXPRESSION))
			jrElement.setCategoryAxisLabelExpression(ExprUtil.setValues(
					jrElement.getCategoryAxisLabelExpression(), value));
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_VALUE_AXIS_LABEL_EXPRESSION))
			jrElement.setValueAxisLabelExpression(ExprUtil.setValues(
					jrElement.getValueAxisLabelExpression(), value));
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_RANGE_AXIS_MAXVALUE_EXPRESSION))
			jrElement.setRangeAxisMaxValueExpression(ExprUtil.setValues(
					jrElement.getRangeAxisMaxValueExpression(), value));
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_RANGE_AXIS_MINVALUE_EXPRESSION))
			jrElement.setRangeAxisMinValueExpression(ExprUtil.setValues(
					jrElement.getRangeAxisMinValueExpression(), value));
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_DOMAIN_AXIS_MAXVALUE_EXPRESSION))
			jrElement.setDomainAxisMaxValueExpression(ExprUtil.setValues(
					jrElement.getDomainAxisMaxValueExpression(), value));
		else if (id
				.equals(JRDesignLinePlot.PROPERTY_DOMAIN_AXIS_MINVALUE_EXPRESSION))
			jrElement.setDomainAxisMinValueExpression(ExprUtil.setValues(
					jrElement.getDomainAxisMinValueExpression(), value));
		else
			super.setPropertyValue(id, value);
	}
}
