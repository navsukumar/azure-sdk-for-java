// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ConnectionMonitorSourceStatus;
import com.azure.resourcemanager.network.models.ConnectionStateSnapshot;
import java.io.IOException;
import java.util.List;

/**
 * List of connection states snapshots.
 */
@Fluent
public final class ConnectionMonitorQueryResultInner implements JsonSerializable<ConnectionMonitorQueryResultInner> {
    /*
     * Status of connection monitor source.
     */
    private ConnectionMonitorSourceStatus sourceStatus;

    /*
     * Information about connection states.
     */
    private List<ConnectionStateSnapshot> states;

    /**
     * Creates an instance of ConnectionMonitorQueryResultInner class.
     */
    public ConnectionMonitorQueryResultInner() {
    }

    /**
     * Get the sourceStatus property: Status of connection monitor source.
     * 
     * @return the sourceStatus value.
     */
    public ConnectionMonitorSourceStatus sourceStatus() {
        return this.sourceStatus;
    }

    /**
     * Set the sourceStatus property: Status of connection monitor source.
     * 
     * @param sourceStatus the sourceStatus value to set.
     * @return the ConnectionMonitorQueryResultInner object itself.
     */
    public ConnectionMonitorQueryResultInner withSourceStatus(ConnectionMonitorSourceStatus sourceStatus) {
        this.sourceStatus = sourceStatus;
        return this;
    }

    /**
     * Get the states property: Information about connection states.
     * 
     * @return the states value.
     */
    public List<ConnectionStateSnapshot> states() {
        return this.states;
    }

    /**
     * Set the states property: Information about connection states.
     * 
     * @param states the states value to set.
     * @return the ConnectionMonitorQueryResultInner object itself.
     */
    public ConnectionMonitorQueryResultInner withStates(List<ConnectionStateSnapshot> states) {
        this.states = states;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (states() != null) {
            states().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceStatus", this.sourceStatus == null ? null : this.sourceStatus.toString());
        jsonWriter.writeArrayField("states", this.states, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionMonitorQueryResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionMonitorQueryResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionMonitorQueryResultInner.
     */
    public static ConnectionMonitorQueryResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionMonitorQueryResultInner deserializedConnectionMonitorQueryResultInner
                = new ConnectionMonitorQueryResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceStatus".equals(fieldName)) {
                    deserializedConnectionMonitorQueryResultInner.sourceStatus
                        = ConnectionMonitorSourceStatus.fromString(reader.getString());
                } else if ("states".equals(fieldName)) {
                    List<ConnectionStateSnapshot> states
                        = reader.readArray(reader1 -> ConnectionStateSnapshot.fromJson(reader1));
                    deserializedConnectionMonitorQueryResultInner.states = states;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionMonitorQueryResultInner;
        });
    }
}
