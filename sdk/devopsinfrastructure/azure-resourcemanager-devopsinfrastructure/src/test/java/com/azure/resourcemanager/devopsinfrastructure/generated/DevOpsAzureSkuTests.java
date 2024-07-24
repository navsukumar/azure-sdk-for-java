// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devopsinfrastructure.models.DevOpsAzureSku;
import org.junit.jupiter.api.Assertions;

public final class DevOpsAzureSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DevOpsAzureSku model = BinaryData.fromString("{\"name\":\"wgcu\"}").toObject(DevOpsAzureSku.class);
        Assertions.assertEquals("wgcu", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DevOpsAzureSku model = new DevOpsAzureSku().withName("wgcu");
        model = BinaryData.fromObject(model).toObject(DevOpsAzureSku.class);
        Assertions.assertEquals("wgcu", model.name());
    }
}
