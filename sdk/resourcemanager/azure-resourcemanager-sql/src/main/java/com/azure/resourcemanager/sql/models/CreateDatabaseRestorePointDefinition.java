// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Contains the information necessary to perform a create database restore point operation.
 */
@Fluent
public final class CreateDatabaseRestorePointDefinition
    implements JsonSerializable<CreateDatabaseRestorePointDefinition> {
    /*
     * The restore point label to apply
     */
    private String restorePointLabel;

    /**
     * Creates an instance of CreateDatabaseRestorePointDefinition class.
     */
    public CreateDatabaseRestorePointDefinition() {
    }

    /**
     * Get the restorePointLabel property: The restore point label to apply.
     * 
     * @return the restorePointLabel value.
     */
    public String restorePointLabel() {
        return this.restorePointLabel;
    }

    /**
     * Set the restorePointLabel property: The restore point label to apply.
     * 
     * @param restorePointLabel the restorePointLabel value to set.
     * @return the CreateDatabaseRestorePointDefinition object itself.
     */
    public CreateDatabaseRestorePointDefinition withRestorePointLabel(String restorePointLabel) {
        this.restorePointLabel = restorePointLabel;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restorePointLabel() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property restorePointLabel in model CreateDatabaseRestorePointDefinition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CreateDatabaseRestorePointDefinition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("restorePointLabel", this.restorePointLabel);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateDatabaseRestorePointDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateDatabaseRestorePointDefinition if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateDatabaseRestorePointDefinition.
     */
    public static CreateDatabaseRestorePointDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateDatabaseRestorePointDefinition deserializedCreateDatabaseRestorePointDefinition
                = new CreateDatabaseRestorePointDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("restorePointLabel".equals(fieldName)) {
                    deserializedCreateDatabaseRestorePointDefinition.restorePointLabel = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCreateDatabaseRestorePointDefinition;
        });
    }
}
