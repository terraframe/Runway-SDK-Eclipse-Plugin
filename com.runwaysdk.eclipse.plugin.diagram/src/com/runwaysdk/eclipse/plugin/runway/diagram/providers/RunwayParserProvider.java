package com.runwaysdk.eclipse.plugin.runway.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBlobNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBooleanNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDecimalNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDoubleNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeEnumerationNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeFloatNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeHashNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeIntegerNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLongNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeNumberNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessClassNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.parsers.MessageFormatParser;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry;

/**
 * @generated
 */
public class RunwayParserProvider extends AbstractProvider implements IParserProvider
{

  /**
   * @generated
   */
  private IParser mDBusinessClassName_5037Parser;

  /**
   * @generated
   */
  private IParser getMDBusinessClassName_5037Parser()
  {
    if (mDBusinessClassName_5037Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDBusiness_ClassName() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDBusinessClassName_5037Parser = parser;
    }
    return mDBusinessClassName_5037Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeTextName_5020Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeTextName_5020Parser()
  {
    if (mDAttributeTextName_5020Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeTextName_5020Parser = parser;
    }
    return mDAttributeTextName_5020Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeDateName_5021Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeDateName_5021Parser()
  {
    if (mDAttributeDateName_5021Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeDateName_5021Parser = parser;
    }
    return mDAttributeDateName_5021Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeBlobName_5022Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeBlobName_5022Parser()
  {
    if (mDAttributeBlobName_5022Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeBlobName_5022Parser = parser;
    }
    return mDAttributeBlobName_5022Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeLocalCharacterName_5023Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeLocalCharacterName_5023Parser()
  {
    if (mDAttributeLocalCharacterName_5023Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeLocalCharacterName_5023Parser = parser;
    }
    return mDAttributeLocalCharacterName_5023Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeDoubleName_5024Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeDoubleName_5024Parser()
  {
    if (mDAttributeDoubleName_5024Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeDoubleName_5024Parser = parser;
    }
    return mDAttributeDoubleName_5024Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeDecimalName_5025Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeDecimalName_5025Parser()
  {
    if (mDAttributeDecimalName_5025Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeDecimalName_5025Parser = parser;
    }
    return mDAttributeDecimalName_5025Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeLongName_5026Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeLongName_5026Parser()
  {
    if (mDAttributeLongName_5026Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeLongName_5026Parser = parser;
    }
    return mDAttributeLongName_5026Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeTimeName_5027Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeTimeName_5027Parser()
  {
    if (mDAttributeTimeName_5027Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeTimeName_5027Parser = parser;
    }
    return mDAttributeTimeName_5027Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeBooleanName_5028Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeBooleanName_5028Parser()
  {
    if (mDAttributeBooleanName_5028Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeBooleanName_5028Parser = parser;
    }
    return mDAttributeBooleanName_5028Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeNumberName_5029Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeNumberName_5029Parser()
  {
    if (mDAttributeNumberName_5029Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeNumberName_5029Parser = parser;
    }
    return mDAttributeNumberName_5029Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeDateTimeName_5030Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeDateTimeName_5030Parser()
  {
    if (mDAttributeDateTimeName_5030Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeDateTimeName_5030Parser = parser;
    }
    return mDAttributeDateTimeName_5030Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeIntegerName_5031Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeIntegerName_5031Parser()
  {
    if (mDAttributeIntegerName_5031Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeIntegerName_5031Parser = parser;
    }
    return mDAttributeIntegerName_5031Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeLocalTextName_5032Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeLocalTextName_5032Parser()
  {
    if (mDAttributeLocalTextName_5032Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeLocalTextName_5032Parser = parser;
    }
    return mDAttributeLocalTextName_5032Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeCharacterName_5033Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeCharacterName_5033Parser()
  {
    if (mDAttributeCharacterName_5033Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeCharacterName_5033Parser = parser;
    }
    return mDAttributeCharacterName_5033Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeFloatName_5034Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeFloatName_5034Parser()
  {
    if (mDAttributeFloatName_5034Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeFloatName_5034Parser = parser;
    }
    return mDAttributeFloatName_5034Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeEnumerationName_5035Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeEnumerationName_5035Parser()
  {
    if (mDAttributeEnumerationName_5035Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeEnumerationName_5035Parser = parser;
    }
    return mDAttributeEnumerationName_5035Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeHashName_5036Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeHashName_5036Parser()
  {
    if (mDAttributeHashName_5036Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeHashName_5036Parser = parser;
    }
    return mDAttributeHashName_5036Parser;
  }

  /**
   * @generated
   */
  protected IParser getParser(int visualID)
  {
    switch (visualID)
    {
      case MDBusinessClassNameEditPart.VISUAL_ID:
        return getMDBusinessClassName_5037Parser();
      case MDAttributeTextNameEditPart.VISUAL_ID:
        return getMDAttributeTextName_5020Parser();
      case MDAttributeDateNameEditPart.VISUAL_ID:
        return getMDAttributeDateName_5021Parser();
      case MDAttributeBlobNameEditPart.VISUAL_ID:
        return getMDAttributeBlobName_5022Parser();
      case MDAttributeLocalCharacterNameEditPart.VISUAL_ID:
        return getMDAttributeLocalCharacterName_5023Parser();
      case MDAttributeDoubleNameEditPart.VISUAL_ID:
        return getMDAttributeDoubleName_5024Parser();
      case MDAttributeDecimalNameEditPart.VISUAL_ID:
        return getMDAttributeDecimalName_5025Parser();
      case MDAttributeLongNameEditPart.VISUAL_ID:
        return getMDAttributeLongName_5026Parser();
      case MDAttributeTimeNameEditPart.VISUAL_ID:
        return getMDAttributeTimeName_5027Parser();
      case MDAttributeBooleanNameEditPart.VISUAL_ID:
        return getMDAttributeBooleanName_5028Parser();
      case MDAttributeNumberNameEditPart.VISUAL_ID:
        return getMDAttributeNumberName_5029Parser();
      case MDAttributeDateTimeNameEditPart.VISUAL_ID:
        return getMDAttributeDateTimeName_5030Parser();
      case MDAttributeIntegerNameEditPart.VISUAL_ID:
        return getMDAttributeIntegerName_5031Parser();
      case MDAttributeLocalTextNameEditPart.VISUAL_ID:
        return getMDAttributeLocalTextName_5032Parser();
      case MDAttributeCharacterNameEditPart.VISUAL_ID:
        return getMDAttributeCharacterName_5033Parser();
      case MDAttributeFloatNameEditPart.VISUAL_ID:
        return getMDAttributeFloatName_5034Parser();
      case MDAttributeEnumerationNameEditPart.VISUAL_ID:
        return getMDAttributeEnumerationName_5035Parser();
      case MDAttributeHashNameEditPart.VISUAL_ID:
        return getMDAttributeHashName_5036Parser();
    }
    return null;
  }

  /**
   * Utility method that consults ParserService
   * @generated
   */
  public static IParser getParser(IElementType type, EObject object, String parserHint)
  {
    return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
  }

  /**
   * @generated
   */
  public IParser getParser(IAdaptable hint)
  {
    String vid = (String) hint.getAdapter(String.class);
    if (vid != null)
    {
      return getParser(RunwayVisualIDRegistry.getVisualID(vid));
    }
    View view = (View) hint.getAdapter(View.class);
    if (view != null)
    {
      return getParser(RunwayVisualIDRegistry.getVisualID(view));
    }
    return null;
  }

  /**
   * @generated
   */
  public boolean provides(IOperation operation)
  {
    if (operation instanceof GetParserOperation)
    {
      IAdaptable hint = ( (GetParserOperation) operation ).getHint();
      if (RunwayElementTypes.getElement(hint) == null)
      {
        return false;
      }
      return getParser(hint) != null;
    }
    return false;
  }

  /**
   * @generated
   */
  private static class HintAdapter extends ParserHintAdapter
  {

    /**
     * @generated
     */
    private final IElementType elementType;

    /**
     * @generated
     */
    public HintAdapter(IElementType type, EObject object, String parserHint)
    {
      super(object, parserHint);
      assert type != null;
      elementType = type;
    }

    /**
     * @generated
     */
    public Object getAdapter(Class adapter)
    {
      if (IElementType.class.equals(adapter))
      {
        return elementType;
      }
      return super.getAdapter(adapter);
    }
  }

}
