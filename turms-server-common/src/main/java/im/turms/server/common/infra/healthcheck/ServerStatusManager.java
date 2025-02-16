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

package im.turms.server.common.infra.healthcheck;

import org.springframework.stereotype.Component;

import im.turms.server.common.infra.application.TurmsApplicationContext;
import im.turms.server.common.infra.cluster.node.Node;

/**
 * @author James Chen
 */
@Component
public class ServerStatusManager {

    private final TurmsApplicationContext context;
    private final Node node;
    private final HealthCheckManager healthCheckManager;

    public ServerStatusManager(
            TurmsApplicationContext context,
            Node node,
            HealthCheckManager healthCheckManager) {
        this.context = context;
        this.node = node;
        this.healthCheckManager = healthCheckManager;
    }

    public ServiceAvailability getServiceAvailability() {
        if (context.isClosing()) {
            return ServiceAvailability.SHUTTING_DOWN;
        }
        if (!node.isActive()) {
            return ServiceAvailability.INACTIVE;
        }
        String unhealthyReason = healthCheckManager.getCpuUnhealthyReason();
        if (unhealthyReason != null) {
            return new ServiceAvailability(
                    ServiceAvailability.Status.HIGH_CPU_USAGE,
                    unhealthyReason);
        }
        unhealthyReason = healthCheckManager.getMemoryUnhealthyReason();
        if (unhealthyReason != null) {
            return new ServiceAvailability(
                    ServiceAvailability.Status.INSUFFICIENT_MEMORY,
                    unhealthyReason);
        }
        return ServiceAvailability.AVAILABLE;
    }

}