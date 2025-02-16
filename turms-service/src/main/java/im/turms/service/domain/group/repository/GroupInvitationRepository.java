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

package im.turms.service.domain.group.repository;

import java.util.Date;
import java.util.Set;
import jakarta.annotation.Nullable;

import com.mongodb.client.result.UpdateResult;
import com.mongodb.reactivestreams.client.ClientSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import im.turms.server.common.access.client.dto.constant.RequestStatus;
import im.turms.server.common.infra.property.TurmsProperties;
import im.turms.server.common.infra.property.TurmsPropertiesManager;
import im.turms.server.common.infra.time.DateRange;
import im.turms.server.common.storage.mongo.DomainFieldName;
import im.turms.server.common.storage.mongo.TurmsMongoClient;
import im.turms.server.common.storage.mongo.operation.option.Filter;
import im.turms.server.common.storage.mongo.operation.option.QueryOptions;
import im.turms.server.common.storage.mongo.operation.option.Update;
import im.turms.service.domain.common.repository.ExpirableEntityRepository;
import im.turms.service.domain.group.po.GroupInvitation;
import im.turms.service.domain.user.po.UserFriendRequest;

/**
 * @author James Chen
 */
@Repository
public class GroupInvitationRepository extends ExpirableEntityRepository<GroupInvitation, Long> {

    private int expireAfterSeconds;

    public GroupInvitationRepository(
            TurmsPropertiesManager propertiesManager,
            @Qualifier("groupMongoClient") TurmsMongoClient mongoClient) {
        super(mongoClient, GroupInvitation.class);
        propertiesManager.notifyAndAddGlobalPropertiesChangeListener(this::updateProperties);
    }

    private void updateProperties(TurmsProperties properties) {
        expireAfterSeconds = properties.getService()
                .getGroup()
                .getInvitation()
                .getExpireAfterSeconds();
    }

    @Override
    public int getEntityExpireAfterSeconds() {
        return expireAfterSeconds;
    }

    public Mono<UpdateResult> updateStatusIfPending(
            Long invitationId,
            RequestStatus requestStatus,
            @Nullable String reason,
            @Nullable ClientSession session) {
        Filter filter = Filter.newBuilder(3)
                .eq(DomainFieldName.ID, invitationId)
                .eq(GroupInvitation.Fields.STATUS, RequestStatus.PENDING)
                .isNotExpired(UserFriendRequest.Fields.CREATION_DATE, getEntityExpirationDate());
        Update update = Update.newBuilder(3)
                .set(GroupInvitation.Fields.STATUS, requestStatus)
                .setIfNotNull(GroupInvitation.Fields.RESPONSE_DATE, new Date())
                .setIfNotNull(GroupInvitation.Fields.REASON, reason);
        return mongoClient.updateOne(session, entityClass, filter, update);
    }

    public Mono<UpdateResult> updateInvitations(
            Set<Long> invitationIds,
            @Nullable Long inviterId,
            @Nullable Long inviteeId,
            @Nullable String content,
            @Nullable RequestStatus status,
            @Nullable Date creationDate,
            @Nullable Date responseDate) {
        Filter filter = Filter.newBuilder(1)
                .in(DomainFieldName.ID, invitationIds);
        Update update = Update.newBuilder(5)
                .setIfNotNull(GroupInvitation.Fields.INVITER_ID, inviterId)
                .setIfNotNull(GroupInvitation.Fields.INVITEE_ID, inviteeId)
                .setIfNotNull(GroupInvitation.Fields.CONTENT, content)
                .setIfNotNull(GroupInvitation.Fields.STATUS, status)
                .setIfNotNull(GroupInvitation.Fields.CREATION_DATE, creationDate);
        updateResponseDateBasedOnStatus(GroupInvitation.Fields.RESPONSE_DATE,
                update,
                status,
                responseDate);
        return mongoClient.updateMany(entityClass, filter, update);
    }

    public Mono<Long> count(
            @Nullable Set<Long> ids,
            @Nullable Set<Long> groupIds,
            @Nullable Set<Long> inviterIds,
            @Nullable Set<Long> inviteeIds,
            @Nullable Set<RequestStatus> statuses,
            @Nullable DateRange creationDateRange,
            @Nullable DateRange responseDateRange,
            @Nullable DateRange expirationDateRange) {
        Filter filter = Filter.newBuilder(10)
                .inIfNotNull(DomainFieldName.ID, ids)
                .inIfNotNull(GroupInvitation.Fields.GROUP_ID, groupIds)
                .inIfNotNull(GroupInvitation.Fields.INVITER_ID, inviterIds)
                .inIfNotNull(GroupInvitation.Fields.INVITEE_ID, inviteeIds)
                .inIfNotNull(GroupInvitation.Fields.STATUS, statuses)
                .addBetweenIfNotNull(GroupInvitation.Fields.CREATION_DATE,
                        getCreationDateRange(creationDateRange, expirationDateRange))
                .addBetweenIfNotNull(GroupInvitation.Fields.RESPONSE_DATE, responseDateRange)
                .isExpiredOrNot(statuses,
                        GroupInvitation.Fields.CREATION_DATE,
                        getEntityExpirationDate());
        return mongoClient.count(entityClass, filter);
    }

    public Mono<GroupInvitation> findGroupIdAndInviteeIdAndStatus(Long invitationId) {
        Filter filter = Filter.newBuilder(1)
                .eq(DomainFieldName.ID, invitationId);
        QueryOptions options = QueryOptions.newBuilder(1)
                .include(GroupInvitation.Fields.GROUP_ID,
                        GroupInvitation.Fields.INVITEE_ID,
                        GroupInvitation.Fields.STATUS,
                        // Required by findExpirableDoc
                        GroupInvitation.Fields.CREATION_DATE);
        return findExpirableDoc(filter, options);
    }

    public Mono<GroupInvitation> findGroupIdAndInviterIdAndInviteeIdAndStatus(Long invitationId) {
        Filter filter = Filter.newBuilder(1)
                .eq(DomainFieldName.ID, invitationId);
        QueryOptions options = QueryOptions.newBuilder(1)
                .include(GroupInvitation.Fields.GROUP_ID,
                        GroupInvitation.Fields.INVITER_ID,
                        GroupInvitation.Fields.INVITEE_ID,
                        GroupInvitation.Fields.STATUS,
                        // Required by findExpirableDoc
                        GroupInvitation.Fields.CREATION_DATE);
        return findExpirableDoc(filter, options);
    }

    public Flux<GroupInvitation> findInvitationsByInviteeId(Long inviteeId) {
        Filter filter = Filter.newBuilder(1)
                .eq(GroupInvitation.Fields.INVITEE_ID, inviteeId);
        return findExpirableDocs(filter);
    }

    public Flux<GroupInvitation> findInvitationsByInviterId(Long inviterId) {
        Filter filter = Filter.newBuilder(1)
                .eq(GroupInvitation.Fields.INVITER_ID, inviterId);
        return findExpirableDocs(filter);
    }

    public Flux<GroupInvitation> findInvitationsByGroupId(Long groupId) {
        Filter filter = Filter.newBuilder(1)
                .eq(GroupInvitation.Fields.GROUP_ID, groupId);
        return findExpirableDocs(filter);
    }

    public Mono<GroupInvitation> findInviteeIdAndGroupIdAndCreationDateAndStatus(
            Long invitationId) {
        Filter filter = Filter.newBuilder(1)
                .eq(DomainFieldName.ID, invitationId);
        QueryOptions options = QueryOptions.newBuilder(1)
                .include(GroupInvitation.Fields.INVITEE_ID,
                        GroupInvitation.Fields.GROUP_ID,
                        GroupInvitation.Fields.CREATION_DATE,
                        GroupInvitation.Fields.STATUS);
        return mongoClient.findOne(entityClass, filter, options);
    }

    public Flux<GroupInvitation> findInvitations(
            @Nullable Set<Long> ids,
            @Nullable Set<Long> groupIds,
            @Nullable Set<Long> inviterIds,
            @Nullable Set<Long> inviteeIds,
            @Nullable Set<RequestStatus> statuses,
            @Nullable DateRange creationDateRange,
            @Nullable DateRange responseDateRange,
            @Nullable DateRange expirationDateRange,
            @Nullable Integer page,
            @Nullable Integer size) {
        Filter filter = Filter.newBuilder(10)
                .inIfNotNull(DomainFieldName.ID, ids)
                .inIfNotNull(GroupInvitation.Fields.GROUP_ID, groupIds)
                .inIfNotNull(GroupInvitation.Fields.INVITER_ID, inviterIds)
                .inIfNotNull(GroupInvitation.Fields.INVITEE_ID, inviteeIds)
                .inIfNotNull(GroupInvitation.Fields.STATUS, statuses)
                .addBetweenIfNotNull(GroupInvitation.Fields.CREATION_DATE,
                        getCreationDateRange(creationDateRange, expirationDateRange))
                .addBetweenIfNotNull(GroupInvitation.Fields.RESPONSE_DATE, responseDateRange)
                .isExpiredOrNot(statuses,
                        GroupInvitation.Fields.CREATION_DATE,
                        getEntityExpirationDate());
        QueryOptions options = QueryOptions.newBuilder(2)
                .paginateIfNotNull(page, size);
        return findExpirableDocs(filter, options);
    }

}