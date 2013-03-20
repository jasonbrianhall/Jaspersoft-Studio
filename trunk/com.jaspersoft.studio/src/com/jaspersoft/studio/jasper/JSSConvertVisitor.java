package com.jaspersoft.studio.jasper;

import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRPrintElement;
import net.sf.jasperreports.engine.base.JRBasePrintFrame;
import net.sf.jasperreports.engine.convert.ConvertVisitor;
import net.sf.jasperreports.engine.convert.ReportConverter;

public class JSSConvertVisitor extends ConvertVisitor {

	public JSSConvertVisitor(ReportConverter reportConverter) {
		super(reportConverter);
	}

	public JSSConvertVisitor(ReportConverter reportConverter, JRBasePrintFrame parentFrame) {
		super(reportConverter, parentFrame);
	}

	@Override
	public void visitChart(JRChart chart) {
		JRPrintElement printImage = ChartConverter.getInstance().convert(reportConverter, chart);
		addElement(parentFrame, printImage);
		addContour(reportConverter, parentFrame, printImage);
	}
}
