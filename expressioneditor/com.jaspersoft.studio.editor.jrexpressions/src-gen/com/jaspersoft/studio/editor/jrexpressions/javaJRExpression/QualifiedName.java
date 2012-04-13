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
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName#getDot <em>Dot</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QualifiedName extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getQualifiedName_Identifier()
   * @model unique="false"
   * @generated
   */
  EList<String> getIdentifier();

  /**
   * Returns the value of the '<em><b>Dot</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dot</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dot</em>' attribute list.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#getQualifiedName_Dot()
   * @model unique="false"
   * @generated
   */
  EList<String> getDot();

} // QualifiedName
