// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.NodeTypeInner;
import java.io.IOException;
import java.util.List;

/**
 * Node type list results.
 */
@Fluent
public final class NodeTypeListResult implements JsonSerializable<NodeTypeListResult> {
    /*
     * The list of node types.
     */
    private List<NodeTypeInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of NodeTypeListResult class.
     */
    public NodeTypeListResult() {
    }

    /**
     * Get the value property: The list of node types.
     * 
     * @return the value value.
     */
    public List<NodeTypeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of node types.
     * 
     * @param value the value value to set.
     * @return the NodeTypeListResult object itself.
     */
    public NodeTypeListResult withValue(List<NodeTypeInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the NodeTypeListResult object itself.
     */
    public NodeTypeListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NodeTypeListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NodeTypeListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NodeTypeListResult.
     */
    public static NodeTypeListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NodeTypeListResult deserializedNodeTypeListResult = new NodeTypeListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<NodeTypeInner> value = reader.readArray(reader1 -> NodeTypeInner.fromJson(reader1));
                    deserializedNodeTypeListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedNodeTypeListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNodeTypeListResult;
        });
    }
}
