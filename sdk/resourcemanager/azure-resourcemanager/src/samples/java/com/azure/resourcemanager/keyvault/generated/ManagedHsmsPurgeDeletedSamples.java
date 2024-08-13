// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

/**
 * Samples for ManagedHsms PurgeDeleted.
 */
public final class ManagedHsmsPurgeDeletedSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2023-07-01/examples/DeletedManagedHsm_Purge.
     * json
     */
    /**
     * Sample code: Purge a managed HSM Pool.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void purgeAManagedHSMPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.vaults()
            .manager()
            .serviceClient()
            .getManagedHsms()
            .purgeDeleted("hsm1", "westus", com.azure.core.util.Context.NONE);
    }
}
