// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameter supplied to check Namespace name availability operation.
 */
@Fluent
public final class CheckNameAvailabilityParameter implements JsonSerializable<CheckNameAvailabilityParameter> {
    /*
     * Name to check the namespace name availability
     */
    private String name;

    /**
     * Creates an instance of CheckNameAvailabilityParameter class.
     */
    public CheckNameAvailabilityParameter() {
    }

    /**
     * Get the name property: Name to check the namespace name availability.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name to check the namespace name availability.
     * 
     * @param name the name value to set.
     * @return the CheckNameAvailabilityParameter object itself.
     */
    public CheckNameAvailabilityParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model CheckNameAvailabilityParameter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckNameAvailabilityParameter.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckNameAvailabilityParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckNameAvailabilityParameter if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CheckNameAvailabilityParameter.
     */
    public static CheckNameAvailabilityParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckNameAvailabilityParameter deserializedCheckNameAvailabilityParameter
                = new CheckNameAvailabilityParameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCheckNameAvailabilityParameter.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckNameAvailabilityParameter;
        });
    }
}
