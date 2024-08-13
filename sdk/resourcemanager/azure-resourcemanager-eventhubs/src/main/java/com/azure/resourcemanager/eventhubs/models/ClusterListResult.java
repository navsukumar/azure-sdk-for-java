// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.fluent.models.ClusterInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of the List Event Hubs Clusters operation.
 */
@Fluent
public final class ClusterListResult implements JsonSerializable<ClusterListResult> {
    /*
     * The Event Hubs Clusters present in the List Event Hubs operation results.
     */
    private List<ClusterInner> value;

    /*
     * Link to the next set of results. Empty unless the value parameter contains an incomplete list of Event Hubs
     * Clusters.
     */
    private String nextLink;

    /**
     * Creates an instance of ClusterListResult class.
     */
    public ClusterListResult() {
    }

    /**
     * Get the value property: The Event Hubs Clusters present in the List Event Hubs operation results.
     * 
     * @return the value value.
     */
    public List<ClusterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The Event Hubs Clusters present in the List Event Hubs operation results.
     * 
     * @param value the value value to set.
     * @return the ClusterListResult object itself.
     */
    public ClusterListResult withValue(List<ClusterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Empty unless the value parameter contains an
     * incomplete list of Event Hubs Clusters.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Empty unless the value parameter contains an
     * incomplete list of Event Hubs Clusters.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ClusterListResult object itself.
     */
    public ClusterListResult withNextLink(String nextLink) {
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
     * Reads an instance of ClusterListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterListResult.
     */
    public static ClusterListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterListResult deserializedClusterListResult = new ClusterListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ClusterInner> value = reader.readArray(reader1 -> ClusterInner.fromJson(reader1));
                    deserializedClusterListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedClusterListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterListResult;
        });
    }
}
