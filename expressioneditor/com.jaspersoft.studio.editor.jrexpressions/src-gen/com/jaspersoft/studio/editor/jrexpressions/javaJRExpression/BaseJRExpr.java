/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base JR Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getFieldToken <em>Field Token</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getParameterToken <em>Parameter Token</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getVariableToken <em>Variable Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getBaseJRExpr()
 * @model
 * @generated
 */
public interface BaseJRExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Field Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Token</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Token</em>' attribute.
   * @see #setFieldToken(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getBaseJRExpr_FieldToken()
   * @model
   * @generated
   */
  String getFieldToken();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getFieldToken <em>Field Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Token</em>' attribute.
   * @see #getFieldToken()
   * @generated
   */
  void setFieldToken(String value);

  /**
   * Returns the value of the '<em><b>Parameter Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Token</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Token</em>' attribute.
   * @see #setParameterToken(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getBaseJRExpr_ParameterToken()
   * @model
   * @generated
   */
  String getParameterToken();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getParameterToken <em>Parameter Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Token</em>' attribute.
   * @see #getParameterToken()
   * @generated
   */
  void setParameterToken(String value);

  /**
   * Returns the value of the '<em><b>Variable Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Token</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Token</em>' attribute.
   * @see #setVariableToken(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getBaseJRExpr_VariableToken()
   * @model
   * @generated
   */
  String getVariableToken();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getVariableToken <em>Variable Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Token</em>' attribute.
   * @see #getVariableToken()
   * @generated
   */
  void setVariableToken(String value);

} // BaseJRExpr
