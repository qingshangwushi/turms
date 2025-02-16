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

package im.turms.server.common.infra.property.env.service.business.message;

import jakarta.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import im.turms.server.common.infra.property.constant.TimeType;
import im.turms.server.common.infra.property.metadata.Description;
import im.turms.server.common.infra.property.metadata.GlobalProperty;
import im.turms.server.common.infra.property.metadata.MutableProperty;
import im.turms.server.common.infra.task.CronConst;
import im.turms.server.common.infra.validation.ValidCron;

import static im.turms.server.common.infra.unit.ByteSizeUnit.MB;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class MessageProperties {

    @Description("Whether to use conversation ID so that "
            + "a user can query the messages sent by themselves in a conversation quickly")
    @GlobalProperty
    protected boolean useConversationId;

    @NestedConfigurationProperty
    protected SequenceIdProperties sequenceId = new SequenceIdProperties();

    @Description("The time type for the delivery time of message")
    @GlobalProperty
    @MutableProperty
    protected TimeType timeType = TimeType.LOCAL_SERVER_TIME;

    @Description("Whether to check if the target (recipient or group) of a message is active and not deleted")
    @GlobalProperty
    @MutableProperty
    protected boolean checkIfTargetActiveAndNotDeleted = true;

    @Description("The maximum allowed length for the text of a message")
    @GlobalProperty
    @MutableProperty
    @Min(0)
    protected int maxTextLimit = 500;

    @Description("The maximum allowed size for the records of a message")
    @GlobalProperty
    @MutableProperty
    @Min(0)
    protected int maxRecordsSizeBytes = 15 * MB;

    @Description("Whether to persist messages in databases.\n"
            + "Note: If false, senders will not get the message ID after the message has sent and cannot edit it")
    @GlobalProperty
    @MutableProperty
    protected boolean persistMessage = true;

    @Description("Whether to persist the records of messages in databases")
    @GlobalProperty
    @MutableProperty
    protected boolean persistRecord;

    @Description("Whether to persist the previous message ID of messages in databases")
    @GlobalProperty
    @MutableProperty
    protected boolean persistPreMessageId;

    @Description("Whether to persist the sender IP of messages in databases")
    @GlobalProperty
    @MutableProperty
    protected boolean persistSenderIp;

    @Description("A message will be retained for the given period and will be removed from the database after the retention period")
    @GlobalProperty
    @MutableProperty
    @Min(0)
    protected int messageRetentionPeriodHours;

    @Description("Clean the expired messages when the cron expression is triggered")
    @ValidCron
    protected String expiredMessagesCleanupCron = CronConst.DEFAULT_EXPIRED_MESSAGES_CLEANUP_CRON;

    @Description("Whether to delete messages logically by default")
    @GlobalProperty
    @MutableProperty
    protected boolean deleteMessageLogicallyByDefault = true;

    @Description("Whether to respond with recalled messages to clients' message query requests")
    @GlobalProperty
    @MutableProperty
    protected boolean isRecalledMessageVisible;

    // TODO
//    @Description("Whether to hide the content (text and records) of recalled messages, " +
//            "but still return when responding to clients' message query requests")
//    @GlobalProperty
//    @MutableProperty
//    protected boolean hideRecalledMessageContent = true;

    @Description("Whether to allow users to send messages to a stranger")
    @GlobalProperty
    @MutableProperty
    protected boolean allowSendMessagesToStranger = true;

    @Description("Whether to allow users to send messages to themselves")
    @GlobalProperty
    @MutableProperty
    protected boolean allowSendMessagesToOneself;

    @Description("Whether to allow users to recall messages.\n"
            + "Note: To recall messages, more system resources are needed")
    @GlobalProperty
    @MutableProperty
    protected boolean allowRecallMessage = true;

    @Description("Whether to allow the sender of a message to edit the message")
    @GlobalProperty
    @MutableProperty
    protected boolean allowEditMessageBySender = true;

    @Description("The available recall duration for the sender of a message")
    @GlobalProperty
    @MutableProperty
    @Min(0)
    protected int availableRecallDurationSeconds = 60 * 5;

    @Description("The default available messages number without the \"total\" field for a message query request")
    @GlobalProperty
    @MutableProperty
    @Min(0)
    protected int defaultAvailableMessagesNumberWithoutTotal = 1000;

    @Description("The max available messages number without the \"total\" field that a message query request can request")
    @GlobalProperty
    @MutableProperty
    @Min(0)
    protected int maxAvailableMessagesNumberWithoutTotal = 1000;

    @Description("The default available messages number with the \"total\" field for a message query request")
    @GlobalProperty
    @MutableProperty
    @Min(0)
    protected int defaultAvailableMessagesNumberWithTotal = 1;

    @Description("The max available messages number with the \"total\" field that a message query request can request")
    @GlobalProperty
    @MutableProperty
    @Min(0)
    protected int maxAvailableMessagesNumberWithTotal = 1000;

    @NestedConfigurationProperty
    protected CacheProperties cache = new CacheProperties();

    @AllArgsConstructor
    @Builder(toBuilder = true)
    @Data
    @NoArgsConstructor
    public static class CacheProperties {

        @Description("The maximum size of the cache of sent messages.")
        @Min(0)
        protected int sentMessageCacheMaxSize = 10240;

        @Description("The retention period of sent messages in the cache. "
                + "For a better performance, it is a good practice to keep the value greater than the allowed recall duration")
        @Min(1)
        protected int sentMessageExpireAfter = 30;

    }
}