/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
/**
 */
package com.jaspersoft.studio.data.sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.ExpOperand#getPrm <em>Prm</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getExpOperand()
 * @model
 * @generated
 */
public interface ExpOperand extends EObject
{
  /**
   * Returns the value of the '<em><b>Prm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prm</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prm</em>' attribute.
   * @see #setPrm(String)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getExpOperand_Prm()
   * @model
   * @generated
   */
  String getPrm();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.ExpOperand#getPrm <em>Prm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prm</em>' attribute.
   * @see #getPrm()
   * @generated
   */
  void setPrm(String value);

} // ExpOperand
