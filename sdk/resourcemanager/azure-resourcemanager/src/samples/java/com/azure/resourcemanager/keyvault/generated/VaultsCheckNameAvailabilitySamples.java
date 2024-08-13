// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

import com.azure.resourcemanager.keyvault.models.VaultCheckNameAvailabilityParameters;

/**
 * Samples for Vaults CheckNameAvailability.
 */
public final class VaultsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2023-07-01/examples/checkVaultNameAvailability.
     * json
     */
    /**
     * Sample code: Validate a vault name.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void validateAVaultName(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.vaults()
            .manager()
            .serviceClient()
            .getVaults()
            .checkNameAvailabilityWithResponse(new VaultCheckNameAvailabilityParameters().withName("sample-vault"),
                com.azure.core.util.Context.NONE);
    }
}
