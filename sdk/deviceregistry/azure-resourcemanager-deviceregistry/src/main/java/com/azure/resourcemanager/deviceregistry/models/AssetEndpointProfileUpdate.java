// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The type used for update operations of the AssetEndpointProfile.
 */
@Fluent
public final class AssetEndpointProfileUpdate implements JsonSerializable<AssetEndpointProfileUpdate> {
    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /*
     * The resource-specific properties for this resource.
     */
    private AssetEndpointProfileUpdateProperties properties;

    /**
     * Creates an instance of AssetEndpointProfileUpdate class.
     */
    public AssetEndpointProfileUpdate() {
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the AssetEndpointProfileUpdate object itself.
     */
    public AssetEndpointProfileUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public AssetEndpointProfileUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the AssetEndpointProfileUpdate object itself.
     */
    public AssetEndpointProfileUpdate withProperties(AssetEndpointProfileUpdateProperties properties) {
        this.properties = properties;
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
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssetEndpointProfileUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssetEndpointProfileUpdate if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AssetEndpointProfileUpdate.
     */
    public static AssetEndpointProfileUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssetEndpointProfileUpdate deserializedAssetEndpointProfileUpdate = new AssetEndpointProfileUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAssetEndpointProfileUpdate.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedAssetEndpointProfileUpdate.properties
                        = AssetEndpointProfileUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssetEndpointProfileUpdate;
        });
    }
}
