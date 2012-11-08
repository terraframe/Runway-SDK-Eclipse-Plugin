package com.runwaysdk.eclipse.plugin.runway.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.DocumentRootEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessClassNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessMdBusinessCompartmentEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBlobEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBlobNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBooleanEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBooleanNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDecimalEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDecimalNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDoubleEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDoubleNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeEnumerationEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeEnumerationNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeFloatEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeFloatNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeHashEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeHashNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeIntegerEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeIntegerNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLongEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLongNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeNumberEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeNumberNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry;

/**
 * @generated
 */
public class RunwayViewProvider extends AbstractProvider implements IViewProvider
{

  /**
   * @generated
   */
  public final boolean provides(IOperation operation)
  {
    if (operation instanceof CreateViewForKindOperation)
    {
      return provides((CreateViewForKindOperation) operation);
    }
    assert operation instanceof CreateViewOperation;
    if (operation instanceof CreateDiagramViewOperation)
    {
      return provides((CreateDiagramViewOperation) operation);
    }
    else if (operation instanceof CreateEdgeViewOperation)
    {
      return provides((CreateEdgeViewOperation) operation);
    }
    else if (operation instanceof CreateNodeViewOperation)
    {
      return provides((CreateNodeViewOperation) operation);
    }
    return false;
  }

  /**
   * @generated
   */
  protected boolean provides(CreateViewForKindOperation op)
  {
    /*
     if (op.getViewKind() == Node.class)
     return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
     if (op.getViewKind() == Edge.class)
     return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
     */
    return true;
  }

  /**
   * @generated
   */
  protected boolean provides(CreateDiagramViewOperation op)
  {
    return DocumentRootEditPart.MODEL_ID.equals(op.getSemanticHint())
        && RunwayVisualIDRegistry.getDiagramVisualID(getSemanticElement(op.getSemanticAdapter())) != -1;
  }

  /**
   * @generated
   */
  protected boolean provides(CreateNodeViewOperation op)
  {
    if (op.getContainerView() == null)
    {
      return false;
    }
    IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
    EObject domainElement = getSemanticElement(op.getSemanticAdapter());
    int visualID;
    if (op.getSemanticHint() == null)
    {
      // Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
      // In this situation there should be NO elementType, visualID will be determined
      // by VisualIDRegistry.getNodeVisualID() for domainElement.
      if (elementType != null || domainElement == null)
      {
        return false;
      }
      visualID = RunwayVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement);
    }
    else
    {
      visualID = RunwayVisualIDRegistry.getVisualID(op.getSemanticHint());
      if (elementType != null)
      {
        if (!RunwayElementTypes.isKnownElementType(elementType) || ( ! ( elementType instanceof IHintedType ) ))
        {
          return false; // foreign element type
        }
        String elementTypeHint = ( (IHintedType) elementType ).getSemanticHint();
        if (!op.getSemanticHint().equals(elementTypeHint))
        {
          return false; // if semantic hint is specified it should be the same as in element type
        }
        if (domainElement != null && visualID != RunwayVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement))
        {
          return false; // visual id for node EClass should match visual id from element type
        }
      }
      else
      {
        if (!DocumentRootEditPart.MODEL_ID.equals(RunwayVisualIDRegistry.getModelID(op.getContainerView())))
        {
          return false; // foreign diagram
        }
        switch (visualID)
        {
          case MDBusinessEditPart.VISUAL_ID:
          case MdAttributeTextEditPart.VISUAL_ID:
          case MdAttributeDateEditPart.VISUAL_ID:
          case MdAttributeBlobEditPart.VISUAL_ID:
          case MdAttributeLocalCharacterEditPart.VISUAL_ID:
          case MdAttributeDoubleEditPart.VISUAL_ID:
          case MdAttributeDecimalEditPart.VISUAL_ID:
          case MdAttributeLongEditPart.VISUAL_ID:
          case MdAttributeTimeEditPart.VISUAL_ID:
          case MdAttributeBooleanEditPart.VISUAL_ID:
          case MdAttributeNumberEditPart.VISUAL_ID:
          case MdAttributeDateTimeEditPart.VISUAL_ID:
          case MdAttributeIntegerEditPart.VISUAL_ID:
          case MdAttributeLocalTextEditPart.VISUAL_ID:
          case MdAttributeCharacterEditPart.VISUAL_ID:
          case MdAttributeFloatEditPart.VISUAL_ID:
          case MdAttributeEnumerationEditPart.VISUAL_ID:
          case MdAttributeHashEditPart.VISUAL_ID:
            if (domainElement == null || visualID != RunwayVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement))
            {
              return false; // visual id in semantic hint should match visual id for domain element
            }
            break;
          default:
            return false;
        }
      }
    }
    return MDBusinessEditPart.VISUAL_ID == visualID || MdAttributeTextEditPart.VISUAL_ID == visualID || MdAttributeDateEditPart.VISUAL_ID == visualID
        || MdAttributeBlobEditPart.VISUAL_ID == visualID || MdAttributeLocalCharacterEditPart.VISUAL_ID == visualID
        || MdAttributeDoubleEditPart.VISUAL_ID == visualID || MdAttributeDecimalEditPart.VISUAL_ID == visualID
        || MdAttributeLongEditPart.VISUAL_ID == visualID || MdAttributeTimeEditPart.VISUAL_ID == visualID
        || MdAttributeBooleanEditPart.VISUAL_ID == visualID || MdAttributeNumberEditPart.VISUAL_ID == visualID
        || MdAttributeDateTimeEditPart.VISUAL_ID == visualID || MdAttributeIntegerEditPart.VISUAL_ID == visualID
        || MdAttributeLocalTextEditPart.VISUAL_ID == visualID || MdAttributeCharacterEditPart.VISUAL_ID == visualID
        || MdAttributeFloatEditPart.VISUAL_ID == visualID || MdAttributeEnumerationEditPart.VISUAL_ID == visualID
        || MdAttributeHashEditPart.VISUAL_ID == visualID;
  }

  /**
   * @generated
   */
  protected boolean provides(CreateEdgeViewOperation op)
  {
    IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
    if (!RunwayElementTypes.isKnownElementType(elementType) || ( ! ( elementType instanceof IHintedType ) ))
    {
      return false; // foreign element type
    }
    String elementTypeHint = ( (IHintedType) elementType ).getSemanticHint();
    if (elementTypeHint == null || ( op.getSemanticHint() != null && !elementTypeHint.equals(op.getSemanticHint()) ))
    {
      return false; // our hint is visual id and must be specified, and it should be the same as in element type
    }
    int visualID = RunwayVisualIDRegistry.getVisualID(elementTypeHint);
    EObject domainElement = getSemanticElement(op.getSemanticAdapter());
    if (domainElement != null && visualID != RunwayVisualIDRegistry.getLinkWithClassVisualID(domainElement))
    {
      return false; // visual id for link EClass should match visual id from element type
    }
    return true;
  }

  /**
   * @generated
   */
  public Diagram createDiagram(IAdaptable semanticAdapter, String diagramKind, PreferencesHint preferencesHint)
  {
    Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
    diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
    diagram.setType(DocumentRootEditPart.MODEL_ID);
    diagram.setElement(getSemanticElement(semanticAdapter));
    diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
    return diagram;
  }

  /**
   * @generated
   */
  public Node createNode(IAdaptable semanticAdapter, View containerView, String semanticHint, int index, boolean persisted,
      PreferencesHint preferencesHint)
  {
    final EObject domainElement = getSemanticElement(semanticAdapter);
    final int visualID;
    if (semanticHint == null)
    {
      visualID = RunwayVisualIDRegistry.getNodeVisualID(containerView, domainElement);
    }
    else
    {
      visualID = RunwayVisualIDRegistry.getVisualID(semanticHint);
    }
    switch (visualID)
    {
      case MDBusinessEditPart.VISUAL_ID:
        return createMDBusiness_2001(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeTextEditPart.VISUAL_ID:
        return createMdAttributeText_3004(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeDateEditPart.VISUAL_ID:
        return createMdAttributeDate_3005(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeBlobEditPart.VISUAL_ID:
        return createMdAttributeBlob_3002(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeLocalCharacterEditPart.VISUAL_ID:
        return createMdAttributeLocalCharacter_3006(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeDoubleEditPart.VISUAL_ID:
        return createMdAttributeDouble_3007(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeDecimalEditPart.VISUAL_ID:
        return createMdAttributeDecimal_3008(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeLongEditPart.VISUAL_ID:
        return createMdAttributeLong_3009(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeTimeEditPart.VISUAL_ID:
        return createMdAttributeTime_3010(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeBooleanEditPart.VISUAL_ID:
        return createMdAttributeBoolean_3003(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeNumberEditPart.VISUAL_ID:
        return createMdAttributeNumber_3011(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeDateTimeEditPart.VISUAL_ID:
        return createMdAttributeDateTime_3012(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeIntegerEditPart.VISUAL_ID:
        return createMdAttributeInteger_3013(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeLocalTextEditPart.VISUAL_ID:
        return createMdAttributeLocalText_3014(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeCharacterEditPart.VISUAL_ID:
        return createMdAttributeCharacter_3015(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeFloatEditPart.VISUAL_ID:
        return createMdAttributeFloat_3016(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeEnumerationEditPart.VISUAL_ID:
        return createMdAttributeEnumeration_3017(domainElement, containerView, index, persisted, preferencesHint);
      case MdAttributeHashEditPart.VISUAL_ID:
        return createMdAttributeHash_3018(domainElement, containerView, index, persisted, preferencesHint);
    }
    // can't happen, provided #provides(CreateNodeViewOperation) is correct
    return null;
  }

  /**
   * @generated
   */
  public Edge createEdge(IAdaptable semanticAdapter, View containerView, String semanticHint, int index, boolean persisted,
      PreferencesHint preferencesHint)
  {
    IElementType elementType = getSemanticElementType(semanticAdapter);
    String elementTypeHint = ( (IHintedType) elementType ).getSemanticHint();
    switch (RunwayVisualIDRegistry.getVisualID(elementTypeHint))
    {
    }
    // can never happen, provided #provides(CreateEdgeViewOperation) is correct
    return null;
  }

  /**
   * @generated
   */
  public Node createMDBusiness_2001(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDBusinessEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    stampShortcut(containerView, node);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5002 = createLabel(node, RunwayVisualIDRegistry.getType(MDBusinessClassNameEditPart.VISUAL_ID));
    createCompartment(node, RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID), false, false, true, true);
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeText_3004(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeTextEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5005 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeTextNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeDate_3005(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeDateEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5006 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeDateNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeBlob_3002(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeBlobEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5003 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeBlobNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeLocalCharacter_3006(EObject domainElement, View containerView, int index, boolean persisted,
      PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeLocalCharacterEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5007 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeLocalCharacterNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeDouble_3007(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeDoubleEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5008 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeDoubleNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeDecimal_3008(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeDecimalEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5009 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeDecimalNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeLong_3009(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeLongEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5010 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeLongNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeTime_3010(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeTimeEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5011 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeTimeNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeBoolean_3003(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeBooleanEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5004 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeBooleanNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeNumber_3011(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeNumberEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5012 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeNumberNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeDateTime_3012(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeDateTimeEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5013 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeDateTimeNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeInteger_3013(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeIntegerEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5014 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeIntegerNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeLocalText_3014(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeLocalTextEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5015 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeLocalTextNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeCharacter_3015(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeCharacterEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5016 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeCharacterNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeFloat_3016(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeFloatEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5017 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeFloatNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeEnumeration_3017(EObject domainElement, View containerView, int index, boolean persisted,
      PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeEnumerationEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5018 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeEnumerationNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMdAttributeHash_3018(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MdAttributeHashEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
    Node label5019 = createLabel(node, RunwayVisualIDRegistry.getType(MdAttributeHashNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  private void stampShortcut(View containerView, Node target)
  {
    if (!DocumentRootEditPart.MODEL_ID.equals(RunwayVisualIDRegistry.getModelID(containerView)))
    {
      EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
      shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
      shortcutAnnotation.getDetails().put("modelID", DocumentRootEditPart.MODEL_ID); //$NON-NLS-1$
      target.getEAnnotations().add(shortcutAnnotation);
    }
  }

  /**
   * @generated
   */
  private Node createLabel(View owner, String hint)
  {
    DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
    rv.setType(hint);
    ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
    return rv;
  }

  /**
   * @generated
   */
  private Node createCompartment(View owner, String hint, boolean canCollapse, boolean hasTitle, boolean canSort, boolean canFilter)
  {
    //SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
    //rv.setShowTitle(showTitle);
    //rv.setCollapsed(isCollapsed);
    Node rv;
    if (canCollapse)
    {
      rv = NotationFactory.eINSTANCE.createBasicCompartment();
    }
    else
    {
      rv = NotationFactory.eINSTANCE.createDecorationNode();
    }
    if (hasTitle)
    {
      TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
      ts.setShowTitle(true);
      rv.getStyles().add(ts);
    }
    if (canSort)
    {
      rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
    }
    if (canFilter)
    {
      rv.getStyles().add(NotationFactory.eINSTANCE.createFilteringStyle());
    }
    rv.setType(hint);
    ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
    return rv;
  }

  /**
   * @generated
   */
  private EObject getSemanticElement(IAdaptable semanticAdapter)
  {
    if (semanticAdapter == null)
    {
      return null;
    }
    EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
    if (eObject != null)
    {
      return EMFCoreUtil.resolve(TransactionUtil.getEditingDomain(eObject), eObject);
    }
    return null;
  }

  /**
   * @generated
   */
  private IElementType getSemanticElementType(IAdaptable semanticAdapter)
  {
    if (semanticAdapter == null)
    {
      return null;
    }
    return (IElementType) semanticAdapter.getAdapter(IElementType.class);
  }
}
