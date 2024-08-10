// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for Registries GetBuildSourceUploadUrl.
 */
public final class RegistriesGetBuildSourceUploadUrlSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/
     * RegistriesGetBuildSourceUploadUrl.json
     */
    /**
     * Sample code: Registries_GetBuildSourceUploadUrl.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registriesGetBuildSourceUploadUrl(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries()
            .manager()
            .serviceClient()
            .getRegistries()
            .getBuildSourceUploadUrlWithResponse("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
