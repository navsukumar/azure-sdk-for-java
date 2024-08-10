// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.MetricName;
import com.azure.resourcemanager.cosmos.models.UnitType;
import java.io.IOException;

/**
 * The usage data for a usage request.
 */
@Immutable
public class UsageInner implements JsonSerializable<UsageInner> {
    /*
     * The unit of the metric.
     */
    private UnitType unit;

    /*
     * The name information for the metric.
     */
    private MetricName name;

    /*
     * The quota period used to summarize the usage values.
     */
    private String quotaPeriod;

    /*
     * Maximum value for this metric
     */
    private Long limit;

    /*
     * Current value for this metric
     */
    private Long currentValue;

    /**
     * Creates an instance of UsageInner class.
     */
    public UsageInner() {
    }

    /**
     * Get the unit property: The unit of the metric.
     * 
     * @return the unit value.
     */
    public UnitType unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit of the metric.
     * 
     * @param unit the unit value to set.
     * @return the UsageInner object itself.
     */
    UsageInner withUnit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the name property: The name information for the metric.
     * 
     * @return the name value.
     */
    public MetricName name() {
        return this.name;
    }

    /**
     * Set the name property: The name information for the metric.
     * 
     * @param name the name value to set.
     * @return the UsageInner object itself.
     */
    UsageInner withName(MetricName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the quotaPeriod property: The quota period used to summarize the usage values.
     * 
     * @return the quotaPeriod value.
     */
    public String quotaPeriod() {
        return this.quotaPeriod;
    }

    /**
     * Set the quotaPeriod property: The quota period used to summarize the usage values.
     * 
     * @param quotaPeriod the quotaPeriod value to set.
     * @return the UsageInner object itself.
     */
    UsageInner withQuotaPeriod(String quotaPeriod) {
        this.quotaPeriod = quotaPeriod;
        return this;
    }

    /**
     * Get the limit property: Maximum value for this metric.
     * 
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: Maximum value for this metric.
     * 
     * @param limit the limit value to set.
     * @return the UsageInner object itself.
     */
    UsageInner withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the currentValue property: Current value for this metric.
     * 
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: Current value for this metric.
     * 
     * @param currentValue the currentValue value to set.
     * @return the UsageInner object itself.
     */
    UsageInner withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UsageInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsageInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the UsageInner.
     */
    public static UsageInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UsageInner deserializedUsageInner = new UsageInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("unit".equals(fieldName)) {
                    deserializedUsageInner.unit = UnitType.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedUsageInner.name = MetricName.fromJson(reader);
                } else if ("quotaPeriod".equals(fieldName)) {
                    deserializedUsageInner.quotaPeriod = reader.getString();
                } else if ("limit".equals(fieldName)) {
                    deserializedUsageInner.limit = reader.getNullable(JsonReader::getLong);
                } else if ("currentValue".equals(fieldName)) {
                    deserializedUsageInner.currentValue = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsageInner;
        });
    }
}
