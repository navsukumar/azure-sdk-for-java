// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.fluent.models.NetworkSecurityPerimeterConfigurationListInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * NetworkSecurityPerimeterConfigurationsClient.
 */
public interface NetworkSecurityPerimeterConfigurationsClient {
    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NetworkSecurityPerimeterConfigurationListInner>> listWithResponseAsync(String resourceGroupName,
        String namespaceName);

    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkSecurityPerimeterConfigurationListInner> listAsync(String resourceGroupName, String namespaceName);

    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkSecurityPerimeterConfigurationListInner> listWithResponse(String resourceGroupName,
        String namespaceName, Context context);

    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSecurityPerimeterConfigurationListInner list(String resourceGroupName, String namespaceName);
}
