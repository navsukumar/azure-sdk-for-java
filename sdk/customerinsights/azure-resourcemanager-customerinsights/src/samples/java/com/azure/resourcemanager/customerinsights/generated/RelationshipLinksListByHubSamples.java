// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

/** Samples for RelationshipLinks ListByHub. */
public final class RelationshipLinksListByHubSamples {
    /*
     * x-ms-original-file: specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/RelationshipLinksListByHub.json
     */
    /**
     * Sample code: RelationshipLinks_ListByHub.
     *
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void relationshipLinksListByHub(
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager.relationshipLinks().listByHub("TestHubRG", "sdkTestHub", com.azure.core.util.Context.NONE);
    }
}
