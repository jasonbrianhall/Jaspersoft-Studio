package com.jaspersoft.studio.preferences.editor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.swt.widgets.Composite;

public class LocaleFieldEditor extends ComboFieldEditor {

	public LocaleFieldEditor(String name, String labelText, Composite parent) {
		super(name, labelText, getLocales(), parent);
	}

	private static String[][] locs;

	private static String[][] getLocales() {
		if (locs == null) {
			Locale[] locales = Locale.getAvailableLocales();
			sortLocalesOnToString(locales);
			locs = new String[locales.length][2];
			for (int i = 0; i < locs.length; i++) {
				locs[i][0] = locales[i].getDisplayName();
				locs[i][1] = locales[i].toString();
			}
		}
		return locs;
	}

	public static void sortLocalesOnToString(Locale[] locales) {
		Comparator<Locale> localeComparator = new Comparator<Locale>() {
			public int compare(Locale locale1, Locale locale2) {
				return locale1.toString().compareTo(locale2.toString());
			}
		};
		Arrays.sort(locales, localeComparator);
	}
}
