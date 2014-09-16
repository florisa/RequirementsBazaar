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

package de.rwth.dbis.acis.bazaar.dal.entities;

/**
 * @author Adam Gavronek <gavronek@dbis.rwth-aachen.de>
 * @since 6/11/2014
 */
public class Authorization extends EntityBase {
    private final int Id;
    private final int accessRight;
    private final int ProjectId;
    private final int UserId;

    public Authorization(Builder builder) {
        Id = builder.id;
        this.accessRight = builder.accessRight;
        ProjectId = builder.projectId;
        UserId = builder.userId;
    }

    public int getId() {
        return Id;
    }

    public int getAccessRight() {
        return accessRight;
    }

    public int getProjectId() {
        return ProjectId;
    }

    public int getUserId() {
        return UserId;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private int id;
        private int accessRight;
        private int projectId;
        private int userId;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder accessRight(int accessRight) {
            this.accessRight = accessRight;
            return this;
        }

        public Builder projectId(int projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder userId(int userId) {
            this.userId = userId;
            return this;
        }

        public Authorization build() {
            return new Authorization(this);
        }
    }
}
