/**
 */
package com.runwaysdk.eclipse.plugin.runway.tests;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MD Attribute Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDAttributeEnumerationTest extends MDAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MDAttributeEnumerationTest.class);
	}

	/**
	 * Constructs a new MD Attribute Enumeration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDAttributeEnumerationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MD Attribute Enumeration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MDAttributeEnumeration getFixture() {
		return (MDAttributeEnumeration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RunwayFactory.eINSTANCE.createMDAttributeEnumeration());
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

} //MDAttributeEnumerationTest
