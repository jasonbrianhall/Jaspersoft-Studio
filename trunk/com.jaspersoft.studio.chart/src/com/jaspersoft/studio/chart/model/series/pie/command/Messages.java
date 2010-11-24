package com.jaspersoft.studio.chart.model.series.pie.command;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.jaspersoft.studio.chart.model.series.pie.command.messages"; //$NON-NLS-1$
	public static String ReorderPieSeriesCommand_reorder_elements;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
