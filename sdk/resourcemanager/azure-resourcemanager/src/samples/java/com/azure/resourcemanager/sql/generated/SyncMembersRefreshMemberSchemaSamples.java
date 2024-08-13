// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for SyncMembers RefreshMemberSchema.
 */
public final class SyncMembersRefreshMemberSchemaSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/SyncMemberRefreshSchema.json
     */
    /**
     * Sample code: Refresh a sync member database schema.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void refreshASyncMemberDatabaseSchema(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getSyncMembers()
            .refreshMemberSchema("syncgroupcrud-65440", "syncgroupcrud-8475", "syncgroupcrud-4328",
                "syncgroupcrud-3187", "syncgroupcrud-4879", com.azure.core.util.Context.NONE);
    }
}
