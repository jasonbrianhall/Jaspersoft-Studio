/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.data.internal.olap;

import java.util.Map;

import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRValueParameter;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.query.AbstractQueryExecuterFactory;
import net.sf.jasperreports.engine.query.JREmptyQueryExecuter;
import net.sf.jasperreports.engine.query.JRQueryExecuter;
import net.sf.jasperreports.olap.JRMondrianQueryExecuterFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.jaspersoft.studio.data.internal.mondrian.JROlap4jMondrianQueryExecuter;
import com.jaspersoft.studio.data.internal.mondrian.JROlap4jMondrianQueryExecuterFactory;
import com.jaspersoft.studio.data.internal.xmla.JROlap4jXmlaQueryExecuter;
import com.jaspersoft.studio.data.internal.xmla.JROlap4jXmlaQueryExecuterFactory;


/**
 * @author swood
 * @version $Id: JRMdxQueryExecuterFactory.java 5879 2013-01-07 20:35:36Z teodord $
 */
public class JROlap4jQueryExecuterFactory extends AbstractQueryExecuterFactory
{
	
	private static final Log log = LogFactory.getLog(JRMdxQueryExecuterFactory.class);
	
	private final static Object[] MDX_BUILTIN_PARAMETERS;
	
	public static final String CANONICAL_LANGUAGE = "OLAP4J";
	
	static
	{
		Object[] mondrianParams = new JRMondrianQueryExecuterFactory().getBuiltinParameters();
		Object[] xmlaParams = new JROlap4jXmlaQueryExecuterFactory().getBuiltinParameters();
		
		MDX_BUILTIN_PARAMETERS = new Object[mondrianParams.length + xmlaParams.length];
		System.arraycopy(mondrianParams, 0, MDX_BUILTIN_PARAMETERS, 0, mondrianParams.length);
		System.arraycopy(xmlaParams, 0, MDX_BUILTIN_PARAMETERS, mondrianParams.length, xmlaParams.length);
	}
	
	public Object[] getBuiltinParameters()
	{
		return MDX_BUILTIN_PARAMETERS;
	}

	public JRQueryExecuter createQueryExecuter(
		JasperReportsContext jasperReportsContext,
		JRDataset dataset, 
		Map<String,? extends JRValueParameter> parameters
		) throws JRException
	{
		JRQueryExecuter queryExecuter;
		if (getParameterValue(parameters, JROlap4jMondrianQueryExecuterFactory.PARAMETER_JDBC_URL) != null)
		{
			queryExecuter = new JROlap4jMondrianQueryExecuter(jasperReportsContext, dataset, parameters);
		}
		else if (getParameterValue(parameters, JROlap4jXmlaQueryExecuterFactory.PARAMETER_XMLA_URL) != null)
		{
			queryExecuter = new JROlap4jXmlaQueryExecuter(jasperReportsContext, dataset, parameters);
		}
		else
		{
			log.warn("No Mondrian connection or XMLA URL set for MDX query");
			queryExecuter = new JREmptyQueryExecuter();
		}
		return queryExecuter;
	}

	protected final Object getParameterValue(Map<String,? extends JRValueParameter> valueParams, String name)
	{
		JRValueParameter valueParam = valueParams.get(name);
		return valueParam == null ? null : valueParam.getValue();
	}
	
	public boolean supportsQueryParameterType(String className)
	{
		return true;
	}

}
