// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.RunCommandManagedIdentity;
import org.junit.jupiter.api.Assertions;

public final class RunCommandManagedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RunCommandManagedIdentity model = BinaryData.fromString("{\"clientId\":\"ywsuwsy\",\"objectId\":\"ndsytgadg\"}")
            .toObject(RunCommandManagedIdentity.class);
        Assertions.assertEquals("ywsuwsy", model.clientId());
        Assertions.assertEquals("ndsytgadg", model.objectId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RunCommandManagedIdentity model
            = new RunCommandManagedIdentity().withClientId("ywsuwsy").withObjectId("ndsytgadg");
        model = BinaryData.fromObject(model).toObject(RunCommandManagedIdentity.class);
        Assertions.assertEquals("ywsuwsy", model.clientId());
        Assertions.assertEquals("ndsytgadg", model.objectId());
    }
}
