package com.jaspersoft.studio.property.dataset.dialog;

import java.util.List;

import net.sf.jasperreports.data.DataAdapterServiceUtil;
import net.sf.jasperreports.engine.JRQuery;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignField;
import net.sf.jasperreports.engine.design.JRDesignQuery;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;

import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.fields.IFieldsProvider;
import com.jaspersoft.studio.data.widget.DatasourceComboItem;
import com.jaspersoft.studio.data.widget.IDataAdapterRunnable;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.utils.Misc;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.UIUtils;

public abstract class DataQueryAdapters {
	private JRDesignDataset newdataset;
	private Color background;

	public DataQueryAdapters(Composite parent, JRDesignDataset newdataset, Color background) {
		createToolbar(parent);
		this.newdataset = newdataset;
		if (background != null)
			this.background = background;
		// else
		this.background = parent.getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND);
	}

	private Composite composite;
	private DatasourceComboItem dscombo;
	private Action gFields;
	private Combo langCombo;
	private String[] languages;
	private Composite langComposite;
	private StackLayout langLayout;
	private QDesignerFactory qdfactory;
	private CTabFolder tabFolder;

	public Composite getControl() {
		return composite;
	}

	public Composite getQueryControl() {
		return tabFolder;
	}

	public void createTop(Composite parent) {
		tabFolder = new CTabFolder(parent, SWT.TOP);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 150;
		tabFolder.setLayoutData(gd);
		// tabFolder.setBackground(background);

		createQuery(tabFolder);
		createMappingTools(tabFolder);

		tabFolder.setSelection(0);
	}

	private void createMappingTools(CTabFolder tabFolder) {
		new DataMappingFactory(tabFolder);
	}

	private void createQuery(CTabFolder tabFolder) {
		CTabItem bptab = new CTabItem(tabFolder, SWT.NONE);
		bptab.setText("Query");

		Composite sectionClient = new Composite(tabFolder, SWT.NONE);
		sectionClient.setLayout(new GridLayout(2, false));
		sectionClient.setBackground(background);

		Label label = new Label(sectionClient, SWT.NONE);
		label.setText("Language");
		label.setBackground(background);

		langCombo = new Combo(sectionClient, SWT.SINGLE | SWT.BORDER);
		languages = ModelUtils.getQueryLanguages();
		langCombo.setItems(languages);
		langCombo.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				changeLanguage();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		langCombo.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				String lang = langCombo.getText();
				int index = Misc.indexOf(languages, lang);
				if (index < 0) {
					languages[0] = lang;
					langCombo.setItem(0, lang);
					langCombo.select(0);
					changeLanguage();
				}
			}
		});

		langComposite = new Composite(sectionClient, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 2;
		langComposite.setLayoutData(gd);
		langLayout = new StackLayout();
		langComposite.setLayout(langLayout);
		langComposite.setBackground(background);

		qdfactory = new QDesignerFactory(langComposite);
		for (String lang : languages)
			qdfactory.getDesigner(lang);

		bptab.setControl(sectionClient);
	}

	private void changeLanguage() {
		langLayout.topControl = qdfactory.getDesigner(langCombo.getText()).getControl();
		langComposite.layout();
	}

	private void createToolbar(Composite parent) {
		ToolBar tb = new ToolBar(parent, SWT.FLAT | SWT.RIGHT);
		tb.setBackground(parent.getBackground());
		// tb.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		ToolBarManager manager = new ToolBarManager(tb);
		dscombo = new DatasourceComboItem(new IDataAdapterRunnable() {

			public void runReport(DataAdapterDescriptor da) {
				gFields.setEnabled(false);
				if (da instanceof IFieldsProvider && ((IFieldsProvider) da).supportsGetFieldsOperation()) {
					gFields.setEnabled(true);
					// TODO if auto gfields.run;
				}
			}

			public boolean isNotRunning() {
				// TODO Auto-generated method stub
				return true;
			}
		});
		gFields = new Action("Get &Fields") {
			// TODO run inside a job, modal with progress bar
			// FIXME, because, when cloning, eventSuport is not copied,
			public void run() {

				final String lang = langCombo.getText();
				final DataAdapterDescriptor da = dscombo.getSelected();
				if (da != null) {
					final String query = qdfactory.getDesigner(lang).getQuery();
					Job job = new Job("Use initiated job") {
						protected IStatus run(IProgressMonitor monitor) {
							try {
								JRDesignQuery jdq = new JRDesignQuery();
								jdq.setLanguage(lang);
								jdq.setText(query);
								newdataset.setQuery(jdq);

								final List<JRDesignField> fields = ((IFieldsProvider) da).getFields(DataAdapterServiceUtil.getDataAdapterService(da.getDataAdapter()),
										newdataset);
								if (fields != null) {
									Display.getDefault().asyncExec(new Runnable() {

										public void run() {
											setFields(fields);
										}
									});

								}
							} catch (UnsupportedOperationException e) {
								e.printStackTrace();
								UIUtils.showError(e);
							} catch (Exception e) {
								e.printStackTrace();
								UIUtils.showError(e);
							}
							return Status.OK_STATUS;
						}
					};
					job.setPriority(Job.SHORT);

					job.schedule();
				}
			}
		};
		gFields.setEnabled(false);

		Action alabel = new Action("Data Adapters") {
		};
		alabel.setEnabled(false);
		manager.add(alabel);
		manager.add(dscombo);
		manager.add(gFields);

		manager.update(true);
		tb.pack();
	}

	public void setDataset(JRDesignDataset ds) {
		JRQuery query = ds.getQuery();
		if (query != null) {
			int langindex = Misc.indexOf(languages, query.getLanguage());
			if (langindex >= 0)
				langCombo.select(langindex);
			else
				langCombo.setItem(0, query.getLanguage());
			changeLanguage();
			qdfactory.getDesigner(query.getLanguage()).setQuery(query.getText());
		}
	}

	public String getLanguage() {
		int langind = langCombo.getSelectionIndex();
		if (langind >= 0 && langind < languages.length)
			langind = 0;
		return languages[langind];

	}

	public String getQuery() {
		return qdfactory.getDesigner(langCombo.getText()).getQuery();
	}

	public abstract void setFields(List<JRDesignField> fields);

	public void setDefaultDataAdapter(MReport mreport) {
		if (mreport != null) {
			Object obj = mreport.getParameter(MReport.DEFAULT_DATAADAPTER);
			if (obj != null && obj instanceof DataAdapterDescriptor) {
				dscombo.setSelected((DataAdapterDescriptor) obj);
				if (obj instanceof IFieldsProvider)
					gFields.setEnabled(true);
			}
		}
	}
}
