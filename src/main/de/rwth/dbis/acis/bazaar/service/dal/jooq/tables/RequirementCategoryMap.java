/*
 * This file is generated by jOOQ.
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.Reqbaz;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementCategoryMapRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class RequirementCategoryMap extends TableImpl<RequirementCategoryMapRecord> {

    private static final long serialVersionUID = -1083456567;

    /**
     * The reference instance of <code>reqbaz.requirement_category_map</code>
     */
    public static final RequirementCategoryMap REQUIREMENT_CATEGORY_MAP = new RequirementCategoryMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RequirementCategoryMapRecord> getRecordType() {
        return RequirementCategoryMapRecord.class;
    }

    /**
     * The column <code>reqbaz.requirement_category_map.id</code>.
     */
    public final TableField<RequirementCategoryMapRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.requirement_category_map.category_id</code>.
     */
    public final TableField<RequirementCategoryMapRecord, Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.requirement_category_map.requirement_id</code>.
     */
    public final TableField<RequirementCategoryMapRecord, Integer> REQUIREMENT_ID = createField("requirement_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>reqbaz.requirement_category_map</code> table reference
     */
    public RequirementCategoryMap() {
        this("requirement_category_map", null);
    }

    /**
     * Create an aliased <code>reqbaz.requirement_category_map</code> table reference
     */
    public RequirementCategoryMap(String alias) {
        this(alias, REQUIREMENT_CATEGORY_MAP);
    }

    private RequirementCategoryMap(String alias, Table<RequirementCategoryMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private RequirementCategoryMap(String alias, Table<RequirementCategoryMapRecord> aliased, Field<?>[] parameters) {
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
    public Identity<RequirementCategoryMapRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REQUIREMENT_CATEGORY_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RequirementCategoryMapRecord> getPrimaryKey() {
        return Keys.KEY_REQUIREMENT_CATEGORY_MAP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RequirementCategoryMapRecord>> getKeys() {
        return Arrays.<UniqueKey<RequirementCategoryMapRecord>>asList(Keys.KEY_REQUIREMENT_CATEGORY_MAP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RequirementCategoryMapRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RequirementCategoryMapRecord, ?>>asList(Keys.REQUIREMENT_CATEGORY_MAP_CATEGORY, Keys.REQUIREMENT_CATEGORY_MAP_REQUIREMENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RequirementCategoryMap as(String alias) {
        return new RequirementCategoryMap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RequirementCategoryMap rename(String name) {
        return new RequirementCategoryMap(name, null);
    }
}
