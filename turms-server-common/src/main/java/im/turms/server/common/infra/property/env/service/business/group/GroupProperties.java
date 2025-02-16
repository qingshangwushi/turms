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

package im.turms.server.common.infra.property.env.service.business.group;

import jakarta.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

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
public class GroupProperties {

    @Description("Whether to activate a group when created by default")
    @GlobalProperty
    @MutableProperty
    protected boolean activateGroupWhenCreated = true;

    @Description("Whether to allow the group owner to change the group type")
    @GlobalProperty
    @MutableProperty
    protected boolean allowGroupOwnerChangeGroupType = false;

    @Description("Whether to delete groups logically by default")
    @GlobalProperty
    @MutableProperty
    protected boolean deleteGroupLogicallyByDefault = true;

    @Description("The group member cache will expire after the specified seconds. "
            + "If 0, no group member cache")
    @GlobalProperty
    @Min(0)
    protected int memberCacheExpireAfterSeconds = 15;

    @NestedConfigurationProperty
    protected GroupInfoProperties info = new GroupInfoProperties();

    @NestedConfigurationProperty
    protected GroupInvitationProperties invitation = new GroupInvitationProperties();

    @NestedConfigurationProperty
    protected GroupJoinRequestProperties joinRequest = new GroupJoinRequestProperties();

    @NestedConfigurationProperty
    protected GroupQuestionProperties question = new GroupQuestionProperties();

}