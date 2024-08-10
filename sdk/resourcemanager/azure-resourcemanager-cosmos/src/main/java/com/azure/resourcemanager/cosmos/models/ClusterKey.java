// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cosmos DB Cassandra table cluster key.
 */
@Fluent
public final class ClusterKey implements JsonSerializable<ClusterKey> {
    /*
     * Name of the Cosmos DB Cassandra table cluster key
     */
    private String name;

    /*
     * Order of the Cosmos DB Cassandra table cluster key, only support "Asc" and "Desc"
     */
    private String orderBy;

    /**
     * Creates an instance of ClusterKey class.
     */
    public ClusterKey() {
    }

    /**
     * Get the name property: Name of the Cosmos DB Cassandra table cluster key.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Cosmos DB Cassandra table cluster key.
     * 
     * @param name the name value to set.
     * @return the ClusterKey object itself.
     */
    public ClusterKey withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the orderBy property: Order of the Cosmos DB Cassandra table cluster key, only support "Asc" and "Desc".
     * 
     * @return the orderBy value.
     */
    public String orderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: Order of the Cosmos DB Cassandra table cluster key, only support "Asc" and "Desc".
     * 
     * @param orderBy the orderBy value to set.
     * @return the ClusterKey object itself.
     */
    public ClusterKey withOrderBy(String orderBy) {
        this.orderBy = orderBy;
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
        jsonWriter.writeStringField("orderBy", this.orderBy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterKey from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterKey if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the ClusterKey.
     */
    public static ClusterKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterKey deserializedClusterKey = new ClusterKey();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedClusterKey.name = reader.getString();
                } else if ("orderBy".equals(fieldName)) {
                    deserializedClusterKey.orderBy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterKey;
        });
    }
}
