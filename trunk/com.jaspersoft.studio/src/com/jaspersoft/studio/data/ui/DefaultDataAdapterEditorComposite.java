/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.data.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import com.jaspersoft.studio.data.DataAdapter;

public class DefaultDataAdapterEditorComposite extends Composite {
	
	private WizardPage wizardPage = null;
	private DataAdapter dataAdapter = null;
	private TableViewer tableViewer;
	private Table table;
	private TableViewerColumn propertyViewerColumn;
	private TableViewerColumn valueViewerColumn;
	private Button addButton;
	private Button deleteButton;

  //The data model
	private java.util.List<String[]> rows;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 * @param wizardPage
	 */
	public DefaultDataAdapterEditorComposite(Composite parent, int style, WizardPage wizardPage) {
		
		/*
		 * UI ELEMENTS
		 */
		super(parent, style);
		setLayout(new GridLayout(2, false));
		
	  // data model init
		rows = new ArrayList<String[]>();
		
		// wizardPage init
		this.wizardPage = wizardPage;
		
		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		tableViewer.setContentProvider(new DefaultContentProvider());
		tableViewer.setInput(rows);
		
		table = tableViewer.getTable();
		GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_table.minimumWidth = 200;
		table.setLayoutData(gd_table);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		propertyViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		propertyViewerColumn.getColumn().setMoveable(true);
		propertyViewerColumn.getColumn().setWidth(100);
		propertyViewerColumn.getColumn().setText("Property");
		propertyViewerColumn.setLabelProvider(new ColumnPropertyValueLabelProvider(0));
		propertyViewerColumn.setEditingSupport(new PropertyValueEditingSupport(tableViewer, 0));
		
		valueViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		valueViewerColumn.getColumn().setMoveable(true);
		valueViewerColumn.getColumn().setWidth(100);
		valueViewerColumn.getColumn().setText("Value");
		valueViewerColumn.setLabelProvider(new ColumnPropertyValueLabelProvider(1));
		valueViewerColumn.setEditingSupport(new PropertyValueEditingSupport(tableViewer, 1));
		
		Composite buttonComposite = new Composite(this, SWT.NONE);
		GridLayout gl_buttonComposite = new GridLayout(1, false);
		gl_buttonComposite.marginWidth = 0;
		gl_buttonComposite.marginHeight = 0;
		buttonComposite.setLayout(gl_buttonComposite);
		buttonComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		
		addButton = new Button(buttonComposite, SWT.NONE);
		GridData gd_addButton = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_addButton.widthHint = 100;
		addButton.setLayoutData(gd_addButton);
		addButton.setText("Add");
		
		deleteButton = new Button(buttonComposite, SWT.NONE);
		GridData gd_deleteButton = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_deleteButton.widthHint = 100;
		deleteButton.setLayoutData(gd_deleteButton);
		deleteButton.setText("Delete");
		deleteButton.setEnabled(false);
		
		/*
		 * UI ELEMENTS LISTENERS
		 */
	  // add an entry and set selection on it
		addButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				rows.add(createDataModelEntry());
				
				// tableViewer.addPostSelectionChangedListener can't cover
				// the first row added, so we need to manually set delete
				// button enabled for this case.
				if (rows.size() == 1) {
					deleteButton.setEnabled(true);
				}
				
				tableViewer.refresh();
				setTableSelection(-1);
			}
		});
		
	  // delete selected entries and set selection on last table item
		deleteButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				removeEntries();
			}
		});
		
	  // keyboard listener
		table.addKeyListener(new KeyListener() {
			
			public void keyReleased(KeyEvent e) {
				// nothing
			}

			public void keyPressed(KeyEvent e) {
				
				if (e.character == SWT.DEL) {
					removeEntries();
				}
			}
		});
		
	  // When no table items,
		// turns the delete button disabled
		tableViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			
			public void selectionChanged(SelectionChangedEvent event) {
				if (rows.size() <= 0) {
					deleteButton.setEnabled(false);
				} else {
					deleteButton.setEnabled(true);
				}
			}
		});
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	/**
	 * Set the DataAdapter and initial values for UI elements.
	 * @param dataAdapter
	 */
	public void setDataAdapter(DataAdapter dataAdapter) {
		
		this.dataAdapter = dataAdapter;
		
		Map<String, String> map = new HashMap<String, String>();
		map = this.dataAdapter.getProperties();
		
		if (map.size() > 0) {
			String[] keys = new String[map.size()];
			Iterator<String> it = map.keySet().iterator();
			
			int i=0;
			while (it.hasNext())
			{
				keys[i] = it.next();
				i++;
			}
			Arrays.sort(keys);
			
			for (String key : keys)
			{
				rows.add( new String[]{key, map.get(key)} );
			}
			
			tableViewer.refresh();
			setTableSelection(-1);
			deleteButton.setEnabled(true);
		}
	}

	/**
	 * Get the DataAdapter with the values from the UI elements.
	 * @return dataAdapter
	 */
	public DataAdapter getDataAdapter() {
		
		if(dataAdapter == null){
		 // dataAdapter should never be null
		}
		
		Map<String, String> map = new HashMap<String, String>();
		for (String[] row : rows) {
			map.put(row[0], row[1]);
		}
		dataAdapter.loadProperties(map);
		
		return dataAdapter;
	}

	/**
	 * Return the HelpContextID
	 * @return String helpContextID
	 */
	public String getHelpContextId() {
		return "";
	}
	
	/**
	 * Content provider for DefaultDataAdapterComposite TableViewer
	 * @author czhu
	 *
	 */
  private class DefaultContentProvider implements IStructuredContentProvider {

		public void dispose() {
			// nothing
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// nothing
		}

		public Object[] getElements(Object inputElement) {
			if (inputElement != null && inputElement instanceof List)
				return ((List<?>) inputElement).toArray();
			return new Object[0];
		}
  }
  
  /**
	 * Extended ColumnLabelProvider
	 * @author czhu
	 *
	 */
	private class ColumnPropertyValueLabelProvider extends ColumnLabelProvider {

		private int columnIndex;
		
		private ColumnPropertyValueLabelProvider(int columnIndex) {
			this.columnIndex = columnIndex;
		}
		
		@Override
		public String getText(Object element) {
			String[] row = (String[]) element;
			return row[columnIndex].toString();
		}
	}
	
	/**
	 * Extended EditingSupport
	 * @author czhu
	 *
	 */
	private class PropertyValueEditingSupport extends EditingSupport {
		
		private final TableViewer viewer;
		private int columnIndex;

		public PropertyValueEditingSupport(TableViewer viewer, int columnIndex) {
			super(viewer);
			this.viewer = viewer;
			this.columnIndex = columnIndex;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			
			final TextCellEditor textCellEditor = new TextCellEditor(viewer.getTable());
			
			textCellEditor.addListener(new ICellEditorListener() {
				
				public void editorValueChanged(boolean oldValidState, boolean newValidState) {
					
					if (wizardPage != null) {
						
						String str = textCellEditor.getValue().toString().trim();
						
						if (isPropertyValid(str)) {
							wizardPage.setMessage(null);
						} else {
							
							if (str.length() > 0) {
								wizardPage.setMessage("Property \"" + str + "\" already exists. Please specify another name.", IMessageProvider.ERROR);
							} else {
								wizardPage.setMessage("Please specify a name for this property.", IMessageProvider.ERROR);
							}
						}
					}
				}
				
				public void cancelEditor() {
					// nothing
				}
				
				public void applyEditorValue() {

					// clean any left message
					if (wizardPage != null) {
						wizardPage.setMessage(null);
					}
				}
			});
			
			return textCellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			return ((String[])element)[columnIndex].toString();
		}

		@Override
		protected void setValue(Object element, Object value) {
			
			String str = (String.valueOf(value));
			
			if (columnIndex == 0) { // 0 = index of Property Column
				
				if (isPropertyValid(str)) {
					
					((String[]) element)[columnIndex] = str;
					viewer.refresh();
				}
			} else if (columnIndex == 1) { // 1 = index of Value Column
				
				((String[]) element)[columnIndex] = str;
				viewer.refresh();
			}
		}
	}
	
	/**
	 * This creates and returns a new entry for the data model
	 * @return String[]{Name, Value}
	 */
	private String[] createDataModelEntry() {
		
		int i = 0;
		String property = "PROPERTY_" + i;
		
		while (!isPropertyValid(property)) {
			i++;
			property = "PROPERTY_" + i;
		}
		
		return new String[]{property, ""};
	}
	
	/**
	 * Removes selected entries from the data model
	 */
	private void removeEntries() {
		
		int[] indices = table.getSelectionIndices();
		
		if (indices.length > 0) {
			
			Arrays.sort(indices);
			int removedItems = 0;

			for (int i : indices) {	
				// To prevent an IndexOutOfBoundsException
				// we need to subtract number of removed items
				// from the removed item index.
				rows.remove(i - removedItems);
				removedItems++;
			}
			tableViewer.refresh();
			setTableSelection(indices[0]);
		}
	}
	
	/**
	 * This set selection to the table's item represented by the given index.
	 * Any index out of table's range will select the last item.
	 * @param index
	 */
	private void setTableSelection(int index) {
		
		if (rows != null && rows.size() > 0) {
			
			if (index == 0) {
				table.setSelection(index);
			} else if ((0 < index) && (index < rows.size() - 1)) {
				table.setSelection(index - 1);
			} else {
				table.setSelection(rows.size() - 1);
			}
		}
	}
	
	/**
	 * Check the validity of the property name.
	 * It is valid only if it is not null, not empty
	 * and not already existed.
	 * @param string
	 * @return true or false
	 */
	private boolean isPropertyValid(String property) {
		
		if (property == null || "".equals(property)) return false;
		
		for (String[] row : rows) {
			if (row[0].equals(property)) {
				return false;
			}
		}
		
		return true;
	}
}
