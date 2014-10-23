/**
 * 
 */
package com.jaspersoft.studio.book;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.PartInitException;

import com.jaspersoft.studio.editor.AbstractJRXMLEditor;

/**
 * @author mrabbi
 *
 */
public class JRBookEditor extends AbstractJRXMLEditor {
	
	private JRBookDesignEditor designEditor;

	/* (non-Javadoc)
	 * @see com.jaspersoft.studio.editor.AbstractJRXMLEditor#createDesignEditorPage()
	 */
	@Override
	protected void createDesignEditorPage() throws PartInitException {
		designEditor = new JRBookDesignEditor(false);
		designEditor.setReportDetails(getMReport());
		int index = addPage(designEditor,getEditorInput());
		setPageText(index, "Design");
	}

	/* (non-Javadoc)
	 * @see com.jaspersoft.studio.editor.AbstractJRXMLEditor#getEditorHelpID()
	 */
	@Override
	protected String getEditorHelpID() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.jaspersoft.studio.editor.AbstractJRXMLEditor#isDesignerDirty()
	 */
	@Override
	protected boolean isDesignerDirty() {
		return designEditor.isDirty();
	}

	/* (non-Javadoc)
	 * @see com.jaspersoft.studio.editor.AbstractJRXMLEditor#getDesignerPageSelection()
	 */
	@Override
	protected ISelection getDesignerPageSelection() {
		return StructuredSelection.EMPTY;
	}

	/* (non-Javadoc)
	 * @see com.jaspersoft.studio.editor.AbstractJRXMLEditor#setDesignerPageSelection(org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	protected void setDesignerPageSelection(ISelection newSelection) {

	}

	/* (non-Javadoc)
	 * @see com.jaspersoft.studio.editor.AbstractJRXMLEditor#updateVisualView()
	 */
	@Override
	public void updateVisualView() {
		if(designEditor!=null){
			designEditor.setReportDetails(getMReport());
			designEditor.refreshEditor();
		}
	}

}
