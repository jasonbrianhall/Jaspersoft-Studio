package com.jaspersoft.studio.editor.expression;

import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JRVariable;

/**
	*
	* @author gtoffoli
	*/
public class ExpObject implements Comparable<ExpObject>{

	public static final int TYPE_FIELD = 0;
	public static final int TYPE_VARIABLE = 1;
	public static final int TYPE_PARAM = 2;

	private String name = "";
	private int type = TYPE_FIELD;
	private String classType = "java.lang.String";

	/** Creates a new instance of ExpObject */
	public ExpObject(String name, int type, String classType) {
		this.setName(name);
		this.setType(type);
		this.setClassType(classType);
	}

	public ExpObject() {
	}

	public ExpObject(Object obj) {
		if (obj instanceof JRField) {
			this.name = ((JRField) obj).getName();
			this.type = TYPE_FIELD;
			this.classType = ((JRField) obj).getValueClassName();
		} else if (obj instanceof JRParameter) {
			this.name = ((JRParameter) obj).getName();
			this.type = TYPE_PARAM;
			this.classType = ((JRParameter) obj).getValueClassName();
		} else if (obj instanceof JRVariable) {
			this.name = ((JRVariable) obj).getName();
			this.type = TYPE_VARIABLE;
			this.classType = ((JRVariable) obj).getValueClassName();
		} else {
			this.name = "" + obj;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getExpression() {
		if (getType() == TYPE_FIELD)
			return "$F{" + getName() + "}";
		if (getType() == TYPE_VARIABLE)
			return "$V{" + getName() + "}";
		if (getType() == TYPE_PARAM)
			return "$P{" + getName() + "}";
		return getName();
	}

	public int compareTo(ExpObject arg0) {
		return getExpression().compareTo(arg0.getExpression());
	}

}

