// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.msi.fluent.FederatedIdentityCredentialsClient;
import com.azure.resourcemanager.msi.fluent.ManagedServiceIdentityClient;
import com.azure.resourcemanager.msi.fluent.OperationsClient;
import com.azure.resourcemanager.msi.fluent.SystemAssignedIdentitiesClient;
import com.azure.resourcemanager.msi.fluent.UserAssignedIdentitiesClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/**
 * Initializes a new instance of the ManagedServiceIdentityClientImpl type.
 */
@ServiceClient(builder = ManagedServiceIdentityClientBuilder.class)
public final class ManagedServiceIdentityClientImpl extends AzureServiceClient implements ManagedServiceIdentityClient {
    /**
     * The Id of the Subscription to which the identity belongs.
     */
    private final String subscriptionId;

    /**
     * Gets The Id of the Subscription to which the identity belongs.
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
     * The SystemAssignedIdentitiesClient object to access its operations.
     */
    private final SystemAssignedIdentitiesClient systemAssignedIdentities;

    /**
     * Gets the SystemAssignedIdentitiesClient object to access its operations.
     * 
     * @return the SystemAssignedIdentitiesClient object.
     */
    public SystemAssignedIdentitiesClient getSystemAssignedIdentities() {
        return this.systemAssignedIdentities;
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
     * The UserAssignedIdentitiesClient object to access its operations.
     */
    private final UserAssignedIdentitiesClient userAssignedIdentities;

    /**
     * Gets the UserAssignedIdentitiesClient object to access its operations.
     * 
     * @return the UserAssignedIdentitiesClient object.
     */
    public UserAssignedIdentitiesClient getUserAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * The FederatedIdentityCredentialsClient object to access its operations.
     */
    private final FederatedIdentityCredentialsClient federatedIdentityCredentials;

    /**
     * Gets the FederatedIdentityCredentialsClient object to access its operations.
     * 
     * @return the FederatedIdentityCredentialsClient object.
     */
    public FederatedIdentityCredentialsClient getFederatedIdentityCredentials() {
        return this.federatedIdentityCredentials;
    }

    /**
     * Initializes an instance of ManagedServiceIdentityClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The Id of the Subscription to which the identity belongs.
     * @param endpoint server parameter.
     */
    ManagedServiceIdentityClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-01-31";
        this.systemAssignedIdentities = new SystemAssignedIdentitiesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.userAssignedIdentities = new UserAssignedIdentitiesClientImpl(this);
        this.federatedIdentityCredentials = new FederatedIdentityCredentialsClientImpl(this);
    }
}
