// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ManagedClusterPodIdentityProvisioningInfo model.
 */
@Fluent
public final class ManagedClusterPodIdentityProvisioningInfo
    implements JsonSerializable<ManagedClusterPodIdentityProvisioningInfo> {
    /*
     * Pod identity assignment error (if any).
     */
    private ManagedClusterPodIdentityProvisioningError error;

    /**
     * Creates an instance of ManagedClusterPodIdentityProvisioningInfo class.
     */
    public ManagedClusterPodIdentityProvisioningInfo() {
    }

    /**
     * Get the error property: Pod identity assignment error (if any).
     * 
     * @return the error value.
     */
    public ManagedClusterPodIdentityProvisioningError error() {
        return this.error;
    }

    /**
     * Set the error property: Pod identity assignment error (if any).
     * 
     * @param error the error value to set.
     * @return the ManagedClusterPodIdentityProvisioningInfo object itself.
     */
    public ManagedClusterPodIdentityProvisioningInfo withError(ManagedClusterPodIdentityProvisioningError error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterPodIdentityProvisioningInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterPodIdentityProvisioningInfo if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterPodIdentityProvisioningInfo.
     */
    public static ManagedClusterPodIdentityProvisioningInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterPodIdentityProvisioningInfo deserializedManagedClusterPodIdentityProvisioningInfo
                = new ManagedClusterPodIdentityProvisioningInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("error".equals(fieldName)) {
                    deserializedManagedClusterPodIdentityProvisioningInfo.error
                        = ManagedClusterPodIdentityProvisioningError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterPodIdentityProvisioningInfo;
        });
    }
}
