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

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.essiembre.eclipse.rbe.RBEPlugin;
import com.essiembre.eclipse.rbe.model.workbench.RBEPreferences;
import com.essiembre.eclipse.rbe.ui.UIUtils;


/**
 * Plugin generic preference page.
 * @author Pascal Essiembre (essiembre@users.sourceforge.net)
 * @version $Author: cuhiodtick $ $Revision: 1.9 $ $Date: 2012/07/29 17:51:56 $
 */
public class RBEGeneralPrefPage extends AbstractRBEPrefPage {

   /* Preference fields. */
   private Text   keyGroupSeparator;

   private Button convertEncodedToUnicode;

   private Button supportNL;
   private Button supportFragments;
   private Button loadOnlyFragmentResources;

   private Button keyTreeHierarchical;
   private Button keyTreeExpanded;

   private Button fieldTabInserts;

   private Button noTreeInEditor;

   private Button autoAdjust;
   private Text   _minHeight;

   private Font   _boldFont;


   /**
    * Constructor.
    */
   public RBEGeneralPrefPage() {
      super();
   }

   @Override
   public void dispose() {
      super.dispose();
      _boldFont.dispose();
   }

   /**
    * @see org.eclipse.jface.preference.IPreferencePage#performOk()
    */
   @Override
   public boolean performOk() {
	  IEclipsePreferences prefs = getEclipsePreferenceStore();
      prefs.put(RBEPreferences.KEY_GROUP_SEPARATOR, keyGroupSeparator.getText());
      prefs.putBoolean(RBEPreferences.CONVERT_ENCODED_TO_UNICODE, convertEncodedToUnicode.getSelection());
      prefs.putBoolean(RBEPreferences.SUPPORT_NL, supportNL.getSelection());
      prefs.putBoolean(RBEPreferences.KEY_TREE_HIERARCHICAL, keyTreeHierarchical.getSelection());
      prefs.putBoolean(RBEPreferences.KEY_TREE_EXPANDED, keyTreeExpanded.getSelection());
      prefs.putBoolean(RBEPreferences.FIELD_TAB_INSERTS, fieldTabInserts.getSelection());
      prefs.putBoolean(RBEPreferences.NO_TREE_IN_EDITOR, noTreeInEditor.getSelection());
      prefs.putInt(RBEPreferences.MIN_HEIGHT, Integer.parseInt(_minHeight.getText()));
      prefs.putBoolean(RBEPreferences.AUTO_ADJUST, autoAdjust.getSelection());

      refreshEnabledStatuses();
      return super.performOk();
   }

   /**
    * @see org.eclipse.jface.preference.PreferencePage
    *         #createContents(org.eclipse.swt.widgets.Composite)
    */
   @Override
   protected Control createContents( Composite parent ) {
	  IEclipsePreferences prefs = getEclipsePreferenceStore();
      Composite field = null;
      Composite composite = new Composite(parent, SWT.NONE);
      composite.setLayout(new GridLayout(1, false));

      // Key group separator
      field = createFieldComposite(composite);
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.groupSep")); //$NON-NLS-1$
      keyGroupSeparator = new Text(field, SWT.BORDER);
      keyGroupSeparator.setText(prefs.get(RBEPreferences.KEY_GROUP_SEPARATOR, IPreferenceStore.STRING_DEFAULT_DEFAULT));
      keyGroupSeparator.setTextLimit(2);

      // Convert encoded to unicode?
      field = createFieldComposite(composite);
      convertEncodedToUnicode = new Button(field, SWT.CHECK);
      convertEncodedToUnicode.setSelection(prefs.getBoolean(RBEPreferences.CONVERT_ENCODED_TO_UNICODE, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.convertEncoded")); //$NON-NLS-1$

      // Support "NL" localization structure
      field = createFieldComposite(composite);
      supportNL = new Button(field, SWT.CHECK);
      supportNL.setSelection(prefs.getBoolean(RBEPreferences.SUPPORT_NL, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.supportNL")); //$NON-NLS-1$

      // Support loading resources from fragment 
      field = createFieldComposite(composite);
      supportFragments = new Button(field, SWT.CHECK);
      supportFragments.setSelection(RBEPreferences.getSupportFragments());
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.supportFragments")); //$NON-NLS-1$

      // Support loading resources from fragment 
      field = createFieldComposite(composite);
      loadOnlyFragmentResources = new Button(field, SWT.CHECK);
      loadOnlyFragmentResources.setSelection(RBEPreferences.getLoadOnlyFragmentResources());
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.loadOnlyFragmentResources")); //$NON-NLS-1$

      // Default key tree mode (tree vs flat)
      field = createFieldComposite(composite);
      keyTreeHierarchical = new Button(field, SWT.CHECK);
      keyTreeHierarchical.setSelection(prefs.getBoolean(RBEPreferences.KEY_TREE_HIERARCHICAL, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.keyTree.hierarchical"));//$NON-NLS-1$

      // Default key tree expand status (expanded vs collapsed)
      field = createFieldComposite(composite);
      keyTreeExpanded = new Button(field, SWT.CHECK);
      keyTreeExpanded.setSelection(prefs.getBoolean(RBEPreferences.KEY_TREE_EXPANDED, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT)); //$NON-NLS-1$
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.keyTree.expanded")); //$NON-NLS-1$

      // Default tab key behaviour in text field
      field = createFieldComposite(composite);
      fieldTabInserts = new Button(field, SWT.CHECK);
      fieldTabInserts.setSelection(prefs.getBoolean(RBEPreferences.FIELD_TAB_INSERTS, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.fieldTabInserts")); //$NON-NLS-1$

      field = createFieldComposite(composite);
      noTreeInEditor = new Button(field, SWT.CHECK);
      noTreeInEditor.setSelection(prefs.getBoolean(RBEPreferences.NO_TREE_IN_EDITOR, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT)); //$NON-NLS-1$
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.noTreeInEditor")); //$NON-NLS-1$

      Label desc = new Label(composite, SWT.READ_ONLY);
      desc.setText(RBEPlugin.getString("prefs.properties-desc"));
      _boldFont = UIUtils.createFont(desc, SWT.BOLD);
      desc.setFont(_boldFont);

      field = createFieldComposite(composite);
      autoAdjust = new Button(field, SWT.CHECK);
      autoAdjust.setSelection(prefs.getBoolean(RBEPreferences.AUTO_ADJUST, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT)); //$NON-NLS-1$
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.autoAdjust")); //$NON-NLS-1$
      autoAdjust.addSelectionListener(new SelectionAdapter() {
         public void widgetSelected(SelectionEvent event) {
             refreshEnabledStatuses();
         }
     });

      field = createFieldComposite(composite);
      new Label(field, SWT.NONE).setText(RBEPlugin.getString("prefs.minHeight")); //$NON-NLS-1$
      _minHeight = new Text(field, SWT.BORDER);
      _minHeight.setText(Integer.toString(prefs.getInt(RBEPreferences.MIN_HEIGHT, IPreferenceStore.INT_DEFAULT_DEFAULT)));
      _minHeight.setTextLimit(3);
      setWidthInChars(_minHeight, 3);
      _minHeight.addKeyListener(new IntTextValidatorKeyListener(RBEPlugin.getString("prefs.minHeight.error"))); //$NON-NLS-1$        

      refreshEnabledStatuses();
      return composite;
   }
   
   /**
    * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
    */
   @Override
   protected void performDefaults() {
	  IEclipsePreferences prefs = getEclipsePreferenceStore();
      keyGroupSeparator.setText(prefs.get(RBEPreferences.KEY_GROUP_SEPARATOR, IPreferenceStore.STRING_DEFAULT_DEFAULT));
      convertEncodedToUnicode.setSelection(prefs.getBoolean(RBEPreferences.CONVERT_ENCODED_TO_UNICODE, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      supportNL.setSelection(prefs.getBoolean(RBEPreferences.SUPPORT_NL, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      keyTreeHierarchical.setSelection(prefs.getBoolean(RBEPreferences.KEY_TREE_HIERARCHICAL, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      keyTreeHierarchical.setSelection(prefs.getBoolean(RBEPreferences.KEY_TREE_EXPANDED, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      fieldTabInserts.setSelection(prefs.getBoolean(RBEPreferences.FIELD_TAB_INSERTS, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      autoAdjust.setSelection(prefs.getBoolean(RBEPreferences.AUTO_ADJUST, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT));
      _minHeight.setText(Integer.toString(prefs.getInt(RBEPreferences.MIN_HEIGHT, IPreferenceStore.INT_DEFAULT_DEFAULT)));

      refreshEnabledStatuses();
      super.performDefaults();
   }

   private void refreshEnabledStatuses() {
      boolean isAutoAdjust = autoAdjust.getSelection();
      _minHeight.setEnabled(!isAutoAdjust);
   }

}
