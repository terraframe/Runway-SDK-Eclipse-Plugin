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
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayElementTypes;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayParserProvider;

/**
 * @generated
 */
public class RunwayNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider,
    ITreePathLabelProvider
{

  /**
   * @generated
   */
  static
  {
    RunwayDiagramEditorPlugin.getInstance().getImageRegistry()
        .put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
    RunwayDiagramEditorPlugin.getInstance().getImageRegistry()
        .put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
  }

  /**
   * @generated
   */
  public void updateLabel(ViewerLabel label, TreePath elementPath)
  {
    Object element = elementPath.getLastSegment();
    if (element instanceof RunwayNavigatorItem
        && !isOwnView( ( (RunwayNavigatorItem) element ).getView()))
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
        return getImage("Navigator?TopLevelNode?runway?MDBusiness", RunwayElementTypes.MDBusiness_2002); //$NON-NLS-1$
      case MDAttributeTextEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MDAttributeText", RunwayElementTypes.MDAttributeText_3019); //$NON-NLS-1$
      case MDAttributeDateEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MDAttributeDate", RunwayElementTypes.MDAttributeDate_3020); //$NON-NLS-1$
      case MDAttributeBlobEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MDAttributeBlob", RunwayElementTypes.MDAttributeBlob_3021); //$NON-NLS-1$
      case MDAttributeLocalCharacterEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeLocalCharacter", RunwayElementTypes.MDAttributeLocalCharacter_3022); //$NON-NLS-1$
      case MDAttributeDoubleEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeDouble", RunwayElementTypes.MDAttributeDouble_3023); //$NON-NLS-1$
      case MDAttributeDecimalEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeDecimal", RunwayElementTypes.MDAttributeDecimal_3024); //$NON-NLS-1$
      case MDAttributeLongEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MDAttributeLong", RunwayElementTypes.MDAttributeLong_3025); //$NON-NLS-1$
      case MDAttributeTimeEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MDAttributeTime", RunwayElementTypes.MDAttributeTime_3026); //$NON-NLS-1$
      case MDAttributeBooleanEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeBoolean", RunwayElementTypes.MDAttributeBoolean_3027); //$NON-NLS-1$
      case MDAttributeNumberEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeNumber", RunwayElementTypes.MDAttributeNumber_3028); //$NON-NLS-1$
      case MDAttributeDateTimeEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeDateTime", RunwayElementTypes.MDAttributeDateTime_3029); //$NON-NLS-1$
      case MDAttributeIntegerEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeInteger", RunwayElementTypes.MDAttributeInteger_3030); //$NON-NLS-1$
      case MDAttributeLocalTextEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeLocalText", RunwayElementTypes.MDAttributeLocalText_3031); //$NON-NLS-1$
      case MDAttributeCharacterEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeCharacter", RunwayElementTypes.MDAttributeCharacter_3032); //$NON-NLS-1$
      case MDAttributeFloatEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeFloat", RunwayElementTypes.MDAttributeFloat_3033); //$NON-NLS-1$
      case MDAttributeEnumerationEditPart.VISUAL_ID:
        return getImage(
            "Navigator?Node?runway?MDAttributeEnumeration", RunwayElementTypes.MDAttributeEnumeration_3034); //$NON-NLS-1$
      case MDAttributeHashEditPart.VISUAL_ID:
        return getImage("Navigator?Node?runway?MDAttributeHash", RunwayElementTypes.MDAttributeHash_3035); //$NON-NLS-1$
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
        return getMDBusiness_2002Text(view);
      case MDAttributeTextEditPart.VISUAL_ID:
        return getMDAttributeText_3019Text(view);
      case MDAttributeDateEditPart.VISUAL_ID:
        return getMDAttributeDate_3020Text(view);
      case MDAttributeBlobEditPart.VISUAL_ID:
        return getMDAttributeBlob_3021Text(view);
      case MDAttributeLocalCharacterEditPart.VISUAL_ID:
        return getMDAttributeLocalCharacter_3022Text(view);
      case MDAttributeDoubleEditPart.VISUAL_ID:
        return getMDAttributeDouble_3023Text(view);
      case MDAttributeDecimalEditPart.VISUAL_ID:
        return getMDAttributeDecimal_3024Text(view);
      case MDAttributeLongEditPart.VISUAL_ID:
        return getMDAttributeLong_3025Text(view);
      case MDAttributeTimeEditPart.VISUAL_ID:
        return getMDAttributeTime_3026Text(view);
      case MDAttributeBooleanEditPart.VISUAL_ID:
        return getMDAttributeBoolean_3027Text(view);
      case MDAttributeNumberEditPart.VISUAL_ID:
        return getMDAttributeNumber_3028Text(view);
      case MDAttributeDateTimeEditPart.VISUAL_ID:
        return getMDAttributeDateTime_3029Text(view);
      case MDAttributeIntegerEditPart.VISUAL_ID:
        return getMDAttributeInteger_3030Text(view);
      case MDAttributeLocalTextEditPart.VISUAL_ID:
        return getMDAttributeLocalText_3031Text(view);
      case MDAttributeCharacterEditPart.VISUAL_ID:
        return getMDAttributeCharacter_3032Text(view);
      case MDAttributeFloatEditPart.VISUAL_ID:
        return getMDAttributeFloat_3033Text(view);
      case MDAttributeEnumerationEditPart.VISUAL_ID:
        return getMDAttributeEnumeration_3034Text(view);
      case MDAttributeHashEditPart.VISUAL_ID:
        return getMDAttributeHash_3035Text(view);
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
  private String getMDBusiness_2002Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDBusiness_2002,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDBusinessClassNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeText_3019Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeText_3019,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeTextNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeDate_3020Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeDate_3020,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeDateNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeBlob_3021Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeBlob_3021,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeBlobNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeLocalCharacter_3022Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeLocalCharacter_3022,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeLocalCharacterNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeDouble_3023Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeDouble_3023,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeDoubleNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeDecimal_3024Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeDecimal_3024,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeDecimalNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeLong_3025Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeLong_3025,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeLongNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeTime_3026Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeTime_3026,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeTimeNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeBoolean_3027Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeBoolean_3027,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeBooleanNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeNumber_3028Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeNumber_3028,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeNumberNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeDateTime_3029Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeDateTime_3029,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeDateTimeNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeInteger_3030Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeInteger_3030,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeIntegerNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeLocalText_3031Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeLocalText_3031,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeLocalTextNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeCharacter_3032Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeCharacter_3032,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeCharacterNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeFloat_3033Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeFloat_3033,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeFloatNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeEnumeration_3034Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeEnumeration_3034,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeEnumerationNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
      return ""; //$NON-NLS-1$
    }
  }

  /**
   * @generated
   */
  private String getMDAttributeHash_3035Text(View view)
  {
    IParser parser = RunwayParserProvider.getParser(RunwayElementTypes.MDAttributeHash_3035,
        view.getElement() != null ? view.getElement() : view,
        RunwayVisualIDRegistry.getType(MDAttributeHashNameEditPart.VISUAL_ID));
    if (parser != null)
    {
      return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement()
          : view), ParserOptions.NONE.intValue());
    }
    else
    {
      RunwayDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
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
