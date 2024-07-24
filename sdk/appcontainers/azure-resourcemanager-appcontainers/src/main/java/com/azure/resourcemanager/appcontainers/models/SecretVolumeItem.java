// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Secret to be added to volume.
 */
@Fluent
public final class SecretVolumeItem implements JsonSerializable<SecretVolumeItem> {
    /*
     * Name of the Container App secret from which to pull the secret value.
     */
    private String secretRef;

    /*
     * Path to project secret to. If no path is provided, path defaults to name of secret listed in secretRef.
     */
    private String path;

    /**
     * Creates an instance of SecretVolumeItem class.
     */
    public SecretVolumeItem() {
    }

    /**
     * Get the secretRef property: Name of the Container App secret from which to pull the secret value.
     * 
     * @return the secretRef value.
     */
    public String secretRef() {
        return this.secretRef;
    }

    /**
     * Set the secretRef property: Name of the Container App secret from which to pull the secret value.
     * 
     * @param secretRef the secretRef value to set.
     * @return the SecretVolumeItem object itself.
     */
    public SecretVolumeItem withSecretRef(String secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    /**
     * Get the path property: Path to project secret to. If no path is provided, path defaults to name of secret listed
     * in secretRef.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Path to project secret to. If no path is provided, path defaults to name of secret listed
     * in secretRef.
     * 
     * @param path the path value to set.
     * @return the SecretVolumeItem object itself.
     */
    public SecretVolumeItem withPath(String path) {
        this.path = path;
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
        jsonWriter.writeStringField("secretRef", this.secretRef);
        jsonWriter.writeStringField("path", this.path);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecretVolumeItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretVolumeItem if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecretVolumeItem.
     */
    public static SecretVolumeItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecretVolumeItem deserializedSecretVolumeItem = new SecretVolumeItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("secretRef".equals(fieldName)) {
                    deserializedSecretVolumeItem.secretRef = reader.getString();
                } else if ("path".equals(fieldName)) {
                    deserializedSecretVolumeItem.path = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecretVolumeItem;
        });
    }
}
