// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for Provider GetFunctionAppStacksForLocation.
 */
public final class ProviderGetFunctionAppStacksForLocationSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetFunctionAppStacksForLocation.json
     */
    /**
     * Sample code: Get Locations Function App Stacks.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getLocationsFunctionAppStacks(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getProviders()
            .getFunctionAppStacksForLocation("westus", null, com.azure.core.util.Context.NONE);
    }
}
