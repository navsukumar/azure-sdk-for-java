// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.JobSchedule;
import java.io.IOException;

/**
 * Properties of a job.
 */
@Fluent
public final class JobProperties implements JsonSerializable<JobProperties> {
    /*
     * User-defined description of the job.
     */
    private String description;

    /*
     * The job version number.
     */
    private Integer version;

    /*
     * Schedule properties of the job.
     */
    private JobSchedule schedule;

    /**
     * Creates an instance of JobProperties class.
     */
    public JobProperties() {
    }

    /**
     * Get the description property: User-defined description of the job.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: User-defined description of the job.
     * 
     * @param description the description value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the version property: The job version number.
     * 
     * @return the version value.
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Get the schedule property: Schedule properties of the job.
     * 
     * @return the schedule value.
     */
    public JobSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Schedule properties of the job.
     * 
     * @param schedule the schedule value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withSchedule(JobSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schedule() != null) {
            schedule().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeJsonField("schedule", this.schedule);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the JobProperties.
     */
    public static JobProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobProperties deserializedJobProperties = new JobProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedJobProperties.description = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedJobProperties.version = reader.getNullable(JsonReader::getInt);
                } else if ("schedule".equals(fieldName)) {
                    deserializedJobProperties.schedule = JobSchedule.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobProperties;
        });
    }
}
