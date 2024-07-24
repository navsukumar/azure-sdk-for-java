// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for JavaComponents Delete.
 */
public final class JavaComponentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/JavaComponents_Delete.json
     */
    /**
     * Sample code: Delete Java Component.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteJavaComponent(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.javaComponents()
            .delete("examplerg", "myenvironment", "myjavacomponent", com.azure.core.util.Context.NONE);
    }
}
