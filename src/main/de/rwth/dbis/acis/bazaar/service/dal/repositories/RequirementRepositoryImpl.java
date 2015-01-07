/*
 *
 *  Copyright (c) 2014, RWTH Aachen University.
 *  For a list of contributors see the AUTHORS file at the top-level directory
 *  of this distribution.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */

package de.rwth.dbis.acis.bazaar.service.dal.repositories;

import de.rwth.dbis.acis.bazaar.service.dal.entities.*;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.Pageable;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.*;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.transform.AttachmentTransformator;
import de.rwth.dbis.acis.bazaar.service.dal.transform.RequirementTransformator;
import de.rwth.dbis.acis.bazaar.service.exception.BazaarException;
import de.rwth.dbis.acis.bazaar.service.exception.ErrorCode;
import de.rwth.dbis.acis.bazaar.service.exception.ExceptionHandler;
import de.rwth.dbis.acis.bazaar.service.exception.ExceptionLocation;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.exception.DataAccessException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements.REQUIREMENTS;

/**
 * @author Adam Gavronek <gavronek@dbis.rwth-aachen.de>
 * @since 6/9/2014
 */
public class RequirementRepositoryImpl extends RepositoryImpl<Requirement, RequirementsRecord> implements RequirementRepository {
    /**
     * @param jooq DSLContext object to initialize JOOQ connection. For more see JOOQ documentation.
     */
    public RequirementRepositoryImpl(DSLContext jooq) {
        super(jooq, new RequirementTransformator());
    }

    @Override
    public List<Requirement> findAllByProject(int projectId, Pageable pageable) throws BazaarException {
        List<Requirement> entries = null;
        try {
            entries = new ArrayList<Requirement>();

            List<RequirementsRecord> queryResults;
            queryResults = jooq.selectFrom(REQUIREMENTS)
                    .where(REQUIREMENTS.PROJECT_ID.equal(projectId))
                    .orderBy(transformator.getSortFields(pageable.getSortDirection()))
                    .limit(pageable.getPageSize())
                    .offset(pageable.getOffset())
                    .fetchInto(transformator.getRecordClass());

            for (RequirementsRecord queryResult : queryResults) {
                Requirement entry = transformator.mapToEntity(queryResult);
                entries.add(entry);
            }
        } catch (DataAccessException e) {
            ExceptionHandler.getInstance().convertAndThrowException(e, ExceptionLocation.REPOSITORY, ErrorCode.UNKNOWN);
        }

        return entries;
    }

    @Override
    public List<Requirement> findAllByComponent(int componentId, Pageable pageable) throws BazaarException {
        List<Requirement> entries = null;
        try {
            entries = new ArrayList<Requirement>();

            List<RequirementsRecord> queryResults;


            if (componentId != -1) {
                queryResults = jooq.selectFrom(REQUIREMENTS.join(Tags.TAGS).on(Tags.TAGS.REQUIREMENTS_ID.equal(REQUIREMENTS.ID)))
                        .where(Tags.TAGS.COMPONENTS_ID.equal(componentId))
                        .orderBy(transformator.getSortFields(pageable.getSortDirection()))
                        .limit(pageable.getPageSize())
                        .offset(pageable.getOffset())
                        .fetchInto(transformator.getRecordClass());
            } else {
                queryResults = jooq.selectFrom(REQUIREMENTS.leftOuterJoin(Tags.TAGS).on(Tags.TAGS.REQUIREMENTS_ID.equal(REQUIREMENTS.ID)))
                        .where(Tags.TAGS.ID.isNull())
                        .orderBy(transformator.getSortFields(pageable.getSortDirection()))
                        .limit(pageable.getPageSize())
                        .offset(pageable.getOffset())
                        .fetchInto(transformator.getRecordClass());
            }

            for (RequirementsRecord queryResult : queryResults) {
                Requirement entry = transformator.mapToEntity(queryResult);
                entries.add(entry);
            }
        } catch (DataAccessException e) {
            ExceptionHandler.getInstance().convertAndThrowException(e, ExceptionLocation.REPOSITORY, ErrorCode.UNKNOWN);
        }

        return entries;
    }

    @Override
    public RequirementEx findById(int id) throws Exception {
        RequirementEx requirementEx = null;
        try {
            Users followerUsers = Users.USERS.as("followerUsers");
            Users developerUsers = Users.USERS.as("developerUsers");
            Users creatorUser = Users.USERS.as("creatorUser");
            Users leadDeveloperUser = Users.USERS.as("leadDeveloperUser");
            Users contributorUsers = Users.USERS.as("contributorUsers");
            Result<Record> queryResult = jooq.selectFrom(
                    REQUIREMENTS
                            .leftOuterJoin(Comments.COMMENTS).on(Comments.COMMENTS.REQUIREMENT_ID.equal(REQUIREMENTS.ID))
                            .leftOuterJoin(Attachments.ATTACHMENTS).on(Attachments.ATTACHMENTS.REQUIREMENT_ID.equal(REQUIREMENTS.ID))

                            .leftOuterJoin(Followers.FOLLOWERS).on(Followers.FOLLOWERS.REQUIREMENT_ID.equal(REQUIREMENTS.ID))
                            .leftOuterJoin(followerUsers).on(Followers.FOLLOWERS.USER_ID.equal(followerUsers.ID))

                            .leftOuterJoin(Developers.DEVELOPERS).on(Developers.DEVELOPERS.REQUIREMENT_ID.equal(REQUIREMENTS.ID))
                            .leftOuterJoin(developerUsers).on(Developers.DEVELOPERS.USER_ID.equal(developerUsers.ID))

                            .join(creatorUser).on(creatorUser.ID.equal(REQUIREMENTS.CREATOR_ID))
                            .join(leadDeveloperUser).on(leadDeveloperUser.ID.equal(REQUIREMENTS.LEAD_DEVELOPER_ID))

                            .leftOuterJoin(contributorUsers).on(Attachments.ATTACHMENTS.USER_ID.equal(contributorUsers.ID))

                            .leftOuterJoin(Tags.TAGS).on(Tags.TAGS.REQUIREMENTS_ID.equal(REQUIREMENTS.ID))
                            .leftOuterJoin(Components.COMPONENTS).on(Components.COMPONENTS.ID.equal(Tags.TAGS.COMPONENTS_ID))
            )
                    .where(transformator.getTableId().equal(id))
                    .fetch();

            if (queryResult == null || queryResult.size() == 0) {
                throw new Exception("No " + transformator.getRecordClass() + " found with id: " + id);
            }

            //Filling up Requirement fields
            RequirementEx.BuilderEx builder = RequirementEx.getBuilder(queryResult.getValues(REQUIREMENTS.TITLE).get(0));
            builder.id(queryResult.getValues(REQUIREMENTS.ID).get(0))
                    .description(queryResult.getValues(REQUIREMENTS.DESCRIPTION).get(0))
                    .creationTime(queryResult.getValues(REQUIREMENTS.CREATION_TIME).get(0))
                    .projectId(queryResult.getValues(REQUIREMENTS.PROJECT_ID).get(0))
                    .leadDeveloperId(queryResult.getValues(REQUIREMENTS.LEAD_DEVELOPER_ID).get(0))
                    .creatorId(queryResult.getValues(REQUIREMENTS.CREATOR_ID).get(0));

            //Filling up Creator
            builder.creator(
                    User.geBuilder(queryResult.getValues(creatorUser.EMAIL).get(0))
                            .id(queryResult.getValues(creatorUser.ID).get(0))
                            .admin(queryResult.getValues(creatorUser.ADMIN).get(0) != 0)
                            .firstName(queryResult.getValues(creatorUser.FIRST_NAME).get(0))
                            .lastName(queryResult.getValues(creatorUser.LAST_NAME).get(0))
                            .las2peerId(queryResult.getValues(creatorUser.LAS2PEER_ID).get(0))
                            .userName(queryResult.getValues(creatorUser.USER_NAME).get(0))
                            .build()
            );

            //Filling up LeadDeveloper
            builder.leadDeveloper(
                    User.geBuilder(queryResult.getValues(leadDeveloperUser.EMAIL).get(0))
                            .id(queryResult.getValues(leadDeveloperUser.ID).get(0))
                            .admin(queryResult.getValues(leadDeveloperUser.ADMIN).get(0) != 0)
                            .firstName(queryResult.getValues(leadDeveloperUser.FIRST_NAME).get(0))
                            .lastName(queryResult.getValues(leadDeveloperUser.LAST_NAME).get(0))
                            .las2peerId(queryResult.getValues(leadDeveloperUser.LAS2PEER_ID).get(0))
                            .userName(queryResult.getValues(leadDeveloperUser.USER_NAME).get(0))
                            .build()
            );

            //Filling up developers list
            List<User> devList = new ArrayList<User>();
            for (Map.Entry<Integer, Result<Record>> entry : queryResult.intoGroups(developerUsers.ID).entrySet()) {
                if (entry.getKey() == null) continue;
                Result<Record> records = entry.getValue();
                devList.add(
                        User.geBuilder(records.getValues(developerUsers.EMAIL).get(0))
                                .id(records.getValues(developerUsers.ID).get(0))
                                .admin(records.getValues(developerUsers.ADMIN).get(0) != 0)
                                .firstName(records.getValues(developerUsers.FIRST_NAME).get(0))
                                .lastName(records.getValues(developerUsers.LAST_NAME).get(0))
                                .las2peerId(records.getValues(developerUsers.LAS2PEER_ID).get(0))
                                .userName(records.getValues(developerUsers.USER_NAME).get(0))
                                .build()
                );
            }
            builder.developers(devList);

            //Filling up follower list
            List<User> followers = new ArrayList<User>();
            for (Map.Entry<Integer, Result<Record>> entry : queryResult.intoGroups(followerUsers.ID).entrySet()) {
                if (entry.getKey() == null) continue;
                Result<Record> records = entry.getValue();
                followers.add(
                        User.geBuilder(records.getValues(followerUsers.EMAIL).get(0))
                                .id(records.getValues(followerUsers.ID).get(0))
                                .admin(records.getValues(followerUsers.ADMIN).get(0) != 0)
                                .firstName(records.getValues(followerUsers.FIRST_NAME).get(0))
                                .lastName(records.getValues(followerUsers.LAST_NAME).get(0))
                                .las2peerId(records.getValues(followerUsers.LAS2PEER_ID).get(0))
                                .userName(records.getValues(followerUsers.USER_NAME).get(0))
                                .build()
                );
            }
            builder.followers(followers);

            //Filling up contributors

            List<User> contributorList = new ArrayList<User>();

            for (Map.Entry<Integer, Result<Record>> entry : queryResult.intoGroups(contributorUsers.ID).entrySet()) {
                if (entry.getKey() == null) continue;
                Result<Record> records = entry.getValue();
                contributorList.add(
                        User.geBuilder(records.getValues(contributorUsers.EMAIL).get(0))
                                .id(records.getValues(contributorUsers.ID).get(0))
                                .admin(records.getValues(contributorUsers.ADMIN).get(0) != 0)
                                .firstName(records.getValues(contributorUsers.FIRST_NAME).get(0))
                                .lastName(records.getValues(contributorUsers.LAST_NAME).get(0))
                                .las2peerId(records.getValues(contributorUsers.LAS2PEER_ID).get(0))
                                .userName(records.getValues(contributorUsers.USER_NAME).get(0))
                                .build()
                );
            }

            builder.contributors(contributorList);

            //Filling up components
            List<Component> components = new ArrayList<Component>();

            for (Map.Entry<Integer, Result<Record>> entry : queryResult.intoGroups(Components.COMPONENTS.ID).entrySet()) {
                if (entry.getKey() == null) continue;
                Result<Record> records = entry.getValue();
                components.add(
                        Component.getBuilder(records.getValues(Components.COMPONENTS.NAME).get(0))
                                .projectId(records.getValues(Components.COMPONENTS.PROJECT_ID).get(0))
                                .id(records.getValues(Components.COMPONENTS.ID).get(0))
                                .description(records.getValues(Components.COMPONENTS.DESCRIPTION).get(0))
                                .build()
                );
            }

            builder.components(components);

            //Filling up attachments
            List<Attachment> attachments = new ArrayList<Attachment>();

            AttachmentTransformator attachmentTransform = new AttachmentTransformator();

            for (Map.Entry<Integer, Result<Record>> entry : queryResult.intoGroups(Attachments.ATTACHMENTS.ID).entrySet()) {
                if (entry.getKey() == null) continue;
                Result<Record> records = entry.getValue();
                AttachmentsRecord record = new AttachmentsRecord(
                        records.getValues(Attachments.ATTACHMENTS.ID).get(0),
                        records.getValues(Attachments.ATTACHMENTS.CREATION_TIME).get(0),
                        records.getValues(Attachments.ATTACHMENTS.REQUIREMENT_ID).get(0),
                        records.getValues(Attachments.ATTACHMENTS.USER_ID).get(0),
                        records.getValues(Attachments.ATTACHMENTS.TITLE).get(0),
                        records.getValues(Attachments.ATTACHMENTS.DISCRIMINATOR).get(0),
                        records.getValues(Attachments.ATTACHMENTS.FILE_PATH).get(0),
                        records.getValues(Attachments.ATTACHMENTS.DESCRIPTION).get(0),
                        records.getValues(Attachments.ATTACHMENTS.STORY).get(0),
                        records.getValues(Attachments.ATTACHMENTS.SUBJECT).get(0),
                        records.getValues(Attachments.ATTACHMENTS.OBJECT).get(0),
                        records.getValues(Attachments.ATTACHMENTS.OBJECT_DESC).get(0)
                );
                attachments.add(
                        attachmentTransform.mapToEntity(record)
                );
            }

            builder.attachments(attachments);

            requirementEx = builder.build();
        } catch (BazaarException be) {
            ExceptionHandler.getInstance().convertAndThrowException(be);
        } catch (Exception e) {
            ExceptionHandler.getInstance().convertAndThrowException(e, ExceptionLocation.REPOSITORY, ErrorCode.UNKNOWN);
        }
        return requirementEx;
    }
}
