/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.jasperreports.engine.JRConstants;

import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.utils.Misc;

public abstract class AMapElement extends APropertyNode {

	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public AMapElement() {
		super();
		setValue("");
	}

	public AMapElement(ANode parent, int index) {
		super(parent, index);
	}

	public AMapElement(ANode parent, Object value, int index) {
		super(parent, index);
		setValue(Misc.nvl(value, ""));
	}

	private IPropertyDescriptor[] descriptors;
	private Map<String, Object> defaultsMap;

	@Override
	public Map<String, Object> getDefaultsMap() {
		if (defaultsMap == null)
			getPropertyDescriptors();
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

	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc, Map<String, Object> defaultsMap) {
	}

	protected Map<String, Object> props = new HashMap<String, Object>();

	@Override
	public Object getPropertyValue(Object id) {
		return Misc.nvl(props.get(id), getDefaultsMap().get(id));
	}

	@Override
	public Object getPropertyActualValue(Object id) {
		return props.get(id);
	}

	private boolean noEvents = false;

	public void setNoEvents(boolean noEvents) {
		this.noEvents = noEvents;
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		Object oldVal = props.get((String) id);
		if (value == null)
			props.remove((String) id);
		else
			props.put((String) id, value);
		// System.out.println(id + " ; " + value);
		if (!noEvents) {
			firePropertyChange(id, value, oldVal);
		}
	}

	public void firePropertyChange(Object id, Object value, Object oldVal) {
		if (getRoot() != null)
			getRoot().getPropertyChangeSupport().firePropertyChange((String) id, oldVal, value);
		getPropertyChangeSupport().firePropertyChange((String) id, oldVal, value);
	}

	public Set<String> getProperties() {
		return props.keySet();
	}

	public void copyProperties(Map<String, Object> ps) {
		setNoEvents(true);
		props.clear();
		for (String key : ps.keySet())
			setPropertyValue(key, ps.get(key));
		setNoEvents(false);
	}

	public void copyProperties(AMapElement dest) {
		dest.setNoEvents(true);
		for (String key : props.keySet())
			dest.setPropertyValue(key, getPropertyValue(key));
		dest.setNoEvents(false);
	}

	public Map<String, Object> copyPropertiesUndo(AMapElement dest) {
		Map<String, Object> old = new HashMap<String, Object>();
		dest.setNoEvents(true);
		for (String key : props.keySet()) {
			old.put(key, dest.getPropertyValue(key));
			dest.setPropertyValue(key, getPropertyValue(key));
		}
		dest.setNoEvents(false);
		return old;
	}
}
