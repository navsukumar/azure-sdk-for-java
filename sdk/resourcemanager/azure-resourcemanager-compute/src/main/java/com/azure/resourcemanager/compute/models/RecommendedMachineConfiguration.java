// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties describe the recommended machine configuration for this Image Definition. These properties are
 * updatable.
 */
@Fluent
public final class RecommendedMachineConfiguration implements JsonSerializable<RecommendedMachineConfiguration> {
    /*
     * Describes the resource range.
     */
    private ResourceRange vCPUs;

    /*
     * Describes the resource range.
     */
    private ResourceRange memory;

    /**
     * Creates an instance of RecommendedMachineConfiguration class.
     */
    public RecommendedMachineConfiguration() {
    }

    /**
     * Get the vCPUs property: Describes the resource range.
     * 
     * @return the vCPUs value.
     */
    public ResourceRange vCPUs() {
        return this.vCPUs;
    }

    /**
     * Set the vCPUs property: Describes the resource range.
     * 
     * @param vCPUs the vCPUs value to set.
     * @return the RecommendedMachineConfiguration object itself.
     */
    public RecommendedMachineConfiguration withVCPUs(ResourceRange vCPUs) {
        this.vCPUs = vCPUs;
        return this;
    }

    /**
     * Get the memory property: Describes the resource range.
     * 
     * @return the memory value.
     */
    public ResourceRange memory() {
        return this.memory;
    }

    /**
     * Set the memory property: Describes the resource range.
     * 
     * @param memory the memory value to set.
     * @return the RecommendedMachineConfiguration object itself.
     */
    public RecommendedMachineConfiguration withMemory(ResourceRange memory) {
        this.memory = memory;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vCPUs() != null) {
            vCPUs().validate();
        }
        if (memory() != null) {
            memory().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("vCPUs", this.vCPUs);
        jsonWriter.writeJsonField("memory", this.memory);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecommendedMachineConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecommendedMachineConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecommendedMachineConfiguration.
     */
    public static RecommendedMachineConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecommendedMachineConfiguration deserializedRecommendedMachineConfiguration
                = new RecommendedMachineConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vCPUs".equals(fieldName)) {
                    deserializedRecommendedMachineConfiguration.vCPUs = ResourceRange.fromJson(reader);
                } else if ("memory".equals(fieldName)) {
                    deserializedRecommendedMachineConfiguration.memory = ResourceRange.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecommendedMachineConfiguration;
        });
    }
}
