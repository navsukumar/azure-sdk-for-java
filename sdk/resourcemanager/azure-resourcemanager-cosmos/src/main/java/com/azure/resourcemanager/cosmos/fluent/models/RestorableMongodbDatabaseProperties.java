// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.RestorableMongodbDatabasePropertiesResource;
import java.io.IOException;

/**
 * The properties of an Azure Cosmos DB MongoDB database event.
 */
@Fluent
public final class RestorableMongodbDatabaseProperties
    implements JsonSerializable<RestorableMongodbDatabaseProperties> {
    /*
     * The resource of an Azure Cosmos DB MongoDB database event
     */
    private RestorableMongodbDatabasePropertiesResource resource;

    /**
     * Creates an instance of RestorableMongodbDatabaseProperties class.
     */
    public RestorableMongodbDatabaseProperties() {
    }

    /**
     * Get the resource property: The resource of an Azure Cosmos DB MongoDB database event.
     * 
     * @return the resource value.
     */
    public RestorableMongodbDatabasePropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource of an Azure Cosmos DB MongoDB database event.
     * 
     * @param resource the resource value to set.
     * @return the RestorableMongodbDatabaseProperties object itself.
     */
    public RestorableMongodbDatabaseProperties withResource(RestorableMongodbDatabasePropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() != null) {
            resource().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("resource", this.resource);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorableMongodbDatabaseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorableMongodbDatabaseProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorableMongodbDatabaseProperties.
     */
    public static RestorableMongodbDatabaseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorableMongodbDatabaseProperties deserializedRestorableMongodbDatabaseProperties
                = new RestorableMongodbDatabaseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resource".equals(fieldName)) {
                    deserializedRestorableMongodbDatabaseProperties.resource
                        = RestorableMongodbDatabasePropertiesResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorableMongodbDatabaseProperties;
        });
    }
}
