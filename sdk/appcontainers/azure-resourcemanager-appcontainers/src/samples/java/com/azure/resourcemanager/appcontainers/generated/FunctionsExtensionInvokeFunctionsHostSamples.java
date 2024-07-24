// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for FunctionsExtension InvokeFunctionsHost.
 */
public final class FunctionsExtensionInvokeFunctionsHostSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-02-02-preview/examples/FunctionsExtension_Post.json
     */
    /**
     * Sample code: Invoke Functions host using Functions Extension API.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void invokeFunctionsHostUsingFunctionsExtensionAPI(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.functionsExtensions()
            .invokeFunctionsHostWithResponse("rg", "testcontainerApp0", "testcontainerApp0-pjxhsye",
                "testcontainerApp0", com.azure.core.util.Context.NONE);
    }
}
