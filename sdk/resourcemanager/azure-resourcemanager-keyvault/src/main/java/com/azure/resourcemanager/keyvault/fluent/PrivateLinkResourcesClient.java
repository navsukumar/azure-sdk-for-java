// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.fluent.models.PrivateLinkResourceListResultInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient.
 */
public interface PrivateLinkResourcesClient {
    /**
     * Gets the private link resources supported for the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources supported for the key vault along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateLinkResourceListResultInner>> listByVaultWithResponseAsync(String resourceGroupName,
        String vaultName);

    /**
     * Gets the private link resources supported for the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources supported for the key vault on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateLinkResourceListResultInner> listByVaultAsync(String resourceGroupName, String vaultName);

    /**
     * Gets the private link resources supported for the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources supported for the key vault along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceListResultInner> listByVaultWithResponse(String resourceGroupName, String vaultName,
        Context context);

    /**
     * Gets the private link resources supported for the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources supported for the key vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceListResultInner listByVault(String resourceGroupName, String vaultName);
}
