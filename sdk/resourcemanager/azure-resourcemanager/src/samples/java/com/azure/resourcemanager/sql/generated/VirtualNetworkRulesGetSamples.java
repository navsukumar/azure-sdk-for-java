// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for VirtualNetworkRules Get.
 */
public final class VirtualNetworkRulesGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/VirtualNetworkRulesGet.json
     */
    /**
     * Sample code: Gets a virtual network rule.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsAVirtualNetworkRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getVirtualNetworkRules()
            .getWithResponse("Default", "vnet-test-svr", "vnet-firewall-rule", com.azure.core.util.Context.NONE);
    }
}
