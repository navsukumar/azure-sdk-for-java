// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworkGateways GetVpnProfilePackageUrl.
 */
public final class VirtualNetworkGatewaysGetVpnProfilePackageUrlSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * VirtualNetworkGatewayGetVpnProfilePackageUrl.json
     */
    /**
     * Sample code: GetVirtualNetworkGatewayVPNProfilePackageURL.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getVirtualNetworkGatewayVPNProfilePackageURL(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .getVpnProfilePackageUrl("rg1", "vpngw", com.azure.core.util.Context.NONE);
    }
}
