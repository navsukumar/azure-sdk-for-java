// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for RestorableGremlinDatabases List.
 */
public final class RestorableGremlinDatabasesListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/
     * CosmosDBRestorableGremlinDatabaseList.json
     */
    /**
     * Sample code: CosmosDBRestorableGremlinDatabaseList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBRestorableGremlinDatabaseList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getRestorableGremlinDatabases()
            .list("WestUS", "d9b26648-2f53-4541-b3d8-3044f4f9810d", com.azure.core.util.Context.NONE);
    }
}
