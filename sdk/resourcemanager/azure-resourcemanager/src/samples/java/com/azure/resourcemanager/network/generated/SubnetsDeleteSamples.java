// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for Subnets Delete.
 */
public final class SubnetsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/SubnetDelete.json
     */
    /**
     * Sample code: Delete subnet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteSubnet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getSubnets()
            .delete("subnet-test", "vnetname", "subnet1", com.azure.core.util.Context.NONE);
    }
}
