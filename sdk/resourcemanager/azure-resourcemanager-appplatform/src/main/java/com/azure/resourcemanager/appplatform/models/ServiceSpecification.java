// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Service specification payload.
 */
@Fluent
public final class ServiceSpecification implements JsonSerializable<ServiceSpecification> {
    /*
     * Specifications of the Log for Azure Monitoring
     */
    private List<LogSpecification> logSpecifications;

    /*
     * Specifications of the Metrics for Azure Monitoring
     */
    private List<MetricSpecification> metricSpecifications;

    /**
     * Creates an instance of ServiceSpecification class.
     */
    public ServiceSpecification() {
    }

    /**
     * Get the logSpecifications property: Specifications of the Log for Azure Monitoring.
     * 
     * @return the logSpecifications value.
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: Specifications of the Log for Azure Monitoring.
     * 
     * @param logSpecifications the logSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withLogSpecifications(List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Get the metricSpecifications property: Specifications of the Metrics for Azure Monitoring.
     * 
     * @return the metricSpecifications value.
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: Specifications of the Metrics for Azure Monitoring.
     * 
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("logSpecifications", this.logSpecifications,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("metricSpecifications", this.metricSpecifications,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceSpecification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceSpecification if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceSpecification.
     */
    public static ServiceSpecification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceSpecification deserializedServiceSpecification = new ServiceSpecification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("logSpecifications".equals(fieldName)) {
                    List<LogSpecification> logSpecifications
                        = reader.readArray(reader1 -> LogSpecification.fromJson(reader1));
                    deserializedServiceSpecification.logSpecifications = logSpecifications;
                } else if ("metricSpecifications".equals(fieldName)) {
                    List<MetricSpecification> metricSpecifications
                        = reader.readArray(reader1 -> MetricSpecification.fromJson(reader1));
                    deserializedServiceSpecification.metricSpecifications = metricSpecifications;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceSpecification;
        });
    }
}
