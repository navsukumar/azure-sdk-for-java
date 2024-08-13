// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * TCPSocketAction describes an action based on opening a socket.
 */
@Immutable
public final class TcpSocketAction extends ProbeAction {
    /*
     * The type of the action to take to perform the health check.
     */
    private ProbeActionType type = ProbeActionType.TCPSOCKET_ACTION;

    /**
     * Creates an instance of TcpSocketAction class.
     */
    public TcpSocketAction() {
    }

    /**
     * Get the type property: The type of the action to take to perform the health check.
     * 
     * @return the type value.
     */
    @Override
    public ProbeActionType type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TcpSocketAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TcpSocketAction if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TcpSocketAction.
     */
    public static TcpSocketAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TcpSocketAction deserializedTcpSocketAction = new TcpSocketAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedTcpSocketAction.type = ProbeActionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTcpSocketAction;
        });
    }
}
