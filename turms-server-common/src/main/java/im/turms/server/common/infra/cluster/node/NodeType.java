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

package im.turms.server.common.infra.cluster.node;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Getter
public enum NodeType {
    AI_SERVING("turms-ai-serving", "Turms AI Serving"),
    GATEWAY("turms-gateway", "Turms Gateway"),
    SERVICE("turms-service", "Turms Service"),
    // This is a special node type for the tests
    // that don't belong to any other node type.
    MOCK("turms-mock", "Turms Mock");

    private final String id;
    private final String displayName;
}