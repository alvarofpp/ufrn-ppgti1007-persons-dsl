/**
 * generated by Xtext 2.25.0
 */
package org.ppgti.dslperson.dslPerson;

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
 * @see org.ppgti.dslperson.dslPerson.DslPersonFactory
 * @model kind="package"
 * @generated
 */
public interface DslPersonPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dslPerson";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ppgti.org/dslperson/DslPerson";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dslPerson";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslPersonPackage eINSTANCE = org.ppgti.dslperson.dslPerson.impl.DslPersonPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ppgti.dslperson.dslPerson.impl.PersonsImpl <em>Persons</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ppgti.dslperson.dslPerson.impl.PersonsImpl
   * @see org.ppgti.dslperson.dslPerson.impl.DslPersonPackageImpl#getPersons()
   * @generated
   */
  int PERSONS = 0;

  /**
   * The feature id for the '<em><b>Persons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONS__PERSONS = 0;

  /**
   * The number of structural features of the '<em>Persons</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ppgti.dslperson.dslPerson.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ppgti.dslperson.dslPerson.impl.PersonImpl
   * @see org.ppgti.dslperson.dslPerson.impl.DslPersonPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 1;

  /**
   * The feature id for the '<em><b>Cpf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__CPF = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ppgti.dslperson.dslPerson.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ppgti.dslperson.dslPerson.impl.AttributeImpl
   * @see org.ppgti.dslperson.dslPerson.impl.DslPersonPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.ppgti.dslperson.dslPerson.Persons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Persons</em>'.
   * @see org.ppgti.dslperson.dslPerson.Persons
   * @generated
   */
  EClass getPersons();

  /**
   * Returns the meta object for the containment reference list '{@link org.ppgti.dslperson.dslPerson.Persons#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see org.ppgti.dslperson.dslPerson.Persons#getPersons()
   * @see #getPersons()
   * @generated
   */
  EReference getPersons_Persons();

  /**
   * Returns the meta object for class '{@link org.ppgti.dslperson.dslPerson.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see org.ppgti.dslperson.dslPerson.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link org.ppgti.dslperson.dslPerson.Person#getCpf <em>Cpf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cpf</em>'.
   * @see org.ppgti.dslperson.dslPerson.Person#getCpf()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Cpf();

  /**
   * Returns the meta object for the containment reference list '{@link org.ppgti.dslperson.dslPerson.Person#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.ppgti.dslperson.dslPerson.Person#getAttributes()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Attributes();

  /**
   * Returns the meta object for class '{@link org.ppgti.dslperson.dslPerson.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.ppgti.dslperson.dslPerson.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.ppgti.dslperson.dslPerson.Attribute#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.ppgti.dslperson.dslPerson.Attribute#getKey()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Key();

  /**
   * Returns the meta object for the attribute '{@link org.ppgti.dslperson.dslPerson.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ppgti.dslperson.dslPerson.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DslPersonFactory getDslPersonFactory();

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
     * The meta object literal for the '{@link org.ppgti.dslperson.dslPerson.impl.PersonsImpl <em>Persons</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ppgti.dslperson.dslPerson.impl.PersonsImpl
     * @see org.ppgti.dslperson.dslPerson.impl.DslPersonPackageImpl#getPersons()
     * @generated
     */
    EClass PERSONS = eINSTANCE.getPersons();

    /**
     * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSONS__PERSONS = eINSTANCE.getPersons_Persons();

    /**
     * The meta object literal for the '{@link org.ppgti.dslperson.dslPerson.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ppgti.dslperson.dslPerson.impl.PersonImpl
     * @see org.ppgti.dslperson.dslPerson.impl.DslPersonPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__CPF = eINSTANCE.getPerson_Cpf();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__ATTRIBUTES = eINSTANCE.getPerson_Attributes();

    /**
     * The meta object literal for the '{@link org.ppgti.dslperson.dslPerson.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ppgti.dslperson.dslPerson.impl.AttributeImpl
     * @see org.ppgti.dslperson.dslPerson.impl.DslPersonPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__KEY = eINSTANCE.getAttribute_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

  }

} //DslPersonPackage
