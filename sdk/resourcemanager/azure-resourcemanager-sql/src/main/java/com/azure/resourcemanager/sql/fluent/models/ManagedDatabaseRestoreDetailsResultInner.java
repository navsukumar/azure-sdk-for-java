// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * A managed database restore details.
 */
@Immutable
public final class ManagedDatabaseRestoreDetailsResultInner extends ProxyResource {
    /*
     * Resource properties.
     */
    private ManagedDatabaseRestoreDetailsProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ManagedDatabaseRestoreDetailsResultInner class.
     */
    public ManagedDatabaseRestoreDetailsResultInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private ManagedDatabaseRestoreDetailsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the status property: Restore status.
     * 
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the currentRestoringFileName property: Current restoring file name.
     * 
     * @return the currentRestoringFileName value.
     */
    public String currentRestoringFileName() {
        return this.innerProperties() == null ? null : this.innerProperties().currentRestoringFileName();
    }

    /**
     * Get the lastRestoredFileName property: Last restored file name.
     * 
     * @return the lastRestoredFileName value.
     */
    public String lastRestoredFileName() {
        return this.innerProperties() == null ? null : this.innerProperties().lastRestoredFileName();
    }

    /**
     * Get the lastRestoredFileTime property: Last restored file time.
     * 
     * @return the lastRestoredFileTime value.
     */
    public OffsetDateTime lastRestoredFileTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastRestoredFileTime();
    }

    /**
     * Get the percentCompleted property: Percent completed.
     * 
     * @return the percentCompleted value.
     */
    public Double percentCompleted() {
        return this.innerProperties() == null ? null : this.innerProperties().percentCompleted();
    }

    /**
     * Get the unrestorableFiles property: List of unrestorable files.
     * 
     * @return the unrestorableFiles value.
     */
    public List<String> unrestorableFiles() {
        return this.innerProperties() == null ? null : this.innerProperties().unrestorableFiles();
    }

    /**
     * Get the numberOfFilesDetected property: Number of files detected.
     * 
     * @return the numberOfFilesDetected value.
     */
    public Long numberOfFilesDetected() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfFilesDetected();
    }

    /**
     * Get the lastUploadedFileName property: Last uploaded file name.
     * 
     * @return the lastUploadedFileName value.
     */
    public String lastUploadedFileName() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUploadedFileName();
    }

    /**
     * Get the lastUploadedFileTime property: Last uploaded file time.
     * 
     * @return the lastUploadedFileTime value.
     */
    public OffsetDateTime lastUploadedFileTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUploadedFileTime();
    }

    /**
     * Get the blockReason property: The reason why restore is in Blocked state.
     * 
     * @return the blockReason value.
     */
    public String blockReason() {
        return this.innerProperties() == null ? null : this.innerProperties().blockReason();
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
     * Reads an instance of ManagedDatabaseRestoreDetailsResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedDatabaseRestoreDetailsResultInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedDatabaseRestoreDetailsResultInner.
     */
    public static ManagedDatabaseRestoreDetailsResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedDatabaseRestoreDetailsResultInner deserializedManagedDatabaseRestoreDetailsResultInner
                = new ManagedDatabaseRestoreDetailsResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedManagedDatabaseRestoreDetailsResultInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagedDatabaseRestoreDetailsResultInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedManagedDatabaseRestoreDetailsResultInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedManagedDatabaseRestoreDetailsResultInner.innerProperties
                        = ManagedDatabaseRestoreDetailsProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedDatabaseRestoreDetailsResultInner;
        });
    }
}
