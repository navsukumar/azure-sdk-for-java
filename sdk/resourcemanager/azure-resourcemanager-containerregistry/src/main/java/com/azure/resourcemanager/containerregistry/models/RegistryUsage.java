// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The quota usage for a container registry.
 */
@Fluent
public final class RegistryUsage implements JsonSerializable<RegistryUsage> {
    /*
     * The name of the usage.
     */
    private String name;

    /*
     * The limit of the usage.
     */
    private Long limit;

    /*
     * The current value of the usage.
     */
    private Long currentValue;

    /*
     * The unit of measurement.
     */
    private RegistryUsageUnit unit;

    /**
     * Creates an instance of RegistryUsage class.
     */
    public RegistryUsage() {
    }

    /**
     * Get the name property: The name of the usage.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the usage.
     * 
     * @param name the name value to set.
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the limit property: The limit of the usage.
     * 
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The limit of the usage.
     * 
     * @param limit the limit value to set.
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the currentValue property: The current value of the usage.
     * 
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current value of the usage.
     * 
     * @param currentValue the currentValue value to set.
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the unit property: The unit of measurement.
     * 
     * @return the unit value.
     */
    public RegistryUsageUnit unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit of measurement.
     * 
     * @param unit the unit value to set.
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withUnit(RegistryUsageUnit unit) {
        this.unit = unit;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("limit", this.limit);
        jsonWriter.writeNumberField("currentValue", this.currentValue);
        jsonWriter.writeStringField("unit", this.unit == null ? null : this.unit.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegistryUsage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegistryUsage if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RegistryUsage.
     */
    public static RegistryUsage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegistryUsage deserializedRegistryUsage = new RegistryUsage();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedRegistryUsage.name = reader.getString();
                } else if ("limit".equals(fieldName)) {
                    deserializedRegistryUsage.limit = reader.getNullable(JsonReader::getLong);
                } else if ("currentValue".equals(fieldName)) {
                    deserializedRegistryUsage.currentValue = reader.getNullable(JsonReader::getLong);
                } else if ("unit".equals(fieldName)) {
                    deserializedRegistryUsage.unit = RegistryUsageUnit.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegistryUsage;
        });
    }
}
