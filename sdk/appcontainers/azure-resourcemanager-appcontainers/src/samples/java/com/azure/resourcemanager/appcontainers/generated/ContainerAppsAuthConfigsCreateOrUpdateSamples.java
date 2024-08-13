// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.resourcemanager.appcontainers.models.AppRegistration;
import com.azure.resourcemanager.appcontainers.models.AuthPlatform;
import com.azure.resourcemanager.appcontainers.models.EncryptionSettings;
import com.azure.resourcemanager.appcontainers.models.Facebook;
import com.azure.resourcemanager.appcontainers.models.GlobalValidation;
import com.azure.resourcemanager.appcontainers.models.IdentityProviders;
import com.azure.resourcemanager.appcontainers.models.UnauthenticatedClientActionV2;

/**
 * Samples for ContainerAppsAuthConfigs CreateOrUpdate.
 */
public final class ContainerAppsAuthConfigsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/stable/2024-03-01/examples/AuthConfigs_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Container App AuthConfig.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        createOrUpdateContainerAppAuthConfig(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerAppsAuthConfigs()
            .define("current")
            .withExistingContainerApp("workerapps-rg-xj", "testcanadacentral")
            .withPlatform(new AuthPlatform().withEnabled(true))
            .withGlobalValidation(
                new GlobalValidation().withUnauthenticatedClientAction(UnauthenticatedClientActionV2.ALLOW_ANONYMOUS))
            .withIdentityProviders(new IdentityProviders().withFacebook(new Facebook().withRegistration(
                new AppRegistration().withAppId("123").withAppSecretSettingName("fakeTokenPlaceholder"))))
            .withEncryptionSettings(
                new EncryptionSettings().withContainerAppAuthEncryptionSecretName("fakeTokenPlaceholder")
                    .withContainerAppAuthSigningSecretName("fakeTokenPlaceholder"))
            .create();
    }
}
