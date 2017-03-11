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

package de.rwth.dbis.acis.bazaar.service.dal.transform;

import com.vdurmont.emoji.EmojiParser;
import de.rwth.dbis.acis.bazaar.service.dal.entities.Project;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.Pageable;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectRecord;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.util.*;

import static de.rwth.dbis.acis.bazaar.service.dal.jooq.Tables.REQUIREMENT;
import static de.rwth.dbis.acis.bazaar.service.dal.jooq.Tables.PROJECT;
import static de.rwth.dbis.acis.bazaar.service.dal.jooq.Tables.PROJECT_FOLLOWER_MAP;

public class ProjectTransformator implements Transformator<de.rwth.dbis.acis.bazaar.service.dal.entities.Project, de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectRecord> {

    @Override
    public ProjectRecord createRecord(Project entry) {
        entry = this.cleanEntry(entry);

        ProjectRecord record = new ProjectRecord();
        record.setDescription(entry.getDescription());
        record.setName(entry.getName());
        record.setLeaderId(entry.getLeaderId());
        record.setVisibility((byte) (entry.getVisibility() == true ? 1 : 0 ));
        record.setDefaultComponentId(entry.getDefaultComponentId());
        record.setCreationTime(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        record.setLastupdatedTime(record.getCreationTime());
        return record;
    }

    @Override
    public Project getEntityFromTableRecord(ProjectRecord record) {
        return Project.getBuilder(record.getName())
                .description(record.getDescription())
                .id(record.getId())
                .leaderId(record.getLeaderId())
                .defaultComponentId(record.getDefaultComponentId())
                .visibility(record.getVisibility() == 1)
                .creationTime(record.getCreationTime())
                .lastupdatedTime(record.getLastupdatedTime())
                .build();
    }

    @Override
    public Table<ProjectRecord> getTable() {
        return PROJECT;
    }

    @Override
    public TableField<ProjectRecord, Integer> getTableId() {
        return PROJECT.ID;
    }

    @Override
    public Class<? extends ProjectRecord> getRecordClass() {
        return ProjectRecord.class;
    }

    @Override
    public Map<Field, Object> getUpdateMap(final Project entry) {
        HashMap<Field, Object> updateMap = new HashMap<Field, Object>() {{
            if (entry.getDescription() != null) {
                put(PROJECT.DESCRIPTION, entry.getDescription());
            }
            if (entry.getName() != null) {
                put(PROJECT.NAME, entry.getName());
            }
            if (entry.getLeaderId() != 0) {
                put(PROJECT.LEADER_ID, entry.getLeaderId());
            }
            if (entry.getDefaultComponentId() != null) {
                put(PROJECT.DEFAULT_COMPONENT_ID, entry.getDefaultComponentId());
            }
            if (entry.getVisibility() != null) {
                put(PROJECT.VISIBILITY, entry.getVisibility());
            }
        }};
        if (!updateMap.isEmpty()) {
            updateMap.put(PROJECT.LASTUPDATED_TIME, new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        }
        return updateMap;
    }

    @Override
    public Collection<? extends SortField<?>> getSortFields(List<Pageable.SortField> sorts) {
        if (sorts.isEmpty()) {
            return Arrays.asList(PROJECT.NAME.asc());
        }
        List<SortField<?>> sortFields = new ArrayList<>();
        for (Pageable.SortField sort : sorts) {
            if (sort.getField().equals("name")) {
                switch (sort.getSortDirection()) {
                    case ASC:
                        sortFields.add(PROJECT.NAME.asc());
                        break;
                    case DESC:
                        sortFields.add(PROJECT.NAME.desc());
                        break;
                    default:
                        sortFields.add(PROJECT.NAME.asc());
                        break;
                }
            } else if (sort.getField().equals("date")) {
                switch (sort.getSortDirection()) {
                    case ASC:
                        sortFields.add(PROJECT.CREATION_TIME.asc());
                        break;
                    case DESC:
                        sortFields.add(PROJECT.CREATION_TIME.desc());
                        break;
                    default:
                        sortFields.add(PROJECT.CREATION_TIME.desc());
                        break;
                }
            } else if (sort.getField().equals("requirement")) {

                Field<Object> requirementCount = DSL.select(DSL.count())
                        .from(REQUIREMENT)
                        .where(REQUIREMENT.PROJECT_ID.equal(PROJECT.ID))
                        .asField("requirementCount");

                switch (sort.getSortDirection()) {
                    case ASC:
                        sortFields.add(requirementCount.asc());
                        break;
                    case DESC:
                        sortFields.add(requirementCount.desc());
                        break;
                    default:
                        sortFields.add(requirementCount.desc());
                        break;
                }
            } else if (sort.getField().equals("follower")) {

                Field<Object> followerCount = DSL.select(DSL.count())
                        .from(PROJECT_FOLLOWER_MAP)
                        .where(PROJECT_FOLLOWER_MAP.PROJECT_ID.equal(PROJECT.ID))
                        .asField("followerCount");

                switch (sort.getSortDirection()) {
                    case ASC:
                        sortFields.add(followerCount.asc());
                        break;
                    case DESC:
                        sortFields.add(followerCount.desc());
                        break;
                    default:
                        sortFields.add(followerCount.desc());
                        break;
                }
            }
        }
        return sortFields;
    }

    @Override
    public Condition getSearchCondition(String search) throws Exception {
        return PROJECT.NAME.likeIgnoreCase("%" + search + "%")
                .or(PROJECT.DESCRIPTION.likeIgnoreCase("%" + search + "%"));
    }

    @Override
    public Collection<? extends Condition> getFilterConditions(Map<String, String> filters) throws Exception {
        return new ArrayList<>();
    }

    public Project cleanEntry(Project project) {
        if (project.getName() != null) {
            project.setName(EmojiParser.parseToAliases(project.getName()));
        }
        if (project.getDescription() != null) {
            project.setDescription(EmojiParser.parseToAliases(project.getDescription()));
        }
        return project;
    }
}
