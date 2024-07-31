// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.VmManagedIdentity;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VmManagedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmManagedIdentity model
            = BinaryData.fromString("{\"userAssignedIdentities\":[\"nk\",\"xu\"]}").toObject(VmManagedIdentity.class);
        Assertions.assertEquals("nk", model.userAssignedIdentities().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmManagedIdentity model = new VmManagedIdentity().withUserAssignedIdentities(Arrays.asList("nk", "xu"));
        model = BinaryData.fromObject(model).toObject(VmManagedIdentity.class);
        Assertions.assertEquals("nk", model.userAssignedIdentities().get(0));
    }
}
