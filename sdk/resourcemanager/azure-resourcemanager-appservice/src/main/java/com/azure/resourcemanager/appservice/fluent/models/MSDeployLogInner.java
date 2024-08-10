// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.MSDeployLogEntry;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import java.io.IOException;
import java.util.List;

/**
 * MSDeploy log.
 */
@Fluent
public final class MSDeployLogInner extends ProxyOnlyResource {
    /*
     * MSDeployLog resource specific properties
     */
    private MSDeployLogProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of MSDeployLogInner class.
     */
    public MSDeployLogInner() {
    }

    /**
     * Get the innerProperties property: MSDeployLog resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private MSDeployLogProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MSDeployLogInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the entries property: List of log entry messages.
     * 
     * @return the entries value.
     */
    public List<MSDeployLogEntry> entries() {
        return this.innerProperties() == null ? null : this.innerProperties().entries();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MSDeployLogInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MSDeployLogInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MSDeployLogInner.
     */
    public static MSDeployLogInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MSDeployLogInner deserializedMSDeployLogInner = new MSDeployLogInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMSDeployLogInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMSDeployLogInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMSDeployLogInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedMSDeployLogInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedMSDeployLogInner.innerProperties = MSDeployLogProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMSDeployLogInner;
        });
    }
}
