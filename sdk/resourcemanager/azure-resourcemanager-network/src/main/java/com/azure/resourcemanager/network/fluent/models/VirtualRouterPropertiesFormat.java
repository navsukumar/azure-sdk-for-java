// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Virtual Router definition.
 */
@Fluent
public final class VirtualRouterPropertiesFormat implements JsonSerializable<VirtualRouterPropertiesFormat> {
    /*
     * VirtualRouter ASN.
     */
    private Long virtualRouterAsn;

    /*
     * VirtualRouter IPs.
     */
    private List<String> virtualRouterIps;

    /*
     * The Subnet on which VirtualRouter is hosted.
     */
    private SubResource hostedSubnet;

    /*
     * The Gateway on which VirtualRouter is hosted.
     */
    private SubResource hostedGateway;

    /*
     * List of references to VirtualRouterPeerings.
     */
    private List<SubResource> peerings;

    /*
     * The provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of VirtualRouterPropertiesFormat class.
     */
    public VirtualRouterPropertiesFormat() {
    }

    /**
     * Get the virtualRouterAsn property: VirtualRouter ASN.
     * 
     * @return the virtualRouterAsn value.
     */
    public Long virtualRouterAsn() {
        return this.virtualRouterAsn;
    }

    /**
     * Set the virtualRouterAsn property: VirtualRouter ASN.
     * 
     * @param virtualRouterAsn the virtualRouterAsn value to set.
     * @return the VirtualRouterPropertiesFormat object itself.
     */
    public VirtualRouterPropertiesFormat withVirtualRouterAsn(Long virtualRouterAsn) {
        this.virtualRouterAsn = virtualRouterAsn;
        return this;
    }

    /**
     * Get the virtualRouterIps property: VirtualRouter IPs.
     * 
     * @return the virtualRouterIps value.
     */
    public List<String> virtualRouterIps() {
        return this.virtualRouterIps;
    }

    /**
     * Set the virtualRouterIps property: VirtualRouter IPs.
     * 
     * @param virtualRouterIps the virtualRouterIps value to set.
     * @return the VirtualRouterPropertiesFormat object itself.
     */
    public VirtualRouterPropertiesFormat withVirtualRouterIps(List<String> virtualRouterIps) {
        this.virtualRouterIps = virtualRouterIps;
        return this;
    }

    /**
     * Get the hostedSubnet property: The Subnet on which VirtualRouter is hosted.
     * 
     * @return the hostedSubnet value.
     */
    public SubResource hostedSubnet() {
        return this.hostedSubnet;
    }

    /**
     * Set the hostedSubnet property: The Subnet on which VirtualRouter is hosted.
     * 
     * @param hostedSubnet the hostedSubnet value to set.
     * @return the VirtualRouterPropertiesFormat object itself.
     */
    public VirtualRouterPropertiesFormat withHostedSubnet(SubResource hostedSubnet) {
        this.hostedSubnet = hostedSubnet;
        return this;
    }

    /**
     * Get the hostedGateway property: The Gateway on which VirtualRouter is hosted.
     * 
     * @return the hostedGateway value.
     */
    public SubResource hostedGateway() {
        return this.hostedGateway;
    }

    /**
     * Set the hostedGateway property: The Gateway on which VirtualRouter is hosted.
     * 
     * @param hostedGateway the hostedGateway value to set.
     * @return the VirtualRouterPropertiesFormat object itself.
     */
    public VirtualRouterPropertiesFormat withHostedGateway(SubResource hostedGateway) {
        this.hostedGateway = hostedGateway;
        return this;
    }

    /**
     * Get the peerings property: List of references to VirtualRouterPeerings.
     * 
     * @return the peerings value.
     */
    public List<SubResource> peerings() {
        return this.peerings;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("virtualRouterAsn", this.virtualRouterAsn);
        jsonWriter.writeArrayField("virtualRouterIps", this.virtualRouterIps,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("hostedSubnet", this.hostedSubnet);
        jsonWriter.writeJsonField("hostedGateway", this.hostedGateway);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualRouterPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualRouterPropertiesFormat if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualRouterPropertiesFormat.
     */
    public static VirtualRouterPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualRouterPropertiesFormat deserializedVirtualRouterPropertiesFormat
                = new VirtualRouterPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("virtualRouterAsn".equals(fieldName)) {
                    deserializedVirtualRouterPropertiesFormat.virtualRouterAsn
                        = reader.getNullable(JsonReader::getLong);
                } else if ("virtualRouterIps".equals(fieldName)) {
                    List<String> virtualRouterIps = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualRouterPropertiesFormat.virtualRouterIps = virtualRouterIps;
                } else if ("hostedSubnet".equals(fieldName)) {
                    deserializedVirtualRouterPropertiesFormat.hostedSubnet = SubResource.fromJson(reader);
                } else if ("hostedGateway".equals(fieldName)) {
                    deserializedVirtualRouterPropertiesFormat.hostedGateway = SubResource.fromJson(reader);
                } else if ("peerings".equals(fieldName)) {
                    List<SubResource> peerings = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedVirtualRouterPropertiesFormat.peerings = peerings;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVirtualRouterPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualRouterPropertiesFormat;
        });
    }
}
