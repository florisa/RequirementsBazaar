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

import de.rwth.dbis.acis.bazaar.service.dal.entities.*;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.AttachmentType;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.Pageable;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord;
import org.jooq.*;

import java.sql.Timestamp;
import java.util.*;

import static de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments.ATTACHMENTS;

public class AttachmentTransformator implements Transformator<de.rwth.dbis.acis.bazaar.service.dal.entities.Attachment, de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord> {

    @Override
    public AttachmentsRecord createRecord(Attachment entity) {
        AttachmentsRecord attachmentsRecord = new AttachmentsRecord();
        attachmentsRecord.setCreationTime(new Timestamp(entity.getCreation_time().getTime()));
        attachmentsRecord.setLastupdatedTime(attachmentsRecord.getCreationTime());
        attachmentsRecord.setRequirementId(entity.getRequirementId());
        attachmentsRecord.setUserId(entity.getCreatorId());
        attachmentsRecord.setTitle(entity.getTitle());
        attachmentsRecord.setDescription(entity.getDescription());
        attachmentsRecord.setMimeType(entity.getMimeType());
        return attachmentsRecord;
    }

    @Override
    public Attachment getEntityFromTableRecord(AttachmentsRecord record) {
        Attachment entity = Image.getBuilder()
                .id(record.getId())
                .creator(record.getUserId())
                .requirementId(record.getRequirementId())
                .title(record.getTitle())
                .description(record.getDescription())
                .mimeType(record.getMimeType())
                .creationTime(record.getCreationTime())
                .lastupdatedTime(record.getLastupdatedTime())
                .build();
        return entity;
    }

    @Override
    public Table<AttachmentsRecord> getTable() {
        return ATTACHMENTS;
    }

    @Override
    public TableField<AttachmentsRecord, Integer> getTableId() {
        return ATTACHMENTS.ID;
    }

    @Override
    public Class<? extends AttachmentsRecord> getRecordClass() {
        return AttachmentsRecord.class;
    }

    @Override
    public Map<Field, Object> getUpdateMap(final Attachment entity) {
        HashMap<Field, Object> updateMap = new HashMap<Field, Object>() {{
            put(ATTACHMENTS.USER_ID, entity.getCreatorId());
            put(ATTACHMENTS.REQUIREMENT_ID, entity.getRequirementId());
            put(ATTACHMENTS.TITLE, entity.getTitle());
            put(ATTACHMENTS.DESCRIPTION, entity.getDescription());
        }};
        if (!updateMap.isEmpty()) {
            updateMap.put(ATTACHMENTS.LASTUPDATED_TIME, new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        }
        return updateMap;
    }

    @Override
    public Collection<? extends SortField<?>> getSortFields(Pageable.SortDirection sortDirection) {
        switch (sortDirection) {
            case DEFAULT:
                return Arrays.asList(ATTACHMENTS.CREATION_TIME.desc());
            case ASC:
                return Arrays.asList(ATTACHMENTS.CREATION_TIME.asc());
            case DESC:
                return Arrays.asList(ATTACHMENTS.CREATION_TIME.desc());
        }
        return null;
    }

    @Override
    public Collection<? extends Condition> getSearchFields(String likeExpression) throws Exception {
        return Arrays.asList(
                ATTACHMENTS.TITLE.likeIgnoreCase(likeExpression)
                        .or(ATTACHMENTS.DESCRIPTION.likeIgnoreCase(likeExpression))
        );
    }
}


