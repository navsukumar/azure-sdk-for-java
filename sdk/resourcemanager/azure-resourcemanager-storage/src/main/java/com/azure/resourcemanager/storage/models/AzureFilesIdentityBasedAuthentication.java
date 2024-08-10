// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings for Azure Files identity based authentication.
 */
@Fluent
public final class AzureFilesIdentityBasedAuthentication
    implements JsonSerializable<AzureFilesIdentityBasedAuthentication> {
    /*
     * Indicates the directory service used. Note that this enum may be extended in the future.
     */
    private DirectoryServiceOptions directoryServiceOptions;

    /*
     * Required if directoryServiceOptions are AD, optional if they are AADKERB.
     */
    private ActiveDirectoryProperties activeDirectoryProperties;

    /*
     * Default share permission for users using Kerberos authentication if RBAC role is not assigned.
     */
    private DefaultSharePermission defaultSharePermission;

    /**
     * Creates an instance of AzureFilesIdentityBasedAuthentication class.
     */
    public AzureFilesIdentityBasedAuthentication() {
    }

    /**
     * Get the directoryServiceOptions property: Indicates the directory service used. Note that this enum may be
     * extended in the future.
     * 
     * @return the directoryServiceOptions value.
     */
    public DirectoryServiceOptions directoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    /**
     * Set the directoryServiceOptions property: Indicates the directory service used. Note that this enum may be
     * extended in the future.
     * 
     * @param directoryServiceOptions the directoryServiceOptions value to set.
     * @return the AzureFilesIdentityBasedAuthentication object itself.
     */
    public AzureFilesIdentityBasedAuthentication
        withDirectoryServiceOptions(DirectoryServiceOptions directoryServiceOptions) {
        this.directoryServiceOptions = directoryServiceOptions;
        return this;
    }

    /**
     * Get the activeDirectoryProperties property: Required if directoryServiceOptions are AD, optional if they are
     * AADKERB.
     * 
     * @return the activeDirectoryProperties value.
     */
    public ActiveDirectoryProperties activeDirectoryProperties() {
        return this.activeDirectoryProperties;
    }

    /**
     * Set the activeDirectoryProperties property: Required if directoryServiceOptions are AD, optional if they are
     * AADKERB.
     * 
     * @param activeDirectoryProperties the activeDirectoryProperties value to set.
     * @return the AzureFilesIdentityBasedAuthentication object itself.
     */
    public AzureFilesIdentityBasedAuthentication
        withActiveDirectoryProperties(ActiveDirectoryProperties activeDirectoryProperties) {
        this.activeDirectoryProperties = activeDirectoryProperties;
        return this;
    }

    /**
     * Get the defaultSharePermission property: Default share permission for users using Kerberos authentication if RBAC
     * role is not assigned.
     * 
     * @return the defaultSharePermission value.
     */
    public DefaultSharePermission defaultSharePermission() {
        return this.defaultSharePermission;
    }

    /**
     * Set the defaultSharePermission property: Default share permission for users using Kerberos authentication if RBAC
     * role is not assigned.
     * 
     * @param defaultSharePermission the defaultSharePermission value to set.
     * @return the AzureFilesIdentityBasedAuthentication object itself.
     */
    public AzureFilesIdentityBasedAuthentication
        withDefaultSharePermission(DefaultSharePermission defaultSharePermission) {
        this.defaultSharePermission = defaultSharePermission;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (directoryServiceOptions() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property directoryServiceOptions in model AzureFilesIdentityBasedAuthentication"));
        }
        if (activeDirectoryProperties() != null) {
            activeDirectoryProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureFilesIdentityBasedAuthentication.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("directoryServiceOptions",
            this.directoryServiceOptions == null ? null : this.directoryServiceOptions.toString());
        jsonWriter.writeJsonField("activeDirectoryProperties", this.activeDirectoryProperties);
        jsonWriter.writeStringField("defaultSharePermission",
            this.defaultSharePermission == null ? null : this.defaultSharePermission.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFilesIdentityBasedAuthentication from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFilesIdentityBasedAuthentication if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureFilesIdentityBasedAuthentication.
     */
    public static AzureFilesIdentityBasedAuthentication fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFilesIdentityBasedAuthentication deserializedAzureFilesIdentityBasedAuthentication
                = new AzureFilesIdentityBasedAuthentication();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("directoryServiceOptions".equals(fieldName)) {
                    deserializedAzureFilesIdentityBasedAuthentication.directoryServiceOptions
                        = DirectoryServiceOptions.fromString(reader.getString());
                } else if ("activeDirectoryProperties".equals(fieldName)) {
                    deserializedAzureFilesIdentityBasedAuthentication.activeDirectoryProperties
                        = ActiveDirectoryProperties.fromJson(reader);
                } else if ("defaultSharePermission".equals(fieldName)) {
                    deserializedAzureFilesIdentityBasedAuthentication.defaultSharePermission
                        = DefaultSharePermission.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFilesIdentityBasedAuthentication;
        });
    }
}
