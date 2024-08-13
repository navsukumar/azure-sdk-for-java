// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for Providers List.
 */
public final class ProvidersListSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2024-03-01/examples/GetProviders.json
     */
    /**
     * Sample code: Get providers.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getProviders(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources().manager().serviceClient().getProviders().list(null, com.azure.core.util.Context.NONE);
    }
}
