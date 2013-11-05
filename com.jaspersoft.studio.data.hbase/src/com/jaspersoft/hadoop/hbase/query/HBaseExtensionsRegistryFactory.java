package com.jaspersoft.hadoop.hbase.query;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.data.DataAdapterServiceFactory;
import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.query.JRQueryExecuterFactoryBundle;
import net.sf.jasperreports.extensions.ExtensionsRegistry;
import net.sf.jasperreports.extensions.ExtensionsRegistryFactory;

import com.jaspersoft.studio.data.hbase.HBaseDataAdapterServiceFactoryImpl;

/**
 * 
 * @author Eric Diaz
 * 
 */
public class HBaseExtensionsRegistryFactory implements ExtensionsRegistryFactory {
	private static List<DataAdapterServiceFactory> dataAdapterServiceFactories;
	private static List<JRQueryExecuterFactoryBundle> queryExecuterFactories;

	private static final ExtensionsRegistry extensionsRegistry = new ExtensionsRegistry() {
		@SuppressWarnings("unchecked")
		public <T> List<T> getExtensions(Class<T> extensionType) {
			if (DataAdapterServiceFactory.class.equals(extensionType)) {
				if (dataAdapterServiceFactories == null) {
					dataAdapterServiceFactories = new ArrayList<DataAdapterServiceFactory>();
					dataAdapterServiceFactories.add(HBaseDataAdapterServiceFactoryImpl.getInstance());
				}
				return (List<T>) dataAdapterServiceFactories;
			} else if (JRQueryExecuterFactoryBundle.class.equals(extensionType)) {
				if (queryExecuterFactories == null) {
					queryExecuterFactories = new ArrayList<JRQueryExecuterFactoryBundle>();
					queryExecuterFactories.add(HBaseQueryExecuterFactoryBundle.getInstance());
				}
				return (List<T>) queryExecuterFactories;
			}
			return null;
		}
	};

	public ExtensionsRegistry createRegistry(String registryId, JRPropertiesMap properties) {
		return extensionsRegistry;
	}
}