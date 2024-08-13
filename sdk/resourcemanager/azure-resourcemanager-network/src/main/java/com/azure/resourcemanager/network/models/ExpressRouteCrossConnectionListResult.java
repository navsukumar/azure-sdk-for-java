// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCrossConnectionInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListExpressRouteCrossConnection API service call.
 */
@Fluent
public final class ExpressRouteCrossConnectionListResult
    implements JsonSerializable<ExpressRouteCrossConnectionListResult> {
    /*
     * A list of ExpressRouteCrossConnection resources.
     */
    private List<ExpressRouteCrossConnectionInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ExpressRouteCrossConnectionListResult class.
     */
    public ExpressRouteCrossConnectionListResult() {
    }

    /**
     * Get the value property: A list of ExpressRouteCrossConnection resources.
     * 
     * @return the value value.
     */
    public List<ExpressRouteCrossConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of ExpressRouteCrossConnection resources.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteCrossConnectionListResult object itself.
     */
    public ExpressRouteCrossConnectionListResult withValue(List<ExpressRouteCrossConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
     * Reads an instance of ExpressRouteCrossConnectionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteCrossConnectionListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRouteCrossConnectionListResult.
     */
    public static ExpressRouteCrossConnectionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteCrossConnectionListResult deserializedExpressRouteCrossConnectionListResult
                = new ExpressRouteCrossConnectionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ExpressRouteCrossConnectionInner> value
                        = reader.readArray(reader1 -> ExpressRouteCrossConnectionInner.fromJson(reader1));
                    deserializedExpressRouteCrossConnectionListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteCrossConnectionListResult;
        });
    }
}
