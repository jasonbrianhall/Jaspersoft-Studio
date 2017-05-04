/*******************************************************************************
 * Copyright (C) 2013 - 2016. TIBCO Software Inc. All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.data.designer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.swt.events.ExpressionModifiedEvent;
import com.jaspersoft.studio.swt.events.ExpressionModifiedListener;
import com.jaspersoft.studio.swt.widgets.WTextExpression;
import com.jaspersoft.studio.utils.Misc;

import net.sf.jasperreports.eclipse.ui.ATitledDialog;
import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignParameter;

public class SelectParameterDialog extends ATitledDialog {
	protected String pname = null;
	protected JRDesignParameter prm;
	protected AQueryDesigner designer;
	protected JRDesignDataset dataset;

	public SelectParameterDialog(Shell parentShell, AQueryDesigner designer) {
		super(parentShell, false);
		setTitle(Messages.SelectParameterDialog_0);
		this.designer = designer;
		dataset = (JRDesignDataset) designer.getjDataset().clone();
	}

	protected Map<String, JRDesignParameter> parameters = new HashMap<String, JRDesignParameter>();
	protected WTextExpression wdef;
	protected Combo cmb;
	protected Set<JRDesignParameter> dirty = new HashSet<JRDesignParameter>();

	protected void addParameter() {
		if (!dataset.getParametersMap().containsValue(prm)) {
			try {
				dataset.addParameter(prm);
			} catch (JRException e) {
				UIUtils.showError(e);
			}
		}
	}

	@Override
	protected void okPressed() {
		commitValues();
		super.okPressed();
	}

	protected void commitValues() {
		if (dirty.isEmpty())
			return;
		JRDesignDataset ds = designer.getjDataset();
		for (JRDesignParameter p : dirty) {
			if (ds.getParametersMap().containsKey(p.getName()))
				ds.removeParameter(p.getName());
			try {
				ds.addParameter(p);
			} catch (JRException e) {
				UIUtils.showError(e);
			}
		}
		designer.setParameters(ds.getParametersList());
	}

	protected void getCompatibleParameters() {
		if (dataset != null) {
			List<String> prms = new ArrayList<String>();
			for (JRParameter p : dataset.getParameters()) {
				if (p.getName().equals(pname)) {
					prm = (JRDesignParameter) p;
					prms.add(p.getName());
					parameters.put(p.getName(), (JRDesignParameter) p);
				}
				if (isParameterCompatible(p)) { // here if it is compatible
					prms.add(p.getName());
					parameters.put(p.getName(), (JRDesignParameter) p);
				}
			}
			cmb.setItems(prms.toArray(new String[prms.size()]));
		}
		if (Misc.isNullOrEmpty(pname)) {
			cmb.select(0);
			pname = cmb.getText();
			prm = (JRDesignParameter) dataset.getParametersMap().get(pname);
		} else
			cmb.setText(Misc.nvl(pname));
	}

	protected boolean isParameterCompatible(JRParameter p) {
		return true;
	}

	protected String getDefaultParameterType() {
		if (prm != null)
			return prm.getValueClassName();
		return Object.class.getName();
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cmp = (Composite) super.createDialogArea(parent);
		cmp.setLayout(new GridLayout(3, false));

		new Label(cmp, SWT.NONE).setText(Messages.SelectParameterDialog_1);

		cmb = new Combo(cmp, SWT.READ_ONLY);
		getCompatibleParameters();

		cmb.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				prm = parameters.get(cmb.getText());
				wdef.setExpression((JRDesignExpression) prm.getDefaultValueExpression());
				JaspersoftStudioPlugin.getExtensionManager().refreshICUI(prm);
			}
		});

		prm = parameters.get(cmb.getText());
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 300;
		cmb.setLayoutData(gd);

		Button bnew = new Button(cmp, SWT.PUSH);
		bnew.setText(Messages.SelectParameterDialog_2);
		bnew.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				ParameterDialog d = new ParameterDialog(cmb.getShell());
				if (d.open() == Dialog.OK) {
					prm = new JRDesignParameter();
					prm.setName(d.getPname());
					prm.setValueClassName(getDefaultParameterType());

					cmb.add(prm.getName());
					cmb.setText(prm.getName());
					parameters.put(prm.getName(), prm);
					addParameter();

					wdef.setExpression((JRDesignExpression) prm.getDefaultValueExpression());
					JaspersoftStudioPlugin.getExtensionManager().refreshICUI(prm);
				}
			}
		});

		new Label(cmp, SWT.NONE).setText(Messages.SelectParameterDialog_5);

		wdef = new WTextExpression(cmp, SWT.NONE);
		if (prm != null)
			wdef.setExpression((JRDesignExpression) prm.getDefaultValueExpression());
		ExpressionContext exprContext = new ExpressionContext(dataset, designer.getjConfig());
		wdef.addModifyListener(new ExpressionModifiedListener() {

			@Override
			public void expressionModified(ExpressionModifiedEvent event) {
				prm.setDefaultValueExpression(wdef.getExpression());
				dirty.add(prm);
			}
		});
		wdef.setExpressionContext(exprContext);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		wdef.setLayoutData(gd);

		Label sep = new Label(cmp, SWT.HORIZONTAL | SWT.SEPARATOR);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		sep.setLayoutData(gd);

		JaspersoftStudioPlugin.getExtensionManager().createParameterICUI(cmp, prm, designer);

		return cmp;
	}

	class ParameterDialog extends ATitledDialog {
		private String pname;

		protected ParameterDialog(Shell parentShell) {
			super(parentShell);
			setTitle(Messages.SelectParameterDialog_3);
		}

		public String getPname() {
			return pname;
		}

		protected Control createDialogArea(Composite parent) {
			pname = "Parameter"; //$NON-NLS-1$
			Composite cmp = (Composite) super.createDialogArea(parent);
			cmp.setLayout(new GridLayout(2, false));

			new Label(cmp, SWT.NONE).setText(Messages.SelectParameterDialog_4);

			final Text txt = new Text(cmp, SWT.BORDER);
			txt.setText(pname);
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.widthHint = 300;
			txt.setLayoutData(gd);
			txt.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					String t = txt.getText();
					if (t.isEmpty()) {
						setError(Messages.SelectParameterDialog_6);
						getButton(IDialogConstants.OK_ID).setEnabled(false);
						return;
					}
					for (JRParameter item : dataset.getParametersList())
						if (t.equals(item.getName())) {
							setError(Messages.SelectParameterDialog_7);
							getButton(IDialogConstants.OK_ID).setEnabled(false);
							return;
						}
					setError(null);
					getButton(IDialogConstants.OK_ID).setEnabled(true);
					pname = t;
				}
			});
			UIUtils.getDisplay().asyncExec(new Runnable() {
				public void run() {
					for (JRParameter item : dataset.getParametersList())
						if (txt.getText().equals(item.getName())) {
							setError(Messages.SelectParameterDialog_7);
							getButton(IDialogConstants.OK_ID).setEnabled(false);
						}
				}
			});
			return cmp;
		}
	}
}
