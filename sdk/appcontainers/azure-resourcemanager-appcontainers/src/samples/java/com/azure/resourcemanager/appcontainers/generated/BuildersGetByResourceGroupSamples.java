// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for Builders GetByResourceGroup.
 */
public final class BuildersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/Builders_Get.json
     */
    /**
     * Sample code: Builders_Get_0.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void buildersGet0(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.builders().getByResourceGroupWithResponse("rg", "testBuilder", com.azure.core.util.Context.NONE);
    }
}
