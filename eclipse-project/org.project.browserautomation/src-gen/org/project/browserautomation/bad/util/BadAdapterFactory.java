/**
 * generated by Xtext 2.36.0
 */
package org.project.browserautomation.bad.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.project.browserautomation.bad.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.project.browserautomation.bad.BadPackage
 * @generated
 */
public class BadAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BadPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BadAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BadPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BadSwitch<Adapter> modelSwitch =
    new BadSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseNavigateToUrl(NavigateToUrl object)
      {
        return createNavigateToUrlAdapter();
      }
      @Override
      public Adapter caseCheckExists(CheckExists object)
      {
        return createCheckExistsAdapter();
      }
      @Override
      public Adapter caseClickOn(ClickOn object)
      {
        return createClickOnAdapter();
      }
      @Override
      public Adapter caseCheckboxAction(CheckboxAction object)
      {
        return createCheckboxActionAdapter();
      }
      @Override
      public Adapter caseFillField(FillField object)
      {
        return createFillFieldAdapter();
      }
      @Override
      public Adapter caseStoreElement(StoreElement object)
      {
        return createStoreElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.project.browserautomation.bad.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.browserautomation.bad.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.browserautomation.bad.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.browserautomation.bad.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.browserautomation.bad.NavigateToUrl <em>Navigate To Url</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.browserautomation.bad.NavigateToUrl
   * @generated
   */
  public Adapter createNavigateToUrlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.browserautomation.bad.CheckExists <em>Check Exists</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.browserautomation.bad.CheckExists
   * @generated
   */
  public Adapter createCheckExistsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.browserautomation.bad.ClickOn <em>Click On</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.browserautomation.bad.ClickOn
   * @generated
   */
  public Adapter createClickOnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.browserautomation.bad.CheckboxAction <em>Checkbox Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.browserautomation.bad.CheckboxAction
   * @generated
   */
  public Adapter createCheckboxActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.browserautomation.bad.FillField <em>Fill Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.browserautomation.bad.FillField
   * @generated
   */
  public Adapter createFillFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.browserautomation.bad.StoreElement <em>Store Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.browserautomation.bad.StoreElement
   * @generated
   */
  public Adapter createStoreElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BadAdapterFactory
