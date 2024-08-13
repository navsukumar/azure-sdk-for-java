// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.MongoDBCollectionCreateUpdateProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Parameters to create and update Cosmos DB MongoDB collection.
 */
@Fluent
public final class MongoDBCollectionCreateUpdateParameters extends ArmResourceProperties {
    /*
     * Properties to create and update Azure Cosmos DB MongoDB collection.
     */
    private MongoDBCollectionCreateUpdateProperties innerProperties = new MongoDBCollectionCreateUpdateProperties();

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
     * Creates an instance of MongoDBCollectionCreateUpdateParameters class.
     */
    public MongoDBCollectionCreateUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties to create and update Azure Cosmos DB MongoDB collection.
     * 
     * @return the innerProperties value.
     */
    private MongoDBCollectionCreateUpdateProperties innerProperties() {
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
    public MongoDBCollectionCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBCollectionCreateUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The standard JSON format of a MongoDB collection.
     * 
     * @return the resource value.
     */
    public MongoDBCollectionResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a MongoDB collection.
     * 
     * @param resource the resource value to set.
     * @return the MongoDBCollectionCreateUpdateParameters object itself.
     */
    public MongoDBCollectionCreateUpdateParameters withResource(MongoDBCollectionResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoDBCollectionCreateUpdateProperties();
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
     * @return the MongoDBCollectionCreateUpdateParameters object itself.
     */
    public MongoDBCollectionCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoDBCollectionCreateUpdateProperties();
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
                    "Missing required property innerProperties in model MongoDBCollectionCreateUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDBCollectionCreateUpdateParameters.class);

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
     * Reads an instance of MongoDBCollectionCreateUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoDBCollectionCreateUpdateParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MongoDBCollectionCreateUpdateParameters.
     */
    public static MongoDBCollectionCreateUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoDBCollectionCreateUpdateParameters deserializedMongoDBCollectionCreateUpdateParameters
                = new MongoDBCollectionCreateUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMongoDBCollectionCreateUpdateParameters.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMongoDBCollectionCreateUpdateParameters.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMongoDBCollectionCreateUpdateParameters.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedMongoDBCollectionCreateUpdateParameters.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedMongoDBCollectionCreateUpdateParameters.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedMongoDBCollectionCreateUpdateParameters.innerProperties
                        = MongoDBCollectionCreateUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoDBCollectionCreateUpdateParameters;
        });
    }
}
