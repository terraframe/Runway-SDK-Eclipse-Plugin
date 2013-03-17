/**
 */
package com.runwaysdk.eclipse.plugin.runway.tests;

import com.runwaysdk.eclipse.plugin.runway.MDClass;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MD Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDClassTest extends MDTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MDClassTest.class);
	}

	/**
	 * Constructs a new MD Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MD Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MDClass getFixture() {
		return (MDClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RunwayFactory.eINSTANCE.createMDClass());
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

} //MDClassTest
