// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for FirewallPolicyDrafts Delete.
 */
public final class FirewallPolicyDraftsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/FirewallPolicyDraftDelete.
     * json
     */
    /**
     * Sample code: delete firewall policy draft.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteFirewallPolicyDraft(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyDrafts()
            .deleteWithResponse("rg1", "firewallPolicy", com.azure.core.util.Context.NONE);
    }
}
