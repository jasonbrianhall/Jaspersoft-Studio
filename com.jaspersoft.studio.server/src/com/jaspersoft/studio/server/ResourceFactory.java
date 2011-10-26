package com.jaspersoft.studio.server;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.server.model.MDataType;
import com.jaspersoft.studio.server.model.MFolder;
import com.jaspersoft.studio.server.model.MInputControl;
import com.jaspersoft.studio.server.model.MJar;
import com.jaspersoft.studio.server.model.MJrxml;
import com.jaspersoft.studio.server.model.MListOfValues;
import com.jaspersoft.studio.server.model.MRDatasource;
import com.jaspersoft.studio.server.model.MRDatasourceBean;
import com.jaspersoft.studio.server.model.MRDatasourceCustom;
import com.jaspersoft.studio.server.model.MRDatasourceJDBC;
import com.jaspersoft.studio.server.model.MRDatasourceJNDI;
import com.jaspersoft.studio.server.model.MRFont;
import com.jaspersoft.studio.server.model.MRImage;
import com.jaspersoft.studio.server.model.MRQuery;
import com.jaspersoft.studio.server.model.MRStyleTemplate;
import com.jaspersoft.studio.server.model.MReference;
import com.jaspersoft.studio.server.model.MReportUnit;
import com.jaspersoft.studio.server.model.MResourceBundle;
import com.jaspersoft.studio.server.model.MUnknown;

public class ResourceFactory {
	public static ANode getResource(ANode parent, ResourceDescriptor resource) {
		if (resource.getWsType().equals(ResourceDescriptor.TYPE_FOLDER))
			return new MFolder(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_INPUT_CONTROL))
			return new MInputControl(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_JRXML))
			return new MJrxml(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_IMAGE))
			return new MRImage(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_REFERENCE))
			return new MReference(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_REPORTUNIT))
			return new MReportUnit(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_LOV))
			return new MListOfValues(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_UNKNOW))
			return new MUnknown(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_CLASS_JAR))
			return new MJar(parent, resource);

		if (resource.getWsType()
				.equals(ResourceDescriptor.TYPE_RESOURCE_BUNDLE))
			return new MResourceBundle(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_QUERY))
			return new MRQuery(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_DATA_TYPE))
			return new MDataType(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_FONT))
			return new MRFont(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_STYLE_TEMPLATE))
			return new MRStyleTemplate(parent, resource);

		if (resource.getWsType().equals(ResourceDescriptor.TYPE_DATASOURCE))
			return new MRDatasource(parent, resource);
		if (resource.getWsType()
				.equals(ResourceDescriptor.TYPE_DATASOURCE_BEAN))
			return new MRDatasourceBean(parent, resource);

		if (resource.getWsType().equals(
				ResourceDescriptor.TYPE_DATASOURCE_CUSTOM))
			return new MRDatasourceCustom(parent, resource);

		if (resource.getWsType()
				.equals(ResourceDescriptor.TYPE_DATASOURCE_JDBC))
			return new MRDatasourceJDBC(parent, resource);
		if (resource.getWsType()
				.equals(ResourceDescriptor.TYPE_DATASOURCE_JNDI))
			return new MRDatasourceJNDI(parent, resource);
		return new MUnknown(parent, resource);
	}
}
