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
 * A representation of the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.Methode#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.Methode#getZuweisung <em>Zuweisung</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getMethode()
 * @model
 * @generated
 */
public interface Methode extends EObject
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
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getMethode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.cfeditor.Methode#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Zuweisung</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.cfeditor.Zuweisung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zuweisung</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zuweisung</em>' containment reference list.
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getMethode_Zuweisung()
   * @model containment="true"
   * @generated
   */
  EList<Zuweisung> getZuweisung();

} // Methode
