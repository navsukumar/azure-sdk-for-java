// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.fluent.models.ManagedInstancePrivateEndpointConnectionInner;
import com.azure.resourcemanager.sql.models.ManagedInstancePrivateLinkServiceConnectionStateProperty;

/**
 * Samples for ManagedInstancePrivateEndpointConnections CreateOrUpdate.
 */
public final class ManagedInstancePrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * ManagedInstancePrivateEndpointConnectionUpdate.json
     */
    /**
     * Sample code: Approve or reject a private endpoint connection with a given name.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        approveOrRejectAPrivateEndpointConnectionWithAGivenName(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstancePrivateEndpointConnections()
            .createOrUpdate("Default", "test-cl", "private-endpoint-connection-name",
                new ManagedInstancePrivateEndpointConnectionInner().withPrivateLinkServiceConnectionState(
                    new ManagedInstancePrivateLinkServiceConnectionStateProperty().withStatus("Approved")
                        .withDescription("Approved by johndoe@contoso.com")),
                com.azure.core.util.Context.NONE);
    }
}
