/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer#getFirstEl <em>First El</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer#getOtherEls <em>Other Els</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArrayInitializer()
 * @model
 * @generated
 */
public interface ArrayInitializer extends EObject
{
  /**
   * Returns the value of the '<em><b>First El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First El</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First El</em>' containment reference.
   * @see #setFirstEl(Expression)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArrayInitializer_FirstEl()
   * @model containment="true"
   * @generated
   */
  Expression getFirstEl();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer#getFirstEl <em>First El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First El</em>' containment reference.
   * @see #getFirstEl()
   * @generated
   */
  void setFirstEl(Expression value);

  /**
   * Returns the value of the '<em><b>Other Els</b></em>' containment reference list.
   * The list contents are of type {@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Els</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Els</em>' containment reference list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArrayInitializer_OtherEls()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getOtherEls();

} // ArrayInitializer
