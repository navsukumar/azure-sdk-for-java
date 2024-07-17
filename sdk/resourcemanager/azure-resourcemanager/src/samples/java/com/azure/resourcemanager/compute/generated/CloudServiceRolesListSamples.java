// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for CloudServiceRoles List.
 */
public final class CloudServiceRolesListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-09-04/examples/
     * CloudServiceRole_List.json
     */
    /**
     * Sample code: List Roles in a Cloud Service.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listRolesInACloudService(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getCloudServiceRoles()
            .list("ConstosoRG", "{cs-name}", com.azure.core.util.Context.NONE);
    }
}
