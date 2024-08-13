// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ResourceProvider JobExecution.
 */
public final class ResourceProviderJobExecutionSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/stable/2024-03-01/examples/Job_Execution_Get.json
     */
    /**
     * Sample code: Get a single Job Execution.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getASingleJobExecution(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.resourceProviders()
            .jobExecutionWithResponse("rg", "testcontainerappsjob0", "jobExecution1", com.azure.core.util.Context.NONE);
    }
}
