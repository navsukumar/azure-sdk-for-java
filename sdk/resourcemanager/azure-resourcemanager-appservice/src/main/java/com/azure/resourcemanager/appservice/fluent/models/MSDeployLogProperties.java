// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.MSDeployLogEntry;
import java.io.IOException;
import java.util.List;

/**
 * MSDeployLog resource specific properties.
 */
@Immutable
public final class MSDeployLogProperties implements JsonSerializable<MSDeployLogProperties> {
    /*
     * List of log entry messages
     */
    private List<MSDeployLogEntry> entries;

    /**
     * Creates an instance of MSDeployLogProperties class.
     */
    public MSDeployLogProperties() {
    }

    /**
     * Get the entries property: List of log entry messages.
     * 
     * @return the entries value.
     */
    public List<MSDeployLogEntry> entries() {
        return this.entries;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (entries() != null) {
            entries().forEach(e -> e.validate());
        }
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
     * Reads an instance of MSDeployLogProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MSDeployLogProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MSDeployLogProperties.
     */
    public static MSDeployLogProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MSDeployLogProperties deserializedMSDeployLogProperties = new MSDeployLogProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("entries".equals(fieldName)) {
                    List<MSDeployLogEntry> entries = reader.readArray(reader1 -> MSDeployLogEntry.fromJson(reader1));
                    deserializedMSDeployLogProperties.entries = entries;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMSDeployLogProperties;
        });
    }
}
