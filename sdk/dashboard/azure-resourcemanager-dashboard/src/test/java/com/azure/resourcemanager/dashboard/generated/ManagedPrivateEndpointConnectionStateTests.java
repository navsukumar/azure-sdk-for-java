// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dashboard.models.ManagedPrivateEndpointConnectionState;

public final class ManagedPrivateEndpointConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpointConnectionState model
            = BinaryData.fromString("{\"status\":\"Pending\",\"description\":\"thfuiuaodsfcpkvx\"}")
                .toObject(ManagedPrivateEndpointConnectionState.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpointConnectionState model = new ManagedPrivateEndpointConnectionState();
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpointConnectionState.class);
    }
}
