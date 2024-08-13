// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for LongTermRetentionManagedInstanceBackups ListByResourceGroupInstance.
 */
public final class LongTermRetentionManagedInstanceBackupsListByResourceGroupInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * ResourceGroupBasedManagedInstanceLongTermRetentionBackupListByInstance.json
     */
    /**
     * Sample code: Get all long term retention backups under the managed instance.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getAllLongTermRetentionBackupsUnderTheManagedInstance(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getLongTermRetentionManagedInstanceBackups()
            .listByResourceGroupInstance("testResourceGroup", "japaneast", "testInstance", null, null,
                com.azure.core.util.Context.NONE);
    }
}
