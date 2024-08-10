// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.fluent.models.WorkflowTriggerHistoryInner;
import java.io.IOException;
import java.util.List;

/**
 * The list of workflow trigger histories.
 */
@Fluent
public final class WorkflowTriggerHistoryListResult implements JsonSerializable<WorkflowTriggerHistoryListResult> {
    /*
     * A list of workflow trigger histories.
     */
    private List<WorkflowTriggerHistoryInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of WorkflowTriggerHistoryListResult class.
     */
    public WorkflowTriggerHistoryListResult() {
    }

    /**
     * Get the value property: A list of workflow trigger histories.
     * 
     * @return the value value.
     */
    public List<WorkflowTriggerHistoryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of workflow trigger histories.
     * 
     * @param value the value value to set.
     * @return the WorkflowTriggerHistoryListResult object itself.
     */
    public WorkflowTriggerHistoryListResult withValue(List<WorkflowTriggerHistoryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the WorkflowTriggerHistoryListResult object itself.
     */
    public WorkflowTriggerHistoryListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkflowTriggerHistoryListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkflowTriggerHistoryListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkflowTriggerHistoryListResult.
     */
    public static WorkflowTriggerHistoryListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkflowTriggerHistoryListResult deserializedWorkflowTriggerHistoryListResult
                = new WorkflowTriggerHistoryListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<WorkflowTriggerHistoryInner> value
                        = reader.readArray(reader1 -> WorkflowTriggerHistoryInner.fromJson(reader1));
                    deserializedWorkflowTriggerHistoryListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedWorkflowTriggerHistoryListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkflowTriggerHistoryListResult;
        });
    }
}
