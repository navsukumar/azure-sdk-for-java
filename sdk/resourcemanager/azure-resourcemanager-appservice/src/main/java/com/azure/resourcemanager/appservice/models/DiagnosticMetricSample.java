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
 * Class representing Diagnostic Metric.
 */
@Fluent
public final class DiagnosticMetricSample implements JsonSerializable<DiagnosticMetricSample> {
    /*
     * Time at which metric is measured
     */
    private OffsetDateTime timestamp;

    /*
     * Role Instance. Null if this counter is not per instance
     * This is returned and should be whichever instance name we desire to be returned
     * i.e. CPU and Memory return RDWORKERNAME (LargeDed..._IN_0)
     * where RDWORKERNAME is Machine name below and RoleInstance name in parenthesis
     */
    private String roleInstance;

    /*
     * Total value of the metric. If multiple measurements are made this will have sum of all.
     */
    private Double total;

    /*
     * Maximum of the metric sampled during the time period
     */
    private Double maximum;

    /*
     * Minimum of the metric sampled during the time period
     */
    private Double minimum;

    /*
     * Whether the values are aggregates across all workers or not
     */
    private Boolean isAggregated;

    /**
     * Creates an instance of DiagnosticMetricSample class.
     */
    public DiagnosticMetricSample() {
    }

    /**
     * Get the timestamp property: Time at which metric is measured.
     * 
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: Time at which metric is measured.
     * 
     * @param timestamp the timestamp value to set.
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the roleInstance property: Role Instance. Null if this counter is not per instance
     * This is returned and should be whichever instance name we desire to be returned
     * i.e. CPU and Memory return RDWORKERNAME (LargeDed..._IN_0)
     * where RDWORKERNAME is Machine name below and RoleInstance name in parenthesis.
     * 
     * @return the roleInstance value.
     */
    public String roleInstance() {
        return this.roleInstance;
    }

    /**
     * Set the roleInstance property: Role Instance. Null if this counter is not per instance
     * This is returned and should be whichever instance name we desire to be returned
     * i.e. CPU and Memory return RDWORKERNAME (LargeDed..._IN_0)
     * where RDWORKERNAME is Machine name below and RoleInstance name in parenthesis.
     * 
     * @param roleInstance the roleInstance value to set.
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withRoleInstance(String roleInstance) {
        this.roleInstance = roleInstance;
        return this;
    }

    /**
     * Get the total property: Total value of the metric. If multiple measurements are made this will have sum of all.
     * 
     * @return the total value.
     */
    public Double total() {
        return this.total;
    }

    /**
     * Set the total property: Total value of the metric. If multiple measurements are made this will have sum of all.
     * 
     * @param total the total value to set.
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Get the maximum property: Maximum of the metric sampled during the time period.
     * 
     * @return the maximum value.
     */
    public Double maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Maximum of the metric sampled during the time period.
     * 
     * @param maximum the maximum value to set.
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the minimum property: Minimum of the metric sampled during the time period.
     * 
     * @return the minimum value.
     */
    public Double minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Minimum of the metric sampled during the time period.
     * 
     * @param minimum the minimum value to set.
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the isAggregated property: Whether the values are aggregates across all workers or not.
     * 
     * @return the isAggregated value.
     */
    public Boolean isAggregated() {
        return this.isAggregated;
    }

    /**
     * Set the isAggregated property: Whether the values are aggregates across all workers or not.
     * 
     * @param isAggregated the isAggregated value to set.
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withIsAggregated(Boolean isAggregated) {
        this.isAggregated = isAggregated;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("timestamp",
            this.timestamp == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.timestamp));
        jsonWriter.writeStringField("roleInstance", this.roleInstance);
        jsonWriter.writeNumberField("total", this.total);
        jsonWriter.writeNumberField("maximum", this.maximum);
        jsonWriter.writeNumberField("minimum", this.minimum);
        jsonWriter.writeBooleanField("isAggregated", this.isAggregated);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticMetricSample from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticMetricSample if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiagnosticMetricSample.
     */
    public static DiagnosticMetricSample fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticMetricSample deserializedDiagnosticMetricSample = new DiagnosticMetricSample();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timestamp".equals(fieldName)) {
                    deserializedDiagnosticMetricSample.timestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("roleInstance".equals(fieldName)) {
                    deserializedDiagnosticMetricSample.roleInstance = reader.getString();
                } else if ("total".equals(fieldName)) {
                    deserializedDiagnosticMetricSample.total = reader.getNullable(JsonReader::getDouble);
                } else if ("maximum".equals(fieldName)) {
                    deserializedDiagnosticMetricSample.maximum = reader.getNullable(JsonReader::getDouble);
                } else if ("minimum".equals(fieldName)) {
                    deserializedDiagnosticMetricSample.minimum = reader.getNullable(JsonReader::getDouble);
                } else if ("isAggregated".equals(fieldName)) {
                    deserializedDiagnosticMetricSample.isAggregated = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticMetricSample;
        });
    }
}
