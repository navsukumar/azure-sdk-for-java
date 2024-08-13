// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The UserAssignedIdentityProperties model.
 */
@Fluent
public final class UserAssignedIdentityProperties implements JsonSerializable<UserAssignedIdentityProperties> {
    /*
     * ARM ID of user Identity selected for encryption
     */
    private String userAssignedIdentity;

    /**
     * Creates an instance of UserAssignedIdentityProperties class.
     */
    public UserAssignedIdentityProperties() {
    }

    /**
     * Get the userAssignedIdentity property: ARM ID of user Identity selected for encryption.
     * 
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: ARM ID of user Identity selected for encryption.
     * 
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the UserAssignedIdentityProperties object itself.
     */
    public UserAssignedIdentityProperties withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
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
        jsonWriter.writeStringField("userAssignedIdentity", this.userAssignedIdentity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserAssignedIdentityProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserAssignedIdentityProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserAssignedIdentityProperties.
     */
    public static UserAssignedIdentityProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserAssignedIdentityProperties deserializedUserAssignedIdentityProperties
                = new UserAssignedIdentityProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userAssignedIdentity".equals(fieldName)) {
                    deserializedUserAssignedIdentityProperties.userAssignedIdentity = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserAssignedIdentityProperties;
        });
    }
}
