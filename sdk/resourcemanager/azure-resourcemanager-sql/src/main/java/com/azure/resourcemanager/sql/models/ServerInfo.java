// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Server info for the server trust group.
 */
@Fluent
public final class ServerInfo implements JsonSerializable<ServerInfo> {
    /*
     * Server Id.
     */
    private String serverId;

    /**
     * Creates an instance of ServerInfo class.
     */
    public ServerInfo() {
    }

    /**
     * Get the serverId property: Server Id.
     * 
     * @return the serverId value.
     */
    public String serverId() {
        return this.serverId;
    }

    /**
     * Set the serverId property: Server Id.
     * 
     * @param serverId the serverId value to set.
     * @return the ServerInfo object itself.
     */
    public ServerInfo withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serverId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property serverId in model ServerInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerInfo.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("serverId", this.serverId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerInfo if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServerInfo.
     */
    public static ServerInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerInfo deserializedServerInfo = new ServerInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serverId".equals(fieldName)) {
                    deserializedServerInfo.serverId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerInfo;
        });
    }
}
