// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.ManagedInstancePrivateEndpointProperty;
import com.azure.resourcemanager.sql.models.ManagedInstancePrivateLinkServiceConnectionStateProperty;
import java.io.IOException;

/**
 * Properties of a private endpoint connection.
 */
@Fluent
public final class ManagedInstancePrivateEndpointConnectionProperties
    implements JsonSerializable<ManagedInstancePrivateEndpointConnectionProperties> {
    /*
     * Private endpoint which the connection belongs to.
     */
    private ManagedInstancePrivateEndpointProperty privateEndpoint;

    /*
     * Connection State of the Private Endpoint Connection.
     */
    private ManagedInstancePrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState;

    /*
     * State of the Private Endpoint Connection.
     */
    private String provisioningState;

    /**
     * Creates an instance of ManagedInstancePrivateEndpointConnectionProperties class.
     */
    public ManagedInstancePrivateEndpointConnectionProperties() {
    }

    /**
     * Get the privateEndpoint property: Private endpoint which the connection belongs to.
     * 
     * @return the privateEndpoint value.
     */
    public ManagedInstancePrivateEndpointProperty privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: Private endpoint which the connection belongs to.
     * 
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the ManagedInstancePrivateEndpointConnectionProperties object itself.
     */
    public ManagedInstancePrivateEndpointConnectionProperties
        withPrivateEndpoint(ManagedInstancePrivateEndpointProperty privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Connection State of the Private Endpoint Connection.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public ManagedInstancePrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Connection State of the Private Endpoint Connection.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the ManagedInstancePrivateEndpointConnectionProperties object itself.
     */
    public ManagedInstancePrivateEndpointConnectionProperties withPrivateLinkServiceConnectionState(
        ManagedInstancePrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: State of the Private Endpoint Connection.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("privateEndpoint", this.privateEndpoint);
        jsonWriter.writeJsonField("privateLinkServiceConnectionState", this.privateLinkServiceConnectionState);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedInstancePrivateEndpointConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedInstancePrivateEndpointConnectionProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedInstancePrivateEndpointConnectionProperties.
     */
    public static ManagedInstancePrivateEndpointConnectionProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedInstancePrivateEndpointConnectionProperties deserializedManagedInstancePrivateEndpointConnectionProperties
                = new ManagedInstancePrivateEndpointConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateEndpoint".equals(fieldName)) {
                    deserializedManagedInstancePrivateEndpointConnectionProperties.privateEndpoint
                        = ManagedInstancePrivateEndpointProperty.fromJson(reader);
                } else if ("privateLinkServiceConnectionState".equals(fieldName)) {
                    deserializedManagedInstancePrivateEndpointConnectionProperties.privateLinkServiceConnectionState
                        = ManagedInstancePrivateLinkServiceConnectionStateProperty.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedManagedInstancePrivateEndpointConnectionProperties.provisioningState
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedInstancePrivateEndpointConnectionProperties;
        });
    }
}
