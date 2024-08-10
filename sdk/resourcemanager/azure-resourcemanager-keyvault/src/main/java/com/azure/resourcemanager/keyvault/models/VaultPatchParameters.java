// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Parameters for creating or updating a vault.
 */
@Fluent
public final class VaultPatchParameters implements JsonSerializable<VaultPatchParameters> {
    /*
     * The tags that will be assigned to the key vault.
     */
    private Map<String, String> tags;

    /*
     * Properties of the vault
     */
    private VaultPatchProperties properties;

    /**
     * Creates an instance of VaultPatchParameters class.
     */
    public VaultPatchParameters() {
    }

    /**
     * Get the tags property: The tags that will be assigned to the key vault.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags that will be assigned to the key vault.
     * 
     * @param tags the tags value to set.
     * @return the VaultPatchParameters object itself.
     */
    public VaultPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: Properties of the vault.
     * 
     * @return the properties value.
     */
    public VaultPatchProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the vault.
     * 
     * @param properties the properties value to set.
     * @return the VaultPatchParameters object itself.
     */
    public VaultPatchParameters withProperties(VaultPatchProperties properties) {
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
     * Reads an instance of VaultPatchParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VaultPatchParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VaultPatchParameters.
     */
    public static VaultPatchParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VaultPatchParameters deserializedVaultPatchParameters = new VaultPatchParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVaultPatchParameters.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedVaultPatchParameters.properties = VaultPatchProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVaultPatchParameters;
        });
    }
}
