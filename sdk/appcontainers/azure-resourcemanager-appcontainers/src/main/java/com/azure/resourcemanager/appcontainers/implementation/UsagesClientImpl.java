// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.appcontainers.fluent.UsagesClient;
import com.azure.resourcemanager.appcontainers.fluent.models.UsageInner;
import com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException;
import com.azure.resourcemanager.appcontainers.models.ListUsagesResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in UsagesClient.
 */
public final class UsagesClientImpl implements UsagesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final UsagesService service;

    /**
     * The service client containing this operation class.
     */
    private final ContainerAppsApiClientImpl client;

    /**
     * Initializes an instance of UsagesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    UsagesClientImpl(ContainerAppsApiClientImpl client) {
        this.service = RestProxy.create(UsagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerAppsApiClientUsages to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ContainerAppsApiClie")
    public interface UsagesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.App/locations/{location}/usages")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<ListUsagesResult>> list(@HostParam("$host") String endpoint,
            @PathParam("location") String location, @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<ListUsagesResult>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets, for the specified location, the current resource usage information as well as the limits under the
     * subscription.
     * 
     * @param location The location for which resource usage is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listSinglePageAsync(String location) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), location, this.client.getSubscriptionId(),
                this.client.getApiVersion(), accept, context))
            .<PagedResponse<UsageInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets, for the specified location, the current resource usage information as well as the limits under the
     * subscription.
     * 
     * @param location The location for which resource usage is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listSinglePageAsync(String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), location, this.client.getSubscriptionId(), this.client.getApiVersion(),
                accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets, for the specified location, the current resource usage information as well as the limits under the
     * subscription.
     * 
     * @param location The location for which resource usage is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageInner> listAsync(String location) {
        return new PagedFlux<>(() -> listSinglePageAsync(location), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets, for the specified location, the current resource usage information as well as the limits under the
     * subscription.
     * 
     * @param location The location for which resource usage is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageInner> listAsync(String location, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(location, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets, for the specified location, the current resource usage information as well as the limits under the
     * subscription.
     * 
     * @param location The location for which resource usage is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> list(String location) {
        return new PagedIterable<>(listAsync(location));
    }

    /**
     * Gets, for the specified location, the current resource usage information as well as the limits under the
     * subscription.
     * 
     * @param location The location for which resource usage is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> list(String location, Context context) {
        return new PagedIterable<>(listAsync(location, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<UsageInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
