// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Item Level target info for restore operation.
 */
@Fluent
public final class RangeBasedItemLevelRestoreCriteria extends ItemLevelRestoreCriteria {
    /*
     * Type of the specific object - used for deserializing
     */
    private String objectType = "RangeBasedItemLevelRestoreCriteria";

    /*
     * minimum value for range prefix match
     */
    private String minMatchingValue;

    /*
     * maximum value for range prefix match
     */
    private String maxMatchingValue;

    /**
     * Creates an instance of RangeBasedItemLevelRestoreCriteria class.
     */
    public RangeBasedItemLevelRestoreCriteria() {
    }

    /**
     * Get the objectType property: Type of the specific object - used for deserializing.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the minMatchingValue property: minimum value for range prefix match.
     * 
     * @return the minMatchingValue value.
     */
    public String minMatchingValue() {
        return this.minMatchingValue;
    }

    /**
     * Set the minMatchingValue property: minimum value for range prefix match.
     * 
     * @param minMatchingValue the minMatchingValue value to set.
     * @return the RangeBasedItemLevelRestoreCriteria object itself.
     */
    public RangeBasedItemLevelRestoreCriteria withMinMatchingValue(String minMatchingValue) {
        this.minMatchingValue = minMatchingValue;
        return this;
    }

    /**
     * Get the maxMatchingValue property: maximum value for range prefix match.
     * 
     * @return the maxMatchingValue value.
     */
    public String maxMatchingValue() {
        return this.maxMatchingValue;
    }

    /**
     * Set the maxMatchingValue property: maximum value for range prefix match.
     * 
     * @param maxMatchingValue the maxMatchingValue value to set.
     * @return the RangeBasedItemLevelRestoreCriteria object itself.
     */
    public RangeBasedItemLevelRestoreCriteria withMaxMatchingValue(String maxMatchingValue) {
        this.maxMatchingValue = maxMatchingValue;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("objectType", this.objectType);
        jsonWriter.writeStringField("minMatchingValue", this.minMatchingValue);
        jsonWriter.writeStringField("maxMatchingValue", this.maxMatchingValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RangeBasedItemLevelRestoreCriteria from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RangeBasedItemLevelRestoreCriteria if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RangeBasedItemLevelRestoreCriteria.
     */
    public static RangeBasedItemLevelRestoreCriteria fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RangeBasedItemLevelRestoreCriteria deserializedRangeBasedItemLevelRestoreCriteria
                = new RangeBasedItemLevelRestoreCriteria();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectType".equals(fieldName)) {
                    deserializedRangeBasedItemLevelRestoreCriteria.objectType = reader.getString();
                } else if ("minMatchingValue".equals(fieldName)) {
                    deserializedRangeBasedItemLevelRestoreCriteria.minMatchingValue = reader.getString();
                } else if ("maxMatchingValue".equals(fieldName)) {
                    deserializedRangeBasedItemLevelRestoreCriteria.maxMatchingValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRangeBasedItemLevelRestoreCriteria;
        });
    }
}
