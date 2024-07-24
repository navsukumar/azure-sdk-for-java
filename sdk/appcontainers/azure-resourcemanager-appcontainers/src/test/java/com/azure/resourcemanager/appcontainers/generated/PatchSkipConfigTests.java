// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.PatchSkipConfig;
import org.junit.jupiter.api.Assertions;

public final class PatchSkipConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchSkipConfig model = BinaryData.fromString("{\"skip\":false}").toObject(PatchSkipConfig.class);
        Assertions.assertEquals(false, model.skip());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchSkipConfig model = new PatchSkipConfig().withSkip(false);
        model = BinaryData.fromObject(model).toObject(PatchSkipConfig.class);
        Assertions.assertEquals(false, model.skip());
    }
}
