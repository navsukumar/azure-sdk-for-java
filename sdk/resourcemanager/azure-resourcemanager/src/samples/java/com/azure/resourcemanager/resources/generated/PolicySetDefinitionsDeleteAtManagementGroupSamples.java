// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for PolicySetDefinitions DeleteAtManagementGroup.
 */
public final class PolicySetDefinitionsDeleteAtManagementGroupSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/
     * deletePolicySetDefinitionAtManagementGroup.json
     */
    /**
     * Sample code: Delete a policy set definition at management group level.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        deleteAPolicySetDefinitionAtManagementGroupLevel(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .policyClient()
            .getPolicySetDefinitions()
            .deleteAtManagementGroupWithResponse("CostManagement", "MyManagementGroup",
                com.azure.core.util.Context.NONE);
    }
}
