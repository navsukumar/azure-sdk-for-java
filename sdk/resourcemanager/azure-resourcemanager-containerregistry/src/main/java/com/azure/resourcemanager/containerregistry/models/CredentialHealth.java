// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The health of the auth credential.
 */
@Fluent
public final class CredentialHealth implements JsonSerializable<CredentialHealth> {
    /*
     * The health status of credential.
     */
    private CredentialHealthStatus status;

    /*
     * Error code representing the health check error.
     */
    private String errorCode;

    /*
     * Descriptive message representing the health check error.
     */
    private String errorMessage;

    /**
     * Creates an instance of CredentialHealth class.
     */
    public CredentialHealth() {
    }

    /**
     * Get the status property: The health status of credential.
     * 
     * @return the status value.
     */
    public CredentialHealthStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The health status of credential.
     * 
     * @param status the status value to set.
     * @return the CredentialHealth object itself.
     */
    public CredentialHealth withStatus(CredentialHealthStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errorCode property: Error code representing the health check error.
     * 
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Error code representing the health check error.
     * 
     * @param errorCode the errorCode value to set.
     * @return the CredentialHealth object itself.
     */
    public CredentialHealth withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: Descriptive message representing the health check error.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Descriptive message representing the health check error.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the CredentialHealth object itself.
     */
    public CredentialHealth withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("errorCode", this.errorCode);
        jsonWriter.writeStringField("errorMessage", this.errorMessage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CredentialHealth from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CredentialHealth if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CredentialHealth.
     */
    public static CredentialHealth fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CredentialHealth deserializedCredentialHealth = new CredentialHealth();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedCredentialHealth.status = CredentialHealthStatus.fromString(reader.getString());
                } else if ("errorCode".equals(fieldName)) {
                    deserializedCredentialHealth.errorCode = reader.getString();
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedCredentialHealth.errorMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCredentialHealth;
        });
    }
}
