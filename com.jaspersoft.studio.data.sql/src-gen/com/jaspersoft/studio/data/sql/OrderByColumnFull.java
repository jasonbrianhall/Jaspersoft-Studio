/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
/**
 */
package com.jaspersoft.studio.data.sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order By Column Full</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.OrderByColumnFull#getColOrder <em>Col Order</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.OrderByColumnFull#getColOrderInt <em>Col Order Int</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.OrderByColumnFull#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getOrderByColumnFull()
 * @model
 * @generated
 */
public interface OrderByColumnFull extends OrOrderByColumn
{
  /**
   * Returns the value of the '<em><b>Col Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col Order</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col Order</em>' containment reference.
   * @see #setColOrder(ColumnFull)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOrderByColumnFull_ColOrder()
   * @model containment="true"
   * @generated
   */
  ColumnFull getColOrder();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.OrderByColumnFull#getColOrder <em>Col Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col Order</em>' containment reference.
   * @see #getColOrder()
   * @generated
   */
  void setColOrder(ColumnFull value);

  /**
   * Returns the value of the '<em><b>Col Order Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col Order Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col Order Int</em>' attribute.
   * @see #setColOrderInt(Long)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOrderByColumnFull_ColOrderInt()
   * @model
   * @generated
   */
  Long getColOrderInt();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.OrderByColumnFull#getColOrderInt <em>Col Order Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col Order Int</em>' attribute.
   * @see #getColOrderInt()
   * @generated
   */
  void setColOrderInt(Long value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see #setDirection(String)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOrderByColumnFull_Direction()
   * @model
   * @generated
   */
  String getDirection();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.OrderByColumnFull#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see #getDirection()
   * @generated
   */
  void setDirection(String value);

} // OrderByColumnFull
