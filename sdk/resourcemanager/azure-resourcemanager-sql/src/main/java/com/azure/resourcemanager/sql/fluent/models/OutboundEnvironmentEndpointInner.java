// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.EndpointDependency;
import java.io.IOException;
import java.util.List;

/**
 * An endpoint that the managed instance service requires outbound network access to.
 */
@Immutable
public final class OutboundEnvironmentEndpointInner implements JsonSerializable<OutboundEnvironmentEndpointInner> {
    /*
     * The type of service accessed by the managed instance service, e.g., Azure Storage, Azure Active Directory, etc.
     */
    private String category;

    /*
     * The endpoints that the managed instance service communicates with in order to function correctly.
     */
    private List<EndpointDependency> endpoints;

    /**
     * Creates an instance of OutboundEnvironmentEndpointInner class.
     */
    public OutboundEnvironmentEndpointInner() {
    }

    /**
     * Get the category property: The type of service accessed by the managed instance service, e.g., Azure Storage,
     * Azure Active Directory, etc.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Get the endpoints property: The endpoints that the managed instance service communicates with in order to
     * function correctly.
     * 
     * @return the endpoints value.
     */
    public List<EndpointDependency> endpoints() {
        return this.endpoints;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
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
     * Reads an instance of OutboundEnvironmentEndpointInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutboundEnvironmentEndpointInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OutboundEnvironmentEndpointInner.
     */
    public static OutboundEnvironmentEndpointInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OutboundEnvironmentEndpointInner deserializedOutboundEnvironmentEndpointInner
                = new OutboundEnvironmentEndpointInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("category".equals(fieldName)) {
                    deserializedOutboundEnvironmentEndpointInner.category = reader.getString();
                } else if ("endpoints".equals(fieldName)) {
                    List<EndpointDependency> endpoints
                        = reader.readArray(reader1 -> EndpointDependency.fromJson(reader1));
                    deserializedOutboundEnvironmentEndpointInner.endpoints = endpoints;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOutboundEnvironmentEndpointInner;
        });
    }
}
