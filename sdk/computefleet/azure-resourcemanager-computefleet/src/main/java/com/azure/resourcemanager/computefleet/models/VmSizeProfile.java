// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifications about a VM Size. This will also contain the corresponding rank and weight in future.
 */
@Fluent
public final class VmSizeProfile implements JsonSerializable<VmSizeProfile> {
    /*
     * The Sku name (e.g. 'Standard_DS1_v2')
     */
    private String name;

    /*
     * The rank of the VM size. This is used with 'RegularPriorityAllocationStrategy.Prioritized'
     * The lower the number, the higher the priority. Starting with 0.
     */
    private Integer rank;

    /**
     * Creates an instance of VmSizeProfile class.
     */
    public VmSizeProfile() {
    }

    /**
     * Get the name property: The Sku name (e.g. 'Standard_DS1_v2').
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The Sku name (e.g. 'Standard_DS1_v2').
     * 
     * @param name the name value to set.
     * @return the VmSizeProfile object itself.
     */
    public VmSizeProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the rank property: The rank of the VM size. This is used with 'RegularPriorityAllocationStrategy.Prioritized'
     * The lower the number, the higher the priority. Starting with 0.
     * 
     * @return the rank value.
     */
    public Integer rank() {
        return this.rank;
    }

    /**
     * Set the rank property: The rank of the VM size. This is used with 'RegularPriorityAllocationStrategy.Prioritized'
     * The lower the number, the higher the priority. Starting with 0.
     * 
     * @param rank the rank value to set.
     * @return the VmSizeProfile object itself.
     */
    public VmSizeProfile withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model VmSizeProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VmSizeProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("rank", this.rank);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VmSizeProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VmSizeProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VmSizeProfile.
     */
    public static VmSizeProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VmSizeProfile deserializedVmSizeProfile = new VmSizeProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedVmSizeProfile.name = reader.getString();
                } else if ("rank".equals(fieldName)) {
                    deserializedVmSizeProfile.rank = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVmSizeProfile;
        });
    }
}
