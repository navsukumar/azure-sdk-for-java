// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.models.PoolResourceStateCount;
import org.junit.jupiter.api.Assertions;

public final class PoolResourceStateCountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PoolResourceStateCount model = BinaryData.fromString("{\"state\":\"wzwbnguitn\",\"count\":4695405863379842225}")
            .toObject(PoolResourceStateCount.class);
        Assertions.assertEquals("wzwbnguitn", model.state());
        Assertions.assertEquals(4695405863379842225L, model.count());
    }
}
