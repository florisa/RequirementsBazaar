/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RoleRole;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleRoleRecord extends UpdatableRecordImpl<RoleRoleRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -1987588923;

    /**
     * Setter for <code>reqbaz.role_role.Id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>reqbaz.role_role.Id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>reqbaz.role_role.Child_Id</code>.
     */
    public void setChildId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>reqbaz.role_role.Child_Id</code>.
     */
    public Integer getChildId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>reqbaz.role_role.Parent_Id</code>.
     */
    public void setParentId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>reqbaz.role_role.Parent_Id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RoleRole.ROLE_ROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RoleRole.ROLE_ROLE.CHILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RoleRole.ROLE_ROLE.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getChildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoleRecord value2(Integer value) {
        setChildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoleRecord value3(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoleRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleRoleRecord
     */
    public RoleRoleRecord() {
        super(RoleRole.ROLE_ROLE);
    }

    /**
     * Create a detached, initialised RoleRoleRecord
     */
    public RoleRoleRecord(Integer id, Integer childId, Integer parentId) {
        super(RoleRole.ROLE_ROLE);

        set(0, id);
        set(1, childId);
        set(2, parentId);
    }
}
