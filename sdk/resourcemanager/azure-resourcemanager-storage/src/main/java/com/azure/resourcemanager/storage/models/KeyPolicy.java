// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * KeyPolicy assigned to the storage account.
 */
@Fluent
public final class KeyPolicy implements JsonSerializable<KeyPolicy> {
    /*
     * The key expiration period in days.
     */
    private int keyExpirationPeriodInDays;

    /**
     * Creates an instance of KeyPolicy class.
     */
    public KeyPolicy() {
    }

    /**
     * Get the keyExpirationPeriodInDays property: The key expiration period in days.
     * 
     * @return the keyExpirationPeriodInDays value.
     */
    public int keyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    /**
     * Set the keyExpirationPeriodInDays property: The key expiration period in days.
     * 
     * @param keyExpirationPeriodInDays the keyExpirationPeriodInDays value to set.
     * @return the KeyPolicy object itself.
     */
    public KeyPolicy withKeyExpirationPeriodInDays(int keyExpirationPeriodInDays) {
        this.keyExpirationPeriodInDays = keyExpirationPeriodInDays;
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
        jsonWriter.writeIntField("keyExpirationPeriodInDays", this.keyExpirationPeriodInDays);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyPolicy if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KeyPolicy.
     */
    public static KeyPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyPolicy deserializedKeyPolicy = new KeyPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyExpirationPeriodInDays".equals(fieldName)) {
                    deserializedKeyPolicy.keyExpirationPeriodInDays = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyPolicy;
        });
    }
}
