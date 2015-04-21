/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.editor.gef.rulers.actions;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.eclipse.gef.rulers.RulerProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.jaspersoft.studio.editor.gef.rulers.component.JDRulerFigure;
import com.jaspersoft.studio.messages.Messages;

/**
 * Dialog to define or edit the position of ruler guide
 * 
 * @author Orlandin Marco
 *
 */
public final class PositionDialog extends Dialog {

		/**
		 * The start position
		 */
		private int suggestedPixels;
		
		/**
		 * The current measure unit
		 */
		private int measureUnit;
		
		/**
		 * Combo where is possible to set the measure unit
		 */
		private Combo measureCombo;
		
		/**
		 * Combo where the number is entered
		 */
		private Text valueText;
		
		/**
		 * Last valid value
		 */
		private String lastValidValue;
		
		/**
		 * List of the available measure units
		 */
		private static final int[] RULER_MEASURES = new int[]{RulerProvider.UNIT_PIXELS, RulerProvider.UNIT_CENTIMETERS, RulerProvider.UNIT_INCHES};
		
		/**
		 * List of the name of the measure units, it match 1:1 the RULER_MEASURES list
		 */
		private static final String[] RULER_NAMES = new String[]{Messages.DesignerPreferencePage_pixelMeasure,
																														 Messages.DesignerPreferencePage_centimeterMeasure,
																														 Messages.DesignerPreferencePage_inchMeasure};

		/**
		 * Create the dialog 
		 * 
		 * @param shell the shell
		 * @param suggestedPixels the initial value in pixels
		 * @param measureUnit the current measure unit, it must be one of RulerProvider.UNIT_PIXELS, 
		 * RulerProvider.UNIT_CENTIMETERS or RulerProvider.UNIT_INCHES
		 */
		public PositionDialog(Shell shell, int suggestedPixels, int measureUnit) {
			super(shell);
			this.measureUnit = measureUnit;
			this.suggestedPixels = suggestedPixels;
		}

		@Override
		protected void configureShell(Shell newShell) {
			super.configureShell(newShell);
			newShell.setText(Messages.CreateGuideAction_GuidePositionTxt);
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = new Composite(parent, SWT.NONE);
			container.setLayout(new GridLayout(3,false));
			container.setLayoutData(new GridData(GridData.FILL_BOTH));
			new Label(container, SWT.NONE).setText(Messages.CreateGuideAction_GuidePositionTxt);
			
			valueText = new Text(container, SWT.BORDER | SWT.RIGHT);
			GridData textData = new GridData(GridData.FILL_HORIZONTAL);
			textData.widthHint = 100;
			valueText.setLayoutData(textData);
			valueText.setText(convertPixelIntoValue(suggestedPixels));
			valueText.setToolTipText(Messages.CreateGuideAction_GuidePositionTooltip);
			//Modify listener, if the input text is valid then convert it to the current value
			//otherwise restore the old text
			valueText.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					try{
						float value = Float.parseFloat(valueText.getText());
						suggestedPixels = convertValueIntoPixels(value);
						lastValidValue = valueText.getText();
					} catch (Exception ex){
						valueText.setText(lastValidValue);
					}
				}
			});
			
			measureCombo = new Combo(container, SWT.READ_ONLY);
			measureCombo.setItems(RULER_NAMES);
			measureCombo.select(0);
			for(int i = 0; i< RULER_MEASURES.length; i++){
				if (measureUnit == RULER_MEASURES[i]){
					measureCombo.select(i);
					break;
				}
			}
			//Selection listener, update the value when the measure unit change
			measureCombo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					measureUnit = RULER_MEASURES[measureCombo.getSelectionIndex()];
					valueText.setText(convertPixelIntoValue(suggestedPixels));
				}
			});
			
			return container;
		}

		/**
		 * Get the selected position in pixels
		 * 
		 * @return selected position in pixels
		 */
		public int getPixelPosition() {
			return suggestedPixels;
		}
		
		/**
		 * Convert the passed value, considered as specified in 
		 * the measure unit field, into pixels
		 * 
		 * @param value value to convert from measureUnit ->  pixels
		 * @return the value in pixels
		 */
		protected int convertValueIntoPixels(float value){
			if (measureUnit == RulerProvider.UNIT_CENTIMETERS){
				return Math.round((value * JDRulerFigure.getDpi().x) / 2.54f);
			} else if (measureUnit == RulerProvider.UNIT_INCHES){
				return Math.round(value * JDRulerFigure.getDpi().x);
			} else {
				return Math.round(value);
			}
		}
		
		/**
		 * Convert the passed pixel value into the value specified by the
		 * measure unit
		 * 
		 * @param value value to convert from pixels ->  measureUnit
		 * @return the value as defined in the measure unit
		 */
		protected String convertPixelIntoValue(int pixels){
			double value;
			if (measureUnit == RulerProvider.UNIT_CENTIMETERS){
				value = (((double)pixels)*2.54)/JDRulerFigure.getDpi().x;
			} else if (measureUnit == RulerProvider.UNIT_INCHES){
				value = ((double)pixels)/JDRulerFigure.getDpi().x;
			} else {
				value = new Double(pixels);
			}
			DecimalFormat df = new DecimalFormat("##.####"); //$NON-NLS-1$
			df.setRoundingMode(RoundingMode.DOWN);
			return df.format(value);
		}

	}