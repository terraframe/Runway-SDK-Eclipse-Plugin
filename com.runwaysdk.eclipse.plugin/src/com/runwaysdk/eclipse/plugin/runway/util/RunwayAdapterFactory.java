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
public class RunwayAdapterFactory extends AdapterFactoryImpl
{
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
  public RunwayAdapterFactory()
  {
    if (modelPackage == null)
    {
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
    new RunwaySwitch<Adapter>()
    {
      @Override
      public Adapter caseMDBusiness(MDBusiness object)
      {
        return createMDBusinessAdapter();
      }
      @Override
      public Adapter caseMDAttribute(MDAttribute object)
      {
        return createMDAttributeAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseMdAttributeBlob(MdAttributeBlob object)
      {
        return createMdAttributeBlobAdapter();
      }
      @Override
      public Adapter caseMdAttributeBoolean(MdAttributeBoolean object)
      {
        return createMdAttributeBooleanAdapter();
      }
      @Override
      public Adapter caseMdAttributeCharacter(MdAttributeCharacter object)
      {
        return createMdAttributeCharacterAdapter();
      }
      @Override
      public Adapter caseMdAttributeDate(MdAttributeDate object)
      {
        return createMdAttributeDateAdapter();
      }
      @Override
      public Adapter caseMdAttributeDateTime(MdAttributeDateTime object)
      {
        return createMdAttributeDateTimeAdapter();
      }
      @Override
      public Adapter caseMdAttributeDecimal(MdAttributeDecimal object)
      {
        return createMdAttributeDecimalAdapter();
      }
      @Override
      public Adapter caseMdAttributeDouble(MdAttributeDouble object)
      {
        return createMdAttributeDoubleAdapter();
      }
      @Override
      public Adapter caseMdAttributeEnumeration(MdAttributeEnumeration object)
      {
        return createMdAttributeEnumerationAdapter();
      }
      @Override
      public Adapter caseMdAttributeFloat(MdAttributeFloat object)
      {
        return createMdAttributeFloatAdapter();
      }
      @Override
      public Adapter caseMdAttributeHash(MdAttributeHash object)
      {
        return createMdAttributeHashAdapter();
      }
      @Override
      public Adapter caseMdAttributeInteger(MdAttributeInteger object)
      {
        return createMdAttributeIntegerAdapter();
      }
      @Override
      public Adapter caseMdAttributeNumber(MdAttributeNumber object)
      {
        return createMdAttributeNumberAdapter();
      }
      @Override
      public Adapter caseMdAttributeStruct(MdAttributeStruct object)
      {
        return createMdAttributeStructAdapter();
      }
      @Override
      public Adapter caseMdAttributeText(MdAttributeText object)
      {
        return createMdAttributeTextAdapter();
      }
      @Override
      public Adapter caseMdAttributeTime(MdAttributeTime object)
      {
        return createMdAttributeTimeAdapter();
      }
      @Override
      public Adapter caseMdAttributeLocal(MdAttributeLocal object)
      {
        return createMdAttributeLocalAdapter();
      }
      @Override
      public Adapter caseMdAttributeLocalCharacter(MdAttributeLocalCharacter object)
      {
        return createMdAttributeLocalCharacterAdapter();
      }
      @Override
      public Adapter caseMdAttributeLocalText(MdAttributeLocalText object)
      {
        return createMdAttributeLocalTextAdapter();
      }
      @Override
      public Adapter caseMdAttributeLong(MdAttributeLong object)
      {
        return createMdAttributeLongAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
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
  public Adapter createMDBusinessAdapter()
  {
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
  public Adapter createMDAttributeAdapter()
  {
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
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBlob <em>Md Attribute Blob</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeBlob
   * @generated
   */
  public Adapter createMdAttributeBlobAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean <em>Md Attribute Boolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean
   * @generated
   */
  public Adapter createMdAttributeBooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter <em>Md Attribute Character</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter
   * @generated
   */
  public Adapter createMdAttributeCharacterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDate <em>Md Attribute Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDate
   * @generated
   */
  public Adapter createMdAttributeDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDateTime <em>Md Attribute Date Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDateTime
   * @generated
   */
  public Adapter createMdAttributeDateTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDecimal <em>Md Attribute Decimal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDecimal
   * @generated
   */
  public Adapter createMdAttributeDecimalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDouble <em>Md Attribute Double</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDouble
   * @generated
   */
  public Adapter createMdAttributeDoubleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeEnumeration <em>Md Attribute Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeEnumeration
   * @generated
   */
  public Adapter createMdAttributeEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeFloat <em>Md Attribute Float</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeFloat
   * @generated
   */
  public Adapter createMdAttributeFloatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeHash <em>Md Attribute Hash</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeHash
   * @generated
   */
  public Adapter createMdAttributeHashAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeInteger <em>Md Attribute Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeInteger
   * @generated
   */
  public Adapter createMdAttributeIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeNumber <em>Md Attribute Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeNumber
   * @generated
   */
  public Adapter createMdAttributeNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeStruct <em>Md Attribute Struct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeStruct
   * @generated
   */
  public Adapter createMdAttributeStructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeText <em>Md Attribute Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeText
   * @generated
   */
  public Adapter createMdAttributeTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeTime <em>Md Attribute Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeTime
   * @generated
   */
  public Adapter createMdAttributeTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocal <em>Md Attribute Local</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLocal
   * @generated
   */
  public Adapter createMdAttributeLocalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalCharacter <em>Md Attribute Local Character</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalCharacter
   * @generated
   */
  public Adapter createMdAttributeLocalCharacterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalText <em>Md Attribute Local Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalText
   * @generated
   */
  public Adapter createMdAttributeLocalTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLong <em>Md Attribute Long</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLong
   * @generated
   */
  public Adapter createMdAttributeLongAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RunwayAdapterFactory
