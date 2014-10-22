package com.jaspersoft.studio.model.book;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRConstants;
import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.JRPart;
import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.component.ComponentKey;
import net.sf.jasperreports.engine.design.JRDesignPart;
import net.sf.jasperreports.engine.part.PartComponent;
import net.sf.jasperreports.engine.part.PartEvaluationTime;
import net.sf.jasperreports.engine.part.StandardPartEvaluationTime;
import net.sf.jasperreports.engine.type.PartEvaluationTimeType;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.help.HelpReferenceBuilder;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.util.IIconDescriptor;
import com.jaspersoft.studio.model.util.NodeIconDescriptor;
import com.jaspersoft.studio.property.descriptor.expression.JRExpressionPropertyDescriptor;

public class MReportPart extends APropertyNode {

	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;
	public static final String PROPERTY_EVALTIME_TYPE = "part_evaluationtime_type";
	public static final String PROPERTY_EVALTIME_GROUP = "part_evaluationtime_group";
	public static final String PROPERTY_MAP = "property_map";
	
	// The icon descriptor
	private static IIconDescriptor iconDescriptor;
	// Array of property descriptors
	private static IPropertyDescriptor[] descriptors;
	// A map for propery defaults
	private static Map<String, Object> defaultsMap;
	
	public MReportPart(ANode parent, JRPart bookpart, int newIndex) {
		super(parent, newIndex);
		setValue(bookpart);
	}

	@Override
	public JRDesignPart getValue() {
		return (JRDesignPart) super.getValue();
	}
	
	/**
	 * Gets the icon descriptor.
	 * 
	 * @return the icon descriptor
	 */
	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new NodeIconDescriptor("reportpart"); //$NON-NLS-1$
		return iconDescriptor;
	}
	
	@Override
	public Object getPropertyValue(Object id) {
		JRDesignPart jrpart = (JRDesignPart) getValue();
		if(jrpart!=null) {
			PartEvaluationTime evalTime = jrpart.getEvaluationTime();
			if(id.equals(JRDesignPart.PROPERTY_COMPONENT)) {
				return jrpart.getComponent();
			}
			if(id.equals(JRDesignPart.PROPERTY_COMPONENT_KEY)) {
				return jrpart.getComponentKey();
			}
			if(id.equals(JRDesignPart.PROPERTY_EVALUATION_TIME)) {
				return evalTime;
			}
			if(id.equals(JRDesignPart.PROPERTY_PART_NAME_EXPRESSION)){
				return jrpart.getPartNameExpression();
			}
			if(id.equals(JRDesignPart.PROPERTY_PRINT_WHEN_EXPRESSION)){
				return jrpart.getPrintWhenExpression();
			}
			if(id.equals(PROPERTY_EVALTIME_GROUP)){
				if(evalTime!=null){
					return evalTime.getEvaluationGroup();
				}
			}
			if(id.equals(PROPERTY_EVALTIME_TYPE)){
				if(evalTime!=null){
					return evalTime.getEvaluationTimeType();
				}
			}
			if(id.equals(PROPERTY_MAP)){
				return jrpart.getPropertiesMap().cloneProperties();
			}
		}
		return null;
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		JRDesignPart jrpart = (JRDesignPart) getValue();
		if(jrpart!=null) {
			if(id.equals(JRDesignPart.PROPERTY_COMPONENT)) {
				jrpart.setComponent((PartComponent) value);
			}
			else if(id.equals(JRDesignPart.PROPERTY_COMPONENT_KEY)) {
				jrpart.setComponentKey((ComponentKey) value);
			}
			else if(id.equals(JRDesignPart.PROPERTY_EVALUATION_TIME)) {
				jrpart.setEvaluationTime((PartEvaluationTime) value);
			}
			else if(id.equals(JRDesignPart.PROPERTY_PART_NAME_EXPRESSION)){
				jrpart.setPartNameExpression((JRExpression) value);
			}
			else if(id.equals(JRDesignPart.PROPERTY_PRINT_WHEN_EXPRESSION)){
				jrpart.setPrintWhenExpression((JRExpression) value);
			}
			else if(id.equals(PROPERTY_EVALTIME_GROUP)){
				if(value instanceof String){
					jrpart.setEvaluationTime(StandardPartEvaluationTime.forGroup((String) value));
				}
				else {
					jrpart.setEvaluationTime(null);
				}
			}
			else if(id.equals(PROPERTY_EVALTIME_TYPE)){
				if(value instanceof String) {
					PartEvaluationTimeType byName = PartEvaluationTimeType.byName((String) value);
					if(byName!=null && !byName.equals(PartEvaluationTimeType.GROUP)){
						jrpart.setEvaluationTime(StandardPartEvaluationTime.forType((String) value));
					}
					else {
						jrpart.setEvaluationTime(null);
					}
				}
			}
			else if (id.equals(PROPERTY_MAP)) {
					JRPropertiesMap v = (JRPropertiesMap) value;
					String[] names = jrpart.getPropertiesMap().getPropertyNames();
					for (int i = 0; i < names.length; i++) {
						jrpart.getPropertiesMap().removeProperty(names[i]);
					}
					names = v.getPropertyNames();
					for (int i = 0; i < names.length; i++)
						jrpart.getPropertiesMap().setProperty(names[i], v.getProperty(names[i]));
					this.getPropertyChangeSupport().firePropertyChange(PROPERTY_MAP, false, true);
				}
			}
	}

	@Override
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}

	@Override
	public String getDisplayText() {
		return "Book Part";
	}

	@Override
	public Map<String, Object> getDefaultsMap() {
		return defaultsMap;
	}

	@Override
	public void setDescriptors(IPropertyDescriptor[] descriptors1, Map<String, Object> defaultsMap1) {
		descriptors=descriptors1;
		defaultsMap=defaultsMap1;
	}

	@Override
	public IPropertyDescriptor[] getDescriptors() {
		return descriptors;
	}

	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc, Map<String, Object> defaultsMap) {
		JRExpressionPropertyDescriptor printWhenExpD = new JRExpressionPropertyDescriptor(
				JRDesignPart.PROPERTY_PRINT_WHEN_EXPRESSION, Messages.common_print_when_expression);
		printWhenExpD.setDescription("Definition of a Boolean expression that will determine if the part should be printed or not.");
		printWhenExpD.setHelpRefBuilder(new HelpReferenceBuilder(
				"net.sf.jasperreports.doc/docs/schema.reference.html?cp=0_1#printWhenExpression")); //$NON-NLS-1$
		desc.add(printWhenExpD);
		
		JRExpressionPropertyDescriptor partNameExpression = new JRExpressionPropertyDescriptor(
				JRDesignPart.PROPERTY_PART_NAME_EXPRESSION, "Part Name Expression");
		partNameExpression.setDescription("An expression that will provide a name for a report part.");
		partNameExpression.setHelpRefBuilder(new HelpReferenceBuilder(
				"net.sf.jasperreports.doc/docs/schema.reference.html?cp=0_1#partNameExpression")); //$NON-NLS-1$
		
		// FIXME Implement handling for NamedEnum,  we cannot use the current one for JREnum
//		JSSNamedEnumPropertyDescriptor evaluationTimeD = new JSSNamedEnumPropertyDescriptor(PROPERTY_EVALTIME_TYPE,
//				Messages.common_evaluation_time, PartEvaluationTimeType.class, NullEnum.NOTNULL);
//		evaluationTimeD.setDescription("Determines the time at which the part is to be evaluated.");
//		desc.add(evaluationTimeD);
//
//		RWComboBoxPropertyDescriptor evalGroupD = new RWComboBoxPropertyDescriptor(PROPERTY_EVALTIME_GROUP,
//				"Evaluation Group", new String[] { "" }, NullEnum.NULL); //$NON-NLS-1$
//		evalGroupD.setDescription("Specifies the group at which to evaluate the part when evaluationTime is Group.");
//		desc.add(evalGroupD);
		
		MReportPart.defaultsMap.put(PROPERTY_EVALTIME_TYPE, PartEvaluationTimeType.NOW);
		MReportPart.defaultsMap.put(PROPERTY_EVALTIME_GROUP, null);
		MReportPart.defaultsMap.put(JRDesignPart.PROPERTY_PART_NAME_EXPRESSION, null);
		MReportPart.defaultsMap.put(JRDesignPart.PROPERTY_PRINT_WHEN_EXPRESSION, null);
		
		setHelpPrefix(desc, "net.sf.jasperreports.doc/docs/schema.reference.html?cp=0_1#part");
	}

}
