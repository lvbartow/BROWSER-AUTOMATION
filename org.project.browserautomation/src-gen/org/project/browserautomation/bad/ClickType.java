/**
 * generated by Xtext 2.36.0
 */
package org.project.browserautomation.bad;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Click Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.project.browserautomation.bad.BadPackage#getClickType()
 * @model
 * @generated
 */
public enum ClickType implements Enumerator
{
  /**
   * The '<em><b>BUTTON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUTTON_VALUE
   * @generated
   * @ordered
   */
  BUTTON(0, "BUTTON", "BUTTON"),

  /**
   * The '<em><b>LINK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINK_VALUE
   * @generated
   * @ordered
   */
  LINK(1, "LINK", "LINK"),

  /**
   * The '<em><b>IMAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMAGE_VALUE
   * @generated
   * @ordered
   */
  IMAGE(2, "IMAGE", "IMAGE"),

  /**
   * The '<em><b>COMBO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMBO_VALUE
   * @generated
   * @ordered
   */
  COMBO(3, "COMBO", "COMBO");

  /**
   * The '<em><b>BUTTON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUTTON
   * @model
   * @generated
   * @ordered
   */
  public static final int BUTTON_VALUE = 0;

  /**
   * The '<em><b>LINK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINK
   * @model
   * @generated
   * @ordered
   */
  public static final int LINK_VALUE = 1;

  /**
   * The '<em><b>IMAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMAGE
   * @model
   * @generated
   * @ordered
   */
  public static final int IMAGE_VALUE = 2;

  /**
   * The '<em><b>COMBO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMBO
   * @model
   * @generated
   * @ordered
   */
  public static final int COMBO_VALUE = 3;

  /**
   * An array of all the '<em><b>Click Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ClickType[] VALUES_ARRAY =
    new ClickType[]
    {
      BUTTON,
      LINK,
      IMAGE,
      COMBO,
    };

  /**
   * A public read-only list of all the '<em><b>Click Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ClickType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Click Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ClickType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ClickType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Click Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ClickType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ClickType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Click Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ClickType get(int value)
  {
    switch (value)
    {
      case BUTTON_VALUE: return BUTTON;
      case LINK_VALUE: return LINK;
      case IMAGE_VALUE: return IMAGE;
      case COMBO_VALUE: return COMBO;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ClickType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ClickType
