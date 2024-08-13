// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Description of metrics specification.
 */
@Fluent
public final class MetricSpecification implements JsonSerializable<MetricSpecification> {
    /*
     * The name of the metric.
     */
    private String name;

    /*
     * The display name of the metric.
     */
    private String displayName;

    /*
     * The description of the metric.
     */
    private String displayDescription;

    /*
     * Units the metric to be displayed in.
     */
    private String unit;

    /*
     * The aggregation type.
     */
    private String aggregationType;

    /*
     * List of availability.
     */
    private List<Availability> availabilities;

    /*
     * Whether regional MDM account enabled.
     */
    private Boolean enableRegionalMdmAccount;

    /*
     * Whether gaps would be filled with zeros.
     */
    private Boolean fillGapWithZero;

    /*
     * Pattern for the filter of the metric.
     */
    private String metricFilterPattern;

    /*
     * List of dimensions.
     */
    private List<Dimension> dimensions;

    /*
     * Whether the metric is internal.
     */
    private Boolean isInternal;

    /*
     * The source MDM account.
     */
    private String sourceMdmAccount;

    /*
     * The source MDM namespace.
     */
    private String sourceMdmNamespace;

    /*
     * The resource Id dimension name override.
     */
    private String resourceIdDimensionNameOverride;

    /**
     * Creates an instance of MetricSpecification class.
     */
    public MetricSpecification() {
    }

    /**
     * Get the name property: The name of the metric.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric.
     * 
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The display name of the metric.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the metric.
     * 
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: The description of the metric.
     * 
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: The description of the metric.
     * 
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: Units the metric to be displayed in.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Units the metric to be displayed in.
     * 
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: The aggregation type.
     * 
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: The aggregation type.
     * 
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the availabilities property: List of availability.
     * 
     * @return the availabilities value.
     */
    public List<Availability> availabilities() {
        return this.availabilities;
    }

    /**
     * Set the availabilities property: List of availability.
     * 
     * @param availabilities the availabilities value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAvailabilities(List<Availability> availabilities) {
        this.availabilities = availabilities;
        return this;
    }

    /**
     * Get the enableRegionalMdmAccount property: Whether regional MDM account enabled.
     * 
     * @return the enableRegionalMdmAccount value.
     */
    public Boolean enableRegionalMdmAccount() {
        return this.enableRegionalMdmAccount;
    }

    /**
     * Set the enableRegionalMdmAccount property: Whether regional MDM account enabled.
     * 
     * @param enableRegionalMdmAccount the enableRegionalMdmAccount value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withEnableRegionalMdmAccount(Boolean enableRegionalMdmAccount) {
        this.enableRegionalMdmAccount = enableRegionalMdmAccount;
        return this;
    }

    /**
     * Get the fillGapWithZero property: Whether gaps would be filled with zeros.
     * 
     * @return the fillGapWithZero value.
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the fillGapWithZero property: Whether gaps would be filled with zeros.
     * 
     * @param fillGapWithZero the fillGapWithZero value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the metricFilterPattern property: Pattern for the filter of the metric.
     * 
     * @return the metricFilterPattern value.
     */
    public String metricFilterPattern() {
        return this.metricFilterPattern;
    }

    /**
     * Set the metricFilterPattern property: Pattern for the filter of the metric.
     * 
     * @param metricFilterPattern the metricFilterPattern value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withMetricFilterPattern(String metricFilterPattern) {
        this.metricFilterPattern = metricFilterPattern;
        return this;
    }

    /**
     * Get the dimensions property: List of dimensions.
     * 
     * @return the dimensions value.
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: List of dimensions.
     * 
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the isInternal property: Whether the metric is internal.
     * 
     * @return the isInternal value.
     */
    public Boolean isInternal() {
        return this.isInternal;
    }

    /**
     * Set the isInternal property: Whether the metric is internal.
     * 
     * @param isInternal the isInternal value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    /**
     * Get the sourceMdmAccount property: The source MDM account.
     * 
     * @return the sourceMdmAccount value.
     */
    public String sourceMdmAccount() {
        return this.sourceMdmAccount;
    }

    /**
     * Set the sourceMdmAccount property: The source MDM account.
     * 
     * @param sourceMdmAccount the sourceMdmAccount value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmAccount(String sourceMdmAccount) {
        this.sourceMdmAccount = sourceMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmNamespace property: The source MDM namespace.
     * 
     * @return the sourceMdmNamespace value.
     */
    public String sourceMdmNamespace() {
        return this.sourceMdmNamespace;
    }

    /**
     * Set the sourceMdmNamespace property: The source MDM namespace.
     * 
     * @param sourceMdmNamespace the sourceMdmNamespace value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmNamespace(String sourceMdmNamespace) {
        this.sourceMdmNamespace = sourceMdmNamespace;
        return this;
    }

    /**
     * Get the resourceIdDimensionNameOverride property: The resource Id dimension name override.
     * 
     * @return the resourceIdDimensionNameOverride value.
     */
    public String resourceIdDimensionNameOverride() {
        return this.resourceIdDimensionNameOverride;
    }

    /**
     * Set the resourceIdDimensionNameOverride property: The resource Id dimension name override.
     * 
     * @param resourceIdDimensionNameOverride the resourceIdDimensionNameOverride value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withResourceIdDimensionNameOverride(String resourceIdDimensionNameOverride) {
        this.resourceIdDimensionNameOverride = resourceIdDimensionNameOverride;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availabilities() != null) {
            availabilities().forEach(e -> e.validate());
        }
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("displayDescription", this.displayDescription);
        jsonWriter.writeStringField("unit", this.unit);
        jsonWriter.writeStringField("aggregationType", this.aggregationType);
        jsonWriter.writeArrayField("availabilities", this.availabilities,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("enableRegionalMdmAccount", this.enableRegionalMdmAccount);
        jsonWriter.writeBooleanField("fillGapWithZero", this.fillGapWithZero);
        jsonWriter.writeStringField("metricFilterPattern", this.metricFilterPattern);
        jsonWriter.writeArrayField("dimensions", this.dimensions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("isInternal", this.isInternal);
        jsonWriter.writeStringField("sourceMdmAccount", this.sourceMdmAccount);
        jsonWriter.writeStringField("sourceMdmNamespace", this.sourceMdmNamespace);
        jsonWriter.writeStringField("resourceIdDimensionNameOverride", this.resourceIdDimensionNameOverride);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricSpecification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricSpecification if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetricSpecification.
     */
    public static MetricSpecification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricSpecification deserializedMetricSpecification = new MetricSpecification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMetricSpecification.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedMetricSpecification.displayName = reader.getString();
                } else if ("displayDescription".equals(fieldName)) {
                    deserializedMetricSpecification.displayDescription = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedMetricSpecification.unit = reader.getString();
                } else if ("aggregationType".equals(fieldName)) {
                    deserializedMetricSpecification.aggregationType = reader.getString();
                } else if ("availabilities".equals(fieldName)) {
                    List<Availability> availabilities = reader.readArray(reader1 -> Availability.fromJson(reader1));
                    deserializedMetricSpecification.availabilities = availabilities;
                } else if ("enableRegionalMdmAccount".equals(fieldName)) {
                    deserializedMetricSpecification.enableRegionalMdmAccount
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("fillGapWithZero".equals(fieldName)) {
                    deserializedMetricSpecification.fillGapWithZero = reader.getNullable(JsonReader::getBoolean);
                } else if ("metricFilterPattern".equals(fieldName)) {
                    deserializedMetricSpecification.metricFilterPattern = reader.getString();
                } else if ("dimensions".equals(fieldName)) {
                    List<Dimension> dimensions = reader.readArray(reader1 -> Dimension.fromJson(reader1));
                    deserializedMetricSpecification.dimensions = dimensions;
                } else if ("isInternal".equals(fieldName)) {
                    deserializedMetricSpecification.isInternal = reader.getNullable(JsonReader::getBoolean);
                } else if ("sourceMdmAccount".equals(fieldName)) {
                    deserializedMetricSpecification.sourceMdmAccount = reader.getString();
                } else if ("sourceMdmNamespace".equals(fieldName)) {
                    deserializedMetricSpecification.sourceMdmNamespace = reader.getString();
                } else if ("resourceIdDimensionNameOverride".equals(fieldName)) {
                    deserializedMetricSpecification.resourceIdDimensionNameOverride = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricSpecification;
        });
    }
}
