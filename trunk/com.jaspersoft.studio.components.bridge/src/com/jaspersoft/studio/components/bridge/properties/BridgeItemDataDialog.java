/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * Licensed under commercial Jaspersoft Subscription License Agreement
 ******************************************************************************/
package com.jaspersoft.studio.components.bridge.properties;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignElementDataset;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import com.jaspersoft.jasperreports.bridge.BridgeItem;
import com.jaspersoft.jasperreports.bridge.BridgeItemData;
import com.jaspersoft.jasperreports.bridge.design.BridgeDesignItemData;
import com.jaspersoft.studio.components.bridge.messages.Messages;
import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.jface.dialogs.EditableDatasetBaseComposite;
import com.jaspersoft.studio.model.dataset.ComponentElementDatasetAdapter;
import com.jaspersoft.studio.model.dataset.ComponentElementDatasetRunAdapter;
import com.jaspersoft.studio.model.dataset.IEditableDatasetRun;
import com.jaspersoft.studio.property.dataset.DatasetRunSelectionListener;
import com.jaspersoft.studio.swt.widgets.NumberedLabelProvider;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

/**
 * Edit dialog to modify a {@link BridgeItemData} instance.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class BridgeItemDataDialog extends Dialog {

	private TabFolder tabfolder;
	private JRDesignElementDataset dataset;
	private JasperReportsConfiguration jconfig;
	private ExpressionContext defaultExpressionContext;
	private BridgeDesignItemData itemData;
	private EditableDatasetBaseComposite compositeDatasetInfo;
	private Button useDatasetBtn;
	private TableViewer itemsTV;
	private NumberedLabelProvider lblProv;
	private Button btnAddItem;
	private Button btnModifyItem;
	private Button btnRemoveItem;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public BridgeItemDataDialog(Shell parentShell, BridgeItemData itemData, JasperReportsConfiguration jconfig) {
		super(parentShell);
		this.itemData = (BridgeDesignItemData) itemData;
		if(this.itemData == null){
			this.itemData = new BridgeDesignItemData();
		}
		this.dataset = (JRDesignElementDataset) this.itemData.getDataset();
		if(this.dataset==null){
			this.dataset = new JRDesignElementDataset();
		}
		this.jconfig = jconfig;
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		
		tabfolder = new TabFolder(container, SWT.NONE);
		GridData tabfolderGD = new GridData(SWT.FILL, SWT.FILL, true, true);
		tabfolderGD.heightHint = 150;
		tabfolder.setLayoutData(tabfolderGD);

		createDatasetTab(tabfolder);
		createElementsTab(tabfolder);

		return container;
	}

	private void createDatasetTab(TabFolder parentTFolder) {
		TabItem datasetTab = new TabItem(parentTFolder, SWT.NONE);
		Composite container = new Composite(parentTFolder,SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		datasetTab.setControl(container);
		datasetTab.setText(Messages.BridgeItemDataDialog_DatasetTab);
		
		useDatasetBtn = new Button(container,SWT.CHECK);
		useDatasetBtn.setText(Messages.BridgeItemDataDialog_UseDatasetBtn);
		useDatasetBtn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		useDatasetBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				toggleDatasetUsage(useDatasetBtn.getSelection());
			}
		});
		
	 	compositeDatasetInfo = new EditableDatasetBaseComposite(
				new ComponentElementDatasetAdapter(dataset, jconfig),container, SWT.NONE){
					@Override
					protected IEditableDatasetRun getEditableDatesetRun() {
						return new ComponentElementDatasetRunAdapter(this.getEditableDataset());
					}
		};
		compositeDatasetInfo.addDatasetRunSelectionListener(new DatasetRunSelectionListener() {
			public void selectionChanged() {
				ExpressionContext contextFromDSRun=getExpressionContextFromDSRun();
				compositeDatasetInfo.setExpressionContext(contextFromDSRun);
			}
		});
		compositeDatasetInfo.setExpressionContext(getExpressionContextFromDSRun());
		compositeDatasetInfo.setDefaultExpressionContext(defaultExpressionContext);
		compositeDatasetInfo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		useDatasetBtn.setSelection(this.itemData.getDataset()!=null);
		toggleDatasetUsage(this.itemData.getDataset()!=null);
	}
	
	private void createElementsTab(TabFolder parentTFolder) {
		TabItem elementsTab = new TabItem(parentTFolder, SWT.NONE);
		Composite container = new Composite(parentTFolder,SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		elementsTab.setControl(container);
		elementsTab.setText(Messages.BridgeItemDataDialog_ItemsTab);
		
		itemsTV = new TableViewer(container, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		itemsTV.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		lblProv = new NumberedLabelProvider(Messages.BridgeItemDataDialog_LblProviderPrefix);
		itemsTV.setLabelProvider(lblProv);
		itemsTV.setContentProvider(new ArrayContentProvider());
		itemsTV.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				modifyItemBtnPressed();
			}
		});
		
		btnAddItem = new Button(container, SWT.PUSH);
		btnAddItem.setText(Messages.BridgeItemDataDialog_Add);
		btnAddItem.setLayoutData(new GridData(SWT.FILL,SWT.TOP,false,false));
		btnAddItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addNewItemBtnPressed();
			}
		});

		btnModifyItem = new Button(container, SWT.PUSH);
		btnModifyItem.setText(Messages.BridgeItemDataDialog_Edit);
		btnModifyItem.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		btnModifyItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				modifyItemBtnPressed();
			}
		});
		
		btnRemoveItem = new Button(container, SWT.PUSH);
		btnRemoveItem.setText(Messages.BridgeItemDataDialog_Remove);
		btnRemoveItem.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		btnRemoveItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeItemBtnPressed();
			}
		});

		refreshItemsViewer();
	}
	
	private void addNewItemBtnPressed() {
		BridgeItemDialog d = new BridgeItemDialog(UIUtils.getShell(), null);
		d.setExpressionContext(getExpressionContextFromDSRun());
		if(d.open() == Window.OK) {
			BridgeItem bridgeItem = d.getBridgeItem();
			this.itemData.addItem(bridgeItem);
			refreshItemsViewer();
		}
	}
	
	private void modifyItemBtnPressed() {
		BridgeItem i = getCurrentSelectedItem();
		if(i!=null) {
			BridgeItemDialog d = new BridgeItemDialog(UIUtils.getShell(), (BridgeItem) i.clone());
			d.setExpressionContext(getExpressionContextFromDSRun());
			if(d.open() == Window.OK) {
				BridgeItem bridgeItem = d.getBridgeItem();
				int indexOf = this.itemData.getBridgeItems().indexOf(i);
				this.itemData.getBridgeItems().remove(indexOf);
				this.itemData.getBridgeItems().add(indexOf,bridgeItem);
				refreshItemsViewer();
			}
		}
	}
	
	private void removeItemBtnPressed() {
		BridgeItem i = getCurrentSelectedItem();
		if (i!=null) {
			this.itemData.getBridgeItems().remove(i);
			refreshItemsViewer();
		}		
	}

	private BridgeItem getCurrentSelectedItem() {
		Object selEl = ((IStructuredSelection) itemsTV.getSelection()).getFirstElement();
		if(selEl instanceof BridgeItem) {
			return (BridgeItem) selEl;
		}
		return null;
	}
	
	private void refreshItemsViewer() {
		lblProv.resetIndex();
		itemsTV.setInput(this.itemData.getBridgeItems());
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(Messages.BridgeItemDataDialog_Title);
		UIUtils.resizeAndCenterShell(newShell, 600, 600);
	}
	
	@Override
	protected void setShellStyle(int newShellStyle) {
		super.setShellStyle(newShellStyle | SWT.RESIZE);
	}
	
	public void setDefaultExpressionContext(ExpressionContext expContext){
		this.defaultExpressionContext = expContext;
	}

	private ExpressionContext getExpressionContextFromDSRun() {
		if(dataset!=null){
			JRDesignDataset ds = ModelUtils.getDesignDatasetForDatasetRun(
					jconfig.getJasperDesign(), dataset.getDatasetRun());
			return new ExpressionContext(ds,jconfig);
		}
		return null;
	}
	
	public BridgeItemData getBridgeItemData() {
		// fix the dataset reference
		this.itemData.setDataset(this.dataset);
		return this.itemData;
	}
	
	private void toggleDatasetUsage(boolean selection) {
		if(selection){
			this.dataset = new JRDesignElementDataset();
			((GridData)compositeDatasetInfo.getLayoutData()).exclude = false;
			compositeDatasetInfo.setVisible(true);
			compositeDatasetInfo.setEnabled(true);
		}
		else {
			compositeDatasetInfo.setEnabled(false);
			compositeDatasetInfo.setVisible(false);
			((GridData)compositeDatasetInfo.getLayoutData()).exclude = true;
			this.dataset = null;
		}
		compositeDatasetInfo.getParent().layout();
	}

}
