/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRoleRecord extends org.jooq.impl.UpdatableRecordImpl<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.UserRoleRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 137158928;

	/**
	 * Setter for <code>reqbaz.user_role.Id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>reqbaz.user_role.Id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>reqbaz.user_role.Roles_Id</code>.
	 */
	public void setRolesId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>reqbaz.user_role.Roles_Id</code>.
	 */
	public java.lang.Integer getRolesId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>reqbaz.user_role.Users_Id</code>.
	 */
	public void setUsersId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>reqbaz.user_role.Users_Id</code>.
	 */
	public java.lang.Integer getUsersId() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.UserRole.USER_ROLE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.UserRole.USER_ROLE.ROLES_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.UserRole.USER_ROLE.USERS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getRolesId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getUsersId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRoleRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRoleRecord value2(java.lang.Integer value) {
		setRolesId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRoleRecord value3(java.lang.Integer value) {
		setUsersId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRoleRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRoleRecord
	 */
	public UserRoleRecord() {
		super(de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.UserRole.USER_ROLE);
	}

	/**
	 * Create a detached, initialised UserRoleRecord
	 */
	public UserRoleRecord(java.lang.Integer id, java.lang.Integer rolesId, java.lang.Integer usersId) {
		super(de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.UserRole.USER_ROLE);

		setValue(0, id);
		setValue(1, rolesId);
		setValue(2, usersId);
	}
}
