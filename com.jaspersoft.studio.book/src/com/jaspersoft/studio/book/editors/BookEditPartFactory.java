package com.jaspersoft.studio.book.editors;

import org.eclipse.gef.EditPart;

import com.jaspersoft.studio.editor.AEditPartFactory;
import com.jaspersoft.studio.editor.gef.parts.FigureEditPart;

public class BookEditPartFactory extends AEditPartFactory {

	@Override
	protected EditPart createEditPart(Object model) {
		return new FigureEditPart();
	}

}
