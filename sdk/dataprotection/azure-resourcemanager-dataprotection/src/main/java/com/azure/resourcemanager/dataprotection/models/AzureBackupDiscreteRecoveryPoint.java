// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * AzureBackupDiscreteRecoveryPoint
 * 
 * Azure backup discrete RecoveryPoint.
 */
@Fluent
public final class AzureBackupDiscreteRecoveryPoint extends AzureBackupRecoveryPoint {
    /*
     * The objectType property.
     */
    private String objectType = "AzureBackupDiscreteRecoveryPoint";

    /*
     * The friendlyName property.
     */
    private String friendlyName;

    /*
     * The recoveryPointDataStoresDetails property.
     */
    private List<RecoveryPointDataStoreDetails> recoveryPointDataStoresDetails;

    /*
     * The recoveryPointTime property.
     */
    private OffsetDateTime recoveryPointTime;

    /*
     * The policyName property.
     */
    private String policyName;

    /*
     * The policyVersion property.
     */
    private String policyVersion;

    /*
     * The recoveryPointId property.
     */
    private String recoveryPointId;

    /*
     * The recoveryPointType property.
     */
    private String recoveryPointType;

    /*
     * The retentionTagName property.
     */
    private String retentionTagName;

    /*
     * The retentionTagVersion property.
     */
    private String retentionTagVersion;

    /*
     * The expiryTime property.
     */
    private OffsetDateTime expiryTime;

    /*
     * Specifies recovery point completeness. Partial (i.e., only some of the intended items were backed up), or
     * Completed (i.e., ALL intended items were backed up).
     */
    private RecoveryPointCompletionState recoveryPointState;

    /**
     * Creates an instance of AzureBackupDiscreteRecoveryPoint class.
     */
    public AzureBackupDiscreteRecoveryPoint() {
    }

    /**
     * Get the objectType property: The objectType property.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the friendlyName property: The friendlyName property.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The friendlyName property.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the recoveryPointDataStoresDetails property: The recoveryPointDataStoresDetails property.
     * 
     * @return the recoveryPointDataStoresDetails value.
     */
    public List<RecoveryPointDataStoreDetails> recoveryPointDataStoresDetails() {
        return this.recoveryPointDataStoresDetails;
    }

    /**
     * Set the recoveryPointDataStoresDetails property: The recoveryPointDataStoresDetails property.
     * 
     * @param recoveryPointDataStoresDetails the recoveryPointDataStoresDetails value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint
        withRecoveryPointDataStoresDetails(List<RecoveryPointDataStoreDetails> recoveryPointDataStoresDetails) {
        this.recoveryPointDataStoresDetails = recoveryPointDataStoresDetails;
        return this;
    }

    /**
     * Get the recoveryPointTime property: The recoveryPointTime property.
     * 
     * @return the recoveryPointTime value.
     */
    public OffsetDateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Set the recoveryPointTime property: The recoveryPointTime property.
     * 
     * @param recoveryPointTime the recoveryPointTime value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint withRecoveryPointTime(OffsetDateTime recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }

    /**
     * Get the policyName property: The policyName property.
     * 
     * @return the policyName value.
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Set the policyName property: The policyName property.
     * 
     * @param policyName the policyName value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get the policyVersion property: The policyVersion property.
     * 
     * @return the policyVersion value.
     */
    public String policyVersion() {
        return this.policyVersion;
    }

    /**
     * Set the policyVersion property: The policyVersion property.
     * 
     * @param policyVersion the policyVersion value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint withPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }

    /**
     * Get the recoveryPointId property: The recoveryPointId property.
     * 
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: The recoveryPointId property.
     * 
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Get the recoveryPointType property: The recoveryPointType property.
     * 
     * @return the recoveryPointType value.
     */
    public String recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: The recoveryPointType property.
     * 
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint withRecoveryPointType(String recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the retentionTagName property: The retentionTagName property.
     * 
     * @return the retentionTagName value.
     */
    public String retentionTagName() {
        return this.retentionTagName;
    }

    /**
     * Set the retentionTagName property: The retentionTagName property.
     * 
     * @param retentionTagName the retentionTagName value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint withRetentionTagName(String retentionTagName) {
        this.retentionTagName = retentionTagName;
        return this;
    }

    /**
     * Get the retentionTagVersion property: The retentionTagVersion property.
     * 
     * @return the retentionTagVersion value.
     */
    public String retentionTagVersion() {
        return this.retentionTagVersion;
    }

    /**
     * Set the retentionTagVersion property: The retentionTagVersion property.
     * 
     * @param retentionTagVersion the retentionTagVersion value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint withRetentionTagVersion(String retentionTagVersion) {
        this.retentionTagVersion = retentionTagVersion;
        return this;
    }

    /**
     * Get the expiryTime property: The expiryTime property.
     * 
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Get the recoveryPointState property: Specifies recovery point completeness. Partial (i.e., only some of the
     * intended items were backed up), or Completed (i.e., ALL intended items were backed up).
     * 
     * @return the recoveryPointState value.
     */
    public RecoveryPointCompletionState recoveryPointState() {
        return this.recoveryPointState;
    }

    /**
     * Set the recoveryPointState property: Specifies recovery point completeness. Partial (i.e., only some of the
     * intended items were backed up), or Completed (i.e., ALL intended items were backed up).
     * 
     * @param recoveryPointState the recoveryPointState value to set.
     * @return the AzureBackupDiscreteRecoveryPoint object itself.
     */
    public AzureBackupDiscreteRecoveryPoint withRecoveryPointState(RecoveryPointCompletionState recoveryPointState) {
        this.recoveryPointState = recoveryPointState;
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
        if (recoveryPointDataStoresDetails() != null) {
            recoveryPointDataStoresDetails().forEach(e -> e.validate());
        }
        if (recoveryPointTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property recoveryPointTime in model AzureBackupDiscreteRecoveryPoint"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureBackupDiscreteRecoveryPoint.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("recoveryPointTime",
            this.recoveryPointTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.recoveryPointTime));
        jsonWriter.writeStringField("objectType", this.objectType);
        jsonWriter.writeStringField("friendlyName", this.friendlyName);
        jsonWriter.writeArrayField("recoveryPointDataStoresDetails", this.recoveryPointDataStoresDetails,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("policyName", this.policyName);
        jsonWriter.writeStringField("policyVersion", this.policyVersion);
        jsonWriter.writeStringField("recoveryPointId", this.recoveryPointId);
        jsonWriter.writeStringField("recoveryPointType", this.recoveryPointType);
        jsonWriter.writeStringField("retentionTagName", this.retentionTagName);
        jsonWriter.writeStringField("retentionTagVersion", this.retentionTagVersion);
        jsonWriter.writeStringField("recoveryPointState",
            this.recoveryPointState == null ? null : this.recoveryPointState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureBackupDiscreteRecoveryPoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureBackupDiscreteRecoveryPoint if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureBackupDiscreteRecoveryPoint.
     */
    public static AzureBackupDiscreteRecoveryPoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureBackupDiscreteRecoveryPoint deserializedAzureBackupDiscreteRecoveryPoint
                = new AzureBackupDiscreteRecoveryPoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recoveryPointTime".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.recoveryPointTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("objectType".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.objectType = reader.getString();
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.friendlyName = reader.getString();
                } else if ("recoveryPointDataStoresDetails".equals(fieldName)) {
                    List<RecoveryPointDataStoreDetails> recoveryPointDataStoresDetails
                        = reader.readArray(reader1 -> RecoveryPointDataStoreDetails.fromJson(reader1));
                    deserializedAzureBackupDiscreteRecoveryPoint.recoveryPointDataStoresDetails
                        = recoveryPointDataStoresDetails;
                } else if ("policyName".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.policyName = reader.getString();
                } else if ("policyVersion".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.policyVersion = reader.getString();
                } else if ("recoveryPointId".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.recoveryPointId = reader.getString();
                } else if ("recoveryPointType".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.recoveryPointType = reader.getString();
                } else if ("retentionTagName".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.retentionTagName = reader.getString();
                } else if ("retentionTagVersion".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.retentionTagVersion = reader.getString();
                } else if ("expiryTime".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.expiryTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("recoveryPointState".equals(fieldName)) {
                    deserializedAzureBackupDiscreteRecoveryPoint.recoveryPointState
                        = RecoveryPointCompletionState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureBackupDiscreteRecoveryPoint;
        });
    }
}
