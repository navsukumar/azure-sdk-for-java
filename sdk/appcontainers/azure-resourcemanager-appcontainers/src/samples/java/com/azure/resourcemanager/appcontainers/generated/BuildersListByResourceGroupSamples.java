// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for Builders ListByResourceGroup.
 */
public final class BuildersListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/Builders_ListByResourceGroup
     * .json
     */
    /**
     * Sample code: Builders_ListByResourceGroup_0.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        buildersListByResourceGroup0(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.builders().listByResourceGroup("rg", com.azure.core.util.Context.NONE);
    }
}
