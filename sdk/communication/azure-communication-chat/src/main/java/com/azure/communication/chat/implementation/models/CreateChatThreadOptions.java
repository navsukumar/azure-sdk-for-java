// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Request payload for creating a chat thread.
 */
@Fluent
public final class CreateChatThreadOptions implements JsonSerializable<CreateChatThreadOptions> {
    /*
     * The chat thread topic.
     */
    private String topic;

    /*
     * Participants to be added to the chat thread.
     */
    private List<ChatParticipant> participants;

    /**
     * Creates an instance of CreateChatThreadOptions class.
     */
    public CreateChatThreadOptions() {
    }

    /**
     * Get the topic property: The chat thread topic.
     * 
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Set the topic property: The chat thread topic.
     * 
     * @param topic the topic value to set.
     * @return the CreateChatThreadOptions object itself.
     */
    public CreateChatThreadOptions setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the participants property: Participants to be added to the chat thread.
     * 
     * @return the participants value.
     */
    public List<ChatParticipant> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: Participants to be added to the chat thread.
     * 
     * @param participants the participants value to set.
     * @return the CreateChatThreadOptions object itself.
     */
    public CreateChatThreadOptions setParticipants(List<ChatParticipant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("topic", this.topic);
        jsonWriter.writeArrayField("participants", this.participants, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateChatThreadOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateChatThreadOptions if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateChatThreadOptions.
     */
    public static CreateChatThreadOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateChatThreadOptions deserializedCreateChatThreadOptions = new CreateChatThreadOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("topic".equals(fieldName)) {
                    deserializedCreateChatThreadOptions.topic = reader.getString();
                } else if ("participants".equals(fieldName)) {
                    List<ChatParticipant> participants = reader.readArray(reader1 -> ChatParticipant.fromJson(reader1));
                    deserializedCreateChatThreadOptions.participants = participants;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCreateChatThreadOptions;
        });
    }
}
