// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for P2SVpnGateways List.
 */
public final class P2SVpnGatewaysListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/P2SVpnGatewayList.json
     */
    /**
     * Sample code: P2SVpnGatewayListBySubscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void p2SVpnGatewayListBySubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getP2SVpnGateways().list(com.azure.core.util.Context.NONE);
    }
}
