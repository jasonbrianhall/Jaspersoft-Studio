/*
 * Copyright (C) 2003, 2004  Pascal Essiembre, Essiembre Consultant Inc.
 * 
 * This file is part of Essiembre ResourceBundle Editor.
 * 
 * Essiembre ResourceBundle Editor is free software; you can redistribute it 
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * Essiembre ResourceBundle Editor is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Essiembre ResourceBundle Editor; if not, write to the 
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330, 
 * Boston, MA  02111-1307  USA
 */
package com.essiembre.eclipse.rbe.ui.preferences;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.essiembre.eclipse.rbe.RBEPlugin;
import com.essiembre.eclipse.rbe.ui.UIUtils;

/**
 * Plugin preference page.
 * @author Pascal Essiembre (essiembre@users.sourceforge.net)
 * @version $Author: essiembre $ $Revision: 1.4 $ $Date: 2005/07/31 05:29:46 $
 */
public abstract class AbstractRBEPrefPage extends PreferencePage implements
        IWorkbenchPreferencePage {

    /** Number of pixels per field indentation  */
    protected final int indentPixels = 20;
    
    /** Controls with errors in them. */
    protected final Map<Text,String> errors = new HashMap<Text,String>();
    
    /**
     * Constructor.
     */
    public AbstractRBEPrefPage() {
        super();
    }

    /**
     * @see org.eclipse.ui.IWorkbenchPreferencePage
     *      #init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {
    }

    protected Composite createFieldComposite(Composite parent) {
        return createFieldComposite(parent, 0);
    }
    protected Composite createFieldComposite(Composite parent, int indent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout gridLayout = new GridLayout(2, false);
        gridLayout.marginWidth = indent;
        gridLayout.marginHeight = 0;
        gridLayout.verticalSpacing = 0;
        composite.setLayout(gridLayout);
        return composite;
    }

    protected class IntTextValidatorKeyListener extends KeyAdapter {
        
        private String errMsg = null;
        
        /**
         * Constructor.
         * @param errMsg error message
         */
        public IntTextValidatorKeyListener(String errMsg) {
            super();
            this.errMsg = errMsg;
        }
        /**
         * @see org.eclipse.swt.events.KeyAdapter#keyPressed(
         *          org.eclipse.swt.events.KeyEvent)
         */
        public void keyReleased(KeyEvent event) {
            Text text = (Text) event.widget;
            String value = text.getText(); 
            event.doit = value.matches("^\\d*$"); //$NON-NLS-1$
            if (event.doit) {
                errors.remove(text);
                if (errors.isEmpty()) {
                    setErrorMessage(null);
                    setValid(true);
                } else {
                    setErrorMessage(errors.values().iterator().next());
                }
            } else {
                errors.put(text, errMsg);
                setErrorMessage(errMsg);
                setValid(false);
            }
        }
    }

    protected class DoubleTextValidatorKeyListener extends KeyAdapter {
        
        private String errMsg;
        private double minValue;
        private double maxValue;
        
        /**
         * Constructor.
         * @param errMsg error message
         */
        public DoubleTextValidatorKeyListener(String errMsg) {
            super();
            this.errMsg = errMsg;
        }
        /**
         * Constructor.
         * @param errMsg error message
         * @param minValue minimum value (inclusive)
         * @param maxValue maximum value (inclusive)
         */
        public DoubleTextValidatorKeyListener(
                String errMsg, double minValue, double maxValue) {
            super();
            this.errMsg = errMsg;
            this.minValue = minValue;
            this.maxValue = maxValue;
        }
        
        /**
         * @see org.eclipse.swt.events.KeyAdapter#keyPressed(
         *          org.eclipse.swt.events.KeyEvent)
         */
        public void keyReleased(KeyEvent event) {
            Text text = (Text) event.widget;
            String value = text.getText(); 
            boolean valid = value.length() > 0;
            if (valid) {
                valid = value.matches("^\\d*\\.?\\d*$"); //$NON-NLS-1$
            }
            if (valid && minValue != maxValue) {
                double doubleValue = Double.parseDouble(value);
                valid = doubleValue >= minValue && doubleValue <= maxValue;
            }
            event.doit = valid;
            if (event.doit) {
                errors.remove(text);
                if (errors.isEmpty()) {
                    setErrorMessage(null);
                    setValid(true);
                } else {
                    setErrorMessage(errors.values().iterator().next());
                }
            } else {
                errors.put(text, errMsg);
                setErrorMessage(errMsg);
                setValid(false);
            }
        }
    }
    

    protected IEclipsePreferences getEclipsePreferenceStore() {
 	   return InstanceScope.INSTANCE.getNode(RBEPlugin.ID);
    }

    
    protected void setWidthInChars(Control field, int widthInChars) {
        GridData gd = new GridData();
        gd.widthHint = UIUtils.getWidthInChars(field, widthInChars);
        field.setLayoutData(gd);
    }
}
