/**
 * generated by Xtext 2.25.0
 */
package org.ppgti.dslperson.dslPerson;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ppgti.dslperson.dslPerson.Person#getCpf <em>Cpf</em>}</li>
 *   <li>{@link org.ppgti.dslperson.dslPerson.Person#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.ppgti.dslperson.dslPerson.DslPersonPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Cpf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cpf</em>' attribute.
   * @see #setCpf(String)
   * @see org.ppgti.dslperson.dslPerson.DslPersonPackage#getPerson_Cpf()
   * @model
   * @generated
   */
  String getCpf();

  /**
   * Sets the value of the '{@link org.ppgti.dslperson.dslPerson.Person#getCpf <em>Cpf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cpf</em>' attribute.
   * @see #getCpf()
   * @generated
   */
  void setCpf(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.ppgti.dslperson.dslPerson.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.ppgti.dslperson.dslPerson.DslPersonPackage#getPerson_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Person
