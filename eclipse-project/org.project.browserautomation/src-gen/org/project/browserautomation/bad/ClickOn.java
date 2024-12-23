/**
 * generated by Xtext 2.36.0
 */
package org.project.browserautomation.bad;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Click On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.project.browserautomation.bad.ClickOn#getType <em>Type</em>}</li>
 *   <li>{@link org.project.browserautomation.bad.ClickOn#getId <em>Id</em>}</li>
 *   <li>{@link org.project.browserautomation.bad.ClickOn#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.project.browserautomation.bad.ClickOn#getPos_index <em>Pos index</em>}</li>
 *   <li>{@link org.project.browserautomation.bad.ClickOn#getId_combo <em>Id combo</em>}</li>
 *   <li>{@link org.project.browserautomation.bad.ClickOn#getTo_select <em>To select</em>}</li>
 * </ul>
 *
 * @see org.project.browserautomation.bad.BadPackage#getClickOn()
 * @model
 * @generated
 */
public interface ClickOn extends Instruction
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.project.browserautomation.bad.ClickType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.project.browserautomation.bad.ClickType
   * @see #setType(ClickType)
   * @see org.project.browserautomation.bad.BadPackage#getClickOn_Type()
   * @model
   * @generated
   */
  ClickType getType();

  /**
   * Sets the value of the '{@link org.project.browserautomation.bad.ClickOn#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.project.browserautomation.bad.ClickType
   * @see #getType()
   * @generated
   */
  void setType(ClickType value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.project.browserautomation.bad.BadPackage#getClickOn_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.project.browserautomation.bad.ClickOn#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Varname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varname</em>' attribute.
   * @see #setVarname(String)
   * @see org.project.browserautomation.bad.BadPackage#getClickOn_Varname()
   * @model
   * @generated
   */
  String getVarname();

  /**
   * Sets the value of the '{@link org.project.browserautomation.bad.ClickOn#getVarname <em>Varname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varname</em>' attribute.
   * @see #getVarname()
   * @generated
   */
  void setVarname(String value);

  /**
   * Returns the value of the '<em><b>Pos index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos index</em>' attribute.
   * @see #setPos_index(int)
   * @see org.project.browserautomation.bad.BadPackage#getClickOn_Pos_index()
   * @model
   * @generated
   */
  int getPos_index();

  /**
   * Sets the value of the '{@link org.project.browserautomation.bad.ClickOn#getPos_index <em>Pos index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos index</em>' attribute.
   * @see #getPos_index()
   * @generated
   */
  void setPos_index(int value);

  /**
   * Returns the value of the '<em><b>Id combo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id combo</em>' attribute.
   * @see #setId_combo(String)
   * @see org.project.browserautomation.bad.BadPackage#getClickOn_Id_combo()
   * @model
   * @generated
   */
  String getId_combo();

  /**
   * Sets the value of the '{@link org.project.browserautomation.bad.ClickOn#getId_combo <em>Id combo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id combo</em>' attribute.
   * @see #getId_combo()
   * @generated
   */
  void setId_combo(String value);

  /**
   * Returns the value of the '<em><b>To select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To select</em>' attribute.
   * @see #setTo_select(String)
   * @see org.project.browserautomation.bad.BadPackage#getClickOn_To_select()
   * @model
   * @generated
   */
  String getTo_select();

  /**
   * Sets the value of the '{@link org.project.browserautomation.bad.ClickOn#getTo_select <em>To select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To select</em>' attribute.
   * @see #getTo_select()
   * @generated
   */
  void setTo_select(String value);

} // ClickOn
