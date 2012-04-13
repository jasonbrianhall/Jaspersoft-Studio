/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base JR Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.BaseJRExprImpl#getFieldToken <em>Field Token</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.BaseJRExprImpl#getParameterToken <em>Parameter Token</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.BaseJRExprImpl#getVariableToken <em>Variable Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseJRExprImpl extends MinimalEObjectImpl.Container implements BaseJRExpr
{
  /**
   * The default value of the '{@link #getFieldToken() <em>Field Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldToken()
   * @generated
   * @ordered
   */
  protected static final String FIELD_TOKEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldToken() <em>Field Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldToken()
   * @generated
   * @ordered
   */
  protected String fieldToken = FIELD_TOKEN_EDEFAULT;

  /**
   * The default value of the '{@link #getParameterToken() <em>Parameter Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterToken()
   * @generated
   * @ordered
   */
  protected static final String PARAMETER_TOKEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameterToken() <em>Parameter Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterToken()
   * @generated
   * @ordered
   */
  protected String parameterToken = PARAMETER_TOKEN_EDEFAULT;

  /**
   * The default value of the '{@link #getVariableToken() <em>Variable Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableToken()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_TOKEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableToken() <em>Variable Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableToken()
   * @generated
   * @ordered
   */
  protected String variableToken = VARIABLE_TOKEN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaseJRExprImpl()
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
    return JavaJRExpressionPackage.Literals.BASE_JR_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldToken()
  {
    return fieldToken;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldToken(String newFieldToken)
  {
    String oldFieldToken = fieldToken;
    fieldToken = newFieldToken;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.BASE_JR_EXPR__FIELD_TOKEN, oldFieldToken, fieldToken));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameterToken()
  {
    return parameterToken;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterToken(String newParameterToken)
  {
    String oldParameterToken = parameterToken;
    parameterToken = newParameterToken;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.BASE_JR_EXPR__PARAMETER_TOKEN, oldParameterToken, parameterToken));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariableToken()
  {
    return variableToken;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableToken(String newVariableToken)
  {
    String oldVariableToken = variableToken;
    variableToken = newVariableToken;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.BASE_JR_EXPR__VARIABLE_TOKEN, oldVariableToken, variableToken));
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
      case JavaJRExpressionPackage.BASE_JR_EXPR__FIELD_TOKEN:
        return getFieldToken();
      case JavaJRExpressionPackage.BASE_JR_EXPR__PARAMETER_TOKEN:
        return getParameterToken();
      case JavaJRExpressionPackage.BASE_JR_EXPR__VARIABLE_TOKEN:
        return getVariableToken();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavaJRExpressionPackage.BASE_JR_EXPR__FIELD_TOKEN:
        setFieldToken((String)newValue);
        return;
      case JavaJRExpressionPackage.BASE_JR_EXPR__PARAMETER_TOKEN:
        setParameterToken((String)newValue);
        return;
      case JavaJRExpressionPackage.BASE_JR_EXPR__VARIABLE_TOKEN:
        setVariableToken((String)newValue);
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
      case JavaJRExpressionPackage.BASE_JR_EXPR__FIELD_TOKEN:
        setFieldToken(FIELD_TOKEN_EDEFAULT);
        return;
      case JavaJRExpressionPackage.BASE_JR_EXPR__PARAMETER_TOKEN:
        setParameterToken(PARAMETER_TOKEN_EDEFAULT);
        return;
      case JavaJRExpressionPackage.BASE_JR_EXPR__VARIABLE_TOKEN:
        setVariableToken(VARIABLE_TOKEN_EDEFAULT);
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
      case JavaJRExpressionPackage.BASE_JR_EXPR__FIELD_TOKEN:
        return FIELD_TOKEN_EDEFAULT == null ? fieldToken != null : !FIELD_TOKEN_EDEFAULT.equals(fieldToken);
      case JavaJRExpressionPackage.BASE_JR_EXPR__PARAMETER_TOKEN:
        return PARAMETER_TOKEN_EDEFAULT == null ? parameterToken != null : !PARAMETER_TOKEN_EDEFAULT.equals(parameterToken);
      case JavaJRExpressionPackage.BASE_JR_EXPR__VARIABLE_TOKEN:
        return VARIABLE_TOKEN_EDEFAULT == null ? variableToken != null : !VARIABLE_TOKEN_EDEFAULT.equals(variableToken);
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
    result.append(" (fieldToken: ");
    result.append(fieldToken);
    result.append(", parameterToken: ");
    result.append(parameterToken);
    result.append(", variableToken: ");
    result.append(variableToken);
    result.append(')');
    return result.toString();
  }

} //BaseJRExprImpl
