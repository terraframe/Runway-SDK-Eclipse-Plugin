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
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBlobEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBlobNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBooleanEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBooleanNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDecimalEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDecimalNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDoubleEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDoubleNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeEnumerationEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeEnumerationNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeFloatEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeFloatNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeHashEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeHashNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeIntegerEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeIntegerNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLongEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLongNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeNumberEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeNumberNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessClassNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessMdBusinessCompartmentEditPart;
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
        if (!RunwayElementTypes.isKnownElementType(elementType)
            || ( ! ( elementType instanceof IHintedType ) ))
        {
          return false; // foreign element type
        }
        String elementTypeHint = ( (IHintedType) elementType ).getSemanticHint();
        if (!op.getSemanticHint().equals(elementTypeHint))
        {
          return false; // if semantic hint is specified it should be the same as in element type
        }
        if (domainElement != null
            && visualID != RunwayVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement))
        {
          return false; // visual id for node EClass should match visual id from element type
        }
      }
      else
      {
        if (!DocumentRootEditPart.MODEL_ID.equals(RunwayVisualIDRegistry.getModelID(op
            .getContainerView())))
        {
          return false; // foreign diagram
        }
        switch (visualID)
        {
          case MDBusinessEditPart.VISUAL_ID:
          case MDAttributeTextEditPart.VISUAL_ID:
          case MDAttributeDateEditPart.VISUAL_ID:
          case MDAttributeBlobEditPart.VISUAL_ID:
          case MDAttributeLocalCharacterEditPart.VISUAL_ID:
          case MDAttributeDoubleEditPart.VISUAL_ID:
          case MDAttributeDecimalEditPart.VISUAL_ID:
          case MDAttributeLongEditPart.VISUAL_ID:
          case MDAttributeTimeEditPart.VISUAL_ID:
          case MDAttributeBooleanEditPart.VISUAL_ID:
          case MDAttributeNumberEditPart.VISUAL_ID:
          case MDAttributeDateTimeEditPart.VISUAL_ID:
          case MDAttributeIntegerEditPart.VISUAL_ID:
          case MDAttributeLocalTextEditPart.VISUAL_ID:
          case MDAttributeCharacterEditPart.VISUAL_ID:
          case MDAttributeFloatEditPart.VISUAL_ID:
          case MDAttributeEnumerationEditPart.VISUAL_ID:
          case MDAttributeHashEditPart.VISUAL_ID:
            if (domainElement == null
                || visualID != RunwayVisualIDRegistry.getNodeVisualID(op.getContainerView(),
                    domainElement))
            {
              return false; // visual id in semantic hint should match visual id for domain element
            }
            break;
          default:
            return false;
        }
      }
    }
    return MDBusinessEditPart.VISUAL_ID == visualID || MDAttributeTextEditPart.VISUAL_ID == visualID
        || MDAttributeDateEditPart.VISUAL_ID == visualID
        || MDAttributeBlobEditPart.VISUAL_ID == visualID
        || MDAttributeLocalCharacterEditPart.VISUAL_ID == visualID
        || MDAttributeDoubleEditPart.VISUAL_ID == visualID
        || MDAttributeDecimalEditPart.VISUAL_ID == visualID
        || MDAttributeLongEditPart.VISUAL_ID == visualID
        || MDAttributeTimeEditPart.VISUAL_ID == visualID
        || MDAttributeBooleanEditPart.VISUAL_ID == visualID
        || MDAttributeNumberEditPart.VISUAL_ID == visualID
        || MDAttributeDateTimeEditPart.VISUAL_ID == visualID
        || MDAttributeIntegerEditPart.VISUAL_ID == visualID
        || MDAttributeLocalTextEditPart.VISUAL_ID == visualID
        || MDAttributeCharacterEditPart.VISUAL_ID == visualID
        || MDAttributeFloatEditPart.VISUAL_ID == visualID
        || MDAttributeEnumerationEditPart.VISUAL_ID == visualID
        || MDAttributeHashEditPart.VISUAL_ID == visualID;
  }

  /**
   * @generated
   */
  protected boolean provides(CreateEdgeViewOperation op)
  {
    IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
    if (!RunwayElementTypes.isKnownElementType(elementType)
        || ( ! ( elementType instanceof IHintedType ) ))
    {
      return false; // foreign element type
    }
    String elementTypeHint = ( (IHintedType) elementType ).getSemanticHint();
    if (elementTypeHint == null
        || ( op.getSemanticHint() != null && !elementTypeHint.equals(op.getSemanticHint()) ))
    {
      return false; // our hint is visual id and must be specified, and it should be the same as in element type
    }
    int visualID = RunwayVisualIDRegistry.getVisualID(elementTypeHint);
    EObject domainElement = getSemanticElement(op.getSemanticAdapter());
    if (domainElement != null
        && visualID != RunwayVisualIDRegistry.getLinkWithClassVisualID(domainElement))
    {
      return false; // visual id for link EClass should match visual id from element type
    }
    return true;
  }

  /**
   * @generated
   */
  public Diagram createDiagram(IAdaptable semanticAdapter, String diagramKind,
      PreferencesHint preferencesHint)
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
  public Node createNode(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
      boolean persisted, PreferencesHint preferencesHint)
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
        return createMDBusiness_2002(domainElement, containerView, index, persisted, preferencesHint);
      case MDAttributeTextEditPart.VISUAL_ID:
        return createMDAttributeText_3019(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeDateEditPart.VISUAL_ID:
        return createMDAttributeDate_3020(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeBlobEditPart.VISUAL_ID:
        return createMDAttributeBlob_3021(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeLocalCharacterEditPart.VISUAL_ID:
        return createMDAttributeLocalCharacter_3022(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeDoubleEditPart.VISUAL_ID:
        return createMDAttributeDouble_3023(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeDecimalEditPart.VISUAL_ID:
        return createMDAttributeDecimal_3024(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeLongEditPart.VISUAL_ID:
        return createMDAttributeLong_3025(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeTimeEditPart.VISUAL_ID:
        return createMDAttributeTime_3026(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeBooleanEditPart.VISUAL_ID:
        return createMDAttributeBoolean_3027(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeNumberEditPart.VISUAL_ID:
        return createMDAttributeNumber_3028(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeDateTimeEditPart.VISUAL_ID:
        return createMDAttributeDateTime_3029(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeIntegerEditPart.VISUAL_ID:
        return createMDAttributeInteger_3030(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeLocalTextEditPart.VISUAL_ID:
        return createMDAttributeLocalText_3031(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeCharacterEditPart.VISUAL_ID:
        return createMDAttributeCharacter_3032(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeFloatEditPart.VISUAL_ID:
        return createMDAttributeFloat_3033(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeEnumerationEditPart.VISUAL_ID:
        return createMDAttributeEnumeration_3034(domainElement, containerView, index, persisted,
            preferencesHint);
      case MDAttributeHashEditPart.VISUAL_ID:
        return createMDAttributeHash_3035(domainElement, containerView, index, persisted,
            preferencesHint);
    }
    // can't happen, provided #provides(CreateNodeViewOperation) is correct
    return null;
  }

  /**
   * @generated
   */
  public Edge createEdge(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
      boolean persisted, PreferencesHint preferencesHint)
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
  public Node createMDBusiness_2002(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDBusinessEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    stampShortcut(containerView, node);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5037 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDBusinessClassNameEditPart.VISUAL_ID));
    createCompartment(node,
        RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID), false, false,
        true, true);
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeText_3019(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeTextEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5020 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeTextNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeDate_3020(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeDateEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5021 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeDateNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeBlob_3021(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeBlobEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5022 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeBlobNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeLocalCharacter_3022(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeLocalCharacterEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5023 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeLocalCharacterNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeDouble_3023(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeDoubleEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5024 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeDoubleNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeDecimal_3024(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeDecimalEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5025 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeDecimalNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeLong_3025(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeLongEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5026 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeLongNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeTime_3026(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeTimeEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5027 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeTimeNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeBoolean_3027(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeBooleanEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5028 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeBooleanNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeNumber_3028(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeNumberEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5029 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeNumberNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeDateTime_3029(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeDateTimeEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5030 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeDateTimeNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeInteger_3030(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeIntegerEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5031 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeIntegerNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeLocalText_3031(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeLocalTextEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5032 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeLocalTextNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeCharacter_3032(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeCharacterEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5033 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeCharacterNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeFloat_3033(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeFloatEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5034 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeFloatNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeEnumeration_3034(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeEnumerationEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5035 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeEnumerationNameEditPart.VISUAL_ID));
    return node;
  }

  /**
   * @generated
   */
  public Node createMDAttributeHash_3035(EObject domainElement, View containerView, int index,
      boolean persisted, PreferencesHint preferencesHint)
  {
    Shape node = NotationFactory.eINSTANCE.createShape();
    node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
    node.setType(RunwayVisualIDRegistry.getType(MDAttributeHashEditPart.VISUAL_ID));
    ViewUtil.insertChildView(containerView, node, index, persisted);
    node.setElement(domainElement);
    // initializeFromPreferences 
    final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

    org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_LINE_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
        FigureUtilities.RGBToInteger(lineRGB));
    FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
    if (nodeFontStyle != null)
    {
      FontData fontData = PreferenceConverter.getFontData(prefStore,
          IPreferenceConstants.PREF_DEFAULT_FONT);
      nodeFontStyle.setFontName(fontData.getName());
      nodeFontStyle.setFontHeight(fontData.getHeight());
      nodeFontStyle.setBold( ( fontData.getStyle() & SWT.BOLD ) != 0);
      nodeFontStyle.setItalic( ( fontData.getStyle() & SWT.ITALIC ) != 0);
      org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
          IPreferenceConstants.PREF_FONT_COLOR);
      nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
    }
    org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
        IPreferenceConstants.PREF_FILL_COLOR);
    ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
        FigureUtilities.RGBToInteger(fillRGB));
    Node label5036 = createLabel(node,
        RunwayVisualIDRegistry.getType(MDAttributeHashNameEditPart.VISUAL_ID));
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
  private Node createCompartment(View owner, String hint, boolean canCollapse, boolean hasTitle,
      boolean canSort, boolean canFilter)
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
