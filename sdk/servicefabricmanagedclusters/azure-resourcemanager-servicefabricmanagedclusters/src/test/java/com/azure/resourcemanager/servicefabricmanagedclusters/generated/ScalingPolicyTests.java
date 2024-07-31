// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ScalingMechanism;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ScalingPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ScalingTrigger;

public final class ScalingPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScalingPolicy model = BinaryData.fromString(
            "{\"scalingMechanism\":{\"kind\":\"ScalingMechanism\"},\"scalingTrigger\":{\"kind\":\"ScalingTrigger\"}}")
            .toObject(ScalingPolicy.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScalingPolicy model
            = new ScalingPolicy().withScalingMechanism(new ScalingMechanism()).withScalingTrigger(new ScalingTrigger());
        model = BinaryData.fromObject(model).toObject(ScalingPolicy.class);
    }
}
