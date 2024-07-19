// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

import com.azure.resourcemanager.redis.fluent.models.RedisCacheAccessPolicyAssignmentInner;

/**
 * Samples for AccessPolicyAssignment CreateUpdate.
 */
public final class AccessPolicyAssignmentCreateUpdateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2024-03-01/examples/
     * RedisCacheAccessPolicyAssignmentCreateUpdate.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyAssignmentCreateUpdate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        redisCacheAccessPolicyAssignmentCreateUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.redisCaches()
            .manager()
            .serviceClient()
            .getAccessPolicyAssignments()
            .createUpdate("rg1", "cache1", "accessPolicyAssignmentName1",
                new RedisCacheAccessPolicyAssignmentInner().withObjectId("6497c918-11ad-41e7-1b0f-7c518a87d0b0")
                    .withObjectIdAlias("TestAADAppRedis")
                    .withAccessPolicyName("accessPolicy1"),
                com.azure.core.util.Context.NONE);
    }
}
