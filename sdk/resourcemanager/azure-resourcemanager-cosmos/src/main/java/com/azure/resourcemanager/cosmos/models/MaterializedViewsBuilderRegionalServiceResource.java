// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Resource for a regional service location.
 */
@Immutable
public final class MaterializedViewsBuilderRegionalServiceResource extends RegionalServiceResource {
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
     * Creates an instance of MaterializedViewsBuilderRegionalServiceResource class.
     */
    public MaterializedViewsBuilderRegionalServiceResource() {
    }

    /**
     * Get the name property: The regional service name.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the location property: The location name.
     * 
     * @return the location value.
     */
    @Override
    public String location() {
        return this.location;
    }

    /**
     * Get the status property: Describes the status of a service.
     * 
     * @return the status value.
     */
    @Override
    public ServiceStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
     * Reads an instance of MaterializedViewsBuilderRegionalServiceResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MaterializedViewsBuilderRegionalServiceResource if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MaterializedViewsBuilderRegionalServiceResource.
     */
    public static MaterializedViewsBuilderRegionalServiceResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MaterializedViewsBuilderRegionalServiceResource deserializedMaterializedViewsBuilderRegionalServiceResource
                = new MaterializedViewsBuilderRegionalServiceResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMaterializedViewsBuilderRegionalServiceResource.name = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedMaterializedViewsBuilderRegionalServiceResource.location = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedMaterializedViewsBuilderRegionalServiceResource.status
                        = ServiceStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMaterializedViewsBuilderRegionalServiceResource;
        });
    }
}
