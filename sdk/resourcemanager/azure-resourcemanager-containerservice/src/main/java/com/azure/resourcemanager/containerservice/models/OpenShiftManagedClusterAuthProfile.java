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
import java.util.List;

/**
 * Defines all possible authentication profiles for the OpenShift cluster.
 */
@Fluent
public final class OpenShiftManagedClusterAuthProfile implements JsonSerializable<OpenShiftManagedClusterAuthProfile> {
    /*
     * Type of authentication profile to use.
     */
    private List<OpenShiftManagedClusterIdentityProvider> identityProviders;

    /**
     * Creates an instance of OpenShiftManagedClusterAuthProfile class.
     */
    public OpenShiftManagedClusterAuthProfile() {
    }

    /**
     * Get the identityProviders property: Type of authentication profile to use.
     * 
     * @return the identityProviders value.
     */
    public List<OpenShiftManagedClusterIdentityProvider> identityProviders() {
        return this.identityProviders;
    }

    /**
     * Set the identityProviders property: Type of authentication profile to use.
     * 
     * @param identityProviders the identityProviders value to set.
     * @return the OpenShiftManagedClusterAuthProfile object itself.
     */
    public OpenShiftManagedClusterAuthProfile
        withIdentityProviders(List<OpenShiftManagedClusterIdentityProvider> identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identityProviders() != null) {
            identityProviders().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("identityProviders", this.identityProviders,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenShiftManagedClusterAuthProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenShiftManagedClusterAuthProfile if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OpenShiftManagedClusterAuthProfile.
     */
    public static OpenShiftManagedClusterAuthProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenShiftManagedClusterAuthProfile deserializedOpenShiftManagedClusterAuthProfile
                = new OpenShiftManagedClusterAuthProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("identityProviders".equals(fieldName)) {
                    List<OpenShiftManagedClusterIdentityProvider> identityProviders
                        = reader.readArray(reader1 -> OpenShiftManagedClusterIdentityProvider.fromJson(reader1));
                    deserializedOpenShiftManagedClusterAuthProfile.identityProviders = identityProviders;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenShiftManagedClusterAuthProfile;
        });
    }
}
