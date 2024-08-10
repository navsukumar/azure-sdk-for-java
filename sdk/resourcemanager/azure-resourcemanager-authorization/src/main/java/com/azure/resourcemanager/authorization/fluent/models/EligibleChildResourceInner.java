// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Eligible child resource.
 */
@Immutable
public final class EligibleChildResourceInner implements JsonSerializable<EligibleChildResourceInner> {
    /*
     * The resource scope Id.
     */
    private String id;

    /*
     * The resource name.
     */
    private String name;

    /*
     * The resource type.
     */
    private String type;

    /**
     * Creates an instance of EligibleChildResourceInner class.
     */
    public EligibleChildResourceInner() {
    }

    /**
     * Get the id property: The resource scope Id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
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
     * Reads an instance of EligibleChildResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EligibleChildResourceInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EligibleChildResourceInner.
     */
    public static EligibleChildResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EligibleChildResourceInner deserializedEligibleChildResourceInner = new EligibleChildResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedEligibleChildResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedEligibleChildResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedEligibleChildResourceInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEligibleChildResourceInner;
        });
    }
}
