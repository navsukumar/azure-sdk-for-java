// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualApplianceSites Get.
 */
public final class VirtualApplianceSitesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * NetworkVirtualApplianceSiteGet.json
     */
    /**
     * Sample code: GetNetwork Virtual Appliance Site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getNetworkVirtualApplianceSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualApplianceSites()
            .getWithResponse("rg1", "nva", "site1", com.azure.core.util.Context.NONE);
    }
}
