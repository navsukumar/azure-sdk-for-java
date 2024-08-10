// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.keyvault.fluent.models.PrivateEndpointConnectionProperties;
import java.io.IOException;

/**
 * Private endpoint connection item.
 */
@Fluent
public final class PrivateEndpointConnectionItem implements JsonSerializable<PrivateEndpointConnectionItem> {
    /*
     * Id of private endpoint connection.
     */
    private String id;

    /*
     * Modified whenever there is a change in the state of private endpoint connection.
     */
    private String etag;

    /*
     * Private endpoint connection properties.
     */
    private PrivateEndpointConnectionProperties innerProperties;

    /**
     * Creates an instance of PrivateEndpointConnectionItem class.
     */
    public PrivateEndpointConnectionItem() {
    }

    /**
     * Get the id property: Id of private endpoint connection.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of private endpoint connection.
     * 
     * @param id the id value to set.
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the etag property: Modified whenever there is a change in the state of private endpoint connection.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Modified whenever there is a change in the state of private endpoint connection.
     * 
     * @param etag the etag value to set.
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: Private endpoint connection properties.
     * 
     * @return the innerProperties value.
     */
    private PrivateEndpointConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the privateEndpoint property: Properties of the private endpoint object.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Set the privateEndpoint property: Properties of the private endpoint object.
     * 
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionProperties();
        }
        this.innerProperties().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Approval state of the private link connection.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: Approval state of the private link connection.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionProperties();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the private endpoint connection.
     * 
     * @return the provisioningState value.
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the private endpoint connection.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem
        withProvisioningState(PrivateEndpointConnectionProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("etag", this.etag);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointConnectionItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionItem if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionItem.
     */
    public static PrivateEndpointConnectionItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionItem deserializedPrivateEndpointConnectionItem
                = new PrivateEndpointConnectionItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionItem.id = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionItem.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionItem.innerProperties
                        = PrivateEndpointConnectionProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionItem;
        });
    }
}
