// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.AppServiceEnvironmentPatchResourceInner;
import com.azure.resourcemanager.appservice.models.VirtualNetworkProfile;

/**
 * Samples for AppServiceEnvironments Update.
 */
public final class AppServiceEnvironmentsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/AppServiceEnvironments_Update.json
     */
    /**
     * Sample code: Create or update an App Service Environment.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAnAppServiceEnvironment(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .updateWithResponse("test-rg", "test-ase",
                new AppServiceEnvironmentPatchResourceInner().withVirtualNetwork(new VirtualNetworkProfile().withId(
                    "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/test-rg/providers/Microsoft.Network/virtualNetworks/test-subnet/subnets/delegated"))
                    .withFrontEndScaleFactor(20),
                com.azure.core.util.Context.NONE);
    }
}
