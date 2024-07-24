// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Backup Vault Contract for Patch Backup Vault API.
 */
@Fluent
public final class PatchBackupVaultInput implements JsonSerializable<PatchBackupVaultInput> {
    /*
     * Monitoring Settings
     */
    private MonitoringSettings monitoringSettings;

    /*
     * Security Settings
     */
    private SecuritySettings securitySettings;

    /*
     * Feature Settings
     */
    private FeatureSettings featureSettings;

    /*
     * ResourceGuardOperationRequests on which LAC check will be performed
     */
    private List<String> resourceGuardOperationRequests;

    /**
     * Creates an instance of PatchBackupVaultInput class.
     */
    public PatchBackupVaultInput() {
    }

    /**
     * Get the monitoringSettings property: Monitoring Settings.
     * 
     * @return the monitoringSettings value.
     */
    public MonitoringSettings monitoringSettings() {
        return this.monitoringSettings;
    }

    /**
     * Set the monitoringSettings property: Monitoring Settings.
     * 
     * @param monitoringSettings the monitoringSettings value to set.
     * @return the PatchBackupVaultInput object itself.
     */
    public PatchBackupVaultInput withMonitoringSettings(MonitoringSettings monitoringSettings) {
        this.monitoringSettings = monitoringSettings;
        return this;
    }

    /**
     * Get the securitySettings property: Security Settings.
     * 
     * @return the securitySettings value.
     */
    public SecuritySettings securitySettings() {
        return this.securitySettings;
    }

    /**
     * Set the securitySettings property: Security Settings.
     * 
     * @param securitySettings the securitySettings value to set.
     * @return the PatchBackupVaultInput object itself.
     */
    public PatchBackupVaultInput withSecuritySettings(SecuritySettings securitySettings) {
        this.securitySettings = securitySettings;
        return this;
    }

    /**
     * Get the featureSettings property: Feature Settings.
     * 
     * @return the featureSettings value.
     */
    public FeatureSettings featureSettings() {
        return this.featureSettings;
    }

    /**
     * Set the featureSettings property: Feature Settings.
     * 
     * @param featureSettings the featureSettings value to set.
     * @return the PatchBackupVaultInput object itself.
     */
    public PatchBackupVaultInput withFeatureSettings(FeatureSettings featureSettings) {
        this.featureSettings = featureSettings;
        return this;
    }

    /**
     * Get the resourceGuardOperationRequests property: ResourceGuardOperationRequests on which LAC check will be
     * performed.
     * 
     * @return the resourceGuardOperationRequests value.
     */
    public List<String> resourceGuardOperationRequests() {
        return this.resourceGuardOperationRequests;
    }

    /**
     * Set the resourceGuardOperationRequests property: ResourceGuardOperationRequests on which LAC check will be
     * performed.
     * 
     * @param resourceGuardOperationRequests the resourceGuardOperationRequests value to set.
     * @return the PatchBackupVaultInput object itself.
     */
    public PatchBackupVaultInput withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        this.resourceGuardOperationRequests = resourceGuardOperationRequests;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (monitoringSettings() != null) {
            monitoringSettings().validate();
        }
        if (securitySettings() != null) {
            securitySettings().validate();
        }
        if (featureSettings() != null) {
            featureSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("monitoringSettings", this.monitoringSettings);
        jsonWriter.writeJsonField("securitySettings", this.securitySettings);
        jsonWriter.writeJsonField("featureSettings", this.featureSettings);
        jsonWriter.writeArrayField("resourceGuardOperationRequests", this.resourceGuardOperationRequests,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PatchBackupVaultInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PatchBackupVaultInput if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PatchBackupVaultInput.
     */
    public static PatchBackupVaultInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PatchBackupVaultInput deserializedPatchBackupVaultInput = new PatchBackupVaultInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("monitoringSettings".equals(fieldName)) {
                    deserializedPatchBackupVaultInput.monitoringSettings = MonitoringSettings.fromJson(reader);
                } else if ("securitySettings".equals(fieldName)) {
                    deserializedPatchBackupVaultInput.securitySettings = SecuritySettings.fromJson(reader);
                } else if ("featureSettings".equals(fieldName)) {
                    deserializedPatchBackupVaultInput.featureSettings = FeatureSettings.fromJson(reader);
                } else if ("resourceGuardOperationRequests".equals(fieldName)) {
                    List<String> resourceGuardOperationRequests = reader.readArray(reader1 -> reader1.getString());
                    deserializedPatchBackupVaultInput.resourceGuardOperationRequests = resourceGuardOperationRequests;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPatchBackupVaultInput;
        });
    }
}
