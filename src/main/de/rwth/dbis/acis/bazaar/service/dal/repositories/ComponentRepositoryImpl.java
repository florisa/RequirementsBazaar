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

import de.rwth.dbis.acis.bazaar.service.dal.entities.Component;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.Pageable;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ComponentsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.transform.ComponentTransformator;
import de.rwth.dbis.acis.bazaar.service.exception.BazaarException;
import de.rwth.dbis.acis.bazaar.service.exception.ErrorCode;
import de.rwth.dbis.acis.bazaar.service.exception.ExceptionHandler;
import de.rwth.dbis.acis.bazaar.service.exception.ExceptionLocation;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import sun.awt.ComponentFactory;

import java.util.ArrayList;
import java.util.List;

import static de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Components.COMPONENTS;

/**
 * @author Adam Gavronek <gavronek@dbis.rwth-aachen.de>
 * @since 6/9/2014
 */
public class ComponentRepositoryImpl extends RepositoryImpl<Component, ComponentsRecord> implements ComponentRepository {
    /**
     * @param jooq DSLContext object to initialize JOOQ connection. For more see JOOQ documentation.
     */
    public ComponentRepositoryImpl(DSLContext jooq) {
        super(jooq, new ComponentTransformator());
    }

    @Override
    public List<Component> findByProjectId(int projectId, Pageable pageable) throws BazaarException {
        List<Component> entries = null;
        try {
            entries = new ArrayList<Component>();

            List<ComponentsRecord> queryResults = jooq.selectFrom(transformator.getTable())
                    .where(COMPONENTS.PROJECT_ID.equal(projectId))
                    .orderBy(transformator.getSortFields(pageable.getSortDirection()))
                    .limit(pageable.getPageSize())
                    .offset(pageable.getOffset())
                    .fetchInto(transformator.getRecordClass());

            for (ComponentsRecord queryResult : queryResults) {
                Component entry = transformator.mapToEntity(queryResult);
                entries.add(entry);
            }

            //Add special component with unique id to hold non-component related reqs
            entries.add(Component.getBuilder("Uncategorized")
                        .id(-1)
                        .projectId(projectId)
                        .description("Requirements not under any other component")
                        .build());
        } catch (DataAccessException e) {
            ExceptionHandler.getInstance().convertAndThrowException(e, ExceptionLocation.REPOSITORY, ErrorCode.UNKNOWN);
        }

        return entries;
    }
}
