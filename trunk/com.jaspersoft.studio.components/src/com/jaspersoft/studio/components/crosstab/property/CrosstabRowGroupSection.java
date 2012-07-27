package com.jaspersoft.studio.components.crosstab.property;

import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabRowGroup;

import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;

public class CrosstabRowGroupSection extends AbstractSection {

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		parent = getWidgetFactory().createSection(parent, "Row", false, 2);

		createWidget4Property(parent,
				JRDesignCrosstabRowGroup.PROPERTY_POSITION);
		createWidget4Property(parent, JRDesignCrosstabRowGroup.PROPERTY_WIDTH);
	}
}
