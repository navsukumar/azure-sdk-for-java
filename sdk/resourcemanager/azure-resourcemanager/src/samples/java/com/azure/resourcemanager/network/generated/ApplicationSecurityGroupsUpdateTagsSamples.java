// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.TagsObject;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ApplicationSecurityGroups UpdateTags.
 */
public final class ApplicationSecurityGroupsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * ApplicationSecurityGroupUpdateTags.json
     */
    /**
     * Sample code: Update application security group tags.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateApplicationSecurityGroupTags(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getApplicationSecurityGroups()
            .updateTagsWithResponse("rg1", "test-asg",
                new TagsObject().withTags(mapOf("tag1", "value1", "tag2", "value2")), com.azure.core.util.Context.NONE);
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
