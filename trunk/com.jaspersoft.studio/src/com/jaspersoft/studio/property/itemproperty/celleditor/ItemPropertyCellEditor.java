/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.property.itemproperty.celleditor;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.properties.view.validation.ValidationError;
import com.jaspersoft.studio.property.descriptor.JSSDialogCellEditor;
import com.jaspersoft.studio.property.itemproperty.desc.ADescriptor;
import com.jaspersoft.studio.property.itemproperty.desc.DescriptorPropertyLabelProvider;
import com.jaspersoft.studio.property.itemproperty.dialog.ItemPropertyElementDialog;

import net.sf.jasperreports.components.items.StandardItemProperty;
import net.sf.jasperreports.eclipse.ui.util.UIUtils;

public class ItemPropertyCellEditor extends JSSDialogCellEditor {
	
	private String id;
	private ExpressionContext expContext;
	private ADescriptor descriptor;

	public ItemPropertyCellEditor(Composite parent, ExpressionContext expContext, String id, ADescriptor descriptor) {
		super(parent, true);
		this.expContext = expContext;
		this.id = id;
		this.descriptor = descriptor;
	}

	public ItemPropertyCellEditor(Composite parent, int style, ExpressionContext expContext, ADescriptor descriptor) {
		super(parent, style, true);
		this.expContext = expContext;
		this.descriptor = descriptor;
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		StandardItemProperty sip = (StandardItemProperty) getValue();
		if (sip == null)
			sip = new StandardItemProperty(id, null, null);
		ItemPropertyElementDialog dialog = new ItemPropertyElementDialog(UIUtils.getShell(), sip.getValue(), sip.getValueExpression(), descriptor.getDescription(id));
		dialog.setExpressionContext(expContext);
		if (dialog.open() == Dialog.OK)
			return new StandardItemProperty(id, dialog.getStaticValue(), dialog.getExpressionValue());
		return null;
	}

	private DescriptorPropertyLabelProvider labelProvider;

	@Override
	protected void updateContents(Object value) {
		if (getDefaultLabel() == null)
			return;
		if (labelProvider == null)
			labelProvider = new DescriptorPropertyLabelProvider(descriptor);
		String text = labelProvider.getText(value);
		getDefaultLabel().setText(text);
		if (descriptor == null || id == null)
			return;
		try {
			descriptor.validateItem(null);
		} catch (ValidationError e) {
			if (e.getProps().contains(id))
				setErrorMessage(e.getMessage());
		}
	}

	public void setExpressionContext(ExpressionContext expContext) {
		this.expContext = expContext;
	}
}
