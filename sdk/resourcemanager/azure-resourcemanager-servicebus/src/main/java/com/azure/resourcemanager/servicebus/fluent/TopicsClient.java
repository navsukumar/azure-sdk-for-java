// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.servicebus.fluent.models.SBAuthorizationRuleInner;
import com.azure.resourcemanager.servicebus.fluent.models.SBTopicInner;
import com.azure.resourcemanager.servicebus.models.RegenerateAccessKeyParameters;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in TopicsClient.
 */
public interface TopicsClient {
    /**
     * Gets authorization rules for a topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization rules for a topic as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SBAuthorizationRuleInner> listAuthorizationRulesAsync(String resourceGroupName, String namespaceName,
        String topicName);

    /**
     * Gets authorization rules for a topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization rules for a topic as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBAuthorizationRuleInner> listAuthorizationRules(String resourceGroupName, String namespaceName,
        String topicName);

    /**
     * Gets authorization rules for a topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization rules for a topic as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBAuthorizationRuleInner> listAuthorizationRules(String resourceGroupName, String namespaceName,
        String topicName, Context context);

    /**
     * Creates an authorization rule for the specified topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SBAuthorizationRuleInner>> createOrUpdateAuthorizationRuleWithResponseAsync(String resourceGroupName,
        String namespaceName, String topicName, String authorizationRuleName, SBAuthorizationRuleInner parameters);

    /**
     * Creates an authorization rule for the specified topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SBAuthorizationRuleInner> createOrUpdateAuthorizationRuleAsync(String resourceGroupName, String namespaceName,
        String topicName, String authorizationRuleName, SBAuthorizationRuleInner parameters);

    /**
     * Creates an authorization rule for the specified topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The shared access authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBAuthorizationRuleInner> createOrUpdateAuthorizationRuleWithResponse(String resourceGroupName,
        String namespaceName, String topicName, String authorizationRuleName, SBAuthorizationRuleInner parameters,
        Context context);

    /**
     * Creates an authorization rule for the specified topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBAuthorizationRuleInner createOrUpdateAuthorizationRule(String resourceGroupName, String namespaceName,
        String topicName, String authorizationRuleName, SBAuthorizationRuleInner parameters);

    /**
     * Returns the specified authorization rule.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SBAuthorizationRuleInner>> getAuthorizationRuleWithResponseAsync(String resourceGroupName,
        String namespaceName, String topicName, String authorizationRuleName);

    /**
     * Returns the specified authorization rule.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SBAuthorizationRuleInner> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName,
        String topicName, String authorizationRuleName);

    /**
     * Returns the specified authorization rule.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBAuthorizationRuleInner> getAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String topicName, String authorizationRuleName, Context context);

    /**
     * Returns the specified authorization rule.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBAuthorizationRuleInner getAuthorizationRule(String resourceGroupName, String namespaceName, String topicName,
        String authorizationRuleName);

    /**
     * Deletes a topic authorization rule.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteAuthorizationRuleWithResponseAsync(String resourceGroupName, String namespaceName,
        String topicName, String authorizationRuleName);

    /**
     * Deletes a topic authorization rule.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String topicName,
        String authorizationRuleName);

    /**
     * Deletes a topic authorization rule.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName, String topicName,
        String authorizationRuleName, Context context);

    /**
     * Deletes a topic authorization rule.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String topicName,
        String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the topic along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AccessKeysInner>> listKeysWithResponseAsync(String resourceGroupName, String namespaceName,
        String topicName, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the topic on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AccessKeysInner> listKeysAsync(String resourceGroupName, String namespaceName, String topicName,
        String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the topic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> listKeysWithResponse(String resourceGroupName, String namespaceName, String topicName,
        String authorizationRuleName, Context context);

    /**
     * Gets the primary and secondary connection strings for the topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner listKeys(String resourceGroupName, String namespaceName, String topicName,
        String authorizationRuleName);

    /**
     * Regenerates primary or secondary connection strings for the topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AccessKeysInner>> regenerateKeysWithResponseAsync(String resourceGroupName, String namespaceName,
        String topicName, String authorizationRuleName, RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates primary or secondary connection strings for the topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AccessKeysInner> regenerateKeysAsync(String resourceGroupName, String namespaceName, String topicName,
        String authorizationRuleName, RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates primary or secondary connection strings for the topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> regenerateKeysWithResponse(String resourceGroupName, String namespaceName,
        String topicName, String authorizationRuleName, RegenerateAccessKeyParameters parameters, Context context);

    /**
     * Regenerates primary or secondary connection strings for the topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner regenerateKeys(String resourceGroupName, String namespaceName, String topicName,
        String authorizationRuleName, RegenerateAccessKeyParameters parameters);

    /**
     * Gets all the topics in a namespace.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     * a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     * point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the topics in a namespace as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SBTopicInner> listByNamespaceAsync(String resourceGroupName, String namespaceName, Integer skip,
        Integer top);

    /**
     * Gets all the topics in a namespace.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the topics in a namespace as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SBTopicInner> listByNamespaceAsync(String resourceGroupName, String namespaceName);

    /**
     * Gets all the topics in a namespace.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the topics in a namespace as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBTopicInner> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Gets all the topics in a namespace.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     * a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     * point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the topics in a namespace as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBTopicInner> listByNamespace(String resourceGroupName, String namespaceName, Integer skip,
        Integer top, Context context);

    /**
     * Creates a topic in the specified namespace.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param parameters Parameters supplied to create a topic resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SBTopicInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String namespaceName,
        String topicName, SBTopicInner parameters);

    /**
     * Creates a topic in the specified namespace.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param parameters Parameters supplied to create a topic resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SBTopicInner> createOrUpdateAsync(String resourceGroupName, String namespaceName, String topicName,
        SBTopicInner parameters);

    /**
     * Creates a topic in the specified namespace.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param parameters Parameters supplied to create a topic resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBTopicInner> createOrUpdateWithResponse(String resourceGroupName, String namespaceName, String topicName,
        SBTopicInner parameters, Context context);

    /**
     * Creates a topic in the specified namespace.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param parameters Parameters supplied to create a topic resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBTopicInner createOrUpdate(String resourceGroupName, String namespaceName, String topicName,
        SBTopicInner parameters);

    /**
     * Deletes a topic from the specified namespace and resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Deletes a topic from the specified namespace and resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Deletes a topic from the specified namespace and resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String namespaceName, String topicName,
        Context context);

    /**
     * Deletes a topic from the specified namespace and resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Returns a description for the specified topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SBTopicInner>> getWithResponseAsync(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Returns a description for the specified topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SBTopicInner> getAsync(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Returns a description for the specified topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBTopicInner> getWithResponse(String resourceGroupName, String namespaceName, String topicName,
        Context context);

    /**
     * Returns a description for the specified topic.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBTopicInner get(String resourceGroupName, String namespaceName, String topicName);
}
