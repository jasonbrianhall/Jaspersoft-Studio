/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.model.parameter;

import java.text.MessageFormat;

import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.design.JRDesignDataset;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.property.descriptors.AbstractJSSCellEditorValidator;
import com.jaspersoft.studio.utils.ModelUtils;

/**
 * Validator to check if a name for a parameter name is valid. It is valid essentially if it 
 * is unique. If it is not then an error message is returned
 * 
 * @author Orlandin Marco
 *
 */
public class ParameterNameValidator extends AbstractJSSCellEditorValidator {
	
	/**
	 * The object must be the new name for the parameter, and using the target check if there are other parameters
	 * with the same name
	 */
	@Override
	public String isValid(Object value) {
		JRDesignDataset d = ModelUtils.getDataset(getTarget());
		if (d !=null ){
			JRParameter parameter = d.getParametersMap().get(value);
			if (parameter != null && getTarget().getValue() != parameter){
				String message = MessageFormat.format(Messages.VariableNameValidator_variableDuplicatedName, new Object[] { value });
				return message;
			}
		}
		return null;
	}

}
