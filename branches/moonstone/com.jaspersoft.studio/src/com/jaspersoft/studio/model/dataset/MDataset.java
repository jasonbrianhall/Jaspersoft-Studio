/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.model.dataset;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.editor.preview.datasnapshot.DataSnapshotManager;
import com.jaspersoft.studio.help.HelpReferenceBuilder;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.DefaultValue;
import com.jaspersoft.studio.model.ICopyable;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MGraphicElement;
import com.jaspersoft.studio.model.MQuery;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.model.field.MField;
import com.jaspersoft.studio.model.field.MFields;
import com.jaspersoft.studio.model.parameter.MParameterSystem;
import com.jaspersoft.studio.model.parameter.MParameters;
import com.jaspersoft.studio.model.sortfield.MSortFields;
import com.jaspersoft.studio.model.util.IIconDescriptor;
import com.jaspersoft.studio.model.util.NodeIconDescriptor;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.classname.NClassTypePropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.expression.ExprUtil;
import com.jaspersoft.studio.property.descriptor.expression.JRExpressionPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.jrQuery.JRQueryButtonPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.propexpr.JPropertyExpressionsDescriptor;
import com.jaspersoft.studio.property.descriptor.propexpr.PropertyExpressionDTO;
import com.jaspersoft.studio.property.descriptor.resource.DefaultDatasetPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.resource.ResourceBundlePropertyDescriptor;
import com.jaspersoft.studio.property.descriptors.JSSValidatedTextPropertyDescriptor;
import com.jaspersoft.studio.property.descriptors.NamedEnumPropertyDescriptor;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

import net.sf.jasperreports.data.DataAdapterParameterContributorFactory;
import net.sf.jasperreports.engine.DatasetPropertyExpression;
import net.sf.jasperreports.engine.JRAbstractScriptlet;
import net.sf.jasperreports.engine.JRConstants;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.JRPropertyExpression;
import net.sf.jasperreports.engine.JRQuery;
import net.sf.jasperreports.engine.design.DesignDatasetPropertyExpression;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.type.WhenResourceMissingTypeEnum;

/*
 * The Class MDataset.
 * 
 * @author Chicu Veaceslav
 */
public class MDataset extends APropertyNode implements ICopyable {

	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public static final String PROPERTY_MAP = "PROPERTY_MAP"; //$NON-NLS-1$

	private static NamedEnumPropertyDescriptor<WhenResourceMissingTypeEnum> whenResMissTypeD;

	private static IPropertyDescriptor[] descriptors;

	private static DatasetNameValidator validator;

	/**
	 * The icon descriptor.
	 */
	private static IIconDescriptor iconDescriptor;

	private MReport mreport;

	private MQuery mQuery;

	/**
	 * Gets the icon descriptor.
	 * 
	 * @return the icon descriptor
	 */
	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new NodeIconDescriptor("dataset"); //$NON-NLS-1$
		return iconDescriptor;
	}

	/**
	 * Instantiates a new m dataset.
	 */
	public MDataset() {
		super();
	}

	public MDataset(MReport mreport, JRDesignDataset jrDataset) {
		super();
		this.mreport = mreport;
		setValue(jrDataset);
	}

	public boolean isMainDataset() {
		if (getJasperDesign() != null && getJasperDesign().getMainDataset() == getValue())
			return true;
		return false;
	}

	/**
	 * Instantiates a new m dataset.
	 * 
	 * @param parent
	 *          the parent
	 * @param jrDataset
	 *          the jr dataset
	 * @param newIndex
	 *          the new index
	 */
	public MDataset(ANode parent, JRDesignDataset jrDataset, int newIndex) {
		super(parent, newIndex);
		setValue(jrDataset);
		INode root = getRoot();
		if (root != null && root instanceof MReport)
			mreport = (MReport) root;
	}

	public MReport getMreport() {
		return mreport;
	}

	@Override
	public JasperDesign getJasperDesign() {
		JasperDesign jd = super.getJasperDesign();
		if (jd == null) {
			MReport mrep = getMreport();
			if (mrep != null)
				mrep.getJasperDesign();
		}
		return jd;
	}

	@Override
	public JRDesignDataset getValue() {
		return (JRDesignDataset) super.getValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getDisplayText()
	 */
	public String getDisplayText() {
		if (getValue() != null)
			return ((JRDesignDataset) getValue()).getName();
		return ""; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getImagePath()
	 */
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.INode#getToolTip()
	 */
	@Override
	public String getToolTip() {
		return getIconDescriptor().getToolTip();
	}

	@Override
	public IPropertyDescriptor[] getDescriptors() {
		return descriptors;
	}

	@Override
	public void setDescriptors(IPropertyDescriptor[] descriptors1) {
		descriptors = descriptors1;
	}

	@Override
	protected void postDescriptors(IPropertyDescriptor[] descriptors) {
		super.postDescriptors(descriptors);
		// Set into the validator the actual reference
		validator.setTargetNode(this);
	}

	/**
	 * Creates the property descriptors.
	 * 
	 * @param desc
	 *          the desc
	 */
	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc) {
		validator = new DatasetNameValidator();
		validator.setTargetNode(this);
		JSSValidatedTextPropertyDescriptor nameD = new JSSValidatedTextPropertyDescriptor(JRDesignDataset.PROPERTY_NAME,
				Messages.common_name, validator);
		nameD.setDescription(Messages.MDataset_name_description);
		desc.add(nameD);

		JPropertyExpressionsDescriptor propertiesD = new JPropertyExpressionsDescriptor(
				JRDesignElement.PROPERTY_PROPERTY_EXPRESSIONS, Messages.MGraphicElement_property_expressions);
		propertiesD.setDescription(Messages.MGraphicElement_property_expressions_description);
		desc.add(propertiesD);
		propertiesD.setHelpRefBuilder(
				new HelpReferenceBuilder("net.sf.jasperreports.doc/docs/schema.reference.html?cp=0_1#property")); //$NON-NLS-1$

		NClassTypePropertyDescriptor classD = new NClassTypePropertyDescriptor(JRDesignDataset.PROPERTY_SCRIPTLET_CLASS,
				Messages.MDataset_scriplet_class);
		classD.setDescription(Messages.MDataset_class_description);
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(JRAbstractScriptlet.class);
		classD.setClasses(classes);
		desc.add(classD);
		classD.setHelpRefBuilder(
				new HelpReferenceBuilder("net.sf.jasperreports.doc/docs/schema.reference.html?cp=0_1#scriptlet")); //$NON-NLS-1$

		ResourceBundlePropertyDescriptor resBundleD = new ResourceBundlePropertyDescriptor(
				JRDesignDataset.PROPERTY_RESOURCE_BUNDLE, Messages.MDataset_resource_bundle);
		resBundleD.setDescription(Messages.MDataset_resource_bundle_description);
		desc.add(resBundleD);

		JRQueryButtonPropertyDescriptor queryD = new JRQueryButtonPropertyDescriptor(JRDesignDataset.PROPERTY_QUERY,
				Messages.common_query, NullEnum.NULL, Messages.MDataset_Edit_Query_Button_Text);
		queryD.setDescription(Messages.MDataset_query_description);
		desc.add(queryD);
		queryD.setHelpRefBuilder(
				new HelpReferenceBuilder("net.sf.jasperreports.doc/docs/schema.reference.html?cp=0_1#queryString")); //$NON-NLS-1$

		whenResMissTypeD = new NamedEnumPropertyDescriptor<WhenResourceMissingTypeEnum>(
				JRDesignDataset.PROPERTY_WHEN_RESOURCE_MISSING_TYPE, Messages.MDataset_when_resource_missing_type,
				WhenResourceMissingTypeEnum.EMPTY, NullEnum.NOTNULL);
		whenResMissTypeD.setDescription(Messages.MDataset_when_resource_missing_type_description);
		desc.add(whenResMissTypeD);

		DefaultDatasetPropertyDescriptor defaultDatasetDescriptor = new DefaultDatasetPropertyDescriptor(
				DataAdapterParameterContributorFactory.PROPERTY_DATA_ADAPTER_LOCATION, "Default Data Adapter");
		defaultDatasetDescriptor.setDescription(Messages.MDataset_defaultDATooltip);
		desc.add(defaultDatasetDescriptor);

		JRExpressionPropertyDescriptor filterExpression = new JRExpressionPropertyDescriptor(
				JRDesignDataset.PROPERTY_FILTER_EXPRESSION, Messages.MDataset_filter_expression);
		filterExpression.setDescription(Messages.MDataset_filter_expression_description);
		desc.add(filterExpression);
		filterExpression.setHelpRefBuilder(
				new HelpReferenceBuilder("net.sf.jasperreports.doc/docs/schema.reference.html?cp=0_1#filterExpression")); //$NON-NLS-1$

		setHelpPrefix(desc, "net.sf.jasperreports.doc/docs/schema.reference.html?cp=0_1#subDataset"); //$NON-NLS-1$
	}

	@Override
	protected Map<String, DefaultValue> createDefaultsMap() {
		Map<String, DefaultValue> defaultsMap = super.createDefaultsMap();
		defaultsMap.put(JRDesignDataset.PROPERTY_RESOURCE_BUNDLE, new DefaultValue(null, true));
		defaultsMap.put(JRDesignDataset.PROPERTY_FILTER_EXPRESSION, new DefaultValue(null, true));

		int whenResourceMissingValue = NamedEnumPropertyDescriptor.getIntValue(WhenResourceMissingTypeEnum.NULL,
				NullEnum.NOTNULL, WhenResourceMissingTypeEnum.NULL);
		defaultsMap.put(JRDesignDataset.PROPERTY_WHEN_RESOURCE_MISSING_TYPE,
				new DefaultValue(whenResourceMissingValue, false));

		return defaultsMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		JRDesignDataset jrDataset = (JRDesignDataset) getValue();
		if (jrDataset == null)
			return null;
		if (id.equals(JRDesignDataset.PROPERTY_NAME))
			return jrDataset.getName();

		if (id.equals(JRDesignDataset.PROPERTY_QUERY)) {
			if (mQuery == null) {
				JRQuery jdq = jrDataset.getQuery();
				mQuery = new MQuery(jdq, this);
				mQuery.setJasperConfiguration(getJasperConfiguration());
				setChildListener(mQuery);
			}
			return mQuery;
		}
		if (id.equals(JRDesignDataset.PROPERTY_FILTER_EXPRESSION)) {
			return ExprUtil.getExpression(jrDataset.getFilterExpression());
		}
		if (id.equals(JRDesignDataset.PROPERTY_SCRIPTLET_CLASS))
			return jrDataset.getScriptletClass();
		if (id.equals(PROPERTY_MAP)) {
			JRPropertiesMap pmap = jrDataset.getPropertiesMap().cloneProperties();
			return pmap;
		}
		if (id.equals(JRDesignDataset.PROPERTY_WHEN_RESOURCE_MISSING_TYPE)) {
			return whenResMissTypeD.getIntValue(jrDataset.getWhenResourceMissingTypeValue());
		}
		if (id.equals(JRDesignDataset.PROPERTY_RESOURCE_BUNDLE)) {
			return jrDataset.getResourceBundle();
		}
		if (id.equals(DataAdapterParameterContributorFactory.PROPERTY_DATA_ADAPTER_LOCATION)) {
			String location = jrDataset.getPropertiesMap()
					.getProperty(DataAdapterParameterContributorFactory.PROPERTY_DATA_ADAPTER_LOCATION);
			return location;
		}
		if (id.equals(JRDesignElement.PROPERTY_PROPERTY_EXPRESSIONS)) {
			JRPropertyExpression[] propertyExpressions = jrDataset.getPropertyExpressions();
			if (propertyExpressions != null)
				propertyExpressions = propertyExpressions.clone();
			return new DatasetPropertyExpressionsDTO(propertyExpressions, getPropertiesMapClone(jrDataset), this);
		}
		if (id.equals(PROPERTY_MAP))
			return getPropertiesMapClone(jrDataset);
		return null;
	}

	protected JRPropertiesMap getPropertiesMapClone(JRDesignDataset jrElement) {
		JRPropertiesMap propertiesMap = jrElement.getPropertiesMap();
		if (propertiesMap != null)
			propertiesMap = propertiesMap.cloneProperties();
		return propertiesMap;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getSource() instanceof JRDesignQuery || evt.getSource() instanceof JRField
				|| evt.getSource() instanceof JRParameter)
			DataSnapshotManager.setDataSnapshot(getJasperConfiguration().getJRParameters(), true);
		if (JRDesignDataset.PROPERTY_NAME.equals(evt.getPropertyName())) {
			// When the name is changed, the one inside the jasperdesign is updated also
			JasperDesign design = getJasperDesign();
			JRDesignDataset jrDataset = (JRDesignDataset) getValue();
			String oldName = (String) evt.getOldValue();
			if (design != null) {
				design.getDatasetMap().remove(oldName);
				design.getDatasetMap().put(jrDataset.getName(), jrDataset);
			}
		}
		super.propertyChange(evt);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		JRDesignDataset jrDataset = (JRDesignDataset) getValue();
		if (id.equals(JRDesignDataset.PROPERTY_NAME)) {
			jrDataset.setName((String) value);
		} else if (id.equals(JRDesignDataset.PROPERTY_RESOURCE_BUNDLE)) {
			String v = (String) value;
			if (v != null && v.trim().isEmpty())
				v = null;
			jrDataset.setResourceBundle(v);
		} else if (id.equals(JRDesignDataset.PROPERTY_SCRIPTLET_CLASS)) {
			String v = (String) value;
			if (v != null && v.trim().isEmpty()) {
				v = null;
			}
			jrDataset.setScriptletClass(v);
		} else if (id.equals(JRDesignDataset.PROPERTY_FILTER_EXPRESSION))
			jrDataset.setFilterExpression(ExprUtil.setValues(jrDataset.getFilterExpression(), value));
		else if (id.equals(JRDesignElement.PROPERTY_PROPERTY_EXPRESSIONS)) {
			if (value instanceof DatasetPropertyExpressionsDTO) {
				DatasetPropertyExpressionsDTO dto = (DatasetPropertyExpressionsDTO) value;
				DatasetPropertyExpression[] expr = jrDataset.getPropertyExpressions();
				// Remove the old expression properties if any
				if (expr != null)
					for (DatasetPropertyExpression ex : expr)
						jrDataset.removePropertyExpression(ex);
				// Add the new expression properties
				for (PropertyExpressionDTO p : dto.getProperties()) {
					if (p.isExpression()) {
						DesignDatasetPropertyExpression newExp = new DesignDatasetPropertyExpression();
						newExp.setName(p.getName());
						newExp.setValueExpression(p.getValueAsExpression());
						newExp.setEvaluationTime(((DatasetPropertyExpressionDTO) p).getEvalTime());
						jrDataset.addPropertyExpression((DatasetPropertyExpression) newExp);
					}
				}
				// now change properties, first remove the old ones if any
				JRPropertiesMap originalMap = jrDataset.getPropertiesMap().cloneProperties();
				String[] names = jrDataset.getPropertiesMap().getPropertyNames();
				for (int i = 0; i < names.length; i++) {
					jrDataset.getPropertiesMap().removeProperty(names[i]);
				}
				// now add the new properties
				for (PropertyExpressionDTO p : dto.getProperties()) {
					if (!p.isExpression()) {
						jrDataset.getPropertiesMap().setProperty(p.getName(), p.getValue());
					}
				}
				// really important to trigger the property with source the JR object and not the node
				// using the node could cause problem with the refresh of the advanced properties view
				firePropertyChange(new PropertyChangeEvent(jrDataset, PROPERTY_MAP, originalMap, jrDataset.getPropertiesMap()));
			}
		} else if (id.equals(MGraphicElement.PROPERTY_MAP)) {
			JRPropertiesMap v = (JRPropertiesMap) value;
			String[] names = jrDataset.getPropertiesMap().getPropertyNames();
			for (int i = 0; i < names.length; i++)
				jrDataset.getPropertiesMap().removeProperty(names[i]);
			names = v.getPropertyNames();

			for (String str : v.getPropertyNames())
				jrDataset.setProperty(str, v.getProperty(str));
			firePropertyChange(new PropertyChangeEvent(jrDataset, PROPERTY_MAP, false, true));
		} else if (id.equals(JRDesignDataset.PROPERTY_WHEN_RESOURCE_MISSING_TYPE)) {
			jrDataset.setWhenResourceMissingType(whenResMissTypeD.getEnumValue(value));
		} else if (id.equals(JRDesignDataset.PROPERTY_QUERY)) {
			if (value instanceof MQuery) {
				unsetChildListener(mQuery);
				mQuery = (MQuery) value;
				setChildListener(mQuery);
				JRDesignQuery jrQuery = (JRDesignQuery) mQuery.getValue();
				jrDataset.setQuery(jrQuery);
			}
		} else if (id.equals(DataAdapterParameterContributorFactory.PROPERTY_DATA_ADAPTER_LOCATION)) {
			if (value == null || value.toString().trim().isEmpty()) {
				jrDataset.getPropertiesMap()
						.removeProperty(DataAdapterParameterContributorFactory.PROPERTY_DATA_ADAPTER_LOCATION);
			} else {
				jrDataset.getPropertiesMap().setProperty(DataAdapterParameterContributorFactory.PROPERTY_DATA_ADAPTER_LOCATION,
						value.toString());
			}
			// really important to trigger the property with source the JR object and not the node
			// using the node could cause problem with the refresh of the advanced properties view
			firePropertyChange(new PropertyChangeEvent(jrDataset,
					DataAdapterParameterContributorFactory.PROPERTY_DATA_ADAPTER_LOCATION, null, value));
		}
	}

	@Override
	public String toString() {
		return getDisplayText();
	}

	/**
	 * Creates the jr dataset.
	 * 
	 * @param jrDesign
	 *          the jr design
	 * @return the jR design dataset
	 */
	public static JRDesignDataset createJRDataset(JasperReportsConfiguration jConfig, JasperDesign jrDesign) {
		JRDesignDataset jrDesignDataset = new JRDesignDataset(jConfig, false);
		jrDesignDataset.setName(ModelUtils.getDefaultName(jrDesign.getDatasetMap(), "Dataset")); //$NON-NLS-1$
		JRDesignQuery jrDesignQuery = new JRDesignQuery();
		jrDesignQuery.setLanguage("sql"); //$NON-NLS-1$
		jrDesignQuery.setText(""); //$NON-NLS-1$
		jrDesignDataset.setQuery(jrDesignQuery);
		return jrDesignDataset;
	}

	public ICopyable.RESULT isCopyable2(Object parent) {
		if (parent instanceof MReport)
			return ICopyable.RESULT.COPYABLE;
		return ICopyable.RESULT.CHECK_PARENT;
	}

	public MParameterSystem getParamater(String name) {
		List<INode> children = getChildren();
		if (children == null || children.isEmpty())
			children = mreport.getChildren();
		for (INode n : children) {
			if (n instanceof MParameters) {
				for (INode nf : n.getChildren()) {
					MParameterSystem mfield = (MParameterSystem) nf;
					if (mfield.getValue().getName().equals(name))
						return mfield;
				}
				break;
			}
		}
		return null;
	}

	public MField getField(String name) {
		List<INode> children = getChildren();
		if (children == null || children.isEmpty())
			children = mreport.getChildren();
		for (INode n : children) {
			if (n instanceof MFields) {
				for (INode nf : n.getChildren()) {
					MField mfield = (MField) nf;
					if (mfield.getValue().getName().equals(name))
						return mfield;
				}
				break;
			}
		}
		return null;
	}

	/**
	 * @return the {@link MFields} instance, container for fields
	 */
	public MFields getMFields() {
		return getFirstChildOfType(MFields.class);
	}

	/**
	 * @return the {@link MParameters} instance, container for parameters
	 */
	public MParameters<?> getMParameters() {
		return getFirstChildOfType(MParameters.class);
	}

	/**
	 * @return the {@link MSortFields} instance, container for sort fields
	 */
	public MSortFields getMSortFields() {
		return getFirstChildOfType(MSortFields.class);
	}

	/**
	 * Returns the first child that has the same class of the specified input parameter
	 * 
	 * @param classType
	 *          the class
	 * @return the first child found with the specific class type, <code>null</code> otherwise
	 */
	@SuppressWarnings("unchecked")
	public <T> T getFirstChildOfType(Class<T> classType) {
		List<INode> children = getChildren();
		if (children == null || children.isEmpty())
			children = mreport.getChildren();
		for (INode n : children) {
			if (classType.isInstance(n)) {
				return (T) n;
			}
		}
		return null;
	}

	@Override
	public boolean isCuttable(ISelection currentSelection) {
		return true;
	}
}
