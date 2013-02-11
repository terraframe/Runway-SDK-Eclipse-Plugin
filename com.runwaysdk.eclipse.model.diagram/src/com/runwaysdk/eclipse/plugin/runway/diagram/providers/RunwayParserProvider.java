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

import com.runwaysdk.eclipse.model.runway.RunwayPackage;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessClassNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBlobNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBooleanNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDecimalNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDoubleNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeEnumerationNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeFloatNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeHashNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeIntegerNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLongNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeNumberNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTimeNameEditPart;
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
  private IParser mDBusinessClassName_5002Parser;

  /**
   * @generated
   */
  private IParser getMDBusinessClassName_5002Parser()
  {
    if (mDBusinessClassName_5002Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDBusiness_ClassName() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mDBusinessClassName_5002Parser = parser;
    }
    return mDBusinessClassName_5002Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeTextName_5005Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeTextName_5005Parser()
  {
    if (mdAttributeTextName_5005Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeTextName_5005Parser = parser;
    }
    return mdAttributeTextName_5005Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeDateName_5006Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeDateName_5006Parser()
  {
    if (mdAttributeDateName_5006Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeDateName_5006Parser = parser;
    }
    return mdAttributeDateName_5006Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeBlobName_5003Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeBlobName_5003Parser()
  {
    if (mdAttributeBlobName_5003Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeBlobName_5003Parser = parser;
    }
    return mdAttributeBlobName_5003Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeLocalCharacterName_5007Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeLocalCharacterName_5007Parser()
  {
    if (mdAttributeLocalCharacterName_5007Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeLocalCharacterName_5007Parser = parser;
    }
    return mdAttributeLocalCharacterName_5007Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeDoubleName_5008Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeDoubleName_5008Parser()
  {
    if (mdAttributeDoubleName_5008Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeDoubleName_5008Parser = parser;
    }
    return mdAttributeDoubleName_5008Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeDecimalName_5009Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeDecimalName_5009Parser()
  {
    if (mdAttributeDecimalName_5009Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeDecimalName_5009Parser = parser;
    }
    return mdAttributeDecimalName_5009Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeLongName_5010Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeLongName_5010Parser()
  {
    if (mdAttributeLongName_5010Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeLongName_5010Parser = parser;
    }
    return mdAttributeLongName_5010Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeTimeName_5011Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeTimeName_5011Parser()
  {
    if (mdAttributeTimeName_5011Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeTimeName_5011Parser = parser;
    }
    return mdAttributeTimeName_5011Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeBooleanName_5004Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeBooleanName_5004Parser()
  {
    if (mdAttributeBooleanName_5004Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeBooleanName_5004Parser = parser;
    }
    return mdAttributeBooleanName_5004Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeNumberName_5012Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeNumberName_5012Parser()
  {
    if (mdAttributeNumberName_5012Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeNumberName_5012Parser = parser;
    }
    return mdAttributeNumberName_5012Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeDateTimeName_5013Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeDateTimeName_5013Parser()
  {
    if (mdAttributeDateTimeName_5013Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeDateTimeName_5013Parser = parser;
    }
    return mdAttributeDateTimeName_5013Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeIntegerName_5014Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeIntegerName_5014Parser()
  {
    if (mdAttributeIntegerName_5014Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeIntegerName_5014Parser = parser;
    }
    return mdAttributeIntegerName_5014Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeLocalTextName_5015Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeLocalTextName_5015Parser()
  {
    if (mdAttributeLocalTextName_5015Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeLocalTextName_5015Parser = parser;
    }
    return mdAttributeLocalTextName_5015Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeCharacterName_5016Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeCharacterName_5016Parser()
  {
    if (mdAttributeCharacterName_5016Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeCharacterName_5016Parser = parser;
    }
    return mdAttributeCharacterName_5016Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeFloatName_5017Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeFloatName_5017Parser()
  {
    if (mdAttributeFloatName_5017Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeFloatName_5017Parser = parser;
    }
    return mdAttributeFloatName_5017Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeEnumerationName_5018Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeEnumerationName_5018Parser()
  {
    if (mdAttributeEnumerationName_5018Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeEnumerationName_5018Parser = parser;
    }
    return mdAttributeEnumerationName_5018Parser;
  }

  /**
   * @generated
   */
  private IParser mdAttributeHashName_5019Parser;

  /**
   * @generated
   */
  private IParser getMdAttributeHashName_5019Parser()
  {
    if (mdAttributeHashName_5019Parser == null)
    {
      EAttribute[] features = new EAttribute[] { RunwayPackage.eINSTANCE.getMDAttribute_Name() };
      MessageFormatParser parser = new MessageFormatParser(features);
      mdAttributeHashName_5019Parser = parser;
    }
    return mdAttributeHashName_5019Parser;
  }

  /**
   * @generated
   */
  protected IParser getParser(int visualID)
  {
    switch (visualID)
    {
      case MDBusinessClassNameEditPart.VISUAL_ID:
        return getMDBusinessClassName_5002Parser();
      case MdAttributeTextNameEditPart.VISUAL_ID:
        return getMdAttributeTextName_5005Parser();
      case MdAttributeDateNameEditPart.VISUAL_ID:
        return getMdAttributeDateName_5006Parser();
      case MdAttributeBlobNameEditPart.VISUAL_ID:
        return getMdAttributeBlobName_5003Parser();
      case MdAttributeLocalCharacterNameEditPart.VISUAL_ID:
        return getMdAttributeLocalCharacterName_5007Parser();
      case MdAttributeDoubleNameEditPart.VISUAL_ID:
        return getMdAttributeDoubleName_5008Parser();
      case MdAttributeDecimalNameEditPart.VISUAL_ID:
        return getMdAttributeDecimalName_5009Parser();
      case MdAttributeLongNameEditPart.VISUAL_ID:
        return getMdAttributeLongName_5010Parser();
      case MdAttributeTimeNameEditPart.VISUAL_ID:
        return getMdAttributeTimeName_5011Parser();
      case MdAttributeBooleanNameEditPart.VISUAL_ID:
        return getMdAttributeBooleanName_5004Parser();
      case MdAttributeNumberNameEditPart.VISUAL_ID:
        return getMdAttributeNumberName_5012Parser();
      case MdAttributeDateTimeNameEditPart.VISUAL_ID:
        return getMdAttributeDateTimeName_5013Parser();
      case MdAttributeIntegerNameEditPart.VISUAL_ID:
        return getMdAttributeIntegerName_5014Parser();
      case MdAttributeLocalTextNameEditPart.VISUAL_ID:
        return getMdAttributeLocalTextName_5015Parser();
      case MdAttributeCharacterNameEditPart.VISUAL_ID:
        return getMdAttributeCharacterName_5016Parser();
      case MdAttributeFloatNameEditPart.VISUAL_ID:
        return getMdAttributeFloatName_5017Parser();
      case MdAttributeEnumerationNameEditPart.VISUAL_ID:
        return getMdAttributeEnumerationName_5018Parser();
      case MdAttributeHashNameEditPart.VISUAL_ID:
        return getMdAttributeHashName_5019Parser();
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
