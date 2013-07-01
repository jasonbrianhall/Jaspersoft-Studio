/**
 */
package com.jaspersoft.studio.data.sql;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Array Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.DateArrayExpression#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getDateArrayExpression()
 * @model
 * @generated
 */
public interface DateArrayExpression extends ArrayExpression
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.util.Date}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getDateArrayExpression_Values()
   * @model unique="false"
   * @generated
   */
  EList<Date> getValues();

} // DateArrayExpression
