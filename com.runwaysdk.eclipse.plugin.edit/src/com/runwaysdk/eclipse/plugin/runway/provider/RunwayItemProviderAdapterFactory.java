/**
 */
package com.runwaysdk.eclipse.plugin.runway.provider;

import com.runwaysdk.eclipse.plugin.runway.util.RunwayAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RunwayItemProviderAdapterFactory extends RunwayAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunwayItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDBusiness} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDBusinessItemProvider mdBusinessItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDBusiness}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDBusinessAdapter()
  {
    if (mdBusinessItemProvider == null)
    {
      mdBusinessItemProvider = new MDBusinessItemProvider(this);
    }

    return mdBusinessItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.DocumentRoot} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootItemProvider documentRootItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.DocumentRoot}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDocumentRootAdapter()
  {
    if (documentRootItemProvider == null)
    {
      documentRootItemProvider = new DocumentRootItemProvider(this);
    }

    return documentRootItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBlob} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeBlobItemProvider mdAttributeBlobItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBlob}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeBlobAdapter()
  {
    if (mdAttributeBlobItemProvider == null)
    {
      mdAttributeBlobItemProvider = new MdAttributeBlobItemProvider(this);
    }

    return mdAttributeBlobItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeBooleanItemProvider mdAttributeBooleanItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeBooleanAdapter()
  {
    if (mdAttributeBooleanItemProvider == null)
    {
      mdAttributeBooleanItemProvider = new MdAttributeBooleanItemProvider(this);
    }

    return mdAttributeBooleanItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeCharacterItemProvider mdAttributeCharacterItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeCharacterAdapter()
  {
    if (mdAttributeCharacterItemProvider == null)
    {
      mdAttributeCharacterItemProvider = new MdAttributeCharacterItemProvider(this);
    }

    return mdAttributeCharacterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDate} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeDateItemProvider mdAttributeDateItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeDateAdapter()
  {
    if (mdAttributeDateItemProvider == null)
    {
      mdAttributeDateItemProvider = new MdAttributeDateItemProvider(this);
    }

    return mdAttributeDateItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDateTime} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeDateTimeItemProvider mdAttributeDateTimeItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDateTime}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeDateTimeAdapter()
  {
    if (mdAttributeDateTimeItemProvider == null)
    {
      mdAttributeDateTimeItemProvider = new MdAttributeDateTimeItemProvider(this);
    }

    return mdAttributeDateTimeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDecimal} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeDecimalItemProvider mdAttributeDecimalItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDecimal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeDecimalAdapter()
  {
    if (mdAttributeDecimalItemProvider == null)
    {
      mdAttributeDecimalItemProvider = new MdAttributeDecimalItemProvider(this);
    }

    return mdAttributeDecimalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDouble} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeDoubleItemProvider mdAttributeDoubleItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDouble}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeDoubleAdapter()
  {
    if (mdAttributeDoubleItemProvider == null)
    {
      mdAttributeDoubleItemProvider = new MdAttributeDoubleItemProvider(this);
    }

    return mdAttributeDoubleItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeEnumeration} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeEnumerationItemProvider mdAttributeEnumerationItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeEnumeration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeEnumerationAdapter()
  {
    if (mdAttributeEnumerationItemProvider == null)
    {
      mdAttributeEnumerationItemProvider = new MdAttributeEnumerationItemProvider(this);
    }

    return mdAttributeEnumerationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeFloat} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeFloatItemProvider mdAttributeFloatItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeFloat}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeFloatAdapter()
  {
    if (mdAttributeFloatItemProvider == null)
    {
      mdAttributeFloatItemProvider = new MdAttributeFloatItemProvider(this);
    }

    return mdAttributeFloatItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeHash} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeHashItemProvider mdAttributeHashItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeHash}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeHashAdapter()
  {
    if (mdAttributeHashItemProvider == null)
    {
      mdAttributeHashItemProvider = new MdAttributeHashItemProvider(this);
    }

    return mdAttributeHashItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeInteger} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeIntegerItemProvider mdAttributeIntegerItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeInteger}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeIntegerAdapter()
  {
    if (mdAttributeIntegerItemProvider == null)
    {
      mdAttributeIntegerItemProvider = new MdAttributeIntegerItemProvider(this);
    }

    return mdAttributeIntegerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeNumber} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeNumberItemProvider mdAttributeNumberItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeNumber}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeNumberAdapter()
  {
    if (mdAttributeNumberItemProvider == null)
    {
      mdAttributeNumberItemProvider = new MdAttributeNumberItemProvider(this);
    }

    return mdAttributeNumberItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeStruct} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeStructItemProvider mdAttributeStructItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeStruct}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeStructAdapter()
  {
    if (mdAttributeStructItemProvider == null)
    {
      mdAttributeStructItemProvider = new MdAttributeStructItemProvider(this);
    }

    return mdAttributeStructItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeText} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeTextItemProvider mdAttributeTextItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeText}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeTextAdapter()
  {
    if (mdAttributeTextItemProvider == null)
    {
      mdAttributeTextItemProvider = new MdAttributeTextItemProvider(this);
    }

    return mdAttributeTextItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeTime} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeTimeItemProvider mdAttributeTimeItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeTime}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeTimeAdapter()
  {
    if (mdAttributeTimeItemProvider == null)
    {
      mdAttributeTimeItemProvider = new MdAttributeTimeItemProvider(this);
    }

    return mdAttributeTimeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalCharacter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeLocalCharacterItemProvider mdAttributeLocalCharacterItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalCharacter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeLocalCharacterAdapter()
  {
    if (mdAttributeLocalCharacterItemProvider == null)
    {
      mdAttributeLocalCharacterItemProvider = new MdAttributeLocalCharacterItemProvider(this);
    }

    return mdAttributeLocalCharacterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalText} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeLocalTextItemProvider mdAttributeLocalTextItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalText}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeLocalTextAdapter()
  {
    if (mdAttributeLocalTextItemProvider == null)
    {
      mdAttributeLocalTextItemProvider = new MdAttributeLocalTextItemProvider(this);
    }

    return mdAttributeLocalTextItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLong} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MdAttributeLongItemProvider mdAttributeLongItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLong}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMdAttributeLongAdapter()
  {
    if (mdAttributeLongItemProvider == null)
    {
      mdAttributeLongItemProvider = new MdAttributeLongItemProvider(this);
    }

    return mdAttributeLongItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (mdBusinessItemProvider != null) mdBusinessItemProvider.dispose();
    if (documentRootItemProvider != null) documentRootItemProvider.dispose();
    if (mdAttributeBlobItemProvider != null) mdAttributeBlobItemProvider.dispose();
    if (mdAttributeBooleanItemProvider != null) mdAttributeBooleanItemProvider.dispose();
    if (mdAttributeCharacterItemProvider != null) mdAttributeCharacterItemProvider.dispose();
    if (mdAttributeDateItemProvider != null) mdAttributeDateItemProvider.dispose();
    if (mdAttributeDateTimeItemProvider != null) mdAttributeDateTimeItemProvider.dispose();
    if (mdAttributeDecimalItemProvider != null) mdAttributeDecimalItemProvider.dispose();
    if (mdAttributeDoubleItemProvider != null) mdAttributeDoubleItemProvider.dispose();
    if (mdAttributeEnumerationItemProvider != null) mdAttributeEnumerationItemProvider.dispose();
    if (mdAttributeFloatItemProvider != null) mdAttributeFloatItemProvider.dispose();
    if (mdAttributeHashItemProvider != null) mdAttributeHashItemProvider.dispose();
    if (mdAttributeIntegerItemProvider != null) mdAttributeIntegerItemProvider.dispose();
    if (mdAttributeNumberItemProvider != null) mdAttributeNumberItemProvider.dispose();
    if (mdAttributeStructItemProvider != null) mdAttributeStructItemProvider.dispose();
    if (mdAttributeTextItemProvider != null) mdAttributeTextItemProvider.dispose();
    if (mdAttributeTimeItemProvider != null) mdAttributeTimeItemProvider.dispose();
    if (mdAttributeLocalCharacterItemProvider != null) mdAttributeLocalCharacterItemProvider.dispose();
    if (mdAttributeLocalTextItemProvider != null) mdAttributeLocalTextItemProvider.dispose();
    if (mdAttributeLongItemProvider != null) mdAttributeLongItemProvider.dispose();
  }

}
