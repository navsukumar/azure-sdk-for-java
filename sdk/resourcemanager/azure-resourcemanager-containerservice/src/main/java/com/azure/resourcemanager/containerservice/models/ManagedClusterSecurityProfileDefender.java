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
 * Microsoft Defender settings for the security profile.
 */
@Fluent
public final class ManagedClusterSecurityProfileDefender
    implements JsonSerializable<ManagedClusterSecurityProfileDefender> {
    /*
     * Resource ID of the Log Analytics workspace to be associated with Microsoft Defender. When Microsoft Defender is
     * enabled, this field is required and must be a valid workspace resource ID. When Microsoft Defender is disabled,
     * leave the field empty.
     */
    private String logAnalyticsWorkspaceResourceId;

    /*
     * Microsoft Defender threat detection for Cloud settings for the security profile.
     */
    private ManagedClusterSecurityProfileDefenderSecurityMonitoring securityMonitoring;

    /**
     * Creates an instance of ManagedClusterSecurityProfileDefender class.
     */
    public ManagedClusterSecurityProfileDefender() {
    }

    /**
     * Get the logAnalyticsWorkspaceResourceId property: Resource ID of the Log Analytics workspace to be associated
     * with Microsoft Defender. When Microsoft Defender is enabled, this field is required and must be a valid workspace
     * resource ID. When Microsoft Defender is disabled, leave the field empty.
     * 
     * @return the logAnalyticsWorkspaceResourceId value.
     */
    public String logAnalyticsWorkspaceResourceId() {
        return this.logAnalyticsWorkspaceResourceId;
    }

    /**
     * Set the logAnalyticsWorkspaceResourceId property: Resource ID of the Log Analytics workspace to be associated
     * with Microsoft Defender. When Microsoft Defender is enabled, this field is required and must be a valid workspace
     * resource ID. When Microsoft Defender is disabled, leave the field empty.
     * 
     * @param logAnalyticsWorkspaceResourceId the logAnalyticsWorkspaceResourceId value to set.
     * @return the ManagedClusterSecurityProfileDefender object itself.
     */
    public ManagedClusterSecurityProfileDefender
        withLogAnalyticsWorkspaceResourceId(String logAnalyticsWorkspaceResourceId) {
        this.logAnalyticsWorkspaceResourceId = logAnalyticsWorkspaceResourceId;
        return this;
    }

    /**
     * Get the securityMonitoring property: Microsoft Defender threat detection for Cloud settings for the security
     * profile.
     * 
     * @return the securityMonitoring value.
     */
    public ManagedClusterSecurityProfileDefenderSecurityMonitoring securityMonitoring() {
        return this.securityMonitoring;
    }

    /**
     * Set the securityMonitoring property: Microsoft Defender threat detection for Cloud settings for the security
     * profile.
     * 
     * @param securityMonitoring the securityMonitoring value to set.
     * @return the ManagedClusterSecurityProfileDefender object itself.
     */
    public ManagedClusterSecurityProfileDefender
        withSecurityMonitoring(ManagedClusterSecurityProfileDefenderSecurityMonitoring securityMonitoring) {
        this.securityMonitoring = securityMonitoring;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityMonitoring() != null) {
            securityMonitoring().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("logAnalyticsWorkspaceResourceId", this.logAnalyticsWorkspaceResourceId);
        jsonWriter.writeJsonField("securityMonitoring", this.securityMonitoring);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterSecurityProfileDefender from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterSecurityProfileDefender if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterSecurityProfileDefender.
     */
    public static ManagedClusterSecurityProfileDefender fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterSecurityProfileDefender deserializedManagedClusterSecurityProfileDefender
                = new ManagedClusterSecurityProfileDefender();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("logAnalyticsWorkspaceResourceId".equals(fieldName)) {
                    deserializedManagedClusterSecurityProfileDefender.logAnalyticsWorkspaceResourceId
                        = reader.getString();
                } else if ("securityMonitoring".equals(fieldName)) {
                    deserializedManagedClusterSecurityProfileDefender.securityMonitoring
                        = ManagedClusterSecurityProfileDefenderSecurityMonitoring.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterSecurityProfileDefender;
        });
    }
}
