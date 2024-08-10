// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Resource for a regional service location.
 */
@Immutable
public class RegionalServiceResource implements JsonSerializable<RegionalServiceResource> {
    /*
     * The regional service name.
     */
    private String name;

    /*
     * The location name.
     */
    private String location;

    /*
     * Describes the status of a service.
     */
    private ServiceStatus status;

    /**
     * Creates an instance of RegionalServiceResource class.
     */
    public RegionalServiceResource() {
    }

    /**
     * Get the name property: The regional service name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The regional service name.
     * 
     * @param name the name value to set.
     * @return the RegionalServiceResource object itself.
     */
    RegionalServiceResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location property: The location name.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location name.
     * 
     * @param location the location value to set.
     * @return the RegionalServiceResource object itself.
     */
    RegionalServiceResource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the status property: Describes the status of a service.
     * 
     * @return the status value.
     */
    public ServiceStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Describes the status of a service.
     * 
     * @param status the status value to set.
     * @return the RegionalServiceResource object itself.
     */
    RegionalServiceResource withStatus(ServiceStatus status) {
        this.status = status;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegionalServiceResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegionalServiceResource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RegionalServiceResource.
     */
    public static RegionalServiceResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegionalServiceResource deserializedRegionalServiceResource = new RegionalServiceResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedRegionalServiceResource.name = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedRegionalServiceResource.location = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedRegionalServiceResource.status = ServiceStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegionalServiceResource;
        });
    }
}
