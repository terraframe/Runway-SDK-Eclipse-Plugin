package com.runwaysdk.eclipse.plugin.runway.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeBlobCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeBooleanCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeCharacterCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeDateCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeDateTimeCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeDecimalCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeDoubleCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeEnumerationCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeFloatCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeHashCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeIntegerCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeLocalCharacterCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeLocalTextCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeLongCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeNumberCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeTextCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MdAttributeTimeCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayElementTypes;

/**
 * @generated
 */
public class MDBusinessMdBusinessCompartmentItemSemanticEditPolicy extends RunwayBaseItemSemanticEditPolicy
{

  /**
   * @generated
   */
  public MDBusinessMdBusinessCompartmentItemSemanticEditPolicy()
  {
    super(RunwayElementTypes.MDBusiness_2001);
  }

  /**
   * @generated
   */
  protected Command getCreateCommand(CreateElementRequest req)
  {
    if (RunwayElementTypes.MdAttributeText_3004 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeTextCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeDate_3005 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeDateCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeBlob_3002 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeBlobCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeLocalCharacter_3006 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeLocalCharacterCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeDouble_3007 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeDoubleCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeDecimal_3008 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeDecimalCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeLong_3009 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeLongCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeTime_3010 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeTimeCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeBoolean_3003 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeBooleanCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeNumber_3011 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeNumberCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeDateTime_3012 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeDateTimeCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeInteger_3013 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeIntegerCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeLocalText_3014 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeLocalTextCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeCharacter_3015 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeCharacterCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeFloat_3016 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeFloatCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeEnumeration_3017 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeEnumerationCreateCommand(req));
    }
    if (RunwayElementTypes.MdAttributeHash_3018 == req.getElementType())
    {
      return getGEFWrapper(new MdAttributeHashCreateCommand(req));
    }
    return super.getCreateCommand(req);
  }

}
