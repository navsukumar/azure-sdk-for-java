// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The properties of a source based trigger.
 */
@Fluent
public final class SourceTrigger implements JsonSerializable<SourceTrigger> {
    /*
     * The properties that describes the source(code) for the task.
     */
    private SourceProperties sourceRepository;

    /*
     * The source event corresponding to the trigger.
     */
    private List<SourceTriggerEvent> sourceTriggerEvents;

    /*
     * The current status of trigger.
     */
    private TriggerStatus status;

    /*
     * The name of the trigger.
     */
    private String name;

    /**
     * Creates an instance of SourceTrigger class.
     */
    public SourceTrigger() {
    }

    /**
     * Get the sourceRepository property: The properties that describes the source(code) for the task.
     * 
     * @return the sourceRepository value.
     */
    public SourceProperties sourceRepository() {
        return this.sourceRepository;
    }

    /**
     * Set the sourceRepository property: The properties that describes the source(code) for the task.
     * 
     * @param sourceRepository the sourceRepository value to set.
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withSourceRepository(SourceProperties sourceRepository) {
        this.sourceRepository = sourceRepository;
        return this;
    }

    /**
     * Get the sourceTriggerEvents property: The source event corresponding to the trigger.
     * 
     * @return the sourceTriggerEvents value.
     */
    public List<SourceTriggerEvent> sourceTriggerEvents() {
        return this.sourceTriggerEvents;
    }

    /**
     * Set the sourceTriggerEvents property: The source event corresponding to the trigger.
     * 
     * @param sourceTriggerEvents the sourceTriggerEvents value to set.
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withSourceTriggerEvents(List<SourceTriggerEvent> sourceTriggerEvents) {
        this.sourceTriggerEvents = sourceTriggerEvents;
        return this;
    }

    /**
     * Get the status property: The current status of trigger.
     * 
     * @return the status value.
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of trigger.
     * 
     * @param status the status value to set.
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name property: The name of the trigger.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the trigger.
     * 
     * @param name the name value to set.
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceRepository() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sourceRepository in model SourceTrigger"));
        } else {
            sourceRepository().validate();
        }
        if (sourceTriggerEvents() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceTriggerEvents in model SourceTrigger"));
        }
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model SourceTrigger"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SourceTrigger.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("sourceRepository", this.sourceRepository);
        jsonWriter.writeArrayField("sourceTriggerEvents", this.sourceTriggerEvents,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SourceTrigger from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SourceTrigger if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SourceTrigger.
     */
    public static SourceTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SourceTrigger deserializedSourceTrigger = new SourceTrigger();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRepository".equals(fieldName)) {
                    deserializedSourceTrigger.sourceRepository = SourceProperties.fromJson(reader);
                } else if ("sourceTriggerEvents".equals(fieldName)) {
                    List<SourceTriggerEvent> sourceTriggerEvents
                        = reader.readArray(reader1 -> SourceTriggerEvent.fromString(reader1.getString()));
                    deserializedSourceTrigger.sourceTriggerEvents = sourceTriggerEvents;
                } else if ("name".equals(fieldName)) {
                    deserializedSourceTrigger.name = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedSourceTrigger.status = TriggerStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSourceTrigger;
        });
    }
}
