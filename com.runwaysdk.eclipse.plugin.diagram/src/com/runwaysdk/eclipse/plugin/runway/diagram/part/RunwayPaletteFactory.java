package com.runwaysdk.eclipse.plugin.runway.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
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
    NodeToolEntry entry = new NodeToolEntry(Messages.RunwayClass1CreationTool_title, Messages.RunwayClass1CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDBusiness_2001));
    entry.setId("createRunwayClass1CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDBusiness_2001));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createBlob1CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Blob1CreationTool_title, Messages.Blob1CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeBlob_3002));
    entry.setId("createBlob1CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeBlob_3002));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createBoolean2CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Boolean2CreationTool_title, Messages.Boolean2CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeBoolean_3003));
    entry.setId("createBoolean2CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeBoolean_3003));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createCharacter3CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Character3CreationTool_title, Messages.Character3CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeCharacter_3015));
    entry.setId("createCharacter3CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeCharacter_3015));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createDate4CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Date4CreationTool_title, Messages.Date4CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeDate_3005));
    entry.setId("createDate4CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeDate_3005));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createDateTime5CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.DateTime5CreationTool_title, Messages.DateTime5CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeDateTime_3012));
    entry.setId("createDateTime5CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeDateTime_3012));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createDecimal6CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Decimal6CreationTool_title, Messages.Decimal6CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeDecimal_3008));
    entry.setId("createDecimal6CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeDecimal_3008));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createDouble7CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Double7CreationTool_title, Messages.Double7CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeDouble_3007));
    entry.setId("createDouble7CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeDouble_3007));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createEnumeration8CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Enumeration8CreationTool_title, Messages.Enumeration8CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeEnumeration_3017));
    entry.setId("createEnumeration8CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeEnumeration_3017));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createFloat9CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Float9CreationTool_title, Messages.Float9CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeFloat_3016));
    entry.setId("createFloat9CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeFloat_3016));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createHash10CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Hash10CreationTool_title, Messages.Hash10CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeHash_3018));
    entry.setId("createHash10CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeHash_3018));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createInteger11CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Integer11CreationTool_title, Messages.Integer11CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeInteger_3013));
    entry.setId("createInteger11CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeInteger_3013));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createNumber12CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Number12CreationTool_title, Messages.Number12CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeNumber_3011));
    entry.setId("createNumber12CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeNumber_3011));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createStruct13CreationTool()
  {
    ToolEntry entry = new ToolEntry(Messages.Struct13CreationTool_title, Messages.Struct13CreationTool_desc, null, null)
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
    NodeToolEntry entry = new NodeToolEntry(Messages.Text14CreationTool_title, Messages.Text14CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeText_3004));
    entry.setId("createText14CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeText_3004));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createTime15CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Time15CreationTool_title, Messages.Time15CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeTime_3010));
    entry.setId("createTime15CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeTime_3010));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createCharacter16CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Character16CreationTool_title, Messages.Character16CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeLocalCharacter_3006));
    entry.setId("createCharacter16CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeLocalCharacter_3006));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createText17CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Text17CreationTool_title, Messages.Text17CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeLocalText_3014));
    entry.setId("createText17CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeLocalText_3014));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createLong18CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.Long18CreationTool_title, Messages.Long18CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeLong_3009));
    entry.setId("createLong18CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeLong_3009));
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
