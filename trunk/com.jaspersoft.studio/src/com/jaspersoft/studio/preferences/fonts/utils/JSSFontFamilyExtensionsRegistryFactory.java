package com.jaspersoft.studio.preferences.fonts.utils;

import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.fonts.SimpleFontExtensionsRegistryFactory;
import net.sf.jasperreports.extensions.ExtensionsRegistry;

public class JSSFontFamilyExtensionsRegistryFactory extends SimpleFontExtensionsRegistryFactory {

	@Override
	public ExtensionsRegistry createRegistry(String registryId, JRPropertiesMap properties) {
		return new JSSFontExtensionRegistry(properties);
	}
}
