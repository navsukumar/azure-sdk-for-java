// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.fluent.models.ArmDisasterRecoveryInner;
import java.io.IOException;
import java.util.List;

/**
 * The result of the List Alias(Disaster Recovery configuration) operation.
 */
@Fluent
public final class ArmDisasterRecoveryListResult implements JsonSerializable<ArmDisasterRecoveryListResult> {
    /*
     * List of Alias(Disaster Recovery configurations)
     */
    private List<ArmDisasterRecoveryInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete list of Alias(Disaster Recovery
     * configuration)
     */
    private String nextLink;

    /**
     * Creates an instance of ArmDisasterRecoveryListResult class.
     */
    public ArmDisasterRecoveryListResult() {
    }

    /**
     * Get the value property: List of Alias(Disaster Recovery configurations).
     * 
     * @return the value value.
     */
    public List<ArmDisasterRecoveryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Alias(Disaster Recovery configurations).
     * 
     * @param value the value value to set.
     * @return the ArmDisasterRecoveryListResult object itself.
     */
    public ArmDisasterRecoveryListResult withValue(List<ArmDisasterRecoveryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Alias(Disaster Recovery configuration).
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArmDisasterRecoveryListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArmDisasterRecoveryListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArmDisasterRecoveryListResult.
     */
    public static ArmDisasterRecoveryListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArmDisasterRecoveryListResult deserializedArmDisasterRecoveryListResult
                = new ArmDisasterRecoveryListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ArmDisasterRecoveryInner> value
                        = reader.readArray(reader1 -> ArmDisasterRecoveryInner.fromJson(reader1));
                    deserializedArmDisasterRecoveryListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedArmDisasterRecoveryListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArmDisasterRecoveryListResult;
        });
    }
}
