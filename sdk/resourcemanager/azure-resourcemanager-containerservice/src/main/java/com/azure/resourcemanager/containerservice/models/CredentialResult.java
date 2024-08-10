// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The credential result response.
 */
@Immutable
public final class CredentialResult implements JsonSerializable<CredentialResult> {
    /*
     * The name of the credential.
     */
    private String name;

    /*
     * Base64-encoded Kubernetes configuration file.
     */
    private byte[] value;

    /**
     * Creates an instance of CredentialResult class.
     */
    public CredentialResult() {
    }

    /**
     * Get the name property: The name of the credential.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: Base64-encoded Kubernetes configuration file.
     * 
     * @return the value value.
     */
    public byte[] value() {
        return CoreUtils.clone(this.value);
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
     * Reads an instance of CredentialResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CredentialResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CredentialResult.
     */
    public static CredentialResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CredentialResult deserializedCredentialResult = new CredentialResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCredentialResult.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedCredentialResult.value = reader.getBinary();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCredentialResult;
        });
    }
}
