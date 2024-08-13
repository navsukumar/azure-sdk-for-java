// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.PercentileMetricInner;
import java.io.IOException;
import java.util.List;

/**
 * The response to a list percentile metrics request.
 */
@Immutable
public final class PercentileMetricListResult implements JsonSerializable<PercentileMetricListResult> {
    /*
     * The list of percentile metrics for the account.
     */
    private List<PercentileMetricInner> value;

    /**
     * Creates an instance of PercentileMetricListResult class.
     */
    public PercentileMetricListResult() {
    }

    /**
     * Get the value property: The list of percentile metrics for the account.
     * 
     * @return the value value.
     */
    public List<PercentileMetricInner> value() {
        return this.value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PercentileMetricListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PercentileMetricListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PercentileMetricListResult.
     */
    public static PercentileMetricListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PercentileMetricListResult deserializedPercentileMetricListResult = new PercentileMetricListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PercentileMetricInner> value
                        = reader.readArray(reader1 -> PercentileMetricInner.fromJson(reader1));
                    deserializedPercentileMetricListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPercentileMetricListResult;
        });
    }
}
