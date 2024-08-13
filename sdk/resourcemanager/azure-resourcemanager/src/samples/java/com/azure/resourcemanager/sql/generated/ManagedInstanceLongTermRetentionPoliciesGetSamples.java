// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.ManagedInstanceLongTermRetentionPolicyName;

/**
 * Samples for ManagedInstanceLongTermRetentionPolicies Get.
 */
public final class ManagedInstanceLongTermRetentionPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * ManagedInstanceLongTermRetentionPolicyGet.json
     */
    /**
     * Sample code: Get the long term retention policy for the managed database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getTheLongTermRetentionPolicyForTheManagedDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstanceLongTermRetentionPolicies()
            .getWithResponse("testResourceGroup", "testInstance", "testDatabase",
                ManagedInstanceLongTermRetentionPolicyName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
