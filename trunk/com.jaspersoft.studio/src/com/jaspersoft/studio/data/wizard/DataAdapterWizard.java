package com.jaspersoft.studio.data.wizard;

import java.util.List;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.IPageChangingListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.dialogs.PageChangingEvent;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;

import com.jaspersoft.studio.data.DataAdapter;
import com.jaspersoft.studio.data.DataAdapterFactory;
import com.jaspersoft.studio.data.DataAdapterManager;
import com.jaspersoft.studio.data.wizard.pages.DataAdapterEditorPage;
import com.jaspersoft.studio.data.wizard.pages.DataAdaptersListPage;
import com.jaspersoft.studio.jface.dialogs.DataAdapterErrorDialog;

public class DataAdapterWizard extends Wizard implements SelectionListener {

	private DataAdapter dataAdapter                     = null;
	private DataAdapterWizardDialog wizardDialog        = null;
	private DataAdapterFactory selectedFactory          = null;
	private DataAdaptersListPage dataAdapterListPage    = null;
	private DataAdapterEditorPage dataAdapterEditorPage = null;

	/**
	 * This constructor will set the data adapter wizard.
	 * The data adapters list is displayed as first page,
	 * then the edit page is shown.
	 */
	public DataAdapterWizard() {
		setWindowTitle("DataAdapter Wizard");
	}
	
	/**
	 * Pass to this constructor a dataAdapter to be edited.
	 * This will set the wizard directly to edit page.
	 * 
	 * @param dataAdapter
	 */
	public DataAdapterWizard(DataAdapter dataAdapter) {
		this();
		this.dataAdapter = dataAdapter;
	}
	
	// WizardDialog Setter and Getter
	public void setWizardDialog(DataAdapterWizardDialog wizardDialog) {
		this.wizardDialog = wizardDialog;
		if(this.wizardDialog != null) {
			this.wizardDialog.addTestListener(this);

			this.wizardDialog.addPageChangingListener(new IPageChangingListener() {
				
				public void handlePageChanging(PageChangingEvent event) {
					System.out.println("Moving from page " + event.getCurrentPage() + " to " + event.getTargetPage());
					
					if (event.getCurrentPage() ==  dataAdapterListPage &&
							event.getTargetPage() == dataAdapterEditorPage)
					{
						// Update the layout of the editor page with the proper data adapter editor
						// provided by the new data adapter
						DataAdapterFactory factory = dataAdapterListPage.getSelectedFactory();
						
						// 1. instance a new dataAdapter using the factory
						DataAdapter newDataAdapter = factory.createDataAdapter();
						
						// 2. set in the wizard page the data adapter to edit
						if(selectedFactory != factory) {
							dataAdapterEditorPage.setDataAdapter(newDataAdapter);
							selectedFactory = factory;
						}
					}
				}
			});

		  // Enable the test button when the page activated is the dataAdapterEditorPage
			this.wizardDialog.addPageChangedListener(new IPageChangedListener() {
				
				public void pageChanged(PageChangedEvent event) {
					getWizardDialog().setTestButtonEnabled(event.getSelectedPage() == dataAdapterEditorPage);
				}
			});
		}
	}
	
	public DataAdapterWizardDialog getWizardDialog() {
		return wizardDialog;
	}

	@Override
	public void addPages() {
		
		if(dataAdapter == null) {
			dataAdapterListPage = new DataAdaptersListPage();
			addPage(dataAdapterListPage);
		}
		dataAdapterEditorPage = new DataAdapterEditorPage();
		addPage(dataAdapterEditorPage);

	}
	
	@Override
	public void createPageControls(Composite pageContainer)
	{
		super.createPageControls(pageContainer);
	  
		if (this.dataAdapter != null)
		{
			DataAdapter editedDataAdapter = DataAdapterManager.cloneDataAdapter( this.dataAdapter );
			dataAdapterEditorPage.setDataAdapter(editedDataAdapter);
		}
	}



	// Save the new adapter using the manager
	@Override
	public boolean performFinish() {
		DataAdapter editedDataAdapter = dataAdapterEditorPage.getDataAdapter();
		
		if (this.dataAdapter == null)
		{
			this.dataAdapter = editedDataAdapter;
		}
		else  // We are modifying an existing adapter....
		{
			// ... let's update with the adapter just modified ...
			this.dataAdapter.loadProperties(editedDataAdapter.getProperties());
			if (!this.dataAdapter.getName().equals( editedDataAdapter.getName() ))
			{
				if (isDataAdapterNameUnique(editedDataAdapter.getName()))
				{
					this.dataAdapter.setName(editedDataAdapter.getName());
				}
			}
			// ... but each DataAdapter has a unique name ...
			
		}
		return true;
	}

  public boolean isDataAdapterNameUnique(String dataAdapterName) {
		List<DataAdapter> dataAdapters = DataAdapterManager.getDataAdapters();
		for (DataAdapter dataAdapter : dataAdapters) {
			if (dataAdapterName.equals(dataAdapter.getName())) return false;
		}
		return true;
	}

	/**
   * This method is called when the test button is pressed
   */
	public void widgetSelected(SelectionEvent e) {
		if(getContainer().getCurrentPage() == dataAdapterEditorPage) {
			try {
				dataAdapterEditorPage.getDataAdapterEditor().getDataAdapter().test();
				
				MessageBox mb = new MessageBox(getContainer().getShell(), SWT.ICON_INFORMATION | SWT.OK);
        mb.setText("Test");
        mb.setMessage("Succesful");
        mb.open();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

        DataAdapterErrorDialog.showErrorDialog(
        							getWizardDialog().getShell(), 
        							"An error occurred while testing the data adapter and the test failed",
        							e1);
        
			}
		}
	}

	/**
	 * Returns the new data adapter (or the modified data adapter in case the wizard is used to edit an
	 * existing data adapter).
	 * It returns null (or the original data adapter) if the wizard has not been completed.
	 * The returned object is the same used in the constructor in case of editing.
	 * 
	 * @return
	 */
	public DataAdapter getDataAdapter()
	{
		return this.dataAdapter;
	}


	public void widgetDefaultSelected(SelectionEvent e) {
	}
}
