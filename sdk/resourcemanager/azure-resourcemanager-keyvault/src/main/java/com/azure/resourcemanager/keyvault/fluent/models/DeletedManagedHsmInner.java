// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.keyvault.models.DeletedManagedHsmProperties;
import java.io.IOException;

/**
 * The DeletedManagedHsm model.
 */
@Fluent
public final class DeletedManagedHsmInner implements JsonSerializable<DeletedManagedHsmInner> {
    /*
     * The Azure Resource Manager resource ID for the deleted managed HSM Pool.
     */
    private String id;

    /*
     * The name of the managed HSM Pool.
     */
    private String name;

    /*
     * The resource type of the managed HSM Pool.
     */
    private String type;

    /*
     * Properties of the deleted managed HSM
     */
    private DeletedManagedHsmProperties properties;

    /**
     * Creates an instance of DeletedManagedHsmInner class.
     */
    public DeletedManagedHsmInner() {
    }

    /**
     * Get the id property: The Azure Resource Manager resource ID for the deleted managed HSM Pool.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the managed HSM Pool.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type of the managed HSM Pool.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the properties property: Properties of the deleted managed HSM.
     * 
     * @return the properties value.
     */
    public DeletedManagedHsmProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the deleted managed HSM.
     * 
     * @param properties the properties value to set.
     * @return the DeletedManagedHsmInner object itself.
     */
    public DeletedManagedHsmInner withProperties(DeletedManagedHsmProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeletedManagedHsmInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeletedManagedHsmInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeletedManagedHsmInner.
     */
    public static DeletedManagedHsmInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeletedManagedHsmInner deserializedDeletedManagedHsmInner = new DeletedManagedHsmInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDeletedManagedHsmInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDeletedManagedHsmInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDeletedManagedHsmInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDeletedManagedHsmInner.properties = DeletedManagedHsmProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeletedManagedHsmInner;
        });
    }
}
