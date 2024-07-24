// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ManagedEnvironmentPrivateEndpointConnections List.
 */
public final class ManagedEnvironmentPrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/
     * ManagedEnvironmentPrivateEndpointConnections_List.json
     */
    /**
     * Sample code: List Private Endpoint Connections by Managed Environment.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listPrivateEndpointConnectionsByManagedEnvironment(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentPrivateEndpointConnections()
            .list("examplerg", "managedEnv", com.azure.core.util.Context.NONE);
    }
}
