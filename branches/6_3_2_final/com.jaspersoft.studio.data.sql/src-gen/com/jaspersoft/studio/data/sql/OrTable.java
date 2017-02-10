/**
 */
package com.jaspersoft.studio.data.sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.OrTable#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getOrTable()
 * @model
 * @generated
 */
public interface OrTable extends EObject
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link com.jaspersoft.studio.data.sql.FromTable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOrTable_Entries()
   * @model containment="true"
   * @generated
   */
  EList<FromTable> getEntries();

} // OrTable
