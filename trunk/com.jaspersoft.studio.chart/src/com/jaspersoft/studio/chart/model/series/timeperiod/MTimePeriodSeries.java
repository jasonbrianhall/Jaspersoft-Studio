package com.jaspersoft.studio.chart.model.series.timeperiod;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.charts.design.JRDesignTimePeriodSeries;
import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.JRHyperlink;
import net.sf.jasperreports.engine.design.JRDesignHyperlink;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.chart.ChartNodeIconDescriptor;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.IIconDescriptor;
import com.jaspersoft.studio.model.MExpression;
import com.jaspersoft.studio.model.MHyperLink;
import com.jaspersoft.studio.property.descriptor.JRPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.expression.JRExpressionPropertyDescriptor;

public class MTimePeriodSeries extends APropertyNode {

	/** The icon descriptor. */
	private static IIconDescriptor iconDescriptor;

	/**
	 * Gets the icon descriptor.
	 * 
	 * @return the icon descriptor
	 */
	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new ChartNodeIconDescriptor("timeperiodseries");
		return iconDescriptor;
	}

	public MTimePeriodSeries() {
		super();
	}

	public MTimePeriodSeries(ANode parent, JRDesignTimePeriodSeries value, int newIndex) {
		super(parent, -1);
		setValue(value);
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
	public void setDescriptors(IPropertyDescriptor[] descriptors1, Map<String, Object> defaultsMap1) {
		descriptors = descriptors1;
		defaultsMap = defaultsMap1;
	}

	/**
	 * Creates the property descriptors.
	 * 
	 * @param desc
	 *          the desc
	 */
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc, Map<String, Object> defaultsMap) {

		JRExpressionPropertyDescriptor startDateExpD = new JRExpressionPropertyDescriptor(
				JRDesignTimePeriodSeries.PROPERTY_START_DATE_EXPRESSION, "Start Date Expression");
		startDateExpD.setDescription("Start Date Expression.");
		desc.add(startDateExpD);

		JRExpressionPropertyDescriptor endDateExpD = new JRExpressionPropertyDescriptor(
				JRDesignTimePeriodSeries.PROPERTY_END_DATE_EXPRESSION, "End Date Expression");
		endDateExpD.setDescription("End Date Expression.");
		desc.add(endDateExpD);

		JRExpressionPropertyDescriptor lblExprD = new JRExpressionPropertyDescriptor(
				JRDesignTimePeriodSeries.PROPERTY_LABEL_EXPRESSION, "Label Expression");
		lblExprD.setDescription("Label expression.");
		desc.add(lblExprD);

		JRExpressionPropertyDescriptor seriesExprD = new JRExpressionPropertyDescriptor(
				JRDesignTimePeriodSeries.PROPERTY_SERIES_EXPRESSION, "Series Expression");
		seriesExprD.setDescription("Series expression.");
		desc.add(seriesExprD);

		JRExpressionPropertyDescriptor valExprD = new JRExpressionPropertyDescriptor(
				JRDesignTimePeriodSeries.PROPERTY_VALUE_EXPRESSION, "Value Expression");
		valExprD.setDescription("Valule expression.");
		desc.add(valExprD);

		JRPropertyDescriptor itemHyperLinkD = new JRPropertyDescriptor(JRDesignTimePeriodSeries.PROPERTY_ITEM_HYPERLINK,
				"Item Hyperlink");
		itemHyperLinkD.setDescription("Item Hyperlink");
		desc.add(itemHyperLinkD);

		defaultsMap.put(JRDesignTimePeriodSeries.PROPERTY_START_DATE_EXPRESSION, null);
		defaultsMap.put(JRDesignTimePeriodSeries.PROPERTY_END_DATE_EXPRESSION, null);
		defaultsMap.put(JRDesignTimePeriodSeries.PROPERTY_LABEL_EXPRESSION, null);
		defaultsMap.put(JRDesignTimePeriodSeries.PROPERTY_SERIES_EXPRESSION, null);
		defaultsMap.put(JRDesignTimePeriodSeries.PROPERTY_VALUE_EXPRESSION, null);
		defaultsMap.put(JRDesignTimePeriodSeries.PROPERTY_ITEM_HYPERLINK, null);

	}

	private MHyperLink mHyperLink;

	private MExpression sdExpression;
	private MExpression edExpression;
	private MExpression vExpression;
	private MExpression lExpression;
	private MExpression sExpression;

	public Object getPropertyValue(Object id) {
		JRDesignTimePeriodSeries jrElement = (JRDesignTimePeriodSeries) getValue();

		if (id.equals(JRDesignTimePeriodSeries.PROPERTY_ITEM_HYPERLINK)) {
			JRHyperlink itemHyperLink = jrElement.getItemHyperlink();
			if (itemHyperLink == null)
				itemHyperLink = new JRDesignHyperlink();
			mHyperLink = new MHyperLink(itemHyperLink);
			return mHyperLink;
		}
		if (id.equals(JRDesignTimePeriodSeries.PROPERTY_START_DATE_EXPRESSION)) {
			if (sdExpression == null)
				sdExpression = new MExpression(jrElement.getStartDateExpression());
			return sdExpression;
		}
		if (id.equals(JRDesignTimePeriodSeries.PROPERTY_END_DATE_EXPRESSION)) {
			if (edExpression == null)
				edExpression = new MExpression(jrElement.getEndDateExpression());
			return edExpression;
		}
		if (id.equals(JRDesignTimePeriodSeries.PROPERTY_LABEL_EXPRESSION)) {
			if (lExpression == null)
				lExpression = new MExpression(jrElement.getLabelExpression());
			return lExpression;
		}
		if (id.equals(JRDesignTimePeriodSeries.PROPERTY_SERIES_EXPRESSION)) {
			if (sExpression == null)
				sExpression = new MExpression(jrElement.getSeriesExpression());
			return sExpression;
		}
		if (id.equals(JRDesignTimePeriodSeries.PROPERTY_VALUE_EXPRESSION)) {
			if (vExpression == null)
				vExpression = new MExpression(jrElement.getValueExpression());
			return vExpression;
		}

		return null;
	}

	public void setPropertyValue(Object id, Object value) {
		JRDesignTimePeriodSeries jrElement = (JRDesignTimePeriodSeries) getValue();

		if (id.equals(JRDesignTimePeriodSeries.PROPERTY_START_DATE_EXPRESSION)) {
			if (value instanceof MExpression) {
				sdExpression = (MExpression) value;
				JRExpression expression = (JRExpression) sdExpression.getValue();
				jrElement.setStartDateExpression(expression);
			}
		} else if (id.equals(JRDesignTimePeriodSeries.PROPERTY_END_DATE_EXPRESSION)) {
			if (value instanceof MExpression) {
				edExpression = (MExpression) value;
				JRExpression expression = (JRExpression) edExpression.getValue();
				jrElement.setEndDateExpression(expression);
			}
		} else if (id.equals(JRDesignTimePeriodSeries.PROPERTY_LABEL_EXPRESSION)) {
			if (value instanceof MExpression) {
				lExpression = (MExpression) value;
				JRExpression expression = (JRExpression) lExpression.getValue();
				jrElement.setLabelExpression(expression);
			}
		} else if (id.equals(JRDesignTimePeriodSeries.PROPERTY_SERIES_EXPRESSION)) {
			if (value instanceof MExpression) {
				sExpression = (MExpression) value;
				JRExpression expression = (JRExpression) sExpression.getValue();
				jrElement.setSeriesExpression(expression);
			}
		} else if (id.equals(JRDesignTimePeriodSeries.PROPERTY_VALUE_EXPRESSION)) {
			if (value instanceof MExpression) {
				vExpression = (MExpression) value;
				JRExpression expression = (JRExpression) vExpression.getValue();
				jrElement.setValueExpression(expression);
			}
		}
	}

	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}

	public String getDisplayText() {
		return getIconDescriptor().getTitle();
	}

}