/*
 * This file is generated by jOOQ.
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
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
public class Reqbaz extends SchemaImpl {

    private static final long serialVersionUID = 1551044375;

    /**
     * The reference instance of <code>reqbaz</code>
     */
    public static final Reqbaz REQBAZ = new Reqbaz();

    /**
     * The table <code>reqbaz.attachment</code>.
     */
    public final Attachment ATTACHMENT = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachment.ATTACHMENT;

    /**
     * The table <code>reqbaz.category</code>.
     */
    public final Category CATEGORY = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Category.CATEGORY;

    /**
     * The table <code>reqbaz.category_follower_map</code>.
     */
    public final CategoryFollowerMap CATEGORY_FOLLOWER_MAP = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.CategoryFollowerMap.CATEGORY_FOLLOWER_MAP;

    /**
     * The table <code>reqbaz.comment</code>.
     */
    public final Comment COMMENT = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Comment.COMMENT;

    /**
     * The table <code>reqbaz.privilege</code>.
     */
    public final Privilege PRIVILEGE = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Privilege.PRIVILEGE;

    /**
     * The table <code>reqbaz.project</code>.
     */
    public final Project PROJECT = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Project.PROJECT;

    /**
     * The table <code>reqbaz.project_follower_map</code>.
     */
    public final ProjectFollowerMap PROJECT_FOLLOWER_MAP = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.ProjectFollowerMap.PROJECT_FOLLOWER_MAP;

    /**
     * The table <code>reqbaz.requirement</code>.
     */
    public final Requirement REQUIREMENT = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirement.REQUIREMENT;

    /**
     * The table <code>reqbaz.requirement_category_map</code>.
     */
    public final RequirementCategoryMap REQUIREMENT_CATEGORY_MAP = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP;

    /**
     * The table <code>reqbaz.requirement_developer_map</code>.
     */
    public final RequirementDeveloperMap REQUIREMENT_DEVELOPER_MAP = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP;

    /**
     * The table <code>reqbaz.requirement_follower_map</code>.
     */
    public final RequirementFollowerMap REQUIREMENT_FOLLOWER_MAP = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP;

    /**
     * The table <code>reqbaz.role</code>.
     */
    public final Role ROLE = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Role.ROLE;

    /**
     * The table <code>reqbaz.role_privilege_map</code>.
     */
    public final RolePrivilegeMap ROLE_PRIVILEGE_MAP = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RolePrivilegeMap.ROLE_PRIVILEGE_MAP;

    /**
     * The table <code>reqbaz.role_role_map</code>.
     */
    public final RoleRoleMap ROLE_ROLE_MAP = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RoleRoleMap.ROLE_ROLE_MAP;

    /**
     * The table <code>reqbaz.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>reqbaz.user</code>.
     */
    public final User USER = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.User.USER;

    /**
     * The table <code>reqbaz.user_role_map</code>.
     */
    public final UserRoleMap USER_ROLE_MAP = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.UserRoleMap.USER_ROLE_MAP;

    /**
     * The table <code>reqbaz.vote</code>.
     */
    public final Vote VOTE = de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Vote.VOTE;

    /**
     * No further instances allowed
     */
    private Reqbaz() {
        super("reqbaz", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
                Attachment.ATTACHMENT,
                Category.CATEGORY,
                CategoryFollowerMap.CATEGORY_FOLLOWER_MAP,
                Comment.COMMENT,
                Privilege.PRIVILEGE,
                Project.PROJECT,
                ProjectFollowerMap.PROJECT_FOLLOWER_MAP,
                Requirement.REQUIREMENT,
                RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP,
                RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP,
                RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP,
                Role.ROLE,
                RolePrivilegeMap.ROLE_PRIVILEGE_MAP,
                RoleRoleMap.ROLE_ROLE_MAP,
                SchemaVersion.SCHEMA_VERSION,
                User.USER,
                UserRoleMap.USER_ROLE_MAP,
                Vote.VOTE);
    }
}
