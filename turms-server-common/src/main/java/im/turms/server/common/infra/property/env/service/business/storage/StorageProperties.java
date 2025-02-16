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

package im.turms.server.common.infra.property.env.service.business.storage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import im.turms.server.common.access.admin.web.MediaTypeConst;

/**
 * There properties are "recommended" and optional for plugin providers to implement
 *
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class StorageProperties {

    @NestedConfigurationProperty
    protected StorageItemProperties userProfilePicture = new StorageItemProperties().toBuilder()
            .allowedContentType(MediaTypeConst.IMAGE)
            .build();

    @NestedConfigurationProperty
    protected StorageItemProperties groupProfilePicture = new StorageItemProperties().toBuilder()
            .allowedContentType(MediaTypeConst.IMAGE)
            .build();

    @NestedConfigurationProperty
    protected StorageItemProperties messageAttachment = new StorageItemProperties();

}