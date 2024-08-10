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
import java.util.List;

/**
 * The List Dedicated Host sizes operation response.
 */
@Fluent
public final class DedicatedHostSizeListResult implements JsonSerializable<DedicatedHostSizeListResult> {
    /*
     * The list of dedicated host sizes.
     */
    private List<String> value;

    /**
     * Creates an instance of DedicatedHostSizeListResult class.
     */
    public DedicatedHostSizeListResult() {
    }

    /**
     * Get the value property: The list of dedicated host sizes.
     * 
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of dedicated host sizes.
     * 
     * @param value the value value to set.
     * @return the DedicatedHostSizeListResult object itself.
     */
    public DedicatedHostSizeListResult withValue(List<String> value) {
        this.value = value;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DedicatedHostSizeListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DedicatedHostSizeListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DedicatedHostSizeListResult.
     */
    public static DedicatedHostSizeListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DedicatedHostSizeListResult deserializedDedicatedHostSizeListResult = new DedicatedHostSizeListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<String> value = reader.readArray(reader1 -> reader1.getString());
                    deserializedDedicatedHostSizeListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDedicatedHostSizeListResult;
        });
    }
}
