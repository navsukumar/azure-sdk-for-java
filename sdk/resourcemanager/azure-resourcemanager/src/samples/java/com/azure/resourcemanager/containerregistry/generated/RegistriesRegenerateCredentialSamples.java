// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.models.PasswordName;
import com.azure.resourcemanager.containerregistry.models.RegenerateCredentialParameters;

/**
 * Samples for Registries RegenerateCredential.
 */
public final class RegistriesRegenerateCredentialSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/
     * RegistryRegenerateCredential.json
     */
    /**
     * Sample code: RegistryRegenerateCredential.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryRegenerateCredential(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries()
            .manager()
            .serviceClient()
            .getRegistries()
            .regenerateCredentialWithResponse("myResourceGroup", "myRegistry",
                new RegenerateCredentialParameters().withName(PasswordName.PASSWORD), com.azure.core.util.Context.NONE);
    }
}
