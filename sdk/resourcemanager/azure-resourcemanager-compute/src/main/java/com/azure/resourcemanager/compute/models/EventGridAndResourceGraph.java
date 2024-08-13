// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies eventGridAndResourceGraph related Scheduled Event related configurations.
 */
@Fluent
public final class EventGridAndResourceGraph implements JsonSerializable<EventGridAndResourceGraph> {
    /*
     * Specifies if event grid and resource graph is enabled for Scheduled event related configurations.
     */
    private Boolean enable;

    /**
     * Creates an instance of EventGridAndResourceGraph class.
     */
    public EventGridAndResourceGraph() {
    }

    /**
     * Get the enable property: Specifies if event grid and resource graph is enabled for Scheduled event related
     * configurations.
     * 
     * @return the enable value.
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set the enable property: Specifies if event grid and resource graph is enabled for Scheduled event related
     * configurations.
     * 
     * @param enable the enable value to set.
     * @return the EventGridAndResourceGraph object itself.
     */
    public EventGridAndResourceGraph withEnable(Boolean enable) {
        this.enable = enable;
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
        jsonWriter.writeBooleanField("enable", this.enable);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventGridAndResourceGraph from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventGridAndResourceGraph if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EventGridAndResourceGraph.
     */
    public static EventGridAndResourceGraph fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventGridAndResourceGraph deserializedEventGridAndResourceGraph = new EventGridAndResourceGraph();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enable".equals(fieldName)) {
                    deserializedEventGridAndResourceGraph.enable = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventGridAndResourceGraph;
        });
    }
}
