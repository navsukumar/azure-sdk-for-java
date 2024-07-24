// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DaprComponentResiliencyPolicyHttpRetryPolicyConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration model = BinaryData.fromString(
            "{\"maxRetries\":1679853059,\"retryBackOff\":{\"initialDelayInMilliseconds\":206316371,\"maxIntervalInMilliseconds\":664347452}}")
            .toObject(DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration.class);
        Assertions.assertEquals(1679853059, model.maxRetries());
        Assertions.assertEquals(206316371, model.retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(664347452, model.retryBackOff().maxIntervalInMilliseconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration model
            = new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1679853059)
                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()
                    .withInitialDelayInMilliseconds(206316371)
                    .withMaxIntervalInMilliseconds(664347452));
        model = BinaryData.fromObject(model).toObject(DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration.class);
        Assertions.assertEquals(1679853059, model.maxRetries());
        Assertions.assertEquals(206316371, model.retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(664347452, model.retryBackOff().maxIntervalInMilliseconds());
    }
}
