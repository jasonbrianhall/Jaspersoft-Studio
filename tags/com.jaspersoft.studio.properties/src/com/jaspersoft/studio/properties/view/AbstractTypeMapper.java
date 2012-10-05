/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.jaspersoft.studio.properties.view;

/**
 * Default implementation of a type mapper.
 * 
 * @author Anthony Hunter
 */
public class AbstractTypeMapper
    implements ITypeMapper {

    public Class<? extends Object> mapType(Object object) {
        return object.getClass();
    }

}
