// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for WorkloadGroups Get.
 */
public final class WorkloadGroupsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/GetWorkloadGroup.json
     */
    /**
     * Sample code: Gets a workload group for a data warehouse.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsAWorkloadGroupForADataWarehouse(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getWorkloadGroups()
            .getWithResponse("Default-SQL-SouthEastAsia", "testsvr", "testdb", "smallrc",
                com.azure.core.util.Context.NONE);
    }
}
