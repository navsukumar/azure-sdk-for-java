// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.models.ApiEntityReference;
import com.azure.resourcemanager.compute.models.IpVersion;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetPublicIpAddressConfiguration;
import java.io.IOException;
import java.util.List;

/**
 * Describes a virtual machine scale set network profile's IP configuration properties.
 */
@Fluent
public final class VirtualMachineScaleSetIpConfigurationProperties
    implements JsonSerializable<VirtualMachineScaleSetIpConfigurationProperties> {
    /*
     * Specifies the identifier of the subnet.
     */
    private ApiEntityReference subnet;

    /*
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     */
    private Boolean primary;

    /*
     * The publicIPAddressConfiguration.
     */
    private VirtualMachineScaleSetPublicIpAddressConfiguration publicIpAddressConfiguration;

    /*
     * Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or
     * IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     */
    private IpVersion privateIpAddressVersion;

    /*
     * Specifies an array of references to backend address pools of application gateways. A scale set can reference
     * backend address pools of multiple application gateways. Multiple scale sets cannot use the same application
     * gateway.
     */
    private List<SubResource> applicationGatewayBackendAddressPools;

    /*
     * Specifies an array of references to application security group.
     */
    private List<SubResource> applicationSecurityGroups;

    /*
     * Specifies an array of references to backend address pools of load balancers. A scale set can reference backend
     * address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku
     * load balancer.
     */
    private List<SubResource> loadBalancerBackendAddressPools;

    /*
     * Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound
     * nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load
     * balancer.
     */
    private List<SubResource> loadBalancerInboundNatPools;

    /**
     * Creates an instance of VirtualMachineScaleSetIpConfigurationProperties class.
     */
    public VirtualMachineScaleSetIpConfigurationProperties() {
    }

    /**
     * Get the subnet property: Specifies the identifier of the subnet.
     * 
     * @return the subnet value.
     */
    public ApiEntityReference subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Specifies the identifier of the subnet.
     * 
     * @param subnet the subnet value to set.
     * @return the VirtualMachineScaleSetIpConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetIpConfigurationProperties withSubnet(ApiEntityReference subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @param primary the primary value to set.
     * @return the VirtualMachineScaleSetIpConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetIpConfigurationProperties withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     * 
     * @return the publicIpAddressConfiguration value.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration publicIpAddressConfiguration() {
        return this.publicIpAddressConfiguration;
    }

    /**
     * Set the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     * 
     * @param publicIpAddressConfiguration the publicIpAddressConfiguration value to set.
     * @return the VirtualMachineScaleSetIpConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetIpConfigurationProperties withPublicIpAddressConfiguration(
        VirtualMachineScaleSetPublicIpAddressConfiguration publicIpAddressConfiguration) {
        this.publicIpAddressConfiguration = publicIpAddressConfiguration;
        return this;
    }

    /**
     * Get the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @return the privateIpAddressVersion value.
     */
    public IpVersion privateIpAddressVersion() {
        return this.privateIpAddressVersion;
    }

    /**
     * Set the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the VirtualMachineScaleSetIpConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetIpConfigurationProperties
        withPrivateIpAddressVersion(IpVersion privateIpAddressVersion) {
        this.privateIpAddressVersion = privateIpAddressVersion;
        return this;
    }

    /**
     * Get the applicationGatewayBackendAddressPools property: Specifies an array of references to backend address pools
     * of application gateways. A scale set can reference backend address pools of multiple application gateways.
     * Multiple scale sets cannot use the same application gateway.
     * 
     * @return the applicationGatewayBackendAddressPools value.
     */
    public List<SubResource> applicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools;
    }

    /**
     * Set the applicationGatewayBackendAddressPools property: Specifies an array of references to backend address pools
     * of application gateways. A scale set can reference backend address pools of multiple application gateways.
     * Multiple scale sets cannot use the same application gateway.
     * 
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set.
     * @return the VirtualMachineScaleSetIpConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetIpConfigurationProperties
        withApplicationGatewayBackendAddressPools(List<SubResource> applicationGatewayBackendAddressPools) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        return this;
    }

    /**
     * Get the applicationSecurityGroups property: Specifies an array of references to application security group.
     * 
     * @return the applicationSecurityGroups value.
     */
    public List<SubResource> applicationSecurityGroups() {
        return this.applicationSecurityGroups;
    }

    /**
     * Set the applicationSecurityGroups property: Specifies an array of references to application security group.
     * 
     * @param applicationSecurityGroups the applicationSecurityGroups value to set.
     * @return the VirtualMachineScaleSetIpConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetIpConfigurationProperties
        withApplicationSecurityGroups(List<SubResource> applicationSecurityGroups) {
        this.applicationSecurityGroups = applicationSecurityGroups;
        return this;
    }

    /**
     * Get the loadBalancerBackendAddressPools property: Specifies an array of references to backend address pools of
     * load balancers. A scale set can reference backend address pools of one public and one internal load balancer.
     * Multiple scale sets cannot use the same basic sku load balancer.
     * 
     * @return the loadBalancerBackendAddressPools value.
     */
    public List<SubResource> loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * Set the loadBalancerBackendAddressPools property: Specifies an array of references to backend address pools of
     * load balancers. A scale set can reference backend address pools of one public and one internal load balancer.
     * Multiple scale sets cannot use the same basic sku load balancer.
     * 
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set.
     * @return the VirtualMachineScaleSetIpConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetIpConfigurationProperties
        withLoadBalancerBackendAddressPools(List<SubResource> loadBalancerBackendAddressPools) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancerInboundNatPools property: Specifies an array of references to inbound Nat pools of the load
     * balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple
     * scale sets cannot use the same basic sku load balancer.
     * 
     * @return the loadBalancerInboundNatPools value.
     */
    public List<SubResource> loadBalancerInboundNatPools() {
        return this.loadBalancerInboundNatPools;
    }

    /**
     * Set the loadBalancerInboundNatPools property: Specifies an array of references to inbound Nat pools of the load
     * balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple
     * scale sets cannot use the same basic sku load balancer.
     * 
     * @param loadBalancerInboundNatPools the loadBalancerInboundNatPools value to set.
     * @return the VirtualMachineScaleSetIpConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetIpConfigurationProperties
        withLoadBalancerInboundNatPools(List<SubResource> loadBalancerInboundNatPools) {
        this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
        if (publicIpAddressConfiguration() != null) {
            publicIpAddressConfiguration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("subnet", this.subnet);
        jsonWriter.writeBooleanField("primary", this.primary);
        jsonWriter.writeJsonField("publicIPAddressConfiguration", this.publicIpAddressConfiguration);
        jsonWriter.writeStringField("privateIPAddressVersion",
            this.privateIpAddressVersion == null ? null : this.privateIpAddressVersion.toString());
        jsonWriter.writeArrayField("applicationGatewayBackendAddressPools", this.applicationGatewayBackendAddressPools,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("applicationSecurityGroups", this.applicationSecurityGroups,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("loadBalancerBackendAddressPools", this.loadBalancerBackendAddressPools,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("loadBalancerInboundNatPools", this.loadBalancerInboundNatPools,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetIpConfigurationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetIpConfigurationProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetIpConfigurationProperties.
     */
    public static VirtualMachineScaleSetIpConfigurationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetIpConfigurationProperties deserializedVirtualMachineScaleSetIpConfigurationProperties
                = new VirtualMachineScaleSetIpConfigurationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subnet".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetIpConfigurationProperties.subnet
                        = ApiEntityReference.fromJson(reader);
                } else if ("primary".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetIpConfigurationProperties.primary
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("publicIPAddressConfiguration".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetIpConfigurationProperties.publicIpAddressConfiguration
                        = VirtualMachineScaleSetPublicIpAddressConfiguration.fromJson(reader);
                } else if ("privateIPAddressVersion".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetIpConfigurationProperties.privateIpAddressVersion
                        = IpVersion.fromString(reader.getString());
                } else if ("applicationGatewayBackendAddressPools".equals(fieldName)) {
                    List<SubResource> applicationGatewayBackendAddressPools
                        = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedVirtualMachineScaleSetIpConfigurationProperties.applicationGatewayBackendAddressPools
                        = applicationGatewayBackendAddressPools;
                } else if ("applicationSecurityGroups".equals(fieldName)) {
                    List<SubResource> applicationSecurityGroups
                        = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedVirtualMachineScaleSetIpConfigurationProperties.applicationSecurityGroups
                        = applicationSecurityGroups;
                } else if ("loadBalancerBackendAddressPools".equals(fieldName)) {
                    List<SubResource> loadBalancerBackendAddressPools
                        = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedVirtualMachineScaleSetIpConfigurationProperties.loadBalancerBackendAddressPools
                        = loadBalancerBackendAddressPools;
                } else if ("loadBalancerInboundNatPools".equals(fieldName)) {
                    List<SubResource> loadBalancerInboundNatPools
                        = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedVirtualMachineScaleSetIpConfigurationProperties.loadBalancerInboundNatPools
                        = loadBalancerInboundNatPools;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetIpConfigurationProperties;
        });
    }
}
