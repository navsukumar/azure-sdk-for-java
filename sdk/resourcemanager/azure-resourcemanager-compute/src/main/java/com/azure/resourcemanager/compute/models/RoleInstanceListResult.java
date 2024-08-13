// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.fluent.models.RoleInstanceInner;
import java.io.IOException;
import java.util.List;

/**
 * The list operation result.
 */
@Fluent
public final class RoleInstanceListResult implements JsonSerializable<RoleInstanceListResult> {
    /*
     * The list of resources.
     */
    private List<RoleInstanceInner> value;

    /*
     * The URI to fetch the next page of resources. Use this to get the next page of resources. Do this till nextLink is
     * null to fetch all the resources.
     */
    private String nextLink;

    /**
     * Creates an instance of RoleInstanceListResult class.
     */
    public RoleInstanceListResult() {
    }

    /**
     * Get the value property: The list of resources.
     * 
     * @return the value value.
     */
    public List<RoleInstanceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of resources.
     * 
     * @param value the value value to set.
     * @return the RoleInstanceListResult object itself.
     */
    public RoleInstanceListResult withValue(List<RoleInstanceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of resources. Use this to get the next page of
     * resources. Do this till nextLink is null to fetch all the resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of resources. Use this to get the next page of
     * resources. Do this till nextLink is null to fetch all the resources.
     * 
     * @param nextLink the nextLink value to set.
     * @return the RoleInstanceListResult object itself.
     */
    public RoleInstanceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
                .log(new IllegalArgumentException("Missing required property value in model RoleInstanceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoleInstanceListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleInstanceListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleInstanceListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RoleInstanceListResult.
     */
    public static RoleInstanceListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleInstanceListResult deserializedRoleInstanceListResult = new RoleInstanceListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RoleInstanceInner> value = reader.readArray(reader1 -> RoleInstanceInner.fromJson(reader1));
                    deserializedRoleInstanceListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedRoleInstanceListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleInstanceListResult;
        });
    }
}
