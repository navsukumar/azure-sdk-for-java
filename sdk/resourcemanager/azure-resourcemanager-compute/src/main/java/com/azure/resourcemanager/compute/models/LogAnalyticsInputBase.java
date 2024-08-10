// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Api input base class for LogAnalytics Api.
 */
@Fluent
public class LogAnalyticsInputBase implements JsonSerializable<LogAnalyticsInputBase> {
    /*
     * SAS Uri of the logging blob container to which LogAnalytics Api writes output logs to.
     */
    private String blobContainerSasUri;

    /*
     * From time of the query
     */
    private OffsetDateTime fromTime;

    /*
     * To time of the query
     */
    private OffsetDateTime toTime;

    /*
     * Group query result by Throttle Policy applied.
     */
    private Boolean groupByThrottlePolicy;

    /*
     * Group query result by Operation Name.
     */
    private Boolean groupByOperationName;

    /*
     * Group query result by Resource Name.
     */
    private Boolean groupByResourceName;

    /*
     * Group query result by Client Application ID.
     */
    private Boolean groupByClientApplicationId;

    /*
     * Group query result by User Agent.
     */
    private Boolean groupByUserAgent;

    /**
     * Creates an instance of LogAnalyticsInputBase class.
     */
    public LogAnalyticsInputBase() {
    }

    /**
     * Get the blobContainerSasUri property: SAS Uri of the logging blob container to which LogAnalytics Api writes
     * output logs to.
     * 
     * @return the blobContainerSasUri value.
     */
    public String blobContainerSasUri() {
        return this.blobContainerSasUri;
    }

    /**
     * Set the blobContainerSasUri property: SAS Uri of the logging blob container to which LogAnalytics Api writes
     * output logs to.
     * 
     * @param blobContainerSasUri the blobContainerSasUri value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withBlobContainerSasUri(String blobContainerSasUri) {
        this.blobContainerSasUri = blobContainerSasUri;
        return this;
    }

    /**
     * Get the fromTime property: From time of the query.
     * 
     * @return the fromTime value.
     */
    public OffsetDateTime fromTime() {
        return this.fromTime;
    }

    /**
     * Set the fromTime property: From time of the query.
     * 
     * @param fromTime the fromTime value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withFromTime(OffsetDateTime fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * Get the toTime property: To time of the query.
     * 
     * @return the toTime value.
     */
    public OffsetDateTime toTime() {
        return this.toTime;
    }

    /**
     * Set the toTime property: To time of the query.
     * 
     * @param toTime the toTime value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withToTime(OffsetDateTime toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * Get the groupByThrottlePolicy property: Group query result by Throttle Policy applied.
     * 
     * @return the groupByThrottlePolicy value.
     */
    public Boolean groupByThrottlePolicy() {
        return this.groupByThrottlePolicy;
    }

    /**
     * Set the groupByThrottlePolicy property: Group query result by Throttle Policy applied.
     * 
     * @param groupByThrottlePolicy the groupByThrottlePolicy value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByThrottlePolicy(Boolean groupByThrottlePolicy) {
        this.groupByThrottlePolicy = groupByThrottlePolicy;
        return this;
    }

    /**
     * Get the groupByOperationName property: Group query result by Operation Name.
     * 
     * @return the groupByOperationName value.
     */
    public Boolean groupByOperationName() {
        return this.groupByOperationName;
    }

    /**
     * Set the groupByOperationName property: Group query result by Operation Name.
     * 
     * @param groupByOperationName the groupByOperationName value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByOperationName(Boolean groupByOperationName) {
        this.groupByOperationName = groupByOperationName;
        return this;
    }

    /**
     * Get the groupByResourceName property: Group query result by Resource Name.
     * 
     * @return the groupByResourceName value.
     */
    public Boolean groupByResourceName() {
        return this.groupByResourceName;
    }

    /**
     * Set the groupByResourceName property: Group query result by Resource Name.
     * 
     * @param groupByResourceName the groupByResourceName value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByResourceName(Boolean groupByResourceName) {
        this.groupByResourceName = groupByResourceName;
        return this;
    }

    /**
     * Get the groupByClientApplicationId property: Group query result by Client Application ID.
     * 
     * @return the groupByClientApplicationId value.
     */
    public Boolean groupByClientApplicationId() {
        return this.groupByClientApplicationId;
    }

    /**
     * Set the groupByClientApplicationId property: Group query result by Client Application ID.
     * 
     * @param groupByClientApplicationId the groupByClientApplicationId value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByClientApplicationId(Boolean groupByClientApplicationId) {
        this.groupByClientApplicationId = groupByClientApplicationId;
        return this;
    }

    /**
     * Get the groupByUserAgent property: Group query result by User Agent.
     * 
     * @return the groupByUserAgent value.
     */
    public Boolean groupByUserAgent() {
        return this.groupByUserAgent;
    }

    /**
     * Set the groupByUserAgent property: Group query result by User Agent.
     * 
     * @param groupByUserAgent the groupByUserAgent value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByUserAgent(Boolean groupByUserAgent) {
        this.groupByUserAgent = groupByUserAgent;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (blobContainerSasUri() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property blobContainerSasUri in model LogAnalyticsInputBase"));
        }
        if (fromTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property fromTime in model LogAnalyticsInputBase"));
        }
        if (toTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property toTime in model LogAnalyticsInputBase"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogAnalyticsInputBase.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("blobContainerSasUri", this.blobContainerSasUri);
        jsonWriter.writeStringField("fromTime",
            this.fromTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.fromTime));
        jsonWriter.writeStringField("toTime",
            this.toTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.toTime));
        jsonWriter.writeBooleanField("groupByThrottlePolicy", this.groupByThrottlePolicy);
        jsonWriter.writeBooleanField("groupByOperationName", this.groupByOperationName);
        jsonWriter.writeBooleanField("groupByResourceName", this.groupByResourceName);
        jsonWriter.writeBooleanField("groupByClientApplicationId", this.groupByClientApplicationId);
        jsonWriter.writeBooleanField("groupByUserAgent", this.groupByUserAgent);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogAnalyticsInputBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogAnalyticsInputBase if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LogAnalyticsInputBase.
     */
    public static LogAnalyticsInputBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogAnalyticsInputBase deserializedLogAnalyticsInputBase = new LogAnalyticsInputBase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("blobContainerSasUri".equals(fieldName)) {
                    deserializedLogAnalyticsInputBase.blobContainerSasUri = reader.getString();
                } else if ("fromTime".equals(fieldName)) {
                    deserializedLogAnalyticsInputBase.fromTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("toTime".equals(fieldName)) {
                    deserializedLogAnalyticsInputBase.toTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("groupByThrottlePolicy".equals(fieldName)) {
                    deserializedLogAnalyticsInputBase.groupByThrottlePolicy
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("groupByOperationName".equals(fieldName)) {
                    deserializedLogAnalyticsInputBase.groupByOperationName = reader.getNullable(JsonReader::getBoolean);
                } else if ("groupByResourceName".equals(fieldName)) {
                    deserializedLogAnalyticsInputBase.groupByResourceName = reader.getNullable(JsonReader::getBoolean);
                } else if ("groupByClientApplicationId".equals(fieldName)) {
                    deserializedLogAnalyticsInputBase.groupByClientApplicationId
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("groupByUserAgent".equals(fieldName)) {
                    deserializedLogAnalyticsInputBase.groupByUserAgent = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogAnalyticsInputBase;
        });
    }
}
