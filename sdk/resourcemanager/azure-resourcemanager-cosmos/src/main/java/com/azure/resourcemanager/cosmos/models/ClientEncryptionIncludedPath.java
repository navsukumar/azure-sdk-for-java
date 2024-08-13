// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * .
 */
@Fluent
public final class ClientEncryptionIncludedPath implements JsonSerializable<ClientEncryptionIncludedPath> {
    /*
     * Path that needs to be encrypted.
     */
    private String path;

    /*
     * The identifier of the Client Encryption Key to be used to encrypt the path.
     */
    private String clientEncryptionKeyId;

    /*
     * The type of encryption to be performed. Eg - Deterministic, Randomized.
     */
    private String encryptionType;

    /*
     * The encryption algorithm which will be used. Eg - AEAD_AES_256_CBC_HMAC_SHA256.
     */
    private String encryptionAlgorithm;

    /**
     * Creates an instance of ClientEncryptionIncludedPath class.
     */
    public ClientEncryptionIncludedPath() {
    }

    /**
     * Get the path property: Path that needs to be encrypted.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Path that needs to be encrypted.
     * 
     * @param path the path value to set.
     * @return the ClientEncryptionIncludedPath object itself.
     */
    public ClientEncryptionIncludedPath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the clientEncryptionKeyId property: The identifier of the Client Encryption Key to be used to encrypt the
     * path.
     * 
     * @return the clientEncryptionKeyId value.
     */
    public String clientEncryptionKeyId() {
        return this.clientEncryptionKeyId;
    }

    /**
     * Set the clientEncryptionKeyId property: The identifier of the Client Encryption Key to be used to encrypt the
     * path.
     * 
     * @param clientEncryptionKeyId the clientEncryptionKeyId value to set.
     * @return the ClientEncryptionIncludedPath object itself.
     */
    public ClientEncryptionIncludedPath withClientEncryptionKeyId(String clientEncryptionKeyId) {
        this.clientEncryptionKeyId = clientEncryptionKeyId;
        return this;
    }

    /**
     * Get the encryptionType property: The type of encryption to be performed. Eg - Deterministic, Randomized.
     * 
     * @return the encryptionType value.
     */
    public String encryptionType() {
        return this.encryptionType;
    }

    /**
     * Set the encryptionType property: The type of encryption to be performed. Eg - Deterministic, Randomized.
     * 
     * @param encryptionType the encryptionType value to set.
     * @return the ClientEncryptionIncludedPath object itself.
     */
    public ClientEncryptionIncludedPath withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * Get the encryptionAlgorithm property: The encryption algorithm which will be used. Eg -
     * AEAD_AES_256_CBC_HMAC_SHA256.
     * 
     * @return the encryptionAlgorithm value.
     */
    public String encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * Set the encryptionAlgorithm property: The encryption algorithm which will be used. Eg -
     * AEAD_AES_256_CBC_HMAC_SHA256.
     * 
     * @param encryptionAlgorithm the encryptionAlgorithm value to set.
     * @return the ClientEncryptionIncludedPath object itself.
     */
    public ClientEncryptionIncludedPath withEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (path() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property path in model ClientEncryptionIncludedPath"));
        }
        if (clientEncryptionKeyId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property clientEncryptionKeyId in model ClientEncryptionIncludedPath"));
        }
        if (encryptionType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property encryptionType in model ClientEncryptionIncludedPath"));
        }
        if (encryptionAlgorithm() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property encryptionAlgorithm in model ClientEncryptionIncludedPath"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClientEncryptionIncludedPath.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeStringField("clientEncryptionKeyId", this.clientEncryptionKeyId);
        jsonWriter.writeStringField("encryptionType", this.encryptionType);
        jsonWriter.writeStringField("encryptionAlgorithm", this.encryptionAlgorithm);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClientEncryptionIncludedPath from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClientEncryptionIncludedPath if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClientEncryptionIncludedPath.
     */
    public static ClientEncryptionIncludedPath fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClientEncryptionIncludedPath deserializedClientEncryptionIncludedPath = new ClientEncryptionIncludedPath();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("path".equals(fieldName)) {
                    deserializedClientEncryptionIncludedPath.path = reader.getString();
                } else if ("clientEncryptionKeyId".equals(fieldName)) {
                    deserializedClientEncryptionIncludedPath.clientEncryptionKeyId = reader.getString();
                } else if ("encryptionType".equals(fieldName)) {
                    deserializedClientEncryptionIncludedPath.encryptionType = reader.getString();
                } else if ("encryptionAlgorithm".equals(fieldName)) {
                    deserializedClientEncryptionIncludedPath.encryptionAlgorithm = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClientEncryptionIncludedPath;
        });
    }
}
