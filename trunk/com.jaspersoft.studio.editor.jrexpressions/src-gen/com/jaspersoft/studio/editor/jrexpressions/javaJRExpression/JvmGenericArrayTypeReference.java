/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jvm Generic Array Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JvmGenericArrayTypeReference#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getJvmGenericArrayTypeReference()
 * @model
 * @generated
 */
public interface JvmGenericArrayTypeReference extends JvmTypeReference
{
  /**
   * Returns the value of the '<em><b>Component Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Type</em>' containment reference.
   * @see #setComponentType(JvmParameterizedTypeReference)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getJvmGenericArrayTypeReference_ComponentType()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getComponentType();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JvmGenericArrayTypeReference#getComponentType <em>Component Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Type</em>' containment reference.
   * @see #getComponentType()
   * @generated
   */
  void setComponentType(JvmParameterizedTypeReference value);

} // JvmGenericArrayTypeReference
