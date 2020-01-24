/*
 * This file is generated by jOOQ.
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.Reqbaz;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.CategoryFollowerMapRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class CategoryFollowerMap extends TableImpl<CategoryFollowerMapRecord> {

    private static final long serialVersionUID = -1568253073;

    /**
     * The reference instance of <code>reqbaz.category_follower_map</code>
     */
    public static final CategoryFollowerMap CATEGORY_FOLLOWER_MAP = new CategoryFollowerMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryFollowerMapRecord> getRecordType() {
        return CategoryFollowerMapRecord.class;
    }

    /**
     * The column <code>reqbaz.category_follower_map.id</code>.
     */
    public final TableField<CategoryFollowerMapRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.category_follower_map.category_id</code>.
     */
    public final TableField<CategoryFollowerMapRecord, Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.category_follower_map.user_id</code>.
     */
    public final TableField<CategoryFollowerMapRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.category_follower_map.creation_date</code>.
     */
    public final TableField<CategoryFollowerMapRecord, Timestamp> CREATION_DATE = createField("creation_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>reqbaz.category_follower_map</code> table reference
     */
    public CategoryFollowerMap() {
        this("category_follower_map", null);
    }

    /**
     * Create an aliased <code>reqbaz.category_follower_map</code> table reference
     */
    public CategoryFollowerMap(String alias) {
        this(alias, CATEGORY_FOLLOWER_MAP);
    }

    private CategoryFollowerMap(String alias, Table<CategoryFollowerMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private CategoryFollowerMap(String alias, Table<CategoryFollowerMapRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CategoryFollowerMapRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CATEGORY_FOLLOWER_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CategoryFollowerMapRecord> getPrimaryKey() {
        return Keys.KEY_CATEGORY_FOLLOWER_MAP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CategoryFollowerMapRecord>> getKeys() {
        return Arrays.<UniqueKey<CategoryFollowerMapRecord>>asList(Keys.KEY_CATEGORY_FOLLOWER_MAP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CategoryFollowerMapRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CategoryFollowerMapRecord, ?>>asList(Keys.CATEGORY_FOLLOWER_MAP_CATEGORY, Keys.CATEGORY_FOLLOWER_MAP_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryFollowerMap as(String alias) {
        return new CategoryFollowerMap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CategoryFollowerMap rename(String name) {
        return new CategoryFollowerMap(name, null);
    }
}
