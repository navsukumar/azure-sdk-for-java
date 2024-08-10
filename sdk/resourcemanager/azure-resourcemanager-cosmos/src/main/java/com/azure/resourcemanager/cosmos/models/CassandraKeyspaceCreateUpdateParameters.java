// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.CassandraKeyspaceCreateUpdateProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Parameters to create and update Cosmos DB Cassandra keyspace.
 */
@Fluent
public final class CassandraKeyspaceCreateUpdateParameters extends ArmResourceProperties {
    /*
     * Properties to create and update Azure Cosmos DB Cassandra keyspace.
     */
    private CassandraKeyspaceCreateUpdateProperties innerProperties = new CassandraKeyspaceCreateUpdateProperties();

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
     * Creates an instance of CassandraKeyspaceCreateUpdateParameters class.
     */
    public CassandraKeyspaceCreateUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties to create and update Azure Cosmos DB Cassandra keyspace.
     * 
     * @return the innerProperties value.
     */
    private CassandraKeyspaceCreateUpdateProperties innerProperties() {
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
    public CassandraKeyspaceCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CassandraKeyspaceCreateUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The standard JSON format of a Cassandra keyspace.
     * 
     * @return the resource value.
     */
    public CassandraKeyspaceResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a Cassandra keyspace.
     * 
     * @param resource the resource value to set.
     * @return the CassandraKeyspaceCreateUpdateParameters object itself.
     */
    public CassandraKeyspaceCreateUpdateParameters withResource(CassandraKeyspaceResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CassandraKeyspaceCreateUpdateProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @param options the options value to set.
     * @return the CassandraKeyspaceCreateUpdateParameters object itself.
     */
    public CassandraKeyspaceCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CassandraKeyspaceCreateUpdateProperties();
        }
        this.innerProperties().withOptions(options);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model CassandraKeyspaceCreateUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CassandraKeyspaceCreateUpdateParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CassandraKeyspaceCreateUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CassandraKeyspaceCreateUpdateParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CassandraKeyspaceCreateUpdateParameters.
     */
    public static CassandraKeyspaceCreateUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CassandraKeyspaceCreateUpdateParameters deserializedCassandraKeyspaceCreateUpdateParameters
                = new CassandraKeyspaceCreateUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCassandraKeyspaceCreateUpdateParameters.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCassandraKeyspaceCreateUpdateParameters.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCassandraKeyspaceCreateUpdateParameters.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedCassandraKeyspaceCreateUpdateParameters.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedCassandraKeyspaceCreateUpdateParameters.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedCassandraKeyspaceCreateUpdateParameters.innerProperties
                        = CassandraKeyspaceCreateUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCassandraKeyspaceCreateUpdateParameters;
        });
    }
}
