// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of IP configuration of an Azure Firewall.
 */
@Fluent
public final class AzureFirewallIpConfigurationPropertiesFormat {
    /*
     * The Firewall Internal Load Balancer IP to be used as the next hop in User Defined Routes.
     */
    @JsonProperty(value = "privateIPAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String privateIpAddress;

    /*
     * Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or
     * 'AzureFirewallManagementSubnet'.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * Reference to the PublicIP resource. This field is a mandatory input if subnet is not null.
     */
    @JsonProperty(value = "publicIPAddress")
    private SubResource publicIpAddress;

    /*
     * The provisioning state of the Azure firewall IP configuration resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of AzureFirewallIpConfigurationPropertiesFormat class.
     */
    public AzureFirewallIpConfigurationPropertiesFormat() {
    }

    /**
     * Get the privateIpAddress property: The Firewall Internal Load Balancer IP to be used as the next hop in User
     * Defined Routes.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Get the subnet property: Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or
     * 'AzureFirewallManagementSubnet'.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or
     * 'AzureFirewallManagementSubnet'.
     * 
     * @param subnet the subnet value to set.
     * @return the AzureFirewallIpConfigurationPropertiesFormat object itself.
     */
    public AzureFirewallIpConfigurationPropertiesFormat withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: Reference to the PublicIP resource. This field is a mandatory input if subnet
     * is not null.
     * 
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: Reference to the PublicIP resource. This field is a mandatory input if subnet
     * is not null.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the AzureFirewallIpConfigurationPropertiesFormat object itself.
     */
    public AzureFirewallIpConfigurationPropertiesFormat withPublicIpAddress(SubResource publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Azure firewall IP configuration resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
