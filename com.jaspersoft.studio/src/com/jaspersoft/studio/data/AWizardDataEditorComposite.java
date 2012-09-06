package com.jaspersoft.studio.data;

import java.util.List;

import net.sf.jasperreports.engine.design.JRDesignField;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;



public abstract class AWizardDataEditorComposite extends Composite {

	
	/**
	 * This method returns a compisite which implements the editor itself.
	 * The editor can totally control what's going on in the wizard page and control the
	 * state of the wizard buttons by using page.setPageCompleted( )
	 *
	 * @param Composite parent - the parent composite
	 * @param WizardPage page - the page used to show the composite, it can be used to access the nested Wizard (probably JSSWizard)
	 *
	 * @return an editor composite extending AWizardDataEditorComposite
	 */
	public AWizardDataEditorComposite(Composite parent, WizardPage page)
	{
			super( parent, SWT.NONE );
	}
	
	
	/**
	 * The editor may be used to edit a query, in this case the wizard may be interested
	 * in getting the query and its language.
	 * 
	 * Subclasses should implement this method to return the proper query
	 * 
	 * @return the query or null if this editor does not work with a language
	 */
	public abstract String getQueryString();
	
	
	/**
	 * The editor may be used to edit a query, in this case the wizard may be interested
	 * in getting the query and its language.
	 * 
	 * Subclasses should implement this method to return the proper language
	 * 
	 * @return the language or null if this editor does not work with a language
	 */
	public abstract String getQueryLanguage();
	
	
  /**
   * Return the fields read from the selected data adapter...
   * This operation is run on a thread which is not in the UI event thread, so
   * no UI update should be performed without using a proper async thread.
   * 
   * return a list of JRDesignField or null if no fields have been read
   */
  public abstract List<JRDesignField> readFields() throws Exception;

	
}
