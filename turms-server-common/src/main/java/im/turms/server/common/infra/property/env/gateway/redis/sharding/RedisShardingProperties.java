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

package im.turms.server.common.infra.property.env.gateway.redis.sharding;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import im.turms.server.common.storage.redis.sharding.ConsistentHashingShardingAlgorithm;
import im.turms.server.common.storage.redis.sharding.ShardingAlgorithm;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class RedisShardingProperties {

    protected static final ShardingAlgorithm DEFAULT_SHARDING_ALGORITHM =
            new ConsistentHashingShardingAlgorithm();

    protected ShardingAlgorithm algorithmForSession = DEFAULT_SHARDING_ALGORITHM;

    protected ShardingAlgorithm algorithmForLocation = DEFAULT_SHARDING_ALGORITHM;

}