// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for SqlResources MigrateSqlDatabaseToManualThroughput.
 */
public final class SqlResourcesMigrateSqlDatabaseToManualThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/
     * CosmosDBSqlDatabaseMigrateToManualThroughput.json
     */
    /**
     * Sample code: CosmosDBSqlDatabaseMigrateToManualThroughput.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        cosmosDBSqlDatabaseMigrateToManualThroughput(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .migrateSqlDatabaseToManualThroughput("rg1", "ddb1", "databaseName", com.azure.core.util.Context.NONE);
    }
}
