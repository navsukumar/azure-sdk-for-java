// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.fluent.models.ServerConnectionPolicyInner;
import com.azure.resourcemanager.sql.models.ConnectionPolicyName;
import com.azure.resourcemanager.sql.models.ServerConnectionType;

/**
 * Samples for ServerConnectionPolicies CreateOrUpdate.
 */
public final class ServerConnectionPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ServerConnectionPoliciesUpdate.json
     */
    /**
     * Sample code: Updates a server connection policy.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updatesAServerConnectionPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getServerConnectionPolicies()
            .createOrUpdate("testrg", "testserver", ConnectionPolicyName.DEFAULT,
                new ServerConnectionPolicyInner().withConnectionType(ServerConnectionType.REDIRECT),
                com.azure.core.util.Context.NONE);
    }
}
