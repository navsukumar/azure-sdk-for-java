// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ContainerAppsRevisions ListRevisions.
 */
public final class ContainerAppsRevisionsListRevisionsSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/Revisions_List.json
     */
    /**
     * Sample code: List Container App's revisions.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        listContainerAppSRevisions(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsRevisions()
            .listRevisions("rg", "testcontainerApp0", null, com.azure.core.util.Context.NONE);
    }
}
