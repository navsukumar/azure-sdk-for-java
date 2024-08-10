// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerregistry.models.EventRequestMessage;
import com.azure.resourcemanager.containerregistry.models.EventResponseMessage;
import java.io.IOException;

/**
 * The event for a webhook.
 */
@Fluent
public final class EventInner extends EventInfoInner {
    /*
     * The event request message sent to the service URI.
     */
    private EventRequestMessage eventRequestMessage;

    /*
     * The event response message received from the service URI.
     */
    private EventResponseMessage eventResponseMessage;

    /**
     * Creates an instance of EventInner class.
     */
    public EventInner() {
    }

    /**
     * Get the eventRequestMessage property: The event request message sent to the service URI.
     * 
     * @return the eventRequestMessage value.
     */
    public EventRequestMessage eventRequestMessage() {
        return this.eventRequestMessage;
    }

    /**
     * Set the eventRequestMessage property: The event request message sent to the service URI.
     * 
     * @param eventRequestMessage the eventRequestMessage value to set.
     * @return the EventInner object itself.
     */
    public EventInner withEventRequestMessage(EventRequestMessage eventRequestMessage) {
        this.eventRequestMessage = eventRequestMessage;
        return this;
    }

    /**
     * Get the eventResponseMessage property: The event response message received from the service URI.
     * 
     * @return the eventResponseMessage value.
     */
    public EventResponseMessage eventResponseMessage() {
        return this.eventResponseMessage;
    }

    /**
     * Set the eventResponseMessage property: The event response message received from the service URI.
     * 
     * @param eventResponseMessage the eventResponseMessage value to set.
     * @return the EventInner object itself.
     */
    public EventInner withEventResponseMessage(EventResponseMessage eventResponseMessage) {
        this.eventResponseMessage = eventResponseMessage;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (eventRequestMessage() != null) {
            eventRequestMessage().validate();
        }
        if (eventResponseMessage() != null) {
            eventResponseMessage().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("eventRequestMessage", this.eventRequestMessage);
        jsonWriter.writeJsonField("eventResponseMessage", this.eventResponseMessage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the EventInner.
     */
    public static EventInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventInner deserializedEventInner = new EventInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedEventInner.withId(reader.getString());
                } else if ("eventRequestMessage".equals(fieldName)) {
                    deserializedEventInner.eventRequestMessage = EventRequestMessage.fromJson(reader);
                } else if ("eventResponseMessage".equals(fieldName)) {
                    deserializedEventInner.eventResponseMessage = EventResponseMessage.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventInner;
        });
    }
}
