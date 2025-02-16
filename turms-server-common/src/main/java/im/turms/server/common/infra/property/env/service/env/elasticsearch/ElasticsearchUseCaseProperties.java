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

package im.turms.server.common.infra.property.env.service.env.elasticsearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import im.turms.server.common.infra.property.metadata.Description;

/**
 * @author James Chen
 */
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@Data
@NoArgsConstructor
public abstract class ElasticsearchUseCaseProperties {

    @Description("Whether to enable this use case")
    protected boolean enabled = true;

    // Hide the feature currently because the performance on short texts
    // of most language detection models is too terrible to use.
//    @NestedConfigurationProperty
//    protected ElasticsearchLanguageDetectProperties languageDetect =
//            new ElasticsearchLanguageDetectProperties();

    @NestedConfigurationProperty
    protected ElasticsearchClientProperties client = new ElasticsearchClientProperties();

    @NestedConfigurationProperty
    protected ElasticsearchSyncProperties sync = new ElasticsearchSyncProperties();

    @NestedConfigurationProperty
    protected ElasticsearchMongoProperties mongo = new ElasticsearchMongoProperties();

}