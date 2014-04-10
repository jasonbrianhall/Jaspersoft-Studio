/*******************************************************************************
 * Copyright (c) 2007 Pascal Essiembre.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Pascal Essiembre - initial API and implementation
 *    Alexej Strelzow - externalized IPropertiesSerializerConfig and 
 *    					IPropertiesDeserializerConfig for better reuse
 ******************************************************************************/
package org.eclipse.babel.editor.preferences;

import org.eclipse.babel.core.message.resource.ser.IPropertiesDeserializerConfig;
import org.eclipse.babel.core.message.resource.ser.IPropertiesSerializerConfig;
import org.eclipse.babel.editor.IMessagesEditorChangeListener;
import org.eclipse.babel.editor.plugin.MessagesEditorPlugin;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Messages Editor preferences.
 * 
 * @author Pascal Essiembre (pascal@essiembre.com)
 */
public final class MsgEditorPreferences{

	
    /**
     * Locales filter and order defined as a comma separated list of string
     * matchers
     */
    public static final String FILTER_LOCALES_STRING_MATCHERS = "localesFilterStringMatchers";
	
    /**
     * When true the builder that validates translation files is automatically
     * added to java projects when the plugin is started or when a new project
     * is added.
     */
    public static final String ADD_MSG_EDITOR_BUILDER_TO_JAVA_PROJECTS = "addMsgEditorBuilderToJavaProjects";
    
    
    
    
    
    
    
    
    
	
	  /** Key group separator. */
    public static final String KEY_GROUP_SEPARATOR =
            "keyGroupSeparator"; //$NON-NLS-1$

    /** Should key tree be hiearchical by default. */
    public static final String KEY_TREE_HIERARCHICAL =
            "keyTreeHierarchical"; //$NON-NLS-1$
    /** Should key tree be expanded by default. */
    public static final String KEY_TREE_EXPANDED = 
            "keyTreeExpanded"; //$NON-NLS-1$
    
    /** Should "Generated by" line be added to files. */
    public static final String SHOW_GENERATOR = "showGenerator"; //$NON-NLS-1$

    /** Should Eclipse "nl" directory structure be supported. */
    public static final String SUPPORT_NL = "supportNL"; //$NON-NLS-1$

    /** Should resources also be loaded from fragments. */
    public static final String SUPPORT_FRAGMENTS = "supportFragments"; //$NON-NLS-1$
    /** 
     * Load only fragment resources when loading from fragments.
     * The default bundle is mostly located in the host plug-in. 
     */
    public static final String LOAD_ONLY_FRAGMENT_RESOURCES = "loadOnlyFragmentResources";
    
    /** Should tab characters be inserted when tab key pressed on text field. */
    public static final String FIELD_TAB_INSERTS = 
            "fieldTabInserts"; //$NON-NLS-1$

    /** Should equal signs be aligned. */
    public static final String ALIGN_EQUAL_SIGNS = 
            "alignEqualSigns"; //$NON-NLS-1$
    /** Should spaces be put around equal signs. */
    public static final String SPACES_AROUND_EQUAL_SIGNS = 
            "spacesAroundEqualSigns"; //$NON-NLS-1$

    /** Should keys be grouped. */
    public static final String GROUP_KEYS = "groupKeys"; //$NON-NLS-1$
    /** How many level deep should keys be grouped. */
    public static final String GROUP_LEVEL_DEEP = 
            "groupLevelDeep"; //$NON-NLS-1$
    /** How many line breaks between key groups. */
    public static final String GROUP_LINE_BREAKS =
            "groupLineBreaks"; //$NON-NLS-1$
    /** Should equal signs be aligned within groups. */
    public static final String GROUP_ALIGN_EQUAL_SIGNS = 
            "groupAlignEqualSigns"; //$NON-NLS-1$

    /** Should lines be wrapped. */
    public static final String WRAP_LINES = "wrapLines"; //$NON-NLS-1$
    /** Maximum number of character after which we should wrap. */
    public static final String WRAP_CHAR_LIMIT = "wrapCharLimit"; //$NON-NLS-1$
    /** Align subsequent lines with equal signs. */
    public static final String WRAP_ALIGN_EQUAL_SIGNS = 
            "wrapAlignEqualSigns"; //$NON-NLS-1$
    /** Number of spaces to indent subsequent lines. */
    public static final String WRAP_INDENT_SPACES = 
            "wrapIndentSpaces"; //$NON-NLS-1$
    
    /** Should unicode values be converted to their encoded equivalent. */
    public static final String CONVERT_UNICODE_TO_ENCODED = 
            "convertUnicodeToEncoded"; //$NON-NLS-1$
    /** Should unicode values be converted to their encoded equivalent. */
    public static final String CONVERT_UNICODE_TO_ENCODED_UPPER = 
            "convertUnicodeToEncodedUppercase"; //$NON-NLS-1$
    /** Should encoded values be converted to their unicode equivalent. */
    public static final String CONVERT_ENCODED_TO_UNICODE = 
            "convertEncodedToUnicode"; //$NON-NLS-1$
    
    /** Impose a given new line type. */
    public static final String FORCE_NEW_LINE_TYPE = 
            "forceNewLineType"; //$NON-NLS-1$
    /** How new lines are represented in resource bundle. */
    public static final String NEW_LINE_TYPE = "newLineType"; //$NON-NLS-1$
    /** Should new lines character produce a line break in properties files. */
    public static final String NEW_LINE_NICE = "newLineNice"; //$NON-NLS-1$
    
    /** New Line Type: UNIX. */
    public static final int NEW_LINE_UNIX = 0;
    /** New Line Type: Windows. */
    public static final int NEW_LINE_WIN = 1;
    /** New Line Type: Mac. */
    public static final int NEW_LINE_MAC = 2;

    /** Report missing values. */
    public static final String REPORT_MISSING_VALUES = 
            "detectMissingValues"; //$NON-NLS-1$
    /** Report duplicate values. */
    public static final String REPORT_DUPL_VALUES = 
            "reportDuplicateValues"; //$NON-NLS-1$
    /** Report similar values. */
    public static final String REPORT_SIM_VALUES = 
            "reportSimilarValues"; //$NON-NLS-1$
    /** Report similar values: word compare. */
    public static final String REPORT_SIM_VALUES_WORD_COMPARE = 
            "reportSimilarValuesWordCompare"; //$NON-NLS-1$
    /** Report similar values: levensthein distance. */
    public static final String REPORT_SIM_VALUES_LEVENSTHEIN = 
            "reportSimilarValuesLevensthein"; //$NON-NLS-1$
    /** Report similar values: precision. */
    public static final String REPORT_SIM_VALUES_PRECISION = 
            "reportSimilarValuesPrecision"; //$NON-NLS-1$
    
    /** Don't show the tree within the editor. */
    public static final String NO_TREE_IN_EDITOR =
            "noTreeInEditor"; //$NON-NLS-1$

    /** Keep empty fields. */
    public static final String KEEP_EMPTY_FIELDS = 
            "keepEmptyFields"; //$NON-NLS-1$
    
    public static final String       MIN_HEIGHT                       = "minHeight";    //$NON-NLS-1$                               //$NON-NLS-1$
    public static final String       AUTO_ADJUST                      = "autoAdjust";   //$NON-NLS-1$                              //$NON-NLS-1$

    
  
    
    private static final IEclipsePreferences PREFS = getEclipsePreferenceStore();
	
    /**
     * Constructor.
     */
    private MsgEditorPreferences() {
        super();
    }
    
    
    /** Should encoded values be converted to their unicode equivalent. */
    public static final String UNICODE_UNESCAPE_ENABLED = "unicodeUnescapeEnabled"; //$NON-NLS-1$
    
    /** Should Eclipse "nl" directory structure be supported. */
    public static final String NL_SUPPORT_ENABLED = "nLSupportEnabled"; //$NON-NLS-1$
    
    /**
     * Load only fragment resources when loading from fragments. The default
     * bundle is mostly located in the host plug-in.
     */
    public static final String LOADING_ONLY_FRAGMENT_RESOURCES = "loadingOnlyFragmentResources";
    
    /**
     * holds what filter is activated. for the properties displayed in the
     * editor.
     */
    public static final String PROPERTIES_DISPLAYED_FILTER = "propertiesFilter";
    
    /** Should unicode values be converted to their encoded equivalent. */
    public static final String UNICODE_ESCAPE_ENABLED = "unicodeEscapeEnabled"; //$NON-NLS-1$
    
    /** Should unicode values be converted to their encoded equivalent. */
    public static final String UNICODE_ESCAPE_UPPERCASE = "unicodeEscapeUppercase"; //$NON-NLS-1$
    
    /** Should spaces be put around equal signs. */
    public static final String SPACES_AROUND_EQUALS_ENABLED = "spacesAroundEqualsEnabled"; //$NON-NLS-1$
    
    /** Key group separator. */
    public static final String GROUP__LEVEL_SEPARATOR = "groupLevelSeparator"; //$NON-NLS-1$
    
    /** Should equal signs be aligned. */
    public static final String ALIGN_EQUALS_ENABLED = "alignEqualsEnabled"; //$NON-NLS-1$
    
    /** Should "Generated by" line be added to files. */
    public static final String SHOW_SUPPORT_ENABLED = "showSupportEnabled"; //$NON-NLS-1$
    
    /** Should keys be grouped. */
    public static final String GROUP_KEYS_ENABLED = "groupKeysEnabled"; //$NON-NLS-1$
    
    /** How many line breaks between key groups. */
    public static final String GROUP_SEP_BLANK_LINE_COUNT = "groupSepBlankLineCount"; //$NON-NLS-1$
    
    /** Should equal signs be aligned within groups. */
    public static final String GROUP_ALIGN_EQUALS_ENABLED = "groupAlignEqualsEnabled"; //$NON-NLS-1$
    
    /** Maximum number of character after which we should wrap. */
    public static final String WRAP_LINE_LENGTH = "wrapLineLength"; //$NON-NLS-1$
    
    /** Number of spaces to indent subsequent lines. */
    public static final String WRAP_INDENT_LENGTH = "wrapIndentLength"; //$NON-NLS-1$
    
    /** How new lines are represented in resource bundle. */
    public static final String NEW_LINE_STYLE = "newLineStyle"; //$NON-NLS-1$
    
    /** Sort keys. */
    public static final String SORT_KEYS = "sortKeys"; //$NON-NLS-1$
    
    /**
     * Report missing values with given level of reporting: IGNORE, INFO,
     * WARNING, ERROR.
     */
    public static final String REPORT_MISSING_VALUES_LEVEL = "detectMissingValuesLevel"; //$NON-NLS-1$
    

    /**
     * the corresponding validation message with such a preference should not be
     * generated
     */
    public static final int VALIDATION_MESSAGE_IGNORE = 0;
    /**
     * the corresponding validation message with such a preference should
     * generate a marker with severity 'info'
     */
    public static final int VALIDATION_MESSAGE_INFO = 1;
    
    /**
     * the corresponding validation message with such a preference should
     * generate a marker with severity 'warning'
     */
    public static final int VALIDATION_MESSAGE_WARNING = 2;
    
    /**
     * the corresponding validation message with such a preference should
     * generate a marker with severity 'error'
     */
    public static final int VALIDATION_MESSAGE_ERROR = 3;
    
    /** Report duplicate values. */
    public static final String REPORT_DUPL_VALUES_LEVEL = "reportDuplicateValuesLevel"; //$NON-NLS-1$
    
    
    /** Report duplicate values. */
    public static final String REPORT_DUPL_VALUES_ONLY_IN_ROOT_LOCALE = "reportDuplicateValuesOnlyInRootLocale"; //$NON-NLS-1$
    
    /** Don't show the tree within the editor. */
    public static final String EDITOR_TREE_HIDDEN = "editorTreeHidden"; //$NON-NLS-1$
    
    /** Should lines be wrapped. */
    public static final String WRAP_LINES_ENABLED = "wrapLinesEnabled"; //$NON-NLS-1$
    
    /** Align subsequent lines with equal signs. */
    public static final String WRAP_ALIGN_EQUALS_ENABLED = "wrapAlignEqualsEnabled"; //$NON-NLS-1$
    
    /** Report similar values. */
    public static final String REPORT_SIM_VALUES_LEVEL = "reportSimilarValuesLevel"; //$NON-NLS-1$
    
    
    public static boolean getUnicodeUnescapeEnabled() {
        return PREFS.getBoolean(UNICODE_UNESCAPE_ENABLED, true);
    }
    
    public static boolean getNLSupportEnabled() {
        return PREFS.getBoolean(NL_SUPPORT_ENABLED, true);
    }
    
    public static boolean getLoadingOnlyFragmentResources() {
        return PREFS.getBoolean(LOADING_ONLY_FRAGMENT_RESOURCES, false);
    }
     
    public static int getPropertiesDisplayedFilter() {
        return PREFS.getInt(PROPERTIES_DISPLAYED_FILTER, IMessagesEditorChangeListener.SHOW_ALL);
    }

    public static boolean getUnicodeEscapeEnabled() {
        return PREFS.getBoolean(UNICODE_ESCAPE_ENABLED, true);
    }
    
    public static boolean getUnicodeEscapeUppercase() {
        return PREFS.getBoolean(UNICODE_ESCAPE_UPPERCASE, true);
    }

    public static boolean getSpacesAroundEqualsEnabled() {
        return PREFS.getBoolean(SPACES_AROUND_EQUALS_ENABLED, true);
    }

    public static String getGroupLevelSeparator() {
        return PREFS.get(GROUP__LEVEL_SEPARATOR, ".");
    }
    
    public static boolean getAlignEqualsEnabled() {
        return PREFS.getBoolean(ALIGN_EQUALS_ENABLED, true);
    }

    public static boolean getShowSupportEnabled() {
        return PREFS.getBoolean(SHOW_SUPPORT_ENABLED, true);
    }
    
    public static boolean getGroupKeysEnabled() {
        return PREFS.getBoolean(GROUP_KEYS_ENABLED, true);
    }

    public static int getGroupSeparatorBlankLineCount() {
        return PREFS.getInt(GROUP_SEP_BLANK_LINE_COUNT, 1);
    }

    public static boolean getGroupAlignEqualsEnabled() {
        return PREFS.getBoolean(GROUP_ALIGN_EQUALS_ENABLED, true);
    }

    public static int getWrapLineLength() {
        return PREFS.getInt(WRAP_LINE_LENGTH, 80);
    }
    
    public static int getWrapIndentLength() {
        return PREFS.getInt(WRAP_INDENT_LENGTH, 8);
    }

    public static int getNewLineStyle() {
        return PREFS.getInt(NEW_LINE_STYLE, IPropertiesSerializerConfig.NEW_LINE_UNIX);
    }

    public static boolean getSortkeys() {
        return PREFS.getBoolean(SORT_KEYS, true);
    }
    
    public static int getReportMissingValuesLevel() {
        return PREFS.getInt(REPORT_MISSING_VALUES_LEVEL, VALIDATION_MESSAGE_ERROR);
    }
    
    public static int getReportDuplicateValuesLevel() {
        return PREFS.getInt(REPORT_DUPL_VALUES_LEVEL, VALIDATION_MESSAGE_WARNING);
    }
    
    public static boolean getReportDuplicateValuesOnlyInRootLocales() {
        return PREFS.getBoolean(REPORT_DUPL_VALUES_ONLY_IN_ROOT_LOCALE, true);
    }

    public static boolean getEditorTreeHidden() {
        return PREFS.getBoolean(EDITOR_TREE_HIDDEN, false);
    }

    /**
     * Gets whether lines should be wrapped if too big when generating file.
     * 
     * @return <code>true</code> if wrapped
     */
    public static boolean isWrapLinesEnabled() {
        return PREFS.getBoolean(WRAP_LINES_ENABLED, true);
    }

    /**
     * Gets whether wrapped lines should be aligned with equal sign when
     * generating file.
     * 
     * @return <code>true</code> if aligned
     */
    public static boolean isWrapAlignEqualsEnabled() {
        return PREFS.getBoolean(WRAP_ALIGN_EQUALS_ENABLED, true);
    }
    

    /**
     * Gets key group separator.
     * @return key group separator.
     */
    public static String getKeyGroupSeparator() {
        return PREFS.get(KEY_GROUP_SEPARATOR, ".");
    }

    /**
     * Gets whether pressing tab inserts a tab in a field.
     * @return <code>true</code> if pressing tab inserts a tab in a field
     */
    public static boolean getFieldTabInserts() {
        return PREFS.getBoolean(FIELD_TAB_INSERTS, true);
    }
    
    /**
     * Gets whether equals signs should be aligned when generating file.
     * @return <code>true</code> if equals signs should be aligned
     */
    public static boolean getAlignEqualSigns() {
        return PREFS.getBoolean(ALIGN_EQUAL_SIGNS, true);
    }

    /**
     * Gets whether there should be spaces around equals signs when generating 
     * file.
     * @return <code>true</code> there if should be spaces around equals signs
     */
    public static boolean getSpacesAroundEqualSigns() {
        return PREFS.getBoolean(SPACES_AROUND_EQUAL_SIGNS, true);
    }

    /**
     * Gets whether keys should be grouped when generating file.
     * @return <code>true</code> if keys should be grouped
     */
    public static boolean getGroupKeys() {
        return PREFS.getBoolean(GROUP_KEYS, true);
    }

    /**
     * Gets how many level deep keys should be grouped when generating file.
     * @return how many level deep
     */
    public static int getGroupLevelDeepness() {
        return PREFS.getInt(GROUP_LEVEL_DEEP, 1);
    }
    
    /**
     * Gets how many blank lines should separate groups when generating file.
     * @return how many blank lines between groups
     */
    public static int getGroupLineBreaks() {
        return PREFS.getInt(GROUP_LINE_BREAKS, 1);
    }

    /**
     * Gets whether equal signs should be aligned within each groups when
     * generating file.
     * @return <code>true</code> if equal signs should be aligned within groups
     */
    public static boolean getGroupAlignEqualSigns() {
        return PREFS.getBoolean(GROUP_ALIGN_EQUAL_SIGNS, true);
    }

    /**
     * Gets whether key tree should be displayed in hiearchical way by default.
     * @return <code>true</code> if hierarchical
     */
    public static boolean getKeyTreeHierarchical() {
        return PREFS.getBoolean(KEY_TREE_HIERARCHICAL, true);
    }
    /**
     * Gets whether key tree should be show expaned by default.
     * @return <code>true</code> if expanded
     */
    public static boolean getKeyTreeExpanded() {
        return PREFS.getBoolean(KEY_TREE_EXPANDED, true);
    }

    /**
     * Gets whether to print "Generated By..." comment when generating file.
     * @return <code>true</code> if we print it
     */
    public static boolean getShowGenerator() {
        return PREFS.getBoolean(SHOW_GENERATOR, true);
    }

    /**
     * Gets whether to support Eclipse NL directory structure.
     * @return <code>true</code> if supported
     */
    public static boolean getSupportNL() {
        return PREFS.getBoolean(SUPPORT_NL, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT);
    }
    
    /**
     * Gets whether to support resources found in fragments.
     * @return <code>true</code> if supported
     */
    public static boolean getLoadOnlyFragmentResources() {
        return PREFS.getBoolean(LOAD_ONLY_FRAGMENT_RESOURCES, false);
    }
    
    /**
     * Gets whether to support resources found in fragments.
     * @return <code>true</code> if supported
     */
    public static boolean getSupportFragments() {
        return PREFS.getBoolean(SUPPORT_FRAGMENTS, true);
    }
    
    /**
     * Gets whether lines should be wrapped if too big when generating file.
     * @return <code>true</code> if wrapped
     */
    public static boolean getWrapLines() {
        return PREFS.getBoolean(WRAP_LINES, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT);
    }
    
    /**
     * Gets the number of character after which lines should be wrapped when
     * generating file.
     * @return number of characters
     */
    public static int getWrapCharLimit() {
        return PREFS.getInt(WRAP_CHAR_LIMIT, 80);
    }

    /**
     * Gets whether wrapped lines should be aligned with equal sign when
     * generating file.
     * @return <code>true</code> if aligned
     */
    public static boolean getWrapAlignEqualSigns() {
        return PREFS.getBoolean(WRAP_ALIGN_EQUAL_SIGNS, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT);
    }

    /**
     * Gets the number of spaces to use for indentation of wrapped lines when
     * generating file.
     * @return number of spaces
     */
    public static int getWrapIndentSpaces() {
        return PREFS.getInt(WRAP_INDENT_SPACES, 8);
    }

    /**
     * Gets whether to convert encoded strings to unicode characters when
     * reading file.
     * @return <code>true</code> if converting
     */
    public static boolean getConvertEncodedToUnicode() {
        return PREFS.getBoolean(CONVERT_ENCODED_TO_UNICODE, true);
    }

    /**
     * Gets whether to escape unicode characters when generating file.
     * @return <code>true</code> if escaping
     */
    public static boolean getConvertUnicodeToEncoded() {
        return PREFS.getBoolean(CONVERT_UNICODE_TO_ENCODED, true);
    }
    /**
     * Gets whether escaped unicode "alpha" characters should be uppercase
     * when generating file. 
     * @return <code>true</code> if uppercase
     */
    public static boolean getConvertUnicodeToEncodedUpper() {
        return PREFS.getBoolean(CONVERT_UNICODE_TO_ENCODED_UPPER, true);
    }

    /**
     * Gets whether we want to overwrite system (or Eclipse) default new line
     * type when generating file.
     * @return <code>true</code> if overwriting
     */
    public static boolean getForceNewLineType() {
        return PREFS.getBoolean(FORCE_NEW_LINE_TYPE, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT);
    }

    /**
     * Gets the new line type to use when overwriting system (or Eclipse)
     * default new line type when generating file.  Use constants to this
     * effect.
     * @return new line type
     */
    public static int getNewLineType() {
        return PREFS.getInt(NEW_LINE_TYPE, IPropertiesSerializerConfig.NEW_LINE_UNIX);
    }
    
    /**
     * Gets whether new lines are escaped or printed as is when generating file.
     * @return <code>true</code> if printed as is.
     */
    public static boolean getNewLineNice() {
        return PREFS.getBoolean(NEW_LINE_NICE, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT);
    }

    /**
     * Gets whether to report keys with missing values.
     * @return <code>true</code> if reporting
     */
    public static boolean getReportMissingValues() {
        return PREFS.getBoolean(REPORT_MISSING_VALUES, true);
    }
    
    /**
     * Gets whether to report keys with duplicate values.
     * @return <code>true</code> if reporting
     */
    public static boolean getReportDuplicateValues() {
        return PREFS.getBoolean(REPORT_DUPL_VALUES, true);
    }
    
    /**
     * Gets whether to report keys with similar values.
     * @return <code>true</code> if reporting
     */
    public static boolean getReportSimilarValues() {
        return PREFS.getBoolean(REPORT_SIM_VALUES, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT);
    }

    /**
     * Gets whether to use the "word compare" method when reporting similar
     * values.
     * @return <code>true</code> if using "word compare" method
     */
    public static boolean getReportSimilarValuesWordCompare() {
        return PREFS.getBoolean(REPORT_SIM_VALUES_WORD_COMPARE, true);
    }

    /**
     * Gets whether to use the Levensthein method when reporting similar
     * values.
     * @return <code>true</code> if using Levensthein method
     */
    public static boolean getReportSimilarValuesLevensthein() {
        return PREFS.getBoolean(REPORT_SIM_VALUES_LEVENSTHEIN, IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT);
    }

    /**
     * Gets the minimum precision level to use for determining when to report
     * similarities. 
     * @return precision
     */
    public static double getReportSimilarValuesPrecision() {
        return PREFS.getDouble(REPORT_SIM_VALUES_PRECISION, 0.75d);
    }

    /**
     * Gets whether a tree shall be displayed within the editor or not.
     * @return <code>true</code> A tree shall not be displayed.
     */
    public static boolean getNoTreeInEditor() {
        return PREFS.getBoolean(NO_TREE_IN_EDITOR, false);
    }
    
    /**
     * Gets whether to keep empty fields.
     * @return <code>true</code> if empty fields are to be kept.
     */
    public static boolean getKeepEmptyFields() {
        return PREFS.getBoolean(KEEP_EMPTY_FIELDS, false);
    }

    
    public static boolean getAutoAdjust() {
       return PREFS.getBoolean(AUTO_ADJUST, true);
    }
 
    public static int getMinHeight() {
       return PREFS.getInt(MIN_HEIGHT, IPreferenceStore.INT_DEFAULT_DEFAULT);
    }

    
    public static IEclipsePreferences getEclipsePreferenceStore() {
  	   return InstanceScope.INSTANCE.getNode(MessagesEditorPlugin.PLUGIN_ID);
     }
    
    /**
     * @return a comma separated list of locales-string-matchers.
     *         <p>
     *         Note: StringMatcher is an internal API duplicated in many
     *         different places of eclipse. The only project that decided to
     *         make it public is GMF (org.eclipse.gmf.runtime.common.core.util)
     *         Although they have been request to make it public since 2001:
     *         http://dev.eclipse.org/newslists/news.eclipse.tools/msg00666.html
     *         </p>
     *         <p>
     *         We choose org.eclipse.ui.internal.misc in the
     *         org.eclipse.ui.workbench plugin as it is part of RCP; the most
     *         common one.
     *         </p>
     */
    public static String getFilterLocalesStringMatcher() {
        return PREFS.get(FILTER_LOCALES_STRING_MATCHERS, "*");
    }
    

    /**
     * Gets whether the rbe nature and rbe builder are automatically setup on
     * java projects in the workspace.
     * 
     * @return <code>true</code> Setup automatically the rbe builder on java
     *         projects.
     */
    public static boolean isBuilderSetupAutomatically() {
        return PREFS.getBoolean(ADD_MSG_EDITOR_BUILDER_TO_JAVA_PROJECTS, true);
    }
    
    
    public static IPropertiesSerializerConfig getSerializerConfig() {
        return new PropertiesSerializerConfig();
    }

    public static IPropertiesDeserializerConfig getDeserializerConfig() {
        return new PropertiesDeserializerConfig();
    }
    

}