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

package im.turms.server.common.property.env.gateway;


import com.fasterxml.jackson.annotation.JsonView;
import im.turms.server.common.factory.NotificationFactory;
import im.turms.server.common.property.env.common.ClientApiLoggingProperties;
import im.turms.server.common.property.metadata.annotation.Description;
import im.turms.server.common.property.metadata.annotation.GlobalProperty;
import im.turms.server.common.property.metadata.view.MutablePropertiesView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import javax.validation.constraints.Min;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class ClientApiProperties {

    @Description("The minimum allowed interval between client requests. " +
            "If 0, there is no debounce. " +
            "It's better set the same value as client's for a better UX.")
    @GlobalProperty
    @JsonView(MutablePropertiesView.class)
    @Min(0)
    private int minClientRequestIntervalMillis;

    @Description("Whether to return the reason for the server error to the client. " +
            "Note: 1. It may reveal sensitive data like the IP of internal servers if true; " +
            "2. turms-gateway never return the information of stack traces no matter it is true or false.")
    private boolean returnReasonForServerError;

    @NestedConfigurationProperty
    private ClientApiLoggingProperties logging = new ClientApiLoggingProperties();

    public void setReturnReasonForServerError(boolean returnReasonForServerError) {
        this.returnReasonForServerError = returnReasonForServerError;
        NotificationFactory.returnReasonForServerError = returnReasonForServerError;
    }

}