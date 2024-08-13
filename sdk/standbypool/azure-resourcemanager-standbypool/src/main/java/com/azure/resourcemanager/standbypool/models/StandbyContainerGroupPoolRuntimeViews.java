// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of StandbyContainerGroupPoolRuntimeViews.
 */
public interface StandbyContainerGroupPoolRuntimeViews {
    /**
     * Get a StandbyContainerGroupPoolRuntimeViewResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param runtimeView The unique identifier for the runtime view. The input string should be the word 'latest',
     * which will get the latest runtime view of the pool, otherwise the request will fail with NotFound exception.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyContainerGroupPoolRuntimeViewResource along with {@link Response}.
     */
    Response<StandbyContainerGroupPoolRuntimeViewResource> getWithResponse(String resourceGroupName,
        String standbyContainerGroupPoolName, String runtimeView, Context context);

    /**
     * Get a StandbyContainerGroupPoolRuntimeViewResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param runtimeView The unique identifier for the runtime view. The input string should be the word 'latest',
     * which will get the latest runtime view of the pool, otherwise the request will fail with NotFound exception.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyContainerGroupPoolRuntimeViewResource.
     */
    StandbyContainerGroupPoolRuntimeViewResource get(String resourceGroupName, String standbyContainerGroupPoolName,
        String runtimeView);

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<StandbyContainerGroupPoolRuntimeViewResource> listByStandbyPool(String resourceGroupName,
        String standbyContainerGroupPoolName);

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<StandbyContainerGroupPoolRuntimeViewResource> listByStandbyPool(String resourceGroupName,
        String standbyContainerGroupPoolName, Context context);
}
