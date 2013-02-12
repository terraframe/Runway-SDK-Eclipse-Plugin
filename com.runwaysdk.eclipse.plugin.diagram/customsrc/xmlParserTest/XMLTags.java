package xmlParserTest;
/*
import com.runwaysdk.business.rbac.Operation;
import com.runwaysdk.constants.XMLConstants;
*/


/**
 * LOTS OF HACKY WORKAROUNDS 
 * TODO Import additional shit
 * @author armiller5
 *
 */
public interface XMLTags
{
 // public static final String   SCHEMA_TAG                       = "http://runwaysdk.com/schema/" + XMLConstants.DATATYPE_XSD;

  /**
   * The xml tag for the MdIndex type
   */
  public static final String   MD_INDEX_TAG                     = "mdIndex";

  /**
   * The xml tag for an MdAttribute on an MdIndex
   */
  public static final String   INDEX_ATTRIBUTE_TAG              = "attribute";

  /**
   * The name of the xml attribute 'name' of an INDEX_ATTRIBUTE_TAG
   */
  public static final String   INDEX_NAME_ATTRIBUTE             = "name";

  /**
   * The name of the xml attribute 'indexOrder' of an INDEX_ATTRIBUTE_TAG
   */
  public static final String   INDEX_ORDER_ATTRIBUTE            = "indexOrder";

  /**
   * The name of the xml attribute 'entity' of the INDEX_TAG
   */
  public static final String   INDEX_ENTITY_TYPE_ATTRIBUTE      = "type";

  /**
   * The name of the xml attribute 'unqiue' of an INDEX_TAG
   */
  public static final String   INDEX_UNIQUE_ATTRIBUTE           = "unique";

  /**
   * The name of the xml attribute 'active' of an INDEX_TAG
   */
  public static final String   INDEX_ACTIVE_ATTRIBUTE           = "active";

  /**
   * The xml tag for MdBusiness types
   */
  public static final String   MD_BUSINESS_TAG                  = "mdBusiness";

  /**
   * Attributes of the class tag, see datatype.xsd for full description
   */
  public static final String   NAME_ATTRIBUTE                   = "name";

  /**
   * Database column name for the attribute.
   */
  public static final String   COLUMN_ATTRIBUTE                 = "column";

  /**
   * Name of an enumeration item.
   */
  public static final String   ENUM_NAME_ATTRIBUTE              = "name";

  /**
   * The xml name of the name of the display label attribute in the class tag
   */
  public static final String   DISPLAY_LABEL_ATTRIBUTE          = "label";

  /**
   * The xml name of the removable attribute in the class tag
   */
  public static final String   REMOVE_ATTRIBUTE                 = "removable";

  /**
   * The xml name of the description attribute in the class tag
   */
  public static final String   DESCRIPTION_ATTRIBUTE            = "description";

  /**
   * The xml name of the extendable attribute in the class tag
   */
  public static final String   EXTENDABLE_ATTRIBUTE             = "extendable";

  /**
   * The xml name of the abstract attribute in the class tag
   */
  public static final String   ABSTRACT_ATTRIBUTE               = "isAbstract";

  /**
   * The xml name of the extends attribute in the class tag
   */
  public static final String   EXTENDS_ATTRIBUTE                = "extends";

  /**
   * The xml name of the cache algorithm attribute in the class tag
   */
  public static final String   CACHE_ALGORITHM_ATTRIBUTE        = "cacheAlgorithm";

  /**
   * The xml name of the cache size attribute in the class tag
   */
  public static final String   CACHE_SIZE_ATTRIBUTE             = "cacheSize";

  /**
   * The xml name of the everything enumeration of the cache algorithm attribute
   */
  public static final String   EVERYTHING_ENUMERATION           = "everything";

  /**
   * The xml name of the nothing enumeration of the cache algorithm attribute
   */
  public static final String   NOTHING_ENUMERATION              = "nothing";

  /**
   * The xml name of the most recently used enumeration of the cache algorithm
   * attribute
   */
  public static final String   RECENTLY_ENUMERATION             = "most recently used";

  /**
   * The xml name of the unique index enumeration of the index type attribute
   */
  public static final String   UNIQUE_INDEX_ENUMERATION         = "unique index";

  /**
   * The xml name of the non-unique index enumeration of the index type
   * attribute
   */
  public static final String   NON_UNIQUE_INDEX_ENUMERATION     = "non-unique index";

  /**
   * The xml name of the no-index enumeration of the index type attribute
   */
  public static final String   NO_INDEX_ENUMERATION             = "no index";

  /**
   * Element tag names, see datatype.xsd for full description
   */
  public static final String   ATTRIBUTES_TAG                   = "attributes";

  /**
   * The xml tag for an MdAttributeBoolean
   */
  public static final String   BOOLEAN_TAG                      = "boolean";

  /**
   * The xml tag for an MdAttributeCharacter
   */
  public static final String   CHARACTER_TAG                    = "char";

  /**
   * The xml tag for an MdAttributeLocalCharacter
   */
  public static final String   LOCAL_CHARACTER_TAG              = "localChar";

  /**
   * The xml tag for an MdAttributeText
   */
  public static final String   TEXT_TAG                         = "text";

  /**
   * The xml tag for an MdAttributeText
   */
  public static final String   CLOB_TAG                         = "clob";

  /**
   * The xml tag for an MdAttributeLocalText
   */
  public static final String   LOCAL_TEXT_TAG                   = "localText";

  /**
   * The tag attribute for referencing the key of the local struct type that
   * defines all of the local values.
   */
  public static final String   LOCALSTRUCT_ATTRIBUTE            = "localStruct";

  /**
   * The xml tag for an MdAttributeInteger
   */
  public static final String   INTEGER_TAG                      = "integer";

  /**
   * The xml tag for an MdAttributeLong
   */
  public static final String   LONG_TAG                         = "long";

  /**
   * The xml tag for an MdAttributeFloat
   */
  public static final String   FLOAT_TAG                        = "float";

  /**
   * The xml tag for an MdAttributeDouble
   */
  public static final String   DOUBLE_TAG                       = "double";

  /**
   * The xml tag for an MdAttributeDecimal
   */
  public static final String   DECIMAL_TAG                      = "decimal";

  /**
   * The xml tag for an MdAttributeTime
   */
  public static final String   TIME_TAG                         = "time";

  /**
   * The xml tag for an MdAttributeDateTime
   */
  public static final String   DATETIME_TAG                     = "dateTime";

  /**
   * The xml tag for an MdAttributeDate
   */
  public static final String   DATE_TAG                         = "date";

  /**
   * The xml tag for an MdAttributeStruct
   */
  public static final String   STRUCT_TAG                       = "struct";

  /**
   * The xml tag for an MdAttributeReference
   */
  public static final String   REFERENCE_TAG                    = "reference";

  /**
   * The xml tag for an MdAttributeEnumeration
   */
  public static final String   ENUMERATION_TAG                  = "enumeration";

  /**
   * The xml tag for an MdAttributeBlob
   */
  public static final String   BLOB_TAG                         = "blob";

  /**
   * The xml tag for an MdAttributeHash
   */
  public static final String   HASH_TAG                         = "hashEncryption";

  /**
   * The xml name of the MdAttributeFile tag
   */
  public static final String   FILE_TAG                         = "file";

  /**
   * The xml tag for an MdAttributeSymmetric
   */
  public static final String   SYMMETRIC_TAG                    = "symmetricEncryption";

  /**
   * The xml name of the method attribute on a symmetric tag
   */
  public static final String   SYMMETRIC_METHOD_ATTRIBUTE       = "method";

  /**
   * The xml name of the keysize attribute on a symmetric tag
   */
  public static final String   SYMMETRIC_KEYSIZE_ATTRIBUTE      = "keySize";

  /**
   * The xml name of the method attribute on a hash tag
   */
  public static final String   HASH_METHOD_ATTRIBUTE            = "method";

  /**
   * The xml name of the defaultValue attribute on any attribute tag
   */
  public static final String   DEFAULT_VALUE_ATTRIBUTE          = "defaultValue";

  /**
   * The xml name of the defaultValue key attribute on any a reference
   */
  public static final String   DEFAULT_KEY_ATTRIBUTE            = "defaultValueKey";

  /**
   * The xml name of the required attribute on any attribute tag
   */
  public static final String   REQUIRED_ATTRIBUTE               = "required";

  /**
   * Comma delimeted name of dimensions on which this attribute is required
   */
  public static final String   REQUIRED_FOR_DIMENSION_ATTRIBUTE = "requiredForDimension";

  /**
   * The xml name of the indexType attribute on any attribute tag
   */
  public static final String   INDEX_TYPE_ATTRIBUTE             = "indexType";

  /**
   * The xml name of the immutable attribute on any attribute tag
   */
  public static final String   IMMUTABLE_ATTRIBUTE              = "immutable";

  /**
   * The xml name of the reject positive attribute on any number attribute tag
   */
  public static final String   REJECT_POSITIVE_ATTRIBUTE        = "rejectPositive";

  /**
   * The xml name of the reject negative attribute on any number attribute tag
   */
  public static final String   REJECT_NEGATIVE_ATTRIBUTE        = "rejectNegative";

  /**
   * The xml name of the reject zero attribute on any number attribute tag
   */
  public static final String   REJECT_ZERO_ATTRIBUTE            = "rejectZero";

  /**
   * The xml name of the length attribute on any dec attribute tag
   */
  public static final String   LENGTH_ATTRIBUTE                 = "length";

  /**
   * The xml name of the decimal attribute on any dec attribute tag
   */
  public static final String   DECIMAL_ATTRIBUTE                = "decimal";

  /**
   * Attributes of the char tag, see datatype.xsd for full description
   */
  public static final String   SIZE_ATTRIBUTE                   = "size";

  /**
   * Attributes of the boolean tag, see datatype.xsd for full description
   */
  public static final String   POSITIVE_DISPLAY_LABEL_ATTRIBUTE = "positiveLabel";

  /**
   * Attributes of the boolean tag, see datatype.xsd for full description
   */
  public static final String   NEGATIVE_DISPLAY_LABEL_ATTRIBUTE = "negativeLabel";

  /**
   * Attributes of the reference tag, see datatype.xsd for full description
   */
  public static final String   TYPE_ATTRIBUTE                   = "type";

  /**
   * The xml name of the select multiple attribute on MdAttributeEnumeration tag
   */
  public static final String   SELECT_MULTIPLE_ATTRIBUTE        = "selectMultiple";

  /**
   * The xml tag for the MdEnumeration type
   */
  public static final String   MD_ENUMERATION_TAG               = "mdEnumeration";

  /**
   * The xml tag for the includeAll attribute on an MdEnumeration
   */
  public static final String   INCLUDEALL_TAG                   = "includeAll";

  /**
   * The xml tag for a specific instance to be included in the MdEnumeration
   */
  public static final String   ADD_ENUM_ITEM_TAG                = "addEnumItem";

  /**
   * The xml tag for a specific instance to be remove from an MdEnumeration
   */
  public static final String   REMOVE_ENUM_ITEM_TAG             = "removeEnumItem";

  /**
   * The xml name of the id attribute for enumeration_instance and instance tags
   */
  public static final String   ID_ATTRIBUTE                     = "id";

  /**
   * The xml tag for the Business type
   */
  public static final String   OBJECT_TAG                       = "object";

  /**
   * The xml tag for the Relationship type
   */
  public static final String   RELATIONSHIP_TAG                 = "relationship";

  /**
   * The xml tag for an attribute-value pairing of a Business/Relationship type
   */
  public static final String   ATTRIBUTE_TAG                    = "attribute";

  /**
   * The xml tag for an enumeration id selection of a AttributeEnumeration
   */
  public static final String   ATTRIBUTE_ENUMERATION_TAG        = "attributeEnumeration";

  /**
   * The xml tag for an AttributeForiegnObject/AttributeForiegnAttribute
   */
  public static final String   ATTRIBUTE_REFERENCE_TAG          = "attributeReference";

  /**
   * The xml tag for an AttributeComposition
   */
  public static final String   ATTRIBUTE_STRUCT_TAG             = "attributeStruct";

  /**
   * The xml name of the 'attribute' attribute of an instance-value tag
   */
  public static final String   ENTITY_ATTRIBUTE_NAME_ATTRIBUTE  = "name";

  /**
   * The xml name of the value attribute on an instance value tag
   */
  public static final String   ENTITY_ATTRIBUTE_VALUE_ATTRIBUTE = "value";

  /**
   * The xml tag for an MdRelationship
   */
  public static final String   MD_RELATIONSHIP_TAG              = "mdRelationship";

  /**
   * The xml tag for an MdTree
   */
  public static final String   MD_TREE_TAG                      = "mdTree";

  /**
   * The xml tag for an MdGraph
   */
  public static final String   MD_GRAPH_TAG                     = "mdGraph";

  /**
   * The xml name of the parent tag of an MdRelationship
   */
  public static final String   PARENT_TAG                       = "parent";

  /**
   * The xml name of the child tag of an MdRelationship
   */
  public static final String   CHILD_TAG                        = "child";

  /**
   * The xml name of the parent key of a relationship_instance
   */
  public static final String   PARENT_KEY_TAG                   = "parentKey";

  /**
   * The xml name of the child key of a relationship_instance
   */
  public static final String   CHILD_KEY_TAG                    = "childKey";

  /**
   * The xml name of the method attribute on the parent/child method
   */
  public static final String   RELATIONSHIP_METHOD_TAG          = "method";

  /**
   * Attributes of the relationship tag, see datatype.xsd for full description
   */
  public static final String   COMPOSITION_ATTRIBUTE            = "composition";

  /**
   * Attributes of the parent and child tag, see datatype.xsd for full
   * description
   */
  public static final String   CARDINALITY_ATTRIBUTE            = "cardinality";

  /**
   * The xml tag an MdBusiness which extends the EnumerationMaster class
   */
  public static final String   ENUMERATION_MASTER_TAG           = "enumerationMaster";

  /**
   * The xml tag an MdBusiness which is basic
   */
  public static final String   MD_STRUCT_TAG                    = "mdStruct";

  /**
   * The xml tag an MdBusiness which is basic
   */
  public static final String   MD_LOCAL_STRUCT_TAG              = "mdLocalStruct";

  /**
   * The xml tag to define a MdFacade
   */
  public static final String   MD_FACADE_TAG                    = "mdFacade";

  /**
   * The xml tag to define an MdMethod
   */
  public static final String   MD_METHOD_TAG                    = "mdMethod";

  /**
   * The xml tag to define an MdParameter
   */
  public static final String   MD_PARAMETER_TAG                 = "mdParameter";

  /**
   * The xml name of the returnType attribute on MdMethod
   */
  public static final String   METHOD_RETURN_ATTRIBUTE          = "returnType";

  /**
   * The xml name fo the isStatic attribute on MdMethod
   */
  public static final String   METHOD_STATIC_ATTRIBUTE          = "static";

  /**
   * The xml name fo the order attribute on MdParameters
   */
  public static final String   PARAMETER_ORDER_ATTRIBUTE        = "order";

  /**
   * The xml name of the states tag on MdStateMachines
   */
  public static final String   STATES_TAG                       = "states";

  /**
   * The xml name of state tag on a MdStateMachine
   */
  public static final String   STATE_TAG                        = "state";

  /**
   * The xml name of the entry attribute on a state tag
   */
  public static final String   ENTRY_ATTRIBUTE                  = "entry";

  /**
   * The xml name of the transitions tag on MdStateMachine
   */
  public static final String   TRANSITIONS_TAG                  = "transitions";

  /**
   * The xml name of the transition tag on MdStateMachine
   */
  public static final String   TRANSITION_TAG                   = "transition";

  /**
   * The xml name of the sink attribute on the transition tag
   */
  public static final String   SINK_ATTRIBUTE                   = "sink";

  /**
   * The xml name of the source attribute on the transition tag
   */
  public static final String   SOURCE_ATTRIBUTE                 = "source";

  /**
   * The xml name of the default entry choice on the entry attribute
   */
  public static final String   DEFAULT_ENTRY_ENUM               = "default";

  /**
   * The xml name of the entry choice on the entry attribute
   */
  public static final String   ENTRY_ENUM                       = "true";

  /**
   * The xml name of the not entry choice on the entry attribute
   */
  public static final String   NOT_ENTRY_ENUM                   = "false";

  /**
   * The xml name of mdStateMachine tag
   */
  public static final String   MD_STATE_MACHINE_TAG             = "mdStateMachine";

  /**
   * The xml name of the username attribute on the userPermissions tag
   */
  public static final String   USERNAME_ATTRIBUTE               = "userName";

  /**
   * The xml name of the mdBusinessPermission tag
   */
  public static final String   MD_BUSINESS_PERMISSION_TAG       = "mdBusinessPermission";

  public static final String   MD_STRUCT_PERMISSION_TAG         = "mdStructPermission";

  public static final String   MD_UTIL_PERMISSION_TAG           = "mdUtilPermission";

  public static final String   MD_VIEW_PERMISSION_TAG           = "mdViewPermission";

  /**
   * The xml name of the mdRelationshipPermission tag
   */
  public static final String   MD_RELATIONSHIP_PERMISSION_TAG   = "mdRelationshipPermission";

  /**
   * The xml name of the attributePermission tag
   */
  public static final String   ATTRIBUTE_PERMISSION_TAG         = "attributePermission";

  /**
   * The xml name of the operation tag
   */
  public static final String   OPERATION_TAG                    = "operation";

  /**
   * The xml name of the operation tag
   */
  public static final String   OPERATION_DIMENSION_TAG          = "operationForDimension";

  /**
   * The xml name of the stateName attribute on a PERMISSION tag
   */
  public static final String   STATE_NAME_ATTRIBUTE             = "stateName";

  /**
   * The xml name of the statePermission tag
   */
  public static final String   STATE_PERMISSION_TAG             = "statePermission";

  /**
   * The xml name of the childStatePermission tag
   */
  public static final String   CHILD_STATE_PERMISSION_TAG       = "childStatePermission";

  /**
   * The xml name of the parentStatePermission tag
   */
  public static final String   PARENT_STATE_PERMISSION_TAG      = "parentStatePermission";

  /**
   * The xml name of the attributeName attribute on a ATTRIBUTE_PERMISSION tag
   */
  public static final String   PERMISSION_ATTRIBUTE_NAME        = "attributeName";

  /**
   * The xml name of the user tag
   */
  public static final String   USER_TAG                         = "user";

  /**
   * The xml name of the role attribute on role tag
   */
  public static final String   ROLENAME_ATTRIBUTE               = "roleName";

  /**
   * The xml name of the role tag
   */
  public static final String   ROLE_TAG                         = "role";

  /**
   * The xml name of the method name attribute on the method tag
   */
  public static final String   METHOD_NAME_ATTRIBUTE            = "methodName";

  /**
   * The xml name of the method tag
   */
  public static final String   METHOD_TAG                       = "method";

  /**
   * The xml name of the enumerated item tag
   */
  public static final String   ENUMERATED_ITEM_TAG              = "enumeratedItem";

  /**
   * The xml name of the assigned role tag
   */
  public static final String   ASSIGNED_ROLE_TAG                = "assignedRole";

  /**
   * The xml name of the super role tag
   */
  public static final String   SUPER_ROLE_TAG                   = "superRole";

  public static final String   UPDATE_TAG                       = "update";

  public static final String   CREATE_TAG                       = "create";

  public static final String   DELETE_TAG                       = "delete";

  public static final String   KEY_ATTRIBUTE                    = "key";

  public static final String   PERMISSIONS_TAG                  = "permissions";

  public static final String   STUB_SOURCE_TAG                  = "stubSource";

  public static final String   DTO_STUB_SOURCE_TAG              = "dtoStubSource";

  public static final String   QUERY_STUB_SOURCE_TAG            = "queryStubSource";

  public static final String   PUBLISH_ATTRIBUTE                = "publish";

  public static final String   DO_IT_TAG                        = "doIt";

  public static final String   UNDO_IT_TAG                      = "undoIt";

  public static final String   MD_EXCEPTION_TAG                 = "mdException";

  public static final String   MD_PROBLEM_TAG                   = "mdProblem";

  public static final String   MD_INFORMATION_TAG               = "mdInformation";

  public static final String   MD_WARNING_TAG                   = "mdWarning";

  public static final String   MD_UTIL_TAG                      = "mdUtil";

  public static final String   MD_VIEW_TAG                      = "mdView";

  public static final String   GETTER_VISIBILITY_ATTRIBUTE      = "getterVisibility";

  public static final String   SETTER_VISIBILITY_ATTRIBUTE      = "setterVisibility";

  public static final String   PROTECTED_VISIBILITY_ENUMERATION = "protected";

  public static final String   PUBLIC_VISIBILITY_ENUMERATION    = "public";

  public static final String   MESSAGE_ATTRIBUTE                = "message";

  public static final String   METHOD_PERMISSION_NAME_ATTRIBUTE = "methodName";

  public static final String   MD_METHOD_PERMISSION_TAG         = "mdMethodPermission";

  public static final String   MD_FACADE_PERMISSION_TAG         = "mdFacadePermission";

  public static final String   MD_CONTROLLER_TAG                = "mdController";

  public static final String   MD_ACTION_TAG                    = "mdAction";

  public static final String   IS_POST_ATTRIBUTES               = "isPost";

  public static final String   IS_QUERY_ATTRIBUTES              = "isQuery";
  /*

  public static final String   CREATE                           = Operation.CREATE.toString();

  public static final String   READ                             = Operation.READ.toString();

  public static final String   WRITE                            = Operation.WRITE.toString();

  public static final String   DELETE                           = Operation.DELETE.toString();

  public static final String   PROMOTE                          = Operation.PROMOTE.toString();

  public static final String   ADD_PARENT                       = Operation.ADD_PARENT.toString();

  public static final String   ADD_CHILD                        = Operation.ADD_CHILD.toString();

  public static final String   DELETE_PARENT                    = Operation.DELETE_PARENT.toString();

  public static final String   DELETE_CHILD                     = Operation.DELETE_CHILD.toString();

  public static final String   WRITE_PARENT                     = Operation.WRITE_PARENT.toString();

  public static final String   WRITE_CHILD                      = Operation.WRITE_CHILD.toString();

  public static final String   READ_PARENT                      = Operation.READ_PARENT.toString();

  public static final String   READ_CHILD                       = Operation.READ_CHILD.toString();

  public static final String   GRANT                            = Operation.GRANT.toString();

  public static final String   REVOKE                           = Operation.REVOKE.toString();

  public static final String   EXECUTE                          = Operation.EXECUTE.toString();
  */

  public static final String   READ_ALL_ATTRIBUTES              = "READ_ALL_ATTRIBUTES";

  public static final String   WRITE_ALL_ATTRIBUTES             = "WRITE_ALL_ATTRIBUTES";

  public static final String   VIRTUAL_TAG                      = "virtual";

  public static final String   VERSION_TAG                      = "version";

  public static final String   CONCRETE_ATTRIBUTE               = "concrete";

  /**
   * The XML tag for revoking permissions
   */
  public static final String   REVOKE_TAG                       = "revoke";

  /**
   * The XML tag for granting permissions
   */
  public static final String   GRANT_TAG                        = "grant";

  /**
   * List of all tags which might define a type used in a MdMethod or a
   * MdParameter
   */
  public static final String[] TYPE_TAGS                        = { XMLTags.MD_BUSINESS_TAG, XMLTags.MD_STRUCT_TAG, XMLTags.MD_LOCAL_STRUCT_TAG, XMLTags.MD_GRAPH_TAG, XMLTags.MD_RELATIONSHIP_TAG, XMLTags.MD_TREE_TAG, XMLTags.MD_VIEW_TAG, XMLTags.MD_UTIL_TAG, XMLTags.MD_ENUMERATION_TAG };

  public static final String   GENERATE_CONTROLLER              = "generateController";

  public static final String   ENTITY_TABLE                     = "table";

  public static final String   ENUMERATION_TABLE                = "table";

  /*****************************************************
   * GIS Module
   *****************************************************/

  /**
   * The xml tag for an <code>MdAttributePoint</code>
   */
  public static final String   POINT_TAG                        = "point";

  /**
   * The xml tag for an <code>MdAttributeLineString</code>
   */
  public static final String   LINESTRING_TAG                   = "linestring";

  /**
   * The xml tag for an <code>MdAttributePolygon</code>
   */
  public static final String   POLYGON_TAG                      = "polygon";

  /**
   * The xml tag for an <code>MdAttributeMultiPoint</code>
   */
  public static final String   MULTIPOINT_TAG                   = "multipoint";

  /**
   * The xml tag for an <code>MdAttributeMultiLineString</code>
   */
  public static final String   MULTILINESTRING_TAG              = "multilinestring";

  /**
   * The xml tag for an <code>MdAttributeMultiPolygon</code>
   */
  public static final String   MULTIPOLYGON_TAG                 = "multipolygon";

  /**
   * Projection attribute
   */
  public static final String   SRID_ATTRIBUTE                   = "srid";

  /**
   * Projection attribute
   */
  public static final String   DIMENSION_ATTRIBUTE              = "dimension";

  public static final String   TIMESTAMP_TAG                    = "timestamp";

  public static final String   ENFORCE_SITE_MASTER_ATTRIBUTE    = "enforceSiteMaster";

  public static final String   EXPORTED_ATTRIBUTE               = "exported";

  /**
   * Name of attribute to rename MdAttribute definitions
   */
  public static final String   RENAME_ATTRIBUTE                 = "rename";

  /**
   * New key attribute on instance objects
   */
  public static final String   NEW_KEY_ATTRIBUTE                = "newKey";

  public static final String   FORM_NAME                        = "formName";

  public static final String   FORM_MD_CLASS                    = "mdClass";

  public static final String   MD_WEB_FORM_TAG                  = "mdWebForm";

  public static final String   FIELDS_TAG                       = "fields";

  public static final String   GEO_TAG                          = "geo";

  public static final String   MULTI_TERM_TAG                   = "multiTerm";

  public static final String   GRID_TAG                         = "grid";

  public static final String   TERM_TAG                         = "term";

  public static final String   MD_ATTRIBUTE                     = "mdAttribute";

  public static final String   DISPLAY_LENGTH                   = "displayLength";

  public static final String   MAX_LENGTH                       = "maxLength";

  public static final String   UNIQUE                           = "unique";

}
