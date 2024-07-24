// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes a virtual machine scale set network profile.
 */
@Fluent
public final class VirtualMachineScaleSetNetworkProfile
    implements JsonSerializable<VirtualMachineScaleSetNetworkProfile> {
    /*
     * A reference to a load balancer probe used to determine the health of an
     * instance in the virtual machine scale set. The reference will be in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{
     * loadBalancerName}/probes/{probeName}'.
     */
    private ApiEntityReference healthProbe;

    /*
     * The list of network configurations.
     */
    private List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations;

    /*
     * specifies the Microsoft.Network API version used when creating networking
     * resources in the Network Interface Configurations for Virtual Machine Scale Set
     * with orchestration mode 'Flexible'
     */
    private NetworkApiVersion networkApiVersion;

    /**
     * Creates an instance of VirtualMachineScaleSetNetworkProfile class.
     */
    public VirtualMachineScaleSetNetworkProfile() {
    }

    /**
     * Get the healthProbe property: A reference to a load balancer probe used to determine the health of an
     * instance in the virtual machine scale set. The reference will be in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     * 
     * @return the healthProbe value.
     */
    public ApiEntityReference healthProbe() {
        return this.healthProbe;
    }

    /**
     * Set the healthProbe property: A reference to a load balancer probe used to determine the health of an
     * instance in the virtual machine scale set. The reference will be in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     * 
     * @param healthProbe the healthProbe value to set.
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile withHealthProbe(ApiEntityReference healthProbe) {
        this.healthProbe = healthProbe;
        return this;
    }

    /**
     * Get the networkInterfaceConfigurations property: The list of network configurations.
     * 
     * @return the networkInterfaceConfigurations value.
     */
    public List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations;
    }

    /**
     * Set the networkInterfaceConfigurations property: The list of network configurations.
     * 
     * @param networkInterfaceConfigurations the networkInterfaceConfigurations value to set.
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile withNetworkInterfaceConfigurations(
        List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations) {
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
        return this;
    }

    /**
     * Get the networkApiVersion property: specifies the Microsoft.Network API version used when creating networking
     * resources in the Network Interface Configurations for Virtual Machine Scale Set
     * with orchestration mode 'Flexible'.
     * 
     * @return the networkApiVersion value.
     */
    public NetworkApiVersion networkApiVersion() {
        return this.networkApiVersion;
    }

    /**
     * Set the networkApiVersion property: specifies the Microsoft.Network API version used when creating networking
     * resources in the Network Interface Configurations for Virtual Machine Scale Set
     * with orchestration mode 'Flexible'.
     * 
     * @param networkApiVersion the networkApiVersion value to set.
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile withNetworkApiVersion(NetworkApiVersion networkApiVersion) {
        this.networkApiVersion = networkApiVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (healthProbe() != null) {
            healthProbe().validate();
        }
        if (networkInterfaceConfigurations() != null) {
            networkInterfaceConfigurations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("healthProbe", this.healthProbe);
        jsonWriter.writeArrayField("networkInterfaceConfigurations", this.networkInterfaceConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("networkApiVersion",
            this.networkApiVersion == null ? null : this.networkApiVersion.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetNetworkProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetNetworkProfile if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetNetworkProfile.
     */
    public static VirtualMachineScaleSetNetworkProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetNetworkProfile deserializedVirtualMachineScaleSetNetworkProfile
                = new VirtualMachineScaleSetNetworkProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("healthProbe".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetNetworkProfile.healthProbe = ApiEntityReference.fromJson(reader);
                } else if ("networkInterfaceConfigurations".equals(fieldName)) {
                    List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations
                        = reader.readArray(reader1 -> VirtualMachineScaleSetNetworkConfiguration.fromJson(reader1));
                    deserializedVirtualMachineScaleSetNetworkProfile.networkInterfaceConfigurations
                        = networkInterfaceConfigurations;
                } else if ("networkApiVersion".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetNetworkProfile.networkApiVersion
                        = NetworkApiVersion.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetNetworkProfile;
        });
    }
}
