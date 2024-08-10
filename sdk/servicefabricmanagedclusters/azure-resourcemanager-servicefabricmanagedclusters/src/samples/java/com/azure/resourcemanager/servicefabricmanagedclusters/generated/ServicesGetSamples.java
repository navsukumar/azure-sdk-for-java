// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

/**
 * Samples for Services Get.
 */
public final class ServicesGetSamples {
    /*
     * x-ms-original-file:
     * specification/servicefabricmanagedclusters/resource-manager/Microsoft.ServiceFabric/stable/2024-04-01/examples/
     * ServiceGetOperation_example.json
     */
    /**
     * Sample code: Get a service.
     * 
     * @param manager Entry point to ServiceFabricManagedClustersManager.
     */
    public static void getAService(
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager) {
        manager.services()
            .getWithResponse("resRg", "myCluster", "myApp", "myService", com.azure.core.util.Context.NONE);
    }
}
