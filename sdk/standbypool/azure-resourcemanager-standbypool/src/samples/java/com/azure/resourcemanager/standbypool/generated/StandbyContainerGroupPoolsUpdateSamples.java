// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.resourcemanager.standbypool.models.ContainerGroupProfile;
import com.azure.resourcemanager.standbypool.models.ContainerGroupProperties;
import com.azure.resourcemanager.standbypool.models.RefillPolicy;
import com.azure.resourcemanager.standbypool.models.StandbyContainerGroupPoolElasticityProfile;
import com.azure.resourcemanager.standbypool.models.StandbyContainerGroupPoolResource;
import com.azure.resourcemanager.standbypool.models.StandbyContainerGroupPoolResourceUpdateProperties;
import com.azure.resourcemanager.standbypool.models.Subnet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for StandbyContainerGroupPools Update.
 */
public final class StandbyContainerGroupPoolsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/standbypool/StandbyPool.Management/examples/2024-03-01-preview/StandbyContainerGroupPools_Update.
     * json
     */
    /**
     * Sample code: StandbyContainerGroupPools_Update.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void
        standbyContainerGroupPoolsUpdate(com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        StandbyContainerGroupPoolResource resource = manager.standbyContainerGroupPools()
            .getByResourceGroupWithResponse("rgstandbypool", "pool", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf())
            .withProperties(new StandbyContainerGroupPoolResourceUpdateProperties()
                .withElasticityProfile(new StandbyContainerGroupPoolElasticityProfile().withMaxReadyCapacity(1743L)
                    .withRefillPolicy(RefillPolicy.ALWAYS))
                .withContainerGroupProperties(new ContainerGroupProperties()
                    .withContainerGroupProfile(new ContainerGroupProfile().withId(
                        "/subscriptions/00000000-0000-0000-0000-000000000009/resourceGroups/rgstandbypool/providers/Microsoft.ContainerInstance/containerGroupProfiles/cgProfile")
                        .withRevision(2L))
                    .withSubnetIds(Arrays.asList(new Subnet().withId(
                        "/subscriptions/00000000-0000-0000-0000-000000000009/resourceGroups/rgstandbypool/providers/Microsoft.Network/virtualNetworks/cgSubnet/subnets/cgSubnet")))))
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
