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
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MetaData} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaDataItemProvider metaDataItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MetaData}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMetaDataAdapter()
  {
    if (metaDataItemProvider == null)
    {
      metaDataItemProvider = new MetaDataItemProvider(this);
    }

    return metaDataItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDType} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDTypeItemProvider mdTypeItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDTypeAdapter()
  {
    if (mdTypeItemProvider == null)
    {
      mdTypeItemProvider = new MDTypeItemProvider(this);
    }

    return mdTypeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDClass} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDClassItemProvider mdClassItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDClassAdapter()
  {
    if (mdClassItemProvider == null)
    {
      mdClassItemProvider = new MDClassItemProvider(this);
    }

    return mdClassItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDEntity} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDEntityItemProvider mdEntityItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDEntity}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDEntityAdapter()
  {
    if (mdEntityItemProvider == null)
    {
      mdEntityItemProvider = new MDEntityItemProvider(this);
    }

    return mdEntityItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDElement} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDElementItemProvider mdElementItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDElementAdapter()
  {
    if (mdElementItemProvider == null)
    {
      mdElementItemProvider = new MDElementItemProvider(this);
    }

    return mdElementItemProvider;
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
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeBlobItemProvider mdAttributeBlobItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeBlobAdapter()
  {
    if (mdAttributeBlobItemProvider == null)
    {
      mdAttributeBlobItemProvider = new MDAttributeBlobItemProvider(this);
    }

    return mdAttributeBlobItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeBooleanItemProvider mdAttributeBooleanItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeBooleanAdapter()
  {
    if (mdAttributeBooleanItemProvider == null)
    {
      mdAttributeBooleanItemProvider = new MDAttributeBooleanItemProvider(this);
    }

    return mdAttributeBooleanItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeCharacterItemProvider mdAttributeCharacterItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeCharacterAdapter()
  {
    if (mdAttributeCharacterItemProvider == null)
    {
      mdAttributeCharacterItemProvider = new MDAttributeCharacterItemProvider(this);
    }

    return mdAttributeCharacterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDate} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeDateItemProvider mdAttributeDateItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeDateAdapter()
  {
    if (mdAttributeDateItemProvider == null)
    {
      mdAttributeDateItemProvider = new MDAttributeDateItemProvider(this);
    }

    return mdAttributeDateItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeDateTimeItemProvider mdAttributeDateTimeItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeDateTimeAdapter()
  {
    if (mdAttributeDateTimeItemProvider == null)
    {
      mdAttributeDateTimeItemProvider = new MDAttributeDateTimeItemProvider(this);
    }

    return mdAttributeDateTimeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeDecimalItemProvider mdAttributeDecimalItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeDecimalAdapter()
  {
    if (mdAttributeDecimalItemProvider == null)
    {
      mdAttributeDecimalItemProvider = new MDAttributeDecimalItemProvider(this);
    }

    return mdAttributeDecimalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeDoubleItemProvider mdAttributeDoubleItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeDoubleAdapter()
  {
    if (mdAttributeDoubleItemProvider == null)
    {
      mdAttributeDoubleItemProvider = new MDAttributeDoubleItemProvider(this);
    }

    return mdAttributeDoubleItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeEnumerationItemProvider mdAttributeEnumerationItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeEnumerationAdapter()
  {
    if (mdAttributeEnumerationItemProvider == null)
    {
      mdAttributeEnumerationItemProvider = new MDAttributeEnumerationItemProvider(this);
    }

    return mdAttributeEnumerationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeFloatItemProvider mdAttributeFloatItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeFloatAdapter()
  {
    if (mdAttributeFloatItemProvider == null)
    {
      mdAttributeFloatItemProvider = new MDAttributeFloatItemProvider(this);
    }

    return mdAttributeFloatItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeHash} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeHashItemProvider mdAttributeHashItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeHash}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeHashAdapter()
  {
    if (mdAttributeHashItemProvider == null)
    {
      mdAttributeHashItemProvider = new MDAttributeHashItemProvider(this);
    }

    return mdAttributeHashItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeIntegerItemProvider mdAttributeIntegerItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeIntegerAdapter()
  {
    if (mdAttributeIntegerItemProvider == null)
    {
      mdAttributeIntegerItemProvider = new MDAttributeIntegerItemProvider(this);
    }

    return mdAttributeIntegerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeNumberItemProvider mdAttributeNumberItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeNumberAdapter()
  {
    if (mdAttributeNumberItemProvider == null)
    {
      mdAttributeNumberItemProvider = new MDAttributeNumberItemProvider(this);
    }

    return mdAttributeNumberItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeStruct} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeStructItemProvider mdAttributeStructItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeStruct}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeStructAdapter()
  {
    if (mdAttributeStructItemProvider == null)
    {
      mdAttributeStructItemProvider = new MDAttributeStructItemProvider(this);
    }

    return mdAttributeStructItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeText} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeTextItemProvider mdAttributeTextItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeText}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeTextAdapter()
  {
    if (mdAttributeTextItemProvider == null)
    {
      mdAttributeTextItemProvider = new MDAttributeTextItemProvider(this);
    }

    return mdAttributeTextItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeTime} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeTimeItemProvider mdAttributeTimeItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeTime}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeTimeAdapter()
  {
    if (mdAttributeTimeItemProvider == null)
    {
      mdAttributeTimeItemProvider = new MDAttributeTimeItemProvider(this);
    }

    return mdAttributeTimeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeLocalCharacterItemProvider mdAttributeLocalCharacterItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeLocalCharacterAdapter()
  {
    if (mdAttributeLocalCharacterItemProvider == null)
    {
      mdAttributeLocalCharacterItemProvider = new MDAttributeLocalCharacterItemProvider(this);
    }

    return mdAttributeLocalCharacterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeLocalTextItemProvider mdAttributeLocalTextItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeLocalTextAdapter()
  {
    if (mdAttributeLocalTextItemProvider == null)
    {
      mdAttributeLocalTextItemProvider = new MDAttributeLocalTextItemProvider(this);
    }

    return mdAttributeLocalTextItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLong} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeLongItemProvider mdAttributeLongItemProvider;

  /**
   * This creates an adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLong}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMDAttributeLongAdapter()
  {
    if (mdAttributeLongItemProvider == null)
    {
      mdAttributeLongItemProvider = new MDAttributeLongItemProvider(this);
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
    if (metaDataItemProvider != null) metaDataItemProvider.dispose();
    if (mdTypeItemProvider != null) mdTypeItemProvider.dispose();
    if (mdClassItemProvider != null) mdClassItemProvider.dispose();
    if (mdEntityItemProvider != null) mdEntityItemProvider.dispose();
    if (mdElementItemProvider != null) mdElementItemProvider.dispose();
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
