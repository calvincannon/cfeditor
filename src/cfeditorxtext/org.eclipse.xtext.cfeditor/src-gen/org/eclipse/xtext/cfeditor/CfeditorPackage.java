/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.cfeditor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.cfeditor.CfeditorFactory
 * @model kind="package"
 * @generated
 */
public interface CfeditorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cfeditor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/Cfeditor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cfeditor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CfeditorPackage eINSTANCE = org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.CfModelImpl <em>Cf Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.CfModelImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getCfModel()
   * @generated
   */
  int CF_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CF_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Cf Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CF_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.AbstractElementImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.PartImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getPart()
   * @generated
   */
  int PART = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.BundleImpl <em>Bundle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.BundleImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBundle()
   * @generated
   */
  int BUNDLE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__NAME = PART__NAME;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__COMPONENT = PART_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Promise Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PROMISE_TYPE = PART_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_FEATURE_COUNT = PART_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.BodyImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBody()
   * @generated
   */
  int BODY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__NAME = PART__NAME;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__COMPONENT = PART_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Promise Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__PROMISE_TYPE = PART_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = PART_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.BodyFunctionImpl <em>Body Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.BodyFunctionImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBodyFunction()
   * @generated
   */
  int BODY_FUNCTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FUNCTION__VALUES = 1;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FUNCTION__FUNCTION = 2;

  /**
   * The number of structural features of the '<em>Body Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FUNCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.SpecialFunctionImpl <em>Special Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.SpecialFunctionImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getSpecialFunction()
   * @generated
   */
  int SPECIAL_FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_FUNCTION__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Special Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.BundlePromiseTypeImpl <em>Bundle Promise Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.BundlePromiseTypeImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBundlePromiseType()
   * @generated
   */
  int BUNDLE_PROMISE_TYPE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_PROMISE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Bundle Promise Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_PROMISE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.BodyPromiseTypeImpl <em>Body Promise Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.BodyPromiseTypeImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBodyPromiseType()
   * @generated
   */
  int BODY_PROMISE_TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_PROMISE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Body Promise Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_PROMISE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.BundleComponentImpl <em>Bundle Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.BundleComponentImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBundleComponent()
   * @generated
   */
  int BUNDLE_COMPONENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_COMPONENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Bundle Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_COMPONENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.BodyComponentImpl <em>Body Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.BodyComponentImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBodyComponent()
   * @generated
   */
  int BODY_COMPONENT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Body Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.CfModel <em>Cf Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cf Model</em>'.
   * @see org.eclipse.xtext.cfeditor.CfModel
   * @generated
   */
  EClass getCfModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.cfeditor.CfModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipse.xtext.cfeditor.CfModel#getElements()
   * @see #getCfModel()
   * @generated
   */
  EReference getCfModel_Elements();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.eclipse.xtext.cfeditor.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part</em>'.
   * @see org.eclipse.xtext.cfeditor.Part
   * @generated
   */
  EClass getPart();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.Part#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.Part#getName()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.Bundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle</em>'.
   * @see org.eclipse.xtext.cfeditor.Bundle
   * @generated
   */
  EClass getBundle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.cfeditor.Bundle#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see org.eclipse.xtext.cfeditor.Bundle#getComponent()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_Component();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.cfeditor.Bundle#getPromiseType <em>Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Promise Type</em>'.
   * @see org.eclipse.xtext.cfeditor.Bundle#getPromiseType()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_PromiseType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.eclipse.xtext.cfeditor.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.cfeditor.Body#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see org.eclipse.xtext.cfeditor.Body#getComponent()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Component();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.cfeditor.Body#getPromiseType <em>Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Promise Type</em>'.
   * @see org.eclipse.xtext.cfeditor.Body#getPromiseType()
   * @see #getBody()
   * @generated
   */
  EReference getBody_PromiseType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.BodyFunction <em>Body Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Function</em>'.
   * @see org.eclipse.xtext.cfeditor.BodyFunction
   * @generated
   */
  EClass getBodyFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.cfeditor.BodyFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.BodyFunction#getName()
   * @see #getBodyFunction()
   * @generated
   */
  EReference getBodyFunction_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.cfeditor.BodyFunction#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipse.xtext.cfeditor.BodyFunction#getValues()
   * @see #getBodyFunction()
   * @generated
   */
  EAttribute getBodyFunction_Values();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.cfeditor.BodyFunction#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function</em>'.
   * @see org.eclipse.xtext.cfeditor.BodyFunction#getFunction()
   * @see #getBodyFunction()
   * @generated
   */
  EReference getBodyFunction_Function();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.SpecialFunction <em>Special Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Special Function</em>'.
   * @see org.eclipse.xtext.cfeditor.SpecialFunction
   * @generated
   */
  EClass getSpecialFunction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.SpecialFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.SpecialFunction#getName()
   * @see #getSpecialFunction()
   * @generated
   */
  EAttribute getSpecialFunction_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.cfeditor.SpecialFunction#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see org.eclipse.xtext.cfeditor.SpecialFunction#getParameters()
   * @see #getSpecialFunction()
   * @generated
   */
  EAttribute getSpecialFunction_Parameters();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.BundlePromiseType <em>Bundle Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle Promise Type</em>'.
   * @see org.eclipse.xtext.cfeditor.BundlePromiseType
   * @generated
   */
  EClass getBundlePromiseType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.BundlePromiseType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.BundlePromiseType#getName()
   * @see #getBundlePromiseType()
   * @generated
   */
  EAttribute getBundlePromiseType_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.BodyPromiseType <em>Body Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Promise Type</em>'.
   * @see org.eclipse.xtext.cfeditor.BodyPromiseType
   * @generated
   */
  EClass getBodyPromiseType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.BodyPromiseType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.BodyPromiseType#getName()
   * @see #getBodyPromiseType()
   * @generated
   */
  EAttribute getBodyPromiseType_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.BundleComponent <em>Bundle Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle Component</em>'.
   * @see org.eclipse.xtext.cfeditor.BundleComponent
   * @generated
   */
  EClass getBundleComponent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.BundleComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.BundleComponent#getName()
   * @see #getBundleComponent()
   * @generated
   */
  EAttribute getBundleComponent_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.BodyComponent <em>Body Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Component</em>'.
   * @see org.eclipse.xtext.cfeditor.BodyComponent
   * @generated
   */
  EClass getBodyComponent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.BodyComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.BodyComponent#getName()
   * @see #getBodyComponent()
   * @generated
   */
  EAttribute getBodyComponent_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CfeditorFactory getCfeditorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.CfModelImpl <em>Cf Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.CfModelImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getCfModel()
     * @generated
     */
    EClass CF_MODEL = eINSTANCE.getCfModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CF_MODEL__ELEMENTS = eINSTANCE.getCfModel_Elements();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.AbstractElementImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.PartImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getPart()
     * @generated
     */
    EClass PART = eINSTANCE.getPart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__NAME = eINSTANCE.getPart_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.BundleImpl <em>Bundle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.BundleImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBundle()
     * @generated
     */
    EClass BUNDLE = eINSTANCE.getBundle();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__COMPONENT = eINSTANCE.getBundle_Component();

    /**
     * The meta object literal for the '<em><b>Promise Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__PROMISE_TYPE = eINSTANCE.getBundle_PromiseType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.BodyImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__COMPONENT = eINSTANCE.getBody_Component();

    /**
     * The meta object literal for the '<em><b>Promise Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__PROMISE_TYPE = eINSTANCE.getBody_PromiseType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.BodyFunctionImpl <em>Body Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.BodyFunctionImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBodyFunction()
     * @generated
     */
    EClass BODY_FUNCTION = eINSTANCE.getBodyFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_FUNCTION__NAME = eINSTANCE.getBodyFunction_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY_FUNCTION__VALUES = eINSTANCE.getBodyFunction_Values();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_FUNCTION__FUNCTION = eINSTANCE.getBodyFunction_Function();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.SpecialFunctionImpl <em>Special Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.SpecialFunctionImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getSpecialFunction()
     * @generated
     */
    EClass SPECIAL_FUNCTION = eINSTANCE.getSpecialFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIAL_FUNCTION__NAME = eINSTANCE.getSpecialFunction_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIAL_FUNCTION__PARAMETERS = eINSTANCE.getSpecialFunction_Parameters();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.BundlePromiseTypeImpl <em>Bundle Promise Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.BundlePromiseTypeImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBundlePromiseType()
     * @generated
     */
    EClass BUNDLE_PROMISE_TYPE = eINSTANCE.getBundlePromiseType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE_PROMISE_TYPE__NAME = eINSTANCE.getBundlePromiseType_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.BodyPromiseTypeImpl <em>Body Promise Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.BodyPromiseTypeImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBodyPromiseType()
     * @generated
     */
    EClass BODY_PROMISE_TYPE = eINSTANCE.getBodyPromiseType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY_PROMISE_TYPE__NAME = eINSTANCE.getBodyPromiseType_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.BundleComponentImpl <em>Bundle Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.BundleComponentImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBundleComponent()
     * @generated
     */
    EClass BUNDLE_COMPONENT = eINSTANCE.getBundleComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE_COMPONENT__NAME = eINSTANCE.getBundleComponent_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.BodyComponentImpl <em>Body Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.BodyComponentImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getBodyComponent()
     * @generated
     */
    EClass BODY_COMPONENT = eINSTANCE.getBodyComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY_COMPONENT__NAME = eINSTANCE.getBodyComponent_Name();

  }

} //CfeditorPackage
