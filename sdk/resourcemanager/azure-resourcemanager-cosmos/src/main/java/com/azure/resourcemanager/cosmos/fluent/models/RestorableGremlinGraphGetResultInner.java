// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.RestorableGremlinGraphPropertiesResource;
import java.io.IOException;

/**
 * An Azure Cosmos DB Gremlin graph event.
 */
@Fluent
public final class RestorableGremlinGraphGetResultInner
    implements JsonSerializable<RestorableGremlinGraphGetResultInner> {
    /*
     * The properties of a Gremlin graph event.
     */
    private RestorableGremlinGraphProperties innerProperties;

    /*
     * The unique resource Identifier of the ARM resource.
     */
    private String id;

    /*
     * The name of the ARM resource.
     */
    private String name;

    /*
     * The type of Azure resource.
     */
    private String type;

    /**
     * Creates an instance of RestorableGremlinGraphGetResultInner class.
     */
    public RestorableGremlinGraphGetResultInner() {
    }

    /**
     * Get the innerProperties property: The properties of a Gremlin graph event.
     * 
     * @return the innerProperties value.
     */
    private RestorableGremlinGraphProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: The unique resource Identifier of the ARM resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the ARM resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of Azure resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the resource property: The resource of an Azure Cosmos DB Gremlin graph event.
     * 
     * @return the resource value.
     */
    public RestorableGremlinGraphPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource of an Azure Cosmos DB Gremlin graph event.
     * 
     * @param resource the resource value to set.
     * @return the RestorableGremlinGraphGetResultInner object itself.
     */
    public RestorableGremlinGraphGetResultInner withResource(RestorableGremlinGraphPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestorableGremlinGraphProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorableGremlinGraphGetResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorableGremlinGraphGetResultInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorableGremlinGraphGetResultInner.
     */
    public static RestorableGremlinGraphGetResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorableGremlinGraphGetResultInner deserializedRestorableGremlinGraphGetResultInner
                = new RestorableGremlinGraphGetResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedRestorableGremlinGraphGetResultInner.innerProperties
                        = RestorableGremlinGraphProperties.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    deserializedRestorableGremlinGraphGetResultInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRestorableGremlinGraphGetResultInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRestorableGremlinGraphGetResultInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorableGremlinGraphGetResultInner;
        });
    }
}
