// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The container exec request.
 */
@Fluent
public final class ContainerExecRequest implements JsonSerializable<ContainerExecRequest> {
    /*
     * The command to be executed.
     */
    private String command;

    /*
     * The size of the terminal.
     */
    private ContainerExecRequestTerminalSize terminalSize;

    /**
     * Creates an instance of ContainerExecRequest class.
     */
    public ContainerExecRequest() {
    }

    /**
     * Get the command property: The command to be executed.
     * 
     * @return the command value.
     */
    public String command() {
        return this.command;
    }

    /**
     * Set the command property: The command to be executed.
     * 
     * @param command the command value to set.
     * @return the ContainerExecRequest object itself.
     */
    public ContainerExecRequest withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * Get the terminalSize property: The size of the terminal.
     * 
     * @return the terminalSize value.
     */
    public ContainerExecRequestTerminalSize terminalSize() {
        return this.terminalSize;
    }

    /**
     * Set the terminalSize property: The size of the terminal.
     * 
     * @param terminalSize the terminalSize value to set.
     * @return the ContainerExecRequest object itself.
     */
    public ContainerExecRequest withTerminalSize(ContainerExecRequestTerminalSize terminalSize) {
        this.terminalSize = terminalSize;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (terminalSize() != null) {
            terminalSize().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("command", this.command);
        jsonWriter.writeJsonField("terminalSize", this.terminalSize);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerExecRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerExecRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContainerExecRequest.
     */
    public static ContainerExecRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerExecRequest deserializedContainerExecRequest = new ContainerExecRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("command".equals(fieldName)) {
                    deserializedContainerExecRequest.command = reader.getString();
                } else if ("terminalSize".equals(fieldName)) {
                    deserializedContainerExecRequest.terminalSize = ContainerExecRequestTerminalSize.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerExecRequest;
        });
    }
}
