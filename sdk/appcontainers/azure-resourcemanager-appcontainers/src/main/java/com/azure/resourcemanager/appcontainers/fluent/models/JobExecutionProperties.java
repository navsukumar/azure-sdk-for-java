// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.models.ExecutionStatus;
import com.azure.resourcemanager.appcontainers.models.JobExecutionRunningState;
import com.azure.resourcemanager.appcontainers.models.JobExecutionTemplate;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Container Apps Job execution specific properties.
 */
@Fluent
public final class JobExecutionProperties implements JsonSerializable<JobExecutionProperties> {
    /*
     * Current running State of the job
     */
    private JobExecutionRunningState status;

    /*
     * Job execution start time.
     */
    private OffsetDateTime startTime;

    /*
     * Job execution end time.
     */
    private OffsetDateTime endTime;

    /*
     * Job's execution container.
     */
    private JobExecutionTemplate template;

    /*
     * Detailed status of the job execution.
     */
    private ExecutionStatus detailedStatus;

    /**
     * Creates an instance of JobExecutionProperties class.
     */
    public JobExecutionProperties() {
    }

    /**
     * Get the status property: Current running State of the job.
     * 
     * @return the status value.
     */
    public JobExecutionRunningState status() {
        return this.status;
    }

    /**
     * Get the startTime property: Job execution start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Job execution start time.
     * 
     * @param startTime the startTime value to set.
     * @return the JobExecutionProperties object itself.
     */
    public JobExecutionProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Job execution end time.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Job execution end time.
     * 
     * @param endTime the endTime value to set.
     * @return the JobExecutionProperties object itself.
     */
    public JobExecutionProperties withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the template property: Job's execution container.
     * 
     * @return the template value.
     */
    public JobExecutionTemplate template() {
        return this.template;
    }

    /**
     * Set the template property: Job's execution container.
     * 
     * @param template the template value to set.
     * @return the JobExecutionProperties object itself.
     */
    public JobExecutionProperties withTemplate(JobExecutionTemplate template) {
        this.template = template;
        return this;
    }

    /**
     * Get the detailedStatus property: Detailed status of the job execution.
     * 
     * @return the detailedStatus value.
     */
    public ExecutionStatus detailedStatus() {
        return this.detailedStatus;
    }

    /**
     * Set the detailedStatus property: Detailed status of the job execution.
     * 
     * @param detailedStatus the detailedStatus value to set.
     * @return the JobExecutionProperties object itself.
     */
    public JobExecutionProperties withDetailedStatus(ExecutionStatus detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (template() != null) {
            template().validate();
        }
        if (detailedStatus() != null) {
            detailedStatus().validate();
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
        jsonWriter.writeJsonField("template", this.template);
        jsonWriter.writeJsonField("detailedStatus", this.detailedStatus);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobExecutionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobExecutionProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the JobExecutionProperties.
     */
    public static JobExecutionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobExecutionProperties deserializedJobExecutionProperties = new JobExecutionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedJobExecutionProperties.status = JobExecutionRunningState.fromString(reader.getString());
                } else if ("startTime".equals(fieldName)) {
                    deserializedJobExecutionProperties.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedJobExecutionProperties.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("template".equals(fieldName)) {
                    deserializedJobExecutionProperties.template = JobExecutionTemplate.fromJson(reader);
                } else if ("detailedStatus".equals(fieldName)) {
                    deserializedJobExecutionProperties.detailedStatus = ExecutionStatus.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobExecutionProperties;
        });
    }
}
