package com.runwaysdk.eclipse.plugin.runway.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.DocumentRootEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessClassNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
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
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayElementTypes;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayParserProvider;

/**
 * @generated
 */
public class RunwayNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider
{

  /**
   * @generated
   */
  static
  {
    RunwayDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
    RunwayDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
  }

  /**
   * @generated
   */
  public void updateLabel(ViewerLabel label, TreePath elementPath)
  {
    Object element = elementPath.getLastSegment();
    if (element instanceof RunwayNavigatorItem && !isOwnView( ( (RunwayNavigatorItem) element ).getView()))
    {
      return;
    }
    label.setText(getText(element));
    label.setImage(getImage(element));
  }

  /**
   * @generated
   */
  public Image getImage(Object element)
  {
    if (element instanceof RunwayNavigatorGroup)
    {
      RunwayNavigatorGroup group = (RunwayNavigatorGroup) element;
      return RunwayDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
    }

    if (element instanceof RunwayNavigatorItem)
    {
      RunwayNavigatorItem navigatorItem = (RunwayNavigatorItem) element;
      if (!isOwnView(navigatorItem.getView()))
      {
        return super.getImage(element);
      }
      return getImage(navigatorItem.getView());
    }

    return super.getImage(element);
  }

  /**
   * @generated
   */
  public Image getImage(View view)
  {
    switch (RunwayVisualIDRegistry.getVisualID(view))
    {
      case DocumentRootEditPart.VISUAL_ID:
        return getImage("Navigator?Diagram?runway?DocumentRoot", RunwayElementTypes.DocumentRoot_1000); //$NON-NLS-1$
      case MDBusinessEditPart.VISUAL_ID:
        return getImage("Navigator?TopLevelNode?runway?MDBusiness", RunwayElementTypes.MDBusiness_2001); //$NON-NLS-1$
      case MdAttributeTextEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeText", RunwayElementTypes.MdAttributeText_3004); //$NON-NLS-1$
      case MdAttributeDateEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeDate", RunwayElementTypes.MdAttributeDate_3005); //$NON-NLS-1$
      case MdAttributeBlobEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeBlob", RunwayElementTypes.MdAttributeBlob_3002); //$NON-NLS-1$
      case MdAttributeLocalCharacterEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeLocalCharacter", RunwayElementTypes.MdAttributeLocalCharacter_3006); //$NON-NLS-1$
      case MdAttributeDoubleEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeDouble", RunwayElementTypes.MdAttributeDouble_3007); //$NON-NLS-1$
      case MdAttributeDecimalEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeDecimal", RunwayElementTypes.MdAttributeDecimal_3008); //$NON-NLS-1$
      case MdAttributeLongEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeLong", RunwayElementTypes.MdAttributeLong_3009); //$NON-NLS-1$
      case MdAttributeTimeEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeTime", RunwayElementTypes.MdAttributeTime_3010); //$NON-NLS-1$
      case MdAttributeBooleanEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeBoolean", RunwayElementTypes.MdAttributeBoolean_3003); //$NON-NLS-1$
      case MdAttributeNumberEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeNumber", RunwayElementTypes.MdAttributeNumber_3011); //$NON-NLS-1$
      case MdAttributeDateTimeEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeDateTime", RunwayElementTypes.MdAttributeDateTime_3012); //$NON-NLS-1$
      case MdAttributeIntegerEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeInteger", RunwayElementTypes.MdAttributeInteger_3013); //$NON-NLS-1$
      case MdAttributeLocalTextEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeLocalText", RunwayElementTypes.MdAttributeLocalText_3014); //$NON-NLS-1$
      case MdAttributeCharacterEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeCharacter", RunwayElementTypes.MdAttributeCharacter_3015); //$NON-NLS-1$
      case MdAttributeFloatEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeFloat", RunwayElementTypes.MdAttributeFloat_3016); //$NON-NLS-1$
      case MdAttributeEnumerationEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeEnumeration", RunwayElementTypes.MdAttributeEnumeration_3017); //$NON-NLS-1$
      case MdAttributeHashEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MdAttributeHash", RunwayElementTypes.MdAttributeHash_3018); //$NON-NLS-1$
    }
    return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
  }

  /**
   * @generated
   */
  private Image getImage(String key, IElementType elementType)
  {
    ImageRegistry imageRegistry = RunwayDiagramEditorPlugin.getInstance().getImageRegistry();
    Image image = imageRegistry.get(key);
    if (image == null && elementType != null && RunwayElementTypes.isKnownElementType(elementType))
    {
      image = RunwayElementTypes.getImage(elementType);
      imageRegistry.put(key, image);
    }

    if (image == null)
    {
      image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
      imageRegistry.put(key, image);
    }
    return image;
  }

  /**
   * @generated
   */
  public String getText(Object element)
  {
    if (element instanceof RunwayNavigatorGroup)
    {
      RunwayNavigatorGroup group = (RunwayNavigatorGroup) element;
      return group.getGroupName();
    }

    if (element instanceof RunwayNavigatorItem)
    {
      RunwayNavigatorItem navigatorItem = (RunwayNavigatorItem) element;
      if (!isOwnView(navigatorItem.getView()))
      {
        return null;
      }
      return getText(navigatorItem.getView());
    }

    return super.getText(element);
  }

  /**
   * @generated
   */
  public String getText(View view)
  {
    if (view.getElement() != null && view.getElement().eIsProxy())
    {
      return getUnresolvedDomainElementProxyText(view);
    }
    switch (RunwayVisualIDRegistry.getVisualID(view))
    {
      case DocumentRootEditPart.VISUAL_ID:
        return getDocumentRoot_1000Text(view);
      case MDBusinessEditPart.VISUAL_ID:
        return getMDBusiness_2001Text(view);
      case MdAttributeTextEditPart.VISUAL_ID:
        return getMdAttributeText_3004Text(view);
      case MdAttributeDateEditPart.VISUAL_ID:
        return getMdAttributeDate_3005Text(view);
      case MdAttributeBlobEditPart.VISUAL_ID:
        return getMdAttributeBlob_3002Text(view);
      case MdAttributeLocalCharacterEditPart.VISUAL_ID:
        return getMdAttributeLocalCharacter_3006Text(view);
      case MdAttributeDoubleEditPart.VISUAL_ID:
        return getMdAttributeDouble_3007Text(view);
      case MdAttributeDecimalEditPart.VISUAL_ID:
        return getMdAttributeDecimal_3008Text(view);
      case MdAttributeLongEditPart.VISUAL_ID:
        return getMdAttributeLong_3009Text(view);
      case MdAttributeTimeEditPart.VISUAL_ID:
        return getMdAttributeTime_3010Text(view);
      case MdAttributeBooleanEditPart.VISUAL_ID:
        return getMdAttributeBoolean_3003Text(view);
      case MdAttributeNumberEditPart.VISUAL_ID:
        return getMdAttributeNumber_3011Text(view);
      case MdAttributeDateTimeEditPart.VISUAL_ID:
        return getMdAttributeDateTime_3012Text(view);
      case MdAttributeIntegerEditPart.VISUAL_ID:
        return getMdAttributeInteger_3013Text(view);
      case MdAttributeLocalTextEditPart.VISUAL_ID:
        return getMdAttributeLocalText_3014Text(view);
      case MdAttributeCharacterEditPart.VISUAL_ID:
        return getMdAttributeCharacter_3015Text(view);
      case MdAttributeFloatEditPart.VISUAL_ID:
        return getMdAttributeFloat_3016Text(view);
      case MdAttributeEnumerationEditPart.VISUAL_ID:
        return getMdAttributeEnumeration_3017Text(view);
      case MdAttributeHashEditPart.VISUAL_ID:
        return getMdAttributeHash_3018Text(view);
    }
    return getUnknownElementText(view);
  }

  /**
   * @generated
   */
  private String getDocumentRoot_1000Text(View view)
  {
    return ""; //$NON-NLS-1$
  }

  /**
   * @generated
   */
  private String getMDBusiness_2001Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDBusiness_2001, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDBusinessClassNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeText_3004Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeText_3004, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeTextNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeDate_3005Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeDate_3005, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeDateNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeBlob_3002Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeBlob_3002, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeBlobNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeLocalCharacter_3006Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeLocalCharacter_3006, view.getElement() != null ? view.getElement()
        : view, RunwayVisualIDRegistry.getType(MdAttributeLocalCharacterNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeDouble_3007Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeDouble_3007, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeDoubleNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeDecimal_3008Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeDecimal_3008, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeDecimalNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeLong_3009Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeLong_3009, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeLongNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeTime_3010Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeTime_3010, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeTimeNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeBoolean_3003Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeBoolean_3003, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeBooleanNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeNumber_3011Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeNumber_3011, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeNumberNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeDateTime_3012Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeDateTime_3012,
        view.getElement() != null ? view.getElement() : view, RunwayVisualIDRegistry.getType(MdAttributeDateTimeNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeInteger_3013Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeInteger_3013, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeIntegerNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeLocalText_3014Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeLocalText_3014, view.getElement() != null ? view.getElement()
        : view, RunwayVisualIDRegistry.getType(MdAttributeLocalTextNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeCharacter_3015Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeCharacter_3015, view.getElement() != null ? view.getElement()
        : view, RunwayVisualIDRegistry.getType(MdAttributeCharacterNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeFloat_3016Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeFloat_3016, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeFloatNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeEnumeration_3017Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeEnumeration_3017, view.getElement() != null ? view.getElement()
        : view, RunwayVisualIDRegistry.getType(MdAttributeEnumerationNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMdAttributeHash_3018Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MdAttributeHash_3018, view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MdAttributeHashNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getUnknownElementText(View view)
  {
    return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
  }

  /**
   * @generated
   */
  private String getUnresolvedDomainElementProxyText(View view)
  {
    return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
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
  public String getDescription(Object anElement)
  {
    return null;
  }

  /**
   * @generated
   */
  private boolean isOwnView(View view)
  {
    return DocumentRootEditPart.MODEL_ID.equals(RunwayVisualIDRegistry.getModelID(view));
  }

}
