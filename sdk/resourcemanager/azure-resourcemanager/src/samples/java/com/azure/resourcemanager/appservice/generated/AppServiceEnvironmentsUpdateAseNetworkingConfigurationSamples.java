// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.AseV3NetworkingConfigurationInner;

/**
 * Samples for AppServiceEnvironments UpdateAseNetworkingConfiguration.
 */
public final class AppServiceEnvironmentsUpdateAseNetworkingConfigurationSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/
     * AppServiceEnvironments_UpdateAseNetworkingConfiguration.json
     */
    /**
     * Sample code: Update networking configuration of an App Service Environment.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        updateNetworkingConfigurationOfAnAppServiceEnvironment(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .updateAseNetworkingConfigurationWithResponse("test-rg", "test-ase",
                new AseV3NetworkingConfigurationInner().withFtpEnabled(true).withRemoteDebugEnabled(true),
                com.azure.core.util.Context.NONE);
    }
}
