package com.jaspersoft.studio.server.properties;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.property.section.AbstractSection;
import com.jaspersoft.studio.utils.Misc;

public class CommonSection extends ASection {
	public CommonSection() {
		super();
	}

	private Text tparent;
	private Text tid;
	private Text ttype;
	private Text tname;
	private Text tdesc;
	private Binding bname;
	private Binding bdesc;

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		parent = new Composite(parent, SWT.NONE);
		parent.setLayout(new GridLayout(2, false));
		parent.setBackground(parent.getDisplay()
				.getSystemColor(SWT.COLOR_WHITE));

		AbstractSection.createLabel(parent, getWidgetFactory(),
				"Parent Folder", 120);
		tparent = getWidgetFactory().createText(parent, "",
				SWT.BORDER | SWT.READ_ONLY);
		tparent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		AbstractSection.createLabel(parent, getWidgetFactory(), "ID", 120);
		tid = getWidgetFactory().createText(parent, "",
				SWT.BORDER | SWT.READ_ONLY);
		tid.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		AbstractSection.createLabel(parent, getWidgetFactory(), "Type:", 120);
		ttype = getWidgetFactory().createText(parent, "",
				SWT.BORDER | SWT.READ_ONLY);
		ttype.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		AbstractSection.createLabel(parent, getWidgetFactory(), "Name", 120);
		tname = getWidgetFactory().createText(parent, "", SWT.BORDER);
		tname.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		AbstractSection.createLabel(parent, getWidgetFactory(), "Description",
				120);
		tdesc = getWidgetFactory().createText(parent, "",
				SWT.BORDER | SWT.MULTI | SWT.WRAP);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.minimumHeight = 100;
		tdesc.setLayoutData(gd);

	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);

		rebind();
	}

	private void rebind() {
		if (bname != null) {
			bindingContext.removeBinding(bname);
			bname.dispose();
		}
		if (bdesc != null) {
			bindingContext.removeBinding(bdesc);
			bdesc.dispose();
		}
		bname = bindingContext.bindValue(
				SWTObservables.observeText(tname, SWT.Modify),
				PojoObservables.observeValue(res.getValue(), "name"));
		bdesc = bindingContext.bindValue(
				SWTObservables.observeText(tdesc, SWT.Modify),
				PojoObservables.observeValue(res.getValue(), "description"));
	}

	@Override
	public void refresh() {
		bname.updateTargetToModel();
		bdesc.updateTargetToModel();

		ResourceDescriptor rd = res.getValue();
		tparent.setText(Misc.nvl(rd.getParentFolder()));
		tid.setText(Misc.nvl(rd.getName()));
		ttype.setText(Misc.nvl(rd.getResourceType()));
	}

	public void enableFields(boolean enable) {
		tname.setEditable(enable);
		tdesc.setEditable(enable);
	}

}