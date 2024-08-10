// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure Web Category Properties.
 */
@Immutable
public final class AzureWebCategoryPropertiesFormat implements JsonSerializable<AzureWebCategoryPropertiesFormat> {
    /*
     * The name of the group that the category belongs to.
     */
    private String group;

    /**
     * Creates an instance of AzureWebCategoryPropertiesFormat class.
     */
    public AzureWebCategoryPropertiesFormat() {
    }

    /**
     * Get the group property: The name of the group that the category belongs to.
     * 
     * @return the group value.
     */
    public String group() {
        return this.group;
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
     * Reads an instance of AzureWebCategoryPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureWebCategoryPropertiesFormat if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureWebCategoryPropertiesFormat.
     */
    public static AzureWebCategoryPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureWebCategoryPropertiesFormat deserializedAzureWebCategoryPropertiesFormat
                = new AzureWebCategoryPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("group".equals(fieldName)) {
                    deserializedAzureWebCategoryPropertiesFormat.group = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureWebCategoryPropertiesFormat;
        });
    }
}
