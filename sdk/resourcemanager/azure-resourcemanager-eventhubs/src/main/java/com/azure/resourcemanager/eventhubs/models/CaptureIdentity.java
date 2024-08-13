// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A value that indicates whether capture description is enabled.
 */
@Fluent
public final class CaptureIdentity implements JsonSerializable<CaptureIdentity> {
    /*
     * Type of Azure Active Directory Managed Identity.
     */
    private CaptureIdentityType type;

    /*
     * ARM ID of Managed User Identity. This property is required is the type is UserAssignedIdentity. If type is
     * SystemAssigned, then the System Assigned Identity Associated with the namespace will be used.
     */
    private String userAssignedIdentity;

    /**
     * Creates an instance of CaptureIdentity class.
     */
    public CaptureIdentity() {
    }

    /**
     * Get the type property: Type of Azure Active Directory Managed Identity.
     * 
     * @return the type value.
     */
    public CaptureIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of Azure Active Directory Managed Identity.
     * 
     * @param type the type value to set.
     * @return the CaptureIdentity object itself.
     */
    public CaptureIdentity withType(CaptureIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentity property: ARM ID of Managed User Identity. This property is required is the type is
     * UserAssignedIdentity. If type is SystemAssigned, then the System Assigned Identity Associated with the namespace
     * will be used.
     * 
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: ARM ID of Managed User Identity. This property is required is the type is
     * UserAssignedIdentity. If type is SystemAssigned, then the System Assigned Identity Associated with the namespace
     * will be used.
     * 
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the CaptureIdentity object itself.
     */
    public CaptureIdentity withUserAssignedIdentity(String userAssignedIdentity) {
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("userAssignedIdentity", this.userAssignedIdentity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CaptureIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CaptureIdentity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CaptureIdentity.
     */
    public static CaptureIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CaptureIdentity deserializedCaptureIdentity = new CaptureIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedCaptureIdentity.type = CaptureIdentityType.fromString(reader.getString());
                } else if ("userAssignedIdentity".equals(fieldName)) {
                    deserializedCaptureIdentity.userAssignedIdentity = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCaptureIdentity;
        });
    }
}
