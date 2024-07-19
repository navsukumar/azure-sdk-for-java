// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

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
import com.azure.resourcemanager.network.fluent.VirtualApplianceSkusClient;
import com.azure.resourcemanager.network.fluent.models.NetworkVirtualApplianceSkuInner;
import com.azure.resourcemanager.network.models.NetworkVirtualApplianceSkuListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VirtualApplianceSkusClient.
 */
public final class VirtualApplianceSkusClientImpl implements VirtualApplianceSkusClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final VirtualApplianceSkusService service;

    /**
     * The service client containing this operation class.
     */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VirtualApplianceSkusClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    VirtualApplianceSkusClientImpl(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VirtualApplianceSkusService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientVirtualApplianceSkus to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface VirtualApplianceSkusService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/networkVirtualApplianceSkus")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkVirtualApplianceSkuListResult>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/networkVirtualApplianceSkus/{skuName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkVirtualApplianceSkuInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @PathParam("skuName") String skuName, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkVirtualApplianceSkuListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List all SKUs available for a virtual appliance.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSkus API service call along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NetworkVirtualApplianceSkuInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion,
                accept, context))
            .<PagedResponse<NetworkVirtualApplianceSkuInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List all SKUs available for a virtual appliance.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSkus API service call along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NetworkVirtualApplianceSkuInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List all SKUs available for a virtual appliance.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSkus API service call as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkVirtualApplianceSkuInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List all SKUs available for a virtual appliance.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSkus API service call as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<NetworkVirtualApplianceSkuInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List all SKUs available for a virtual appliance.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSkus API service call as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkVirtualApplianceSkuInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * List all SKUs available for a virtual appliance.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSkus API service call as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkVirtualApplianceSkuInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Retrieves a single available sku for network virtual appliance.
     * 
     * @param skuName Name of the Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return available NetworkVirtualApplianceSkus along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkVirtualApplianceSkuInner>> getWithResponseAsync(String skuName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (skuName == null) {
            return Mono.error(new IllegalArgumentException("Parameter skuName is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion,
                skuName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves a single available sku for network virtual appliance.
     * 
     * @param skuName Name of the Sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return available NetworkVirtualApplianceSkus along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkVirtualApplianceSkuInner>> getWithResponseAsync(String skuName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (skuName == null) {
            return Mono.error(new IllegalArgumentException("Parameter skuName is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, skuName, accept,
            context);
    }

    /**
     * Retrieves a single available sku for network virtual appliance.
     * 
     * @param skuName Name of the Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return available NetworkVirtualApplianceSkus on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkVirtualApplianceSkuInner> getAsync(String skuName) {
        return getWithResponseAsync(skuName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieves a single available sku for network virtual appliance.
     * 
     * @param skuName Name of the Sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return available NetworkVirtualApplianceSkus along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NetworkVirtualApplianceSkuInner> getWithResponse(String skuName, Context context) {
        return getWithResponseAsync(skuName, context).block();
    }

    /**
     * Retrieves a single available sku for network virtual appliance.
     * 
     * @param skuName Name of the Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return available NetworkVirtualApplianceSkus.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkVirtualApplianceSkuInner get(String skuName) {
        return getWithResponse(skuName, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSkus API service call along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NetworkVirtualApplianceSkuInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<NetworkVirtualApplianceSkuInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
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
     * @return response for ListNetworkVirtualApplianceSkus API service call along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NetworkVirtualApplianceSkuInner>> listNextSinglePageAsync(String nextLink,
        Context context) {
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
