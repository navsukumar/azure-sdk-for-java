// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.OrchestrationServiceNames;
import com.azure.resourcemanager.compute.models.OrchestrationServiceStateAction;
import com.azure.resourcemanager.compute.models.OrchestrationServiceStateInput;

/**
 * Samples for VirtualMachineScaleSets SetOrchestrationServiceState.
 */
public final class VirtualMachineScaleSetsSetOrchestrationServiceStateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_SetOrchestrationServiceState_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_SetOrchestrationServiceState_MinimumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetSetOrchestrationServiceStateMinimumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .setOrchestrationServiceState("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaa",
                new OrchestrationServiceStateInput().withServiceName(OrchestrationServiceNames.AUTOMATIC_REPAIRS)
                    .withAction(OrchestrationServiceStateAction.RESUME),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_SetOrchestrationServiceState_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_SetOrchestrationServiceState_MaximumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetSetOrchestrationServiceStateMaximumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .setOrchestrationServiceState("rgcompute", "aaaaaaaaaaaaaaaa",
                new OrchestrationServiceStateInput().withServiceName(OrchestrationServiceNames.AUTOMATIC_REPAIRS)
                    .withAction(OrchestrationServiceStateAction.RESUME),
                com.azure.core.util.Context.NONE);
    }
}
