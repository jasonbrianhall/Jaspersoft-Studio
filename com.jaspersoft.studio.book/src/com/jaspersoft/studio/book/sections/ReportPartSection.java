package com.jaspersoft.studio.book.sections;

import net.sf.jasperreports.engine.design.JRDesignPart;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.book.messages.Messages;
import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;

public class ReportPartSection extends AbstractSection {

	
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		parent.setLayout(new GridLayout(2, false));
		GridData comboData = new GridData(SWT.LEFT,SWT.FILL,false,false);
		comboData.widthHint = 100;
		createWidget4Property(parent, MReportPart.PROPERTY_EVALTIME_TYPE).getControl().setLayoutData(comboData);
		createWidget4Property(parent, MReportPart.COMPONENT_EXPRESSION);
		createWidget4Property(parent, JRDesignPart.PROPERTY_PRINT_WHEN_EXPRESSION);
		createWidget4Property(parent, JRDesignPart.PROPERTY_PART_NAME_EXPRESSION);
	}
	
	
	@Override
	protected void initializeProvidedProperties() {
		super.initializeProvidedProperties();
		addProvidedProperties(JRDesignPart.PROPERTY_PRINT_WHEN_EXPRESSION, Messages.MReportPart_printWhen);
		addProvidedProperties(JRDesignPart.PROPERTY_PART_NAME_EXPRESSION, Messages.MReportPart_partName);
		addProvidedProperties(MReportPart.PROPERTY_EVALTIME_TYPE, Messages.common_evaluation_time);
		addProvidedProperties(MReportPart.COMPONENT_EXPRESSION, Messages.MReportPart_componentExpression);
	}
}
