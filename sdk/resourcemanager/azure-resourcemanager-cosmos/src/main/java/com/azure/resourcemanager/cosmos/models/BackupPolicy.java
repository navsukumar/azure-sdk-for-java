// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The object representing the policy for taking backups on an account.
 */
@Fluent
public class BackupPolicy implements JsonSerializable<BackupPolicy> {
    /*
     * Describes the mode of backups.
     */
    private BackupPolicyType type = BackupPolicyType.fromString("BackupPolicy");

    /*
     * The object representing the state of the migration between the backup policies.
     */
    private BackupPolicyMigrationState migrationState;

    /**
     * Creates an instance of BackupPolicy class.
     */
    public BackupPolicy() {
    }

    /**
     * Get the type property: Describes the mode of backups.
     * 
     * @return the type value.
     */
    public BackupPolicyType type() {
        return this.type;
    }

    /**
     * Get the migrationState property: The object representing the state of the migration between the backup policies.
     * 
     * @return the migrationState value.
     */
    public BackupPolicyMigrationState migrationState() {
        return this.migrationState;
    }

    /**
     * Set the migrationState property: The object representing the state of the migration between the backup policies.
     * 
     * @param migrationState the migrationState value to set.
     * @return the BackupPolicy object itself.
     */
    public BackupPolicy withMigrationState(BackupPolicyMigrationState migrationState) {
        this.migrationState = migrationState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (migrationState() != null) {
            migrationState().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeJsonField("migrationState", this.migrationState);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupPolicy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BackupPolicy.
     */
    public static BackupPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Periodic".equals(discriminatorValue)) {
                    return PeriodicModeBackupPolicy.fromJson(readerToUse.reset());
                } else if ("Continuous".equals(discriminatorValue)) {
                    return ContinuousModeBackupPolicy.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static BackupPolicy fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupPolicy deserializedBackupPolicy = new BackupPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedBackupPolicy.type = BackupPolicyType.fromString(reader.getString());
                } else if ("migrationState".equals(fieldName)) {
                    deserializedBackupPolicy.migrationState = BackupPolicyMigrationState.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupPolicy;
        });
    }
}
