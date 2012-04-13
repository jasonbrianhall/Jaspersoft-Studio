/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getLpar <em>Lpar</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getPtype <em>Ptype</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getArrtype <em>Arrtype</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getClazztype <em>Clazztype</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getRpar <em>Rpar</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getCast()
 * @model
 * @generated
 */
public interface Cast extends Expression
{
  /**
   * Returns the value of the '<em><b>Lpar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lpar</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lpar</em>' attribute.
   * @see #setLpar(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getCast_Lpar()
   * @model
   * @generated
   */
  String getLpar();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getLpar <em>Lpar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lpar</em>' attribute.
   * @see #getLpar()
   * @generated
   */
  void setLpar(String value);

  /**
   * Returns the value of the '<em><b>Ptype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ptype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ptype</em>' attribute.
   * @see #setPtype(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getCast_Ptype()
   * @model
   * @generated
   */
  String getPtype();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getPtype <em>Ptype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ptype</em>' attribute.
   * @see #getPtype()
   * @generated
   */
  void setPtype(String value);

  /**
   * Returns the value of the '<em><b>Arrtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrtype</em>' containment reference.
   * @see #setArrtype(ArrayType)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getCast_Arrtype()
   * @model containment="true"
   * @generated
   */
  ArrayType getArrtype();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getArrtype <em>Arrtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrtype</em>' containment reference.
   * @see #getArrtype()
   * @generated
   */
  void setArrtype(ArrayType value);

  /**
   * Returns the value of the '<em><b>Clazztype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clazztype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clazztype</em>' containment reference.
   * @see #setClazztype(ClassOrInterfaceType)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getCast_Clazztype()
   * @model containment="true"
   * @generated
   */
  ClassOrInterfaceType getClazztype();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getClazztype <em>Clazztype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clazztype</em>' containment reference.
   * @see #getClazztype()
   * @generated
   */
  void setClazztype(ClassOrInterfaceType value);

  /**
   * Returns the value of the '<em><b>Rpar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rpar</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rpar</em>' attribute.
   * @see #setRpar(String)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getCast_Rpar()
   * @model
   * @generated
   */
  String getRpar();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getRpar <em>Rpar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rpar</em>' attribute.
   * @see #getRpar()
   * @generated
   */
  void setRpar(String value);

} // Cast
