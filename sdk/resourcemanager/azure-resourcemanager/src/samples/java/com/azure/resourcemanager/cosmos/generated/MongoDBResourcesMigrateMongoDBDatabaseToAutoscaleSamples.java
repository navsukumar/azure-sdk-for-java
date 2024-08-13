// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for MongoDBResources MigrateMongoDBDatabaseToAutoscale.
 */
public final class MongoDBResourcesMigrateMongoDBDatabaseToAutoscaleSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/
     * CosmosDBMongoDBDatabaseMigrateToAutoscale.json
     */
    /**
     * Sample code: CosmosDBMongoDBDatabaseMigrateToAutoscale.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoDBDatabaseMigrateToAutoscale(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoDBResources()
            .migrateMongoDBDatabaseToAutoscale("rg1", "ddb1", "databaseName", com.azure.core.util.Context.NONE);
    }
}
