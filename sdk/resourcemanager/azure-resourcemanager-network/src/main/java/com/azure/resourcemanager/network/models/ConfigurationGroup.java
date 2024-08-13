// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.NetworkGroupProperties;
import java.io.IOException;

/**
 * The network configuration group resource.
 */
@Fluent
public final class ConfigurationGroup implements JsonSerializable<ConfigurationGroup> {
    /*
     * Network group ID.
     */
    private String id;

    /*
     * The network configuration group properties
     */
    private NetworkGroupProperties innerProperties;

    /**
     * Creates an instance of ConfigurationGroup class.
     */
    public ConfigurationGroup() {
    }

    /**
     * Get the id property: Network group ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Network group ID.
     * 
     * @param id the id value to set.
     * @return the ConfigurationGroup object itself.
     */
    public ConfigurationGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the innerProperties property: The network configuration group properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: A description of the network group.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the network group.
     * 
     * @param description the description value to set.
     * @return the ConfigurationGroup object itself.
     */
    public ConfigurationGroup withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkGroupProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the scope assignment resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationGroup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationGroup if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigurationGroup.
     */
    public static ConfigurationGroup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationGroup deserializedConfigurationGroup = new ConfigurationGroup();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedConfigurationGroup.id = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedConfigurationGroup.innerProperties = NetworkGroupProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationGroup;
        });
    }
}
