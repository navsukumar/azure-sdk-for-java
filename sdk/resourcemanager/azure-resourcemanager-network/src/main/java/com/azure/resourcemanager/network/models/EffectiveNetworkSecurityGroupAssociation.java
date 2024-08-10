// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The effective network security group association.
 */
@Fluent
public final class EffectiveNetworkSecurityGroupAssociation
    implements JsonSerializable<EffectiveNetworkSecurityGroupAssociation> {
    /*
     * The ID of the Azure network manager if assigned.
     */
    private SubResource networkManager;

    /*
     * The ID of the subnet if assigned.
     */
    private SubResource subnet;

    /*
     * The ID of the network interface if assigned.
     */
    private SubResource networkInterface;

    /**
     * Creates an instance of EffectiveNetworkSecurityGroupAssociation class.
     */
    public EffectiveNetworkSecurityGroupAssociation() {
    }

    /**
     * Get the networkManager property: The ID of the Azure network manager if assigned.
     * 
     * @return the networkManager value.
     */
    public SubResource networkManager() {
        return this.networkManager;
    }

    /**
     * Set the networkManager property: The ID of the Azure network manager if assigned.
     * 
     * @param networkManager the networkManager value to set.
     * @return the EffectiveNetworkSecurityGroupAssociation object itself.
     */
    public EffectiveNetworkSecurityGroupAssociation withNetworkManager(SubResource networkManager) {
        this.networkManager = networkManager;
        return this;
    }

    /**
     * Get the subnet property: The ID of the subnet if assigned.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The ID of the subnet if assigned.
     * 
     * @param subnet the subnet value to set.
     * @return the EffectiveNetworkSecurityGroupAssociation object itself.
     */
    public EffectiveNetworkSecurityGroupAssociation withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the networkInterface property: The ID of the network interface if assigned.
     * 
     * @return the networkInterface value.
     */
    public SubResource networkInterface() {
        return this.networkInterface;
    }

    /**
     * Set the networkInterface property: The ID of the network interface if assigned.
     * 
     * @param networkInterface the networkInterface value to set.
     * @return the EffectiveNetworkSecurityGroupAssociation object itself.
     */
    public EffectiveNetworkSecurityGroupAssociation withNetworkInterface(SubResource networkInterface) {
        this.networkInterface = networkInterface;
        return this;
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
        jsonWriter.writeJsonField("networkManager", this.networkManager);
        jsonWriter.writeJsonField("subnet", this.subnet);
        jsonWriter.writeJsonField("networkInterface", this.networkInterface);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EffectiveNetworkSecurityGroupAssociation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EffectiveNetworkSecurityGroupAssociation if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EffectiveNetworkSecurityGroupAssociation.
     */
    public static EffectiveNetworkSecurityGroupAssociation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EffectiveNetworkSecurityGroupAssociation deserializedEffectiveNetworkSecurityGroupAssociation
                = new EffectiveNetworkSecurityGroupAssociation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkManager".equals(fieldName)) {
                    deserializedEffectiveNetworkSecurityGroupAssociation.networkManager = SubResource.fromJson(reader);
                } else if ("subnet".equals(fieldName)) {
                    deserializedEffectiveNetworkSecurityGroupAssociation.subnet = SubResource.fromJson(reader);
                } else if ("networkInterface".equals(fieldName)) {
                    deserializedEffectiveNetworkSecurityGroupAssociation.networkInterface
                        = SubResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEffectiveNetworkSecurityGroupAssociation;
        });
    }
}
