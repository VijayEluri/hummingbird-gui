/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Calibrator Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContextCalibratorType1#getUseWhenCondition <em>Use When Condition</em>}</li>
 *   <li>{@link org.omg.space.xtce.ContextCalibratorType1#getCalibrator <em>Calibrator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorType1()
 * @model extendedMetaData="name='ContextCalibrator_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ContextCalibratorType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Use When Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use When Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use When Condition</em>' containment reference.
	 * @see #setUseWhenCondition(BooleanExpressionType)
	 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorType1_UseWhenCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UseWhenCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanExpressionType getUseWhenCondition();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContextCalibratorType1#getUseWhenCondition <em>Use When Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use When Condition</em>' containment reference.
	 * @see #getUseWhenCondition()
	 * @generated
	 */
	void setUseWhenCondition(BooleanExpressionType value);

	/**
	 * Returns the value of the '<em><b>Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibrator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibrator</em>' containment reference.
	 * @see #setCalibrator(CalibratorType)
	 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorType1_Calibrator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Calibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	CalibratorType getCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContextCalibratorType1#getCalibrator <em>Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrator</em>' containment reference.
	 * @see #getCalibrator()
	 * @generated
	 */
	void setCalibrator(CalibratorType value);

} // ContextCalibratorType1
