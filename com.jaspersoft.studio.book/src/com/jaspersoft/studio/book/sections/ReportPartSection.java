package com.jaspersoft.studio.book.sections;

import net.sf.jasperreports.engine.design.JRDesignPart;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;

public class ReportPartSection extends AbstractSection {

	
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		parent.setLayout(new GridLayout(2, false));
		GridData comboData = new GridData();
		comboData.widthHint = 50;
		createWidget4Property(parent, MReportPart.PROPERTY_EVALTIME_TYPE).getControl().setLayoutData(comboData);
		createWidget4Property(parent, JRDesignPart.PROPERTY_PRINT_WHEN_EXPRESSION);
		createWidget4Property(parent, JRDesignPart.PROPERTY_PART_NAME_EXPRESSION);
	}
	
	
	@Override
	protected void initializeProvidedProperties() {
		super.initializeProvidedProperties();
		addProvidedProperties(JRDesignPart.PROPERTY_PRINT_WHEN_EXPRESSION, "Print When");
		addProvidedProperties(JRDesignPart.PROPERTY_PART_NAME_EXPRESSION, "Part Name Expression");
		addProvidedProperties(MReportPart.PROPERTY_EVALTIME_TYPE, Messages.common_evaluation_time);
	}
}
