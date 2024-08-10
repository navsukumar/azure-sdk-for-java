// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ConnectedEnvironmentsStorages Delete.
 */
public final class ConnectedEnvironmentsStoragesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/stable/2024-03-01/examples/ConnectedEnvironmentsStorages_Delete.
     * json
     */
    /**
     * Sample code: List environments storages by subscription.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsStoragesBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironmentsStorages()
            .deleteWithResponse("examplerg", "env", "jlaw-demo1", com.azure.core.util.Context.NONE);
    }
}
