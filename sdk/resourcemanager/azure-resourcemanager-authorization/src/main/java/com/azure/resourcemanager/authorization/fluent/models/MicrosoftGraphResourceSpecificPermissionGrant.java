// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * resourceSpecificPermissionGrant
 * 
 * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
 * entity types.
 */
@Fluent
public final class MicrosoftGraphResourceSpecificPermissionGrant extends MicrosoftGraphDirectoryObjectInner {
    /*
     * The clientAppId property.
     */
    private String clientAppId;

    /*
     * The clientId property.
     */
    private String clientId;

    /*
     * The permission property.
     */
    private String permission;

    /*
     * The permissionType property.
     */
    private String permissionType;

    /*
     * The resourceAppId property.
     */
    private String resourceAppId;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
     * entity types.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphResourceSpecificPermissionGrant class.
     */
    public MicrosoftGraphResourceSpecificPermissionGrant() {
    }

    /**
     * Get the clientAppId property: The clientAppId property.
     * 
     * @return the clientAppId value.
     */
    public String clientAppId() {
        return this.clientAppId;
    }

    /**
     * Set the clientAppId property: The clientAppId property.
     * 
     * @param clientAppId the clientAppId value to set.
     * @return the MicrosoftGraphResourceSpecificPermissionGrant object itself.
     */
    public MicrosoftGraphResourceSpecificPermissionGrant withClientAppId(String clientAppId) {
        this.clientAppId = clientAppId;
        return this;
    }

    /**
     * Get the clientId property: The clientId property.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The clientId property.
     * 
     * @param clientId the clientId value to set.
     * @return the MicrosoftGraphResourceSpecificPermissionGrant object itself.
     */
    public MicrosoftGraphResourceSpecificPermissionGrant withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the permission property: The permission property.
     * 
     * @return the permission value.
     */
    public String permission() {
        return this.permission;
    }

    /**
     * Set the permission property: The permission property.
     * 
     * @param permission the permission value to set.
     * @return the MicrosoftGraphResourceSpecificPermissionGrant object itself.
     */
    public MicrosoftGraphResourceSpecificPermissionGrant withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get the permissionType property: The permissionType property.
     * 
     * @return the permissionType value.
     */
    public String permissionType() {
        return this.permissionType;
    }

    /**
     * Set the permissionType property: The permissionType property.
     * 
     * @param permissionType the permissionType value to set.
     * @return the MicrosoftGraphResourceSpecificPermissionGrant object itself.
     */
    public MicrosoftGraphResourceSpecificPermissionGrant withPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * Get the resourceAppId property: The resourceAppId property.
     * 
     * @return the resourceAppId value.
     */
    public String resourceAppId() {
        return this.resourceAppId;
    }

    /**
     * Set the resourceAppId property: The resourceAppId property.
     * 
     * @param resourceAppId the resourceAppId value to set.
     * @return the MicrosoftGraphResourceSpecificPermissionGrant object itself.
     */
    public MicrosoftGraphResourceSpecificPermissionGrant withResourceAppId(String resourceAppId) {
        this.resourceAppId = resourceAppId;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphResourceSpecificPermissionGrant object itself.
     */
    public MicrosoftGraphResourceSpecificPermissionGrant
        withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphResourceSpecificPermissionGrant withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphResourceSpecificPermissionGrant withId(String id) {
        super.withId(id);
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("deletedDateTime",
            deletedDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(deletedDateTime()));
        jsonWriter.writeStringField("clientAppId", this.clientAppId);
        jsonWriter.writeStringField("clientId", this.clientId);
        jsonWriter.writeStringField("permission", this.permission);
        jsonWriter.writeStringField("permissionType", this.permissionType);
        jsonWriter.writeStringField("resourceAppId", this.resourceAppId);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphResourceSpecificPermissionGrant from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphResourceSpecificPermissionGrant if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphResourceSpecificPermissionGrant.
     */
    public static MicrosoftGraphResourceSpecificPermissionGrant fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphResourceSpecificPermissionGrant deserializedMicrosoftGraphResourceSpecificPermissionGrant
                = new MicrosoftGraphResourceSpecificPermissionGrant();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphResourceSpecificPermissionGrant.withId(reader.getString());
                } else if ("deletedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphResourceSpecificPermissionGrant.withDeletedDateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("clientAppId".equals(fieldName)) {
                    deserializedMicrosoftGraphResourceSpecificPermissionGrant.clientAppId = reader.getString();
                } else if ("clientId".equals(fieldName)) {
                    deserializedMicrosoftGraphResourceSpecificPermissionGrant.clientId = reader.getString();
                } else if ("permission".equals(fieldName)) {
                    deserializedMicrosoftGraphResourceSpecificPermissionGrant.permission = reader.getString();
                } else if ("permissionType".equals(fieldName)) {
                    deserializedMicrosoftGraphResourceSpecificPermissionGrant.permissionType = reader.getString();
                } else if ("resourceAppId".equals(fieldName)) {
                    deserializedMicrosoftGraphResourceSpecificPermissionGrant.resourceAppId = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphResourceSpecificPermissionGrant.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphResourceSpecificPermissionGrant;
        });
    }
}
