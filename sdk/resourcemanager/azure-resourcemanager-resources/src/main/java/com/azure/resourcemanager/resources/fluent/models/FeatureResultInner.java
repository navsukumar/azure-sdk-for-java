// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.models.FeatureProperties;
import java.io.IOException;

/**
 * Previewed feature information.
 */
@Fluent
public final class FeatureResultInner implements JsonSerializable<FeatureResultInner> {
    /*
     * The name of the feature.
     */
    private String name;

    /*
     * Properties of the previewed feature.
     */
    private FeatureProperties properties;

    /*
     * The resource ID of the feature.
     */
    private String id;

    /*
     * The resource type of the feature.
     */
    private String type;

    /**
     * Creates an instance of FeatureResultInner class.
     */
    public FeatureResultInner() {
    }

    /**
     * Get the name property: The name of the feature.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the feature.
     * 
     * @param name the name value to set.
     * @return the FeatureResultInner object itself.
     */
    public FeatureResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Properties of the previewed feature.
     * 
     * @return the properties value.
     */
    public FeatureProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the previewed feature.
     * 
     * @param properties the properties value to set.
     * @return the FeatureResultInner object itself.
     */
    public FeatureResultInner withProperties(FeatureProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the id property: The resource ID of the feature.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource ID of the feature.
     * 
     * @param id the id value to set.
     * @return the FeatureResultInner object itself.
     */
    public FeatureResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The resource type of the feature.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type of the feature.
     * 
     * @param type the type value to set.
     * @return the FeatureResultInner object itself.
     */
    public FeatureResultInner withType(String type) {
        this.type = type;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FeatureResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FeatureResultInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FeatureResultInner.
     */
    public static FeatureResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FeatureResultInner deserializedFeatureResultInner = new FeatureResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedFeatureResultInner.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedFeatureResultInner.properties = FeatureProperties.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    deserializedFeatureResultInner.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFeatureResultInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFeatureResultInner;
        });
    }
}
