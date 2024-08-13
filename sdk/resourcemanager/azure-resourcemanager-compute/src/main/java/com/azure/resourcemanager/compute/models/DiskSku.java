// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS, StandardSSD_ZRS, or
 * PremiumV2_LRS.
 */
@Fluent
public final class DiskSku implements JsonSerializable<DiskSku> {
    /*
     * The sku name.
     */
    private DiskStorageAccountTypes name;

    /*
     * The sku tier.
     */
    private String tier;

    /**
     * Creates an instance of DiskSku class.
     */
    public DiskSku() {
    }

    /**
     * Get the name property: The sku name.
     * 
     * @return the name value.
     */
    public DiskStorageAccountTypes name() {
        return this.name;
    }

    /**
     * Set the name property: The sku name.
     * 
     * @param name the name value to set.
     * @return the DiskSku object itself.
     */
    public DiskSku withName(DiskStorageAccountTypes name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The sku tier.
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
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiskSku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiskSku if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the DiskSku.
     */
    public static DiskSku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiskSku deserializedDiskSku = new DiskSku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDiskSku.name = DiskStorageAccountTypes.fromString(reader.getString());
                } else if ("tier".equals(fieldName)) {
                    deserializedDiskSku.tier = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiskSku;
        });
    }
}
