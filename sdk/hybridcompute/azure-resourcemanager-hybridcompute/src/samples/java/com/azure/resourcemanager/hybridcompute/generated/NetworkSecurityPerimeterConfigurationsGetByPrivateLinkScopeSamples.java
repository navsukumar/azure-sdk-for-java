// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for NetworkSecurityPerimeterConfigurations GetByPrivateLinkScope.
 */
public final class NetworkSecurityPerimeterConfigurationsGetByPrivateLinkScopeSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-05-20-preview/examples/
     * networkSecurityPerimeterConfiguration/NetworkSecurityPerimeterConfigurationGet.json
     */
    /**
     * Sample code: Gets the network security perimeter configuration of the private link scope.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void getsTheNetworkSecurityPerimeterConfigurationOfThePrivateLinkScope(
        com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.networkSecurityPerimeterConfigurations()
            .getByPrivateLinkScopeWithResponse("my-resource-group", "my-privatelinkscope",
                "aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee.myAssociation", com.azure.core.util.Context.NONE);
    }
}
