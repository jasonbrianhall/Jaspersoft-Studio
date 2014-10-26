package com.jaspersoft.studio.book.editors;

import org.eclipse.gef.EditPart;

import com.jaspersoft.studio.book.editparts.BookPagesEditPart;
import com.jaspersoft.studio.book.editparts.BookReportEditPart;
import com.jaspersoft.studio.book.editparts.BookSectionEditPart;
import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;
import com.jaspersoft.studio.editor.AEditPartFactory;
import com.jaspersoft.studio.model.MReport;

public class BookEditPartFactory extends AEditPartFactory {

	@Override
	protected EditPart createEditPart(Object model) {
		if (model instanceof MReportPart){
			return new BookPagesEditPart();
		} else if (model instanceof MReportPartContainer){
			return new BookSectionEditPart();
		} else if (model instanceof MReport){
			return new BookReportEditPart((MReport)model);
		}
		return null;
	}

}
