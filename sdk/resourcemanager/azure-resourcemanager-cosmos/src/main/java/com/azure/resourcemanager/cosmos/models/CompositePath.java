// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The CompositePath model.
 */
@Fluent
public final class CompositePath implements JsonSerializable<CompositePath> {
    /*
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard
     * (/path/*)
     */
    private String path;

    /*
     * Sort order for composite paths.
     */
    private CompositePathSortOrder order;

    /**
     * Creates an instance of CompositePath class.
     */
    public CompositePath() {
    }

    /**
     * Get the path property: The path for which the indexing behavior applies to. Index paths typically start with root
     * and end with wildcard (/path/*).
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path for which the indexing behavior applies to. Index paths typically start with root
     * and end with wildcard (/path/*).
     * 
     * @param path the path value to set.
     * @return the CompositePath object itself.
     */
    public CompositePath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the order property: Sort order for composite paths.
     * 
     * @return the order value.
     */
    public CompositePathSortOrder order() {
        return this.order;
    }

    /**
     * Set the order property: Sort order for composite paths.
     * 
     * @param order the order value to set.
     * @return the CompositePath object itself.
     */
    public CompositePath withOrder(CompositePathSortOrder order) {
        this.order = order;
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
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeStringField("order", this.order == null ? null : this.order.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CompositePath from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CompositePath if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CompositePath.
     */
    public static CompositePath fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CompositePath deserializedCompositePath = new CompositePath();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("path".equals(fieldName)) {
                    deserializedCompositePath.path = reader.getString();
                } else if ("order".equals(fieldName)) {
                    deserializedCompositePath.order = CompositePathSortOrder.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCompositePath;
        });
    }
}
