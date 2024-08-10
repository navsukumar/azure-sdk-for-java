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
import com.azure.resourcemanager.sql.fluent.models.JobAgentInner;
import com.azure.resourcemanager.sql.models.JobAgentUpdate;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in JobAgentsClient.
 */
public interface JobAgentsClient {
    /**
     * Gets a list of job agents in a server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job agents in a server as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<JobAgentInner> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Gets a list of job agents in a server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job agents in a server as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobAgentInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Gets a list of job agents in a server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job agents in a server as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobAgentInner> listByServer(String resourceGroupName, String serverName, Context context);

    /**
     * Gets a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job agent along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobAgentInner>> getWithResponseAsync(String resourceGroupName, String serverName,
        String jobAgentName);

    /**
     * Gets a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job agent on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobAgentInner> getAsync(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Gets a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job agent along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobAgentInner> getWithResponse(String resourceGroupName, String serverName, String jobAgentName,
        Context context);

    /**
     * Gets a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobAgentInner get(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be created or updated.
     * @param parameters The requested job agent resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL job agent along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName,
        String jobAgentName, JobAgentInner parameters);

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be created or updated.
     * @param parameters The requested job agent resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<JobAgentInner>, JobAgentInner> beginCreateOrUpdateAsync(String resourceGroupName,
        String serverName, String jobAgentName, JobAgentInner parameters);

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be created or updated.
     * @param parameters The requested job agent resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<JobAgentInner>, JobAgentInner> beginCreateOrUpdate(String resourceGroupName,
        String serverName, String jobAgentName, JobAgentInner parameters);

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be created or updated.
     * @param parameters The requested job agent resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<JobAgentInner>, JobAgentInner> beginCreateOrUpdate(String resourceGroupName,
        String serverName, String jobAgentName, JobAgentInner parameters, Context context);

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be created or updated.
     * @param parameters The requested job agent resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL job agent on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobAgentInner> createOrUpdateAsync(String resourceGroupName, String serverName, String jobAgentName,
        JobAgentInner parameters);

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be created or updated.
     * @param parameters The requested job agent resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobAgentInner createOrUpdate(String resourceGroupName, String serverName, String jobAgentName,
        JobAgentInner parameters);

    /**
     * Creates or updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be created or updated.
     * @param parameters The requested job agent resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobAgentInner createOrUpdate(String resourceGroupName, String serverName, String jobAgentName,
        JobAgentInner parameters, Context context);

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName,
        String jobAgentName);

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String serverName,
        String jobAgentName);

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName, String jobAgentName,
        Context context);

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Deletes a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String jobAgentName, Context context);

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be updated.
     * @param parameters The update to the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL job agent along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String serverName,
        String jobAgentName, JobAgentUpdate parameters);

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be updated.
     * @param parameters The update to the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<JobAgentInner>, JobAgentInner> beginUpdateAsync(String resourceGroupName, String serverName,
        String jobAgentName, JobAgentUpdate parameters);

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be updated.
     * @param parameters The update to the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<JobAgentInner>, JobAgentInner> beginUpdate(String resourceGroupName, String serverName,
        String jobAgentName, JobAgentUpdate parameters);

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be updated.
     * @param parameters The update to the job agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<JobAgentInner>, JobAgentInner> beginUpdate(String resourceGroupName, String serverName,
        String jobAgentName, JobAgentUpdate parameters, Context context);

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be updated.
     * @param parameters The update to the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL job agent on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobAgentInner> updateAsync(String resourceGroupName, String serverName, String jobAgentName,
        JobAgentUpdate parameters);

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be updated.
     * @param parameters The update to the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobAgentInner update(String resourceGroupName, String serverName, String jobAgentName, JobAgentUpdate parameters);

    /**
     * Updates a job agent.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent to be updated.
     * @param parameters The update to the job agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL job agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobAgentInner update(String resourceGroupName, String serverName, String jobAgentName, JobAgentUpdate parameters,
        Context context);
}
