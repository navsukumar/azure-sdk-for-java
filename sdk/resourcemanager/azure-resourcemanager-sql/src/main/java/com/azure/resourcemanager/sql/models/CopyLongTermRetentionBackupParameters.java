// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.fluent.models.CopyLongTermRetentionBackupParametersProperties;
import java.io.IOException;

/**
 * Contains the information necessary to perform long term retention backup copy operation.
 */
@Fluent
public final class CopyLongTermRetentionBackupParameters
    implements JsonSerializable<CopyLongTermRetentionBackupParameters> {
    /*
     * Resource properties.
     */
    private CopyLongTermRetentionBackupParametersProperties innerProperties;

    /**
     * Creates an instance of CopyLongTermRetentionBackupParameters class.
     */
    public CopyLongTermRetentionBackupParameters() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private CopyLongTermRetentionBackupParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the targetSubscriptionId property: The subscription that owns the target server.
     * 
     * @return the targetSubscriptionId value.
     */
    public String targetSubscriptionId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetSubscriptionId();
    }

    /**
     * Set the targetSubscriptionId property: The subscription that owns the target server.
     * 
     * @param targetSubscriptionId the targetSubscriptionId value to set.
     * @return the CopyLongTermRetentionBackupParameters object itself.
     */
    public CopyLongTermRetentionBackupParameters withTargetSubscriptionId(String targetSubscriptionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CopyLongTermRetentionBackupParametersProperties();
        }
        this.innerProperties().withTargetSubscriptionId(targetSubscriptionId);
        return this;
    }

    /**
     * Get the targetResourceGroup property: The resource group that owns the target server.
     * 
     * @return the targetResourceGroup value.
     */
    public String targetResourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResourceGroup();
    }

    /**
     * Set the targetResourceGroup property: The resource group that owns the target server.
     * 
     * @param targetResourceGroup the targetResourceGroup value to set.
     * @return the CopyLongTermRetentionBackupParameters object itself.
     */
    public CopyLongTermRetentionBackupParameters withTargetResourceGroup(String targetResourceGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CopyLongTermRetentionBackupParametersProperties();
        }
        this.innerProperties().withTargetResourceGroup(targetResourceGroup);
        return this;
    }

    /**
     * Get the targetServerResourceId property: The resource Id of the target server that owns the database.
     * 
     * @return the targetServerResourceId value.
     */
    public String targetServerResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetServerResourceId();
    }

    /**
     * Set the targetServerResourceId property: The resource Id of the target server that owns the database.
     * 
     * @param targetServerResourceId the targetServerResourceId value to set.
     * @return the CopyLongTermRetentionBackupParameters object itself.
     */
    public CopyLongTermRetentionBackupParameters withTargetServerResourceId(String targetServerResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CopyLongTermRetentionBackupParametersProperties();
        }
        this.innerProperties().withTargetServerResourceId(targetServerResourceId);
        return this;
    }

    /**
     * Get the targetServerFullyQualifiedDomainName property: The fully qualified domain name of the target server.
     * 
     * @return the targetServerFullyQualifiedDomainName value.
     */
    public String targetServerFullyQualifiedDomainName() {
        return this.innerProperties() == null ? null : this.innerProperties().targetServerFullyQualifiedDomainName();
    }

    /**
     * Set the targetServerFullyQualifiedDomainName property: The fully qualified domain name of the target server.
     * 
     * @param targetServerFullyQualifiedDomainName the targetServerFullyQualifiedDomainName value to set.
     * @return the CopyLongTermRetentionBackupParameters object itself.
     */
    public CopyLongTermRetentionBackupParameters
        withTargetServerFullyQualifiedDomainName(String targetServerFullyQualifiedDomainName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CopyLongTermRetentionBackupParametersProperties();
        }
        this.innerProperties().withTargetServerFullyQualifiedDomainName(targetServerFullyQualifiedDomainName);
        return this;
    }

    /**
     * Get the targetDatabaseName property: The name of the database owns the copied backup.
     * 
     * @return the targetDatabaseName value.
     */
    public String targetDatabaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().targetDatabaseName();
    }

    /**
     * Set the targetDatabaseName property: The name of the database owns the copied backup.
     * 
     * @param targetDatabaseName the targetDatabaseName value to set.
     * @return the CopyLongTermRetentionBackupParameters object itself.
     */
    public CopyLongTermRetentionBackupParameters withTargetDatabaseName(String targetDatabaseName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CopyLongTermRetentionBackupParametersProperties();
        }
        this.innerProperties().withTargetDatabaseName(targetDatabaseName);
        return this;
    }

    /**
     * Get the targetBackupStorageRedundancy property: The storage redundancy type of the copied backup.
     * 
     * @return the targetBackupStorageRedundancy value.
     */
    public BackupStorageRedundancy targetBackupStorageRedundancy() {
        return this.innerProperties() == null ? null : this.innerProperties().targetBackupStorageRedundancy();
    }

    /**
     * Set the targetBackupStorageRedundancy property: The storage redundancy type of the copied backup.
     * 
     * @param targetBackupStorageRedundancy the targetBackupStorageRedundancy value to set.
     * @return the CopyLongTermRetentionBackupParameters object itself.
     */
    public CopyLongTermRetentionBackupParameters
        withTargetBackupStorageRedundancy(BackupStorageRedundancy targetBackupStorageRedundancy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CopyLongTermRetentionBackupParametersProperties();
        }
        this.innerProperties().withTargetBackupStorageRedundancy(targetBackupStorageRedundancy);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CopyLongTermRetentionBackupParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CopyLongTermRetentionBackupParameters if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CopyLongTermRetentionBackupParameters.
     */
    public static CopyLongTermRetentionBackupParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CopyLongTermRetentionBackupParameters deserializedCopyLongTermRetentionBackupParameters
                = new CopyLongTermRetentionBackupParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedCopyLongTermRetentionBackupParameters.innerProperties
                        = CopyLongTermRetentionBackupParametersProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCopyLongTermRetentionBackupParameters;
        });
    }
}
