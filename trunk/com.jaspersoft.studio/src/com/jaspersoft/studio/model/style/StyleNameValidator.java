/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.model.style;

import java.text.MessageFormat;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JasperDesign;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.property.descriptors.AbstractJSSCellEditorValidator;

/**
 * Validator to check if a name for a style name is valid. It is valid essentially if it 
 * is unique. If it is not then an error message is returned
 * 
 * @author Orlandin Marco
 *
 */
public class StyleNameValidator extends AbstractJSSCellEditorValidator {
	
	/**
	 * The object must be the new name for the variable, and using the target check if there are other styles with the same name
	 */
	@Override
	public String isValid(Object value) {
		JasperDesign d = getTarget().getJasperDesign();
		if (d !=null ){
			JRStyle style = d.getStylesMap().get(value);
			if (style != null && getTarget().getValue() != style){
				String message = MessageFormat.format(Messages.VariableNameValidator_variableDuplicatedName, new Object[] { value });
				return message;
			}
		}
		return null;
	}

}
