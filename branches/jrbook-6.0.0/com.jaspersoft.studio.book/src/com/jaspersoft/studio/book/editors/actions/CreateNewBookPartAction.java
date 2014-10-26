package com.jaspersoft.studio.book.editors.actions;

import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignPart;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.book.commands.CreatePartCommand;
import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;
import com.jaspersoft.studio.editor.outline.actions.ACreateAndSelectAction;
import com.jaspersoft.studio.editor.outline.part.NotDragableTreeEditPart;

public class CreateNewBookPartAction extends ACreateAndSelectAction {

	public static final String ID = "create_book_part";
	
	public CreateNewBookPartAction(IWorkbenchPart part) {
		super(part);
	}

	@Override
	protected void init() {
		super.init();
		setText("Add new book part");
		setToolTipText("Add new book part");
		setId(ID);
		setEnabled(false);
	}
	
	@Override
	protected boolean calculateEnabled() {
		return true;
	}
	
	@Override
	public void run() {
		ISelection s = getSelection();
		if (s instanceof StructuredSelection) {
			Object obj = ((StructuredSelection) s).getFirstElement();
			if(obj instanceof NotDragableTreeEditPart) {
				if (((NotDragableTreeEditPart) obj).getModel() instanceof MReportPartContainer) {
					MReportPartContainer container = (MReportPartContainer) ((NotDragableTreeEditPart) obj).getModel();
					JRDesignPart newBookPart = MReportPart.createJRElement(new JRDesignExpression("TEST THIS"));
					MReportPart newReportPart = new MReportPart(container, newBookPart, -1);
					getCommandStack().execute(new CreatePartCommand(container, newBookPart, -1));
				}
			}
		}

	}

}
