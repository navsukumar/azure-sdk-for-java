// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.fluent.models.UsageInner;
import java.io.IOException;
import java.util.List;

/**
 * The ListUsagesResult model.
 */
@Fluent
public final class ListUsagesResult implements JsonSerializable<ListUsagesResult> {
    /*
     * The list of compute resource usages.
     */
    private List<UsageInner> value;

    /*
     * The URI to fetch the next page of compute resource usage information. Call ListNext() with this to fetch the next
     * page of compute resource usage information.
     */
    private String nextLink;

    /**
     * Creates an instance of ListUsagesResult class.
     */
    public ListUsagesResult() {
    }

    /**
     * Get the value property: The list of compute resource usages.
     * 
     * @return the value value.
     */
    public List<UsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of compute resource usages.
     * 
     * @param value the value value to set.
     * @return the ListUsagesResult object itself.
     */
    public ListUsagesResult withValue(List<UsageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of compute resource usage information. Call ListNext()
     * with this to fetch the next page of compute resource usage information.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of compute resource usage information. Call ListNext()
     * with this to fetch the next page of compute resource usage information.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListUsagesResult object itself.
     */
    public ListUsagesResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ListUsagesResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListUsagesResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListUsagesResult.
     */
    public static ListUsagesResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListUsagesResult deserializedListUsagesResult = new ListUsagesResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<UsageInner> value = reader.readArray(reader1 -> UsageInner.fromJson(reader1));
                    deserializedListUsagesResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedListUsagesResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListUsagesResult;
        });
    }
}
