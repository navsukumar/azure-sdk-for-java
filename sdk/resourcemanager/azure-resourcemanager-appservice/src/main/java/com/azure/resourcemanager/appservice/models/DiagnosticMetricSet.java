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
import java.util.List;

/**
 * Class representing Diagnostic Metric information.
 */
@Fluent
public final class DiagnosticMetricSet implements JsonSerializable<DiagnosticMetricSet> {
    /*
     * Name of the metric
     */
    private String name;

    /*
     * Metric's unit
     */
    private String unit;

    /*
     * Start time of the period
     */
    private OffsetDateTime startTime;

    /*
     * End time of the period
     */
    private OffsetDateTime endTime;

    /*
     * Presented time grain. Supported grains at the moment are PT1M, PT1H, P1D
     */
    private String timeGrain;

    /*
     * Collection of metric values for the selected period based on the
     * {Microsoft.Web.Hosting.Administration.DiagnosticMetricSet.TimeGrain}
     */
    private List<DiagnosticMetricSample> values;

    /**
     * Creates an instance of DiagnosticMetricSet class.
     */
    public DiagnosticMetricSet() {
    }

    /**
     * Get the name property: Name of the metric.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the metric.
     * 
     * @param name the name value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: Metric's unit.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Metric's unit.
     * 
     * @param unit the unit value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the startTime property: Start time of the period.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the period.
     * 
     * @param startTime the startTime value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the period.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the period.
     * 
     * @param endTime the endTime value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the timeGrain property: Presented time grain. Supported grains at the moment are PT1M, PT1H, P1D.
     * 
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: Presented time grain. Supported grains at the moment are PT1M, PT1H, P1D.
     * 
     * @param timeGrain the timeGrain value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the values property: Collection of metric values for the selected period based on the
     * {Microsoft.Web.Hosting.Administration.DiagnosticMetricSet.TimeGrain}.
     * 
     * @return the values value.
     */
    public List<DiagnosticMetricSample> values() {
        return this.values;
    }

    /**
     * Set the values property: Collection of metric values for the selected period based on the
     * {Microsoft.Web.Hosting.Administration.DiagnosticMetricSet.TimeGrain}.
     * 
     * @param values the values value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withValues(List<DiagnosticMetricSample> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("unit", this.unit);
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("endTime",
            this.endTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endTime));
        jsonWriter.writeStringField("timeGrain", this.timeGrain);
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticMetricSet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticMetricSet if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiagnosticMetricSet.
     */
    public static DiagnosticMetricSet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticMetricSet deserializedDiagnosticMetricSet = new DiagnosticMetricSet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDiagnosticMetricSet.name = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedDiagnosticMetricSet.unit = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    deserializedDiagnosticMetricSet.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedDiagnosticMetricSet.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("timeGrain".equals(fieldName)) {
                    deserializedDiagnosticMetricSet.timeGrain = reader.getString();
                } else if ("values".equals(fieldName)) {
                    List<DiagnosticMetricSample> values
                        = reader.readArray(reader1 -> DiagnosticMetricSample.fromJson(reader1));
                    deserializedDiagnosticMetricSet.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticMetricSet;
        });
    }
}
