// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents the workflow health.
 */
@Fluent
public final class WorkflowHealth implements JsonSerializable<WorkflowHealth> {
    /*
     * Gets or sets the workflow health state.
     */
    private WorkflowHealthState state;

    /*
     * Gets or sets the workflow error.
     */
    private ErrorEntity error;

    /**
     * Creates an instance of WorkflowHealth class.
     */
    public WorkflowHealth() {
    }

    /**
     * Get the state property: Gets or sets the workflow health state.
     * 
     * @return the state value.
     */
    public WorkflowHealthState state() {
        return this.state;
    }

    /**
     * Set the state property: Gets or sets the workflow health state.
     * 
     * @param state the state value to set.
     * @return the WorkflowHealth object itself.
     */
    public WorkflowHealth withState(WorkflowHealthState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the error property: Gets or sets the workflow error.
     * 
     * @return the error value.
     */
    public ErrorEntity error() {
        return this.error;
    }

    /**
     * Set the error property: Gets or sets the workflow error.
     * 
     * @param error the error value to set.
     * @return the WorkflowHealth object itself.
     */
    public WorkflowHealth withError(ErrorEntity error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property state in model WorkflowHealth"));
        }
        if (error() != null) {
            error().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkflowHealth.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkflowHealth from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkflowHealth if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkflowHealth.
     */
    public static WorkflowHealth fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkflowHealth deserializedWorkflowHealth = new WorkflowHealth();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("state".equals(fieldName)) {
                    deserializedWorkflowHealth.state = WorkflowHealthState.fromString(reader.getString());
                } else if ("error".equals(fieldName)) {
                    deserializedWorkflowHealth.error = ErrorEntity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkflowHealth;
        });
    }
}
