/**
 */
package com.runwaysdk.eclipse.plugin.runway.util;

import com.runwaysdk.eclipse.plugin.runway.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage
 * @generated
 */
public class RunwayAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RunwayPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunwayAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RunwayPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunwaySwitch<Adapter> modelSwitch =
		new RunwaySwitch<Adapter>() {
			@Override
			public Adapter caseMetaData(MetaData object) {
				return createMetaDataAdapter();
			}
			@Override
			public Adapter caseMDType(MDType object) {
				return createMDTypeAdapter();
			}
			@Override
			public Adapter caseMDClass(MDClass object) {
				return createMDClassAdapter();
			}
			@Override
			public Adapter caseMDEntity(MDEntity object) {
				return createMDEntityAdapter();
			}
			@Override
			public Adapter caseMDElement(MDElement object) {
				return createMDElementAdapter();
			}
			@Override
			public Adapter caseMDBusiness(MDBusiness object) {
				return createMDBusinessAdapter();
			}
			@Override
			public Adapter caseMDAttribute(MDAttribute object) {
				return createMDAttributeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseMDAttributeBlob(MDAttributeBlob object) {
				return createMDAttributeBlobAdapter();
			}
			@Override
			public Adapter caseMDAttributeBoolean(MDAttributeBoolean object) {
				return createMDAttributeBooleanAdapter();
			}
			@Override
			public Adapter caseMDAttributeCharacter(MDAttributeCharacter object) {
				return createMDAttributeCharacterAdapter();
			}
			@Override
			public Adapter caseMDAttributeDate(MDAttributeDate object) {
				return createMDAttributeDateAdapter();
			}
			@Override
			public Adapter caseMDAttributeDateTime(MDAttributeDateTime object) {
				return createMDAttributeDateTimeAdapter();
			}
			@Override
			public Adapter caseMDAttributeDecimal(MDAttributeDecimal object) {
				return createMDAttributeDecimalAdapter();
			}
			@Override
			public Adapter caseMDAttributeDouble(MDAttributeDouble object) {
				return createMDAttributeDoubleAdapter();
			}
			@Override
			public Adapter caseMDAttributeEnumeration(MDAttributeEnumeration object) {
				return createMDAttributeEnumerationAdapter();
			}
			@Override
			public Adapter caseMDAttributeFloat(MDAttributeFloat object) {
				return createMDAttributeFloatAdapter();
			}
			@Override
			public Adapter caseMDAttributeHash(MDAttributeHash object) {
				return createMDAttributeHashAdapter();
			}
			@Override
			public Adapter caseMDAttributeInteger(MDAttributeInteger object) {
				return createMDAttributeIntegerAdapter();
			}
			@Override
			public Adapter caseMDAttributeNumber(MDAttributeNumber object) {
				return createMDAttributeNumberAdapter();
			}
			@Override
			public Adapter caseMDAttributeStruct(MDAttributeStruct object) {
				return createMDAttributeStructAdapter();
			}
			@Override
			public Adapter caseMDAttributeText(MDAttributeText object) {
				return createMDAttributeTextAdapter();
			}
			@Override
			public Adapter caseMDAttributeTime(MDAttributeTime object) {
				return createMDAttributeTimeAdapter();
			}
			@Override
			public Adapter caseMDAttributeLocal(MDAttributeLocal object) {
				return createMDAttributeLocalAdapter();
			}
			@Override
			public Adapter caseMDAttributeLocalCharacter(MDAttributeLocalCharacter object) {
				return createMDAttributeLocalCharacterAdapter();
			}
			@Override
			public Adapter caseMDAttributeLocalText(MDAttributeLocalText object) {
				return createMDAttributeLocalTextAdapter();
			}
			@Override
			public Adapter caseMDAttributeLong(MDAttributeLong object) {
				return createMDAttributeLongAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MetaData
	 * @generated
	 */
	public Adapter createMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDType <em>MD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDType
	 * @generated
	 */
	public Adapter createMDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDClass <em>MD Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDClass
	 * @generated
	 */
	public Adapter createMDClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDEntity <em>MD Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDEntity
	 * @generated
	 */
	public Adapter createMDEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDElement <em>MD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDElement
	 * @generated
	 */
	public Adapter createMDElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness <em>MD Business</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness
	 * @generated
	 */
	public Adapter createMDBusinessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttribute <em>MD Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttribute
	 * @generated
	 */
	public Adapter createMDAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob <em>MD Attribute Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob
	 * @generated
	 */
	public Adapter createMDAttributeBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean <em>MD Attribute Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean
	 * @generated
	 */
	public Adapter createMDAttributeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter <em>MD Attribute Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter
	 * @generated
	 */
	public Adapter createMDAttributeCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDate <em>MD Attribute Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDate
	 * @generated
	 */
	public Adapter createMDAttributeDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime <em>MD Attribute Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime
	 * @generated
	 */
	public Adapter createMDAttributeDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal <em>MD Attribute Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal
	 * @generated
	 */
	public Adapter createMDAttributeDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble <em>MD Attribute Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble
	 * @generated
	 */
	public Adapter createMDAttributeDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration <em>MD Attribute Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration
	 * @generated
	 */
	public Adapter createMDAttributeEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat <em>MD Attribute Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat
	 * @generated
	 */
	public Adapter createMDAttributeFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeHash <em>MD Attribute Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeHash
	 * @generated
	 */
	public Adapter createMDAttributeHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger <em>MD Attribute Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger
	 * @generated
	 */
	public Adapter createMDAttributeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber <em>MD Attribute Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber
	 * @generated
	 */
	public Adapter createMDAttributeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeStruct <em>MD Attribute Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeStruct
	 * @generated
	 */
	public Adapter createMDAttributeStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeText <em>MD Attribute Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeText
	 * @generated
	 */
	public Adapter createMDAttributeTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeTime <em>MD Attribute Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeTime
	 * @generated
	 */
	public Adapter createMDAttributeTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocal <em>MD Attribute Local</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLocal
	 * @generated
	 */
	public Adapter createMDAttributeLocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter <em>MD Attribute Local Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter
	 * @generated
	 */
	public Adapter createMDAttributeLocalCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText <em>MD Attribute Local Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText
	 * @generated
	 */
	public Adapter createMDAttributeLocalTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLong <em>MD Attribute Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLong
	 * @generated
	 */
	public Adapter createMDAttributeLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RunwayAdapterFactory
