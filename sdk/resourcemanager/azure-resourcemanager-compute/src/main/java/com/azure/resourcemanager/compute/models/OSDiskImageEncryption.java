// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Contains encryption settings for an OS disk image.
 */
@Fluent
public final class OSDiskImageEncryption extends DiskImageEncryption {
    /*
     * This property specifies the security profile of an OS disk image.
     */
    private OSDiskImageSecurityProfile securityProfile;

    /**
     * Creates an instance of OSDiskImageEncryption class.
     */
    public OSDiskImageEncryption() {
    }

    /**
     * Get the securityProfile property: This property specifies the security profile of an OS disk image.
     * 
     * @return the securityProfile value.
     */
    public OSDiskImageSecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: This property specifies the security profile of an OS disk image.
     * 
     * @param securityProfile the securityProfile value to set.
     * @return the OSDiskImageEncryption object itself.
     */
    public OSDiskImageEncryption withSecurityProfile(OSDiskImageSecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OSDiskImageEncryption withDiskEncryptionSetId(String diskEncryptionSetId) {
        super.withDiskEncryptionSetId(diskEncryptionSetId);
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
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("diskEncryptionSetId", diskEncryptionSetId());
        jsonWriter.writeJsonField("securityProfile", this.securityProfile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OSDiskImageEncryption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OSDiskImageEncryption if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OSDiskImageEncryption.
     */
    public static OSDiskImageEncryption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OSDiskImageEncryption deserializedOSDiskImageEncryption = new OSDiskImageEncryption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("diskEncryptionSetId".equals(fieldName)) {
                    deserializedOSDiskImageEncryption.withDiskEncryptionSetId(reader.getString());
                } else if ("securityProfile".equals(fieldName)) {
                    deserializedOSDiskImageEncryption.securityProfile = OSDiskImageSecurityProfile.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOSDiskImageEncryption;
        });
    }
}
