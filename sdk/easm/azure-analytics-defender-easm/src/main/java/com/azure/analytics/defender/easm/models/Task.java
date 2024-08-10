// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * The Task model.
 */
@Immutable
public final class Task implements JsonSerializable<Task> {

    /*
     * The unique identifier of the task.
     */
    @Generated
    private String id;

    /*
     * The time the task started.
     */
    @Generated
    private OffsetDateTime startedAt;

    /*
     * The time the task completed.
     */
    @Generated
    private OffsetDateTime completedAt;

    /*
     * The last time the status of the task was updated.
     */
    @Generated
    private OffsetDateTime lastPolledAt;

    /*
     * The state the task is in.
     */
    @Generated
    private TaskState state;

    /*
     * The phase the task is in.
     */
    @Generated
    private TaskPhase phase;

    /*
     * The reason the task was moved into its current state, if the task wasn't completed.
     */
    @Generated
    private String reason;

    /*
     * Attributes unique to the task. This differs by task type.
     */
    @Generated
    private Map<String, Object> metadata;

    /**
     * Creates an instance of Task class.
     */
    @Generated
    private Task() {
    }

    /**
     * Get the id property: The unique identifier of the task.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the startedAt property: The time the task started.
     *
     * @return the startedAt value.
     */
    @Generated
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }

    /**
     * Get the completedAt property: The time the task completed.
     *
     * @return the completedAt value.
     */
    @Generated
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     * Get the lastPolledAt property: The last time the status of the task was updated.
     *
     * @return the lastPolledAt value.
     */
    @Generated
    public OffsetDateTime getLastPolledAt() {
        return this.lastPolledAt;
    }

    /**
     * Get the state property: The state the task is in.
     *
     * @return the state value.
     */
    @Generated
    public TaskState getState() {
        return this.state;
    }

    /**
     * Get the phase property: The phase the task is in.
     *
     * @return the phase value.
     */
    @Generated
    public TaskPhase getPhase() {
        return this.phase;
    }

    /**
     * Get the reason property: The reason the task was moved into its current state, if the task wasn't completed.
     *
     * @return the reason value.
     */
    @Generated
    public String getReason() {
        return this.reason;
    }

    /**
     * Get the metadata property: Attributes unique to the task. This differs by task type.
     *
     * @return the metadata value.
     */
    @Generated
    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startedAt",
            this.startedAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startedAt));
        jsonWriter.writeStringField("completedAt",
            this.completedAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.completedAt));
        jsonWriter.writeStringField("lastPolledAt",
            this.lastPolledAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastPolledAt));
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeStringField("phase", this.phase == null ? null : this.phase.toString());
        jsonWriter.writeStringField("reason", this.reason);
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Task from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Task if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Task.
     */
    @Generated
    public static Task fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Task deserializedTask = new Task();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    deserializedTask.id = reader.getString();
                } else if ("startedAt".equals(fieldName)) {
                    deserializedTask.startedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("completedAt".equals(fieldName)) {
                    deserializedTask.completedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastPolledAt".equals(fieldName)) {
                    deserializedTask.lastPolledAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("state".equals(fieldName)) {
                    deserializedTask.state = TaskState.fromString(reader.getString());
                } else if ("phase".equals(fieldName)) {
                    deserializedTask.phase = TaskPhase.fromString(reader.getString());
                } else if ("reason".equals(fieldName)) {
                    deserializedTask.reason = reader.getString();
                } else if ("metadata".equals(fieldName)) {
                    Map<String, Object> metadata = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedTask.metadata = metadata;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedTask;
        });
    }
}
