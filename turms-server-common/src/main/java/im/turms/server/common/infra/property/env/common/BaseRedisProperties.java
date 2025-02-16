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

package im.turms.server.common.infra.property.env.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import im.turms.server.common.storage.redis.RedisProperties;
import im.turms.server.common.storage.redis.SimpleRedisProperties;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public abstract class BaseRedisProperties {

    @NestedConfigurationProperty
    protected transient RedisProperties session = new RedisProperties();

    @NestedConfigurationProperty
    protected transient RedisProperties location = new RedisProperties();

    @NestedConfigurationProperty
    protected transient SimpleRedisProperties ipBlocklist = new SimpleRedisProperties();

    @NestedConfigurationProperty
    protected transient SimpleRedisProperties userIdBlocklist = new SimpleRedisProperties();

}