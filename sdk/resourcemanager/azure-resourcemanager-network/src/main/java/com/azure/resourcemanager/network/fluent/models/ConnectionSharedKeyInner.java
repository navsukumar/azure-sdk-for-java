// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response for GetConnectionSharedKey API service call.
 */
@Fluent
public final class ConnectionSharedKeyInner extends SubResource {
    /*
     * The virtual network connection shared key value.
     */
    private String value;

    /**
     * Creates an instance of ConnectionSharedKeyInner class.
     */
    public ConnectionSharedKeyInner() {
    }

    /**
     * Get the value property: The virtual network connection shared key value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The virtual network connection shared key value.
     * 
     * @param value the value value to set.
     * @return the ConnectionSharedKeyInner object itself.
     */
    public ConnectionSharedKeyInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionSharedKeyInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model ConnectionSharedKeyInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectionSharedKeyInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionSharedKeyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionSharedKeyInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConnectionSharedKeyInner.
     */
    public static ConnectionSharedKeyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionSharedKeyInner deserializedConnectionSharedKeyInner = new ConnectionSharedKeyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedConnectionSharedKeyInner.withId(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedConnectionSharedKeyInner.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionSharedKeyInner;
        });
    }
}
