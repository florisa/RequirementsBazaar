/*
 * This file is generated by jOOQ.
*/
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class AttachmentRecord extends UpdatableRecordImpl<AttachmentRecord> implements Record10<Integer, Timestamp, Timestamp, Integer, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 888863633;

    /**
     * Setter for <code>reqbaz.attachment.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>reqbaz.attachment.creation_date</code>.
     */
    public void setCreationDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.creation_date</code>.
     */
    public Timestamp getCreationDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>reqbaz.attachment.last_updated_date</code>.
     */
    public void setLastUpdatedDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.last_updated_date</code>.
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>reqbaz.attachment.requirement_id</code>.
     */
    public void setRequirementId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.requirement_id</code>.
     */
    public Integer getRequirementId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>reqbaz.attachment.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>reqbaz.attachment.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>reqbaz.attachment.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>reqbaz.attachment.mime_type</code>.
     */
    public void setMimeType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.mime_type</code>.
     */
    public String getMimeType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>reqbaz.attachment.identifier</code>.
     */
    public void setIdentifier(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.identifier</code>.
     */
    public String getIdentifier() {
        return (String) get(8);
    }

    /**
     * Setter for <code>reqbaz.attachment.file_url</code>.
     */
    public void setFileUrl(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>reqbaz.attachment.file_url</code>.
     */
    public String getFileUrl() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, Integer, Integer, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, Integer, Integer, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Attachment.ATTACHMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Attachment.ATTACHMENT.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Attachment.ATTACHMENT.LAST_UPDATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Attachment.ATTACHMENT.REQUIREMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Attachment.ATTACHMENT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Attachment.ATTACHMENT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Attachment.ATTACHMENT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Attachment.ATTACHMENT.MIME_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Attachment.ATTACHMENT.IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Attachment.ATTACHMENT.FILE_URL;
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
    public Timestamp value2() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLastUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRequirementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMimeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getFileUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value2(Timestamp value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value3(Timestamp value) {
        setLastUpdatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value4(Integer value) {
        setRequirementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value5(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value8(String value) {
        setMimeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value9(String value) {
        setIdentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord value10(String value) {
        setFileUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentRecord values(Integer value1, Timestamp value2, Timestamp value3, Integer value4, Integer value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AttachmentRecord
     */
    public AttachmentRecord() {
        super(Attachment.ATTACHMENT);
    }

    /**
     * Create a detached, initialised AttachmentRecord
     */
    public AttachmentRecord(Integer id, Timestamp creationDate, Timestamp lastUpdatedDate, Integer requirementId, Integer userId, String name, String description, String mimeType, String identifier, String fileUrl) {
        super(Attachment.ATTACHMENT);

        set(0, id);
        set(1, creationDate);
        set(2, lastUpdatedDate);
        set(3, requirementId);
        set(4, userId);
        set(5, name);
        set(6, description);
        set(7, mimeType);
        set(8, identifier);
        set(9, fileUrl);
    }
}
