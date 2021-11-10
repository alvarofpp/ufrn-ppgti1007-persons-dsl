/**
 * generated by Xtext 2.25.0
 */
package org.ppgti.dslperson.dslPerson;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ppgti.dslperson.dslPerson.Persons#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see org.ppgti.dslperson.dslPerson.DslPersonPackage#getPersons()
 * @model
 * @generated
 */
public interface Persons extends EObject
{
  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link org.ppgti.dslperson.dslPerson.Person}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see org.ppgti.dslperson.dslPerson.DslPersonPackage#getPersons_Persons()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPersons();

} // Persons