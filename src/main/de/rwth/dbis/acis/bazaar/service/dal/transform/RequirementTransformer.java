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
import de.rwth.dbis.acis.bazaar.service.dal.entities.Requirement;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.Pageable;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementRecord;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.util.*;

import static de.rwth.dbis.acis.bazaar.service.dal.jooq.Tables.*;

public class RequirementTransformer implements Transformer<Requirement, RequirementRecord> {
    @Override
    public RequirementRecord createRecord(Requirement entry) {
        entry = this.cleanEntity(entry);

        RequirementRecord record = new RequirementRecord();
        record.setDescription(entry.getDescription());
        record.setName(entry.getName());
        record.setCreationDate(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        record.setCreatorId(entry.getCreator().getId());
        record.setProjectId(entry.getProjectId());
        return record;
    }

    public Requirement.Builder mapToEntityBuilder(RequirementRecord record) {
        return Requirement.getBuilder(record.getName())
                .description(record.getDescription())
                .id(record.getId())
                .realized(record.getRealized())
                .creationDate(record.getCreationDate())
                .lastUpdatedDate(record.getLastUpdatedDate())
                .projectId(record.getProjectId());
    }

    @Override
    public Requirement getEntityFromTableRecord(RequirementRecord record) {
        return mapToEntityBuilder(record)
                .build();
    }

    @Override
    public Table<RequirementRecord> getTable() {
        return REQUIREMENT;
    }

    @Override
    public TableField<RequirementRecord, Integer> getTableId() {
        return REQUIREMENT.ID;
    }

    @Override
    public Class<? extends RequirementRecord> getRecordClass() {
        return RequirementRecord.class;
    }

    @Override
    public Map<Field, Object> getUpdateMap(final Requirement entry) {
        HashMap<Field, Object> updateMap = new HashMap<Field, Object>() {{
            if (entry.getDescription() != null) {
                put(REQUIREMENT.DESCRIPTION, entry.getDescription());
            }
            if (entry.getName() != null) {
                put(REQUIREMENT.NAME, entry.getName());
            }
        }};
        if (!updateMap.isEmpty()) {
            updateMap.put(REQUIREMENT.LAST_UPDATED_DATE, new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        }
        return updateMap;
    }

    @Override
    public Collection<? extends SortField<?>> getSortFields(List<Pageable.SortField> sorts) {
        if (sorts.isEmpty()) {
            return Collections.singletonList(REQUIREMENT.CREATION_DATE.desc());
        }
        List<SortField<?>> sortFields = new ArrayList<>();
        for (Pageable.SortField sort : sorts) {
            switch (sort.getField()) {
                case "date":
                    switch (sort.getSortDirection()) {
                        case ASC:
                            sortFields.add(REQUIREMENT.CREATION_DATE.asc());
                            break;
                        case DESC:
                            sortFields.add(REQUIREMENT.CREATION_DATE.desc());
                            break;
                        default:
                            sortFields.add(REQUIREMENT.CREATION_DATE.desc());
                            break;
                    }
                    break;
                case "name":
                    switch (sort.getSortDirection()) {
                        case ASC:
                            sortFields.add(REQUIREMENT.NAME.asc());
                            break;
                        case DESC:
                            sortFields.add(REQUIREMENT.NAME.desc());
                            break;
                        default:
                            sortFields.add(REQUIREMENT.NAME.asc());
                            break;
                    }
                    break;
                case "vote":

                    Field<Object> voteCount = DSL.select(DSL.count(DSL.nullif(VOTE.IS_UPVOTE, 0)))
                            .from(VOTE)
                            .where(VOTE.REQUIREMENT_ID.equal(REQUIREMENT.ID))
                            .asField("voteCount");

                    switch (sort.getSortDirection()) {
                        case ASC:
                            sortFields.add(voteCount.asc());
                            break;
                        case DESC:
                            sortFields.add(voteCount.desc());
                            break;
                        default:
                            sortFields.add(voteCount.desc());
                            break;
                    }
                    break;
                case "comment":

                    Field<Object> commentCount = DSL.select(DSL.count())
                            .from(COMMENT)
                            .where(COMMENT.REQUIREMENT_ID.equal(REQUIREMENT.ID))
                            .asField("commentCount");

                    switch (sort.getSortDirection()) {
                        case ASC:
                            sortFields.add(commentCount.asc());
                            break;
                        case DESC:
                            sortFields.add(commentCount.desc());
                            break;
                        default:
                            sortFields.add(commentCount.desc());
                            break;
                    }
                    break;
                case "follower":

                    Field<Object> followerCount = DSL.select(DSL.count())
                            .from(REQUIREMENT_FOLLOWER_MAP)
                            .where(REQUIREMENT_FOLLOWER_MAP.REQUIREMENT_ID.equal(REQUIREMENT.ID))
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
                    break;
                case "realized":
                    switch (sort.getSortDirection()) {
                        case ASC:
                            sortFields.add(REQUIREMENT.REALIZED.asc());
                            break;
                        case DESC:
                            sortFields.add(REQUIREMENT.REALIZED.desc());
                            break;
                        default:
                            sortFields.add(REQUIREMENT.REALIZED.desc());
                            break;
                    }
                    break;
            }
        }
        return sortFields;
    }

    @Override
    public Condition getSearchCondition(String search) throws Exception {
        return REQUIREMENT.NAME.likeIgnoreCase("%" + search + "%")
                .or(REQUIREMENT.DESCRIPTION.likeIgnoreCase("%" + search + "%"));
    }

    @Override
    public Collection<? extends Condition> getFilterConditions(Map<String, String> filters) throws Exception {
        List<Condition> conditions = new ArrayList<>();
        for (Map.Entry<String, String> filterEntry : filters.entrySet()) {
            if (filterEntry.getKey().equals("realized")) {
                if (filterEntry.getValue().equals("realized")) {
                    conditions.add(REQUIREMENT.REALIZED.isNotNull());
                }
                if (filterEntry.getValue().equals("open")) {
                    conditions.add(REQUIREMENT.REALIZED.isNull());
                }
            }
        }
        return conditions;
    }

    private Requirement cleanEntity(Requirement requirement) {
        if (requirement.getName() != null) {
            requirement.setName(EmojiParser.parseToAliases(requirement.getName()));
        }
        if (requirement.getDescription() != null) {
            requirement.setDescription(EmojiParser.parseToAliases(requirement.getDescription()));
        }
        return requirement;
    }
}
