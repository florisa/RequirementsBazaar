/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.Reqbaz;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.TagsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Tags extends TableImpl<TagsRecord> {

    private static final long serialVersionUID = 18628785;

    /**
     * The reference instance of <code>reqbaz.tags</code>
     */
    public static final Tags TAGS = new Tags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TagsRecord> getRecordType() {
        return TagsRecord.class;
    }

    /**
     * The column <code>reqbaz.tags.Id</code>.
     */
    public final TableField<TagsRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.tags.Components_Id</code>.
     */
    public final TableField<TagsRecord, Integer> COMPONENTS_ID = createField("Components_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.tags.Requirements_Id</code>.
     */
    public final TableField<TagsRecord, Integer> REQUIREMENTS_ID = createField("Requirements_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>reqbaz.tags</code> table reference
     */
    public Tags() {
        this("tags", null);
    }

    /**
     * Create an aliased <code>reqbaz.tags</code> table reference
     */
    public Tags(String alias) {
        this(alias, TAGS);
    }

    private Tags(String alias, Table<TagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tags(String alias, Table<TagsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Reqbaz.REQBAZ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TagsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TagsRecord> getPrimaryKey() {
        return Keys.KEY_TAGS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TagsRecord>> getKeys() {
        return Arrays.<UniqueKey<TagsRecord>>asList(Keys.KEY_TAGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TagsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TagsRecord, ?>>asList(Keys.TAGS_COMPONENTS, Keys.TAGS_REQUIREMENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tags as(String alias) {
        return new Tags(alias, this);
    }

    /**
     * Rename this table
     */
    public Tags rename(String name) {
        return new Tags(name, null);
    }
}
