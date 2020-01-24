/*
 * This file is generated by jOOQ.
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Category;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class CategoryRecord extends UpdatableRecordImpl<CategoryRecord> implements Record7<Integer, String, String, Timestamp, Timestamp, Integer, Integer> {

    private static final long serialVersionUID = 1461191440;

    /**
     * Setter for <code>reqbaz.category.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>reqbaz.category.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>reqbaz.category.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>reqbaz.category.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>reqbaz.category.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>reqbaz.category.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>reqbaz.category.creation_date</code>.
     */
    public void setCreationDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>reqbaz.category.creation_date</code>.
     */
    public Timestamp getCreationDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>reqbaz.category.last_updated_date</code>.
     */
    public void setLastUpdatedDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>reqbaz.category.last_updated_date</code>.
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>reqbaz.category.project_id</code>.
     */
    public void setProjectId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>reqbaz.category.project_id</code>.
     */
    public Integer getProjectId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>reqbaz.category.leader_id</code>.
     */
    public void setLeaderId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>reqbaz.category.leader_id</code>.
     */
    public Integer getLeaderId() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, Timestamp, Timestamp, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, Timestamp, Timestamp, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Category.CATEGORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Category.CATEGORY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Category.CATEGORY.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Category.CATEGORY.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Category.CATEGORY.LAST_UPDATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Category.CATEGORY.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Category.CATEGORY.LEADER_ID;
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
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
    public Timestamp value5() {
        return getLastUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLeaderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value4(Timestamp value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value5(Timestamp value) {
        setLastUpdatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value6(Integer value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value7(Integer value) {
        setLeaderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord values(Integer value1, String value2, String value3, Timestamp value4, Timestamp value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CategoryRecord
     */
    public CategoryRecord() {
        super(Category.CATEGORY);
    }

    /**
     * Create a detached, initialised CategoryRecord
     */
    public CategoryRecord(Integer id, String name, String description, Timestamp creationDate, Timestamp lastUpdatedDate, Integer projectId, Integer leaderId) {
        super(Category.CATEGORY);

        set(0, id);
        set(1, name);
        set(2, description);
        set(3, creationDate);
        set(4, lastUpdatedDate);
        set(5, projectId);
        set(6, leaderId);
    }
}
