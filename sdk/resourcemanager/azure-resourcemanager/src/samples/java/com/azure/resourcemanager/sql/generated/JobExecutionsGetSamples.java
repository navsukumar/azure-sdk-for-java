// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import java.util.UUID;

/**
 * Samples for JobExecutions Get.
 */
public final class JobExecutionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/GetJobExecution.json
     */
    /**
     * Sample code: Get a job execution.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAJobExecution(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getJobExecutions()
            .getWithResponse("group1", "server1", "agent1", "job1",
                UUID.fromString("5A86BF65-43AC-F258-2524-9E92992F97CA"), com.azure.core.util.Context.NONE);
    }
}
