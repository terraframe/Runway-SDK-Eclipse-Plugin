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
    paletteRoot.add(createMdAttributes2Group());
  }

  /**
   * Creates "General" palette tool group
   * @generated
   */
  private PaletteContainer createGeneral1Group()
  {
    PaletteDrawer paletteContainer = new PaletteDrawer(Messages.General1Group_title);
    paletteContainer.setId("createGeneral1Group"); //$NON-NLS-1$
    paletteContainer.add(createMDBusiness1CreationTool());
    return paletteContainer;
  }

  /**
   * Creates "MdAttributes" palette tool group
   * @generated
   */
  private PaletteContainer createMdAttributes2Group()
  {
    PaletteDrawer paletteContainer = new PaletteDrawer(Messages.MdAttributes2Group_title);
    paletteContainer.setId("createMdAttributes2Group"); //$NON-NLS-1$
    paletteContainer.add(createMdAttributeBlob1CreationTool());
    paletteContainer.add(createMdAttributeBoolean2CreationTool());
    paletteContainer.add(createMdAttributeCharacter3CreationTool());
    paletteContainer.add(createMdAttributeDate4CreationTool());
    paletteContainer.add(createMdAttributeDateTime5CreationTool());
    paletteContainer.add(createMdAttributeDecimal6CreationTool());
    paletteContainer.add(createMdAttributeDouble7CreationTool());
    paletteContainer.add(createMdAttributeEnumeration8CreationTool());
    paletteContainer.add(createMdAttributeFloat9CreationTool());
    paletteContainer.add(createMdAttributeHash10CreationTool());
    paletteContainer.add(createMdAttributeInteger11CreationTool());
    paletteContainer.add(createMdAttributeNumber12CreationTool());
    paletteContainer.add(createMdAttributeStruct13CreationTool());
    paletteContainer.add(createMdAttributeText14CreationTool());
    paletteContainer.add(createMdAttributeTime15CreationTool());
    paletteContainer.add(createMdAttributeLocalCharacter16CreationTool());
    paletteContainer.add(createMdAttributeLocalText17CreationTool());
    paletteContainer.add(createMdAttributeLong18CreationTool());
    return paletteContainer;
  }

  /**
   * @generated
   */
  private ToolEntry createMDBusiness1CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MDBusiness1CreationTool_title, Messages.MDBusiness1CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MDBusiness_2001));
    entry.setId("createMDBusiness1CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MDBusiness_2001));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeBlob1CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeBlob1CreationTool_title, Messages.MdAttributeBlob1CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeBlob_3002));
    entry.setId("createMdAttributeBlob1CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeBlob_3002));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeBoolean2CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeBoolean2CreationTool_title, Messages.MdAttributeBoolean2CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeBoolean_3003));
    entry.setId("createMdAttributeBoolean2CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeBoolean_3003));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeCharacter3CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeCharacter3CreationTool_title, Messages.MdAttributeCharacter3CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeCharacter_3015));
    entry.setId("createMdAttributeCharacter3CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeCharacter_3015));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeDate4CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeDate4CreationTool_title, Messages.MdAttributeDate4CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeDate_3005));
    entry.setId("createMdAttributeDate4CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeDate_3005));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeDateTime5CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeDateTime5CreationTool_title, Messages.MdAttributeDateTime5CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeDateTime_3012));
    entry.setId("createMdAttributeDateTime5CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeDateTime_3012));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeDecimal6CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeDecimal6CreationTool_title, Messages.MdAttributeDecimal6CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeDecimal_3008));
    entry.setId("createMdAttributeDecimal6CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeDecimal_3008));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeDouble7CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeDouble7CreationTool_title, Messages.MdAttributeDouble7CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeDouble_3007));
    entry.setId("createMdAttributeDouble7CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeDouble_3007));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeEnumeration8CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeEnumeration8CreationTool_title, Messages.MdAttributeEnumeration8CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeEnumeration_3017));
    entry.setId("createMdAttributeEnumeration8CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeEnumeration_3017));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeFloat9CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeFloat9CreationTool_title, Messages.MdAttributeFloat9CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeFloat_3016));
    entry.setId("createMdAttributeFloat9CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeFloat_3016));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeHash10CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeHash10CreationTool_title, Messages.MdAttributeHash10CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeHash_3018));
    entry.setId("createMdAttributeHash10CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeHash_3018));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeInteger11CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeInteger11CreationTool_title, Messages.MdAttributeInteger11CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeInteger_3013));
    entry.setId("createMdAttributeInteger11CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeInteger_3013));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeNumber12CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeNumber12CreationTool_title, Messages.MdAttributeNumber12CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeNumber_3011));
    entry.setId("createMdAttributeNumber12CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeNumber_3011));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeStruct13CreationTool()
  {
    ToolEntry entry = new ToolEntry(Messages.MdAttributeStruct13CreationTool_title, Messages.MdAttributeStruct13CreationTool_desc, null, null)
    {
    };
    entry.setId("createMdAttributeStruct13CreationTool"); //$NON-NLS-1$
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeText14CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeText14CreationTool_title, Messages.MdAttributeText14CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeText_3004));
    entry.setId("createMdAttributeText14CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeText_3004));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeTime15CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeTime15CreationTool_title, Messages.MdAttributeTime15CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeTime_3010));
    entry.setId("createMdAttributeTime15CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeTime_3010));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeLocalCharacter16CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeLocalCharacter16CreationTool_title,
        Messages.MdAttributeLocalCharacter16CreationTool_desc, Collections.singletonList(RunwayElementTypes.MdAttributeLocalCharacter_3006));
    entry.setId("createMdAttributeLocalCharacter16CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeLocalCharacter_3006));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeLocalText17CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeLocalText17CreationTool_title, Messages.MdAttributeLocalText17CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeLocalText_3014));
    entry.setId("createMdAttributeLocalText17CreationTool"); //$NON-NLS-1$
    entry.setSmallIcon(RunwayElementTypes.getImageDescriptor(RunwayElementTypes.MdAttributeLocalText_3014));
    entry.setLargeIcon(entry.getSmallIcon());
    return entry;
  }

  /**
   * @generated
   */
  private ToolEntry createMdAttributeLong18CreationTool()
  {
    NodeToolEntry entry = new NodeToolEntry(Messages.MdAttributeLong18CreationTool_title, Messages.MdAttributeLong18CreationTool_desc,
        Collections.singletonList(RunwayElementTypes.MdAttributeLong_3009));
    entry.setId("createMdAttributeLong18CreationTool"); //$NON-NLS-1$
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
