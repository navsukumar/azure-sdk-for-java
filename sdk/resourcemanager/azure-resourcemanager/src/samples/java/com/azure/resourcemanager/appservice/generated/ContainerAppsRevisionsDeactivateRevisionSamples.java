// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for ContainerAppsRevisions DeactivateRevision.
 */
public final class ContainerAppsRevisionsDeactivateRevisionSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/DeactivateRevision.json
     */
    /**
     * Sample code: Deactivate Container App's revision.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deactivateContainerAppSRevision(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getContainerAppsRevisions()
            .deactivateRevisionWithResponse("rg", "testcontainerApp0", "testcontainerApp0-pjxhsye",
                com.azure.core.util.Context.NONE);
    }
}
