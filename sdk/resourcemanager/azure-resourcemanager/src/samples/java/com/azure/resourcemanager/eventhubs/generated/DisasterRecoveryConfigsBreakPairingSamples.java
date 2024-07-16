// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

/**
 * Samples for DisasterRecoveryConfigs BreakPairing.
 */
public final class DisasterRecoveryConfigsBreakPairingSamples {
    /*
     * x-ms-original-file:
     * specification/eventhub/resource-manager/Microsoft.EventHub/stable/2024-01-01/examples/disasterRecoveryConfigs/
     * EHAliasBreakPairing.json
     */
    /**
     * Sample code: EHAliasBreakPairing.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void eHAliasBreakPairing(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.eventHubs()
            .manager()
            .serviceClient()
            .getDisasterRecoveryConfigs()
            .breakPairingWithResponse("exampleResourceGroup", "sdk-Namespace-8859", "sdk-DisasterRecovery-3814",
                com.azure.core.util.Context.NONE);
    }
}
