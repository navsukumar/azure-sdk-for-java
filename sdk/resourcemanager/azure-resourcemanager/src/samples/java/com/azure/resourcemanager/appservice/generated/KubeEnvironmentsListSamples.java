// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for KubeEnvironments List.
 */
public final class KubeEnvironmentsListSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/KubeEnvironments_ListBySubscription.
     * json
     */
    /**
     * Sample code: List kube environments by subscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listKubeEnvironmentsBySubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getKubeEnvironments().list(com.azure.core.util.Context.NONE);
    }
}
