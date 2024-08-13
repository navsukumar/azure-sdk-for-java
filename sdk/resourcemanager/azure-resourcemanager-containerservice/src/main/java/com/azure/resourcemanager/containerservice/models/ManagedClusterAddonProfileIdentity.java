// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information of user assigned identity used by this add-on.
 */
@Fluent
public final class ManagedClusterAddonProfileIdentity extends UserAssignedIdentity {
    /**
     * Creates an instance of ManagedClusterAddonProfileIdentity class.
     */
    public ManagedClusterAddonProfileIdentity() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAddonProfileIdentity withResourceId(String resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAddonProfileIdentity withClientId(String clientId) {
        super.withClientId(clientId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAddonProfileIdentity withObjectId(String objectId) {
        super.withObjectId(objectId);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceId", resourceId());
        jsonWriter.writeStringField("clientId", clientId());
        jsonWriter.writeStringField("objectId", objectId());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterAddonProfileIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterAddonProfileIdentity if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterAddonProfileIdentity.
     */
    public static ManagedClusterAddonProfileIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterAddonProfileIdentity deserializedManagedClusterAddonProfileIdentity
                = new ManagedClusterAddonProfileIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedManagedClusterAddonProfileIdentity.withResourceId(reader.getString());
                } else if ("clientId".equals(fieldName)) {
                    deserializedManagedClusterAddonProfileIdentity.withClientId(reader.getString());
                } else if ("objectId".equals(fieldName)) {
                    deserializedManagedClusterAddonProfileIdentity.withObjectId(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterAddonProfileIdentity;
        });
    }
}
