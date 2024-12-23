/**
 * generated by Xtext 2.36.0
 */
package org.project.browserautomation.bad.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.project.browserautomation.bad.BadPackage;
import org.project.browserautomation.bad.CheckExists;
import org.project.browserautomation.bad.ElemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Exists</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.project.browserautomation.bad.impl.CheckExistsImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.project.browserautomation.bad.impl.CheckExistsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.project.browserautomation.bad.impl.CheckExistsImpl#getVarname <em>Varname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckExistsImpl extends InstructionImpl implements CheckExists
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ElemType TYPE_EDEFAULT = ElemType.LINK;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ElemType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getVarname() <em>Varname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarname()
   * @generated
   * @ordered
   */
  protected static final String VARNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarname() <em>Varname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarname()
   * @generated
   * @ordered
   */
  protected String varname = VARNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckExistsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BadPackage.Literals.CHECK_EXISTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElemType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(ElemType newType)
  {
    ElemType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BadPackage.CHECK_EXISTS__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BadPackage.CHECK_EXISTS__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVarname()
  {
    return varname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarname(String newVarname)
  {
    String oldVarname = varname;
    varname = newVarname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BadPackage.CHECK_EXISTS__VARNAME, oldVarname, varname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BadPackage.CHECK_EXISTS__TYPE:
        return getType();
      case BadPackage.CHECK_EXISTS__ID:
        return getId();
      case BadPackage.CHECK_EXISTS__VARNAME:
        return getVarname();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BadPackage.CHECK_EXISTS__TYPE:
        setType((ElemType)newValue);
        return;
      case BadPackage.CHECK_EXISTS__ID:
        setId((String)newValue);
        return;
      case BadPackage.CHECK_EXISTS__VARNAME:
        setVarname((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BadPackage.CHECK_EXISTS__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case BadPackage.CHECK_EXISTS__ID:
        setId(ID_EDEFAULT);
        return;
      case BadPackage.CHECK_EXISTS__VARNAME:
        setVarname(VARNAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BadPackage.CHECK_EXISTS__TYPE:
        return type != TYPE_EDEFAULT;
      case BadPackage.CHECK_EXISTS__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case BadPackage.CHECK_EXISTS__VARNAME:
        return VARNAME_EDEFAULT == null ? varname != null : !VARNAME_EDEFAULT.equals(varname);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", id: ");
    result.append(id);
    result.append(", varname: ");
    result.append(varname);
    result.append(')');
    return result.toString();
  }

} //CheckExistsImpl
