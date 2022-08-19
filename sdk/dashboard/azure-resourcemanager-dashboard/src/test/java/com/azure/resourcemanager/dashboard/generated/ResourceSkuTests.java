// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dashboard.models.ResourceSku;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceSkuTests {
    @Test
    public void testDeserialize() {
        ResourceSku model = BinaryData.fromString("{\"name\":\"skcqvkocrcjd\"}").toObject(ResourceSku.class);
        Assertions.assertEquals("skcqvkocrcjd", model.name());
    }

    @Test
    public void testSerialize() {
        ResourceSku model = new ResourceSku().withName("skcqvkocrcjd");
        model = BinaryData.fromObject(model).toObject(ResourceSku.class);
        Assertions.assertEquals("skcqvkocrcjd", model.name());
    }
}
