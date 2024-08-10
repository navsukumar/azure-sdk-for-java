// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.resources.fluent.ChangesClient;
import com.azure.resourcemanager.resources.fluent.models.ChangeResourceResultInner;
import com.azure.resourcemanager.resources.models.ChangeResourceListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ChangesClient.
 */
public final class ChangesClientImpl implements ChangesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ChangesService service;

    /**
     * The service client containing this operation class.
     */
    private final ChangesManagementClientImpl client;

    /**
     * Initializes an instance of ChangesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ChangesClientImpl(ChangesManagementClientImpl client) {
        this.service = RestProxy.create(ChangesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ChangesManagementClientChanges to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ChangesManagementCli")
    public interface ChangesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}/providers/Microsoft.Resources/changes")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ChangeResourceListResult>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("resourceProviderNamespace") String resourceProviderNamespace,
            @PathParam("resourceType") String resourceType, @PathParam("resourceName") String resourceName,
            @QueryParam("api-version") String apiVersion, @QueryParam("$top") Long top,
            @QueryParam("$skipToken") String skipToken, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}/providers/Microsoft.Resources/changes/{changeResourceId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ChangeResourceResultInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("resourceProviderNamespace") String resourceProviderNamespace,
            @PathParam("resourceType") String resourceType, @PathParam("resourceName") String resourceName,
            @QueryParam("api-version") String apiVersion, @PathParam("changeResourceId") String changeResourceId,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ChangeResourceListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Obtains a list of change resources from the past 14 days for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param top (Optional) Set the maximum number of results per response.
     * @param skipToken (Optional) The page-continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ChangeResourceResultInner>> listSinglePageAsync(String resourceGroupName,
        String resourceProviderNamespace, String resourceType, String resourceName, Long top, String skipToken) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter resourceProviderNamespace is required and cannot be null."));
        }
        if (resourceType == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceType is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, resourceProviderNamespace, resourceType, resourceName, this.client.getApiVersion(),
                top, skipToken, accept, context))
            .<PagedResponse<ChangeResourceResultInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Obtains a list of change resources from the past 14 days for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param top (Optional) Set the maximum number of results per response.
     * @param skipToken (Optional) The page-continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ChangeResourceResultInner>> listSinglePageAsync(String resourceGroupName,
        String resourceProviderNamespace, String resourceType, String resourceName, Long top, String skipToken,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter resourceProviderNamespace is required and cannot be null."));
        }
        if (resourceType == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceType is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
                resourceProviderNamespace, resourceType, resourceName, this.client.getApiVersion(), top, skipToken,
                accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Obtains a list of change resources from the past 14 days for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param top (Optional) Set the maximum number of results per response.
     * @param skipToken (Optional) The page-continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ChangeResourceResultInner> listAsync(String resourceGroupName, String resourceProviderNamespace,
        String resourceType, String resourceName, Long top, String skipToken) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, resourceProviderNamespace, resourceType,
            resourceName, top, skipToken), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Obtains a list of change resources from the past 14 days for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ChangeResourceResultInner> listAsync(String resourceGroupName, String resourceProviderNamespace,
        String resourceType, String resourceName) {
        final Long top = null;
        final String skipToken = null;
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, resourceProviderNamespace, resourceType,
            resourceName, top, skipToken), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Obtains a list of change resources from the past 14 days for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param top (Optional) Set the maximum number of results per response.
     * @param skipToken (Optional) The page-continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ChangeResourceResultInner> listAsync(String resourceGroupName, String resourceProviderNamespace,
        String resourceType, String resourceName, Long top, String skipToken, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, resourceProviderNamespace, resourceType,
            resourceName, top, skipToken, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Obtains a list of change resources from the past 14 days for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ChangeResourceResultInner> list(String resourceGroupName, String resourceProviderNamespace,
        String resourceType, String resourceName) {
        final Long top = null;
        final String skipToken = null;
        return new PagedIterable<>(
            listAsync(resourceGroupName, resourceProviderNamespace, resourceType, resourceName, top, skipToken));
    }

    /**
     * Obtains a list of change resources from the past 14 days for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param top (Optional) Set the maximum number of results per response.
     * @param skipToken (Optional) The page-continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ChangeResourceResultInner> list(String resourceGroupName, String resourceProviderNamespace,
        String resourceType, String resourceName, Long top, String skipToken, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, resourceProviderNamespace, resourceType, resourceName,
            top, skipToken, context));
    }

    /**
     * Obtains the specified change resource for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param changeResourceId The ID of the change resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return change Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ChangeResourceResultInner>> getWithResponseAsync(String resourceGroupName,
        String resourceProviderNamespace, String resourceType, String resourceName, String changeResourceId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter resourceProviderNamespace is required and cannot be null."));
        }
        if (resourceType == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceType is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (changeResourceId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter changeResourceId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, resourceProviderNamespace, resourceType, resourceName, this.client.getApiVersion(),
                changeResourceId, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Obtains the specified change resource for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param changeResourceId The ID of the change resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return change Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ChangeResourceResultInner>> getWithResponseAsync(String resourceGroupName,
        String resourceProviderNamespace, String resourceType, String resourceName, String changeResourceId,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter resourceProviderNamespace is required and cannot be null."));
        }
        if (resourceType == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceType is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (changeResourceId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter changeResourceId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            resourceProviderNamespace, resourceType, resourceName, this.client.getApiVersion(), changeResourceId,
            accept, context);
    }

    /**
     * Obtains the specified change resource for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param changeResourceId The ID of the change resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return change Resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ChangeResourceResultInner> getAsync(String resourceGroupName, String resourceProviderNamespace,
        String resourceType, String resourceName, String changeResourceId) {
        return getWithResponseAsync(resourceGroupName, resourceProviderNamespace, resourceType, resourceName,
            changeResourceId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Obtains the specified change resource for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param changeResourceId The ID of the change resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return change Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ChangeResourceResultInner> getWithResponse(String resourceGroupName,
        String resourceProviderNamespace, String resourceType, String resourceName, String changeResourceId,
        Context context) {
        return getWithResponseAsync(resourceGroupName, resourceProviderNamespace, resourceType, resourceName,
            changeResourceId, context).block();
    }

    /**
     * Obtains the specified change resource for the target resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider namespace.
     * @param resourceType The name of the resource type.
     * @param resourceName The name of the resource.
     * @param changeResourceId The ID of the change resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return change Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ChangeResourceResultInner get(String resourceGroupName, String resourceProviderNamespace,
        String resourceType, String resourceName, String changeResourceId) {
        return getWithResponse(resourceGroupName, resourceProviderNamespace, resourceType, resourceName,
            changeResourceId, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ChangeResourceResultInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ChangeResourceResultInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ChangeResourceResultInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
