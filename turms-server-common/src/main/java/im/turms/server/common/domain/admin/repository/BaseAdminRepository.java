/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.domain.admin.repository;

import reactor.core.publisher.Mono;

import im.turms.server.common.domain.admin.po.Admin;
import im.turms.server.common.domain.common.repository.BaseRepository;
import im.turms.server.common.storage.mongo.TurmsMongoClient;
import im.turms.server.common.storage.mongo.operation.option.Filter;

/**
 * @author James Chen
 */
public abstract class BaseAdminRepository extends BaseRepository<Admin, Long> {

    protected BaseAdminRepository(TurmsMongoClient mongoClient) {
        super(mongoClient, Admin.class);
        this.mongoClient = mongoClient;
    }

    public Mono<Admin> findByLoginName(String loginName) {
        return mongoClient.findOne(Admin.class,
                Filter.newBuilder(1)
                        .eq(Admin.Fields.LOGIN_NAME, loginName));
    }
}