package com.jaspersoft.studio.property.section.obj;

import net.sf.jasperreports.engine.design.JRDesignParameter;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;

public class ParameterSystemSection extends AbstractSection {
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		parent.setLayout(new GridLayout(3, false));

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		createWidget4Property(parent, JRDesignParameter.PROPERTY_NAME).getControl().setLayoutData(gd);

		createWidget4Property(parent, JRDesignParameter.PROPERTY_VALUE_CLASS_NAME);
	}
}
