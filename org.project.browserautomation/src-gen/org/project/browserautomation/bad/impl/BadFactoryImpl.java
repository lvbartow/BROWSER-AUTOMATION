/**
 * generated by Xtext 2.36.0
 */
package org.project.browserautomation.bad.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.project.browserautomation.bad.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BadFactoryImpl extends EFactoryImpl implements BadFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BadFactory init()
  {
    try
    {
      BadFactory theBadFactory = (BadFactory)EPackage.Registry.INSTANCE.getEFactory(BadPackage.eNS_URI);
      if (theBadFactory != null)
      {
        return theBadFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BadFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BadFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BadPackage.PROGRAM: return createProgram();
      case BadPackage.INSTRUCTION: return createInstruction();
      case BadPackage.NAVIGATE_TO_URL: return createNavigateToUrl();
      case BadPackage.CHECK_EXISTS: return createCheckExists();
      case BadPackage.CLICK_ON: return createClickOn();
      case BadPackage.CHECKBOX_ACTION: return createCheckboxAction();
      case BadPackage.FILL_FIELD: return createFillField();
      case BadPackage.STORE_ELEMENT: return createStoreElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BadPackage.CLICK_TYPE:
        return createClickTypeFromString(eDataType, initialValue);
      case BadPackage.ELEM_TYPE:
        return createElemTypeFromString(eDataType, initialValue);
      case BadPackage.BOOL_STRING:
        return createBoolStringFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BadPackage.CLICK_TYPE:
        return convertClickTypeToString(eDataType, instanceValue);
      case BadPackage.ELEM_TYPE:
        return convertElemTypeToString(eDataType, instanceValue);
      case BadPackage.BOOL_STRING:
        return convertBoolStringToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NavigateToUrl createNavigateToUrl()
  {
    NavigateToUrlImpl navigateToUrl = new NavigateToUrlImpl();
    return navigateToUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CheckExists createCheckExists()
  {
    CheckExistsImpl checkExists = new CheckExistsImpl();
    return checkExists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClickOn createClickOn()
  {
    ClickOnImpl clickOn = new ClickOnImpl();
    return clickOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CheckboxAction createCheckboxAction()
  {
    CheckboxActionImpl checkboxAction = new CheckboxActionImpl();
    return checkboxAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FillField createFillField()
  {
    FillFieldImpl fillField = new FillFieldImpl();
    return fillField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StoreElement createStoreElement()
  {
    StoreElementImpl storeElement = new StoreElementImpl();
    return storeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickType createClickTypeFromString(EDataType eDataType, String initialValue)
  {
    ClickType result = ClickType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertClickTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElemType createElemTypeFromString(EDataType eDataType, String initialValue)
  {
    ElemType result = ElemType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertElemTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolString createBoolStringFromString(EDataType eDataType, String initialValue)
  {
    BoolString result = BoolString.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBoolStringToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BadPackage getBadPackage()
  {
    return (BadPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BadPackage getPackage()
  {
    return BadPackage.eINSTANCE;
  }

} //BadFactoryImpl
