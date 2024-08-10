// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.fluent.models.ServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyNameAutoGenerated;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ServerSecurityAlertPoliciesClient.
 */
public interface ServerSecurityAlertPoliciesClient {
    /**
     * Get the server's threat detection policies.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's threat detection policies as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ServerSecurityAlertPolicyInner> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Get the server's threat detection policies.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's threat detection policies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerSecurityAlertPolicyInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Get the server's threat detection policies.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's threat detection policies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerSecurityAlertPolicyInner> listByServer(String resourceGroupName, String serverName,
        Context context);

    /**
     * Get a server's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ServerSecurityAlertPolicyInner>> getWithResponseAsync(String resourceGroupName, String serverName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName);

    /**
     * Get a server's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServerSecurityAlertPolicyInner> getAsync(String resourceGroupName, String serverName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName);

    /**
     * Get a server's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerSecurityAlertPolicyInner> getWithResponse(String resourceGroupName, String serverName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName, Context context);

    /**
     * Get a server's security alert policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerSecurityAlertPolicyInner get(String resourceGroupName, String serverName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName);

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName, ServerSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String serverName, SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters, Context context);

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServerSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName, ServerSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String serverName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName, ServerSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String serverName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName, ServerSecurityAlertPolicyInner parameters,
        Context context);
}
