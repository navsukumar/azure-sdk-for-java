// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;

/**
 * IP configuration for virtual network gateway.
 */
@Fluent
public final class VirtualNetworkGatewayIpConfigurationInner extends SubResource {
    /*
     * Properties of the virtual network gateway ip configuration.
     */
    private VirtualNetworkGatewayIpConfigurationPropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of VirtualNetworkGatewayIpConfigurationInner class.
     */
    public VirtualNetworkGatewayIpConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the virtual network gateway ip configuration.
     * 
     * @return the innerProperties value.
     */
    private VirtualNetworkGatewayIpConfigurationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the VirtualNetworkGatewayIpConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIpConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualNetworkGatewayIpConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAllocationMethod();
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the VirtualNetworkGatewayIpConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIpConfigurationInner
        withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    /**
     * Get the subnet property: The reference to the subnet resource.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: The reference to the subnet resource.
     * 
     * @param subnet the subnet value to set.
     * @return the VirtualNetworkGatewayIpConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIpConfigurationInner withSubnet(SubResource subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the publicIpAddress property: The reference to the public IP resource.
     * 
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddress();
    }

    /**
     * Set the publicIpAddress property: The reference to the public IP resource.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the VirtualNetworkGatewayIpConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIpConfigurationInner withPublicIpAddress(SubResource publicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * Get the privateIpAddress property: Private IP Address for this gateway.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway IP configuration
     * resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkGatewayIpConfigurationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkGatewayIpConfigurationInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualNetworkGatewayIpConfigurationInner.
     */
    public static VirtualNetworkGatewayIpConfigurationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkGatewayIpConfigurationInner deserializedVirtualNetworkGatewayIpConfigurationInner
                = new VirtualNetworkGatewayIpConfigurationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayIpConfigurationInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayIpConfigurationInner.innerProperties
                        = VirtualNetworkGatewayIpConfigurationPropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayIpConfigurationInner.name = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayIpConfigurationInner.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkGatewayIpConfigurationInner;
        });
    }
}
