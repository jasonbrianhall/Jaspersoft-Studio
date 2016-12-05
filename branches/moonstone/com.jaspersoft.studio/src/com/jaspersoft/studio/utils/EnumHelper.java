/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import net.sf.jasperreports.engine.type.NamedEnum;

import org.eclipse.osgi.util.NLS;

import com.jaspersoft.studio.messages.MessagesByKeys;
import com.jaspersoft.studio.property.descriptor.NullEnum;

public class EnumHelper {

	public static String[] getEnumNames(Class<? extends NamedEnum> enumClazz, NullEnum type) {
		NamedEnum[] enums = enumClazz.getEnumConstants();
		return getEnumNames(enums, type);
	}

	/**
	 * 
	 * @param namedEnum
	 * @param nullable
	 * @param skipPositions
	 *          - 0-based index of the NamedEnum to be skipped
	 * @return
	 */
	public static String[] getEnumNames(NamedEnum[] namedEnum, NullEnum nullable, Integer... skipPositions) {
		List<String> res = new ArrayList<String>();
		if (nullable != NullEnum.NOTNULL)
			res.add(nullable.getName());
		for (int i = 0; i < namedEnum.length; i++) {
			boolean skip = false;

			for (int j = 0; j < skipPositions.length; j++) {
				if (i == skipPositions[j]) {
					skip = true;
				}
			}

			if (!skip) {
				res.add(MessagesByKeys.getString(namedEnum[i].getName()));
			}
		}
		return res.toArray(new String[res.size()]);
	}

	/**
	 * Return a map of all the enum value associated with the localized value in human language 
	 * 
	 * @param namedEnum the enum to convert in message
	 * @param nullable the value of the nullable, if it is different from to Not null then also the nullable
	 * value is added to the map
	 * @return a not null hash map, the key is the enum value, the value is the textual representation
	 */
	public static LinkedHashMap<Object, String> getEnumMapNames(NamedEnum[] namedEnum, NullEnum nullable) {
		LinkedHashMap<Object, String> res = new LinkedHashMap<Object, String>();
		if (nullable != NullEnum.NOTNULL)
			res.put(NullEnum.NOTNULL, nullable.getName());
		for (int i = 0; i < namedEnum.length; i++)
			res.put(namedEnum[i], MessagesByKeys.getString(namedEnum[i].getName()));
		return res;
	}
	
	/**
	 * 
	 * @param namedEnum
	 * @param nullable
	 * @param skipPositions
	 *          - 0-based index of the NamedEnum to be skipped
	 * @return
	 */
	public static String[] getEnumNames(NamedEnum[] namedEnum, NullEnum nullable) {
		List<String> res = new ArrayList<String>();
		if (nullable != NullEnum.NOTNULL)
			res.add(nullable.getName());
		for (int i = 0; i < namedEnum.length; i++)
			res.add(MessagesByKeys.getString(namedEnum[i].getName()));
		return res.toArray(new String[res.size()]);
	}

	/**
	 * Retrieves the correct {@link NamedEnum} instance which name translation matches the specified one.
	 * 
	 * @param enums
	 *          a list of enumerations to look into
	 * @param objValue
	 *          the object value to be decoded
	 * @return the correct enum, <code>null</code> otherwise
	 */
	public static <T extends NamedEnum> T getEnumByObjectValue(T[] enums, Object objValue) {
		return getEnumByObjectValue(enums, objValue, false);
	}

	/**
	 * Retrieves the correct {@link NamedEnum} instance which name translation matches the specified one.
	 * 
	 * @param enums
	 *          a list of enumerations to look into
	 * @param objValue
	 *          the object value to be decoded
	 * @param isNullable
	 *          flag that specify if we need to consider also the <code>null</code> as possible valid return value
	 * @return the correct enum, <code>null</code> otherwise
	 */
	public static <T extends NamedEnum> T getEnumByObjectValue(T[] enums, Object objValue, boolean isNullable) {
		if (objValue == null) {
			return null;
		} else if (objValue instanceof NamedEnum) {
			@SuppressWarnings("unchecked")
			T foundEnum = (T) objValue;
			return foundEnum;
		} else if (objValue instanceof String) {
			for (T e : enums) {
				if (objValue.equals(MessagesByKeys.getString(e.getName()))) {
					return e;
				}
			}
			return null;
		} else if (objValue instanceof Number) {
			Integer val = ((Number) objValue).intValue();
			if (val < 0 || val > enums.length)
				return null;
			if (isNullable) {
				if (val == 0) {
					return null;
				} else {
					return enums[val - 1];
				}
			} else {
				return enums[val];
			}
		} else {
			throw new UnsupportedOperationException(
					NLS.bind("Cannot convert the object of type {0} to a valid instance of NamedEnum.",
							objValue.getClass().getCanonicalName()));
		}
	}

	/**
	 * Retrieve the position index of the specified enum into an array of readable enum names.
	 * 
	 * @param enumNames
	 *          the array of enun names
	 * @param namedEnum
	 *          the enumeration object
	 * @return the position index
	 */
	public static int getEnumIndexByTranslatedName(String[] enumNames, NamedEnum namedEnum) {
		if (namedEnum == null) {
			return 0;
		} else {
			String translation = getEnumTranslation(namedEnum);
			for (int i = 0; i < enumNames.length; i++) {
				if (enumNames[i].equals(translation)) {
					return i;
				}
			}
			return 0;
		}
	}

	/**
	 * Gets the translation of the specified enumeration instance.
	 * 
	 * @param nameEnum
	 *          the enumeration
	 * @return the human readable translation
	 */
	public static String getEnumTranslation(NamedEnum nameEnum) {
		return MessagesByKeys.getString(nameEnum.getName());
	}
}
