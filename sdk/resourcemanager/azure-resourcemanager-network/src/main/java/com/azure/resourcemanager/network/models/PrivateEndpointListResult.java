// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.PrivateEndpointInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for the ListPrivateEndpoints API service call.
 */
@Fluent
public final class PrivateEndpointListResult implements JsonSerializable<PrivateEndpointListResult> {
    /*
     * A list of private endpoint resources in a resource group.
     */
    private List<PrivateEndpointInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of PrivateEndpointListResult class.
     */
    public PrivateEndpointListResult() {
    }

    /**
     * Get the value property: A list of private endpoint resources in a resource group.
     * 
     * @return the value value.
     */
    public List<PrivateEndpointInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of private endpoint resources in a resource group.
     * 
     * @param value the value value to set.
     * @return the PrivateEndpointListResult object itself.
     */
    public PrivateEndpointListResult withValue(List<PrivateEndpointInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointListResult.
     */
    public static PrivateEndpointListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointListResult deserializedPrivateEndpointListResult = new PrivateEndpointListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PrivateEndpointInner> value
                        = reader.readArray(reader1 -> PrivateEndpointInner.fromJson(reader1));
                    deserializedPrivateEndpointListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPrivateEndpointListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointListResult;
        });
    }
}
