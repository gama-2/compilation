/**
 * generated by Xtext
 */
package gama.gaml.compiler.gaml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import gama.gaml.compiler.gaml.ExpressionList;
import gama.gaml.compiler.gaml.GamlPackage;
import gama.gaml.compiler.gaml.Pragma;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pragma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gama.gaml.compiler.gaml.impl.PragmaImpl#getName <em>Name</em>}</li>
 *   <li>{@link gama.gaml.compiler.gaml.impl.PragmaImpl#getPlugins <em>Plugins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PragmaImpl extends MinimalEObjectImpl.Container implements Pragma
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlugins()
   * @generated
   * @ordered
   */
  protected ExpressionList plugins;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PragmaImpl()
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
    return GamlPackage.Literals.PRAGMA;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamlPackage.PRAGMA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionList getPlugins()
  {
    return plugins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlugins(ExpressionList newPlugins, NotificationChain msgs)
  {
    ExpressionList oldPlugins = plugins;
    plugins = newPlugins;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamlPackage.PRAGMA__PLUGINS, oldPlugins, newPlugins);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPlugins(ExpressionList newPlugins)
  {
    if (newPlugins != plugins)
    {
      NotificationChain msgs = null;
      if (plugins != null)
        msgs = ((InternalEObject)plugins).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamlPackage.PRAGMA__PLUGINS, null, msgs);
      if (newPlugins != null)
        msgs = ((InternalEObject)newPlugins).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamlPackage.PRAGMA__PLUGINS, null, msgs);
      msgs = basicSetPlugins(newPlugins, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamlPackage.PRAGMA__PLUGINS, newPlugins, newPlugins));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GamlPackage.PRAGMA__PLUGINS:
        return basicSetPlugins(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GamlPackage.PRAGMA__NAME:
        return getName();
      case GamlPackage.PRAGMA__PLUGINS:
        return getPlugins();
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
      case GamlPackage.PRAGMA__NAME:
        setName((String)newValue);
        return;
      case GamlPackage.PRAGMA__PLUGINS:
        setPlugins((ExpressionList)newValue);
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
      case GamlPackage.PRAGMA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GamlPackage.PRAGMA__PLUGINS:
        setPlugins((ExpressionList)null);
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
      case GamlPackage.PRAGMA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GamlPackage.PRAGMA__PLUGINS:
        return plugins != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PragmaImpl
