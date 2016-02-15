/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.property.itemproperty.desc;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.editor.expression.IExpressionContextSetter;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.property.descriptor.text.NTextPropertyDescriptor;
import com.jaspersoft.studio.property.itemproperty.celleditor.ItemListCellEditor;
import com.jaspersoft.studio.property.itemproperty.label.ItemLabelProvider;
import com.jaspersoft.studio.property.itemproperty.sp.SPItemDataList;
import com.jaspersoft.studio.property.section.AbstractSection;
import com.jaspersoft.studio.property.section.widgets.ASPropertyWidget;

public abstract class AItemDataListPropertyDescriptor extends NTextPropertyDescriptor
		implements IExpressionContextSetter {
	private APropertyNode pNode;

	public AItemDataListPropertyDescriptor(Object id, String displayName, APropertyNode pNode) {
		super(id, displayName);
		this.pNode = pNode;
	}

	@Override
	public CellEditor createPropertyEditor(Composite parent) {
		return new ItemListCellEditor(parent, expContext, getDescriptor(), this, pNode);
	}

	@Override
	public ILabelProvider getLabelProvider() {
		return new ItemLabelProvider(descriptor);
	}

	@Override
	public ASPropertyWidget<AItemDataListPropertyDescriptor> createWidget(Composite parent, AbstractSection section) {
		ASPropertyWidget<AItemDataListPropertyDescriptor> sp = createSPWidget(parent, section);
		((IExpressionContextSetter) sp).setExpressionContext(expContext);
		return sp;
	}

	protected ASPropertyWidget<AItemDataListPropertyDescriptor> createSPWidget(Composite parent,
			AbstractSection section) {
		return new SPItemDataList(parent, section, this);
	}

	protected ADescriptor descriptor;

	public ADescriptor getDescriptor() {
		if (descriptor == null)
			initShowColumns();
		setLabelProvider(new ItemLabelProvider(descriptor));
		return descriptor;
	}

	protected abstract void initShowColumns();

	private ExpressionContext expContext;

	@Override
	public void setExpressionContext(ExpressionContext expContext) {
		this.expContext = expContext;
	}
}