// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for RestorableTableResources List.
 */
public final class RestorableTableResourcesListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/
     * CosmosDBRestorableTableResourceList.json
     */
    /**
     * Sample code: CosmosDBRestorableTableResourceList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBRestorableTableResourceList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getRestorableTableResources()
            .list("WestUS", "d9b26648-2f53-4541-b3d8-3044f4f9810d", "WestUS", "06/01/2022 4:56",
                com.azure.core.util.Context.NONE);
    }
}
