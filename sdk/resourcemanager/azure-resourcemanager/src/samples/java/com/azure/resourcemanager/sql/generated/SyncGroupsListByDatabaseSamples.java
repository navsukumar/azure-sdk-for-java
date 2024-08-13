// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for SyncGroups ListByDatabase.
 */
public final class SyncGroupsListByDatabaseSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/SyncGroupListByDatabase.json
     */
    /**
     * Sample code: List sync groups under a given database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listSyncGroupsUnderAGivenDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getSyncGroups()
            .listByDatabase("syncgroupcrud-65440", "syncgroupcrud-8475", "syncgroupcrud-4328",
                com.azure.core.util.Context.NONE);
    }
}
