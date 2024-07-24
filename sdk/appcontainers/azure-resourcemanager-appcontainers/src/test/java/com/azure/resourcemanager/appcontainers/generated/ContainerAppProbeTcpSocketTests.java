// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeTcpSocket;
import org.junit.jupiter.api.Assertions;

public final class ContainerAppProbeTcpSocketTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerAppProbeTcpSocket model = BinaryData.fromString("{\"host\":\"aifmvikl\",\"port\":654040507}")
            .toObject(ContainerAppProbeTcpSocket.class);
        Assertions.assertEquals("aifmvikl", model.host());
        Assertions.assertEquals(654040507, model.port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerAppProbeTcpSocket model = new ContainerAppProbeTcpSocket().withHost("aifmvikl").withPort(654040507);
        model = BinaryData.fromObject(model).toObject(ContainerAppProbeTcpSocket.class);
        Assertions.assertEquals("aifmvikl", model.host());
        Assertions.assertEquals(654040507, model.port());
    }
}
