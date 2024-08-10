// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ContainerResources;
import org.junit.jupiter.api.Assertions;

public final class ContainerResourcesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerResources model
            = BinaryData.fromString("{\"cpu\":45.36370614352274,\"memory\":\"q\",\"ephemeralStorage\":\"wpmqt\"}")
                .toObject(ContainerResources.class);
        Assertions.assertEquals(45.36370614352274D, model.cpu());
        Assertions.assertEquals("q", model.memory());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerResources model = new ContainerResources().withCpu(45.36370614352274D).withMemory("q");
        model = BinaryData.fromObject(model).toObject(ContainerResources.class);
        Assertions.assertEquals(45.36370614352274D, model.cpu());
        Assertions.assertEquals("q", model.memory());
    }
}
