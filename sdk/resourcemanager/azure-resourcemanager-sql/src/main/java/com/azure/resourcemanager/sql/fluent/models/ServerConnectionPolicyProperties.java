// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.ServerConnectionType;
import java.io.IOException;

/**
 * The properties of a server connection policy.
 */
@Fluent
public final class ServerConnectionPolicyProperties implements JsonSerializable<ServerConnectionPolicyProperties> {
    /*
     * The server connection type.
     */
    private ServerConnectionType connectionType;

    /**
     * Creates an instance of ServerConnectionPolicyProperties class.
     */
    public ServerConnectionPolicyProperties() {
    }

    /**
     * Get the connectionType property: The server connection type.
     * 
     * @return the connectionType value.
     */
    public ServerConnectionType connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: The server connection type.
     * 
     * @param connectionType the connectionType value to set.
     * @return the ServerConnectionPolicyProperties object itself.
     */
    public ServerConnectionPolicyProperties withConnectionType(ServerConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property connectionType in model ServerConnectionPolicyProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerConnectionPolicyProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("connectionType",
            this.connectionType == null ? null : this.connectionType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerConnectionPolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerConnectionPolicyProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServerConnectionPolicyProperties.
     */
    public static ServerConnectionPolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerConnectionPolicyProperties deserializedServerConnectionPolicyProperties
                = new ServerConnectionPolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectionType".equals(fieldName)) {
                    deserializedServerConnectionPolicyProperties.connectionType
                        = ServerConnectionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerConnectionPolicyProperties;
        });
    }
}
