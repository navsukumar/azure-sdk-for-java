// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Request of the last detection.
 */
@Fluent
public final class MultivariateLastDetectionOptions implements JsonSerializable<MultivariateLastDetectionOptions> {

    /*
     * Contains the inference data, including the name, time stamps (ISO 8601), and
     * values of variables.
     */
    @Generated
    private final List<VariableValues> variables;

    /*
     * Number of top contributed
     * variables for one anomalous time stamp in the response. The default is
     * 10.
     */
    @Generated
    private Integer topContributorCount;

    /**
     * Creates an instance of MultivariateLastDetectionOptions class.
     *
     * @param variables the variables value to set.
     */
    @Generated
    public MultivariateLastDetectionOptions(List<VariableValues> variables) {
        this.variables = variables;
    }

    /**
     * Get the variables property: Contains the inference data, including the name, time stamps (ISO 8601), and
     * values of variables.
     *
     * @return the variables value.
     */
    @Generated
    public List<VariableValues> getVariables() {
        return this.variables;
    }

    /**
     * Get the topContributorCount property: Number of top contributed
     * variables for one anomalous time stamp in the response. The default is
     * 10.
     *
     * @return the topContributorCount value.
     */
    @Generated
    public Integer getTopContributorCount() {
        return this.topContributorCount;
    }

    /**
     * Set the topContributorCount property: Number of top contributed
     * variables for one anomalous time stamp in the response. The default is
     * 10.
     *
     * @param topContributorCount the topContributorCount value to set.
     * @return the MultivariateLastDetectionOptions object itself.
     */
    @Generated
    public MultivariateLastDetectionOptions setTopContributorCount(Integer topContributorCount) {
        this.topContributorCount = topContributorCount;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("variables", this.variables, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("topContributorCount", this.topContributorCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MultivariateLastDetectionOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MultivariateLastDetectionOptions if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MultivariateLastDetectionOptions.
     */
    @Generated
    public static MultivariateLastDetectionOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<VariableValues> variables = null;
            Integer topContributorCount = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("variables".equals(fieldName)) {
                    variables = reader.readArray(reader1 -> VariableValues.fromJson(reader1));
                } else if ("topContributorCount".equals(fieldName)) {
                    topContributorCount = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            MultivariateLastDetectionOptions deserializedMultivariateLastDetectionOptions
                = new MultivariateLastDetectionOptions(variables);
            deserializedMultivariateLastDetectionOptions.topContributorCount = topContributorCount;
            return deserializedMultivariateLastDetectionOptions;
        });
    }
}
