// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for Replications Get.
 */
public final class ReplicationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/
     * ReplicationGet.json
     */
    /**
     * Sample code: ReplicationGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void replicationGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries()
            .manager()
            .serviceClient()
            .getReplications()
            .getWithResponse("myResourceGroup", "myRegistry", "myReplication", com.azure.core.util.Context.NONE);
    }
}
