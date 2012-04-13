/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayCreator;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassOrInterfaceType;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Creator;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ExpressionList;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.InnerCreator;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionFactory;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Model;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaJRExpressionPackageImpl extends EPackageImpl implements JavaJRExpressionPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodInvocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseJRExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classCreatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayCreatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass innerCreatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classOrInterfaceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JavaJRExpressionPackageImpl()
  {
    super(eNS_URI, JavaJRExpressionFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JavaJRExpressionPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JavaJRExpressionPackage init()
  {
    if (isInited) return (JavaJRExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(JavaJRExpressionPackage.eNS_URI);

    // Obtain or create and register package
    JavaJRExpressionPackageImpl theJavaJRExpressionPackage = (JavaJRExpressionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavaJRExpressionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavaJRExpressionPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJavaJRExpressionPackage.createPackageContents();

    // Initialize created meta-data
    theJavaJRExpressionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJavaJRExpressionPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JavaJRExpressionPackage.eNS_URI, theJavaJRExpressionPackage);
    return theJavaJRExpressionPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_CondExpr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Basejrexpr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Literal()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_OkReturnedExpr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_KoReturnedExpr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_AndExp()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_PrimaryCond()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Expr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Instanceof()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Rel()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_El()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Target()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_MultExpr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_BaseExpr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Methods()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodInvocation()
  {
    return methodInvocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodInvocation_MethodName()
  {
    return (EReference)methodInvocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodInvocation_Args()
  {
    return (EReference)methodInvocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseJRExpr()
  {
    return baseJRExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBaseJRExpr_FieldToken()
  {
    return (EAttribute)baseJRExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBaseJRExpr_ParameterToken()
  {
    return (EAttribute)baseJRExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBaseJRExpr_VariableToken()
  {
    return (EAttribute)baseJRExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArguments()
  {
    return argumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArguments_LeftP()
  {
    return (EAttribute)argumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArguments_ExprLst()
  {
    return (EReference)argumentsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArguments_RightP()
  {
    return (EAttribute)argumentsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionList()
  {
    return expressionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionList_Expressions()
  {
    return (EReference)expressionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionList_Commas()
  {
    return (EAttribute)expressionListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCast()
  {
    return castEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCast_Lpar()
  {
    return (EAttribute)castEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCast_Ptype()
  {
    return (EAttribute)castEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_Arrtype()
  {
    return (EReference)castEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_Clazztype()
  {
    return (EReference)castEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCast_Rpar()
  {
    return (EAttribute)castEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreator()
  {
    return creatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassCreator()
  {
    return classCreatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassCreator_Clazz()
  {
    return (EReference)classCreatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassCreator_Args()
  {
    return (EReference)classCreatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayCreator()
  {
    return arrayCreatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayCreator_Type()
  {
    return (EReference)arrayCreatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayCreator_ArrayInitializer()
  {
    return (EReference)arrayCreatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayInitializer()
  {
    return arrayInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayInitializer_FirstEl()
  {
    return (EReference)arrayInitializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayInitializer_OtherEls()
  {
    return (EReference)arrayInitializerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInnerCreator()
  {
    return innerCreatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInnerCreator_Args()
  {
    return (EReference)innerCreatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayType()
  {
    return arrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayType_ClazzInterf()
  {
    return (EReference)arrayTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayType_Primtype()
  {
    return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassOrInterfaceType()
  {
    return classOrInterfaceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassOrInterfaceType_QualifiedName()
  {
    return (EReference)classOrInterfaceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedName()
  {
    return qualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedName_Identifier()
  {
    return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedName_Dot()
  {
    return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaJRExpressionFactory getJavaJRExpressionFactory()
  {
    return (JavaJRExpressionFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__COND_EXPR);
    createEReference(expressionEClass, EXPRESSION__BASEJREXPR);
    createEAttribute(expressionEClass, EXPRESSION__LITERAL);
    createEReference(expressionEClass, EXPRESSION__OK_RETURNED_EXPR);
    createEReference(expressionEClass, EXPRESSION__KO_RETURNED_EXPR);
    createEReference(expressionEClass, EXPRESSION__AND_EXP);
    createEReference(expressionEClass, EXPRESSION__PRIMARY_COND);
    createEReference(expressionEClass, EXPRESSION__EXPR);
    createEReference(expressionEClass, EXPRESSION__INSTANCEOF);
    createEReference(expressionEClass, EXPRESSION__REL);
    createEReference(expressionEClass, EXPRESSION__EL);
    createEReference(expressionEClass, EXPRESSION__TARGET);
    createEReference(expressionEClass, EXPRESSION__MULT_EXPR);
    createEReference(expressionEClass, EXPRESSION__BASE_EXPR);
    createEReference(expressionEClass, EXPRESSION__METHODS);

    methodInvocationEClass = createEClass(METHOD_INVOCATION);
    createEReference(methodInvocationEClass, METHOD_INVOCATION__METHOD_NAME);
    createEReference(methodInvocationEClass, METHOD_INVOCATION__ARGS);

    baseJRExprEClass = createEClass(BASE_JR_EXPR);
    createEAttribute(baseJRExprEClass, BASE_JR_EXPR__FIELD_TOKEN);
    createEAttribute(baseJRExprEClass, BASE_JR_EXPR__PARAMETER_TOKEN);
    createEAttribute(baseJRExprEClass, BASE_JR_EXPR__VARIABLE_TOKEN);

    argumentsEClass = createEClass(ARGUMENTS);
    createEAttribute(argumentsEClass, ARGUMENTS__LEFT_P);
    createEReference(argumentsEClass, ARGUMENTS__EXPR_LST);
    createEAttribute(argumentsEClass, ARGUMENTS__RIGHT_P);

    expressionListEClass = createEClass(EXPRESSION_LIST);
    createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSIONS);
    createEAttribute(expressionListEClass, EXPRESSION_LIST__COMMAS);

    castEClass = createEClass(CAST);
    createEAttribute(castEClass, CAST__LPAR);
    createEAttribute(castEClass, CAST__PTYPE);
    createEReference(castEClass, CAST__ARRTYPE);
    createEReference(castEClass, CAST__CLAZZTYPE);
    createEAttribute(castEClass, CAST__RPAR);

    creatorEClass = createEClass(CREATOR);

    classCreatorEClass = createEClass(CLASS_CREATOR);
    createEReference(classCreatorEClass, CLASS_CREATOR__CLAZZ);
    createEReference(classCreatorEClass, CLASS_CREATOR__ARGS);

    arrayCreatorEClass = createEClass(ARRAY_CREATOR);
    createEReference(arrayCreatorEClass, ARRAY_CREATOR__TYPE);
    createEReference(arrayCreatorEClass, ARRAY_CREATOR__ARRAY_INITIALIZER);

    arrayInitializerEClass = createEClass(ARRAY_INITIALIZER);
    createEReference(arrayInitializerEClass, ARRAY_INITIALIZER__FIRST_EL);
    createEReference(arrayInitializerEClass, ARRAY_INITIALIZER__OTHER_ELS);

    innerCreatorEClass = createEClass(INNER_CREATOR);
    createEReference(innerCreatorEClass, INNER_CREATOR__ARGS);

    arrayTypeEClass = createEClass(ARRAY_TYPE);
    createEReference(arrayTypeEClass, ARRAY_TYPE__CLAZZ_INTERF);
    createEAttribute(arrayTypeEClass, ARRAY_TYPE__PRIMTYPE);

    classOrInterfaceTypeEClass = createEClass(CLASS_OR_INTERFACE_TYPE);
    createEReference(classOrInterfaceTypeEClass, CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME);

    qualifiedNameEClass = createEClass(QUALIFIED_NAME);
    createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__IDENTIFIER);
    createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__DOT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    expressionEClass.getESuperTypes().add(this.getModel());
    methodInvocationEClass.getESuperTypes().add(this.getExpression());
    castEClass.getESuperTypes().add(this.getExpression());
    creatorEClass.getESuperTypes().add(this.getExpression());
    classCreatorEClass.getESuperTypes().add(this.getCreator());
    arrayCreatorEClass.getESuperTypes().add(this.getCreator());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_CondExpr(), this.getExpression(), null, "condExpr", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Basejrexpr(), this.getBaseJRExpr(), null, "basejrexpr", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_OkReturnedExpr(), this.getExpression(), null, "okReturnedExpr", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_KoReturnedExpr(), this.getExpression(), null, "koReturnedExpr", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_AndExp(), this.getExpression(), null, "andExp", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_PrimaryCond(), this.getExpression(), null, "primaryCond", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Expr(), this.getExpression(), null, "expr", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Instanceof(), this.getExpression(), null, "instanceof", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Rel(), this.getExpression(), null, "rel", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_El(), this.getExpression(), null, "el", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_MultExpr(), this.getExpression(), null, "multExpr", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_BaseExpr(), this.getExpression(), null, "baseExpr", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Methods(), this.getMethodInvocation(), null, "methods", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodInvocationEClass, MethodInvocation.class, "MethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodInvocation_MethodName(), this.getQualifiedName(), null, "methodName", null, 0, 1, MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodInvocation_Args(), this.getArguments(), null, "args", null, 0, 1, MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseJRExprEClass, BaseJRExpr.class, "BaseJRExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBaseJRExpr_FieldToken(), ecorePackage.getEString(), "fieldToken", null, 0, 1, BaseJRExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBaseJRExpr_ParameterToken(), ecorePackage.getEString(), "parameterToken", null, 0, 1, BaseJRExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBaseJRExpr_VariableToken(), ecorePackage.getEString(), "variableToken", null, 0, 1, BaseJRExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentsEClass, Arguments.class, "Arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArguments_LeftP(), ecorePackage.getEString(), "leftP", null, 0, 1, Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArguments_ExprLst(), this.getExpressionList(), null, "exprLst", null, 0, 1, Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArguments_RightP(), ecorePackage.getEString(), "rightP", null, 0, 1, Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionList_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionList_Commas(), ecorePackage.getEString(), "commas", null, 0, -1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castEClass, Cast.class, "Cast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCast_Lpar(), ecorePackage.getEString(), "lpar", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCast_Ptype(), ecorePackage.getEString(), "ptype", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCast_Arrtype(), this.getArrayType(), null, "arrtype", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCast_Clazztype(), this.getClassOrInterfaceType(), null, "clazztype", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCast_Rpar(), ecorePackage.getEString(), "rpar", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(creatorEClass, Creator.class, "Creator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classCreatorEClass, ClassCreator.class, "ClassCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassCreator_Clazz(), this.getClassOrInterfaceType(), null, "clazz", null, 0, 1, ClassCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassCreator_Args(), this.getArguments(), null, "args", null, 0, 1, ClassCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayCreatorEClass, ArrayCreator.class, "ArrayCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayCreator_Type(), this.getArrayType(), null, "type", null, 0, 1, ArrayCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayCreator_ArrayInitializer(), this.getArrayInitializer(), null, "arrayInitializer", null, 0, 1, ArrayCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayInitializerEClass, ArrayInitializer.class, "ArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayInitializer_FirstEl(), this.getExpression(), null, "firstEl", null, 0, 1, ArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayInitializer_OtherEls(), this.getExpression(), null, "otherEls", null, 0, -1, ArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(innerCreatorEClass, InnerCreator.class, "InnerCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInnerCreator_Args(), this.getArguments(), null, "args", null, 0, 1, InnerCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayType_ClazzInterf(), this.getClassOrInterfaceType(), null, "clazzInterf", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrayType_Primtype(), ecorePackage.getEString(), "primtype", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classOrInterfaceTypeEClass, ClassOrInterfaceType.class, "ClassOrInterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassOrInterfaceType_QualifiedName(), this.getQualifiedName(), null, "qualifiedName", null, 0, 1, ClassOrInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedNameEClass, QualifiedName.class, "QualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedName_Identifier(), ecorePackage.getEString(), "identifier", null, 0, -1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQualifiedName_Dot(), ecorePackage.getEString(), "dot", null, 0, -1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //JavaJRExpressionPackageImpl
