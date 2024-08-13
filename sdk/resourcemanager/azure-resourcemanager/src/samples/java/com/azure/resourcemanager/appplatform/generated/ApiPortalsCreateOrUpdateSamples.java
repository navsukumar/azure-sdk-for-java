// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.resourcemanager.appplatform.fluent.models.ApiPortalResourceInner;
import com.azure.resourcemanager.appplatform.models.ApiPortalApiTryOutEnabledState;
import com.azure.resourcemanager.appplatform.models.ApiPortalProperties;
import com.azure.resourcemanager.appplatform.models.Sku;
import java.util.Arrays;

/**
 * Samples for ApiPortals CreateOrUpdate.
 */
public final class ApiPortalsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * ApiPortals_CreateOrUpdate.json
     */
    /**
     * Sample code: ApiPortals_CreateOrUpdate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void apiPortalsCreateOrUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getApiPortals()
            .createOrUpdate("myResourceGroup", "myservice", "default", new ApiPortalResourceInner()
                .withProperties(new ApiPortalProperties().withPublicProperty(true)
                    .withGatewayIds(Arrays.asList(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/gateways/default"))
                    .withApiTryOutEnabledState(ApiPortalApiTryOutEnabledState.ENABLED))
                .withSku(new Sku().withName("E0").withTier("Enterprise").withCapacity(2)),
                com.azure.core.util.Context.NONE);
    }
}
