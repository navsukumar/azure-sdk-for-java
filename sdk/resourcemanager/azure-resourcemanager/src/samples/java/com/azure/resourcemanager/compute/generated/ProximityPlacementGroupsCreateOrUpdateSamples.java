// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.fluent.models.ProximityPlacementGroupInner;
import com.azure.resourcemanager.compute.models.ProximityPlacementGroupPropertiesIntent;
import com.azure.resourcemanager.compute.models.ProximityPlacementGroupType;
import java.util.Arrays;

/**
 * Samples for ProximityPlacementGroups CreateOrUpdate.
 */
public final class ProximityPlacementGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * proximityPlacementGroupExamples/ProximityPlacementGroup_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update a proximity placement group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAProximityPlacementGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getProximityPlacementGroups()
            .createOrUpdateWithResponse("myResourceGroup", "myProximityPlacementGroup",
                new ProximityPlacementGroupInner().withLocation("westus")
                    .withZones(Arrays.asList("1"))
                    .withProximityPlacementGroupType(ProximityPlacementGroupType.STANDARD)
                    .withIntent(new ProximityPlacementGroupPropertiesIntent()
                        .withVmSizes(Arrays.asList("Basic_A0", "Basic_A2"))),
                com.azure.core.util.Context.NONE);
    }
}
