/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator#getClazz <em>Clazz</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getClassCreator()
 * @model
 * @generated
 */
public interface ClassCreator extends Creator
{
  /**
   * Returns the value of the '<em><b>Clazz</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clazz</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clazz</em>' containment reference.
   * @see #setClazz(ClassOrInterfaceType)
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getClassCreator_Clazz()
   * @model containment="true"
   * @generated
   */
  ClassOrInterfaceType getClazz();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator#getClazz <em>Clazz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clazz</em>' containment reference.
   * @see #getClazz()
   * @generated
   */
  void setClazz(ClassOrInterfaceType value);

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
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getClassCreator_Args()
   * @model containment="true"
   * @generated
   */
  Arguments getArgs();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(Arguments value);

} // ClassCreator
