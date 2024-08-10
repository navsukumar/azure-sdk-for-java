// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ScopeConnectionState;
import java.io.IOException;

/**
 * Information about the network manager connection.
 */
@Fluent
public final class NetworkManagerConnectionProperties implements JsonSerializable<NetworkManagerConnectionProperties> {
    /*
     * Network Manager Id.
     */
    private String networkManagerId;

    /*
     * Connection state.
     */
    private ScopeConnectionState connectionState;

    /*
     * A description of the network manager connection.
     */
    private String description;

    /**
     * Creates an instance of NetworkManagerConnectionProperties class.
     */
    public NetworkManagerConnectionProperties() {
    }

    /**
     * Get the networkManagerId property: Network Manager Id.
     * 
     * @return the networkManagerId value.
     */
    public String networkManagerId() {
        return this.networkManagerId;
    }

    /**
     * Set the networkManagerId property: Network Manager Id.
     * 
     * @param networkManagerId the networkManagerId value to set.
     * @return the NetworkManagerConnectionProperties object itself.
     */
    public NetworkManagerConnectionProperties withNetworkManagerId(String networkManagerId) {
        this.networkManagerId = networkManagerId;
        return this;
    }

    /**
     * Get the connectionState property: Connection state.
     * 
     * @return the connectionState value.
     */
    public ScopeConnectionState connectionState() {
        return this.connectionState;
    }

    /**
     * Get the description property: A description of the network manager connection.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description of the network manager connection.
     * 
     * @param description the description value to set.
     * @return the NetworkManagerConnectionProperties object itself.
     */
    public NetworkManagerConnectionProperties withDescription(String description) {
        this.description = description;
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
        jsonWriter.writeStringField("networkManagerId", this.networkManagerId);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkManagerConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkManagerConnectionProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkManagerConnectionProperties.
     */
    public static NetworkManagerConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkManagerConnectionProperties deserializedNetworkManagerConnectionProperties
                = new NetworkManagerConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkManagerId".equals(fieldName)) {
                    deserializedNetworkManagerConnectionProperties.networkManagerId = reader.getString();
                } else if ("connectionState".equals(fieldName)) {
                    deserializedNetworkManagerConnectionProperties.connectionState
                        = ScopeConnectionState.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedNetworkManagerConnectionProperties.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkManagerConnectionProperties;
        });
    }
}
