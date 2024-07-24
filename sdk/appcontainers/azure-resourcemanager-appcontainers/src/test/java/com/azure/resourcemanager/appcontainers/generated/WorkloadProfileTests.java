// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.WorkloadProfile;
import org.junit.jupiter.api.Assertions;

public final class WorkloadProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadProfile model = BinaryData.fromString(
            "{\"name\":\"ohrdddt\",\"workloadProfileType\":\"gxqbawpcb\",\"minimumCount\":2068748786,\"maximumCount\":1409471968}")
            .toObject(WorkloadProfile.class);
        Assertions.assertEquals("ohrdddt", model.name());
        Assertions.assertEquals("gxqbawpcb", model.workloadProfileType());
        Assertions.assertEquals(2068748786, model.minimumCount());
        Assertions.assertEquals(1409471968, model.maximumCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadProfile model = new WorkloadProfile().withName("ohrdddt")
            .withWorkloadProfileType("gxqbawpcb")
            .withMinimumCount(2068748786)
            .withMaximumCount(1409471968);
        model = BinaryData.fromObject(model).toObject(WorkloadProfile.class);
        Assertions.assertEquals("ohrdddt", model.name());
        Assertions.assertEquals("gxqbawpcb", model.workloadProfileType());
        Assertions.assertEquals(2068748786, model.minimumCount());
        Assertions.assertEquals(1409471968, model.maximumCount());
    }
}
