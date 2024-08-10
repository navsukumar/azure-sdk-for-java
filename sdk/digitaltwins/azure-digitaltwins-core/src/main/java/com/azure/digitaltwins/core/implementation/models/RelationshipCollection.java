// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A collection of relationships which relate digital twins together.
 */
@Fluent
public final class RelationshipCollection implements JsonSerializable<RelationshipCollection> {
    /*
     * The relationship objects.
     */
    private final List<Object> value;

    /*
     * A URI to retrieve the next page of objects.
     */
    private String nextLink;

    /**
     * Creates an instance of RelationshipCollection class.
     * 
     * @param value the value value to set.
     */
    public RelationshipCollection(List<Object> value) {
        this.value = value;
    }

    /**
     * Get the value property: The relationship objects.
     * 
     * @return the value value.
     */
    public List<Object> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: A URI to retrieve the next page of objects.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A URI to retrieve the next page of objects.
     * 
     * @param nextLink the nextLink value to set.
     * @return the RelationshipCollection object itself.
     */
    public RelationshipCollection setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RelationshipCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RelationshipCollection if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RelationshipCollection.
     */
    public static RelationshipCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean valueFound = false;
            List<Object> value = null;
            String nextLink = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    value = reader.readArray(reader1 -> reader1.readUntyped());
                    valueFound = true;
                } else if ("nextLink".equals(fieldName)) {
                    nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (valueFound) {
                RelationshipCollection deserializedRelationshipCollection = new RelationshipCollection(value);
                deserializedRelationshipCollection.nextLink = nextLink;

                return deserializedRelationshipCollection;
            }
            throw new IllegalStateException("Missing required property: value");
        });
    }
}
