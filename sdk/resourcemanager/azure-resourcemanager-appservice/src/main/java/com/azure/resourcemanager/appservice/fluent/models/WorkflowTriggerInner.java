// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.ResourceReference;
import com.azure.resourcemanager.appservice.models.WorkflowState;
import com.azure.resourcemanager.appservice.models.WorkflowStatus;
import com.azure.resourcemanager.appservice.models.WorkflowTriggerProvisioningState;
import com.azure.resourcemanager.appservice.models.WorkflowTriggerRecurrence;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The workflow trigger.
 */
@Fluent
public final class WorkflowTriggerInner extends SubResource {
    /*
     * The workflow trigger properties.
     */
    private WorkflowTriggerProperties innerProperties;

    /*
     * Gets the workflow trigger name.
     */
    private String name;

    /*
     * Gets the workflow trigger type.
     */
    private String type;

    /**
     * Creates an instance of WorkflowTriggerInner class.
     */
    public WorkflowTriggerInner() {
    }

    /**
     * Get the innerProperties property: The workflow trigger properties.
     * 
     * @return the innerProperties value.
     */
    private WorkflowTriggerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Gets the workflow trigger name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Gets the workflow trigger type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowTriggerInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state.
     * 
     * @return the provisioningState value.
     */
    public WorkflowTriggerProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the createdTime property: Gets the created time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTime();
    }

    /**
     * Get the changedTime property: Gets the changed time.
     * 
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().changedTime();
    }

    /**
     * Get the state property: Gets the state.
     * 
     * @return the state value.
     */
    public WorkflowState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the status property: Gets the status.
     * 
     * @return the status value.
     */
    public WorkflowStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the lastExecutionTime property: Gets the last execution time.
     * 
     * @return the lastExecutionTime value.
     */
    public OffsetDateTime lastExecutionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastExecutionTime();
    }

    /**
     * Get the nextExecutionTime property: Gets the next execution time.
     * 
     * @return the nextExecutionTime value.
     */
    public OffsetDateTime nextExecutionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().nextExecutionTime();
    }

    /**
     * Get the recurrence property: Gets the workflow trigger recurrence.
     * 
     * @return the recurrence value.
     */
    public WorkflowTriggerRecurrence recurrence() {
        return this.innerProperties() == null ? null : this.innerProperties().recurrence();
    }

    /**
     * Get the workflow property: Gets the reference to workflow.
     * 
     * @return the workflow value.
     */
    public ResourceReference workflow() {
        return this.innerProperties() == null ? null : this.innerProperties().workflow();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkflowTriggerInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkflowTriggerInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkflowTriggerInner.
     */
    public static WorkflowTriggerInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkflowTriggerInner deserializedWorkflowTriggerInner = new WorkflowTriggerInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedWorkflowTriggerInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedWorkflowTriggerInner.innerProperties = WorkflowTriggerProperties.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedWorkflowTriggerInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWorkflowTriggerInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkflowTriggerInner;
        });
    }
}
