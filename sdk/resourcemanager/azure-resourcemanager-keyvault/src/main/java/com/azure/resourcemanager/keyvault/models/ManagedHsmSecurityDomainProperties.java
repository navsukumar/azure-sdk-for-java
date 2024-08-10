// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The security domain properties of the managed hsm.
 */
@Immutable
public final class ManagedHsmSecurityDomainProperties implements JsonSerializable<ManagedHsmSecurityDomainProperties> {
    /*
     * Activation Status
     */
    private ActivationStatus activationStatus;

    /*
     * Activation Status Message.
     */
    private String activationStatusMessage;

    /**
     * Creates an instance of ManagedHsmSecurityDomainProperties class.
     */
    public ManagedHsmSecurityDomainProperties() {
    }

    /**
     * Get the activationStatus property: Activation Status.
     * 
     * @return the activationStatus value.
     */
    public ActivationStatus activationStatus() {
        return this.activationStatus;
    }

    /**
     * Get the activationStatusMessage property: Activation Status Message.
     * 
     * @return the activationStatusMessage value.
     */
    public String activationStatusMessage() {
        return this.activationStatusMessage;
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
     * Reads an instance of ManagedHsmSecurityDomainProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedHsmSecurityDomainProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedHsmSecurityDomainProperties.
     */
    public static ManagedHsmSecurityDomainProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedHsmSecurityDomainProperties deserializedManagedHsmSecurityDomainProperties
                = new ManagedHsmSecurityDomainProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("activationStatus".equals(fieldName)) {
                    deserializedManagedHsmSecurityDomainProperties.activationStatus
                        = ActivationStatus.fromString(reader.getString());
                } else if ("activationStatusMessage".equals(fieldName)) {
                    deserializedManagedHsmSecurityDomainProperties.activationStatusMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedHsmSecurityDomainProperties;
        });
    }
}
