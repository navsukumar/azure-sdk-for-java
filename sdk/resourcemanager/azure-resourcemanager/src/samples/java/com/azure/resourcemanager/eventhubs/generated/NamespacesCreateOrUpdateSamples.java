// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

import com.azure.resourcemanager.eventhubs.fluent.models.EHNamespaceInner;
import com.azure.resourcemanager.eventhubs.models.Encryption;
import com.azure.resourcemanager.eventhubs.models.Identity;
import com.azure.resourcemanager.eventhubs.models.KeySource;
import com.azure.resourcemanager.eventhubs.models.KeyVaultProperties;
import com.azure.resourcemanager.eventhubs.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.eventhubs.models.UserAssignedIdentity;
import com.azure.resourcemanager.eventhubs.models.UserAssignedIdentityProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Namespaces CreateOrUpdate.
 */
public final class NamespacesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/eventhub/resource-manager/Microsoft.EventHub/stable/2024-01-01/examples/NameSpaces/
     * EHNameSpaceCreate.json
     */
    /**
     * Sample code: NamespaceCreate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void namespaceCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.eventHubs()
            .manager()
            .serviceClient()
            .getNamespaces()
            .createOrUpdate("ResurceGroupSample", "NamespaceSample", new EHNamespaceInner().withLocation("East US")
                .withIdentity(new Identity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf(
                        "/subscriptions/SampleSubscription/resourceGroups/ResurceGroupSample/providers/Microsoft.ManagedIdentity/userAssignedIdentities/ud1",
                        new UserAssignedIdentity(),
                        "/subscriptions/SampleSubscription/resourceGroups/ResurceGroupSample/providers/Microsoft.ManagedIdentity/userAssignedIdentities/ud2",
                        new UserAssignedIdentity())))
                .withClusterArmId(
                    "/subscriptions/SampleSubscription/resourceGroups/ResurceGroupSample/providers/Microsoft.EventHub/clusters/enc-test")
                .withEncryption(new Encryption().withKeyVaultProperties(Arrays.asList(new KeyVaultProperties()
                    .withKeyName("fakeTokenPlaceholder")
                    .withKeyVaultUri("fakeTokenPlaceholder")
                    .withIdentity(new UserAssignedIdentityProperties().withUserAssignedIdentity(
                        "/subscriptions/SampleSubscription/resourceGroups/ResurceGroupSample/providers/Microsoft.ManagedIdentity/userAssignedIdentities/ud1"))))
                    .withKeySource(KeySource.MICROSOFT_KEY_VAULT)),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
