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
 * A representation of the model object '<em><b>Like</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.Like#getOpLike <em>Op Like</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.Like#getOp2 <em>Op2</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getLike()
 * @model
 * @generated
 */
public interface Like extends EObject
{
  /**
   * Returns the value of the '<em><b>Op Like</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Like</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Like</em>' attribute.
   * @see #setOpLike(String)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getLike_OpLike()
   * @model
   * @generated
   */
  String getOpLike();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.Like#getOpLike <em>Op Like</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Like</em>' attribute.
   * @see #getOpLike()
   * @generated
   */
  void setOpLike(String value);

  /**
   * Returns the value of the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' containment reference.
   * @see #setOp2(LikeOperand)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getLike_Op2()
   * @model containment="true"
   * @generated
   */
  LikeOperand getOp2();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.Like#getOp2 <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' containment reference.
   * @see #getOp2()
   * @generated
   */
  void setOp2(LikeOperand value);

} // Like
