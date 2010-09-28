/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfeditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfeditor.Body#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfeditor.Body#getVariables <em>Variables</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfeditor.Body#getPromiseType <em>Promise Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.scc.cfeditor.cfeditor.CfeditorPackage#getBody()
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
   * @see edu.kit.scc.cfeditor.cfeditor.CfeditorPackage#getBody_Component()
   * @model containment="true"
   * @generated
   */
  BodyComponent getComponent();

  /**
   * Sets the value of the '{@link edu.kit.scc.cfeditor.cfeditor.Body#getComponent <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' containment reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(BodyComponent value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' attribute list.
   * @see edu.kit.scc.cfeditor.cfeditor.CfeditorPackage#getBody_Variables()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariables();

  /**
   * Returns the value of the '<em><b>Promise Type</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfeditor.BodyFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promise Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promise Type</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfeditor.CfeditorPackage#getBody_PromiseType()
   * @model containment="true"
   * @generated
   */
  EList<BodyFunction> getPromiseType();

} // Body
