// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolElasticityProfile;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResource;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceUpdateProperties;
import com.azure.resourcemanager.standbypool.models.VirtualMachineState;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for StandbyVirtualMachinePools Update.
 */
public final class StandbyVirtualMachinePoolsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/standbypool/StandbyPool.Management/examples/2024-03-01-preview/StandbyVirtualMachinePools_Update.
     * json
     */
    /**
     * Sample code: StandbyVirtualMachinePools_Update.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void
        standbyVirtualMachinePoolsUpdate(com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        StandbyVirtualMachinePoolResource resource = manager.standbyVirtualMachinePools()
            .getByResourceGroupWithResponse("rgstandbypool", "pool", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf())
            .withProperties(new StandbyVirtualMachinePoolResourceUpdateProperties()
                .withElasticityProfile(new StandbyVirtualMachinePoolElasticityProfile().withMaxReadyCapacity(304L)
                    .withMinReadyCapacity(300L))
                .withVirtualMachineState(VirtualMachineState.RUNNING)
                .withAttachedVirtualMachineScaleSetId(
                    "/subscriptions/00000000-0000-0000-0000-000000000009/resourceGroups/rgstandbypool/providers/Microsoft.Compute/virtualMachineScaleSets/myVmss"))
            .apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
