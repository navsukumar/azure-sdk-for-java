// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The role instance SKU.
 */
@Immutable
public final class InstanceSku implements JsonSerializable<InstanceSku> {
    /*
     * The sku name.
     */
    private String name;

    /*
     * The tier of the cloud service role instance.
     */
    private String tier;

    /**
     * Creates an instance of InstanceSku class.
     */
    public InstanceSku() {
    }

    /**
     * Get the name property: The sku name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the tier property: The tier of the cloud service role instance.
     * 
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
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
     * Reads an instance of InstanceSku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InstanceSku if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the InstanceSku.
     */
    public static InstanceSku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InstanceSku deserializedInstanceSku = new InstanceSku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedInstanceSku.name = reader.getString();
                } else if ("tier".equals(fieldName)) {
                    deserializedInstanceSku.tier = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInstanceSku;
        });
    }
}
