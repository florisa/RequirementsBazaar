/*
 * This file is generated by jOOQ.
*/
package de.rwth.dbis.acis.bazaar.service.dal.jooq;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachment;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Category;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.CategoryFollowerMap;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Comment;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.PersonalisationData;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Privilege;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Project;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.ProjectFollowerMap;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirement;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RequirementCategoryMap;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RequirementDeveloperMap;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RequirementFollowerMap;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Role;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RolePrivilegeMap;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RoleRoleMap;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.SchemaVersion;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.User;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.UserRoleMap;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Vote;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.CategoryFollowerMapRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.CategoryRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.CommentRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.PersonalisationDataRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.PrivilegeRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectFollowerMapRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementCategoryMapRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementDeveloperMapRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementFollowerMapRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RolePrivilegeMapRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RoleRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RoleRoleMapRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.SchemaVersionRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.UserRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.UserRoleMapRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.VoteRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>reqbaz</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AttachmentRecord, Integer> IDENTITY_ATTACHMENT = Identities0.IDENTITY_ATTACHMENT;
    public static final Identity<CategoryRecord, Integer> IDENTITY_CATEGORY = Identities0.IDENTITY_CATEGORY;
    public static final Identity<CategoryFollowerMapRecord, Integer> IDENTITY_CATEGORY_FOLLOWER_MAP = Identities0.IDENTITY_CATEGORY_FOLLOWER_MAP;
    public static final Identity<CommentRecord, Integer> IDENTITY_COMMENT = Identities0.IDENTITY_COMMENT;
    public static final Identity<PersonalisationDataRecord, Integer> IDENTITY_PERSONALISATION_DATA = Identities0.IDENTITY_PERSONALISATION_DATA;
    public static final Identity<PrivilegeRecord, Integer> IDENTITY_PRIVILEGE = Identities0.IDENTITY_PRIVILEGE;
    public static final Identity<ProjectRecord, Integer> IDENTITY_PROJECT = Identities0.IDENTITY_PROJECT;
    public static final Identity<ProjectFollowerMapRecord, Integer> IDENTITY_PROJECT_FOLLOWER_MAP = Identities0.IDENTITY_PROJECT_FOLLOWER_MAP;
    public static final Identity<RequirementRecord, Integer> IDENTITY_REQUIREMENT = Identities0.IDENTITY_REQUIREMENT;
    public static final Identity<RequirementCategoryMapRecord, Integer> IDENTITY_REQUIREMENT_CATEGORY_MAP = Identities0.IDENTITY_REQUIREMENT_CATEGORY_MAP;
    public static final Identity<RequirementDeveloperMapRecord, Integer> IDENTITY_REQUIREMENT_DEVELOPER_MAP = Identities0.IDENTITY_REQUIREMENT_DEVELOPER_MAP;
    public static final Identity<RequirementFollowerMapRecord, Integer> IDENTITY_REQUIREMENT_FOLLOWER_MAP = Identities0.IDENTITY_REQUIREMENT_FOLLOWER_MAP;
    public static final Identity<RoleRecord, Integer> IDENTITY_ROLE = Identities0.IDENTITY_ROLE;
    public static final Identity<RolePrivilegeMapRecord, Integer> IDENTITY_ROLE_PRIVILEGE_MAP = Identities0.IDENTITY_ROLE_PRIVILEGE_MAP;
    public static final Identity<RoleRoleMapRecord, Integer> IDENTITY_ROLE_ROLE_MAP = Identities0.IDENTITY_ROLE_ROLE_MAP;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;
    public static final Identity<UserRoleMapRecord, Integer> IDENTITY_USER_ROLE_MAP = Identities0.IDENTITY_USER_ROLE_MAP;
    public static final Identity<VoteRecord, Integer> IDENTITY_VOTE = Identities0.IDENTITY_VOTE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AttachmentRecord> KEY_ATTACHMENT_PRIMARY = UniqueKeys0.KEY_ATTACHMENT_PRIMARY;
    public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = UniqueKeys0.KEY_CATEGORY_PRIMARY;
    public static final UniqueKey<CategoryFollowerMapRecord> KEY_CATEGORY_FOLLOWER_MAP_PRIMARY = UniqueKeys0.KEY_CATEGORY_FOLLOWER_MAP_PRIMARY;
    public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = UniqueKeys0.KEY_COMMENT_PRIMARY;
    public static final UniqueKey<PersonalisationDataRecord> KEY_PERSONALISATION_DATA_PRIMARY = UniqueKeys0.KEY_PERSONALISATION_DATA_PRIMARY;
    public static final UniqueKey<PersonalisationDataRecord> KEY_PERSONALISATION_DATA_PERSONALISATION_KEY = UniqueKeys0.KEY_PERSONALISATION_DATA_PERSONALISATION_KEY;
    public static final UniqueKey<PrivilegeRecord> KEY_PRIVILEGE_PRIMARY = UniqueKeys0.KEY_PRIVILEGE_PRIMARY;
    public static final UniqueKey<ProjectRecord> KEY_PROJECT_PRIMARY = UniqueKeys0.KEY_PROJECT_PRIMARY;
    public static final UniqueKey<ProjectFollowerMapRecord> KEY_PROJECT_FOLLOWER_MAP_PRIMARY = UniqueKeys0.KEY_PROJECT_FOLLOWER_MAP_PRIMARY;
    public static final UniqueKey<RequirementRecord> KEY_REQUIREMENT_PRIMARY = UniqueKeys0.KEY_REQUIREMENT_PRIMARY;
    public static final UniqueKey<RequirementCategoryMapRecord> KEY_REQUIREMENT_CATEGORY_MAP_PRIMARY = UniqueKeys0.KEY_REQUIREMENT_CATEGORY_MAP_PRIMARY;
    public static final UniqueKey<RequirementDeveloperMapRecord> KEY_REQUIREMENT_DEVELOPER_MAP_PRIMARY = UniqueKeys0.KEY_REQUIREMENT_DEVELOPER_MAP_PRIMARY;
    public static final UniqueKey<RequirementFollowerMapRecord> KEY_REQUIREMENT_FOLLOWER_MAP_PRIMARY = UniqueKeys0.KEY_REQUIREMENT_FOLLOWER_MAP_PRIMARY;
    public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIMARY;
    public static final UniqueKey<RoleRecord> KEY_ROLE_ROLE_IDX_1 = UniqueKeys0.KEY_ROLE_ROLE_IDX_1;
    public static final UniqueKey<RolePrivilegeMapRecord> KEY_ROLE_PRIVILEGE_MAP_PRIMARY = UniqueKeys0.KEY_ROLE_PRIVILEGE_MAP_PRIMARY;
    public static final UniqueKey<RoleRoleMapRecord> KEY_ROLE_ROLE_MAP_PRIMARY = UniqueKeys0.KEY_ROLE_ROLE_MAP_PRIMARY;
    public static final UniqueKey<SchemaVersionRecord> KEY_SCHEMA_VERSION_PRIMARY = UniqueKeys0.KEY_SCHEMA_VERSION_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_LAS2PEER_IDX = UniqueKeys0.KEY_USER_LAS2PEER_IDX;
    public static final UniqueKey<UserRoleMapRecord> KEY_USER_ROLE_MAP_PRIMARY = UniqueKeys0.KEY_USER_ROLE_MAP_PRIMARY;
    public static final UniqueKey<VoteRecord> KEY_VOTE_PRIMARY = UniqueKeys0.KEY_VOTE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AttachmentRecord, RequirementRecord> ATTACHMENT_REQUIREMENT = ForeignKeys0.ATTACHMENT_REQUIREMENT;
    public static final ForeignKey<AttachmentRecord, UserRecord> ATTACHMENT_USER = ForeignKeys0.ATTACHMENT_USER;
    public static final ForeignKey<CategoryRecord, ProjectRecord> CATEGORY_PROJECT = ForeignKeys0.CATEGORY_PROJECT;
    public static final ForeignKey<CategoryRecord, UserRecord> CATEGORY_USER = ForeignKeys0.CATEGORY_USER;
    public static final ForeignKey<CategoryFollowerMapRecord, CategoryRecord> CATEGORY_FOLLOWER_MAP_CATEGORY = ForeignKeys0.CATEGORY_FOLLOWER_MAP_CATEGORY;
    public static final ForeignKey<CategoryFollowerMapRecord, UserRecord> CATEGORY_FOLLOWER_MAP_USER = ForeignKeys0.CATEGORY_FOLLOWER_MAP_USER;
    public static final ForeignKey<CommentRecord, RequirementRecord> COMMENT_REQUIREMENT = ForeignKeys0.COMMENT_REQUIREMENT;
    public static final ForeignKey<CommentRecord, UserRecord> COMMENT_USER = ForeignKeys0.COMMENT_USER;
    public static final ForeignKey<CommentRecord, CommentRecord> REPLY_COMMENT = ForeignKeys0.REPLY_COMMENT;
    public static final ForeignKey<PersonalisationDataRecord, UserRecord> PERSONALISATION_USER = ForeignKeys0.PERSONALISATION_USER;
    public static final ForeignKey<ProjectRecord, UserRecord> PROJECT_USER = ForeignKeys0.PROJECT_USER;
    public static final ForeignKey<ProjectRecord, CategoryRecord> PROJECT_CATEGORY = ForeignKeys0.PROJECT_CATEGORY;
    public static final ForeignKey<ProjectFollowerMapRecord, ProjectRecord> PROJECT_FOLLOWER_MAP_PROJECT = ForeignKeys0.PROJECT_FOLLOWER_MAP_PROJECT;
    public static final ForeignKey<ProjectFollowerMapRecord, UserRecord> PROJECT_FOLLOWER_MAP_USER = ForeignKeys0.PROJECT_FOLLOWER_MAP_USER;
    public static final ForeignKey<RequirementRecord, UserRecord> LEAD_DEVELOPER = ForeignKeys0.LEAD_DEVELOPER;
    public static final ForeignKey<RequirementRecord, UserRecord> CREATOR = ForeignKeys0.CREATOR;
    public static final ForeignKey<RequirementRecord, ProjectRecord> REQUIREMENT_PROJECT = ForeignKeys0.REQUIREMENT_PROJECT;
    public static final ForeignKey<RequirementCategoryMapRecord, CategoryRecord> REQUIREMENT_CATEGORY_MAP_CATEGORY = ForeignKeys0.REQUIREMENT_CATEGORY_MAP_CATEGORY;
    public static final ForeignKey<RequirementCategoryMapRecord, RequirementRecord> REQUIREMENT_CATEGORY_MAP_REQUIREMENT = ForeignKeys0.REQUIREMENT_CATEGORY_MAP_REQUIREMENT;
    public static final ForeignKey<RequirementDeveloperMapRecord, RequirementRecord> REQUIREMENT_DEVELOPER_MAP_REQUIREMENT = ForeignKeys0.REQUIREMENT_DEVELOPER_MAP_REQUIREMENT;
    public static final ForeignKey<RequirementDeveloperMapRecord, UserRecord> REQUIREMENT_DEVELOPER_MAP_USER = ForeignKeys0.REQUIREMENT_DEVELOPER_MAP_USER;
    public static final ForeignKey<RequirementFollowerMapRecord, RequirementRecord> REQUIREMENT_FOLLOWER_MAP_REQUIREMENT = ForeignKeys0.REQUIREMENT_FOLLOWER_MAP_REQUIREMENT;
    public static final ForeignKey<RequirementFollowerMapRecord, UserRecord> REQUIREMENT_FOLLOWER_MAP_USER = ForeignKeys0.REQUIREMENT_FOLLOWER_MAP_USER;
    public static final ForeignKey<RolePrivilegeMapRecord, RoleRecord> ROLE_PRIVILEGE_MAP_ROLE = ForeignKeys0.ROLE_PRIVILEGE_MAP_ROLE;
    public static final ForeignKey<RolePrivilegeMapRecord, PrivilegeRecord> ROLE_PRIVILEGE_MAP_PRIVILEGE = ForeignKeys0.ROLE_PRIVILEGE_MAP_PRIVILEGE;
    public static final ForeignKey<RoleRoleMapRecord, RoleRecord> ROLE_ROLE_MAP_CHILD = ForeignKeys0.ROLE_ROLE_MAP_CHILD;
    public static final ForeignKey<RoleRoleMapRecord, RoleRecord> ROLE_ROLE_MAP_PARENT = ForeignKeys0.ROLE_ROLE_MAP_PARENT;
    public static final ForeignKey<UserRoleMapRecord, RoleRecord> USER_ROLE_MAP_ROLE = ForeignKeys0.USER_ROLE_MAP_ROLE;
    public static final ForeignKey<UserRoleMapRecord, UserRecord> USER_ROLE_MAP_USER = ForeignKeys0.USER_ROLE_MAP_USER;
    public static final ForeignKey<VoteRecord, RequirementRecord> VOTE_REQUIREMENT = ForeignKeys0.VOTE_REQUIREMENT;
    public static final ForeignKey<VoteRecord, UserRecord> VOTE_USER = ForeignKeys0.VOTE_USER;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AttachmentRecord, Integer> IDENTITY_ATTACHMENT = createIdentity(Attachment.ATTACHMENT, Attachment.ATTACHMENT.ID);
        public static Identity<CategoryRecord, Integer> IDENTITY_CATEGORY = createIdentity(Category.CATEGORY, Category.CATEGORY.ID);
        public static Identity<CategoryFollowerMapRecord, Integer> IDENTITY_CATEGORY_FOLLOWER_MAP = createIdentity(CategoryFollowerMap.CATEGORY_FOLLOWER_MAP, CategoryFollowerMap.CATEGORY_FOLLOWER_MAP.ID);
        public static Identity<CommentRecord, Integer> IDENTITY_COMMENT = createIdentity(Comment.COMMENT, Comment.COMMENT.ID);
        public static Identity<PersonalisationDataRecord, Integer> IDENTITY_PERSONALISATION_DATA = createIdentity(PersonalisationData.PERSONALISATION_DATA, PersonalisationData.PERSONALISATION_DATA.ID);
        public static Identity<PrivilegeRecord, Integer> IDENTITY_PRIVILEGE = createIdentity(Privilege.PRIVILEGE, Privilege.PRIVILEGE.ID);
        public static Identity<ProjectRecord, Integer> IDENTITY_PROJECT = createIdentity(Project.PROJECT, Project.PROJECT.ID);
        public static Identity<ProjectFollowerMapRecord, Integer> IDENTITY_PROJECT_FOLLOWER_MAP = createIdentity(ProjectFollowerMap.PROJECT_FOLLOWER_MAP, ProjectFollowerMap.PROJECT_FOLLOWER_MAP.ID);
        public static Identity<RequirementRecord, Integer> IDENTITY_REQUIREMENT = createIdentity(Requirement.REQUIREMENT, Requirement.REQUIREMENT.ID);
        public static Identity<RequirementCategoryMapRecord, Integer> IDENTITY_REQUIREMENT_CATEGORY_MAP = createIdentity(RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP, RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP.ID);
        public static Identity<RequirementDeveloperMapRecord, Integer> IDENTITY_REQUIREMENT_DEVELOPER_MAP = createIdentity(RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP, RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP.ID);
        public static Identity<RequirementFollowerMapRecord, Integer> IDENTITY_REQUIREMENT_FOLLOWER_MAP = createIdentity(RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP, RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP.ID);
        public static Identity<RoleRecord, Integer> IDENTITY_ROLE = createIdentity(Role.ROLE, Role.ROLE.ID);
        public static Identity<RolePrivilegeMapRecord, Integer> IDENTITY_ROLE_PRIVILEGE_MAP = createIdentity(RolePrivilegeMap.ROLE_PRIVILEGE_MAP, RolePrivilegeMap.ROLE_PRIVILEGE_MAP.ID);
        public static Identity<RoleRoleMapRecord, Integer> IDENTITY_ROLE_ROLE_MAP = createIdentity(RoleRoleMap.ROLE_ROLE_MAP, RoleRoleMap.ROLE_ROLE_MAP.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
        public static Identity<UserRoleMapRecord, Integer> IDENTITY_USER_ROLE_MAP = createIdentity(UserRoleMap.USER_ROLE_MAP, UserRoleMap.USER_ROLE_MAP.ID);
        public static Identity<VoteRecord, Integer> IDENTITY_VOTE = createIdentity(Vote.VOTE, Vote.VOTE.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AttachmentRecord> KEY_ATTACHMENT_PRIMARY = createUniqueKey(Attachment.ATTACHMENT, "KEY_attachment_PRIMARY", Attachment.ATTACHMENT.ID);
        public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = createUniqueKey(Category.CATEGORY, "KEY_category_PRIMARY", Category.CATEGORY.ID);
        public static final UniqueKey<CategoryFollowerMapRecord> KEY_CATEGORY_FOLLOWER_MAP_PRIMARY = createUniqueKey(CategoryFollowerMap.CATEGORY_FOLLOWER_MAP, "KEY_category_follower_map_PRIMARY", CategoryFollowerMap.CATEGORY_FOLLOWER_MAP.ID);
        public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = createUniqueKey(Comment.COMMENT, "KEY_comment_PRIMARY", Comment.COMMENT.ID);
        public static final UniqueKey<PersonalisationDataRecord> KEY_PERSONALISATION_DATA_PRIMARY = createUniqueKey(PersonalisationData.PERSONALISATION_DATA, "KEY_personalisation_data_PRIMARY", PersonalisationData.PERSONALISATION_DATA.ID);
        public static final UniqueKey<PersonalisationDataRecord> KEY_PERSONALISATION_DATA_PERSONALISATION_KEY = createUniqueKey(PersonalisationData.PERSONALISATION_DATA, "KEY_personalisation_data_personalisation_key", PersonalisationData.PERSONALISATION_DATA.IDENTIFIER, PersonalisationData.PERSONALISATION_DATA.USER_ID, PersonalisationData.PERSONALISATION_DATA.VERSION);
        public static final UniqueKey<PrivilegeRecord> KEY_PRIVILEGE_PRIMARY = createUniqueKey(Privilege.PRIVILEGE, "KEY_privilege_PRIMARY", Privilege.PRIVILEGE.ID);
        public static final UniqueKey<ProjectRecord> KEY_PROJECT_PRIMARY = createUniqueKey(Project.PROJECT, "KEY_project_PRIMARY", Project.PROJECT.ID);
        public static final UniqueKey<ProjectFollowerMapRecord> KEY_PROJECT_FOLLOWER_MAP_PRIMARY = createUniqueKey(ProjectFollowerMap.PROJECT_FOLLOWER_MAP, "KEY_project_follower_map_PRIMARY", ProjectFollowerMap.PROJECT_FOLLOWER_MAP.ID);
        public static final UniqueKey<RequirementRecord> KEY_REQUIREMENT_PRIMARY = createUniqueKey(Requirement.REQUIREMENT, "KEY_requirement_PRIMARY", Requirement.REQUIREMENT.ID);
        public static final UniqueKey<RequirementCategoryMapRecord> KEY_REQUIREMENT_CATEGORY_MAP_PRIMARY = createUniqueKey(RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP, "KEY_requirement_category_map_PRIMARY", RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP.ID);
        public static final UniqueKey<RequirementDeveloperMapRecord> KEY_REQUIREMENT_DEVELOPER_MAP_PRIMARY = createUniqueKey(RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP, "KEY_requirement_developer_map_PRIMARY", RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP.ID);
        public static final UniqueKey<RequirementFollowerMapRecord> KEY_REQUIREMENT_FOLLOWER_MAP_PRIMARY = createUniqueKey(RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP, "KEY_requirement_follower_map_PRIMARY", RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP.ID);
        public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = createUniqueKey(Role.ROLE, "KEY_role_PRIMARY", Role.ROLE.ID);
        public static final UniqueKey<RoleRecord> KEY_ROLE_ROLE_IDX_1 = createUniqueKey(Role.ROLE, "KEY_role_role_idx_1", Role.ROLE.NAME);
        public static final UniqueKey<RolePrivilegeMapRecord> KEY_ROLE_PRIVILEGE_MAP_PRIMARY = createUniqueKey(RolePrivilegeMap.ROLE_PRIVILEGE_MAP, "KEY_role_privilege_map_PRIMARY", RolePrivilegeMap.ROLE_PRIVILEGE_MAP.ID);
        public static final UniqueKey<RoleRoleMapRecord> KEY_ROLE_ROLE_MAP_PRIMARY = createUniqueKey(RoleRoleMap.ROLE_ROLE_MAP, "KEY_role_role_map_PRIMARY", RoleRoleMap.ROLE_ROLE_MAP.ID);
        public static final UniqueKey<SchemaVersionRecord> KEY_SCHEMA_VERSION_PRIMARY = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "KEY_schema_version_PRIMARY", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_LAS2PEER_IDX = createUniqueKey(User.USER, "KEY_user_las2peer_idx", User.USER.LAS2PEER_ID);
        public static final UniqueKey<UserRoleMapRecord> KEY_USER_ROLE_MAP_PRIMARY = createUniqueKey(UserRoleMap.USER_ROLE_MAP, "KEY_user_role_map_PRIMARY", UserRoleMap.USER_ROLE_MAP.ID);
        public static final UniqueKey<VoteRecord> KEY_VOTE_PRIMARY = createUniqueKey(Vote.VOTE, "KEY_vote_PRIMARY", Vote.VOTE.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AttachmentRecord, RequirementRecord> ATTACHMENT_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENT_PRIMARY, Attachment.ATTACHMENT, "attachment_requirement", Attachment.ATTACHMENT.REQUIREMENT_ID);
        public static final ForeignKey<AttachmentRecord, UserRecord> ATTACHMENT_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, Attachment.ATTACHMENT, "attachment_user", Attachment.ATTACHMENT.USER_ID);
        public static final ForeignKey<CategoryRecord, ProjectRecord> CATEGORY_PROJECT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PROJECT_PRIMARY, Category.CATEGORY, "category_project", Category.CATEGORY.PROJECT_ID);
        public static final ForeignKey<CategoryRecord, UserRecord> CATEGORY_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, Category.CATEGORY, "category_user", Category.CATEGORY.LEADER_ID);
        public static final ForeignKey<CategoryFollowerMapRecord, CategoryRecord> CATEGORY_FOLLOWER_MAP_CATEGORY = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_CATEGORY_PRIMARY, CategoryFollowerMap.CATEGORY_FOLLOWER_MAP, "category_follower_map_category", CategoryFollowerMap.CATEGORY_FOLLOWER_MAP.CATEGORY_ID);
        public static final ForeignKey<CategoryFollowerMapRecord, UserRecord> CATEGORY_FOLLOWER_MAP_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, CategoryFollowerMap.CATEGORY_FOLLOWER_MAP, "category_follower_map_user", CategoryFollowerMap.CATEGORY_FOLLOWER_MAP.USER_ID);
        public static final ForeignKey<CommentRecord, RequirementRecord> COMMENT_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENT_PRIMARY, Comment.COMMENT, "comment_requirement", Comment.COMMENT.REQUIREMENT_ID);
        public static final ForeignKey<CommentRecord, UserRecord> COMMENT_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, Comment.COMMENT, "comment_user", Comment.COMMENT.USER_ID);
        public static final ForeignKey<CommentRecord, CommentRecord> REPLY_COMMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_COMMENT_PRIMARY, Comment.COMMENT, "reply_comment", Comment.COMMENT.REPLY_TO_COMMENT_ID);
        public static final ForeignKey<PersonalisationDataRecord, UserRecord> PERSONALISATION_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, PersonalisationData.PERSONALISATION_DATA, "personalisation_user", PersonalisationData.PERSONALISATION_DATA.USER_ID);
        public static final ForeignKey<ProjectRecord, UserRecord> PROJECT_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, Project.PROJECT, "project_user", Project.PROJECT.LEADER_ID);
        public static final ForeignKey<ProjectRecord, CategoryRecord> PROJECT_CATEGORY = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_CATEGORY_PRIMARY, Project.PROJECT, "project_category", Project.PROJECT.DEFAULT_CATEGORY_ID);
        public static final ForeignKey<ProjectFollowerMapRecord, ProjectRecord> PROJECT_FOLLOWER_MAP_PROJECT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PROJECT_PRIMARY, ProjectFollowerMap.PROJECT_FOLLOWER_MAP, "project_follower_map_project", ProjectFollowerMap.PROJECT_FOLLOWER_MAP.PROJECT_ID);
        public static final ForeignKey<ProjectFollowerMapRecord, UserRecord> PROJECT_FOLLOWER_MAP_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, ProjectFollowerMap.PROJECT_FOLLOWER_MAP, "project_follower_map_user", ProjectFollowerMap.PROJECT_FOLLOWER_MAP.USER_ID);
        public static final ForeignKey<RequirementRecord, UserRecord> LEAD_DEVELOPER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, Requirement.REQUIREMENT, "lead_developer", Requirement.REQUIREMENT.LEAD_DEVELOPER_ID);
        public static final ForeignKey<RequirementRecord, UserRecord> CREATOR = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, Requirement.REQUIREMENT, "creator", Requirement.REQUIREMENT.CREATOR_ID);
        public static final ForeignKey<RequirementRecord, ProjectRecord> REQUIREMENT_PROJECT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PROJECT_PRIMARY, Requirement.REQUIREMENT, "requirement_project", Requirement.REQUIREMENT.PROJECT_ID);
        public static final ForeignKey<RequirementCategoryMapRecord, CategoryRecord> REQUIREMENT_CATEGORY_MAP_CATEGORY = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_CATEGORY_PRIMARY, RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP, "requirement_category_map_category", RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP.CATEGORY_ID);
        public static final ForeignKey<RequirementCategoryMapRecord, RequirementRecord> REQUIREMENT_CATEGORY_MAP_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENT_PRIMARY, RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP, "requirement_category_map_requirement", RequirementCategoryMap.REQUIREMENT_CATEGORY_MAP.REQUIREMENT_ID);
        public static final ForeignKey<RequirementDeveloperMapRecord, RequirementRecord> REQUIREMENT_DEVELOPER_MAP_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENT_PRIMARY, RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP, "requirement_developer_map_requirement", RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP.REQUIREMENT_ID);
        public static final ForeignKey<RequirementDeveloperMapRecord, UserRecord> REQUIREMENT_DEVELOPER_MAP_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP, "requirement_developer_map_user", RequirementDeveloperMap.REQUIREMENT_DEVELOPER_MAP.USER_ID);
        public static final ForeignKey<RequirementFollowerMapRecord, RequirementRecord> REQUIREMENT_FOLLOWER_MAP_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENT_PRIMARY, RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP, "requirement_follower_map_requirement", RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP.REQUIREMENT_ID);
        public static final ForeignKey<RequirementFollowerMapRecord, UserRecord> REQUIREMENT_FOLLOWER_MAP_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP, "requirement_follower_map_user", RequirementFollowerMap.REQUIREMENT_FOLLOWER_MAP.USER_ID);
        public static final ForeignKey<RolePrivilegeMapRecord, RoleRecord> ROLE_PRIVILEGE_MAP_ROLE = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ROLE_PRIMARY, RolePrivilegeMap.ROLE_PRIVILEGE_MAP, "role_privilege_map_role", RolePrivilegeMap.ROLE_PRIVILEGE_MAP.ROLE_ID);
        public static final ForeignKey<RolePrivilegeMapRecord, PrivilegeRecord> ROLE_PRIVILEGE_MAP_PRIVILEGE = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PRIVILEGE_PRIMARY, RolePrivilegeMap.ROLE_PRIVILEGE_MAP, "role_privilege_map_privilege", RolePrivilegeMap.ROLE_PRIVILEGE_MAP.PRIVILEGE_ID);
        public static final ForeignKey<RoleRoleMapRecord, RoleRecord> ROLE_ROLE_MAP_CHILD = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ROLE_PRIMARY, RoleRoleMap.ROLE_ROLE_MAP, "role_role_map_child", RoleRoleMap.ROLE_ROLE_MAP.CHILD_ID);
        public static final ForeignKey<RoleRoleMapRecord, RoleRecord> ROLE_ROLE_MAP_PARENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ROLE_PRIMARY, RoleRoleMap.ROLE_ROLE_MAP, "role_role_map_parent", RoleRoleMap.ROLE_ROLE_MAP.PARENT_ID);
        public static final ForeignKey<UserRoleMapRecord, RoleRecord> USER_ROLE_MAP_ROLE = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ROLE_PRIMARY, UserRoleMap.USER_ROLE_MAP, "user_role_map_role", UserRoleMap.USER_ROLE_MAP.ROLE_ID);
        public static final ForeignKey<UserRoleMapRecord, UserRecord> USER_ROLE_MAP_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, UserRoleMap.USER_ROLE_MAP, "user_role_map_user", UserRoleMap.USER_ROLE_MAP.USER_ID);
        public static final ForeignKey<VoteRecord, RequirementRecord> VOTE_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENT_PRIMARY, Vote.VOTE, "vote_requirement", Vote.VOTE.REQUIREMENT_ID);
        public static final ForeignKey<VoteRecord, UserRecord> VOTE_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USER_PRIMARY, Vote.VOTE, "vote_user", Vote.VOTE.USER_ID);
    }
}
