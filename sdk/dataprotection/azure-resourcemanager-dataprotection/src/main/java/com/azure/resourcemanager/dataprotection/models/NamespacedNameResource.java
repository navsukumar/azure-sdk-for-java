// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * NamespacedNameResource
 * 
 * Class to refer resources which contains namespace and name.
 */
@Fluent
public final class NamespacedNameResource implements JsonSerializable<NamespacedNameResource> {
    /*
     * Name of the resource
     */
    private String name;

    /*
     * Namespace in which the resource exists
     */
    private String namespace;

    /**
     * Creates an instance of NamespacedNameResource class.
     */
    public NamespacedNameResource() {
    }

    /**
     * Get the name property: Name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource.
     * 
     * @param name the name value to set.
     * @return the NamespacedNameResource object itself.
     */
    public NamespacedNameResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespace property: Namespace in which the resource exists.
     * 
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: Namespace in which the resource exists.
     * 
     * @param namespace the namespace value to set.
     * @return the NamespacedNameResource object itself.
     */
    public NamespacedNameResource withNamespace(String namespace) {
        this.namespace = namespace;
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
        jsonWriter.writeStringField("namespace", this.namespace);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NamespacedNameResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NamespacedNameResource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NamespacedNameResource.
     */
    public static NamespacedNameResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NamespacedNameResource deserializedNamespacedNameResource = new NamespacedNameResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedNamespacedNameResource.name = reader.getString();
                } else if ("namespace".equals(fieldName)) {
                    deserializedNamespacedNameResource.namespace = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNamespacedNameResource;
        });
    }
}
