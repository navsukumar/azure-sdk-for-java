// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The SKU of the storage account.
 */
@Fluent
public final class Sku implements JsonSerializable<Sku> {
    /*
     * The SKU name. Required for account creation; optional for update. Note that in older versions, SKU name was
     * called accountType.
     */
    private SkuName name;

    /*
     * The SKU tier. This is based on the SKU name.
     */
    private SkuTier tier;

    /**
     * Creates an instance of Sku class.
     */
    public Sku() {
    }

    /**
     * Get the name property: The SKU name. Required for account creation; optional for update. Note that in older
     * versions, SKU name was called accountType.
     * 
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The SKU name. Required for account creation; optional for update. Note that in older
     * versions, SKU name was called accountType.
     * 
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The SKU tier. This is based on the SKU name.
     * 
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Sku.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Sku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Sku if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Sku.
     */
    public static Sku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Sku deserializedSku = new Sku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSku.name = SkuName.fromString(reader.getString());
                } else if ("tier".equals(fieldName)) {
                    deserializedSku.tier = SkuTier.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSku;
        });
    }
}
