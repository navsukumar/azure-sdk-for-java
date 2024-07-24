// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Snapshot of a Volume.
 */
@Fluent
public final class SnapshotInner extends ProxyResource {
    /*
     * Resource location
     */
    private String location;

    /*
     * Snapshot Properties
     */
    private SnapshotProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of SnapshotInner class.
     */
    public SnapshotInner() {
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     * 
     * @param location the location value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the innerProperties property: Snapshot Properties.
     * 
     * @return the innerProperties value.
     */
    private SnapshotProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * Get the snapshotId property: UUID v4 used to identify the Snapshot.
     * 
     * @return the snapshotId value.
     */
    public String snapshotId() {
        return this.innerProperties() == null ? null : this.innerProperties().snapshotId();
    }

    /**
     * Get the created property: The creation date of the snapshot.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property location in model SnapshotInner"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnapshotInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SnapshotInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SnapshotInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SnapshotInner.
     */
    public static SnapshotInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SnapshotInner deserializedSnapshotInner = new SnapshotInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSnapshotInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSnapshotInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSnapshotInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedSnapshotInner.location = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSnapshotInner.innerProperties = SnapshotProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSnapshotInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSnapshotInner;
        });
    }
}
