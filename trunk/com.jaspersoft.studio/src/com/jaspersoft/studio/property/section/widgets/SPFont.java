/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2011 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of JasperReports.
 * 
 * JasperReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * JasperReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with JasperReports. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.property.section.widgets;

import net.sf.jasperreports.engine.JRFont;
import net.sf.jasperreports.engine.base.JRBaseStyle;
import net.sf.jasperreports.engine.design.JRDesignFont;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.jface.IntegerCellEditorValidator;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.text.MFont;
import com.jaspersoft.studio.property.descriptor.combo.RWComboBoxPropertyDescriptor;
import com.jaspersoft.studio.property.section.AbstractSection;

public class SPFont extends ASPropertyWidget {
	private CCombo fontName;
	private CCombo fontSize;
	private ToolItem boldButton;
	private ToolItem italicButton;
	private ToolItem underlineButton;
	private ToolItem strikeTroughtButton;

	public SPFont(Composite parent, AbstractSection section, IPropertyDescriptor pDescriptor) {
		super(parent, section, pDescriptor);
	}

	@Override
	public Control getControl() {
		return group;
	}

	protected void createComponent(Composite parent) {
		mfont = new MFont(new JRDesignFont(null));

		group = section.getWidgetFactory().createGroup(parent, pDescriptor.getDisplayName());
		group.setLayout(new GridLayout(2, false));

		final RWComboBoxPropertyDescriptor pd = (RWComboBoxPropertyDescriptor) mfont
				.getPropertyDescriptor(JRBaseStyle.PROPERTY_FONT_NAME);
		fontName = section.getWidgetFactory().createCCombo(group, SWT.FLAT);
		fontName.setItems(pd.getItems());
		fontName.addModifyListener(new ModifyListener() {
			private int time = 0;

			public void modifyText(ModifyEvent e) {
				if (e.time - time > 100) {
					String value = fontName.getText();
					if (!value.equals("______________")) //$NON-NLS-1$
						changeProperty(section, pDescriptor.getId(), pd.getId(), value);
				}
				time = e.time;
			}
		});
		fontName.setToolTipText(pd.getDescription());

		final RWComboBoxPropertyDescriptor pd1 = (RWComboBoxPropertyDescriptor) mfont
				.getPropertyDescriptor(JRBaseStyle.PROPERTY_FONT_SIZE);

		fontSize = section.getWidgetFactory().createCCombo(group, SWT.FLAT);
		fontSize.setItems(pd1.getItems());
		fontSize.addModifyListener(new ModifyListener() {
			private int time = 0;

			public void modifyText(ModifyEvent e) {
				if (e.time - time > 100) {
					String value = fontSize.getText();
					if (IntegerCellEditorValidator.instance().isValid(value) == null)
						changeProperty(section, pDescriptor.getId(), pd1.getId(), value);
				}
				time = e.time;
			}
		});
		fontSize.setToolTipText(pd1.getDescription());

		ToolBar toolBar = new ToolBar(group, SWT.FLAT | SWT.WRAP | SWT.LEFT);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		toolBar.setLayoutData(gd);

		boldButton = createItem(toolBar, JRBaseStyle.PROPERTY_BOLD, "icons/resources/bold.png");

		italicButton = createItem(toolBar, JRBaseStyle.PROPERTY_ITALIC, "icons/resources/italic.png");

		underlineButton = createItem(toolBar, JRBaseStyle.PROPERTY_UNDERLINE, "icons/resources/underline.png");

		strikeTroughtButton = createItem(toolBar, JRBaseStyle.PROPERTY_STRIKE_THROUGH, "icons/resources/strikethrought.png");
	}

	private ToolItem createItem(ToolBar toolBar, Object id, String image) {
		final IPropertyDescriptor ipd = mfont.getPropertyDescriptor(id);

		final ToolItem item = new ToolItem(toolBar, SWT.CHECK);
		item.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				changeProperty(section, pDescriptor.getId(), ipd.getId(), new Boolean(item.getSelection()));
			}
		});
		item.setImage(JaspersoftStudioPlugin.getImage(image)); //$NON-NLS-1$
		item.setToolTipText(ipd.getDescription());
		return item;
	}

	private void changeProperty(AbstractSection section, Object property, Object prop, Object value) {
		section.changePropertyOn(prop, value, mfont);
		if (property != null && parentNode != null)
			section.changePropertyOn(property, new MFont((JRFont) mfont.getValue()), parentNode);
	}

	private MFont mfont;
	private APropertyNode parentNode;
	private Group group;

	public void setData(APropertyNode pnode, Object value) {
		this.parentNode = pnode;
		this.mfont = (MFont) value;
		if (mfont != null) {
			String strfontname = (String) mfont.getPropertyValue(JRBaseStyle.PROPERTY_FONT_NAME);
			fontName.setText(strfontname != null ? strfontname : ""); //$NON-NLS-1$
			String[] items = fontName.getItems();
			for (int i = 0; i < items.length; i++) {
				if (items[i].equals(strfontname)) {
					fontName.select(i);
					break;
				}
			}

			String strfontsize = (String) mfont.getPropertyValue(JRBaseStyle.PROPERTY_FONT_SIZE);
			items = fontSize.getItems();
			fontSize.setText(strfontsize != null ? strfontsize : ""); //$NON-NLS-1$
			for (int i = 0; i < items.length; i++) {
				if (items[i].equals(strfontsize)) {
					fontSize.select(i);
					break;
				}
			}

			Boolean b = (Boolean) mfont.getPropertyValue(JRBaseStyle.PROPERTY_BOLD);
			boldButton.setSelection(b != null ? b.booleanValue() : false);
			b = (Boolean) mfont.getPropertyValue(JRBaseStyle.PROPERTY_ITALIC);
			italicButton.setSelection(b != null ? b.booleanValue() : false);
			b = (Boolean) mfont.getPropertyValue(JRBaseStyle.PROPERTY_UNDERLINE);
			underlineButton.setSelection(b != null ? b.booleanValue() : false);
			b = (Boolean) mfont.getPropertyValue(JRBaseStyle.PROPERTY_STRIKE_THROUGH);
			strikeTroughtButton.setSelection(b != null ? b.booleanValue() : false);
		}
	}
}
