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
public class NotificationGroupInvitationAddedProperties {

    @Description("Whether to notify the requester's other online sessions when they have invited a user to a group")
    @GlobalProperty
    @MutableProperty
    protected boolean notifyRequesterOtherOnlineSessions = true;

    @Description("Whether to notify the user when they have been invited by a group member")
    @GlobalProperty
    @MutableProperty
    protected boolean notifyInvitee = true;

    @Description("Whether to notify the group owner and managers when a user has been invited")
    @GlobalProperty
    @MutableProperty
    protected boolean notifyGroupOwnerAndManagers = true;

    @Description("Whether to notify group members when a user has been invited")
    @GlobalProperty
    @MutableProperty
    protected boolean notifyGroupMembers;

}