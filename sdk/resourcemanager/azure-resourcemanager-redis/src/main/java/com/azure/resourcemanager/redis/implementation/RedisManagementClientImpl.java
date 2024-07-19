// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.redis.fluent.AccessPoliciesClient;
import com.azure.resourcemanager.redis.fluent.AccessPolicyAssignmentsClient;
import com.azure.resourcemanager.redis.fluent.AsyncOperationStatusClient;
import com.azure.resourcemanager.redis.fluent.FirewallRulesClient;
import com.azure.resourcemanager.redis.fluent.LinkedServersClient;
import com.azure.resourcemanager.redis.fluent.OperationsClient;
import com.azure.resourcemanager.redis.fluent.PatchSchedulesClient;
import com.azure.resourcemanager.redis.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.redis.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.redis.fluent.RedisClient;
import com.azure.resourcemanager.redis.fluent.RedisManagementClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/**
 * Initializes a new instance of the RedisManagementClientImpl type.
 */
@ServiceClient(builder = RedisManagementClientBuilder.class)
public final class RedisManagementClientImpl extends AzureServiceClient implements RedisManagementClient {
    /**
     * The ID of the target subscription.
     */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The RedisClient object to access its operations.
     */
    private final RedisClient redis;

    /**
     * Gets the RedisClient object to access its operations.
     * 
     * @return the RedisClient object.
     */
    public RedisClient getRedis() {
        return this.redis;
    }

    /**
     * The FirewallRulesClient object to access its operations.
     */
    private final FirewallRulesClient firewallRules;

    /**
     * Gets the FirewallRulesClient object to access its operations.
     * 
     * @return the FirewallRulesClient object.
     */
    public FirewallRulesClient getFirewallRules() {
        return this.firewallRules;
    }

    /**
     * The PatchSchedulesClient object to access its operations.
     */
    private final PatchSchedulesClient patchSchedules;

    /**
     * Gets the PatchSchedulesClient object to access its operations.
     * 
     * @return the PatchSchedulesClient object.
     */
    public PatchSchedulesClient getPatchSchedules() {
        return this.patchSchedules;
    }

    /**
     * The LinkedServersClient object to access its operations.
     */
    private final LinkedServersClient linkedServers;

    /**
     * Gets the LinkedServersClient object to access its operations.
     * 
     * @return the LinkedServersClient object.
     */
    public LinkedServersClient getLinkedServers() {
        return this.linkedServers;
    }

    /**
     * The PrivateEndpointConnectionsClient object to access its operations.
     */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * The PrivateLinkResourcesClient object to access its operations.
     */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /**
     * The AsyncOperationStatusClient object to access its operations.
     */
    private final AsyncOperationStatusClient asyncOperationStatus;

    /**
     * Gets the AsyncOperationStatusClient object to access its operations.
     * 
     * @return the AsyncOperationStatusClient object.
     */
    public AsyncOperationStatusClient getAsyncOperationStatus() {
        return this.asyncOperationStatus;
    }

    /**
     * The AccessPoliciesClient object to access its operations.
     */
    private final AccessPoliciesClient accessPolicies;

    /**
     * Gets the AccessPoliciesClient object to access its operations.
     * 
     * @return the AccessPoliciesClient object.
     */
    public AccessPoliciesClient getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * The AccessPolicyAssignmentsClient object to access its operations.
     */
    private final AccessPolicyAssignmentsClient accessPolicyAssignments;

    /**
     * Gets the AccessPolicyAssignmentsClient object to access its operations.
     * 
     * @return the AccessPolicyAssignmentsClient object.
     */
    public AccessPolicyAssignmentsClient getAccessPolicyAssignments() {
        return this.accessPolicyAssignments;
    }

    /**
     * Initializes an instance of RedisManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    RedisManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2024-03-01";
        this.operations = new OperationsClientImpl(this);
        this.redis = new RedisClientImpl(this);
        this.firewallRules = new FirewallRulesClientImpl(this);
        this.patchSchedules = new PatchSchedulesClientImpl(this);
        this.linkedServers = new LinkedServersClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.asyncOperationStatus = new AsyncOperationStatusClientImpl(this);
        this.accessPolicies = new AccessPoliciesClientImpl(this);
        this.accessPolicyAssignments = new AccessPolicyAssignmentsClientImpl(this);
    }
}
