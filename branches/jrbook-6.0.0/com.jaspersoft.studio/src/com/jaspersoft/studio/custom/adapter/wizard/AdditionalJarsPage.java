/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.custom.adapter.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.preferences.editor.table.TableLabelProvider;
import com.jaspersoft.studio.swt.widgets.table.ListContentProvider;
import com.jaspersoft.studio.wizards.JSSHelpWizardPage;

/**
 * Wizard step to provide additional jars to the plugin project
 * 
 * @author Orlandin Marco
 *
 */
public class AdditionalJarsPage extends JSSHelpWizardPage {

	/**
	 * Viewer of the table where the added jars are shown
	 */
	private TableViewer tableViewer;
	
	/**
	 * List of the paths to the added jar
	 */
	private List<String> jarPaths;
	
	public AdditionalJarsPage() {
		super("additionaljarpage"); //$NON-NLS-1$
		setTitle(Messages.AdditionalJarsPage_wizardTitle);
		setDescription(Messages.AdditionalJarsPage_wizardDescription);
		jarPaths = new ArrayList<String>();
	}

	/**
	 * Create a table with one column where the path of all the added jars are
	 * shown. Create also two buttons to add or delete existing jars from the list
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));

		buildTable(composite);
		
		Composite bGroup = new Composite(composite, SWT.NONE);
		bGroup.setLayout(new GridLayout(1, false));
		bGroup.setLayoutData(new GridData(GridData.FILL_VERTICAL));
		bGroup.setBackground(parent.getBackground());
		//create the button to add a new jar
		final Button bnew = new Button(bGroup, SWT.PUSH);
		bnew.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				FileDialog fd = new FileDialog(getShell(), SWT.OPEN);
				fd.setText(Messages.common_open);
				String[] filterExt = { "*.jar" }; //$NON-NLS-1$ 
				fd.setFilterExtensions(filterExt);
				String selected = fd.open();
				if (selected != null && !jarPaths.contains(selected)) {
					jarPaths.add(selected);
					tableViewer.refresh();
				}
			}
		});
		bnew.setText(Messages.common_add);
		bnew.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		//create the button to delete a jar
		final Button deleteButton = new Button(bGroup, SWT.PUSH);
		deleteButton.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				int index = tableViewer.getTable().getSelectionIndex();
				if (index != -1){
					jarPaths.remove(index);
					tableViewer.refresh();
				}
			}
		});
		deleteButton.setText(Messages.common_delete);
		deleteButton.setEnabled(false);
		deleteButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		//listener to enable the delete button only where there is something selected inside the table
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				int selectionIndex = tableViewer.getTable().getSelectionIndex();
				deleteButton.setEnabled(selectionIndex != -1);
			}
		});
		tableViewer.setInput(jarPaths);
		setControl(composite);
	}
	
	@Override
	protected String getContextName() {
		return null;
	}

	/**
	 * Create the table control
	 * 
	 * @param composite composite where the table is placed
	 */
	private void buildTable(Composite composite) {
		Table table = new Table(composite, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.minimumHeight = 300;
		gd.minimumWidth = 400;
		table.setLayoutData(gd);
		table.setHeaderVisible(false);
		table.setLinesVisible(true);

		tableViewer = new TableViewer(table);
		attachContentProvider(tableViewer);
		attachLabelProvider(tableViewer);

		TableLayout tlayout = new TableLayout();
		tlayout.addColumnData(new ColumnWeightData(100));
		table.setLayout(tlayout);

		TableColumn[] column = new TableColumn[1];
		column[0] = new TableColumn(table, SWT.NONE);

		for (int i = 0, n = column.length; i < n; i++)
			column[i].pack();

	}

	private void attachLabelProvider(TableViewer viewer) {
		viewer.setLabelProvider(new TableLabelProvider());
	}

	private void attachContentProvider(TableViewer viewer) {
		viewer.setContentProvider(new ListContentProvider());
	}
	
	/**
	 * Return a not null list  of the path of the jars to add to the project
 	 * 
	 * @return a not null list of jars absolute path in the filesystem
	 */
	public List<String> getValues(){
		if (jarPaths == null) jarPaths = new ArrayList<String>();
		return jarPaths;
	}

}
