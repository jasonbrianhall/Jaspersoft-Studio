/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, 
 * the following license terms apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.components.table.model.column.action;

import java.util.List;
import java.util.Map;

import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.components.Activator;
import com.jaspersoft.studio.components.table.messages.Messages;
import com.jaspersoft.studio.components.table.model.column.MColumn;
import com.jaspersoft.studio.editor.gef.util.CreateRequestUtil;
import com.jaspersoft.studio.editor.outline.actions.ACreateAction;
import com.jaspersoft.studio.editor.palette.JDPaletteCreationFactory;

/*
 * The Class CreateGroupAction.
 */
public class CreateColumnBeginAction extends ACreateAction {

	/** The Constant ID. */
	public static final String ID = "create_table_column_begin"; //$NON-NLS-1$

	/**
	 * Constructs a <code>CreateAction</code> using the specified part.
	 * 
	 * @param part
	 *            The part for this action
	 */
	public CreateColumnBeginAction(IWorkbenchPart part) {
		super(part);
		setCreationFactory(new JDPaletteCreationFactory(MColumn.class));
	}
	
	/**
	 * Initializes this action's text and images.
	 */
	@Override
	protected void init() {
		super.init();
		setText(Messages.CreateColumnBeginAction_title);
		setToolTipText(Messages.CreateColumnBeginAction_desc);
		setId(CreateColumnBeginAction.ID);
		setImageDescriptor(
				Activator.getDefault().getImageDescriptor("icons/table-insert-column-begin.png")); //$NON-NLS-1$
		setEnabled(false);
	}

	@Override
	protected boolean setExtendedData(Map<Object, Object> map, List<?> objects) {
		super.setExtendedData(map, objects);
		map.put(CreateRequestUtil.NEWINDEX, 0);
		return true;
	}
}
