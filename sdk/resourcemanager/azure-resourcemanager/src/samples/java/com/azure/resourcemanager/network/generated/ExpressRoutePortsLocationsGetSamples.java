// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRoutePortsLocations Get.
 */
public final class ExpressRoutePortsLocationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/ExpressRoutePortsLocationGet.
     * json
     */
    /**
     * Sample code: ExpressRoutePortsLocationGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRoutePortsLocationGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getExpressRoutePortsLocations()
            .getWithResponse("locationName", com.azure.core.util.Context.NONE);
    }
}
