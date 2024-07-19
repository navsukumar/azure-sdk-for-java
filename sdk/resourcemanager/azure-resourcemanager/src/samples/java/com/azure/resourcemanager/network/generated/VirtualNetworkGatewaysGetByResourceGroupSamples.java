// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworkGateways GetByResourceGroup.
 */
public final class VirtualNetworkGatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/VirtualNetworkGatewayGet.json
     */
    /**
     * Sample code: GetVirtualNetworkGateway.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualNetworkGateway(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .getByResourceGroupWithResponse("rg1", "vpngw", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * VirtualNetworkScalableGatewayGet.json
     */
    /**
     * Sample code: GetVirtualNetworkScalableGateway.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualNetworkScalableGateway(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .getByResourceGroupWithResponse("rg1", "ergw", com.azure.core.util.Context.NONE);
    }
}
