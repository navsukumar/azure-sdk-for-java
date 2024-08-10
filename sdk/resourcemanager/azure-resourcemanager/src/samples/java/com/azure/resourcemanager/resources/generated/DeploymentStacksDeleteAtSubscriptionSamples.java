// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for DeploymentStacks DeleteAtSubscription.
 */
public final class DeploymentStacksDeleteAtSubscriptionSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2024-03-01/examples/
     * DeploymentStackSubscriptionDelete.json
     */
    /**
     * Sample code: DeploymentStacksSubscriptionDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deploymentStacksSubscriptionDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .deploymentStackClient()
            .getDeploymentStacks()
            .deleteAtSubscription("simpleDeploymentStack", null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
