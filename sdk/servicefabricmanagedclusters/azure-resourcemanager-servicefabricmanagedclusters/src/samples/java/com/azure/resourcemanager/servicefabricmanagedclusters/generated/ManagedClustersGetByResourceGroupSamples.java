// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

/**
 * Samples for ManagedClusters GetByResourceGroup.
 */
public final class ManagedClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/servicefabricmanagedclusters/resource-manager/Microsoft.ServiceFabric/stable/2024-04-01/examples/
     * ManagedClusterGetOperation_example.json
     */
    /**
     * Sample code: Get a cluster.
     * 
     * @param manager Entry point to ServiceFabricManagedClustersManager.
     */
    public static void getACluster(
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager) {
        manager.managedClusters()
            .getByResourceGroupWithResponse("resRg", "myCluster", com.azure.core.util.Context.NONE);
    }
}
