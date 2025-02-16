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

package im.turms.server.common.storage.redis.sharding;

/**
 * @author James Chen
 */
public class ConsistentHashingShardingAlgorithm extends ShardingAlgorithm {

    private static final int SLOT_COUNT = 1 << 16;
    private static final long SLOT_MASK = SLOT_COUNT - 1L;

    @Override
    public int doSharding(long shardKey, int serverCount) {
        int slot = (int) (shardKey & SLOT_MASK);
        int span = SLOT_COUNT / serverCount;
        return slot / span;
    }

}