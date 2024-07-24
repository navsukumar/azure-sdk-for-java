// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * CheckNameAvailabilityResult
 * 
 * CheckNameAvailability Result.
 */
@Fluent
public final class CheckNameAvailabilityResultInner implements JsonSerializable<CheckNameAvailabilityResultInner> {
    /*
     * Gets or sets the message.
     */
    private String message;

    /*
     * Gets or sets a value indicating whether [name available].
     */
    private Boolean nameAvailable;

    /*
     * Gets or sets the reason.
     */
    private String reason;

    /**
     * Creates an instance of CheckNameAvailabilityResultInner class.
     */
    public CheckNameAvailabilityResultInner() {
    }

    /**
     * Get the message property: Gets or sets the message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Gets or sets the message.
     * 
     * @param message the message value to set.
     * @return the CheckNameAvailabilityResultInner object itself.
     */
    public CheckNameAvailabilityResultInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the nameAvailable property: Gets or sets a value indicating whether [name available].
     * 
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Gets or sets a value indicating whether [name available].
     * 
     * @param nameAvailable the nameAvailable value to set.
     * @return the CheckNameAvailabilityResultInner object itself.
     */
    public CheckNameAvailabilityResultInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: Gets or sets the reason.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Gets or sets the reason.
     * 
     * @param reason the reason value to set.
     * @return the CheckNameAvailabilityResultInner object itself.
     */
    public CheckNameAvailabilityResultInner withReason(String reason) {
        this.reason = reason;
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
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeBooleanField("nameAvailable", this.nameAvailable);
        jsonWriter.writeStringField("reason", this.reason);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckNameAvailabilityResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckNameAvailabilityResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CheckNameAvailabilityResultInner.
     */
    public static CheckNameAvailabilityResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckNameAvailabilityResultInner deserializedCheckNameAvailabilityResultInner
                = new CheckNameAvailabilityResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("message".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResultInner.message = reader.getString();
                } else if ("nameAvailable".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResultInner.nameAvailable
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("reason".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResultInner.reason = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckNameAvailabilityResultInner;
        });
    }
}
