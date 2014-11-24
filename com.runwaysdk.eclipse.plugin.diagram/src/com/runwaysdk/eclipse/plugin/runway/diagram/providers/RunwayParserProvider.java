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
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessNameEditPart;
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
  private IParser mDBusinessName_5055Parser;

  /**
   * @generated
   */
  private IParser getMDBusinessName_5055Parser()
  {
    if (mDBusinessName_5055Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDType_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDBusinessName_5055Parser = parser;
    }
    return mDBusinessName_5055Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeTextName_5038Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeTextName_5038Parser()
  {
    if (mDAttributeTextName_5038Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeTextName_5038Parser = parser;
    }
    return mDAttributeTextName_5038Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeDateName_5039Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeDateName_5039Parser()
  {
    if (mDAttributeDateName_5039Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeDateName_5039Parser = parser;
    }
    return mDAttributeDateName_5039Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeBlobName_5040Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeBlobName_5040Parser()
  {
    if (mDAttributeBlobName_5040Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeBlobName_5040Parser = parser;
    }
    return mDAttributeBlobName_5040Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeLocalCharacterName_5041Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeLocalCharacterName_5041Parser()
  {
    if (mDAttributeLocalCharacterName_5041Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeLocalCharacterName_5041Parser = parser;
    }
    return mDAttributeLocalCharacterName_5041Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeDoubleName_5042Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeDoubleName_5042Parser()
  {
    if (mDAttributeDoubleName_5042Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeDoubleName_5042Parser = parser;
    }
    return mDAttributeDoubleName_5042Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeDecimalName_5043Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeDecimalName_5043Parser()
  {
    if (mDAttributeDecimalName_5043Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeDecimalName_5043Parser = parser;
    }
    return mDAttributeDecimalName_5043Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeLongName_5044Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeLongName_5044Parser()
  {
    if (mDAttributeLongName_5044Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeLongName_5044Parser = parser;
    }
    return mDAttributeLongName_5044Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeTimeName_5045Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeTimeName_5045Parser()
  {
    if (mDAttributeTimeName_5045Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeTimeName_5045Parser = parser;
    }
    return mDAttributeTimeName_5045Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeBooleanName_5046Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeBooleanName_5046Parser()
  {
    if (mDAttributeBooleanName_5046Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeBooleanName_5046Parser = parser;
    }
    return mDAttributeBooleanName_5046Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeNumberName_5047Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeNumberName_5047Parser()
  {
    if (mDAttributeNumberName_5047Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeNumberName_5047Parser = parser;
    }
    return mDAttributeNumberName_5047Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeDateTimeName_5048Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeDateTimeName_5048Parser()
  {
    if (mDAttributeDateTimeName_5048Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeDateTimeName_5048Parser = parser;
    }
    return mDAttributeDateTimeName_5048Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeIntegerName_5049Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeIntegerName_5049Parser()
  {
    if (mDAttributeIntegerName_5049Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeIntegerName_5049Parser = parser;
    }
    return mDAttributeIntegerName_5049Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeLocalTextName_5050Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeLocalTextName_5050Parser()
  {
    if (mDAttributeLocalTextName_5050Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeLocalTextName_5050Parser = parser;
    }
    return mDAttributeLocalTextName_5050Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeCharacterName_5051Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeCharacterName_5051Parser()
  {
    if (mDAttributeCharacterName_5051Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeCharacterName_5051Parser = parser;
    }
    return mDAttributeCharacterName_5051Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeFloatName_5052Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeFloatName_5052Parser()
  {
    if (mDAttributeFloatName_5052Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeFloatName_5052Parser = parser;
    }
    return mDAttributeFloatName_5052Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeEnumerationName_5053Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeEnumerationName_5053Parser()
  {
    if (mDAttributeEnumerationName_5053Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeEnumerationName_5053Parser = parser;
    }
    return mDAttributeEnumerationName_5053Parser;
  }

  /**
   * @generated
   */
  private IParser mDAttributeHashName_5054Parser;

  /**
   * @generated
   */
  private IParser getMDAttributeHashName_5054Parser()
  {
    if (mDAttributeHashName_5054Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDAttributeHashName_5054Parser = parser;
    }
    return mDAttributeHashName_5054Parser;
  }

  /**
   * @generated
   */
  protected IParser getParser(int visualID)
  {
    switch (visualID)
    {
      case MDBusinessNameEditPart.VISUAL_ID:
        return getMDBusinessName_5055Parser();
      case MDAttributeTextNameEditPart.VISUAL_ID:
        return getMDAttributeTextName_5038Parser();
      case MDAttributeDateNameEditPart.VISUAL_ID:
        return getMDAttributeDateName_5039Parser();
      case MDAttributeBlobNameEditPart.VISUAL_ID:
        return getMDAttributeBlobName_5040Parser();
      case MDAttributeLocalCharacterNameEditPart.VISUAL_ID:
        return getMDAttributeLocalCharacterName_5041Parser();
      case MDAttributeDoubleNameEditPart.VISUAL_ID:
        return getMDAttributeDoubleName_5042Parser();
      case MDAttributeDecimalNameEditPart.VISUAL_ID:
        return getMDAttributeDecimalName_5043Parser();
      case MDAttributeLongNameEditPart.VISUAL_ID:
        return getMDAttributeLongName_5044Parser();
      case MDAttributeTimeNameEditPart.VISUAL_ID:
        return getMDAttributeTimeName_5045Parser();
      case MDAttributeBooleanNameEditPart.VISUAL_ID:
        return getMDAttributeBooleanName_5046Parser();
      case MDAttributeNumberNameEditPart.VISUAL_ID:
        return getMDAttributeNumberName_5047Parser();
      case MDAttributeDateTimeNameEditPart.VISUAL_ID:
        return getMDAttributeDateTimeName_5048Parser();
      case MDAttributeIntegerNameEditPart.VISUAL_ID:
        return getMDAttributeIntegerName_5049Parser();
      case MDAttributeLocalTextNameEditPart.VISUAL_ID:
        return getMDAttributeLocalTextName_5050Parser();
      case MDAttributeCharacterNameEditPart.VISUAL_ID:
        return getMDAttributeCharacterName_5051Parser();
      case MDAttributeFloatNameEditPart.VISUAL_ID:
        return getMDAttributeFloatName_5052Parser();
      case MDAttributeEnumerationNameEditPart.VISUAL_ID:
        return getMDAttributeEnumerationName_5053Parser();
      case MDAttributeHashNameEditPart.VISUAL_ID:
        return getMDAttributeHashName_5054Parser();
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
