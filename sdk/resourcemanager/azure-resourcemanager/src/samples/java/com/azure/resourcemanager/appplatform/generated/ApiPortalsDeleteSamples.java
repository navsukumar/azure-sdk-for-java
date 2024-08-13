// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for ApiPortals Delete.
 */
public final class ApiPortalsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/ApiPortals_Delete.
     * json
     */
    /**
     * Sample code: ApiPortals_Delete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void apiPortalsDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getApiPortals()
            .delete("myResourceGroup", "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
