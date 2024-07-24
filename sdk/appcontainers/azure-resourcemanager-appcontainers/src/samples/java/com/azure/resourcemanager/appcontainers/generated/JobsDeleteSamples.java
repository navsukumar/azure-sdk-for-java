// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for Jobs Delete.
 */
public final class JobsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/Job_Delete.json
     */
    /**
     * Sample code: Delete Container Apps Job.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteContainerAppsJob(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.jobs().delete("rg", "testWorkerContainerAppsJob0", com.azure.core.util.Context.NONE);
    }
}
