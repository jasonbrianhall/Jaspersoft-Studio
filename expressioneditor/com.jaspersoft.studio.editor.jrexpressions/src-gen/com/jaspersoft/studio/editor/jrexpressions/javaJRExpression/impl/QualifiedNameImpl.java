/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.QualifiedNameImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.QualifiedNameImpl#getDot <em>Dot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifiedNameImpl extends MinimalEObjectImpl.Container implements QualifiedName
{
  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected EList<String> identifier;

  /**
   * The cached value of the '{@link #getDot() <em>Dot</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDot()
   * @generated
   * @ordered
   */
  protected EList<String> dot;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualifiedNameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JavaJRExpressionPackage.Literals.QUALIFIED_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIdentifier()
  {
    if (identifier == null)
    {
      identifier = new EDataTypeEList<String>(String.class, this, JavaJRExpressionPackage.QUALIFIED_NAME__IDENTIFIER);
    }
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDot()
  {
    if (dot == null)
    {
      dot = new EDataTypeEList<String>(String.class, this, JavaJRExpressionPackage.QUALIFIED_NAME__DOT);
    }
    return dot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JavaJRExpressionPackage.QUALIFIED_NAME__IDENTIFIER:
        return getIdentifier();
      case JavaJRExpressionPackage.QUALIFIED_NAME__DOT:
        return getDot();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavaJRExpressionPackage.QUALIFIED_NAME__IDENTIFIER:
        getIdentifier().clear();
        getIdentifier().addAll((Collection<? extends String>)newValue);
        return;
      case JavaJRExpressionPackage.QUALIFIED_NAME__DOT:
        getDot().clear();
        getDot().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JavaJRExpressionPackage.QUALIFIED_NAME__IDENTIFIER:
        getIdentifier().clear();
        return;
      case JavaJRExpressionPackage.QUALIFIED_NAME__DOT:
        getDot().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JavaJRExpressionPackage.QUALIFIED_NAME__IDENTIFIER:
        return identifier != null && !identifier.isEmpty();
      case JavaJRExpressionPackage.QUALIFIED_NAME__DOT:
        return dot != null && !dot.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(", dot: ");
    result.append(dot);
    result.append(')');
    return result.toString();
  }

} //QualifiedNameImpl
