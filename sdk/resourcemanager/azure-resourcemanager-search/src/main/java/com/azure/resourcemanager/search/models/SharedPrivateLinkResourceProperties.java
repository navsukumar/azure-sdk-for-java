// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the properties of an existing Shared Private Link Resource managed by the search service.
 */
@Fluent
public final class SharedPrivateLinkResourceProperties
    implements JsonSerializable<SharedPrivateLinkResourceProperties> {
    /*
     * The resource id of the resource the shared private link resource is for.
     */
    private String privateLinkResourceId;

    /*
     * The group id from the provider of resource the shared private link resource is for.
     */
    private String groupId;

    /*
     * The request message for requesting approval of the shared private link resource.
     */
    private String requestMessage;

    /*
     * Optional. Can be used to specify the Azure Resource Manager location of the resource to which a shared private
     * link is to be created. This is only required for those resources whose DNS configuration are regional (such as
     * Azure Kubernetes Service).
     */
    private String resourceRegion;

    /*
     * Status of the shared private link resource. Valid values are Pending, Approved, Rejected or Disconnected.
     */
    private SharedPrivateLinkResourceStatus status;

    /*
     * The provisioning state of the shared private link resource. Valid values are Updating, Deleting, Failed,
     * Succeeded or Incomplete.
     */
    private SharedPrivateLinkResourceProvisioningState provisioningState;

    /**
     * Creates an instance of SharedPrivateLinkResourceProperties class.
     */
    public SharedPrivateLinkResourceProperties() {
    }

    /**
     * Get the privateLinkResourceId property: The resource id of the resource the shared private link resource is for.
     * 
     * @return the privateLinkResourceId value.
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Set the privateLinkResourceId property: The resource id of the resource the shared private link resource is for.
     * 
     * @param privateLinkResourceId the privateLinkResourceId value to set.
     * @return the SharedPrivateLinkResourceProperties object itself.
     */
    public SharedPrivateLinkResourceProperties withPrivateLinkResourceId(String privateLinkResourceId) {
        this.privateLinkResourceId = privateLinkResourceId;
        return this;
    }

    /**
     * Get the groupId property: The group id from the provider of resource the shared private link resource is for.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The group id from the provider of resource the shared private link resource is for.
     * 
     * @param groupId the groupId value to set.
     * @return the SharedPrivateLinkResourceProperties object itself.
     */
    public SharedPrivateLinkResourceProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the requestMessage property: The request message for requesting approval of the shared private link resource.
     * 
     * @return the requestMessage value.
     */
    public String requestMessage() {
        return this.requestMessage;
    }

    /**
     * Set the requestMessage property: The request message for requesting approval of the shared private link resource.
     * 
     * @param requestMessage the requestMessage value to set.
     * @return the SharedPrivateLinkResourceProperties object itself.
     */
    public SharedPrivateLinkResourceProperties withRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
        return this;
    }

    /**
     * Get the resourceRegion property: Optional. Can be used to specify the Azure Resource Manager location of the
     * resource to which a shared private link is to be created. This is only required for those resources whose DNS
     * configuration are regional (such as Azure Kubernetes Service).
     * 
     * @return the resourceRegion value.
     */
    public String resourceRegion() {
        return this.resourceRegion;
    }

    /**
     * Set the resourceRegion property: Optional. Can be used to specify the Azure Resource Manager location of the
     * resource to which a shared private link is to be created. This is only required for those resources whose DNS
     * configuration are regional (such as Azure Kubernetes Service).
     * 
     * @param resourceRegion the resourceRegion value to set.
     * @return the SharedPrivateLinkResourceProperties object itself.
     */
    public SharedPrivateLinkResourceProperties withResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
        return this;
    }

    /**
     * Get the status property: Status of the shared private link resource. Valid values are Pending, Approved, Rejected
     * or Disconnected.
     * 
     * @return the status value.
     */
    public SharedPrivateLinkResourceStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the shared private link resource. Valid values are Pending, Approved, Rejected
     * or Disconnected.
     * 
     * @param status the status value to set.
     * @return the SharedPrivateLinkResourceProperties object itself.
     */
    public SharedPrivateLinkResourceProperties withStatus(SharedPrivateLinkResourceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the shared private link resource. Valid values are
     * Updating, Deleting, Failed, Succeeded or Incomplete.
     * 
     * @return the provisioningState value.
     */
    public SharedPrivateLinkResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the shared private link resource. Valid values are
     * Updating, Deleting, Failed, Succeeded or Incomplete.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the SharedPrivateLinkResourceProperties object itself.
     */
    public SharedPrivateLinkResourceProperties
        withProvisioningState(SharedPrivateLinkResourceProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
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
        jsonWriter.writeStringField("privateLinkResourceId", this.privateLinkResourceId);
        jsonWriter.writeStringField("groupId", this.groupId);
        jsonWriter.writeStringField("requestMessage", this.requestMessage);
        jsonWriter.writeStringField("resourceRegion", this.resourceRegion);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharedPrivateLinkResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharedPrivateLinkResourceProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SharedPrivateLinkResourceProperties.
     */
    public static SharedPrivateLinkResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharedPrivateLinkResourceProperties deserializedSharedPrivateLinkResourceProperties
                = new SharedPrivateLinkResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateLinkResourceId".equals(fieldName)) {
                    deserializedSharedPrivateLinkResourceProperties.privateLinkResourceId = reader.getString();
                } else if ("groupId".equals(fieldName)) {
                    deserializedSharedPrivateLinkResourceProperties.groupId = reader.getString();
                } else if ("requestMessage".equals(fieldName)) {
                    deserializedSharedPrivateLinkResourceProperties.requestMessage = reader.getString();
                } else if ("resourceRegion".equals(fieldName)) {
                    deserializedSharedPrivateLinkResourceProperties.resourceRegion = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedSharedPrivateLinkResourceProperties.status
                        = SharedPrivateLinkResourceStatus.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedSharedPrivateLinkResourceProperties.provisioningState
                        = SharedPrivateLinkResourceProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSharedPrivateLinkResourceProperties;
        });
    }
}
