// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ApplicationGateways ListAvailableServerVariables.
 */
public final class ApplicationGatewaysListAvailableServerVariablesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * ApplicationGatewayAvailableServerVariablesGet.json
     */
    /**
     * Sample code: Get Available Server Variables.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableServerVariables(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getApplicationGateways()
            .listAvailableServerVariablesWithResponse(com.azure.core.util.Context.NONE);
    }
}
