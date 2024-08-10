// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.CheckNameAvailabilityRequest;

/**
 * Samples for Servers CheckNameAvailability.
 */
public final class ServersCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/CheckNameAvailabilityServerAvailable.
     * json
     */
    /**
     * Sample code: Check for a server name that is available.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void checkForAServerNameThatIsAvailable(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getServers()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest().withName("server1"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * CheckNameAvailabilityServerAlreadyExists.json
     */
    /**
     * Sample code: Check for a server name that already exists.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void checkForAServerNameThatAlreadyExists(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getServers()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest().withName("server1"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/CheckNameAvailabilityServerInvalid.
     * json
     */
    /**
     * Sample code: Check for a server name that is invalid.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void checkForAServerNameThatIsInvalid(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getServers()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest().withName("SERVER1"),
                com.azure.core.util.Context.NONE);
    }
}
