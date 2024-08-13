// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for Services ListByResourceGroup.
 */
public final class ServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/Services_List.json
     */
    /**
     * Sample code: Services_List.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void servicesList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getServices()
            .listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
