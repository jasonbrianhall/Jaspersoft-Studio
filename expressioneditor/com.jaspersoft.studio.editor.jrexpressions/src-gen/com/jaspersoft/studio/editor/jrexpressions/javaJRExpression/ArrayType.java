/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType#getClazzInterf <em>Clazz Interf</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType#getPrimtype <em>Primtype</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends EObject
{
  /**
   * Returns the value of the '<em><b>Clazz Interf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clazz Interf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clazz Interf</em>' containment reference.
   * @see #setClazzInterf(ClassOrInterfaceType)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArrayType_ClazzInterf()
   * @model containment="true"
   * @generated
   */
  ClassOrInterfaceType getClazzInterf();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType#getClazzInterf <em>Clazz Interf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clazz Interf</em>' containment reference.
   * @see #getClazzInterf()
   * @generated
   */
  void setClazzInterf(ClassOrInterfaceType value);

  /**
   * Returns the value of the '<em><b>Primtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primtype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primtype</em>' attribute.
   * @see #setPrimtype(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArrayType_Primtype()
   * @model
   * @generated
   */
  String getPrimtype();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType#getPrimtype <em>Primtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primtype</em>' attribute.
   * @see #getPrimtype()
   * @generated
   */
  void setPrimtype(String value);

} // ArrayType
