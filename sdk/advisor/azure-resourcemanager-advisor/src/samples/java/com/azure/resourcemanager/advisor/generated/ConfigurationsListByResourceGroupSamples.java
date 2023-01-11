// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

/** Samples for Configurations ListByResourceGroup. */
public final class ConfigurationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/stable/2020-01-01/examples/ListConfigurations.json
     */
    /**
     * Sample code: GetConfigurations.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void getConfigurations(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.configurations().listByResourceGroup("resourceGroup", com.azure.core.util.Context.NONE);
    }
}