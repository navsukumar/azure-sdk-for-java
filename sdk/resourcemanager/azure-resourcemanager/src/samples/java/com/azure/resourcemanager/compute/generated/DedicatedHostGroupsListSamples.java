// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for DedicatedHostGroups List.
 */
public final class DedicatedHostGroupsListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * dedicatedHostExamples/DedicatedHostGroup_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroup_ListBySubscription_MaximumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        dedicatedHostGroupListBySubscriptionMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHostGroups()
            .list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * dedicatedHostExamples/DedicatedHostGroup_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroup_ListBySubscription_MinimumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        dedicatedHostGroupListBySubscriptionMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHostGroups()
            .list(com.azure.core.util.Context.NONE);
    }
}
