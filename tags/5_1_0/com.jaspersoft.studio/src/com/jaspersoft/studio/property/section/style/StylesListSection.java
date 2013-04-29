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
package com.jaspersoft.studio.property.section.style;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignReportTemplate;
import net.sf.jasperreports.engine.design.JRDesignStyle;
import net.sf.jasperreports.engine.type.JREnum;

import org.apache.commons.lang.StringUtils;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.gef.parts.EditableFigureEditPart;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.DefaultValuesMap;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MLineBox;
import com.jaspersoft.studio.model.MLinePen;
import com.jaspersoft.studio.model.MPage;
import com.jaspersoft.studio.model.style.MConditionalStyle;
import com.jaspersoft.studio.model.style.MStyle;
import com.jaspersoft.studio.model.style.MStyleTemplate;
import com.jaspersoft.studio.model.style.MStyles;
import com.jaspersoft.studio.model.style.MStylesTemplate;
import com.jaspersoft.studio.model.text.MParagraph;
import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;
import com.jaspersoft.studio.utils.GridDataUtil;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.UIUtil;

/**
 * Class that paint the widget where are shown the attributes of element, those inherited by the it's styles, and the
 * default values
 * 
 * @author Orlandin Marco
 * 
 */
public class StylesListSection extends AbstractSection {

	/**
	 * Color for the text that represent the attribute name
	 */
	private static Color leftStringColor = null;

	/**
	 * Image show to remove an attribute
	 */

	private static Image image = ResourceManager.getPluginImage(JaspersoftStudioPlugin.PLUGIN_ID, "icons/resources/remove-16.png"); //$NON-NLS-1$

	/**
	 * Map of all the styles, where the name of the style is it's key
	 */
	private HashMap<String, StyleContainer> styleMaps;

	/**
	 * List of attributes overridden by others of an upper level in the hierarchy (the hierarchy is element-styles-default
	 * style-default attribute)
	 */
	private HashSet<String> ovverridenAttributes;

	/**
	 * Reference to the default style
	 */
	private MStyle defaultStyle = null;

	/**
	 * Reference to the element actually displayed
	 */
	private APropertyNode element = null;

	/**
	 * The map of the element own attributes
	 */
	private HashMap<String, Object> elementAttributes = null;

	/**
	 * Manager for the events binded to the mouse
	 */
	private IconMouseTracker trackerListener = new IconMouseTracker();

	/**
	 * Used as guard when an remove click listener is created. If it's true the listener assume that it's created because
	 * it's assigned to the main element, otherwise it was Assigned to a an element in the hierarchy of the main element.
	 * This could be done using a parameter Instead of a local variable, but to keep the method signature more simply this
	 * approach was choose
	 */
	private Boolean mainElementEvent;

	/**
	 * Store the field of the last change event received, used to avoid multiple refreshing for the same event
	 */
	private ArrayList<Object> lastChangeEvent = null;

	/**
	 * Boolean flag to take trace it the tab is shown
	 */
	private boolean shown = false;

	/**
	 * Class to manage the events of the mouse click, used to remove an attribute from an element or one of it's styles
	 * 
	 * @author Orlandin Marco
	 * 
	 */
	private class ElementClickListener implements MouseListener {

		/**
		 * Element binded to this event
		 */
		private APropertyNode targetElement;

		/**
		 * Property of the element binded to this event
		 */
		private String property;

		/**
		 * True if this listener is used to remove a property from the main element, false otherwise. In this last case a
		 * warning popup is showed before the cancellation
		 */
		private boolean isTargetMain;

		public ElementClickListener(APropertyNode targetElement, String property) {
			isTargetMain = mainElementEvent;
			this.targetElement = targetElement;
			this.property = property;
		}

		public void mouseDown(MouseEvent e) {
		}

		/**
		 * Set the property of the element binded to this event to null, using the manipulation commands (so the operation
		 * can be undone)
		 */
		public void mouseUp(MouseEvent e) {
			boolean executeCommand = true;
			if (!targetElement.isEditable()){
				MessageBox messageBox = new MessageBox(e.widget.getDisplay().getActiveShell(), SWT.ICON_QUESTION | SWT.YES | SWT.NO);
				messageBox.setText(Messages.StylesListSection_NotEditable_Title);
				messageBox.setMessage(Messages.StylesListSection_NotEditable_Message);
				int response = messageBox.open();
				executeCommand = false;
				if (response == SWT.YES){
					StyleContainer styleReference = styleMaps.get(((JRStyle)targetElement.getValue()).getName());
					EditableFigureEditPart.openEditor(styleReference.getTemplateValue(), ((DefaultEditDomain)getEditDomain()).getEditorPart(), styleReference.getTemplate());
				}
			} else if (!isTargetMain) {
				MessageBox messageBox = new MessageBox(e.widget.getDisplay().getActiveShell(), SWT.ICON_WARNING | SWT.YES
						| SWT.NO);
				messageBox.setText(Messages.StylesListSection_Warining_Box_Title);
				messageBox.setMessage(Messages.StylesListSection_Warning_Box_Message);
				int buttonID = messageBox.open();
				if (buttonID == SWT.NO)
					executeCommand = false;
			}
			if (executeCommand) {
				CommandStack cs = getEditDomain().getCommandStack();
				CompoundCommand cc = new CompoundCommand("Set " + property); //$NON-NLS-1$
				Command c = getChangePropertyCommand(property, null, targetElement);
				if (c != null)
					cc.add(c);
				if (!cc.getCommands().isEmpty()) {
					Object oldValue = targetElement.getPropertyValue(property);
					cs.execute(cc);
					// Force a refresh
					refresh();
					parent.setFocus();
					lastChangeEvent = new ArrayList<Object>();
					lastChangeEvent.add(oldValue);
					lastChangeEvent.add(null);
					lastChangeEvent.add(targetElement);
					lastChangeEvent.add(property);
				}
			}
		}

		public void mouseDoubleClick(MouseEvent e) {

		}
	}
	
	/**
	 * This class encapsulate a style and eventually its external reference, used to handle easly the 
	 * external styles
	 * @author Orlandin Marco
	 *
	 */
	private class StyleContainer{
		
		/**
		 * The style
		 */
		private MStyle style;
		
		/**
		 * True if the style come from an external reference
		 */
		private boolean external;
		
		/**
		 * A reference to the external reference
		 */
		private MStyleTemplate externalTemplate;
		
		/**
		 * Encapsulate a local style
		 * @param style the style model
		 */
		public StyleContainer(MStyle style){
			external = false;
			externalTemplate = null;
			this.style = style;
		}
		
		/**
		 * Encapsulate an external style with its container
		 * @param style the style
		 * @param reference the container
		 */
		public StyleContainer(MStyle style, MStyleTemplate reference){
			external = true;
			externalTemplate = reference;
			this.style = style;
		}
		
		/**
		 * Return if the style is external
		 * @return true if the style it's external, false otherwise
		 */
		public boolean isExternal(){
			return external;
		}
		
		/**
		 * Return the style
		 * @return the model of the style
		 */
		public MStyle getStyle(){
			return style;
		}
		
		/**
		 * Return the template
		 * @return the template of the style
		 */
		public MStyleTemplate getTemplate(){
			return externalTemplate;
		}
		
		/**
		 * Return the value of the template
		 * @return the JRElement of the template
		 */
		public JRDesignReportTemplate getTemplateValue(){
			return (JRDesignReportTemplate) externalTemplate.getValue();
		}
	}

	/**
	 * Class to manage the events of the mouse move event, as the mouse over and the mouse exit, used to show the button
	 * to delete an attribute when the mouse pointer is over it
	 * 
	 * @author Orlandin Marco
	 * 
	 */
	private class IconMouseTracker implements MouseTrackListener {

		/**
		 * Last element where the remove button was shown
		 */
		Composite lastElementSelected = null;

		/**
		 * Set the last element to null, necessary after a refresh of the widget because the old element were deallocated,
		 * so this pointer need to be reseted too.
		 */
		public void refresh() {
			lastElementSelected = null;
		}

		/**
		 * Handle the event of the mouse enter on area that show the delete image, eventually hide the old one. Change event
		 * the mouse cursor to an hand.
		 */
		@Override
		public void mouseEnter(MouseEvent e) {
			Composite parentLayout = null;
			if (e.widget instanceof Composite)
				parentLayout = ((Composite) e.widget);
			else
				parentLayout = ((Control) e.widget).getParent();
			if (lastElementSelected == null)
				lastElementSelected = parentLayout;

			// We must be sure that the properties view is the one that currently is active
			if (parentLayout.getChildren().length > 1 && UIUtil.isPropertiesViewFocused()) {
				lastElementSelected.getChildren()[0].setVisible(false);
				lastElementSelected = parentLayout;
				parentLayout.getChildren()[0].setVisible(true);
				parentLayout.getChildren()[0].setCursor(new Cursor(null, SWT.CURSOR_HAND));
			}
		}

		/**
		 * Handle the event of the mouse exit the area that show the delete image, hide the image
		 */
		@Override
		public void mouseExit(MouseEvent e) {
			Composite parentLayout = null;
			if (e.widget instanceof Composite)
				parentLayout = ((Composite) e.widget);
			else
				parentLayout = ((Control) e.widget).getParent();
			if (parentLayout.getChildren().length > 1)
				parentLayout.getChildren()[0].setVisible(false);
		}

		@Override
		public void mouseHover(MouseEvent e) {
		}

	}
	

	/**
	 * Build the hierarchy of styles of an element
	 * 
	 * @param element
	 *          Element from which the styles list will be generated
	 * @return A list of MStyle, where the first is the style assigned to the element, the second is the style assigned to
	 *         the first item of the list and so on
	 */
	private LinkedList<MStyle> buildStylesGerarchy(APropertyNode element) {
		LinkedList<MStyle> result = new LinkedList<MStyle>();
		Object styleName;
		if (element instanceof MConditionalStyle) styleName = ((MStyle)element.getParent()).getPropertyValue(JRDesignElement.PROPERTY_PARENT_STYLE);
		else styleName = element.getPropertyValue(JRDesignElement.PROPERTY_PARENT_STYLE);
		StyleContainer styleContainer = styleMaps.get(styleName.toString());
		if (styleContainer != null){
			MStyle styleModel = styleContainer.getStyle();
			result.addLast(styleModel);
			JRStyle nextStyle =  ((JRStyle)styleModel.getValue()).getStyle();
			while (nextStyle != null){
				styleModel = styleMaps.get(nextStyle.getName()).getStyle();
				result.addLast(styleModel);
				nextStyle =  ((JRStyle)styleModel.getValue()).getStyle();
			}

		}
		return result;
	}

	/**
	 * Add to a styledtext a new style to made the text with a middle black line (strike trought)
	 * 
	 * @param valueText
	 *          StyledText widget where the new style will be applied
	 */
	private void strikeStyledText(StyledText valueText) {
		StyleRange style1 = new StyleRange();
		style1.strikeout = true;
		style1.start = 0;
		style1.length = valueText.getText().length();
		valueText.setStyleRange(style1);
	}

	/**
	 * Return the hexadecimal representation of a color
	 * 
	 * @param color
	 *          The color
	 * @return The color hexadecimal representation
	 */
	private String getHexFromRGB(Color color) {
		int r = color.getRed();
		int g = color.getGreen();
		int b = color.getBlue();
		String s = Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
		return "#" + StringUtils.rightPad(s, 6, "0").toUpperCase(); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Paint on the main widget the fields to show the value of an attribute color. the color will be expressed in textual
	 * form, as RGB values, but with a tooltip that show the visually the color
	 * 
	 * @param parent
	 *          Reference to the widget composite
	 * @param colorValue
	 *          Value of the color
	 * @param colorName
	 *          Name of the attribute
	 * @param gData
	 *          Grid data for the layout
	 * @param addLine
	 *          true if a stroke line is needed
	 * @param toolTip
	 *          tooltip text of the element name label
	 * @return The button where the click handle will be added
	 */
	private Control paintColor(Composite parent, final Color colorValue, String colorName, GridData gData,
			boolean addLine, String toolTip) {
		String stringValue = getHexFromRGB(colorValue);
		Composite nameComp = new Composite(parent, SWT.NONE);
		RowLayout layout = new RowLayout();
		nameComp.setLayout(layout);
		nameComp.setLayoutData(GridDataUtil.clone(gData));

		Label imageLabel = new Label(nameComp, SWT.NONE);
		imageLabel.setImage(image);
		imageLabel.setVisible(false);

		StyledText label = new StyledText(nameComp, SWT.NONE);
		label.setText(colorName); //$NON-NLS-1$
		label.setForeground(leftStringColor);
		label.setEditable(false);
		label.setEnabled(false);
		nameComp.setToolTipText(toolTip);

		Composite valueComp = new Composite(parent, SWT.NONE);
		RowLayout inLineLayout = new RowLayout();
		valueComp.setLayout(inLineLayout);
		valueComp.setLayoutData(GridDataUtil.clone(gData));

		StyledText valueText = new StyledText(valueComp, SWT.NONE);
		valueText.addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent e) {
				e.gc.setBackground(colorValue);
				e.gc.drawRectangle(0, 0, 13, 13);
				e.gc.fillRectangle(1, 1, 12, 12);

			}
		});
		valueText.setLeftMargin(18);
		valueText.setText(stringValue);
		valueText.setAlignment(SWT.LEFT);
		valueText.setEditable(false);
		valueText.setEnabled(true);
		RowData valueText_RD = new RowData();
		valueText_RD.height=15;
		valueText.setLayoutData(valueText_RD);
		if (addLine) {
			strikeStyledText(valueText);
			strikeStyledText(label);
		}
		return imageLabel;
	}

	/**
	 * Paint a couple of string as two label
	 * 
	 * @param parent
	 *          Reference to the widget composite
	 * @param name
	 *          The name of the attribute
	 * @param value
	 *          The value of the attribute
	 * @param gData
	 *          Grid data for the layout
	 * @param addLine
	 *          true if a stroke line is needed
	 * @param toolTip
	 *          tooltip text of the element name label
	 * @return The button where the click handle will be added
	 */
	private Control printLabels(Composite parent, String name, String value, GridData gData, boolean addLine,
			String toolTip) {
		Composite valueComp = new Composite(parent, SWT.NONE);
		valueComp.setLayout(new RowLayout());
		valueComp.setLayoutData(gData);

		Label imageLabel = new Label(valueComp, SWT.NONE);
		imageLabel.setImage(image);
		imageLabel.setVisible(false);

		StyledText label = new StyledText(valueComp, SWT.NONE);
		label.setText(name); //$NON-NLS-1$
		label.setForeground(leftStringColor);
		label.setEditable(false);
		label.setEnabled(false);
		valueComp.setToolTipText(toolTip);

		StyledText valueText = new StyledText(parent, SWT.NONE);
		valueText.setText(value);
		valueText.setEditable(false);
		valueText.setEnabled(false);
		if (addLine) {
			strikeStyledText(valueText);
			strikeStyledText(label);
		}
		return imageLabel;
	}

	/**
	 * Paint a boolean attribute, it's value is expressed as text
	 * 
	 * @param parent
	 *          Reference to the widget composite
	 * @param name
	 *          The name of the attribute
	 * @param checked
	 *          true if the attribute has value true, false otherwise
	 * @param gData
	 *          Grid data for the layout
	 * @param addLine
	 *          true if a stoke line is needed
	 * @param toolTip
	 *          tooltip text of the element name label
	 * @return The button where the click handle will be added
	 */
	private Control paintCheckBox(Composite parent, String name, boolean checked, GridData gData, boolean addLine,
			String toolTip) {
		String stringValue = Messages.getString("common_boolean_" + checked); //$NON-NLS-1$
		return printLabels(parent, name, stringValue, gData, addLine, toolTip);
	}

	/**
	 * Add the mouse move listener to an element, it's father and it's brothers
	 * 
	 * @param element
	 */
	private void AddListener(Control element) {
		Composite parent = element.getParent();
		parent.addMouseTrackListener(trackerListener);
		for (Control son : parent.getChildren()) {
			son.addMouseTrackListener(trackerListener);
		}
	}

	/**
	 * Print a generic object attribute with the appropriate widgets on the main composite
	 * 
	 * @param keyPrefix
	 *          optional prefix to the key represented by the name
	 * @param name
	 *          Name and key of the attribute
	 * @param value
	 *          value of the attribute
	 * @param parent
	 *          main widget
	 * @param gData
	 *          grid layout data
	 * @param printLine
	 *          True if the printed attribute need a strike thought line
	 * @param actualElement
	 *          element that contain the attribute
	 * @param addListener
	 *          true if to the element will be added the listener for the mouse move\click
	 */
	private void printObject(String namePrefix, String name, Object value, Composite parent, GridData gData,
			boolean printLine, APropertyNode actualElement, boolean addListener, HashMap<String, Object> localContext) {
		if (value instanceof Color) {
			Color valImage = (Color) value;
			Control label = paintColor(
					parent,
					valImage,
					Messages.getString("common".concat(namePrefix).concat("_").concat(name)), gData, printLine, actualElement.getPropertyDescriptor(name).getDescription()); //$NON-NLS-1$ //$NON-NLS-2$
			if (addListener) {
				AddListener(label);
				label.addMouseListener(new ElementClickListener(actualElement, name));
				label.setToolTipText(Messages.StylesListSection_removeAttribure_tooltip); //$NON-NLS-1$
			}
		} else if (value instanceof java.awt.Color) {
			java.awt.Color valImage = (java.awt.Color) value;
			Control label = paintColor(
					parent,
					ModelUtils.getSWTColorFromAWT(valImage),
					Messages.getString("common".concat(namePrefix).concat("_").concat(name)), gData, printLine, actualElement.getPropertyDescriptor(name).getDescription()); //$NON-NLS-1$ //$NON-NLS-2$
			if (addListener) {
				AddListener(label);
				label.addMouseListener(new ElementClickListener(actualElement, name));
				label.setToolTipText(Messages.StylesListSection_removeAttribure_tooltip); //$NON-NLS-1$
			}
		} else if (value instanceof JREnum) {
			JREnum enumValue = (JREnum) value;
			Control label = printLabels(
					parent,
					Messages.getString("common".concat(namePrefix).concat("_").concat(name)), enumValue.getName(), gData, printLine, actualElement.getPropertyDescriptor(name).getDescription()); //$NON-NLS-1$ //$NON-NLS-2$
			if (addListener) {
				AddListener(label);
				label.addMouseListener(new ElementClickListener(actualElement, name));
				label.setToolTipText(Messages.StylesListSection_removeAttribure_tooltip); //$NON-NLS-1$
			}
		} else if (value instanceof Boolean) {
			Control label = paintCheckBox(
					parent,
					Messages.getString("common".concat(namePrefix).concat("_").concat(name)), (Boolean) value, gData, printLine, actualElement.getPropertyDescriptor(name).getDescription()); //$NON-NLS-1$ //$NON-NLS-2$
			if (addListener) {
				AddListener(label);
				label.addMouseListener(new ElementClickListener(actualElement, name));
				label.setToolTipText(Messages.StylesListSection_removeAttribure_tooltip); //$NON-NLS-1$
			}
		} else if (value instanceof MLinePen) {
			MLinePen lineValue = (MLinePen) value;
			// I need to pass a new context for the linepen because it's a composite value, so in the main hashmap i have only
			// the
			// complex value, not all it's fields
			printStyleAttribute(parent, lineValue, null,
					namePrefix.concat("_").concat(name), ((MLinePen) localContext.get(name)).getStylesDescriptors(), addListener); //$NON-NLS-1$
		} else if (value instanceof MParagraph) {
			MParagraph lineValue = (MParagraph) value;
			printStyleAttribute(
					parent,
					lineValue,
					null,
					namePrefix.concat("_").concat(name), ((MParagraph) localContext.get(name)).getStylesDescriptors(), addListener); //$NON-NLS-1$
		} else if (value instanceof MLineBox) {
			MLineBox lineValue = (MLineBox) value;
			printStyleAttribute(parent, lineValue, null,
					namePrefix.concat("_").concat(name), ((MLineBox) localContext.get(name)).getStylesDescriptors(), addListener); //$NON-NLS-1$
		} else {
			Control label = printLabels(
					parent,
					Messages.getString("common".concat(namePrefix).concat("_").concat(name)), value.toString(), gData, printLine, actualElement.getPropertyDescriptor(name).getDescription()); //$NON-NLS-1$ //$NON-NLS-2$
			if (addListener) {
				AddListener(label);
				label.addMouseListener(new ElementClickListener(actualElement, name));
				label.setToolTipText(Messages.StylesListSection_removeAttribure_tooltip);
			}
		}
	}

	/**
	 * Print a title label, gray that take a whole line
	 * 
	 * @param parent
	 *          composite of the main widget
	 * @param value
	 *          text to put into the label
	 */
	private Label printTitle(Composite parent, String value) {
		Label label = new Label(parent, SWT.NONE);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;
		gridData.widthHint = SWT.FILL;
		gridData.heightHint = 20;
		label.setLayoutData(gridData);
		label.setBackground(new Color(null, 240, 240, 240));
		label.setText(" " + value); //$NON-NLS-1$
		return label;
	}

	/**
	 * Print the attributes of an element store in the elementAttributes hash map
	 * 
	 * @param parent
	 *          composite of the main widget
	 * @param element
	 *          The selected element
	 * @param titleValue
	 *          The title to print for this element
	 */
	private void printElementAttribute(Composite parent, APropertyNode element, String titleValue) {
		if (titleValue != null) {
			printTitle(parent, titleValue);
		}
		GridData sameSizeGridData = new GridData();
		sameSizeGridData.verticalAlignment = SWT.CENTER;
		sameSizeGridData.heightHint = 20;
		sameSizeGridData.widthHint = 200;
		Iterator<String> it = elementAttributes.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Object elementAttribute = elementAttributes.get(key);
			if (elementAttribute != null) {
				printObject(
						"", key, elementAttribute, parent, sameSizeGridData, ovverridenAttributes.contains(key), element, true, elementAttributes); //$NON-NLS-1$
				ovverridenAttributes.add(key);
			}
		}
	}

	/**
	 * Print the attributes that belong to a styles
	 * 
	 * @param parent
	 *          composite of the main widget
	 * @param element
	 *          The selected element
	 * @param titleValue
	 *          The title to print for this element
	 * @param keyPrefix
	 *          optional prefix of the attribute key
	 * @param localElementAttributes
	 *          Map that contains the attribute of the element associated with this style
	 */
	private void printStyleAttribute(Composite parent, APropertyNode element, String titleValue, String keyPrefix,
			HashMap<String, Object> localElementAttributes, boolean addHandler) {
		if (titleValue != null) {
			Label titleLabel = printTitle(parent, titleValue);
			final StyleContainer styleReference = styleMaps.get(((JRStyle)element.getValue()).getName());
			if (styleReference.isExternal()){
				//If the style is external i made its editor open by double clicking on the style title
				titleLabel.setText(titleLabel.getText().concat(Messages.StylesListSection_NotEditable_Visual_Marker));
				titleLabel.addMouseListener(new MouseListener() {
					@Override
					public void mouseUp(MouseEvent e) {}
					
					@Override
					public void mouseDown(MouseEvent e) {}
					
					@Override
					public void mouseDoubleClick(MouseEvent e) {
						EditableFigureEditPart.openEditor(styleReference.getTemplateValue(), ((DefaultEditDomain)getEditDomain()).getEditorPart(), styleReference.getTemplate());
					}
				});
			}
		}
		GridData sameSizeGridData = new GridData();
		sameSizeGridData.verticalAlignment = SWT.CENTER;
		sameSizeGridData.heightHint = 20;
		sameSizeGridData.widthHint = 200;
		HashMap<String, Object> properties = element.getStylesDescriptors();
		Iterator<String> it = properties.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Object elementAttribute = properties.get(key);
			if (elementAttribute != null && localElementAttributes.containsKey(key)) {
				printObject(keyPrefix, key, elementAttribute, parent, sameSizeGridData,
						ovverridenAttributes.contains(keyPrefix + key), element, addHandler, localElementAttributes);
				ovverridenAttributes.add(keyPrefix + key);
			}
		}
	}

	/**
	 * Print the attributes of all the styles of the element
	 * 
	 * @param styles
	 *          List of styles
	 * @param parent
	 *          composite of the main widget
	 */
	private void printStyles(LinkedList<MStyle> styles, Composite parent) {
		ListIterator<MStyle> itr = styles.listIterator();
		boolean hasDefaultStyleInGerarchy = false;
		while (itr.hasNext()) {
			MStyle style = itr.next();
			printStyleAttribute(parent, style,
					Messages.StylesSectionList_Inherited_From_Style + style.getPropertyValue(JRDesignStyle.PROPERTY_NAME),
					"", elementAttributes, true); //$NON-NLS-1$
			if (style == defaultStyle)
				hasDefaultStyleInGerarchy = true;
		}
		if (!hasDefaultStyleInGerarchy && defaultStyle != null && defaultStyle != element)
			printStyleAttribute(
					parent,
					defaultStyle,
					Messages.StylesListSection_Inherited_From_Default_Style.concat(defaultStyle.getPropertyValue(
							JRDesignStyle.PROPERTY_NAME).toString()), "", elementAttributes, true); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	/**
	 * Add the external list to the styles map, but only those with a different name from the one already added
	 * @param stylesList
	 */
	private void recursiveReadStyles(List<INode> stylesList, MStyleTemplate parentReference){
		for(INode style : stylesList){
			if (style instanceof MStyle) {
				MStyle element = (MStyle) style;
				String name = element.getPropertyValue(JRDesignStyle.PROPERTY_NAME).toString();
				if (!styleMaps.containsKey(name)) styleMaps.put(name, new StyleContainer(element,parentReference));
			} else if (style instanceof MStyleTemplate){
				recursiveReadStyles(style.getChildren(), (MStyleTemplate)style);
			}
		}
	}

	/**
	 * Initialize the map of the styles
	 */
	private void initStyleMaps() {
		styleMaps = new HashMap<String, StyleContainer>();
		ovverridenAttributes = new HashSet<String>();
		if (leftStringColor == null) {
			leftStringColor = new Color(null, 42, 96, 213);
		}
		List<INode> list = getStylesRoot(element).getChildren();
		List<INode> externalList = new ArrayList<INode>();
		for(INode style : list){
			if (style instanceof MStyle) {
				MStyle element = (MStyle) style;
				styleMaps.put(element.getPropertyValue(JRDesignStyle.PROPERTY_NAME).toString(), new StyleContainer(element));
				if ((Boolean) element.getPropertyValue(JRDesignStyle.PROPERTY_DEFAULT))
					defaultStyle = element;
			} else if (style instanceof MStyleTemplate){
				externalList.add(style);
			}
		}
		recursiveReadStyles(externalList, null);
	}

	/**
	 * Print the default values of an element, the aren't editable
	 * 
	 * @param parent
	 *          composite of the main widget
	 * @param defaultValues
	 *          map of the default values
	 */
	private void printDefaultValues(Composite parent, Map<String, Object> defaultValues) {
		printTitle(parent, "Default attributes"); //$NON-NLS-1$
		GridData sameSizeGridData = new GridData();
		sameSizeGridData.verticalAlignment = SWT.CENTER;
		sameSizeGridData.heightHint = 20;
		sameSizeGridData.widthHint = 200;
		Iterator<String> it = defaultValues.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Object elementAttribute = defaultValues.get(key);
			if (elementAttribute != null && elementAttributes.containsKey(key)) {
				printObject(
						"", key, elementAttribute, parent, sameSizeGridData, ovverridenAttributes.contains(key), element, false, elementAttributes); //$NON-NLS-1$
			}
		}
	}

	/**
	 * Add not only this node to the notify handler but all it's root, so even change in it's styles will be notified
	 */
	public void aboutToBeShown() {
		if (getElement() != null) {
			getElement().getRoot().getPropertyChangeSupport().removePropertyChangeListener(this);
			getElement().getRoot().getPropertyChangeSupport().addPropertyChangeListener(this);
			// Set the handler for every style also because in this way an update of the style is immediately reflected
			for (INode style : getStylesRoot(element).getChildren()) {
				style.getPropertyChangeSupport().removePropertyChangeListener(this);
				style.getPropertyChangeSupport().addPropertyChangeListener(this);
			}
		}
		shown = true;
	}

	/**
	 * Add not only this node to the notify handler but all it's root, so even change in it's styles will be notified
	 */
	public void aboutToBeHidden() {
		if (getElement() != null) {
			getElement().getRoot().getPropertyChangeSupport().removePropertyChangeListener(this);
			ANode styles = getStylesRoot(element);
			//check in case the selected element was deleted
			if (styles != null){
				for (INode style : styles.getChildren()) {
					style.getPropertyChangeSupport().removePropertyChangeListener(this);
				}
			}
		}
		shown = false;
	}

	/**
	 * Check if the actual old value and new value are equals to those received in the last refresh
	 * 
	 * @param oldValue
	 *          the new oldValue
	 * @param newValue
	 *          the new newValue
	 * @return true if the new oldValue and the new newValue are equals to those received in the precedent call of a
	 *         proprty change false otherwise
	 */
	private boolean checkValuesEqual(Object oldValue, Object newValue) {
		boolean oldValueEqual = false;
		// If the values are not null use the equals operator, otherwise ==
		oldValueEqual = oldValue != null ? oldValue.equals(lastChangeEvent.get(0)) : oldValue == lastChangeEvent.get(0);
		boolean newValueEqual = false;
		if (oldValueEqual)
			newValueEqual = newValue != null ? newValue.equals(lastChangeEvent.get(1)) : newValue == lastChangeEvent.get(1);
		return (newValueEqual && oldValueEqual);
	}

	/**
	 * Override of the property change handler, check if the last event received was already notified
	 */
	public void propertyChange(PropertyChangeEvent evt) {
		if (!isDisposed()) {
			isRefreshing = true;
			if (lastChangeEvent == null) {
				lastChangeEvent = new ArrayList<Object>();
				lastChangeEvent.add(evt.getOldValue());
				lastChangeEvent.add(evt.getNewValue());
				lastChangeEvent.add(evt.getSource());
				lastChangeEvent.add(evt.getPropertyName());
				refresh();
			} else {
				// Print only if the event is changed and the tab is shown
				if ((!checkValuesEqual(evt.getOldValue(), evt.getNewValue()) || !lastChangeEvent.get(2).equals(evt.getSource()) || !lastChangeEvent
						.get(3).equals(evt.getPropertyName())) && shown) {
					refresh();
					lastChangeEvent = new ArrayList<Object>();
					lastChangeEvent.add(evt.getOldValue());
					lastChangeEvent.add(evt.getNewValue());
					lastChangeEvent.add(evt.getSource());
					lastChangeEvent.add(evt.getPropertyName());
				}
			}
			isRefreshing = false;
		}
	}

	private void printWindowTitle(Composite parent) {
		StyledText label = new StyledText(parent, SWT.WRAP);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.CENTER;
		gridData.horizontalSpan = 2;
		gridData.horizontalIndent = 5;
		gridData.heightHint = 20;
		label.setLayoutData(gridData);
		label.setFont(ResourceManager.getBoldFont(label.getFont()));
		label.setText(Messages.StylesListSection_Title);
		label.setEnabled(false);
	}

	/**
	 * Refresh the style widget deleting the old component and recreating the updated ones
	 */
	@Override
	public void refresh() {
		isRefreshing = true;
		trackerListener.refresh();
		element = getElement();
		elementAttributes = element.getStylesDescriptors();
		// Dispose the old widgets
		for (Control kid : parent.getChildren()) {
			kid.dispose();
		}
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		parent.setLayout(layout);
		printWindowTitle(parent);
		initStyleMaps();
		LinkedList<MStyle> styles = buildStylesGerarchy(element);
		// Printing the main attribute, opening the guard
		mainElementEvent = true;
		printElementAttribute(parent, element, Messages.StylesSectionList_Element_Attributes);
		// Element printed, closing the guard
		mainElementEvent = false;
		printStyles(styles, parent);
		printDefaultValues(parent, DefaultValuesMap.getPropertiesByType(element));
		ovverridenAttributes = null;
		//styleMaps = null;
		parent.layout();
		isRefreshing = false;
	}

	/**
	 * Return a reference to the node father of all the styles
	 * 
	 * @param element
	 * @return reference to the father of all the styles
	 */
	private ANode getStylesRoot(APropertyNode element) {
		List<INode> children = element.getRoot().getChildren();
		Iterator<INode> it = children.iterator();
		ANode stylesClass = null;
		while (it.hasNext() && stylesClass == null) {
			INode childElement = it.next();
			if (childElement instanceof MStyles || childElement instanceof MStylesTemplate)
				stylesClass = (ANode)childElement;
			// The root is a subreport or a table, i need to move into an upper level
			if (childElement instanceof MPage) {
				children = childElement.getChildren();
				it = children.iterator();
			}
		}
		return stylesClass;
	}

	/**
	 * Initialize the styles widget, create the control and set them
	 */
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		element = getElement();
		initStyleMaps();
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		parent.setLayout(layout);
		printWindowTitle(parent);
		initStyleMaps();
		LinkedList<MStyle> styles = buildStylesGerarchy(element);
		elementAttributes = element.getStylesDescriptors();
		// Printing the main attribute, opening the guard
		mainElementEvent = true;
		printElementAttribute(parent, element, Messages.StylesSectionList_Element_Attributes);
		// Element printed, closing the guard
		mainElementEvent = false;
		printStyles(styles, parent);
		printDefaultValues(parent, DefaultValuesMap.getPropertiesByType(element));
		ovverridenAttributes = null;
		//styleMaps = null;
	}
}
