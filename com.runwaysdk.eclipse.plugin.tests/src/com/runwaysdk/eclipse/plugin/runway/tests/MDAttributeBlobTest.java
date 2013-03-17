/**
 */
package com.runwaysdk.eclipse.plugin.runway.tests;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MD Attribute Blob</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDAttributeBlobTest extends MDAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MDAttributeBlobTest.class);
	}

	/**
	 * Constructs a new MD Attribute Blob test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDAttributeBlobTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MD Attribute Blob test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MDAttributeBlob getFixture() {
		return (MDAttributeBlob)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RunwayFactory.eINSTANCE.createMDAttributeBlob());
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

} //MDAttributeBlobTest
