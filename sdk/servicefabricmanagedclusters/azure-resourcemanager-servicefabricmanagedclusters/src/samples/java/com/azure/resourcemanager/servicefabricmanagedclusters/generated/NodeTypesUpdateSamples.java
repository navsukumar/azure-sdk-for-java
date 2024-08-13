// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.resourcemanager.servicefabricmanagedclusters.models.NodeType;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.NodeTypeSku;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for NodeTypes Update.
 */
public final class NodeTypesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/servicefabricmanagedclusters/resource-manager/Microsoft.ServiceFabric/stable/2024-04-01/examples/
     * NodeTypePatchOperation_example.json
     */
    /**
     * Sample code: Patch a node type.
     * 
     * @param manager Entry point to ServiceFabricManagedClustersManager.
     */
    public static void patchANodeType(
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager) {
        NodeType resource = manager.nodeTypes()
            .getWithResponse("resRg", "myCluster", "BE", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("a", "b")).apply();
    }

    /*
     * x-ms-original-file:
     * specification/servicefabricmanagedclusters/resource-manager/Microsoft.ServiceFabric/stable/2024-04-01/examples/
     * NodeTypePatchOperationAutoScale_example.json
     */
    /**
     * Sample code: Patch a node type while auto-scaling.
     * 
     * @param manager Entry point to ServiceFabricManagedClustersManager.
     */
    public static void patchANodeTypeWhileAutoScaling(
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager) {
        NodeType resource = manager.nodeTypes()
            .getWithResponse("resRg", "myCluster", "BE", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("a", "b"))
            .withSku(new NodeTypeSku().withName("Standard_S0").withTier("Standard").withCapacity(10))
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
