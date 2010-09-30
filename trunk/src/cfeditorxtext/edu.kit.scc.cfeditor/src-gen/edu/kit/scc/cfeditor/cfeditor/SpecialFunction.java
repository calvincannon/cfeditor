/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfeditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfeditor.SpecialFunction#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfeditor.SpecialFunction#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.scc.cfeditor.cfeditor.CfeditorPackage#getSpecialFunction()
 * @model
 * @generated
 */
public interface SpecialFunction extends EObject
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
   * @see edu.kit.scc.cfeditor.cfeditor.CfeditorPackage#getSpecialFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.kit.scc.cfeditor.cfeditor.SpecialFunction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfeditor.SpecialFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfeditor.CfeditorPackage#getSpecialFunction_Func()
   * @model containment="true"
   * @generated
   */
  EList<SpecialFunction> getFunc();

} // SpecialFunction
