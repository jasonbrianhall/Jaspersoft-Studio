package com.jaspersoft.studio.book.editors.actions;

import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.book.JRBookActivator;
import com.jaspersoft.studio.book.commands.RemoveChildrenCommand;
import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;
import com.jaspersoft.studio.editor.action.ACachedSelectionAction;

public class DeleteBookPartAction extends ACachedSelectionAction {

	public static final String ID = "delete_book_part";
	
	public DeleteBookPartAction(IWorkbenchPart part) {
		super(part);
	}

	@Override
	protected void init() {
		super.init();
		setText("Delete book part");
		setToolTipText("Delete Book Part");
		setId(ID);
		setImageDescriptor(JRBookActivator.getDefault().getImageDescriptor("/icons/delete.gif"));
		setEnabled(false);
	}
	
	@Override
	protected Command createCommand() {
		List<Object> parts = editor.getSelectionCache().getSelectionModelForType(MReportPart.class);
		CompoundCommand cc = new CompoundCommand();
		for(Object rawPart : parts){
			MReportPart part = (MReportPart)rawPart;
			RemoveChildrenCommand removeCommand = new RemoveChildrenCommand((MReportPartContainer)part.getParent(), part);
			cc.add(removeCommand);
		}
		return cc.isEmpty() ? null : cc;
	}

}
