// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.sql.fluent.ManagedDatabaseRecommendedSensitivityLabelsClient;
import com.azure.resourcemanager.sql.models.RecommendedSensitivityLabelUpdateList;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedDatabaseRecommendedSensitivityLabelsClient.
 */
public final class ManagedDatabaseRecommendedSensitivityLabelsClientImpl
    implements ManagedDatabaseRecommendedSensitivityLabelsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ManagedDatabaseRecommendedSensitivityLabelsService service;

    /**
     * The service client containing this operation class.
     */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedDatabaseRecommendedSensitivityLabelsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ManagedDatabaseRecommendedSensitivityLabelsClientImpl(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ManagedDatabaseRecommendedSensitivityLabelsService.class,
            client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientManagedDatabaseRecommendedSensitivityLabels to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientM")
    public interface ManagedDatabaseRecommendedSensitivityLabelsService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/recommendedSensitivityLabels")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> update(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("databaseName") String databaseName, @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") RecommendedSensitivityLabelUpdateList parameters, Context context);
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param parameters The parameters parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateWithResponseAsync(String resourceGroupName, String managedInstanceName,
        String databaseName, RecommendedSensitivityLabelUpdateList parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        return FluxUtil
            .withContext(context -> service.update(this.client.getEndpoint(), resourceGroupName, managedInstanceName,
                databaseName, this.client.getSubscriptionId(), this.client.getApiVersion(), parameters, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param parameters The parameters parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> updateWithResponseAsync(String resourceGroupName, String managedInstanceName,
        String databaseName, RecommendedSensitivityLabelUpdateList parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        context = this.client.mergeContext(context);
        return service.update(this.client.getEndpoint(), resourceGroupName, managedInstanceName, databaseName,
            this.client.getSubscriptionId(), this.client.getApiVersion(), parameters, context);
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param parameters The parameters parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateAsync(String resourceGroupName, String managedInstanceName, String databaseName,
        RecommendedSensitivityLabelUpdateList parameters) {
        return updateWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, parameters)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param parameters The parameters parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> updateWithResponse(String resourceGroupName, String managedInstanceName, String databaseName,
        RecommendedSensitivityLabelUpdateList parameters, Context context) {
        return updateWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, parameters, context)
            .block();
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param parameters The parameters parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(String resourceGroupName, String managedInstanceName, String databaseName,
        RecommendedSensitivityLabelUpdateList parameters) {
        updateWithResponse(resourceGroupName, managedInstanceName, databaseName, parameters, Context.NONE);
    }
}
