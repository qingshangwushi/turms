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

package im.turms.server.common.infra.property.env.service.business.notification.group;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import im.turms.server.common.infra.property.metadata.Description;
import im.turms.server.common.infra.property.metadata.GlobalProperty;
import im.turms.server.common.infra.property.metadata.MutableProperty;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class NotificationGroupMemberRemovedProperties {

    @Description("Whether to notify the requester's other online sessions when they removed a group member")
    @GlobalProperty
    @MutableProperty
    protected boolean notifyRequesterOtherOnlineSessions = true;

    @Description("Whether to notify the group member when removed by others")
    @GlobalProperty
    @MutableProperty
    protected boolean notifyRemovedGroupMember = true;

    @Description("Whether to notify other group members when a group member has been removed")
    @GlobalProperty
    @MutableProperty
    protected boolean notifyOtherGroupMembers = true;

}