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
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getBasejrexpr <em>Basejrexpr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getOkReturnedExpr <em>Ok Returned Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getKoReturnedExpr <em>Ko Returned Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getAndExp <em>And Exp</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getPrimaryCond <em>Primary Cond</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getInstanceof <em>Instanceof</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getRel <em>Rel</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getEl <em>El</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getTarget <em>Target</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getMultExpr <em>Mult Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getBaseExpr <em>Base Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Model
{
  /**
   * Returns the value of the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond Expr</em>' containment reference.
   * @see #setCondExpr(Expression)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_CondExpr()
   * @model containment="true"
   * @generated
   */
  Expression getCondExpr();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getCondExpr <em>Cond Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond Expr</em>' containment reference.
   * @see #getCondExpr()
   * @generated
   */
  void setCondExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Basejrexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basejrexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basejrexpr</em>' containment reference.
   * @see #setBasejrexpr(BaseJRExpr)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_Basejrexpr()
   * @model containment="true"
   * @generated
   */
  BaseJRExpr getBasejrexpr();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getBasejrexpr <em>Basejrexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basejrexpr</em>' containment reference.
   * @see #getBasejrexpr()
   * @generated
   */
  void setBasejrexpr(BaseJRExpr value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_Literal()
   * @model
   * @generated
   */
  String getLiteral();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(String value);

  /**
   * Returns the value of the '<em><b>Ok Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ok Returned Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ok Returned Expr</em>' containment reference.
   * @see #setOkReturnedExpr(Expression)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_OkReturnedExpr()
   * @model containment="true"
   * @generated
   */
  Expression getOkReturnedExpr();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getOkReturnedExpr <em>Ok Returned Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ok Returned Expr</em>' containment reference.
   * @see #getOkReturnedExpr()
   * @generated
   */
  void setOkReturnedExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Ko Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ko Returned Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ko Returned Expr</em>' containment reference.
   * @see #setKoReturnedExpr(Expression)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_KoReturnedExpr()
   * @model containment="true"
   * @generated
   */
  Expression getKoReturnedExpr();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getKoReturnedExpr <em>Ko Returned Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ko Returned Expr</em>' containment reference.
   * @see #getKoReturnedExpr()
   * @generated
   */
  void setKoReturnedExpr(Expression value);

  /**
   * Returns the value of the '<em><b>And Exp</b></em>' containment reference list.
   * The list contents are of type {@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And Exp</em>' containment reference list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_AndExp()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getAndExp();

  /**
   * Returns the value of the '<em><b>Primary Cond</b></em>' containment reference list.
   * The list contents are of type {@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Cond</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Cond</em>' containment reference list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_PrimaryCond()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getPrimaryCond();

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Instanceof</b></em>' containment reference list.
   * The list contents are of type {@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instanceof</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instanceof</em>' containment reference list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_Instanceof()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getInstanceof();

  /**
   * Returns the value of the '<em><b>Rel</b></em>' containment reference list.
   * The list contents are of type {@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel</em>' containment reference list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_Rel()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getRel();

  /**
   * Returns the value of the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El</em>' containment reference.
   * @see #setEl(Expression)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_El()
   * @model containment="true"
   * @generated
   */
  Expression getEl();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getEl <em>El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>El</em>' containment reference.
   * @see #getEl()
   * @generated
   */
  void setEl(Expression value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(EObject)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_Target()
   * @model containment="true"
   * @generated
   */
  EObject getTarget();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(EObject value);

  /**
   * Returns the value of the '<em><b>Mult Expr</b></em>' containment reference list.
   * The list contents are of type {@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mult Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mult Expr</em>' containment reference list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_MultExpr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getMultExpr();

  /**
   * Returns the value of the '<em><b>Base Expr</b></em>' containment reference list.
   * The list contents are of type {@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Expr</em>' containment reference list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_BaseExpr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getBaseExpr();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getExpression_Methods()
   * @model containment="true"
   * @generated
   */
  EList<MethodInvocation> getMethods();

} // Expression
