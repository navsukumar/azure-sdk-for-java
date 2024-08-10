// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.models.DeploymentPropertiesExtended;
import java.io.IOException;
import java.util.Map;

/**
 * Deployment information.
 */
@Fluent
public final class DeploymentExtendedInner extends Resource {
    /*
     * Deployment properties.
     */
    private DeploymentPropertiesExtended properties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of DeploymentExtendedInner class.
     */
    public DeploymentExtendedInner() {
    }

    /**
     * Get the properties property: Deployment properties.
     * 
     * @return the properties value.
     */
    public DeploymentPropertiesExtended properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Deployment properties.
     * 
     * @param properties the properties value to set.
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentExtendedInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentExtendedInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentExtendedInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentExtendedInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeploymentExtendedInner.
     */
    public static DeploymentExtendedInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentExtendedInner deserializedDeploymentExtendedInner = new DeploymentExtendedInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDeploymentExtendedInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDeploymentExtendedInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDeploymentExtendedInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedDeploymentExtendedInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedDeploymentExtendedInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedDeploymentExtendedInner.properties = DeploymentPropertiesExtended.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentExtendedInner;
        });
    }
}
