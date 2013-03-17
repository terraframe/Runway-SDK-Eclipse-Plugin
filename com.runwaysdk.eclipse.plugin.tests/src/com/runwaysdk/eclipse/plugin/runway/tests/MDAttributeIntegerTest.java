/**
 */
package com.runwaysdk.eclipse.plugin.runway.tests;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MD Attribute Integer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDAttributeIntegerTest extends MDAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MDAttributeIntegerTest.class);
	}

	/**
	 * Constructs a new MD Attribute Integer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDAttributeIntegerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MD Attribute Integer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MDAttributeInteger getFixture() {
		return (MDAttributeInteger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RunwayFactory.eINSTANCE.createMDAttributeInteger());
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

} //MDAttributeIntegerTest
