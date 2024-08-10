// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.fluent.models.PrivateEndpointConnectionInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of private link resources.
 */
@Fluent
public final class PrivateEndpointConnectionListResult
    implements JsonSerializable<PrivateEndpointConnectionListResult> {
    /*
     * Array of private endpoint connections
     */
    private List<PrivateEndpointConnectionInner> value;

    /*
     * The uri to fetch the next page of snapshots. Call ListNext() with this to fetch the next page of snapshots.
     */
    private String nextLink;

    /**
     * Creates an instance of PrivateEndpointConnectionListResult class.
     */
    public PrivateEndpointConnectionListResult() {
    }

    /**
     * Get the value property: Array of private endpoint connections.
     * 
     * @return the value value.
     */
    public List<PrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of private endpoint connections.
     * 
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionListResult object itself.
     */
    public PrivateEndpointConnectionListResult withValue(List<PrivateEndpointConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of snapshots. Call ListNext() with this to fetch the
     * next page of snapshots.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of snapshots. Call ListNext() with this to fetch the
     * next page of snapshots.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PrivateEndpointConnectionListResult object itself.
     */
    public PrivateEndpointConnectionListResult withNextLink(String nextLink) {
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
     * Reads an instance of PrivateEndpointConnectionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionListResult.
     */
    public static PrivateEndpointConnectionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionListResult deserializedPrivateEndpointConnectionListResult
                = new PrivateEndpointConnectionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PrivateEndpointConnectionInner> value
                        = reader.readArray(reader1 -> PrivateEndpointConnectionInner.fromJson(reader1));
                    deserializedPrivateEndpointConnectionListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionListResult;
        });
    }
}
