// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.ConnectionMonitorResultInner;
import java.io.IOException;
import java.util.List;

/**
 * List of connection monitors.
 */
@Fluent
public final class ConnectionMonitorListResult implements JsonSerializable<ConnectionMonitorListResult> {
    /*
     * Information about connection monitors.
     */
    private List<ConnectionMonitorResultInner> value;

    /**
     * Creates an instance of ConnectionMonitorListResult class.
     */
    public ConnectionMonitorListResult() {
    }

    /**
     * Get the value property: Information about connection monitors.
     * 
     * @return the value value.
     */
    public List<ConnectionMonitorResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about connection monitors.
     * 
     * @param value the value value to set.
     * @return the ConnectionMonitorListResult object itself.
     */
    public ConnectionMonitorListResult withValue(List<ConnectionMonitorResultInner> value) {
        this.value = value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionMonitorListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionMonitorListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionMonitorListResult.
     */
    public static ConnectionMonitorListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionMonitorListResult deserializedConnectionMonitorListResult = new ConnectionMonitorListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ConnectionMonitorResultInner> value
                        = reader.readArray(reader1 -> ConnectionMonitorResultInner.fromJson(reader1));
                    deserializedConnectionMonitorListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionMonitorListResult;
        });
    }
}
