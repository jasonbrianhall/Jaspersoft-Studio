/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.model.text;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.JRTextField;
import net.sf.jasperreports.engine.base.JRBaseTextField;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignHyperlink;
import net.sf.jasperreports.engine.design.JRDesignStyle;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.type.EvaluationTimeEnum;
import net.sf.jasperreports.engine.type.HyperlinkTypeEnum;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.IIconDescriptor;
import com.jaspersoft.studio.model.MExpression;
import com.jaspersoft.studio.model.MHyperLink;
import com.jaspersoft.studio.model.NodeIconDescriptor;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.checkbox.CheckBoxPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.expression.JRExpressionPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.pattern.PatternPropertyDescriptor;
import com.jaspersoft.studio.utils.EnumHelper;

/**
 * The Class MTextField.
 */
public class MTextField extends MTextElement {

	/** The icon descriptor. */
	private static IIconDescriptor iconDescriptor;

	/**
	 * Gets the icon descriptor.
	 * 
	 * @return the icon descriptor
	 */
	public static IIconDescriptor getIconDescriptor() {
		if (iconDescriptor == null)
			iconDescriptor = new NodeIconDescriptor("textfield");
		return iconDescriptor;
	}

	/**
	 * Instantiates a new m text field.
	 */
	public MTextField() {
		super();
	}

	/**
	 * Instantiates a new m text field.
	 * 
	 * @param parent
	 *          the parent
	 * @param jrStaticText
	 *          the jr static text
	 * @param newIndex
	 *          the new index
	 */
	public MTextField(ANode parent, JRTextField jrStaticText, int newIndex) {
		super(parent, newIndex);
		setValue(jrStaticText);
	}

	private static IPropertyDescriptor[] descriptors;
	private static Map<String, Object> defaultsMap;

	@Override
	public Map<String, Object> getDefaultsMap() {
		return defaultsMap;
	}

	@Override
	public IPropertyDescriptor[] getDescriptors() {
		return descriptors;
	}

	@Override
	public void setDescriptors(IPropertyDescriptor[] descriptors1, Map<String, Object> defaultsMap1) {
		descriptors = descriptors1;
		defaultsMap = defaultsMap1;
	}

	/**
	 * Creates the property descriptors.
	 * 
	 * @param desc
	 *          the desc
	 */
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc, Map<String, Object> defaultsMap) {
		super.createPropertyDescriptors(desc, defaultsMap);

		ComboBoxPropertyDescriptor evaluationTimeD = new ComboBoxPropertyDescriptor(
				JRDesignTextField.PROPERTY_EVALUATION_TIME, "Evaluation Time", EnumHelper.getEnumNames(
						EvaluationTimeEnum.values(), NullEnum.NULL));
		evaluationTimeD
				.setDescription("The text to be printed is supplied by the associated expression. This expression can be evaluated at a specified moment. This could be useful, for example, when we want to have on the first page a text that will be generated only after fetching all the data source rows.");
		desc.add(evaluationTimeD);

		CheckBoxPropertyDescriptor blankWhenNullD = new CheckBoxPropertyDescriptor(JRDesignStyle.PROPERTY_BLANK_WHEN_NULL,
				"Blank When NULL", NullEnum.INHERITED);
		blankWhenNullD
				.setDescription("Specifies that the text field should display a blank character instead of \"null\" when the text field expression evaluates to null.");
		desc.add(blankWhenNullD);

		CheckBoxPropertyDescriptor stretchOverflowD = new CheckBoxPropertyDescriptor(
				JRBaseTextField.PROPERTY_STRETCH_WITH_OVERFLOW, "Stretch With Overflow", NullEnum.NOTNULL);
		stretchOverflowD
				.setDescription("	Instructs the report engine to allow the text field to stretch downwards in order to display all its text when it doesn't fit in the defined text field height.");
		desc.add(stretchOverflowD);

		JRExpressionPropertyDescriptor exprD = new JRExpressionPropertyDescriptor(JRDesignTextField.PROPERTY_EXPRESSION,
				"Expression");
		exprD.setDescription("Defines the expression to use for this textField.");
		desc.add(exprD);

		PatternPropertyDescriptor patternD = new PatternPropertyDescriptor(JRDesignStyle.PROPERTY_PATTERN, "Pattern");
		patternD.setDescription("Pattern to use when formatting the output of the text field expression.");
		desc.add(patternD);

		if (mHyperLink == null)
			mHyperLink = new MHyperLink(null);
		mHyperLink.createPropertyDescriptors(desc, defaultsMap);

		patternD.setCategory("TextField Properties");
		exprD.setCategory("TextField Properties");
		evaluationTimeD.setCategory("TextField Properties");
		blankWhenNullD.setCategory("TextField Properties");
		stretchOverflowD.setCategory("TextField Properties");

		defaultsMap.put(JRDesignStyle.PROPERTY_BLANK_WHEN_NULL, Boolean.FALSE);
		defaultsMap.put(JRBaseTextField.PROPERTY_STRETCH_WITH_OVERFLOW, Boolean.FALSE);
	}

	private MExpression mExpression;
	private MHyperLink mHyperLink;

	private MExpression mAnchorExpression;
	private MExpression mPageExpression;
	private MExpression mReferenceExpression;
	private MExpression mToolTipExpression;

	@Override
	public Object getPropertyValue(Object id) {
		JRDesignTextField jrElement = (JRDesignTextField) getValue();
		if (id.equals(JRDesignTextField.PROPERTY_EXPRESSION)) {
			if (mExpression == null)
				mExpression = new MExpression(jrElement.getExpression());
			return mExpression;
		}
		if (id.equals(JRDesignTextField.PROPERTY_EVALUATION_TIME))
			return EnumHelper.getValue(jrElement.getEvaluationTimeValue());
		if (id.equals(JRDesignStyle.PROPERTY_BLANK_WHEN_NULL))
			return jrElement.isOwnBlankWhenNull();
		if (id.equals(JRBaseTextField.PROPERTY_STRETCH_WITH_OVERFLOW))
			return new Boolean(jrElement.isStretchWithOverflow());
		if (id.equals(JRDesignStyle.PROPERTY_PATTERN))
			return jrElement.getOwnPattern();

		// hyperlink --------------------------------------
		if (id.equals(JRDesignHyperlink.PROPERTY_LINK_TARGET))
			return jrElement.getLinkTarget();
		if (id.equals(JRDesignHyperlink.PROPERTY_LINK_TYPE))
			return EnumHelper.getValue(jrElement.getHyperlinkTypeValue(), 0, false);
		if (id.equals(JRDesignHyperlink.PROPERTY_HYPERLINK_ANCHOR_EXPRESSION)) {
			if (mAnchorExpression == null)
				mAnchorExpression = new MExpression(jrElement.getHyperlinkAnchorExpression());
			return mAnchorExpression;
		}
		if (id.equals(JRDesignHyperlink.PROPERTY_HYPERLINK_PAGE_EXPRESSION)) {
			if (mPageExpression == null)
				mPageExpression = new MExpression(jrElement.getHyperlinkPageExpression());
			return mPageExpression;
		}
		if (id.equals(JRDesignHyperlink.PROPERTY_HYPERLINK_REFERENCE_EXPRESSION)) {
			if (mReferenceExpression == null)
				mReferenceExpression = new MExpression(jrElement.getHyperlinkReferenceExpression());
			return mReferenceExpression;
		}
		if (id.equals(JRDesignHyperlink.PROPERTY_HYPERLINK_TOOLTIP_EXPRESSION)) {
			if (mToolTipExpression == null)
				mToolTipExpression = new MExpression(jrElement.getHyperlinkTooltipExpression());
			return mToolTipExpression;
		}

		return super.getPropertyValue(id);
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		JRDesignTextField jrElement = (JRDesignTextField) getValue();

		if (id.equals(JRBaseTextField.PROPERTY_STRETCH_WITH_OVERFLOW))
			jrElement.setPattern((String) value);
		else if (id.equals(JRDesignTextField.PROPERTY_EVALUATION_TIME))
			jrElement.setEvaluationTime(EvaluationTimeEnum.getByValue(EnumHelper.getSetValue((Integer) value)));
		else if (id.equals(JRDesignTextField.PROPERTY_EXPRESSION)) {
			if (value instanceof MExpression) {
				mExpression = (MExpression) value;
				JRExpression expression = (JRExpression) mExpression.getValue();
				jrElement.setExpression(expression);
			}
		} else if (id.equals(JRDesignStyle.PROPERTY_BLANK_WHEN_NULL))
			jrElement.setBlankWhenNull((Boolean) value);
		else if (id.equals(JRDesignStyle.PROPERTY_PATTERN))
			jrElement.setPattern((String) value);
		else if (id.equals(JRBaseTextField.PROPERTY_STRETCH_WITH_OVERFLOW))
			jrElement.setStretchWithOverflow(((Boolean) value).booleanValue());
		else if (id.equals(JRDesignHyperlink.PROPERTY_LINK_TARGET))
			jrElement.setLinkTarget((String) value);
		else if (id.equals(JRDesignHyperlink.PROPERTY_LINK_TYPE))
			jrElement
					.setHyperlinkType((HyperlinkTypeEnum) EnumHelper.getSetValue(HyperlinkTypeEnum.values(), value, 0, false));
		else if (id.equals(JRDesignHyperlink.PROPERTY_HYPERLINK_ANCHOR_EXPRESSION)) {
			if (value instanceof MExpression) {
				mAnchorExpression = (MExpression) value;
				JRExpression expression = (JRExpression) mAnchorExpression.getValue();
				jrElement.setHyperlinkAnchorExpression(expression);
			}
		} else if (id.equals(JRDesignHyperlink.PROPERTY_HYPERLINK_PAGE_EXPRESSION)) {
			if (value instanceof MExpression) {
				mPageExpression = (MExpression) value;
				JRExpression expression = (JRExpression) mPageExpression.getValue();
				jrElement.setHyperlinkPageExpression(expression);
			}
		} else if (id.equals(JRDesignHyperlink.PROPERTY_HYPERLINK_REFERENCE_EXPRESSION)) {
			if (value instanceof MExpression) {
				mReferenceExpression = (MExpression) value;
				JRExpression expression = (JRExpression) mReferenceExpression.getValue();
				jrElement.setHyperlinkReferenceExpression(expression);
			}
		} else if (id.equals(JRDesignHyperlink.PROPERTY_HYPERLINK_TOOLTIP_EXPRESSION)) {
			if (value instanceof MExpression) {
				mToolTipExpression = (MExpression) value;
				JRExpression expression = (JRExpression) mToolTipExpression.getValue();
				jrElement.setHyperlinkTooltipExpression(expression);
			}
		} else
			super.setPropertyValue(id, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getDefaultHeight()
	 */
	@Override
	public int getDefaultHeight() {
		return 30;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getDefaultWidth()
	 */
	@Override
	public int getDefaultWidth() {
		return 70;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#createJRElement(net.sf.jasperreports.engine.design.JasperDesign)
	 */
	@Override
	public JRDesignElement createJRElement(JasperDesign jasperDesign) {
		return new JRDesignTextField();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getDisplayText()
	 */
	@Override
	public String getDisplayText() {
		if (getValue() != null) {
			JRTextField jrTextField = (JRTextField) getValue();
			if (jrTextField.getExpression() != null)
				return jrTextField.getExpression().getText();
		}
		return getIconDescriptor().getTitle();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getImagePath()
	 */
	@Override
	public ImageDescriptor getImagePath() {
		return getIconDescriptor().getIcon16();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jaspersoft.studio.model.MGeneric#getToolTip()
	 */
	@Override
	public String getToolTip() {
		return getIconDescriptor().getToolTip();
	}

}
