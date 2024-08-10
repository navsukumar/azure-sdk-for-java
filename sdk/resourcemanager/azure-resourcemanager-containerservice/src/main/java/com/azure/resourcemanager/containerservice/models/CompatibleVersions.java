// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Version information about a product/service that is compatible with a service mesh revision.
 */
@Fluent
public final class CompatibleVersions implements JsonSerializable<CompatibleVersions> {
    /*
     * The product/service name.
     */
    private String name;

    /*
     * Product/service versions compatible with a service mesh add-on revision.
     */
    private List<String> versions;

    /**
     * Creates an instance of CompatibleVersions class.
     */
    public CompatibleVersions() {
    }

    /**
     * Get the name property: The product/service name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The product/service name.
     * 
     * @param name the name value to set.
     * @return the CompatibleVersions object itself.
     */
    public CompatibleVersions withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the versions property: Product/service versions compatible with a service mesh add-on revision.
     * 
     * @return the versions value.
     */
    public List<String> versions() {
        return this.versions;
    }

    /**
     * Set the versions property: Product/service versions compatible with a service mesh add-on revision.
     * 
     * @param versions the versions value to set.
     * @return the CompatibleVersions object itself.
     */
    public CompatibleVersions withVersions(List<String> versions) {
        this.versions = versions;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeArrayField("versions", this.versions, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CompatibleVersions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CompatibleVersions if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CompatibleVersions.
     */
    public static CompatibleVersions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CompatibleVersions deserializedCompatibleVersions = new CompatibleVersions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCompatibleVersions.name = reader.getString();
                } else if ("versions".equals(fieldName)) {
                    List<String> versions = reader.readArray(reader1 -> reader1.getString());
                    deserializedCompatibleVersions.versions = versions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCompatibleVersions;
        });
    }
}
