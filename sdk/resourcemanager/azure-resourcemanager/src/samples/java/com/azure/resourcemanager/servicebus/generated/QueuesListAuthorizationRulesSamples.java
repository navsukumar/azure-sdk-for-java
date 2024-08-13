// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

/**
 * Samples for Queues ListAuthorizationRules.
 */
public final class QueuesListAuthorizationRulesSamples {
    /*
     * x-ms-original-file:
     * specification/servicebus/resource-manager/Microsoft.ServiceBus/stable/2021-11-01/examples/Queues/
     * SBQueueAuthorizationRuleListAll.json
     */
    /**
     * Sample code: QueueAuthorizationRuleListAll.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void queueAuthorizationRuleListAll(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.serviceBusNamespaces()
            .manager()
            .serviceClient()
            .getQueues()
            .listAuthorizationRules("ArunMonocle", "sdk-Namespace-7982", "sdk-Queues-2317",
                com.azure.core.util.Context.NONE);
    }
}
