package com.runwaysdk.eclipse.plugin.runway.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.DocumentRootEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBlobEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBooleanEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDecimalEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDoubleEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeEnumerationEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeFloatEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeHashEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeIntegerEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLongEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeNumberEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessMdBusinessCompartmentEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry;

/**
 * @generated
 */
public class RunwayNavigatorContentProvider implements ICommonContentProvider
{

  /**
   * @generated
   */
  private static final Object[]       EMPTY_ARRAY = new Object[0];

  /**
   * @generated
   */
  private Viewer                      myViewer;

  /**
   * @generated
   */
  private AdapterFactoryEditingDomain myEditingDomain;

  /**
   * @generated
   */
  private WorkspaceSynchronizer       myWorkspaceSynchronizer;

  /**
   * @generated
   */
  private Runnable                    myViewerRefreshRunnable;

  /**
   * @generated
   */
  @SuppressWarnings({ "unchecked", "serial", "rawtypes" })
  public RunwayNavigatorContentProvider()
  {
    TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
    myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
    myEditingDomain.setResourceToReadOnlyMap(new HashMap()
    {
      public Object get(Object key)
      {
        if (!containsKey(key))
        {
          put(key, Boolean.TRUE);
        }
        return super.get(key);
      }
    });
    myViewerRefreshRunnable = new Runnable()
    {
      public void run()
      {
        if (myViewer != null)
        {
          myViewer.refresh();
        }
      }
    };
    myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
        new WorkspaceSynchronizer.Delegate()
        {
          public void dispose()
          {
          }

          public boolean handleResourceChanged(final Resource resource)
          {
            unloadAllResources();
            asyncRefresh();
            return true;
          }

          public boolean handleResourceDeleted(Resource resource)
          {
            unloadAllResources();
            asyncRefresh();
            return true;
          }

          public boolean handleResourceMoved(Resource resource, final URI newURI)
          {
            unloadAllResources();
            asyncRefresh();
            return true;
          }
        });
  }

  /**
   * @generated
   */
  public void dispose()
  {
    myWorkspaceSynchronizer.dispose();
    myWorkspaceSynchronizer = null;
    myViewerRefreshRunnable = null;
    myViewer = null;
    unloadAllResources();
    ( (TransactionalEditingDomain) myEditingDomain ).dispose();
    myEditingDomain = null;
  }

  /**
   * @generated
   */
  public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
  {
    myViewer = viewer;
  }

  /**
   * @generated
   */
  void unloadAllResources()
  {
    for (Resource nextResource : myEditingDomain.getResourceSet().getResources())
    {
      nextResource.unload();
    }
  }

  /**
   * @generated
   */
  void asyncRefresh()
  {
    if (myViewer != null && !myViewer.getControl().isDisposed())
    {
      myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
    }
  }

  /**
   * @generated
   */
  public Object[] getElements(Object inputElement)
  {
    return getChildren(inputElement);
  }

  /**
   * @generated
   */
  public void restoreState(IMemento aMemento)
  {
  }

  /**
   * @generated
   */
  public void saveState(IMemento aMemento)
  {
  }

  /**
   * @generated
   */
  public void init(ICommonContentExtensionSite aConfig)
  {
  }

  /**
   * @generated
   */
  public Object[] getChildren(Object parentElement)
  {
    if (parentElement instanceof IFile)
    {
      IFile file = (IFile) parentElement;
      URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
      Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
      ArrayList<RunwayNavigatorItem> result = new ArrayList<RunwayNavigatorItem>();
      ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
      for (EObject o : resource.getContents())
      {
        if (o instanceof View)
        {
          topViews.add((View) o);
        }
      }
      return result.toArray();
    }

    if (parentElement instanceof RunwayNavigatorGroup)
    {
      RunwayNavigatorGroup group = (RunwayNavigatorGroup) parentElement;
      return group.getChildren();
    }

    if (parentElement instanceof RunwayNavigatorItem)
    {
      RunwayNavigatorItem navigatorItem = (RunwayNavigatorItem) parentElement;
      if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView()))
      {
        return EMPTY_ARRAY;
      }
      return getViewChildren(navigatorItem.getView(), parentElement);
    }

    return EMPTY_ARRAY;
  }

  /**
   * @generated
   */
  private Object[] getViewChildren(View view, Object parentElement)
  {
    switch (RunwayVisualIDRegistry.getVisualID(view))
    {

      case DocumentRootEditPart.VISUAL_ID:
      {
        LinkedList<RunwayAbstractNavigatorItem> result = new LinkedList<RunwayAbstractNavigatorItem>();
        Diagram sv = (Diagram) view;
        Collection<View> connectedViews;
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        return result.toArray();
      }

      case MDBusinessEditPart.VISUAL_ID:
      {
        LinkedList<RunwayAbstractNavigatorItem> result = new LinkedList<RunwayAbstractNavigatorItem>();
        Node sv = (Node) view;
        Collection<View> connectedViews;
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeTextEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeDateEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeBlobEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeLocalCharacterEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeDoubleEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeDecimalEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeLongEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeTimeEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeBooleanEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeNumberEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeDateTimeEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeIntegerEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeLocalTextEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeCharacterEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeFloatEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeEnumerationEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        connectedViews = getChildrenByType(Collections.singleton(sv),
            RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
        connectedViews = getChildrenByType(connectedViews,
            RunwayVisualIDRegistry.getType(MDAttributeHashEditPart.VISUAL_ID));
        result.addAll(createNavigatorItems(connectedViews, parentElement, false));
        return result.toArray();
      }
    }
    return EMPTY_ARRAY;
  }

  /**
   * @generated
   */
  private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type)
  {
    LinkedList<View> result = new LinkedList<View>();
    for (Edge nextEdge : edges)
    {
      View nextEdgeSource = nextEdge.getSource();
      if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource))
      {
        result.add(nextEdgeSource);
      }
    }
    return result;
  }

  /**
   * @generated
   */
  private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type)
  {
    LinkedList<View> result = new LinkedList<View>();
    for (Edge nextEdge : edges)
    {
      View nextEdgeTarget = nextEdge.getTarget();
      if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget))
      {
        result.add(nextEdgeTarget);
      }
    }
    return result;
  }

  /**
   * @generated
   */
  private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type)
  {
    LinkedList<View> result = new LinkedList<View>();
    for (View nextNode : nodes)
    {
      result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
    }
    return result;
  }

  /**
   * @generated
   */
  private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type)
  {
    LinkedList<View> result = new LinkedList<View>();
    for (View nextNode : nodes)
    {
      result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
    }
    return result;
  }

  /**
   * @generated
   */
  private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type)
  {
    LinkedList<View> result = new LinkedList<View>();
    for (View nextNode : nodes)
    {
      result.addAll(selectViewsByType(nextNode.getChildren(), type));
    }
    return result;
  }

  /**
   * @generated
   */
  private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type)
  {
    ArrayList<View> result = new ArrayList<View>();
    for (Diagram nextDiagram : diagrams)
    {
      result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
    }
    return result;
  }

  // TODO refactor as static method
  /**
   * @generated
   */
  private Collection<View> selectViewsByType(Collection<View> views, String type)
  {
    ArrayList<View> result = new ArrayList<View>();
    for (View nextView : views)
    {
      if (type.equals(nextView.getType()) && isOwnView(nextView))
      {
        result.add(nextView);
      }
    }
    return result;
  }

  /**
   * @generated
   */
  private boolean isOwnView(View view)
  {
    return DocumentRootEditPart.MODEL_ID.equals(RunwayVisualIDRegistry.getModelID(view));
  }

  /**
   * @generated
   */
  private Collection<RunwayNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
      boolean isLeafs)
  {
    ArrayList<RunwayNavigatorItem> result = new ArrayList<RunwayNavigatorItem>(views.size());
    for (View nextView : views)
    {
      result.add(new RunwayNavigatorItem(nextView, parent, isLeafs));
    }
    return result;
  }

  /**
   * @generated
   */
  public Object getParent(Object element)
  {
    if (element instanceof RunwayAbstractNavigatorItem)
    {
      RunwayAbstractNavigatorItem abstractNavigatorItem = (RunwayAbstractNavigatorItem) element;
      return abstractNavigatorItem.getParent();
    }
    return null;
  }

  /**
   * @generated
   */
  public boolean hasChildren(Object element)
  {
    return element instanceof IFile || getChildren(element).length > 0;
  }

}
