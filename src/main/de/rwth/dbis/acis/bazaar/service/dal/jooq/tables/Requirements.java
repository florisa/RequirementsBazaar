/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Requirements extends org.jooq.impl.TableImpl<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord> {

	private static final long serialVersionUID = -1012931434;

	/**
	 * The singleton instance of <code>reqbaz.requirements</code>
	 */
	public static final de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements REQUIREMENTS = new de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord> getRecordType() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord.class;
	}

	/**
	 * The column <code>reqbaz.requirements.Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord, java.lang.Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.requirements.title</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.requirements.description</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>reqbaz.requirements.creation_time</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord, java.sql.Timestamp> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>reqbaz.requirements.Lead_developer_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord, java.lang.Integer> LEAD_DEVELOPER_ID = createField("Lead_developer_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.requirements.Creator_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord, java.lang.Integer> CREATOR_ID = createField("Creator_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.requirements.Project_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord, java.lang.Integer> PROJECT_ID = createField("Project_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>reqbaz.requirements</code> table reference
	 */
	public Requirements() {
		this("requirements", null);
	}

	/**
	 * Create an aliased <code>reqbaz.requirements</code> table reference
	 */
	public Requirements(java.lang.String alias) {
		this(alias, de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements.REQUIREMENTS);
	}

	private Requirements(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Requirements(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.rwth.dbis.acis.bazaar.service.dal.jooq.Reqbaz.REQBAZ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord, java.lang.Integer> getIdentity() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.IDENTITY_REQUIREMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord> getPrimaryKey() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord>>asList(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements as(java.lang.String alias) {
		return new de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements rename(java.lang.String name) {
		return new de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements(name, null);
	}
}
