// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.fluent.models.VirtualNetworkRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of virtual network rules.
 */
@Immutable
public final class VirtualNetworkRuleListResult implements JsonSerializable<VirtualNetworkRuleListResult> {
    /*
     * Array of results.
     */
    private List<VirtualNetworkRuleInner> value;

    /*
     * Link to retrieve next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of VirtualNetworkRuleListResult class.
     */
    public VirtualNetworkRuleListResult() {
    }

    /**
     * Get the value property: Array of results.
     * 
     * @return the value value.
     */
    public List<VirtualNetworkRuleInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to retrieve next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkRuleListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkRuleListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualNetworkRuleListResult.
     */
    public static VirtualNetworkRuleListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkRuleListResult deserializedVirtualNetworkRuleListResult = new VirtualNetworkRuleListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VirtualNetworkRuleInner> value
                        = reader.readArray(reader1 -> VirtualNetworkRuleInner.fromJson(reader1));
                    deserializedVirtualNetworkRuleListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedVirtualNetworkRuleListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkRuleListResult;
        });
    }
}
