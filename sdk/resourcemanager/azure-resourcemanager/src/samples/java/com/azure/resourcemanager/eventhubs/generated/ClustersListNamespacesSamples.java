// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

/**
 * Samples for Clusters ListNamespaces.
 */
public final class ClustersListNamespacesSamples {
    /*
     * x-ms-original-file:
     * specification/eventhub/resource-manager/Microsoft.EventHub/stable/2024-01-01/examples/Clusters/
     * ListNamespacesInClusterGet.json
     */
    /**
     * Sample code: ListNamespacesInCluster.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listNamespacesInCluster(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.eventHubs()
            .manager()
            .serviceClient()
            .getClusters()
            .listNamespacesWithResponse("myResourceGroup", "testCluster", com.azure.core.util.Context.NONE);
    }
}
