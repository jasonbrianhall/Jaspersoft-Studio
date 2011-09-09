package com.jaspersoft.studio.components.chart.property.section.plot;

import net.sf.jasperreports.charts.design.JRDesignDataRange;
import net.sf.jasperreports.charts.design.JRDesignThermometerPlot;
import net.sf.jasperreports.charts.design.JRDesignValueDisplay;
import net.sf.jasperreports.charts.type.ValueLocationEnum;
import net.sf.jasperreports.engine.design.JRDesignExpression;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.components.chart.messages.Messages;
import com.jaspersoft.studio.components.chart.model.plot.MChartPlot;
import com.jaspersoft.studio.components.chart.property.widget.BtnColor;
import com.jaspersoft.studio.components.chart.property.widget.BtnExpression;
import com.jaspersoft.studio.components.chart.property.widget.BtnFont;
import com.jaspersoft.studio.components.chart.property.widget.BtnRCombo;
import com.jaspersoft.studio.components.chart.property.widget.BtnText;
import com.jaspersoft.studio.model.text.MFont;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.section.AbstractSection;
import com.jaspersoft.studio.utils.EnumHelper;

public class ThermometerPlot extends APlot {

	public ThermometerPlot(Composite parent, AbstractSection section) {
		super(parent, section);
	}

	@Override
	protected void createComponent(Composite parent, AbstractSection section) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());
		composite.setLayout(new RowLayout());

		CLabel lbl = section.getWidgetFactory().createCLabel(composite,
				Messages.MThermometerPlot_mercury_color, SWT.RIGHT);
		RowData rd = new RowData();
		rd.width = 101;
		lbl.setLayoutData(rd);

		needleLblColor = new BtnColor(composite, section,
				JRDesignThermometerPlot.PROPERTY_MERCURY_COLOR,
				Messages.MThermometerPlot_mercury_color_description);

		section.getWidgetFactory().createCLabel(composite,
				Messages.MMeterPlot_shape);

		composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());
		composite.setLayout(new RowLayout());

		composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());
		composite.setLayout(new RowLayout());

		lbl = section.getWidgetFactory().createCLabel(composite, "Value",
				SWT.RIGHT);
		rd = new RowData();
		rd.width = 101;
		lbl.setLayoutData(rd);

		valFont = new BtnFont(composite, section,
				JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." //$NON-NLS-1$
						+ JRDesignValueDisplay.PROPERTY_FONT, false);

		section.getWidgetFactory().createCLabel(composite, "Color", SWT.RIGHT);

		valColor = new BtnColor(
				composite,
				section,
				JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." //$NON-NLS-1$
						+ JRDesignValueDisplay.PROPERTY_COLOR,
				com.jaspersoft.studio.components.chart.messages.Messages.MMeterPlot_value_color_description);

		section.getWidgetFactory().createCLabel(composite, "Mask", SWT.RIGHT);

		valMask = new BtnText(
				composite,
				section,
				JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." //$NON-NLS-1$
						+ JRDesignValueDisplay.PROPERTY_MASK,
				com.jaspersoft.studio.components.chart.messages.Messages.MMeterPlot_value_mask_description);

		section.getWidgetFactory().createCLabel(composite,
				Messages.MThermometerPlot_value_location, SWT.RIGHT);

		location = new BtnRCombo(composite, section,
				JRDesignThermometerPlot.PROPERTY_VALUE_LOCATION,
				Messages.MThermometerPlot_value_location_description,
				EnumHelper.getEnumNames(ValueLocationEnum.values(),
						NullEnum.NOTNULL));

		dataRange(parent, section);
		highRange(parent, section);
		mediumRange(parent, section);
		lowRange(parent, section);

	}

	private void dataRange(Composite parent, AbstractSection section) {
		Composite composite;
		CLabel lbl;
		RowData rd;
		composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());
		composite.setLayout(new RowLayout());

		lbl = section.getWidgetFactory().createCLabel(composite, "Data Range",
				SWT.RIGHT);
		rd = new RowData();
		rd.width = 101;
		lbl.setLayoutData(rd);

		section.getWidgetFactory().createCLabel(composite, "Low", SWT.RIGHT);

		Composite cmp = new Composite(composite, SWT.NONE);
		GridLayout gl = new GridLayout(3, false);
		gl.marginTop = 0;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 0;
		cmp.setLayout(gl);
		cmp.setBackground(parent.getBackground());
		dRangeLow = new BtnExpression(cmp, section,
				JRDesignThermometerPlot.PROPERTY_DATA_RANGE + "."
						+ JRDesignDataRange.PROPERTY_LOW_EXPRESSION);

		section.getWidgetFactory().createCLabel(composite, "High", SWT.RIGHT);

		cmp = new Composite(composite, SWT.NONE);
		gl = new GridLayout(3, false);
		gl.marginTop = 0;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 0;
		cmp.setLayout(gl);
		cmp.setBackground(parent.getBackground());
		dRangeHigh = new BtnExpression(cmp, section,
				JRDesignThermometerPlot.PROPERTY_DATA_RANGE + "."
						+ JRDesignDataRange.PROPERTY_HIGH_EXPRESSION);
	}

	private void lowRange(Composite parent, AbstractSection section) {
		Composite composite;
		CLabel lbl;
		RowData rd;
		composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());
		composite.setLayout(new RowLayout());

		lbl = section.getWidgetFactory().createCLabel(composite, "Low Range",
				SWT.RIGHT);
		rd = new RowData();
		rd.width = 101;
		lbl.setLayoutData(rd);

		section.getWidgetFactory().createCLabel(composite, "Low", SWT.RIGHT);

		Composite cmp = new Composite(composite, SWT.NONE);
		GridLayout gl = new GridLayout(3, false);
		gl.marginTop = 0;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 0;
		cmp.setLayout(gl);
		cmp.setBackground(parent.getBackground());
		lRangeLow = new BtnExpression(cmp, section,
				JRDesignThermometerPlot.PROPERTY_LOW_RANGE + "."
						+ JRDesignDataRange.PROPERTY_LOW_EXPRESSION);

		section.getWidgetFactory().createCLabel(composite, "High", SWT.RIGHT);

		cmp = new Composite(composite, SWT.NONE);
		gl = new GridLayout(3, false);
		gl.marginTop = 0;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 0;
		cmp.setLayout(gl);
		cmp.setBackground(parent.getBackground());
		lRangeHigh = new BtnExpression(cmp, section,
				JRDesignThermometerPlot.PROPERTY_LOW_RANGE + "."
						+ JRDesignDataRange.PROPERTY_HIGH_EXPRESSION);
	}

	private void mediumRange(Composite parent, AbstractSection section) {
		Composite composite;
		CLabel lbl;
		RowData rd;
		composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());
		composite.setLayout(new RowLayout());

		lbl = section.getWidgetFactory().createCLabel(composite,
				"Medium Range", SWT.RIGHT);
		rd = new RowData();
		rd.width = 101;
		lbl.setLayoutData(rd);

		section.getWidgetFactory().createCLabel(composite, "Low", SWT.RIGHT);

		Composite cmp = new Composite(composite, SWT.NONE);
		GridLayout gl = new GridLayout(3, false);
		gl.marginTop = 0;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 0;
		cmp.setLayout(gl);
		cmp.setBackground(parent.getBackground());
		mRangeLow = new BtnExpression(cmp, section,
				JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE + "."
						+ JRDesignDataRange.PROPERTY_LOW_EXPRESSION);

		section.getWidgetFactory().createCLabel(composite, "High", SWT.RIGHT);

		cmp = new Composite(composite, SWT.NONE);
		gl = new GridLayout(3, false);
		gl.marginTop = 0;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 0;
		cmp.setLayout(gl);
		cmp.setBackground(parent.getBackground());
		mRangeHigh = new BtnExpression(cmp, section,
				JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE + "."
						+ JRDesignDataRange.PROPERTY_HIGH_EXPRESSION);
	}

	private void highRange(Composite parent, AbstractSection section) {
		Composite composite;
		CLabel lbl;
		RowData rd;
		composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());
		composite.setLayout(new RowLayout());

		lbl = section.getWidgetFactory().createCLabel(composite, "High Range",
				SWT.RIGHT);
		rd = new RowData();
		rd.width = 101;
		lbl.setLayoutData(rd);

		section.getWidgetFactory().createCLabel(composite, "Low", SWT.RIGHT);

		Composite cmp = new Composite(composite, SWT.NONE);
		GridLayout gl = new GridLayout(3, false);
		gl.marginTop = 0;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 0;
		cmp.setLayout(gl);
		cmp.setBackground(parent.getBackground());
		hRangeLow = new BtnExpression(cmp, section,
				JRDesignThermometerPlot.PROPERTY_HIGH_RANGE + "."
						+ JRDesignDataRange.PROPERTY_LOW_EXPRESSION);

		section.getWidgetFactory().createCLabel(composite, "High", SWT.RIGHT);

		cmp = new Composite(composite, SWT.NONE);
		gl = new GridLayout(3, false);
		gl.marginTop = 0;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 0;
		cmp.setLayout(gl);
		cmp.setBackground(parent.getBackground());
		hRangeHigh = new BtnExpression(cmp, section,
				JRDesignThermometerPlot.PROPERTY_HIGH_RANGE + "."
						+ JRDesignDataRange.PROPERTY_HIGH_EXPRESSION);
	}

	private BtnColor needleLblColor;
	private BtnRCombo location;
	private BtnFont valFont;
	private BtnColor valColor;
	private BtnText valMask;

	private BtnExpression dRangeLow;
	private BtnExpression dRangeHigh;

	private BtnExpression lRangeLow;
	private BtnExpression lRangeHigh;

	private BtnExpression hRangeLow;
	private BtnExpression hRangeHigh;

	private BtnExpression mRangeLow;
	private BtnExpression mRangeHigh;

	@Override
	public void setData(MChartPlot mplot) {
		needleLblColor
				.setData((RGB) mplot
						.getPropertyValue(JRDesignThermometerPlot.PROPERTY_MERCURY_COLOR));

		valFont.setData(
				mplot,
				(MFont) mplot
						.getPropertyValue(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY
								+ "." + JRDesignValueDisplay.PROPERTY_FONT)); //$NON-NLS-1$
		valColor.setData((RGB) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY
						+ "." + JRDesignValueDisplay.PROPERTY_COLOR)); //$NON-NLS-1$
		valMask.setData((String) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY
						+ "." + JRDesignValueDisplay.PROPERTY_MASK)); //$NON-NLS-1$

		location.setData((Integer) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_VALUE_LOCATION));

		dRangeLow.setData((JRDesignExpression) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_DATA_RANGE
						+ "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION)); //$NON-NLS-1$

		dRangeHigh.setData((JRDesignExpression) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_DATA_RANGE
						+ "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION)); //$NON-NLS-1$

		lRangeLow.setData((JRDesignExpression) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_LOW_RANGE
						+ "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION)); //$NON-NLS-1$

		lRangeHigh.setData((JRDesignExpression) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_LOW_RANGE
						+ "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION)); //$NON-NLS-1$

		mRangeLow.setData((JRDesignExpression) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE
						+ "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION)); //$NON-NLS-1$

		mRangeHigh.setData((JRDesignExpression) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE
						+ "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION)); //$NON-NLS-1$

		hRangeLow.setData((JRDesignExpression) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_HIGH_RANGE
						+ "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION)); //$NON-NLS-1$

		hRangeHigh.setData((JRDesignExpression) mplot
				.getPropertyValue(JRDesignThermometerPlot.PROPERTY_HIGH_RANGE
						+ "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION)); //$NON-NLS-1$

	}

}
