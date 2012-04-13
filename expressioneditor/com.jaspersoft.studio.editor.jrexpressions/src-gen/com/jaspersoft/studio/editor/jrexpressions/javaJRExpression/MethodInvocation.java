/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getMethodInvocation()
 * @model
 * @generated
 */
public interface MethodInvocation extends Expression
{
  /**
   * Returns the value of the '<em><b>Method Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Name</em>' containment reference.
   * @see #setMethodName(QualifiedName)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getMethodInvocation_MethodName()
   * @model containment="true"
   * @generated
   */
  QualifiedName getMethodName();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation#getMethodName <em>Method Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Name</em>' containment reference.
   * @see #getMethodName()
   * @generated
   */
  void setMethodName(QualifiedName value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(Arguments)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getMethodInvocation_Args()
   * @model containment="true"
   * @generated
   */
  Arguments getArgs();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(Arguments value);

} // MethodInvocation
