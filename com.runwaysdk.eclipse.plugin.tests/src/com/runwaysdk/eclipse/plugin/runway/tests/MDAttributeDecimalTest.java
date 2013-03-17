/**
 */
package com.runwaysdk.eclipse.plugin.runway.tests;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MD Attribute Decimal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDAttributeDecimalTest extends MDAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MDAttributeDecimalTest.class);
	}

	/**
	 * Constructs a new MD Attribute Decimal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDAttributeDecimalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MD Attribute Decimal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MDAttributeDecimal getFixture() {
		return (MDAttributeDecimal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RunwayFactory.eINSTANCE.createMDAttributeDecimal());
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

} //MDAttributeDecimalTest
