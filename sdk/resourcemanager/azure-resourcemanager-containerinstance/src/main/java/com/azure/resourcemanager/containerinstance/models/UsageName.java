// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The name object of the resource.
 */
@Immutable
public final class UsageName implements JsonSerializable<UsageName> {
    /*
     * The name of the resource
     */
    private String value;

    /*
     * The localized name of the resource
     */
    private String localizedValue;

    /**
     * Creates an instance of UsageName class.
     */
    public UsageName() {
    }

    /**
     * Get the value property: The name of the resource.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the localizedValue property: The localized name of the resource.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
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
     * Reads an instance of UsageName from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsageName if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the UsageName.
     */
    public static UsageName fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UsageName deserializedUsageName = new UsageName();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedUsageName.value = reader.getString();
                } else if ("localizedValue".equals(fieldName)) {
                    deserializedUsageName.localizedValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsageName;
        });
    }
}
