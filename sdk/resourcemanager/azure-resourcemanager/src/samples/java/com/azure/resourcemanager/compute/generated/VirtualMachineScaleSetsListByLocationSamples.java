// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachineScaleSets ListByLocation.
 */
public final class VirtualMachineScaleSetsListByLocationSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_ListBySubscription_ByLocation.json
     */
    /**
     * Sample code: Lists all the VM scale sets under the specified subscription for the specified location.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listsAllTheVMScaleSetsUnderTheSpecifiedSubscriptionForTheSpecifiedLocation(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .listByLocation("eastus", com.azure.core.util.Context.NONE);
    }
}
