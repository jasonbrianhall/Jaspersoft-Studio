package com.jaspersoft.studio.barcode.model.barcode4j;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.components.barcode4j.POSTNETComponent;
import net.sf.jasperreports.engine.component.ComponentKey;
import net.sf.jasperreports.engine.design.JRDesignComponentElement;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.property.descriptor.DoublePropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.checkbox.CheckBoxPropertyDescriptor;

public class MPOSTNET extends MBarcode4j {
	public MPOSTNET() {
		super();
	}

	public MPOSTNET(ANode parent, JRDesignComponentElement jrBarcode, int newIndex) {
		super(parent, jrBarcode, newIndex);
	}

	@Override
	public JRDesignComponentElement createJRElement(JasperDesign jasperDesign) {
		JRDesignComponentElement el = new JRDesignComponentElement();
		el.setComponent(new POSTNETComponent());
		el.setComponentKey(new ComponentKey("http://jasperreports.sourceforge.net/jasperreports/components", "jr",
				"POSTNET"));
		return el;
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

		DoublePropertyDescriptor shortBarHeightD = new DoublePropertyDescriptor(POSTNETComponent.PROPERTY_SHORT_BAR_HEIGHT,
				"Short Bar Height");
		shortBarHeightD.setDescription("Short bar height.");
		desc.add(shortBarHeightD);

		DoublePropertyDescriptor intercharD = new DoublePropertyDescriptor(POSTNETComponent.PROPERTY_INTERCHAR_GAP_WIDTH,
				"Interchar Gap Width");
		intercharD.setDescription("Interchar gap width.");
		desc.add(intercharD);

		CheckBoxPropertyDescriptor displayChecksumD = new CheckBoxPropertyDescriptor(
				POSTNETComponent.PROPERTY_DISPLAY_CHECKSUM, "Display Checksum", NullEnum.NULL);
		displayChecksumD.setDescription("Display Checksum.");
		desc.add(displayChecksumD);

		ComboBoxPropertyDescriptor checksumModeD = new ComboBoxPropertyDescriptor(POSTNETComponent.PROPERTY_CHECKSUM_MODE,
				"Checksum Mode", ChecksumMode.getItems());
		checksumModeD.setDescription("Checksum mode.");
		desc.add(checksumModeD);

		ComboBoxPropertyDescriptor baselinePositionD = new ComboBoxPropertyDescriptor(
				POSTNETComponent.PROPERTY_BASELINE_POSITION, "Baseline Position", BaselinePosition.getItems());
		baselinePositionD.setDescription("Baseline Position.");
		desc.add(baselinePositionD);

		shortBarHeightD.setCategory("Barcode Properties, POSTNET");
		baselinePositionD.setCategory("Barcode Properties, POSTNET");
		checksumModeD.setCategory("Barcode Properties, POSTNET");
		displayChecksumD.setCategory("Barcode Properties, POSTNET");
		intercharD.setCategory("Barcode Properties, POSTNET");
	}

	@Override
	public Object getPropertyValue(Object id) {
		JRDesignComponentElement jrElement = (JRDesignComponentElement) getValue();
		POSTNETComponent jrList = (POSTNETComponent) jrElement.getComponent();

		if (id.equals(POSTNETComponent.PROPERTY_SHORT_BAR_HEIGHT))
			return jrList.getShortBarHeight();
		if (id.equals(POSTNETComponent.PROPERTY_INTERCHAR_GAP_WIDTH))
			return jrList.getIntercharGapWidth();
		if (id.equals(POSTNETComponent.PROPERTY_DISPLAY_CHECKSUM))
			return jrList.getDisplayChecksum();
		if (id.equals(POSTNETComponent.PROPERTY_CHECKSUM_MODE))
			return ChecksumMode.getPos4ChecksumMode(jrList.getChecksumMode());
		if (id.equals(POSTNETComponent.PROPERTY_BASELINE_POSITION))
			return BaselinePosition.getPos4BaselinePosition(jrList.getBaselinePosition());

		return super.getPropertyValue(id);
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		JRDesignComponentElement jrElement = (JRDesignComponentElement) getValue();
		POSTNETComponent jrList = (POSTNETComponent) jrElement.getComponent();

		if (id.equals(POSTNETComponent.PROPERTY_SHORT_BAR_HEIGHT))
			jrList.setShortBarHeight((Double) value);
		else if (id.equals(POSTNETComponent.PROPERTY_INTERCHAR_GAP_WIDTH))
			jrList.setIntercharGapWidth((Double) value);
		else if (id.equals(POSTNETComponent.PROPERTY_CHECKSUM_MODE))
			jrList.setChecksumMode(ChecksumMode.getChecksumMode4Pos((Integer) value));
		else if (id.equals(POSTNETComponent.PROPERTY_BASELINE_POSITION))
			jrList.setChecksumMode(BaselinePosition.getBaselinePosition4Pos((Integer) value));

		else if (id.equals(POSTNETComponent.PROPERTY_DISPLAY_CHECKSUM))
			jrList.setDisplayChecksum((Boolean) value);
		else
			super.setPropertyValue(id, value);
	}
}
