/**
 */
package org.cfeditor.cfengine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cfeditor.cfengine.BodyClass#getName <em>Name</em>}</li>
 *   <li>{@link org.cfeditor.cfengine.BodyClass#getPromiseType <em>Promise Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cfeditor.cfengine.CfenginePackage#getBodyClass()
 * @model
 * @generated
 */
public interface BodyClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.cfeditor.cfengine.CfenginePackage#getBodyClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cfeditor.cfengine.BodyClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Promise Type</b></em>' containment reference list.
   * The list contents are of type {@link org.cfeditor.cfengine.BodyFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promise Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promise Type</em>' containment reference list.
   * @see org.cfeditor.cfengine.CfenginePackage#getBodyClass_PromiseType()
   * @model containment="true"
   * @generated
   */
  EList<BodyFunction> getPromiseType();

} // BodyClass
