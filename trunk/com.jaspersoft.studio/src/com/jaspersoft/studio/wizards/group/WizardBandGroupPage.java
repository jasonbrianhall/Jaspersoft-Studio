/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of iReport.
 * 
 * iReport is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * iReport is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with iReport. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.wizards.group;

import java.util.ArrayList;

import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignField;
import net.sf.jasperreports.engine.design.JRDesignGroup;
import net.sf.jasperreports.engine.design.JRDesignVariable;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.editor.expression.IExpressionContextSetter;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.field.MField;
import com.jaspersoft.studio.model.group.MGroup;
import com.jaspersoft.studio.model.variable.MVariable;
import com.jaspersoft.studio.property.descriptor.expression.dialog.JRExpressionEditor;
import com.jaspersoft.studio.swt.widgets.table.ListContentProvider;
import com.jaspersoft.studio.utils.ModelUtils;

public class WizardBandGroupPage extends WizardPage implements IExpressionContextSetter {
	private MGroup group;
	private JasperDesign jrDesign;
	private Text grName;
	private java.util.List<Object> fList;
	private Table leftTable;
	private TableViewer leftTView;
	private ExpressionContext expContext;

	private final class TLabelProvider extends LabelProvider implements ITableLabelProvider {

		public Image getColumnImage(Object element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				if (element instanceof JRDesignField)
					return JaspersoftStudioPlugin.getImage(MField.getIconDescriptor().getIcon16());
				else if (element instanceof JRDesignVariable)
					return JaspersoftStudioPlugin.getImage(MVariable.getIconDescriptor().getIcon16());
			}
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				if (element instanceof JRDesignField)
					return ((JRDesignField) element).getName();
				else if (element instanceof JRDesignVariable)
					return ((JRDesignVariable) element).getName();
			}
			return ""; //$NON-NLS-1$
		}
	}

	public void setGroup(MGroup group) {
		this.group = group;
		JRDesignGroup ct = (JRDesignGroup) group.getValue();
		if (ct == null)
			group.setValue(new JRDesignGroup());
	}

	public MGroup getGroup() {
		return group;
	}

	public WizardBandGroupPage(JasperDesign jrDesign) {
		super("grouppage"); //$NON-NLS-1$
		setTitle(Messages.common_group);
		setDescription(Messages.WizardBandGroupPage_description);
		this.jrDesign = jrDesign;
		fList = new ArrayList<Object>(jrDesign.getFieldsList());
		for (int i = 0; i < jrDesign.getVariablesList().size(); i++) {
			JRDesignVariable v = (JRDesignVariable) jrDesign.getVariablesList().get(i);
			if (!v.isSystemDefined())
				fList.add(v);

		}
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		composite.setLayout(layout);
		setControl(composite);

		Label lbl = new Label(composite, SWT.NONE);
		lbl.setText(Messages.common_group_name);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		lbl.setLayoutData(gd);

		grName = new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		grName.setLayoutData(gd);
		grName.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				if (grName.getText() == null || grName.getText().trim().equals("")) {//$NON-NLS-1$
					setErrorMessage(Messages.WizardBandGroupPage_error_message_group_name_not_empty);
					setPageComplete(false);
				} else if (jrDesign.getMainDesignDataset().getGroupsMap().get(grName.getText()) != null) {
					setErrorMessage(Messages.WizardBandGroupPage_error_message_unique_name);
					setPageComplete(false);
				} else {
					setPageComplete(true);
					setErrorMessage(null);
					setMessage(getDescription());
					group.setPropertyValue(JRDesignGroup.PROPERTY_NAME, grName.getText());
				}
			}
		});
		grName.setText(ModelUtils.getDefaultName(jrDesign.getMainDesignDataset().getGroupsMap(), Messages.common_group));

		lbl = new Label(composite, SWT.NONE);
		lbl.setText(Messages.WizardBandGroupPage_group_by_following_expression);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		lbl.setLayoutData(gd);

		leftTable = new Table(composite, SWT.V_SCROLL | SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER);
		gd = new GridData(GridData.FILL_VERTICAL);
		gd.widthHint = 250;
		gd.heightHint = 400;
		leftTable.setLayoutData(gd);
		leftTable.setHeaderVisible(true);

		TableColumn[] col = new TableColumn[1];
		col[0] = new TableColumn(leftTable, SWT.NONE);
		col[0].setText(Messages.common_report_objects);
		col[0].pack();

		TableLayout tlayout = new TableLayout();
		tlayout.addColumnData(new ColumnWeightData(100, false));
		leftTable.setLayout(tlayout);

		leftTView = new TableViewer(leftTable);
		leftTView.setContentProvider(new ListContentProvider());
		leftTView.setLabelProvider(new TLabelProvider());

		Button addField = new Button(composite, SWT.PUSH);
		addField.setText(" > "); //$NON-NLS-1$
		addField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Composite expCompo = new Composite(composite, SWT.NONE);
		layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 0;
		expCompo.setLayout(layout);
		gd = new GridData(GridData.FILL_BOTH);
		// gd.horizontalSpan = 2;
		expCompo.setLayoutData(gd);

		final Text dsExpr = new Text(expCompo, SWT.BORDER | SWT.MULTI);
		gd = new GridData(GridData.FILL_BOTH);
		gd.widthHint = 300;
		gd.heightHint = 100;
		dsExpr.setLayoutData(gd);

		final Button dsExprDialog = new Button(expCompo, SWT.PUSH);
		dsExprDialog.setText("..."); //$NON-NLS-1$
		dsExprDialog.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));

		dsExprDialog.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				JRExpressionEditor wizard = new JRExpressionEditor();
				JRDesignExpression mexp = (JRDesignExpression) group.getPropertyValue(JRDesignGroup.PROPERTY_EXPRESSION);
				wizard.setValue(mexp);
				wizard.setExpressionContext(expContext);
				WizardDialog dialog = new WizardDialog(dsExprDialog.getShell(), wizard);
				dialog.create();
				if (dialog.open() == Dialog.OK) {
					mexp = wizard.getValue();
					group.setPropertyValue(JRDesignGroup.PROPERTY_EXPRESSION, mexp);

					dsExpr.setText(mexp.getText());
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		dsExpr.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				// String mexp = (String) group.getPropertyValue(JRDesignGroup.PROPERTY_EXPRESSION);
				group.setPropertyValue(JRDesignGroup.PROPERTY_EXPRESSION, dsExpr.getText());
			}
		});

		addField.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				StructuredSelection sel = (StructuredSelection) leftTView.getSelection();
				if (!sel.isEmpty()) {
					Object obj = sel.getFirstElement();
					JRDesignExpression jrExpression = new JRDesignExpression();
					if (obj instanceof JRDesignField) {
						jrExpression.setText("$F{" + ((JRDesignField) obj).getName() + "}");//$NON-NLS-1$ //$NON-NLS-2$
					} else if (obj instanceof JRDesignVariable) {
						jrExpression.setText("$V{" + ((JRDesignVariable) obj).getName() + "}");//$NON-NLS-1$ //$NON-NLS-2$
					}

					JRExpression mexp = (JRExpression) group.getPropertyValue(JRDesignGroup.PROPERTY_EXPRESSION);

					group.setPropertyValue(JRDesignGroup.PROPERTY_EXPRESSION, mexp);
					dsExpr.setText(jrExpression.getText());
				}

			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		leftTView.setInput(fList);

		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "Jaspersoft.wizard");//$NON-NLS-1$
	}

	public void setExpressionContext(ExpressionContext expContext) {
		this.expContext = expContext;
	}
}
