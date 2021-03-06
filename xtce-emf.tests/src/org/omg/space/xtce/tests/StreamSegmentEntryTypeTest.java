/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.tests;

import junit.textui.TestRunner;

import org.omg.space.xtce.StreamSegmentEntryType;
import org.omg.space.xtce.XtceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stream Segment Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StreamSegmentEntryTypeTest extends SequenceEntryTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StreamSegmentEntryTypeTest.class);
	}

	/**
	 * Constructs a new Stream Segment Entry Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamSegmentEntryTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stream Segment Entry Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StreamSegmentEntryType getFixture() {
		return (StreamSegmentEntryType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XtceFactory.eINSTANCE.createStreamSegmentEntryType());
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

} //StreamSegmentEntryTypeTest
