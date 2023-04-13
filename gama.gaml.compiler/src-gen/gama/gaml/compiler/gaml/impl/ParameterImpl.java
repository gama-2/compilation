/**
 * generated by Xtext
 */
package gama.gaml.compiler.gaml.impl;

import gama.gaml.compiler.gaml.Expression;
import gama.gaml.compiler.gaml.GamlPackage;
import gama.gaml.compiler.gaml.Parameter;
import gama.gaml.compiler.gaml.VariableRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gama.gaml.compiler.gaml.impl.ParameterImpl#getBuiltInFacetKey <em>Built In Facet Key</em>}</li>
 *   <li>{@link gama.gaml.compiler.gaml.impl.ParameterImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link gama.gaml.compiler.gaml.impl.ParameterImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends ExpressionImpl implements Parameter
{
  /**
   * The default value of the '{@link #getBuiltInFacetKey() <em>Built In Facet Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltInFacetKey()
   * @generated
   * @ordered
   */
  protected static final String BUILT_IN_FACET_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuiltInFacetKey() <em>Built In Facet Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltInFacetKey()
   * @generated
   * @ordered
   */
  protected String builtInFacetKey = BUILT_IN_FACET_KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected VariableRef left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return GamlPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBuiltInFacetKey()
  {
    return builtInFacetKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBuiltInFacetKey(String newBuiltInFacetKey)
  {
    String oldBuiltInFacetKey = builtInFacetKey;
    builtInFacetKey = newBuiltInFacetKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamlPackage.PARAMETER__BUILT_IN_FACET_KEY, oldBuiltInFacetKey, builtInFacetKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableRef getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(VariableRef newLeft, NotificationChain msgs)
  {
    VariableRef oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamlPackage.PARAMETER__LEFT, oldLeft, newLeft);
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
  public void setLeft(VariableRef newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamlPackage.PARAMETER__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamlPackage.PARAMETER__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamlPackage.PARAMETER__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamlPackage.PARAMETER__RIGHT, oldRight, newRight);
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
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamlPackage.PARAMETER__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamlPackage.PARAMETER__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamlPackage.PARAMETER__RIGHT, newRight, newRight));
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
      case GamlPackage.PARAMETER__LEFT:
        return basicSetLeft(null, msgs);
      case GamlPackage.PARAMETER__RIGHT:
        return basicSetRight(null, msgs);
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
      case GamlPackage.PARAMETER__BUILT_IN_FACET_KEY:
        return getBuiltInFacetKey();
      case GamlPackage.PARAMETER__LEFT:
        return getLeft();
      case GamlPackage.PARAMETER__RIGHT:
        return getRight();
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
      case GamlPackage.PARAMETER__BUILT_IN_FACET_KEY:
        setBuiltInFacetKey((String)newValue);
        return;
      case GamlPackage.PARAMETER__LEFT:
        setLeft((VariableRef)newValue);
        return;
      case GamlPackage.PARAMETER__RIGHT:
        setRight((Expression)newValue);
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
      case GamlPackage.PARAMETER__BUILT_IN_FACET_KEY:
        setBuiltInFacetKey(BUILT_IN_FACET_KEY_EDEFAULT);
        return;
      case GamlPackage.PARAMETER__LEFT:
        setLeft((VariableRef)null);
        return;
      case GamlPackage.PARAMETER__RIGHT:
        setRight((Expression)null);
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
      case GamlPackage.PARAMETER__BUILT_IN_FACET_KEY:
        return BUILT_IN_FACET_KEY_EDEFAULT == null ? builtInFacetKey != null : !BUILT_IN_FACET_KEY_EDEFAULT.equals(builtInFacetKey);
      case GamlPackage.PARAMETER__LEFT:
        return left != null;
      case GamlPackage.PARAMETER__RIGHT:
        return right != null;
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
    result.append(" (builtInFacetKey: ");
    result.append(builtInFacetKey);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
