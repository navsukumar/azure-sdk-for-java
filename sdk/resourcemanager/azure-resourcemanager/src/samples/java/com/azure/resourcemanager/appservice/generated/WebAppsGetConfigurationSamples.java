// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WebApps GetConfiguration.
 */
public final class WebAppsGetConfigurationSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetSiteConfig.json
     */
    /**
     * Sample code: Get Site Config.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSiteConfig(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getConfigurationWithResponse("testrg123", "sitef6141", com.azure.core.util.Context.NONE);
    }
}
