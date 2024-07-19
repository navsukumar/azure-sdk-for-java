// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ApplicationGateways ListByResourceGroup.
 */
public final class ApplicationGatewaysListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/ApplicationGatewayList.json
     */
    /**
     * Sample code: Lists all application gateways in a resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listsAllApplicationGatewaysInAResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getApplicationGateways()
            .listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
