// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.AuthenticationMethod;
import com.azure.resourcemanager.network.models.P2SVpnProfileParameters;

/**
 * Samples for P2SVpnGateways GenerateVpnProfile.
 */
public final class P2SVpnGatewaysGenerateVpnProfileSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * P2SVpnGatewayGenerateVpnProfile.json
     */
    /**
     * Sample code: GenerateP2SVpnGatewayVPNProfile.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void generateP2SVpnGatewayVPNProfile(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getP2SVpnGateways()
            .generateVpnProfile("rg1", "p2sVpnGateway1",
                new P2SVpnProfileParameters().withAuthenticationMethod(AuthenticationMethod.EAPTLS),
                com.azure.core.util.Context.NONE);
    }
}
