// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.TrustedExternalTenant;
import org.junit.jupiter.api.Assertions;

public final class TrustedExternalTenantTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrustedExternalTenant model =
            BinaryData.fromString("{\"value\":\"tazak\"}").toObject(TrustedExternalTenant.class);
        Assertions.assertEquals("tazak", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrustedExternalTenant model = new TrustedExternalTenant().withValue("tazak");
        model = BinaryData.fromObject(model).toObject(TrustedExternalTenant.class);
        Assertions.assertEquals("tazak", model.value());
    }
}
