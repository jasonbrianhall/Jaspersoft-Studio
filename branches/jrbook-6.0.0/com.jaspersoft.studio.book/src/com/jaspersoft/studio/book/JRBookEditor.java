/**
 * 
 */
package com.jaspersoft.studio.book;

import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.operations.UndoRedoActionGroup;
import org.eclipse.ui.part.EditorPart;

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
	
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		super.init(site, editorInput);
		IWorkbench workbench = site.getWorkbenchWindow().getWorkbench();
		IUndoContext undoContext = workbench.getOperationSupport().getUndoContext();
		UndoRedoActionGroup historyActionGroup = new UndoRedoActionGroup(site, undoContext, true);
		historyActionGroup.fillActionBars(site.getActionBars());
	}

	@Override
	protected EditorPart getDesignEditor() {
		return designEditor;
	}

}
