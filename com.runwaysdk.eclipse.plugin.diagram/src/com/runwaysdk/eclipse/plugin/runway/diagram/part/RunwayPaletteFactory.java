package com.runwaysdk.eclipse.plugin.runway.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayElementTypes;

/**
 * @generated
 */
public class RunwayPaletteFactory
{

  /**
   * @generated
   */
  public void fillPalette(PaletteRoot paletteRoot)
  {
    paletteRoot.add(createGeneral1Group());
    paletteRoot.add(createAttributes2Group());
  }

  /**
   * Creates "General" palette tool group
   * @generated
   */
  private PaletteContainer createGeneral1Group()
  {
    PaletteDrawer paletteContainer = new PaletteDrawer(Messages.General1Group_title);
    paletteContainer.setId("createGeneral1Group"); //$NON-NLS-1$
    paletteContainer.add(createRunwayClass1CreationTool());
    return paletteContainer;
  }

  /**
   * Creates "Attributes" palette tool group
   * @generated
   */
  private PaletteContainer createAttributes2Group()
  {
    PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Attributes2Group_title);
    paletteContainer.setId("createAttributes2Group"); //$NON-NLS-1$
    paletteContainer.add(createBlob1CreationTool());
    paletteContainer.add(createBoolean2CreationTool());
    paletteContainer.add(createCharacter3CreationTool());
    paletteContainer.add(createDate4CreationTool());
    paletteContainer.add(createDateTime5CreationTool());
    paletteContainer.add(createDecimal6CreationTool());
    paletteContainer.add(createDouble7CreationTool());
    paletteContainer.add(createEnumeration8CreationTool());
    paletteContainer.add(createFloat9CreationTool());
    paletteContainer.add(createHash10CreationTool());
    paletteContainer.add(createInteger11CreationTool());
    paletteContainer.add(createNumber12CreationTool());
    paletteContainer.add(createStruct13CreationTool());
    paletteContainer.add(createText14CreationTool());
    paletteContainer.add(createTime15CreationTool());
    paletteContainer.add(createCharacter16CreationTool());
    paletteContainer.add(createText17CreationTool());
    paletteContainer.add(createLong18CreationTool());
    return paletteContainer;
  }

  /**
   * @generated
   */
  private ToolEntry createRunwayClass1CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.RunwayClass1CreationTool_title,
        Messages.RunwayClass1CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDBusiness_2002));
    entry.setId("createRunwayClass1CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDBusiness_2002));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createBlob1CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Blob1CreationTool_title,
        Messages.Blob1CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeBlob_3021));
    entry.setId("createBlob1CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeBlob_3021));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createBoolean2CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Boolean2CreationTool_title,
        Messages.Boolean2CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeBoolean_3027));
    entry.setId("createBoolean2CreationTool"); //$NON-NLS-1$
    entry
        .setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeBoolean_3027));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createCharacter3CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Character3CreationTool_title,
        Messages.Character3CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeCharacter_3032));
    entry.setId("createCharacter3CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes
        .getImageDescriptor(RunwayElementTypes.MDAttributeCharacter_3032));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createDate4CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Date4CreationTool_title,
        Messages.Date4CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeDate_3020));
    entry.setId("createDate4CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeDate_3020));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createDateTime5CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.DateTime5CreationTool_title,
        Messages.DateTime5CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeDateTime_3029));
    entry.setId("createDateTime5CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes
        .getImageDescriptor(RunwayElementTypes.MDAttributeDateTime_3029));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createDecimal6CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Decimal6CreationTool_title,
        Messages.Decimal6CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeDecimal_3024));
    entry.setId("createDecimal6CreationTool"); //$NON-NLS-1$
    entry
        .setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeDecimal_3024));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createDouble7CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Double7CreationTool_title,
        Messages.Double7CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeDouble_3023));
    entry.setId("createDouble7CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeDouble_3023));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createEnumeration8CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Enumeration8CreationTool_title,
        Messages.Enumeration8CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeEnumeration_3034));
    entry.setId("createEnumeration8CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes
        .getImageDescriptor(RunwayElementTypes.MDAttributeEnumeration_3034));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createFloat9CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Float9CreationTool_title,
        Messages.Float9CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeFloat_3033));
    entry.setId("createFloat9CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeFloat_3033));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createHash10CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Hash10CreationTool_title,
        Messages.Hash10CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeHash_3035));
    entry.setId("createHash10CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeHash_3035));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createInteger11CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Integer11CreationTool_title,
        Messages.Integer11CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeInteger_3030));
    entry.setId("createInteger11CreationTool"); //$NON-NLS-1$
    entry
        .setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeInteger_3030));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createNumber12CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Number12CreationTool_title,
        Messages.Number12CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeNumber_3028));
    entry.setId("createNumber12CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeNumber_3028));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createStruct13CreationTool()
  {
    ToolEntry entry = new ToolEntry(Messages.Struct13CreationTool_title,
        Messages.Struct13CreationTool_desc, null, null)
    {
    };
    entry.setId("createStruct13CreationTool"); //$NON-NLS-1$
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createText14CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Text14CreationTool_title,
        Messages.Text14CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeText_3019));
    entry.setId("createText14CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeText_3019));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createTime15CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Time15CreationTool_title,
        Messages.Time15CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeTime_3026));
    entry.setId("createTime15CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeTime_3026));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createCharacter16CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Character16CreationTool_title,
        Messages.Character16CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeLocalCharacter_3022));
    entry.setId("createCharacter16CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes
        .getImageDescriptor(RunwayElementTypes.MDAttributeLocalCharacter_3022));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createText17CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Text17CreationTool_title,
        Messages.Text17CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeLocalText_3031));
    entry.setId("createText17CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes
        .getImageDescriptor(RunwayElementTypes.MDAttributeLocalText_3031));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createLong18CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Long18CreationTool_title,
        Messages.Long18CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDAttributeLong_3025));
    entry.setId("createLong18CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDAttributeLong_3025));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private static class NodeToolEntry extends ToolEntry
  {

    /**
     * @generated
     */
    private final List<IElementType> elementTypes;

    /**
     * @generated
     */
    private NodeToolEntry(String title, String description, List<IElementType> elementTypes)
    {
      super(title, description, null, null);
      this.elementTypes = elementTypes;
    }

    /**
     * @generated
     */
    public Tool createTool()
    {
      Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
      tool.setProperties(getToolProperties());
      return tool;
    }
  }
}
