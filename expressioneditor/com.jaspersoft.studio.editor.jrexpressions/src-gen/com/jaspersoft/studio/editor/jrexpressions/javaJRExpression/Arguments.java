/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getLeftP <em>Left P</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getExprLst <em>Expr Lst</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getRightP <em>Right P</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArguments()
 * @model
 * @generated
 */
public interface Arguments extends EObject
{
  /**
   * Returns the value of the '<em><b>Left P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left P</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left P</em>' attribute.
   * @see #setLeftP(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArguments_LeftP()
   * @model
   * @generated
   */
  String getLeftP();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getLeftP <em>Left P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left P</em>' attribute.
   * @see #getLeftP()
   * @generated
   */
  void setLeftP(String value);

  /**
   * Returns the value of the '<em><b>Expr Lst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Lst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Lst</em>' containment reference.
   * @see #setExprLst(ExpressionList)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArguments_ExprLst()
   * @model containment="true"
   * @generated
   */
  ExpressionList getExprLst();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getExprLst <em>Expr Lst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Lst</em>' containment reference.
   * @see #getExprLst()
   * @generated
   */
  void setExprLst(ExpressionList value);

  /**
   * Returns the value of the '<em><b>Right P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right P</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right P</em>' attribute.
   * @see #setRightP(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getArguments_RightP()
   * @model
   * @generated
   */
  String getRightP();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getRightP <em>Right P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right P</em>' attribute.
   * @see #getRightP()
   * @generated
   */
  void setRightP(String value);

} // Arguments
