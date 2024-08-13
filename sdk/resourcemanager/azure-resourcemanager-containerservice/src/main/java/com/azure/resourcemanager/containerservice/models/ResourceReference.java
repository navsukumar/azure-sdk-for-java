// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A reference to an Azure resource.
 */
@Fluent
public final class ResourceReference implements JsonSerializable<ResourceReference> {
    /*
     * The fully qualified Azure resource id.
     */
    private String id;

    /**
     * Creates an instance of ResourceReference class.
     */
    public ResourceReference() {
    }

    /**
     * Get the id property: The fully qualified Azure resource id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The fully qualified Azure resource id.
     * 
     * @param id the id value to set.
     * @return the ResourceReference object itself.
     */
    public ResourceReference withId(String id) {
        this.id = id;
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
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceReference if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceReference.
     */
    public static ResourceReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceReference deserializedResourceReference = new ResourceReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedResourceReference.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceReference;
        });
    }
}
