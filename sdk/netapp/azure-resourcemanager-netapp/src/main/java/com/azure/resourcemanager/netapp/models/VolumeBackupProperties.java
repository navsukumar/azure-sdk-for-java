// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Volume Backup Properties.
 */
@Fluent
public final class VolumeBackupProperties implements JsonSerializable<VolumeBackupProperties> {
    /*
     * Backup Policy Resource ID
     */
    private String backupPolicyId;

    /*
     * Policy Enforced
     */
    private Boolean policyEnforced;

    /*
     * Backup Vault Resource ID
     */
    private String backupVaultId;

    /**
     * Creates an instance of VolumeBackupProperties class.
     */
    public VolumeBackupProperties() {
    }

    /**
     * Get the backupPolicyId property: Backup Policy Resource ID.
     * 
     * @return the backupPolicyId value.
     */
    public String backupPolicyId() {
        return this.backupPolicyId;
    }

    /**
     * Set the backupPolicyId property: Backup Policy Resource ID.
     * 
     * @param backupPolicyId the backupPolicyId value to set.
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
        return this;
    }

    /**
     * Get the policyEnforced property: Policy Enforced.
     * 
     * @return the policyEnforced value.
     */
    public Boolean policyEnforced() {
        return this.policyEnforced;
    }

    /**
     * Set the policyEnforced property: Policy Enforced.
     * 
     * @param policyEnforced the policyEnforced value to set.
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withPolicyEnforced(Boolean policyEnforced) {
        this.policyEnforced = policyEnforced;
        return this;
    }

    /**
     * Get the backupVaultId property: Backup Vault Resource ID.
     * 
     * @return the backupVaultId value.
     */
    public String backupVaultId() {
        return this.backupVaultId;
    }

    /**
     * Set the backupVaultId property: Backup Vault Resource ID.
     * 
     * @param backupVaultId the backupVaultId value to set.
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withBackupVaultId(String backupVaultId) {
        this.backupVaultId = backupVaultId;
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
        jsonWriter.writeStringField("backupPolicyId", this.backupPolicyId);
        jsonWriter.writeBooleanField("policyEnforced", this.policyEnforced);
        jsonWriter.writeStringField("backupVaultId", this.backupVaultId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumeBackupProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumeBackupProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VolumeBackupProperties.
     */
    public static VolumeBackupProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumeBackupProperties deserializedVolumeBackupProperties = new VolumeBackupProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backupPolicyId".equals(fieldName)) {
                    deserializedVolumeBackupProperties.backupPolicyId = reader.getString();
                } else if ("policyEnforced".equals(fieldName)) {
                    deserializedVolumeBackupProperties.policyEnforced = reader.getNullable(JsonReader::getBoolean);
                } else if ("backupVaultId".equals(fieldName)) {
                    deserializedVolumeBackupProperties.backupVaultId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumeBackupProperties;
        });
    }
}
