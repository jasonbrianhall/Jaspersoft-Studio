/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.editor.preview.view.control;

import java.lang.reflect.InvocationTargetException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.eclipse.util.xml.SourceLocation;

import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.PlatformUI;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.preview.stats.Statistics;
import com.jaspersoft.studio.editor.preview.view.APreview;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.preferences.editor.table.TableLabelProvider;
import com.jaspersoft.studio.swt.widgets.table.ListContentProvider;
import com.jaspersoft.studio.utils.ErrorUtil;
import com.jaspersoft.studio.utils.Misc;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class VErrorPreview extends APreview {

	private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

	public VErrorPreview(Composite parent, JasperReportsConfiguration jContext) {
		super(parent, jContext);
	}

	private Label compilationTime;
	private Label fillingTime;
	private Label exportTime;
	private Label execTime;
	private Label totalPages;
	private Label fillSize;
	private Label recordCount;
	private Text tmessage;
	private Text terror;
	private StackLayout stackLayout;
	private Composite body;
	private Composite errorsComposite;
	private Composite statComposite;
	private TableViewer errorViewer;
	private ArrayList<String> errorList;
	private ToolBarManager tbManager;
	private Action errAction;
	private Action statAction;
	private Action msgAction;

	@Override
	public Control createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		container.setLayout(layout);

		ToolBar topToolBar = new ToolBar(container, SWT.FLAT | SWT.WRAP | SWT.RIGHT);
		topToolBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		tbManager = new ToolBarManager(topToolBar);
		msgAction = new Action("Console") { //$NON-NLS-1$
			@Override
			public void run() {
				stackLayout.topControl = tmessage;
				body.layout();
			}
		};
		tbManager.add(msgAction);
		errAction = new Action(Messages.VErrorPreview_errorsLabel) {
			@Override
			public void run() {
				stackLayout.topControl = errorsComposite;
				body.layout();
			}
		};

		tbManager.add(errAction);

		statAction = new Action(Messages.VErrorPreview_statisticsLabel) {
			@Override
			public void run() {
				stackLayout.topControl = statComposite;
				body.layout();
			}
		};
		tbManager.add(statAction);
		tbManager.update(true);
		topToolBar.pack();

		body = new Composite(container, SWT.NONE);
		body.setLayoutData(new GridData(GridData.FILL_BOTH));
		stackLayout = new StackLayout();
		stackLayout.marginWidth = 0;
		stackLayout.marginHeight = 0;
		body.setLayout(stackLayout);

		createMessages(body);

		createErrors(body);

		createStatistics(body);

		// container.addControlListener(new ControlAdapter() {
		// public void controlResized(ControlEvent e) {
		// Rectangle r = parent.getClientArea();
		// sc.setMinSize(parent.computeSize(r.width, SWT.DEFAULT));
		// }
		// });

		stackLayout.topControl = tmessage;
		body.layout();
		PlatformUI.getWorkbench().getHelpSystem().setHelp(container, "com.jaspersoft.studio.doc.view_reportstate"); //$NON-NLS-1$

		return container;
	}

	public void setFocus() {
		body.setFocus();
	}

	protected void createMessages(Composite composite) {
		tmessage = new Text(composite, SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
	}

	protected void createErrors(Composite composite) {
		errorsComposite = new Composite(composite, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		errorsComposite.setLayout(layout);

		CTabFolder tabFolder = new CTabFolder(errorsComposite, SWT.BOTTOM);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));

		CTabItem itemTbl = new CTabItem(tabFolder, SWT.NONE);
		itemTbl.setText(Messages.VErrorPreview_tableLabel);

		final Table wtable = new Table(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL | SWT.SINGLE | SWT.FULL_SELECTION
				| SWT.BORDER);
		wtable.setLayoutData(new GridData(GridData.FILL_BOTH));
		wtable.setHeaderVisible(false);
		wtable.setLinesVisible(true);
		wtable.addListener(SWT.MouseDoubleClick, new Listener() {

			public void handleEvent(Event event) {
				int sindex = wtable.getSelectionIndex();
				if (sindex < 0 || sindex > errors.size())
					return;
				Object e = errors.get(sindex);
				if (e instanceof Throwable)
					UIUtils.showError((Throwable) e);

			}
		});

		TableColumn[] col = new TableColumn[3];
		col[0] = new TableColumn(wtable, SWT.NONE);
		col[0].setText(Messages.VErrorPreview_fieldNameLabel);
		col[0].pack();

		TableLayout tlayout = new TableLayout();
		tlayout.addColumnData(new ColumnWeightData(100, false));
		wtable.setLayout(tlayout);

		errorViewer = new TableViewer(wtable);
		errorViewer.setContentProvider(new ListContentProvider());
		errorViewer.setLabelProvider(new TableLabelProvider() {
			@Override
			public Image getColumnImage(Object element, int columnIndex) {
				return JaspersoftStudioPlugin.getInstance().getImage("icons/resources/eclipse/obj16/error_tsk.gif"); //$NON-NLS-1$
			}
		});

		CTabItem itemText = new CTabItem(tabFolder, SWT.NONE);
		itemText.setText(Messages.VErrorPreview_textLabel);
		terror = new Text(tabFolder, SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
		itemText.setControl(terror);

		itemTbl.setControl(wtable);

		tabFolder.setSelection(itemTbl);
	}

	private void createStatistics(Composite parent) {
		statComposite = new Composite(parent, SWT.BORDER);
		statComposite.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		statComposite.setBackgroundMode(SWT.INHERIT_FORCE);

		GridLayout layout = new GridLayout(3, false);
		layout.marginLeft = 20;
		layout.horizontalSpacing = 3;
		statComposite.setLayout(layout);

		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_compilationTimeLabel);

		compilationTime = new Label(statComposite, SWT.BOLD);
		compilationTime.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		com.jaspersoft.studio.utils.UIUtil.setBold(compilationTime);
		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_secLabel);

		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_fillingTimeLabel);

		fillingTime = new Label(statComposite, SWT.BOLD);
		fillingTime.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		com.jaspersoft.studio.utils.UIUtil.setBold(fillingTime);
		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_secLabel);

		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_exectutionTimeLabel);

		execTime = new Label(statComposite, SWT.BOLD);
		execTime.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		com.jaspersoft.studio.utils.UIUtil.setBold(execTime);
		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_secLabel);

		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_exportTimeLabel);

		exportTime = new Label(statComposite, SWT.BOLD);
		exportTime.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		com.jaspersoft.studio.utils.UIUtil.setBold(exportTime);
		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_secLabel);

		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_totalPagesLabel);

		totalPages = new Label(statComposite, SWT.BOLD);
		totalPages.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		com.jaspersoft.studio.utils.UIUtil.setBold(totalPages);
		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_pagesLabel);

		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_processedRecordsLabel);

		recordCount = new Label(statComposite, SWT.BOLD);
		recordCount.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		com.jaspersoft.studio.utils.UIUtil.setBold(recordCount);
		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_recordsLabel);

		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_fillSizeLabel);

		fillSize = new Label(statComposite, SWT.BOLD);
		fillSize.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		com.jaspersoft.studio.utils.UIUtil.setBold(fillSize);
		new Label(statComposite, SWT.NONE).setText(Messages.VErrorPreview_bytesLabel);

		setStats(null);
	}

	public void setStats(Statistics stats) {
		if (stats != null) {
			compilationTime.setText("" + format(stats.getDuration(ReportControler.ST_COMPILATIONTIME))); //$NON-NLS-1$
			fillingTime.setText("" + format(stats.getDuration(ReportControler.ST_FILLINGTIME))); //$NON-NLS-1$
			exportTime.setText("" + format(stats.getDuration(ReportControler.ST_EXPORTTIME))); //$NON-NLS-1$
			execTime.setText("" + format(stats.getDuration(ReportControler.ST_REPORTEXECUTIONTIME))); //$NON-NLS-1$

			totalPages.setText(Misc.nvl(stats.getValue(ReportControler.ST_PAGECOUNT), "0")); //$NON-NLS-1$
			recordCount.setText(Misc.nvl(stats.getValue(ReportControler.ST_RECORDCOUNTER), "-")); //$NON-NLS-1$
			fillSize.setText(Misc.nvl(stats.getValue(ReportControler.ST_REPORTSIZE), "0")); //$NON-NLS-1$
			statAction.run();
		} else {
			compilationTime.setText("-"); //$NON-NLS-1$
			fillingTime.setText("-"); //$NON-NLS-1$
			exportTime.setText("-"); //$NON-NLS-1$

			totalPages.setText("-"); //$NON-NLS-1$
			recordCount.setText("-"); //$NON-NLS-1$
			fillSize.setText("-"); //$NON-NLS-1$
		}
		statComposite.layout();
	}

	private static DecimalFormat df = new DecimalFormat("#.###");
	static {
		df.setRoundingMode(RoundingMode.HALF_UP);
	}

	public static String format(long time) {
		return df.format(((double) time) / 1000);
	}

	public void setMessage(String msg) {
		tmessage.setText(msg);
	}

	public void addMessage(String msg) {
		tmessage.setText(tmessage.getText() + msg + "\n"); //$NON-NLS-1$
		// textSection.setText("Console: " + msg);
	}

	public void addError(Throwable t) {
		if (t != null) {
			if (t instanceof InvocationTargetException)
				t = t.getCause();
			String msg = terror.getText() + ErrorUtil.getStackTrace(t) + NL;
			terror.setText(terror.getText() + msg + "\n"); //$NON-NLS-1$
			addError2List(t, t.getMessage());
			// errorSection.setText("Errors: 1");
		} else
			terror.setText(""); //$NON-NLS-1$
		refreshErrorTable();
	}

	protected void refreshErrorTable() {
		if (errorList.size() > 0)
			errAction.run();
		errAction.setText(Messages.VErrorPreview_errorsFoundLabel + errorList.size() + ")"); //$NON-NLS-2$
		errorViewer.refresh();
	}

	public void addProblem(CategorizedProblem problem, SourceLocation location) {
		addError2List(problem, problem.getMessage());
		refreshErrorTable();
	}

	public void addProblem(String message, SourceLocation location) {
		addError2List(message, message);
		refreshErrorTable();
	}

	private List<Object> errors = new ArrayList<Object>();

	private void addError2List(Object err, String message) {
		errors.add(err);
		if (message == null)
			message = Messages.VErrorPreview_noMessageLabel;
		String lines[] = message.split("\\r?\\n"); //$NON-NLS-1$
		if (lines.length > 0)
			message = lines[0];

		errorList.add(message);
	}

	public void clear() {
		errors.clear();
		msgAction.run();
		tmessage.setText(""); //$NON-NLS-1$
		errorList = new ArrayList<String>();
		errorViewer.setInput(errorList);
		setStats(null);
		addError(null);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

}
