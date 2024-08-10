// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appplatform.fluent.models.AppResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * Object that includes an array of App resources and a possible link for next set.
 */
@Fluent
public final class AppResourceCollection implements JsonSerializable<AppResourceCollection> {
    /*
     * Collection of App resources
     */
    private List<AppResourceInner> value;

    /*
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    private String nextLink;

    /**
     * Creates an instance of AppResourceCollection class.
     */
    public AppResourceCollection() {
    }

    /**
     * Get the value property: Collection of App resources.
     * 
     * @return the value value.
     */
    public List<AppResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of App resources.
     * 
     * @param value the value value to set.
     * @return the AppResourceCollection object itself.
     */
    public AppResourceCollection withValue(List<AppResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AppResourceCollection object itself.
     */
    public AppResourceCollection withNextLink(String nextLink) {
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
     * Reads an instance of AppResourceCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AppResourceCollection if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AppResourceCollection.
     */
    public static AppResourceCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AppResourceCollection deserializedAppResourceCollection = new AppResourceCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AppResourceInner> value = reader.readArray(reader1 -> AppResourceInner.fromJson(reader1));
                    deserializedAppResourceCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAppResourceCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAppResourceCollection;
        });
    }
}
