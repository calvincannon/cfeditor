/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.cfeditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.Bundle#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.Bundle#getPromiseType <em>Promise Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.Bundle#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends Part
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
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBundle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.cfeditor.Bundle#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Promise Type</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.cfeditor.PromiseType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promise Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promise Type</em>' containment reference list.
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBundle_PromiseType()
   * @model containment="true"
   * @generated
   */
  EList<PromiseType> getPromiseType();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.cfeditor.Methode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBundle_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Methode> getMethods();

} // Bundle
