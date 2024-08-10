// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites ListStaticSiteCustomDomains.
 */
public final class StaticSitesListStaticSiteCustomDomainsSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetStaticSiteCustomDomains.json
     */
    /**
     * Sample code: List custom domains for a static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listCustomDomainsForAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .listStaticSiteCustomDomains("rg", "testStaticSite0", com.azure.core.util.Context.NONE);
    }
}
