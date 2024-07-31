// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.ManagedClusterVersionsClient;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ManagedClusterCodeVersionResultInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedClusterVersionEnvironment;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ManagedClusterVersionsClient.
 */
public final class ManagedClusterVersionsClientImpl implements ManagedClusterVersionsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ManagedClusterVersionsService service;

    /**
     * The service client containing this operation class.
     */
    private final ServiceFabricManagedClustersMgmtClientImpl client;

    /**
     * Initializes an instance of ManagedClusterVersionsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ManagedClusterVersionsClientImpl(ServiceFabricManagedClustersMgmtClientImpl client) {
        this.service = RestProxy.create(ManagedClusterVersionsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricManagedClustersMgmtClientManagedClusterVersions to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricManaged")
    public interface ManagedClusterVersionsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/managedClusterVersions/{clusterVersion}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ManagedClusterCodeVersionResultInner>> get(@HostParam("$host") String endpoint,
            @PathParam("location") String location, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("clusterVersion") String clusterVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/environments/{environment}/managedClusterVersions/{clusterVersion}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ManagedClusterCodeVersionResultInner>> getByEnvironment(@HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @PathParam("environment") ManagedClusterVersionEnvironment environment,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("clusterVersion") String clusterVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/managedClusterVersions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<ManagedClusterCodeVersionResultInner>>> list(@HostParam("$host") String endpoint,
            @PathParam("location") String location, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/environments/{environment}/managedClusterVersions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<ManagedClusterCodeVersionResultInner>>> listByEnvironment(
            @HostParam("$host") String endpoint, @PathParam("location") String location,
            @PathParam("environment") ManagedClusterVersionEnvironment environment,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets information about a Service Fabric managed cluster code version available in the specified location.
     * 
     * Gets information about an available Service Fabric managed cluster code version.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric managed cluster code version along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagedClusterCodeVersionResultInner>> getWithResponseAsync(String location,
        String clusterVersion) {
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
        if (clusterVersion == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), location, this.client.getApiVersion(),
                this.client.getSubscriptionId(), clusterVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets information about a Service Fabric managed cluster code version available in the specified location.
     * 
     * Gets information about an available Service Fabric managed cluster code version.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric managed cluster code version along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagedClusterCodeVersionResultInner>> getWithResponseAsync(String location,
        String clusterVersion, Context context) {
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
        if (clusterVersion == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), location, this.client.getApiVersion(),
            this.client.getSubscriptionId(), clusterVersion, accept, context);
    }

    /**
     * Gets information about a Service Fabric managed cluster code version available in the specified location.
     * 
     * Gets information about an available Service Fabric managed cluster code version.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric managed cluster code version on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ManagedClusterCodeVersionResultInner> getAsync(String location, String clusterVersion) {
        return getWithResponseAsync(location, clusterVersion).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets information about a Service Fabric managed cluster code version available in the specified location.
     * 
     * Gets information about an available Service Fabric managed cluster code version.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric managed cluster code version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagedClusterCodeVersionResultInner> getWithResponse(String location, String clusterVersion,
        Context context) {
        return getWithResponseAsync(location, clusterVersion, context).block();
    }

    /**
     * Gets information about a Service Fabric managed cluster code version available in the specified location.
     * 
     * Gets information about an available Service Fabric managed cluster code version.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric managed cluster code version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedClusterCodeVersionResultInner get(String location, String clusterVersion) {
        return getWithResponse(location, clusterVersion, Context.NONE).getValue();
    }

    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * 
     * Gets information about an available Service Fabric cluster code version by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagedClusterCodeVersionResultInner>> getByEnvironmentWithResponseAsync(String location,
        ManagedClusterVersionEnvironment environment, String clusterVersion) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (environment == null) {
            return Mono.error(new IllegalArgumentException("Parameter environment is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (clusterVersion == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getByEnvironment(this.client.getEndpoint(), location, environment,
                this.client.getApiVersion(), this.client.getSubscriptionId(), clusterVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * 
     * Gets information about an available Service Fabric cluster code version by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagedClusterCodeVersionResultInner>> getByEnvironmentWithResponseAsync(String location,
        ManagedClusterVersionEnvironment environment, String clusterVersion, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (environment == null) {
            return Mono.error(new IllegalArgumentException("Parameter environment is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (clusterVersion == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getByEnvironment(this.client.getEndpoint(), location, environment, this.client.getApiVersion(),
            this.client.getSubscriptionId(), clusterVersion, accept, context);
    }

    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * 
     * Gets information about an available Service Fabric cluster code version by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ManagedClusterCodeVersionResultInner> getByEnvironmentAsync(String location,
        ManagedClusterVersionEnvironment environment, String clusterVersion) {
        return getByEnvironmentWithResponseAsync(location, environment, clusterVersion)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * 
     * Gets information about an available Service Fabric cluster code version by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagedClusterCodeVersionResultInner> getByEnvironmentWithResponse(String location,
        ManagedClusterVersionEnvironment environment, String clusterVersion, Context context) {
        return getByEnvironmentWithResponseAsync(location, environment, clusterVersion, context).block();
    }

    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * 
     * Gets information about an available Service Fabric cluster code version by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedClusterCodeVersionResultInner getByEnvironment(String location,
        ManagedClusterVersionEnvironment environment, String clusterVersion) {
        return getByEnvironmentWithResponse(location, environment, clusterVersion, Context.NONE).getValue();
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * 
     * Gets all available code versions for Service Fabric cluster resources by location.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<ManagedClusterCodeVersionResultInner>>> listWithResponseAsync(String location) {
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
            .withContext(context -> service.list(this.client.getEndpoint(), location, this.client.getApiVersion(),
                this.client.getSubscriptionId(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * 
     * Gets all available code versions for Service Fabric cluster resources by location.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<ManagedClusterCodeVersionResultInner>>> listWithResponseAsync(String location,
        Context context) {
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
        return service.list(this.client.getEndpoint(), location, this.client.getApiVersion(),
            this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * 
     * Gets all available code versions for Service Fabric cluster resources by location.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<ManagedClusterCodeVersionResultInner>> listAsync(String location) {
        return listWithResponseAsync(location).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * 
     * Gets all available code versions for Service Fabric cluster resources by location.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<ManagedClusterCodeVersionResultInner>> listWithResponse(String location, Context context) {
        return listWithResponseAsync(location, context).block();
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * 
     * Gets all available code versions for Service Fabric cluster resources by location.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<ManagedClusterCodeVersionResultInner> list(String location) {
        return listWithResponse(location, Context.NONE).getValue();
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * 
     * Gets all available code versions for Service Fabric cluster resources by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<ManagedClusterCodeVersionResultInner>>>
        listByEnvironmentWithResponseAsync(String location, ManagedClusterVersionEnvironment environment) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (environment == null) {
            return Mono.error(new IllegalArgumentException("Parameter environment is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByEnvironment(this.client.getEndpoint(), location, environment,
                this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * 
     * Gets all available code versions for Service Fabric cluster resources by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<ManagedClusterCodeVersionResultInner>>> listByEnvironmentWithResponseAsync(
        String location, ManagedClusterVersionEnvironment environment, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (environment == null) {
            return Mono.error(new IllegalArgumentException("Parameter environment is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByEnvironment(this.client.getEndpoint(), location, environment, this.client.getApiVersion(),
            this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * 
     * Gets all available code versions for Service Fabric cluster resources by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<ManagedClusterCodeVersionResultInner>> listByEnvironmentAsync(String location,
        ManagedClusterVersionEnvironment environment) {
        return listByEnvironmentWithResponseAsync(location, environment)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * 
     * Gets all available code versions for Service Fabric cluster resources by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<ManagedClusterCodeVersionResultInner>> listByEnvironmentWithResponse(String location,
        ManagedClusterVersionEnvironment environment, Context context) {
        return listByEnvironmentWithResponseAsync(location, environment, context).block();
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * 
     * Gets all available code versions for Service Fabric cluster resources by environment.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<ManagedClusterCodeVersionResultInner> listByEnvironment(String location,
        ManagedClusterVersionEnvironment environment) {
        return listByEnvironmentWithResponse(location, environment, Context.NONE).getValue();
    }
}
