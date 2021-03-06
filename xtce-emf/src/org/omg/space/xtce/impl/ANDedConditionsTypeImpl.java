/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.ANDedConditionsType;
import org.omg.space.xtce.ComparisonCheckType;
import org.omg.space.xtce.ORedConditionsType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AN Ded Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ANDedConditionsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ANDedConditionsTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ANDedConditionsTypeImpl#getORedConditions <em>ORed Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ANDedConditionsTypeImpl extends EObjectImpl implements ANDedConditionsType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANDedConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getANDedConditionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.AN_DED_CONDITIONS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComparisonCheckType> getCondition() {
		return getGroup().list(XtcePackage.eINSTANCE.getANDedConditionsType_Condition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORedConditionsType> getORedConditions() {
		return getGroup().list(XtcePackage.eINSTANCE.getANDedConditionsType_ORedConditions());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.AN_DED_CONDITIONS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.AN_DED_CONDITIONS_TYPE__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case XtcePackage.AN_DED_CONDITIONS_TYPE__ORED_CONDITIONS:
				return ((InternalEList<?>)getORedConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.AN_DED_CONDITIONS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.AN_DED_CONDITIONS_TYPE__CONDITION:
				return getCondition();
			case XtcePackage.AN_DED_CONDITIONS_TYPE__ORED_CONDITIONS:
				return getORedConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.AN_DED_CONDITIONS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.AN_DED_CONDITIONS_TYPE__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends ComparisonCheckType>)newValue);
				return;
			case XtcePackage.AN_DED_CONDITIONS_TYPE__ORED_CONDITIONS:
				getORedConditions().clear();
				getORedConditions().addAll((Collection<? extends ORedConditionsType>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case XtcePackage.AN_DED_CONDITIONS_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.AN_DED_CONDITIONS_TYPE__CONDITION:
				getCondition().clear();
				return;
			case XtcePackage.AN_DED_CONDITIONS_TYPE__ORED_CONDITIONS:
				getORedConditions().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XtcePackage.AN_DED_CONDITIONS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.AN_DED_CONDITIONS_TYPE__CONDITION:
				return !getCondition().isEmpty();
			case XtcePackage.AN_DED_CONDITIONS_TYPE__ORED_CONDITIONS:
				return !getORedConditions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ANDedConditionsTypeImpl
