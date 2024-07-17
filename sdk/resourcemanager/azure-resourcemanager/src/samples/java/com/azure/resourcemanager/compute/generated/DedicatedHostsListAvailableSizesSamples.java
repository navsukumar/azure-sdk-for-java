// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for DedicatedHosts ListAvailableSizes.
 */
public final class DedicatedHostsListAvailableSizesSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * dedicatedHostExamples/DedicatedHost_ListAvailableSizes.json
     */
    /**
     * Sample code: Get Available Dedicated Host Sizes.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableDedicatedHostSizes(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHosts()
            .listAvailableSizes("myResourceGroup", "myDedicatedHostGroup", "myHost", com.azure.core.util.Context.NONE);
    }
}
