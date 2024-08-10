// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for AppServiceEnvironments Upgrade.
 */
public final class AppServiceEnvironmentsUpgradeSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/AppServiceEnvironments_Upgrade.json
     */
    /**
     * Sample code: Initiate an upgrade on an App Service Environment.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        initiateAnUpgradeOnAnAppServiceEnvironment(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .upgrade("rg", "SampleHostingEnvironment", com.azure.core.util.Context.NONE);
    }
}
