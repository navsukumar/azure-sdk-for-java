// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.CognitiveServicesManagementClient;
import com.azure.resourcemanager.cognitiveservices.implementation.AccountsImpl;
import com.azure.resourcemanager.cognitiveservices.implementation.CognitiveServicesManagementClientBuilder;
import com.azure.resourcemanager.cognitiveservices.implementation.CommitmentPlansImpl;
import com.azure.resourcemanager.cognitiveservices.implementation.CommitmentTiersImpl;
import com.azure.resourcemanager.cognitiveservices.implementation.DeletedAccountsImpl;
import com.azure.resourcemanager.cognitiveservices.implementation.DeploymentsImpl;
import com.azure.resourcemanager.cognitiveservices.implementation.OperationsImpl;
import com.azure.resourcemanager.cognitiveservices.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.cognitiveservices.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.cognitiveservices.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.cognitiveservices.implementation.ResourceSkusImpl;
import com.azure.resourcemanager.cognitiveservices.models.Accounts;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlans;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentTiers;
import com.azure.resourcemanager.cognitiveservices.models.DeletedAccounts;
import com.azure.resourcemanager.cognitiveservices.models.Deployments;
import com.azure.resourcemanager.cognitiveservices.models.Operations;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointConnections;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResources;
import com.azure.resourcemanager.cognitiveservices.models.ResourceProviders;
import com.azure.resourcemanager.cognitiveservices.models.ResourceSkus;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to CognitiveServicesManager. Cognitive Services Management Client. */
public final class CognitiveServicesManager {
    private Accounts accounts;

    private DeletedAccounts deletedAccounts;

    private ResourceSkus resourceSkus;

    private Operations operations;

    private ResourceProviders resourceProviders;

    private CommitmentTiers commitmentTiers;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private Deployments deployments;

    private CommitmentPlans commitmentPlans;

    private final CognitiveServicesManagementClient clientObject;

    private CognitiveServicesManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new CognitiveServicesManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of CognitiveServices service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the CognitiveServices service API instance.
     */
    public static CognitiveServicesManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of CognitiveServices service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the CognitiveServices service API instance.
     */
    public static CognitiveServicesManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new CognitiveServicesManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create CognitiveServicesManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new CognitiveServicesManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         *
         * <p>This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval =
                Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of CognitiveServices service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the CognitiveServices service API instance.
         */
        public CognitiveServicesManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.cognitiveservices")
                .append("/")
                .append("1.0.0-beta.7");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new CognitiveServicesManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Accounts. It manages Account.
     *
     * @return Resource collection API of Accounts.
     */
    public Accounts accounts() {
        if (this.accounts == null) {
            this.accounts = new AccountsImpl(clientObject.getAccounts(), this);
        }
        return accounts;
    }

    /**
     * Gets the resource collection API of DeletedAccounts.
     *
     * @return Resource collection API of DeletedAccounts.
     */
    public DeletedAccounts deletedAccounts() {
        if (this.deletedAccounts == null) {
            this.deletedAccounts = new DeletedAccountsImpl(clientObject.getDeletedAccounts(), this);
        }
        return deletedAccounts;
    }

    /**
     * Gets the resource collection API of ResourceSkus.
     *
     * @return Resource collection API of ResourceSkus.
     */
    public ResourceSkus resourceSkus() {
        if (this.resourceSkus == null) {
            this.resourceSkus = new ResourceSkusImpl(clientObject.getResourceSkus(), this);
        }
        return resourceSkus;
    }

    /**
     * Gets the resource collection API of Operations.
     *
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of ResourceProviders.
     *
     * @return Resource collection API of ResourceProviders.
     */
    public ResourceProviders resourceProviders() {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ResourceProvidersImpl(clientObject.getResourceProviders(), this);
        }
        return resourceProviders;
    }

    /**
     * Gets the resource collection API of CommitmentTiers.
     *
     * @return Resource collection API of CommitmentTiers.
     */
    public CommitmentTiers commitmentTiers() {
        if (this.commitmentTiers == null) {
            this.commitmentTiers = new CommitmentTiersImpl(clientObject.getCommitmentTiers(), this);
        }
        return commitmentTiers;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnections. It manages PrivateEndpointConnection.
     *
     * @return Resource collection API of PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /**
     * Gets the resource collection API of PrivateLinkResources.
     *
     * @return Resource collection API of PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /**
     * Gets the resource collection API of Deployments. It manages Deployment.
     *
     * @return Resource collection API of Deployments.
     */
    public Deployments deployments() {
        if (this.deployments == null) {
            this.deployments = new DeploymentsImpl(clientObject.getDeployments(), this);
        }
        return deployments;
    }

    /**
     * Gets the resource collection API of CommitmentPlans. It manages CommitmentPlan, CommitmentPlanAccountAssociation.
     *
     * @return Resource collection API of CommitmentPlans.
     */
    public CommitmentPlans commitmentPlans() {
        if (this.commitmentPlans == null) {
            this.commitmentPlans = new CommitmentPlansImpl(clientObject.getCommitmentPlans(), this);
        }
        return commitmentPlans;
    }

    /**
     * @return Wrapped service client CognitiveServicesManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public CognitiveServicesManagementClient serviceClient() {
        return this.clientObject;
    }
}
