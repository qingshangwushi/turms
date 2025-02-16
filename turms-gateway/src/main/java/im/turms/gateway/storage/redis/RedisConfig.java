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

package im.turms.gateway.storage.redis;

import org.springframework.context.annotation.Configuration;

import im.turms.server.common.infra.application.TurmsApplicationContext;
import im.turms.server.common.infra.property.TurmsPropertiesManager;
import im.turms.server.common.storage.redis.BaseRedisConfig;

/**
 * @author James Chen
 */
@Configuration
public class RedisConfig extends BaseRedisConfig {

    protected RedisConfig(
            TurmsApplicationContext context,
            TurmsPropertiesManager propertiesManager) {
        super(context,
                propertiesManager.getLocalProperties()
                        .getGateway()
                        .getRedis(),
                propertiesManager.getLocalProperties()
                        .getLocation()
                        .isTreatUserIdAndDeviceTypeAsUniqueUser());
    }

}