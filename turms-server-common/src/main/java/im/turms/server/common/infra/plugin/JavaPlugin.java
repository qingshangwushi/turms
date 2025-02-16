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

package im.turms.server.common.infra.plugin;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.Accessors;

/**
 * @author James Chen
 */
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Value
public class JavaPlugin extends Plugin {
    PluginClassLoader pluginClassLoader;

    public JavaPlugin(
            PluginDescriptor descriptor,
            List<TurmsExtension> extensions,
            PluginClassLoader pluginClassLoader) {
        super(descriptor, extensions);
        this.pluginClassLoader = pluginClassLoader;
    }

    @Override
    public void close() {
        try {
            pluginClassLoader.close();
        } catch (Exception e) {
            throw new RuntimeException("Caught an error while closing the plugin class loader", e);
        }
    }

}