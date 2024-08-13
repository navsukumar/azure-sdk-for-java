// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A domain name that the managed instance service needs to communicate with, along with additional details.
 */
@Immutable
public final class EndpointDependency implements JsonSerializable<EndpointDependency> {
    /*
     * The domain name of the dependency.
     */
    private String domainName;

    /*
     * The IP Addresses and Ports used when connecting to DomainName.
     */
    private List<EndpointDetail> endpointDetails;

    /**
     * Creates an instance of EndpointDependency class.
     */
    public EndpointDependency() {
    }

    /**
     * Get the domainName property: The domain name of the dependency.
     * 
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Get the endpointDetails property: The IP Addresses and Ports used when connecting to DomainName.
     * 
     * @return the endpointDetails value.
     */
    public List<EndpointDetail> endpointDetails() {
        return this.endpointDetails;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpointDetails() != null) {
            endpointDetails().forEach(e -> e.validate());
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
     * Reads an instance of EndpointDependency from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EndpointDependency if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EndpointDependency.
     */
    public static EndpointDependency fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EndpointDependency deserializedEndpointDependency = new EndpointDependency();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("domainName".equals(fieldName)) {
                    deserializedEndpointDependency.domainName = reader.getString();
                } else if ("endpointDetails".equals(fieldName)) {
                    List<EndpointDetail> endpointDetails
                        = reader.readArray(reader1 -> EndpointDetail.fromJson(reader1));
                    deserializedEndpointDependency.endpointDetails = endpointDetails;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEndpointDependency;
        });
    }
}
