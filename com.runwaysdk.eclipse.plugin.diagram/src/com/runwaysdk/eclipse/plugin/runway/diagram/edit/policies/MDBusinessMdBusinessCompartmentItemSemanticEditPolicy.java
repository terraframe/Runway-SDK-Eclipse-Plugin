package com.runwaysdk.eclipse.plugin.runway.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeBlobCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeBooleanCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeCharacterCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeDateCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeDateTimeCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeDecimalCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeDoubleCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeEnumerationCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeFloatCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeHashCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeIntegerCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeLocalCharacterCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeLocalTextCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeLongCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeNumberCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeTextCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDAttributeTimeCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayElementTypes;

/**
 * @generated
 */
public class MDBusinessMdBusinessCompartmentItemSemanticEditPolicy extends
    RunwayBaseItemSemanticEditPolicy
{

  /**
   * @generated
   */
  public MDBusinessMdBusinessCompartmentItemSemanticEditPolicy()
  {
    super(RunwayElementTypes.MDBusiness_2002);
  }

  /**
   * @generated
   */
  protected Command getCreateCommand(CreateElementRequest req)
  {
    if (RunwayElementTypes.MDAttributeText_3019 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeTextCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeDate_3020 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeDateCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeBlob_3021 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeBlobCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeLocalCharacter_3022 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeLocalCharacterCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeDouble_3023 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeDoubleCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeDecimal_3024 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeDecimalCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeLong_3025 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeLongCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeTime_3026 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeTimeCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeBoolean_3027 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeBooleanCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeNumber_3028 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeNumberCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeDateTime_3029 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeDateTimeCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeInteger_3030 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeIntegerCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeLocalText_3031 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeLocalTextCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeCharacter_3032 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeCharacterCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeFloat_3033 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeFloatCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeEnumeration_3034 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeEnumerationCreateCommand(req));
    }
    if (RunwayElementTypes.MDAttributeHash_3035 == req.getElementType())
    {
      return getGEFWrapper(new MDAttributeHashCreateCommand(req));
    }
    return super.getCreateCommand(req);
  }

}
