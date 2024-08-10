// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the PrivateLinkServiceConnection.
 */
@Fluent
public final class PrivateLinkServiceConnectionProperties
    implements JsonSerializable<PrivateLinkServiceConnectionProperties> {
    /*
     * The provisioning state of the private link service connection resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The resource id of private link service.
     */
    private String privateLinkServiceId;

    /*
     * The ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to.
     */
    private List<String> groupIds;

    /*
     * A message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     */
    private String requestMessage;

    /*
     * A collection of read-only information about the state of the connection to the remote resource.
     */
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * Creates an instance of PrivateLinkServiceConnectionProperties class.
     */
    public PrivateLinkServiceConnectionProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the private link service connection resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateLinkServiceId property: The resource id of private link service.
     * 
     * @return the privateLinkServiceId value.
     */
    public String privateLinkServiceId() {
        return this.privateLinkServiceId;
    }

    /**
     * Set the privateLinkServiceId property: The resource id of private link service.
     * 
     * @param privateLinkServiceId the privateLinkServiceId value to set.
     * @return the PrivateLinkServiceConnectionProperties object itself.
     */
    public PrivateLinkServiceConnectionProperties withPrivateLinkServiceId(String privateLinkServiceId) {
        this.privateLinkServiceId = privateLinkServiceId;
        return this;
    }

    /**
     * Get the groupIds property: The ID(s) of the group(s) obtained from the remote resource that this private endpoint
     * should connect to.
     * 
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Set the groupIds property: The ID(s) of the group(s) obtained from the remote resource that this private endpoint
     * should connect to.
     * 
     * @param groupIds the groupIds value to set.
     * @return the PrivateLinkServiceConnectionProperties object itself.
     */
    public PrivateLinkServiceConnectionProperties withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    /**
     * Get the requestMessage property: A message passed to the owner of the remote resource with this connection
     * request. Restricted to 140 chars.
     * 
     * @return the requestMessage value.
     */
    public String requestMessage() {
        return this.requestMessage;
    }

    /**
     * Set the requestMessage property: A message passed to the owner of the remote resource with this connection
     * request. Restricted to 140 chars.
     * 
     * @param requestMessage the requestMessage value to set.
     * @return the PrivateLinkServiceConnectionProperties object itself.
     */
    public PrivateLinkServiceConnectionProperties withRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: A collection of read-only information about the state of the
     * connection to the remote resource.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: A collection of read-only information about the state of the
     * connection to the remote resource.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateLinkServiceConnectionProperties object itself.
     */
    public PrivateLinkServiceConnectionProperties
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
        jsonWriter.writeStringField("privateLinkServiceId", this.privateLinkServiceId);
        jsonWriter.writeArrayField("groupIds", this.groupIds, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("requestMessage", this.requestMessage);
        jsonWriter.writeJsonField("privateLinkServiceConnectionState", this.privateLinkServiceConnectionState);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkServiceConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkServiceConnectionProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkServiceConnectionProperties.
     */
    public static PrivateLinkServiceConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkServiceConnectionProperties deserializedPrivateLinkServiceConnectionProperties
                = new PrivateLinkServiceConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("privateLinkServiceId".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionProperties.privateLinkServiceId = reader.getString();
                } else if ("groupIds".equals(fieldName)) {
                    List<String> groupIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateLinkServiceConnectionProperties.groupIds = groupIds;
                } else if ("requestMessage".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionProperties.requestMessage = reader.getString();
                } else if ("privateLinkServiceConnectionState".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionProperties.privateLinkServiceConnectionState
                        = PrivateLinkServiceConnectionState.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkServiceConnectionProperties;
        });
    }
}
