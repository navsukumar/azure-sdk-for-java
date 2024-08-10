// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The run operation result properties.
 */
@Fluent
public class OperationResultProperties implements JsonSerializable<OperationResultProperties> {
    /*
     * The start time of the workflow scope repetition.
     */
    private OffsetDateTime startTime;

    /*
     * The end time of the workflow scope repetition.
     */
    private OffsetDateTime endTime;

    /*
     * The correlation properties.
     */
    private RunActionCorrelation correlation;

    /*
     * The status of the workflow scope repetition.
     */
    private WorkflowStatus status;

    /*
     * The workflow scope repetition code.
     */
    private String code;

    /*
     * Anything
     */
    private Object error;

    /**
     * Creates an instance of OperationResultProperties class.
     */
    public OperationResultProperties() {
    }

    /**
     * Get the startTime property: The start time of the workflow scope repetition.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the workflow scope repetition.
     * 
     * @param startTime the startTime value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the workflow scope repetition.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the workflow scope repetition.
     * 
     * @param endTime the endTime value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the correlation property: The correlation properties.
     * 
     * @return the correlation value.
     */
    public RunActionCorrelation correlation() {
        return this.correlation;
    }

    /**
     * Set the correlation property: The correlation properties.
     * 
     * @param correlation the correlation value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withCorrelation(RunActionCorrelation correlation) {
        this.correlation = correlation;
        return this;
    }

    /**
     * Get the status property: The status of the workflow scope repetition.
     * 
     * @return the status value.
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the workflow scope repetition.
     * 
     * @param status the status value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withStatus(WorkflowStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the code property: The workflow scope repetition code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The workflow scope repetition code.
     * 
     * @param code the code value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the error property: Anything.
     * 
     * @return the error value.
     */
    public Object error() {
        return this.error;
    }

    /**
     * Set the error property: Anything.
     * 
     * @param error the error value to set.
     * @return the OperationResultProperties object itself.
     */
    public OperationResultProperties withError(Object error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (correlation() != null) {
            correlation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("endTime",
            this.endTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endTime));
        jsonWriter.writeJsonField("correlation", this.correlation);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeUntypedField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationResultProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationResultProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationResultProperties.
     */
    public static OperationResultProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationResultProperties deserializedOperationResultProperties = new OperationResultProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startTime".equals(fieldName)) {
                    deserializedOperationResultProperties.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedOperationResultProperties.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("correlation".equals(fieldName)) {
                    deserializedOperationResultProperties.correlation = RunActionCorrelation.fromJson(reader);
                } else if ("status".equals(fieldName)) {
                    deserializedOperationResultProperties.status = WorkflowStatus.fromString(reader.getString());
                } else if ("code".equals(fieldName)) {
                    deserializedOperationResultProperties.code = reader.getString();
                } else if ("error".equals(fieldName)) {
                    deserializedOperationResultProperties.error = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationResultProperties;
        });
    }
}
