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
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__COMPONENT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__COMPONENT = PART__COMPONENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__NAME = PART_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Promise Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PROMISE_TYPE = PART_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__METHODS = PART_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_FEATURE_COUNT = PART_FEATURE_COUNT + 3;

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
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__COMPONENT = PART__COMPONENT;

  /**
   * The feature id for the '<em><b>Promise Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__PROMISE_TYPE = PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = PART_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.MethodeImpl <em>Methode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.MethodeImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getMethode()
   * @generated
   */
  int METHODE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Zuweisung</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__ZUWEISUNG = 1;

  /**
   * The number of structural features of the '<em>Methode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.ZuweisungImpl <em>Zuweisung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.ZuweisungImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getZuweisung()
   * @generated
   */
  int ZUWEISUNG = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUWEISUNG__NAME = 0;

  /**
   * The number of structural features of the '<em>Zuweisung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUWEISUNG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.PromiseTypeImpl <em>Promise Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.PromiseTypeImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getPromiseType()
   * @generated
   */
  int PROMISE_TYPE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMISE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Promise Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMISE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.cfeditor.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.cfeditor.impl.ComponentImpl
   * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 1;


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
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.cfeditor.Part#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see org.eclipse.xtext.cfeditor.Part#getComponent()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Component();

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
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.Bundle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.Bundle#getName()
   * @see #getBundle()
   * @generated
   */
  EAttribute getBundle_Name();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.cfeditor.Bundle#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.eclipse.xtext.cfeditor.Bundle#getMethods()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_Methods();

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
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.Body#getPromiseType <em>Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Promise Type</em>'.
   * @see org.eclipse.xtext.cfeditor.Body#getPromiseType()
   * @see #getBody()
   * @generated
   */
  EAttribute getBody_PromiseType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.Methode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Methode</em>'.
   * @see org.eclipse.xtext.cfeditor.Methode
   * @generated
   */
  EClass getMethode();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.Methode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.Methode#getName()
   * @see #getMethode()
   * @generated
   */
  EAttribute getMethode_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.cfeditor.Methode#getZuweisung <em>Zuweisung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Zuweisung</em>'.
   * @see org.eclipse.xtext.cfeditor.Methode#getZuweisung()
   * @see #getMethode()
   * @generated
   */
  EReference getMethode_Zuweisung();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.Zuweisung <em>Zuweisung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Zuweisung</em>'.
   * @see org.eclipse.xtext.cfeditor.Zuweisung
   * @generated
   */
  EClass getZuweisung();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.Zuweisung#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.Zuweisung#getName()
   * @see #getZuweisung()
   * @generated
   */
  EAttribute getZuweisung_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.PromiseType <em>Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Promise Type</em>'.
   * @see org.eclipse.xtext.cfeditor.PromiseType
   * @generated
   */
  EClass getPromiseType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.PromiseType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.PromiseType#getName()
   * @see #getPromiseType()
   * @generated
   */
  EAttribute getPromiseType_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.cfeditor.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.eclipse.xtext.cfeditor.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.cfeditor.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.cfeditor.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

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
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__COMPONENT = eINSTANCE.getPart_Component();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE__NAME = eINSTANCE.getBundle_Name();

    /**
     * The meta object literal for the '<em><b>Promise Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__PROMISE_TYPE = eINSTANCE.getBundle_PromiseType();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__METHODS = eINSTANCE.getBundle_Methods();

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
     * The meta object literal for the '<em><b>Promise Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY__PROMISE_TYPE = eINSTANCE.getBody_PromiseType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.MethodeImpl <em>Methode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.MethodeImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getMethode()
     * @generated
     */
    EClass METHODE = eINSTANCE.getMethode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHODE__NAME = eINSTANCE.getMethode_Name();

    /**
     * The meta object literal for the '<em><b>Zuweisung</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHODE__ZUWEISUNG = eINSTANCE.getMethode_Zuweisung();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.ZuweisungImpl <em>Zuweisung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.ZuweisungImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getZuweisung()
     * @generated
     */
    EClass ZUWEISUNG = eINSTANCE.getZuweisung();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ZUWEISUNG__NAME = eINSTANCE.getZuweisung_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.PromiseTypeImpl <em>Promise Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.PromiseTypeImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getPromiseType()
     * @generated
     */
    EClass PROMISE_TYPE = eINSTANCE.getPromiseType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROMISE_TYPE__NAME = eINSTANCE.getPromiseType_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.cfeditor.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.cfeditor.impl.ComponentImpl
     * @see org.eclipse.xtext.cfeditor.impl.CfeditorPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

  }

} //CfeditorPackage
