// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ApplicationGateways ListAvailableSslOptions.
 */
public final class ApplicationGatewaysListAvailableSslOptionsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * ApplicationGatewayAvailableSslOptionsGet.json
     */
    /**
     * Sample code: Get Available Ssl Options.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableSslOptions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getApplicationGateways()
            .listAvailableSslOptionsWithResponse(com.azure.core.util.Context.NONE);
    }
}
