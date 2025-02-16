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

package unit.im.turms.server.common.infra.plugin.hidden;

import im.turms.plugin.MyExtensionPoint;
import im.turms.server.common.infra.cluster.service.rpc.RpcService;
import im.turms.server.common.infra.plugin.ExtensionPointMethod;
import im.turms.server.common.infra.plugin.TurmsExtension;
import im.turms.server.common.infra.thread.ThreadUtil;

/**
 * @author James Chen
 */
public class MyExtension extends TurmsExtension implements MyExtensionPoint {

    // Used for testing.
    public Class<RpcService> rpcServiceClass = RpcService.class;

    @ExtensionPointMethod
    @Override
    public boolean testBool() {
        return true;
    }

    public Class<ThreadUtil> getThreadUtilClass() {
        return ThreadUtil.class;
    }

}