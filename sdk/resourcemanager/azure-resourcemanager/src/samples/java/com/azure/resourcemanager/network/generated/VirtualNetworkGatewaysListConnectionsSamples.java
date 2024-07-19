// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworkGateways ListConnections.
 */
public final class VirtualNetworkGatewaysListConnectionsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * VirtualNetworkGatewaysListConnections.json
     */
    /**
     * Sample code: VirtualNetworkGatewaysListConnections.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualNetworkGatewaysListConnections(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .listConnections("testrg", "test-vpn-gateway-1", com.azure.core.util.Context.NONE);
    }
}
