// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.privatedns.fluent.models.RecordSetInner;
import java.io.IOException;
import java.util.List;

/**
 * The response to a record set list operation.
 */
@Fluent
public final class RecordSetListResult implements JsonSerializable<RecordSetListResult> {
    /*
     * Information about the record sets in the response.
     */
    private List<RecordSetInner> value;

    /*
     * The continuation token for the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of RecordSetListResult class.
     */
    public RecordSetListResult() {
    }

    /**
     * Get the value property: Information about the record sets in the response.
     * 
     * @return the value value.
     */
    public List<RecordSetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about the record sets in the response.
     * 
     * @param value the value value to set.
     * @return the RecordSetListResult object itself.
     */
    public RecordSetListResult withValue(List<RecordSetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token for the next page of results.
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
     * Reads an instance of RecordSetListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecordSetListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecordSetListResult.
     */
    public static RecordSetListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecordSetListResult deserializedRecordSetListResult = new RecordSetListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RecordSetInner> value = reader.readArray(reader1 -> RecordSetInner.fromJson(reader1));
                    deserializedRecordSetListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedRecordSetListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecordSetListResult;
        });
    }
}
