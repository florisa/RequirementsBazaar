/*
 * This file is generated by jOOQ.
*/
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RequirementDeveloperMap;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RequirementDeveloperMapRecord extends UpdatableRecordImpl<RequirementDeveloperMapRecord> implements Record4<Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = -738697457;

    /**
     * Setter for <code>reqbaz.requirement_developer_map.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>reqbaz.requirement_developer_map.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>reqbaz.requirement_developer_map.requirement_id</code>.
     */
    public void setRequirementId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>reqbaz.requirement_developer_map.requirement_id</code>.
     */
    public Integer getRequirementId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>reqbaz.requirement_developer_map.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>reqbaz.requirement_developer_map.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>reqbaz.requirement_developer_map.creation_date</code>.
     */
    public void setCreationDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>reqbaz.requirement_developer_map.creation_date</code>.
     */
    public Timestamp getCreationDate() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP.REQUIREMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP.CREATION_DATE;
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
        return getRequirementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RequirementDeveloperMapRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RequirementDeveloperMapRecord value2(Integer value) {
        setRequirementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RequirementDeveloperMapRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RequirementDeveloperMapRecord value4(Timestamp value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RequirementDeveloperMapRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RequirementDeveloperMapRecord
     */
    public RequirementDeveloperMapRecord() {
        super(RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP);
    }

    /**
     * Create a detached, initialised RequirementDeveloperMapRecord
     */
    public RequirementDeveloperMapRecord(Integer id, Integer requirementId, Integer userId, Timestamp creationDate) {
        super(RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP);

        set(0, id);
        set(1, requirementId);
        set(2, userId);
        set(3, creationDate);
    }
}
