// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ApplicationResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * The list of application resources.
 */
@Fluent
public final class ApplicationResourceList implements JsonSerializable<ApplicationResourceList> {
    /*
     * The value property.
     */
    private List<ApplicationResourceInner> value;

    /*
     * URL to get the next set of application list results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of ApplicationResourceList class.
     */
    public ApplicationResourceList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<ApplicationResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the ApplicationResourceList object itself.
     */
    public ApplicationResourceList withValue(List<ApplicationResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of application list results if there are any.
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
     * Reads an instance of ApplicationResourceList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationResourceList if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationResourceList.
     */
    public static ApplicationResourceList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationResourceList deserializedApplicationResourceList = new ApplicationResourceList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ApplicationResourceInner> value
                        = reader.readArray(reader1 -> ApplicationResourceInner.fromJson(reader1));
                    deserializedApplicationResourceList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedApplicationResourceList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationResourceList;
        });
    }
}
