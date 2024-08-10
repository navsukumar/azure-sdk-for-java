// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The result of a request to check the availability of a container registry name.
 */
@Fluent
public final class RegistryNameStatusInner implements JsonSerializable<RegistryNameStatusInner> {
    /*
     * The value that indicates whether the name is available.
     */
    private Boolean nameAvailable;

    /*
     * If any, the reason that the name is not available.
     */
    private String reason;

    /*
     * If any, the error message that provides more detail for the reason that the name is not available.
     */
    private String message;

    /**
     * Creates an instance of RegistryNameStatusInner class.
     */
    public RegistryNameStatusInner() {
    }

    /**
     * Get the nameAvailable property: The value that indicates whether the name is available.
     * 
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: The value that indicates whether the name is available.
     * 
     * @param nameAvailable the nameAvailable value to set.
     * @return the RegistryNameStatusInner object itself.
     */
    public RegistryNameStatusInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: If any, the reason that the name is not available.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: If any, the reason that the name is not available.
     * 
     * @param reason the reason value to set.
     * @return the RegistryNameStatusInner object itself.
     */
    public RegistryNameStatusInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: If any, the error message that provides more detail for the reason that the name is not
     * available.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: If any, the error message that provides more detail for the reason that the name is not
     * available.
     * 
     * @param message the message value to set.
     * @return the RegistryNameStatusInner object itself.
     */
    public RegistryNameStatusInner withMessage(String message) {
        this.message = message;
        return this;
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
        jsonWriter.writeBooleanField("nameAvailable", this.nameAvailable);
        jsonWriter.writeStringField("reason", this.reason);
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegistryNameStatusInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegistryNameStatusInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RegistryNameStatusInner.
     */
    public static RegistryNameStatusInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegistryNameStatusInner deserializedRegistryNameStatusInner = new RegistryNameStatusInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nameAvailable".equals(fieldName)) {
                    deserializedRegistryNameStatusInner.nameAvailable = reader.getNullable(JsonReader::getBoolean);
                } else if ("reason".equals(fieldName)) {
                    deserializedRegistryNameStatusInner.reason = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedRegistryNameStatusInner.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegistryNameStatusInner;
        });
    }
}
