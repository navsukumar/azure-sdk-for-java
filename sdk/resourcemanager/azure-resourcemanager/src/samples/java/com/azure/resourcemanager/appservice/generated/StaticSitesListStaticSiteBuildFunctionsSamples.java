// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites ListStaticSiteBuildFunctions.
 */
public final class StaticSitesListStaticSiteBuildFunctionsSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ListStaticSiteBuildFunctions.json
     */
    /**
     * Sample code: Gets the functions of a particular static site build.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getsTheFunctionsOfAParticularStaticSiteBuild(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .listStaticSiteBuildFunctions("rg", "testStaticSite0", "default", com.azure.core.util.Context.NONE);
    }
}
