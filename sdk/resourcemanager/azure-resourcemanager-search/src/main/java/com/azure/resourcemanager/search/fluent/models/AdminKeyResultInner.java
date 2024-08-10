// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response containing the primary and secondary admin API keys for a given search service.
 */
@Immutable
public final class AdminKeyResultInner implements JsonSerializable<AdminKeyResultInner> {
    /*
     * The primary admin API key of the search service.
     */
    private String primaryKey;

    /*
     * The secondary admin API key of the search service.
     */
    private String secondaryKey;

    /**
     * Creates an instance of AdminKeyResultInner class.
     */
    public AdminKeyResultInner() {
    }

    /**
     * Get the primaryKey property: The primary admin API key of the search service.
     * 
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Get the secondaryKey property: The secondary admin API key of the search service.
     * 
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdminKeyResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdminKeyResultInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AdminKeyResultInner.
     */
    public static AdminKeyResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdminKeyResultInner deserializedAdminKeyResultInner = new AdminKeyResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("primaryKey".equals(fieldName)) {
                    deserializedAdminKeyResultInner.primaryKey = reader.getString();
                } else if ("secondaryKey".equals(fieldName)) {
                    deserializedAdminKeyResultInner.secondaryKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdminKeyResultInner;
        });
    }
}
