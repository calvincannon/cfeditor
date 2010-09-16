/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.cfeditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.BodyFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.BodyFunction#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.BodyFunction#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBodyFunction()
 * @model
 * @generated
 */
public interface BodyFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(BodyPromiseType)
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBodyFunction_Name()
   * @model containment="true"
   * @generated
   */
  BodyPromiseType getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.cfeditor.BodyFunction#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(BodyPromiseType value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBodyFunction_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.cfeditor.SpecialFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference list.
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBodyFunction_Function()
   * @model containment="true"
   * @generated
   */
  EList<SpecialFunction> getFunction();

} // BodyFunction
