/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.tests;

import junit.textui.TestRunner;

import org.omg.space.xtce.FloatDataEncodingType;
import org.omg.space.xtce.XtceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Float Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FloatDataEncodingTypeTest extends DataEncodingTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FloatDataEncodingTypeTest.class);
	}

	/**
	 * Constructs a new Float Data Encoding Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatDataEncodingTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Float Data Encoding Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FloatDataEncodingType getFixture() {
		return (FloatDataEncodingType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XtceFactory.eINSTANCE.createFloatDataEncodingType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FloatDataEncodingTypeTest
