// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ServerSecurityAlertPolicies ListByServer.
 */
public final class ServerSecurityAlertPoliciesListByServerSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ServerSecurityAlertsListByServer.json
     */
    /**
     * Sample code: List the server's threat detection policies.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listTheServerSThreatDetectionPolicies(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getServerSecurityAlertPolicies()
            .listByServer("securityalert-4799", "securityalert-6440", com.azure.core.util.Context.NONE);
    }
}
