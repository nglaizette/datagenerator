/**
 */
package com.opcoach.generator.basic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.opcoach.generator.basic.IDGenerator;
import com.opcoach.generator.basic.MBasicPackage;
import com.opcoach.generator.impl.ValueGeneratorImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ID Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.generator.basic.impl.MIDGeneratorImpl#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link com.opcoach.generator.basic.impl.MIDGeneratorImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
 public class MIDGeneratorImpl extends ValueGeneratorImpl<String> implements IDGenerator
{
	/**
	 * The default value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLength()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_LENGTH_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLength()
	 * @generated
	 * @ordered
	 */
	protected int keyLength = KEY_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MIDGeneratorImpl()
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
		return MBasicPackage.Literals.ID_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLastGeneratedValue(String newLastGeneratedValue)
	{
		super.setLastGeneratedValue(newLastGeneratedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getKeyLength()
	{
		return keyLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyLength(int newKeyLength)
	{
		int oldKeyLength = keyLength;
		keyLength = newKeyLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MBasicPackage.ID_GENERATOR__KEY_LENGTH, oldKeyLength, keyLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix()
	{
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix)
	{
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MBasicPackage.ID_GENERATOR__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case MBasicPackage.ID_GENERATOR__KEY_LENGTH:
				return getKeyLength();
			case MBasicPackage.ID_GENERATOR__PREFIX:
				return getPrefix();
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
		switch (featureID) {
			case MBasicPackage.ID_GENERATOR__KEY_LENGTH:
				setKeyLength((Integer)newValue);
				return;
			case MBasicPackage.ID_GENERATOR__PREFIX:
				setPrefix((String)newValue);
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
		switch (featureID) {
			case MBasicPackage.ID_GENERATOR__KEY_LENGTH:
				setKeyLength(KEY_LENGTH_EDEFAULT);
				return;
			case MBasicPackage.ID_GENERATOR__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
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
		switch (featureID) {
			case MBasicPackage.ID_GENERATOR__KEY_LENGTH:
				return keyLength != KEY_LENGTH_EDEFAULT;
			case MBasicPackage.ID_GENERATOR__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
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
		result.append(" (keyLength: ");
		result.append(keyLength);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //MIDGeneratorImpl
