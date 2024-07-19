// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.VpnServerConfigurationPolicyGroupInner;
import com.azure.resourcemanager.network.models.VpnPolicyMemberAttributeType;
import com.azure.resourcemanager.network.models.VpnServerConfigurationPolicyGroupMember;

import java.util.Arrays;

/**
 * Samples for ConfigurationPolicyGroups CreateOrUpdate.
 */
public final class ConfigurationPolicyGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/ConfigurationPolicyGroupPut.
     * json
     */
    /**
     * Sample code: ConfigurationPolicyGroupPut.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void configurationPolicyGroupPut(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getConfigurationPolicyGroups()
            .createOrUpdate("rg1", "vpnServerConfiguration1", "policyGroup1",
                new VpnServerConfigurationPolicyGroupInner().withIsDefault(true)
                    .withPriority(0)
                    .withPolicyMembers(Arrays.asList(
                        new VpnServerConfigurationPolicyGroupMember().withName("policy1")
                            .withAttributeType(VpnPolicyMemberAttributeType.RADIUS_AZURE_GROUP_ID)
                            .withAttributeValue("6ad1bd08"),
                        new VpnServerConfigurationPolicyGroupMember().withName("policy2")
                            .withAttributeType(VpnPolicyMemberAttributeType.CERTIFICATE_GROUP_ID)
                            .withAttributeValue("red.com"))),
                com.azure.core.util.Context.NONE);
    }
}
