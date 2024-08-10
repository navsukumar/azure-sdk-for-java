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

/**
 * Contains the private endpoint connection requests status.
 */
@Immutable
public final class PrivateEndpointConnectionRequestStatus
    implements JsonSerializable<PrivateEndpointConnectionRequestStatus> {
    /*
     * Resource id for which the private endpoint is created.
     */
    private String privateLinkServiceId;

    /*
     * The connection name for the private endpoint.
     */
    private String privateEndpointConnectionName;

    /*
     * Status of this private endpoint connection.
     */
    private String status;

    /**
     * Creates an instance of PrivateEndpointConnectionRequestStatus class.
     */
    public PrivateEndpointConnectionRequestStatus() {
    }

    /**
     * Get the privateLinkServiceId property: Resource id for which the private endpoint is created.
     * 
     * @return the privateLinkServiceId value.
     */
    public String privateLinkServiceId() {
        return this.privateLinkServiceId;
    }

    /**
     * Get the privateEndpointConnectionName property: The connection name for the private endpoint.
     * 
     * @return the privateEndpointConnectionName value.
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * Get the status property: Status of this private endpoint connection.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointConnectionRequestStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionRequestStatus if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionRequestStatus.
     */
    public static PrivateEndpointConnectionRequestStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionRequestStatus deserializedPrivateEndpointConnectionRequestStatus
                = new PrivateEndpointConnectionRequestStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateLinkServiceId".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionRequestStatus.privateLinkServiceId = reader.getString();
                } else if ("privateEndpointConnectionName".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionRequestStatus.privateEndpointConnectionName
                        = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionRequestStatus.status = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionRequestStatus;
        });
    }
}
