// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for Gateways GetByResourceGroup.
 */
public final class GatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-05-20-preview/examples/gateway/
     * Gateway_Get.json
     */
    /**
     * Sample code: Get Gateway.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void getGateway(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.gateways()
            .getByResourceGroupWithResponse("myResourceGroup", "{gatewayName}", com.azure.core.util.Context.NONE);
    }
}
