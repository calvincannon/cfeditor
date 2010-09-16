/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.cfeditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.Body#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.Body#getPromiseType <em>Promise Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends Part
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference.
   * @see #setComponent(BodyComponent)
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBody_Component()
   * @model containment="true"
   * @generated
   */
  BodyComponent getComponent();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.cfeditor.Body#getComponent <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' containment reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(BodyComponent value);

  /**
   * Returns the value of the '<em><b>Promise Type</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.cfeditor.BodyFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promise Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promise Type</em>' containment reference list.
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBody_PromiseType()
   * @model containment="true"
   * @generated
   */
  EList<BodyFunction> getPromiseType();

} // Body
