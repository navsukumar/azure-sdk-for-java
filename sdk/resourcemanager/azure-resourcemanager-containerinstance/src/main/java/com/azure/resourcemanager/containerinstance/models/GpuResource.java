// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The GPU resource.
 */
@Fluent
public final class GpuResource implements JsonSerializable<GpuResource> {
    /*
     * The count of the GPU resource.
     */
    private int count;

    /*
     * The SKU of the GPU resource.
     */
    private GpuSku sku;

    /**
     * Creates an instance of GpuResource class.
     */
    public GpuResource() {
    }

    /**
     * Get the count property: The count of the GPU resource.
     * 
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: The count of the GPU resource.
     * 
     * @param count the count value to set.
     * @return the GpuResource object itself.
     */
    public GpuResource withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the sku property: The SKU of the GPU resource.
     * 
     * @return the sku value.
     */
    public GpuSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the GPU resource.
     * 
     * @param sku the sku value to set.
     * @return the GpuResource object itself.
     */
    public GpuResource withSku(GpuSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model GpuResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GpuResource.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("count", this.count);
        jsonWriter.writeStringField("sku", this.sku == null ? null : this.sku.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GpuResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GpuResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GpuResource.
     */
    public static GpuResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GpuResource deserializedGpuResource = new GpuResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedGpuResource.count = reader.getInt();
                } else if ("sku".equals(fieldName)) {
                    deserializedGpuResource.sku = GpuSku.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGpuResource;
        });
    }
}
