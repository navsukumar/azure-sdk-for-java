// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights;

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
import com.azure.resourcemanager.customerinsights.fluent.CustomerInsightsManagementClient;
import com.azure.resourcemanager.customerinsights.implementation.AuthorizationPoliciesImpl;
import com.azure.resourcemanager.customerinsights.implementation.ConnectorMappingsImpl;
import com.azure.resourcemanager.customerinsights.implementation.ConnectorsImpl;
import com.azure.resourcemanager.customerinsights.implementation.CustomerInsightsManagementClientBuilder;
import com.azure.resourcemanager.customerinsights.implementation.HubsImpl;
import com.azure.resourcemanager.customerinsights.implementation.ImagesImpl;
import com.azure.resourcemanager.customerinsights.implementation.InteractionsImpl;
import com.azure.resourcemanager.customerinsights.implementation.KpisImpl;
import com.azure.resourcemanager.customerinsights.implementation.LinksImpl;
import com.azure.resourcemanager.customerinsights.implementation.OperationsImpl;
import com.azure.resourcemanager.customerinsights.implementation.PredictionsImpl;
import com.azure.resourcemanager.customerinsights.implementation.ProfilesImpl;
import com.azure.resourcemanager.customerinsights.implementation.RelationshipLinksImpl;
import com.azure.resourcemanager.customerinsights.implementation.RelationshipsImpl;
import com.azure.resourcemanager.customerinsights.implementation.RoleAssignmentsImpl;
import com.azure.resourcemanager.customerinsights.implementation.RolesImpl;
import com.azure.resourcemanager.customerinsights.implementation.ViewsImpl;
import com.azure.resourcemanager.customerinsights.implementation.WidgetTypesImpl;
import com.azure.resourcemanager.customerinsights.models.AuthorizationPolicies;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappings;
import com.azure.resourcemanager.customerinsights.models.Connectors;
import com.azure.resourcemanager.customerinsights.models.Hubs;
import com.azure.resourcemanager.customerinsights.models.Images;
import com.azure.resourcemanager.customerinsights.models.Interactions;
import com.azure.resourcemanager.customerinsights.models.Kpis;
import com.azure.resourcemanager.customerinsights.models.Links;
import com.azure.resourcemanager.customerinsights.models.Operations;
import com.azure.resourcemanager.customerinsights.models.Predictions;
import com.azure.resourcemanager.customerinsights.models.Profiles;
import com.azure.resourcemanager.customerinsights.models.RelationshipLinks;
import com.azure.resourcemanager.customerinsights.models.Relationships;
import com.azure.resourcemanager.customerinsights.models.RoleAssignments;
import com.azure.resourcemanager.customerinsights.models.Roles;
import com.azure.resourcemanager.customerinsights.models.Views;
import com.azure.resourcemanager.customerinsights.models.WidgetTypes;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to CustomerInsightsManager. The Azure Customer Insights management API provides a RESTful set of web
 * services that interact with Azure Customer Insights service to manage your resources. The API has entities that
 * capture the relationship between an end user and the Azure Customer Insights service.
 */
public final class CustomerInsightsManager {
    private Operations operations;

    private Hubs hubs;

    private Profiles profiles;

    private Interactions interactions;

    private Relationships relationships;

    private RelationshipLinks relationshipLinks;

    private AuthorizationPolicies authorizationPolicies;

    private Connectors connectors;

    private ConnectorMappings connectorMappings;

    private Kpis kpis;

    private WidgetTypes widgetTypes;

    private Views views;

    private Links links;

    private Roles roles;

    private RoleAssignments roleAssignments;

    private Images images;

    private Predictions predictions;

    private final CustomerInsightsManagementClient clientObject;

    private CustomerInsightsManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new CustomerInsightsManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of CustomerInsights service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the CustomerInsights service API instance.
     */
    public static CustomerInsightsManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of CustomerInsights service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the CustomerInsights service API instance.
     */
    public static CustomerInsightsManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new CustomerInsightsManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create CustomerInsightsManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new CustomerInsightsManager.Configurable();
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
         * Creates an instance of CustomerInsights service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the CustomerInsights service API instance.
         */
        public CustomerInsightsManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.customerinsights")
                .append("/")
                .append("1.0.0-beta.2");
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
            return new CustomerInsightsManager(httpPipeline, profile, defaultPollInterval);
        }
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
     * Gets the resource collection API of Hubs. It manages Hub.
     *
     * @return Resource collection API of Hubs.
     */
    public Hubs hubs() {
        if (this.hubs == null) {
            this.hubs = new HubsImpl(clientObject.getHubs(), this);
        }
        return hubs;
    }

    /**
     * Gets the resource collection API of Profiles. It manages ProfileResourceFormat.
     *
     * @return Resource collection API of Profiles.
     */
    public Profiles profiles() {
        if (this.profiles == null) {
            this.profiles = new ProfilesImpl(clientObject.getProfiles(), this);
        }
        return profiles;
    }

    /**
     * Gets the resource collection API of Interactions. It manages InteractionResourceFormat.
     *
     * @return Resource collection API of Interactions.
     */
    public Interactions interactions() {
        if (this.interactions == null) {
            this.interactions = new InteractionsImpl(clientObject.getInteractions(), this);
        }
        return interactions;
    }

    /**
     * Gets the resource collection API of Relationships. It manages RelationshipResourceFormat.
     *
     * @return Resource collection API of Relationships.
     */
    public Relationships relationships() {
        if (this.relationships == null) {
            this.relationships = new RelationshipsImpl(clientObject.getRelationships(), this);
        }
        return relationships;
    }

    /**
     * Gets the resource collection API of RelationshipLinks. It manages RelationshipLinkResourceFormat.
     *
     * @return Resource collection API of RelationshipLinks.
     */
    public RelationshipLinks relationshipLinks() {
        if (this.relationshipLinks == null) {
            this.relationshipLinks = new RelationshipLinksImpl(clientObject.getRelationshipLinks(), this);
        }
        return relationshipLinks;
    }

    /**
     * Gets the resource collection API of AuthorizationPolicies. It manages AuthorizationPolicyResourceFormat.
     *
     * @return Resource collection API of AuthorizationPolicies.
     */
    public AuthorizationPolicies authorizationPolicies() {
        if (this.authorizationPolicies == null) {
            this.authorizationPolicies = new AuthorizationPoliciesImpl(clientObject.getAuthorizationPolicies(), this);
        }
        return authorizationPolicies;
    }

    /**
     * Gets the resource collection API of Connectors. It manages ConnectorResourceFormat.
     *
     * @return Resource collection API of Connectors.
     */
    public Connectors connectors() {
        if (this.connectors == null) {
            this.connectors = new ConnectorsImpl(clientObject.getConnectors(), this);
        }
        return connectors;
    }

    /**
     * Gets the resource collection API of ConnectorMappings. It manages ConnectorMappingResourceFormat.
     *
     * @return Resource collection API of ConnectorMappings.
     */
    public ConnectorMappings connectorMappings() {
        if (this.connectorMappings == null) {
            this.connectorMappings = new ConnectorMappingsImpl(clientObject.getConnectorMappings(), this);
        }
        return connectorMappings;
    }

    /**
     * Gets the resource collection API of Kpis. It manages KpiResourceFormat.
     *
     * @return Resource collection API of Kpis.
     */
    public Kpis kpis() {
        if (this.kpis == null) {
            this.kpis = new KpisImpl(clientObject.getKpis(), this);
        }
        return kpis;
    }

    /**
     * Gets the resource collection API of WidgetTypes.
     *
     * @return Resource collection API of WidgetTypes.
     */
    public WidgetTypes widgetTypes() {
        if (this.widgetTypes == null) {
            this.widgetTypes = new WidgetTypesImpl(clientObject.getWidgetTypes(), this);
        }
        return widgetTypes;
    }

    /**
     * Gets the resource collection API of Views. It manages ViewResourceFormat.
     *
     * @return Resource collection API of Views.
     */
    public Views views() {
        if (this.views == null) {
            this.views = new ViewsImpl(clientObject.getViews(), this);
        }
        return views;
    }

    /**
     * Gets the resource collection API of Links. It manages LinkResourceFormat.
     *
     * @return Resource collection API of Links.
     */
    public Links links() {
        if (this.links == null) {
            this.links = new LinksImpl(clientObject.getLinks(), this);
        }
        return links;
    }

    /**
     * Gets the resource collection API of Roles.
     *
     * @return Resource collection API of Roles.
     */
    public Roles roles() {
        if (this.roles == null) {
            this.roles = new RolesImpl(clientObject.getRoles(), this);
        }
        return roles;
    }

    /**
     * Gets the resource collection API of RoleAssignments. It manages RoleAssignmentResourceFormat.
     *
     * @return Resource collection API of RoleAssignments.
     */
    public RoleAssignments roleAssignments() {
        if (this.roleAssignments == null) {
            this.roleAssignments = new RoleAssignmentsImpl(clientObject.getRoleAssignments(), this);
        }
        return roleAssignments;
    }

    /**
     * Gets the resource collection API of Images.
     *
     * @return Resource collection API of Images.
     */
    public Images images() {
        if (this.images == null) {
            this.images = new ImagesImpl(clientObject.getImages(), this);
        }
        return images;
    }

    /**
     * Gets the resource collection API of Predictions. It manages PredictionResourceFormat.
     *
     * @return Resource collection API of Predictions.
     */
    public Predictions predictions() {
        if (this.predictions == null) {
            this.predictions = new PredictionsImpl(clientObject.getPredictions(), this);
        }
        return predictions;
    }

    /**
     * @return Wrapped service client CustomerInsightsManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public CustomerInsightsManagementClient serviceClient() {
        return this.clientObject;
    }
}
