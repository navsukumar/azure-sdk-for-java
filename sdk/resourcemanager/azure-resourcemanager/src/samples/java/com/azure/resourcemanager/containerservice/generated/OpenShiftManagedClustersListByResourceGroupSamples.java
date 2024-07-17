// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/**
 * Samples for OpenShiftManagedClusters ListByResourceGroup.
 */
public final class OpenShiftManagedClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-04-30/examples/
     * OpenShiftManagedClustersListByResourceGroup.json
     */
    /**
     * Sample code: Get Managed Clusters by Resource Group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getManagedClustersByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getOpenShiftManagedClusters()
            .listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
